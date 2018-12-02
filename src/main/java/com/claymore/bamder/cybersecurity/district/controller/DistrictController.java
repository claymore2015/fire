package com.claymore.bamder.cybersecurity.district.controller;

import com.claymore.bamder.common.domain.BaseResponse;
import com.claymore.bamder.common.domain.PageResult;
import com.claymore.bamder.cybersecurity.district.entity.MDistrictEntity;
import com.claymore.bamder.cybersecurity.district.repository.DistrictRepository;
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
@RequestMapping("/district")
public class DistrictController {
    @Autowired
    private DistrictRepository districtRepository;

    @GetMapping("/{id}")
    @ApiOperation(value = "query district type with id", consumes = "GET", response = MDistrictEntity.class)
    public BaseResponse<MDistrictEntity> findById(@PathVariable("id") Integer id) {
        return new BaseResponse<>(districtRepository.findById(id).get());
    }

    @GetMapping
    @ApiOperation(value = "query all district ", consumes = "GET", response = MDistrictEntity.class)
    public BaseResponse<PageResult<MDistrictEntity>> findAll() {
        List<MDistrictEntity> all = districtRepository.findAll();
        PageResult<MDistrictEntity> pageResult = new PageResult<MDistrictEntity>();
        pageResult.setContent(all);
        return new BaseResponse<>(pageResult);
    }

    @GetMapping("findByCity/{cityId}")
    @ApiOperation(value = "query all district under city", consumes = "GET", response = MDistrictEntity.class)
    public BaseResponse<PageResult<MDistrictEntity>> findByCityId(@PathVariable("cityId") Long cityId) {
        List<MDistrictEntity> all = districtRepository.findByCityId(cityId);
        PageResult<MDistrictEntity> pageResult = new PageResult<MDistrictEntity>();
        pageResult.setContent(all);
        return new BaseResponse<>(pageResult);
    }
}
