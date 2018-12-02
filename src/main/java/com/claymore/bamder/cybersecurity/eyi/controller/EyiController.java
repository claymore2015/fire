package com.claymore.bamder.cybersecurity.eyi.controller;

import com.claymore.bamder.common.domain.BaseResponse;
import com.claymore.bamder.common.domain.PageResult;
import com.claymore.bamder.cybersecurity.eyi.entity.EyiProsEntity;
import com.claymore.bamder.cybersecurity.eyi.repository.EyiRepository;
import com.claymore.bamder.cybersecurity.unit.entity.UnitsEntity;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

/**
 * @author li.zhuo
 * @create 2018/11/15 9:11 PM
 * @since 1.0.0
 */
@RestController
@RequestMapping("/eyi")
public class EyiController {

    @Autowired
    private EyiRepository eyiRepository;

    @GetMapping("/{id}")
    @ApiOperation(value = "query eyi pro with id", consumes = "GET", response = UnitsEntity.class)
    public BaseResponse<EyiProsEntity> findById(@PathVariable("id") Long id) {
        return new BaseResponse<>(eyiRepository.findById(id).get());
    }

    @PostMapping
    public BaseResponse create(@RequestBody EyiProsEntity eyiProsEntity) {
        eyiRepository.save(eyiProsEntity);
        return BaseResponse.instance();
    }

    @PutMapping
    public BaseResponse update(@RequestBody EyiProsEntity updatedEyiProsEntity) {
        eyiRepository.save(updatedEyiProsEntity);
        return BaseResponse.instance();
    }

    @GetMapping("/{pageSize}/{pageNo}")
    public BaseResponse<PageResult<EyiProsEntity>> page(@PathVariable("pageSize") int pageSize, @PathVariable("pageNo") int pageNo) {
        Page<EyiProsEntity> page = eyiRepository.findAll(PageRequest.of(pageNo - 1, pageSize));
        PageResult<EyiProsEntity> result = new PageResult<EyiProsEntity>();
        result.setContent(page.getContent());
        result.setPageNo(pageNo);
        result.setPageSize(pageSize);
        result.setTotalRecords(page.getTotalElements());
        return new BaseResponse(result);
    }
}
