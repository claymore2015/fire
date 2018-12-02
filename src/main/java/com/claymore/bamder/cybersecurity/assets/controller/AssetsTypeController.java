package com.claymore.bamder.cybersecurity.assets.controller;

import com.claymore.bamder.common.domain.BaseResponse;
import com.claymore.bamder.common.domain.PageResult;
import com.claymore.bamder.cybersecurity.assets.entity.AssetsTypeEntity;
import com.claymore.bamder.cybersecurity.assets.repository.AssetsTypeRepository;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

/**
 * @author li.zhuo
 * @create 2018/11/18 11:24 PM
 * @since 1.0.0
 */
@RestController
@RequestMapping("/assets_type")
public class AssetsTypeController {

    @Autowired
    private AssetsTypeRepository assetsTypeRepository;

    @GetMapping("/{id}")
    @ApiOperation(value = "query assets type with id", consumes = "GET", response = AssetsTypeEntity.class)
    public BaseResponse<AssetsTypeEntity> findById(@PathVariable("id") Long id) {
        return new BaseResponse<>(assetsTypeRepository.findById(id).get());
    }

    @PostMapping
    public BaseResponse create(@RequestBody AssetsTypeEntity assetsTypeEntity) {
        assetsTypeRepository.save(assetsTypeEntity);
        return BaseResponse.instance();
    }

    @PutMapping
    public BaseResponse update(@RequestBody AssetsTypeEntity updatedAssetsType) {
        assetsTypeRepository.save(updatedAssetsType);
        return BaseResponse.instance();
    }

    @GetMapping("/{pageSize}/{pageNo}")
    public BaseResponse<PageResult<AssetsTypeEntity>> page(@PathVariable("pageSize") int pageSize, @PathVariable("pageNo") int pageNo) {
        Page<AssetsTypeEntity> page = assetsTypeRepository.findAll(PageRequest.of(pageNo - 1, pageSize));
        PageResult<AssetsTypeEntity> result = new PageResult<AssetsTypeEntity>();
        result.setContent(page.getContent());
        result.setPageNo(pageNo);
        result.setPageSize(pageSize);
        result.setTotalRecords(page.getTotalElements());
        return new BaseResponse(result);
    }
}
