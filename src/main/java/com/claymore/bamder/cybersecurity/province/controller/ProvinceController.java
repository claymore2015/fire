package com.claymore.bamder.cybersecurity.province.controller;

import com.claymore.bamder.common.domain.BaseResponse;
import com.claymore.bamder.common.domain.PageResult;
import com.claymore.bamder.cybersecurity.city.entity.MCityEntity;
import com.claymore.bamder.cybersecurity.province.entity.MProvinceEntity;
import com.claymore.bamder.cybersecurity.province.repository.ProvinceRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author li.zhuo
 * @create 2018/11/19 10:26 PM
 * @since 1.0.0
 */
@RestController
@RequestMapping("/province")
public class ProvinceController {

    @Autowired
    private ProvinceRepository provinceRepository;

    @GetMapping("/{id}")
    @ApiOperation(value = "query province type with id", consumes = "GET", response = MProvinceEntity.class)
    public BaseResponse<MProvinceEntity> findById(@PathVariable("id") Integer id) {
        return new BaseResponse<>(provinceRepository.findById(id).get());
    }

    @GetMapping
    @ApiOperation(value = "query all province ", consumes = "GET", response = MCityEntity.class)
    public BaseResponse<PageResult<MProvinceEntity>> findAll() {
        List<MProvinceEntity> all = provinceRepository.findAll();
        PageResult<MProvinceEntity> pageResult = new PageResult<MProvinceEntity>();
        pageResult.setContent(all);
        return new BaseResponse<>(pageResult);
    }
}
