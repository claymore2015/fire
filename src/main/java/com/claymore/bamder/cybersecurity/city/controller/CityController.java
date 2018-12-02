package com.claymore.bamder.cybersecurity.city.controller;

import com.claymore.bamder.common.domain.BaseResponse;
import com.claymore.bamder.common.domain.PageResult;
import com.claymore.bamder.cybersecurity.city.entity.MCityEntity;
import com.claymore.bamder.cybersecurity.city.repository.CityRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author li.zhuo
 * @create 2018/11/19 9:38 PM
 * @since 1.0.0
 */
@RestController
@RequestMapping("/city")
public class CityController {
    @Autowired
    private CityRepository cityRepository;

    @GetMapping("/{id}")
    @ApiOperation(value = "query city type with id", consumes = "GET", response = MCityEntity.class)
    public BaseResponse<MCityEntity> findById(@PathVariable("id") Integer id) {
        return new BaseResponse<>(cityRepository.findById(id).get());
    }

    @GetMapping
    @ApiOperation(value = "query all city ", consumes = "GET", response = MCityEntity.class)
    public BaseResponse<PageResult<MCityEntity>> findAll() {
        List<MCityEntity> all = cityRepository.findAll();
        PageResult<MCityEntity> pageResult = new PageResult<MCityEntity>();
        pageResult.setContent(all);
        return new BaseResponse<>(pageResult);
    }

    @GetMapping("/findByProvince/{provinceId}")
    @ApiOperation(value = "query city under province", consumes = "GET", response = MCityEntity.class)
    public BaseResponse<PageResult<MCityEntity>> findByProvince(@PathVariable("provinceId") Long provinceId) {
        List<MCityEntity> all = cityRepository.findByProvinceId(provinceId);
        PageResult<MCityEntity> pageResult = new PageResult<MCityEntity>();
        pageResult.setContent(all);
        return new BaseResponse<>(pageResult);
    }
}
