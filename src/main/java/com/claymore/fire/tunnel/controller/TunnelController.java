package com.claymore.fire.tunnel.controller;

import com.claymore.fire.common.domain.BaseResponse;
import com.claymore.fire.common.domain.PageResult;
import com.claymore.fire.roadlineinfo.entity.RoadLineInfoEntity;
import com.claymore.fire.tunnel.entity.TunnelEntity;
import com.claymore.fire.tunnel.repository.TunnelRepository;
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
@RequestMapping("/tunnel")
public class TunnelController {
    
    @Autowired
    private TunnelRepository tunnelRepository;

    @GetMapping("/{id}")
    @ApiOperation(value = "query tunnel info with id", consumes = "GET", response = RoadLineInfoEntity.class)
    public BaseResponse<TunnelEntity> findById(@PathVariable("id") Integer id) {
        return new BaseResponse<>(tunnelRepository.findById(id).get());
    }

    @PostMapping
    public BaseResponse create(@RequestBody TunnelEntity roadLineInfoEntity) {
        tunnelRepository.save(roadLineInfoEntity);
        return BaseResponse.instance();
    }

    @PutMapping
    public BaseResponse update(@RequestBody TunnelEntity updatedRoadLineInfoEntity) {
        tunnelRepository.save(updatedRoadLineInfoEntity);
        return BaseResponse.instance();
    }

    @GetMapping("/{pageSize}/{pageNo}")
    public BaseResponse<PageResult<TunnelEntity>> page(@PathVariable("pageSize") int pageSize, @PathVariable("pageNo") int pageNo) {
        Page<TunnelEntity> page = tunnelRepository.findAll(PageRequest.of(pageNo - 1, pageSize));
        PageResult<TunnelEntity> result = new PageResult<TunnelEntity>();
        result.setContent(page.getContent());
        result.setPageNo(pageNo);
        result.setPageSize(pageSize);
        result.setTotalRecords(page.getTotalElements());
        return new BaseResponse(result);
    }

    @GetMapping("/list")
    public BaseResponse<List<TunnelEntity>> list() {
        List<TunnelEntity> all = tunnelRepository.findAll();
        return new BaseResponse(all);
    }


    @DeleteMapping("/{id}")
    public BaseResponse delete(@PathVariable("id") Integer id) {
        tunnelRepository.deleteById(id);
        return new BaseResponse();
    }


}
