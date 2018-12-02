package com.claymore.bamder.cybersecurity.unit.controller;

import com.claymore.bamder.common.domain.BaseResponse;
import com.claymore.bamder.common.domain.PageResult;
import com.claymore.bamder.cybersecurity.unit.entity.UnitsEntity;
import com.claymore.bamder.cybersecurity.unit.service.UnitsService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.web.bind.annotation.*;

/**
 * @author li.zhuo
 * @create 2018/11/13 10:08 PM
 * @since 1.0.0
 */
@RestController
@RequestMapping("/units")
public class UnitsController {

    @Autowired
    private UnitsService unitsService;

    @GetMapping("/{id}")
    @ApiOperation(value = "query units with id", consumes = "GET", response = UnitsEntity.class)
    public BaseResponse<UnitsEntity> findById(@PathVariable("id") Long id) {
        return new BaseResponse<>(unitsService.findById(id));
    }

    @PostMapping
    public BaseResponse create(@RequestBody UnitsEntity unitsEntity) {
        unitsService.save(unitsEntity);
        return BaseResponse.instance();
    }

    @PutMapping
    public BaseResponse update(@RequestBody UnitsEntity updateUnitEntity) {
        unitsService.save(updateUnitEntity);
        return BaseResponse.instance();
    }

    @GetMapping("/{pageSize}/{pageNo}")
    public BaseResponse<PageResult<UnitsEntity>> page(@PathVariable("pageSize") int pageSize, @PathVariable("pageNo") int pageNo) {
        Page<UnitsEntity> page = unitsService.findPage(pageSize, pageNo);
        PageResult<UnitsEntity> result = new PageResult<UnitsEntity>();
        result.setContent(page.getContent());
        result.setPageNo(pageNo);
        result.setPageSize(pageSize);
        result.setTotalRecords(page.getTotalElements());
        return new BaseResponse(result);
    }

}
