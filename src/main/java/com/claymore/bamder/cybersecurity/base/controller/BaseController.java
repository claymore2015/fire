package com.claymore.bamder.cybersecurity.base.controller;

import com.claymore.bamder.common.domain.BaseResponse;
import com.claymore.bamder.cybersecurity.base.domain.CityResponse;
import com.claymore.bamder.cybersecurity.base.domain.DistrictResponse;
import com.claymore.bamder.cybersecurity.base.domain.MapResponse;
import com.claymore.bamder.cybersecurity.base.domain.ProvinceResponse;
import com.claymore.bamder.cybersecurity.city.entity.MCityEntity;
import com.claymore.bamder.cybersecurity.city.repository.CityRepository;
import com.claymore.bamder.cybersecurity.district.entity.MDistrictEntity;
import com.claymore.bamder.cybersecurity.district.repository.DistrictRepository;
import com.claymore.bamder.cybersecurity.province.entity.MProvinceEntity;
import com.claymore.bamder.cybersecurity.province.repository.ProvinceRepository;
import io.swagger.annotations.ApiOperation;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author li.zhuo
 * @create 2018/12/1 2:07 PM
 * @since 1.0.0
 */
@RestController
@RequestMapping("/base")
public class BaseController {

    @Autowired
    private ProvinceRepository provinceRepository;

    @Autowired
    private CityRepository cityRepository;

    @Autowired
    private DistrictRepository districtRepository;

    @Autowired
    private ModelMapper modelMapper;

    @ApiOperation("基础地址数据")
    @GetMapping("/map")
    public BaseResponse<MapResponse> baseData() {
        MapResponse response = new MapResponse();
        List<MProvinceEntity> allProvinces = provinceRepository.findAll();
        List<MCityEntity> allCities = cityRepository.findAll();
        List<MDistrictEntity> allDistricts = districtRepository.findAll();


        List<DistrictResponse> districtResponses = modelMapper.map(allDistricts, new TypeToken<List<DistrictResponse>>() {}.getType());
        Map<Long, List<DistrictResponse>> collectDistricts = districtResponses.stream().collect(Collectors.groupingBy(DistrictResponse::getCityId));

        List<CityResponse> cityResponses = modelMapper.map(allCities, new TypeToken<List<CityResponse>>() {}.getType());
        cityResponses.stream().forEach(cityResponse -> cityResponse.setDistricts(collectDistricts.get(cityResponse.getCityId())));
        Map<Long, List<CityResponse>> collectCites = cityResponses.stream().collect(Collectors.groupingBy(CityResponse::getProvinceId));


        List<ProvinceResponse> provinceResponses = modelMapper.map(allProvinces, new TypeToken<List<ProvinceResponse>>() {}.getType());
        provinceResponses.stream().forEach(provinceResponse -> provinceResponse.setCities(collectCites.get(provinceResponse.getProvinceId())));

        response.setProvinceResponses(provinceResponses);
        return new BaseResponse<>(response);
    }
}
