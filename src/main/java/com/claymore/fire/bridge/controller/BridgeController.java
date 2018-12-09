package com.claymore.fire.bridge.controller;

import com.claymore.fire.bridge.entity.BridgeEntity;
import com.claymore.fire.bridge.repository.BridgeRepository;
import com.claymore.fire.common.domain.BaseResponse;
import com.claymore.fire.common.domain.PageResult;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author li.zhuo
 * @create 2018/12/3 10:40 AM
 * @since 1.0.0
 */
@RestController
@RequestMapping("/bridge")
public class BridgeController {
    
    @Autowired
    private BridgeRepository bridgeRepository;

    @GetMapping("/{id}")
    @ApiOperation(value = "query roadline info with id", consumes = "GET", response = BridgeEntity.class)
    public BaseResponse<BridgeEntity> findById(@PathVariable("id") Integer id) {
        return new BaseResponse<>(bridgeRepository.findById(id).get());
    }

    @PostMapping
    public BaseResponse create(@RequestBody BridgeEntity roadLineInfoEntity) {
        bridgeRepository.save(roadLineInfoEntity);
        return BaseResponse.instance();
    }

    @PutMapping
    public BaseResponse update(@RequestBody BridgeEntity updatedBridgeEntity) {
        bridgeRepository.save(updatedBridgeEntity);
        return BaseResponse.instance();
    }

    @GetMapping("/{pageSize}/{pageNo}")
    public BaseResponse<PageResult<BridgeEntity>> page(@PathVariable("pageSize") int pageSize, @PathVariable("pageNo") int pageNo) {
        Page<BridgeEntity> page = bridgeRepository.findAll(PageRequest.of(pageNo - 1, pageSize));
        PageResult<BridgeEntity> result = new PageResult<BridgeEntity>();
        result.setContent(page.getContent());
        result.setPageNo(pageNo);
        result.setPageSize(pageSize);
        result.setTotalRecords(page.getTotalElements());
        return new BaseResponse(result);
    }

    @GetMapping("/list")
    public BaseResponse<List<BridgeEntity>> list() {
        List<BridgeEntity> all = bridgeRepository.findAll();
        return new BaseResponse(all);
    }


    @DeleteMapping("/{id}")
    public BaseResponse delete(@PathVariable("id") Integer id) {
        bridgeRepository.deleteById(id);
        return new BaseResponse();
    }
}
