package com.claymore.fire.servicezone.controller;

import com.claymore.fire.common.domain.BaseResponse;
import com.claymore.fire.common.domain.PageResult;
import com.claymore.fire.roadlineinfo.entity.RoadLineInfoEntity;
import com.claymore.fire.servicezone.entity.ServiceZoneEntity;
import com.claymore.fire.servicezone.repository.ServiceZoneRepository;
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
@RequestMapping("/service-zone")
public class ServiceZoneController {
    
    @Autowired
    private ServiceZoneRepository serviceZoneRepository;

    @GetMapping("/{id}")
    @ApiOperation(value = "query service zone info with id", consumes = "GET", response = ServiceZoneEntity.class)
    public BaseResponse<ServiceZoneEntity> findById(@PathVariable("id") Integer id) {
        return new BaseResponse<>(serviceZoneRepository.findById(id).get());
    }

    @PostMapping
    @ApiOperation("create service zone")
    public BaseResponse create(@RequestBody ServiceZoneEntity serviceZoneEntity) {
        serviceZoneRepository.save(serviceZoneEntity);
        return BaseResponse.instance();
    }

    @PutMapping
    @ApiOperation("update service zone")
    public BaseResponse update(@RequestBody ServiceZoneEntity updatedServiceZoneEntity) {
        serviceZoneRepository.save(updatedServiceZoneEntity);
        return BaseResponse.instance();
    }

    @GetMapping("/{pageSize}/{pageNo}")
    @ApiOperation("query service zone by page")
    public BaseResponse<PageResult<ServiceZoneEntity>> page(@PathVariable("pageSize") int pageSize, @PathVariable("pageNo") int pageNo) {
        Page<ServiceZoneEntity> page = serviceZoneRepository.findAll(PageRequest.of(pageNo - 1, pageSize));
        PageResult<ServiceZoneEntity> result = new PageResult<ServiceZoneEntity>();
        result.setContent(page.getContent());
        result.setPageNo(pageNo);
        result.setPageSize(pageSize);
        result.setTotalRecords(page.getTotalElements());
        return new BaseResponse(result);
    }

    @GetMapping("/list")
    @ApiOperation("query all service zone")
    public BaseResponse<List<ServiceZoneEntity>> list() {
        List<ServiceZoneEntity> all = serviceZoneRepository.findAll();
        return new BaseResponse(all);
    }

    @DeleteMapping("/{id}")
    public BaseResponse delete(@PathVariable("id") Integer id) {
        serviceZoneRepository.deleteById(id);
        return new BaseResponse();
    }

}
