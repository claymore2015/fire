package com.claymore.bamder.cybersecurity.bug.controller;

import com.claymore.bamder.common.domain.BaseResponse;
import com.claymore.bamder.common.domain.PageResult;
import com.claymore.bamder.cybersecurity.bug.entity.BugProsEntity;
import com.claymore.bamder.cybersecurity.bug.repository.BugProRepository;
import com.claymore.bamder.cybersecurity.unit.entity.UnitsEntity;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

/**
 * @author li.zhuo
 * @create 2018/11/15 9:19 PM
 * @since 1.0.0
 */
@RestController
@RequestMapping("/bugpro")
public class BugProController {

    @Autowired
    private BugProRepository bugProRepository;

    @GetMapping("/{id}")
    @ApiOperation(value = "query TrojanPros with id", consumes = "GET", response = UnitsEntity.class)
    public BaseResponse<BugProsEntity> findById(@PathVariable("id") Long id) {
        return new BaseResponse<>(bugProRepository.findById(id).get());
    }

    @PostMapping
    public BaseResponse create(@RequestBody BugProsEntity bugProsEntity) {
        bugProRepository.save(bugProsEntity);
        return BaseResponse.instance();
    }

    @PutMapping
    public BaseResponse update(@RequestBody BugProsEntity updatedBugPros) {
        bugProRepository.save(updatedBugPros);
        return BaseResponse.instance();
    }

    @GetMapping("/{pageSize}/{pageNo}")
    public BaseResponse<PageResult<BugProsEntity>> page(@PathVariable("pageSize") int pageSize, @PathVariable("pageNo") int pageNo) {
        Page<BugProsEntity> page = bugProRepository.findAll(PageRequest.of(pageNo - 1, pageSize));
        PageResult<BugProsEntity> result = new PageResult<BugProsEntity>();
        result.setContent(page.getContent());
        result.setPageNo(pageNo);
        result.setPageSize(pageSize);
        result.setTotalRecords(page.getTotalElements());
        return new BaseResponse(result);
    }
}
