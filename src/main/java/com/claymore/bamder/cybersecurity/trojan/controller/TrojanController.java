package com.claymore.bamder.cybersecurity.trojan.controller;

import com.claymore.bamder.common.domain.BaseResponse;
import com.claymore.bamder.common.domain.PageResult;
import com.claymore.bamder.cybersecurity.trojan.entity.TrojanProsEntity;
import com.claymore.bamder.cybersecurity.trojan.repository.TrojanRepository;
import com.claymore.bamder.cybersecurity.unit.entity.UnitsEntity;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

/**
 * @author li.zhuo
 * @create 2018/11/15 8:51 PM
 * @since 1.0.0
 */
@RestController
@RequestMapping("/trojan")
public class TrojanController {

    @Autowired
    private TrojanRepository trojanRepository;

    @GetMapping("/{id}")
    @ApiOperation(value = "query TrojanPros with id", consumes = "GET", response = UnitsEntity.class)
    public BaseResponse<TrojanProsEntity> findById(@PathVariable("id") Long id) {
        return new BaseResponse<>(trojanRepository.findById(id).get());
    }

    @PostMapping
    public BaseResponse create(@RequestBody TrojanProsEntity trojanProsEntity) {
        trojanRepository.save(trojanProsEntity);
        return BaseResponse.instance();
    }

    @PutMapping
    public BaseResponse update(@RequestBody TrojanProsEntity updatedTrojanProsEntity) {
        trojanRepository.save(updatedTrojanProsEntity);
        return BaseResponse.instance();
    }

    @GetMapping("/{pageSize}/{pageNo}")
    public BaseResponse<PageResult<TrojanProsEntity>> page(@PathVariable("pageSize") int pageSize, @PathVariable("pageNo") int pageNo) {
        Page<TrojanProsEntity> page = trojanRepository.findAll(PageRequest.of(pageNo - 1, pageSize));
        PageResult<TrojanProsEntity> result = new PageResult<TrojanProsEntity>();
        result.setContent(page.getContent());
        result.setPageNo(pageNo);
        result.setPageSize(pageSize);
        result.setTotalRecords(page.getTotalElements());
        return new BaseResponse(result);
    }
}
