package com.claymore.fire.roadlineinfo.controller;

import com.claymore.fire.common.domain.BaseResponse;
import com.claymore.fire.common.domain.PageResult;
import com.claymore.fire.roadlineinfo.entity.RoadLineInfoEntity;
import com.claymore.fire.roadlineinfo.repository.RoadLineInfoRepository;
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
@RequestMapping("/road-line-info")
public class RoadLineInfoController {
    
    @Autowired
    private RoadLineInfoRepository roadLineInfoRepository;

    @GetMapping("/{id}")
    @ApiOperation(value = "query roadline info with id", consumes = "GET", response = RoadLineInfoEntity.class)
    public BaseResponse<RoadLineInfoEntity> findById(@PathVariable("id") Integer id) {
        return new BaseResponse<>(roadLineInfoRepository.findById(id).get());
    }

    @PostMapping
    public BaseResponse create(@RequestBody RoadLineInfoEntity roadLineInfoEntity) {
        roadLineInfoRepository.save(roadLineInfoEntity);
        return BaseResponse.instance();
    }

    @PutMapping
    public BaseResponse update(@RequestBody RoadLineInfoEntity updatedRoadLineInfoEntity) {
        roadLineInfoRepository.save(updatedRoadLineInfoEntity);
        return BaseResponse.instance();
    }

    @GetMapping("/{pageSize}/{pageNo}")
    public BaseResponse<PageResult<RoadLineInfoEntity>> page(@PathVariable("pageSize") int pageSize, @PathVariable("pageNo") int pageNo) {
        Page<RoadLineInfoEntity> page = roadLineInfoRepository.findAll(PageRequest.of(pageNo - 1, pageSize));
        PageResult<RoadLineInfoEntity> result = new PageResult<RoadLineInfoEntity>();
        result.setContent(page.getContent());
        result.setPageNo(pageNo);
        result.setPageSize(pageSize);
        result.setTotalRecords(page.getTotalElements());
        return new BaseResponse(result);
    }

    @GetMapping("/list")
    public BaseResponse<List<RoadLineInfoEntity>> list() {
        List<RoadLineInfoEntity> all = roadLineInfoRepository.findAll();
        return new BaseResponse(all);
    }


}
