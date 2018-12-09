package com.claymore.fire.toll.controller;

import com.claymore.fire.common.domain.BaseResponse;
import com.claymore.fire.common.domain.PageResult;
import com.claymore.fire.roadlineinfo.entity.RoadLineInfoEntity;
import com.claymore.fire.toll.entity.TollEntity;
import com.claymore.fire.toll.repository.TollRepository;
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
@RequestMapping("/toll")
public class TollController {
    
    @Autowired
    private TollRepository tollRepository;

    @GetMapping("/{id}")
    @ApiOperation(value = "query toll info with id", consumes = "GET", response = TollEntity.class)
    public BaseResponse<TollEntity> findById(@PathVariable("id") Integer id) {
        return new BaseResponse<>(tollRepository.findById(id).get());
    }

    @PostMapping
    public BaseResponse create(@RequestBody TollEntity roadLineInfoEntity) {
        tollRepository.save(roadLineInfoEntity);
        return BaseResponse.instance();
    }

    @PutMapping
    public BaseResponse update(@RequestBody TollEntity updatedRoadLineInfoEntity) {
        tollRepository.save(updatedRoadLineInfoEntity);
        return BaseResponse.instance();
    }

    @GetMapping("/{pageSize}/{pageNo}")
    public BaseResponse<PageResult<RoadLineInfoEntity>> page(@PathVariable("pageSize") int pageSize, @PathVariable("pageNo") int pageNo) {
        Page<TollEntity> page = tollRepository.findAll(PageRequest.of(pageNo - 1, pageSize));
        PageResult<TollEntity> result = new PageResult<TollEntity>();
        result.setContent(page.getContent());
        result.setPageNo(pageNo);
        result.setPageSize(pageSize);
        result.setTotalRecords(page.getTotalElements());
        return new BaseResponse(result);
    }

    @GetMapping("/list")
    public BaseResponse<List<TollEntity>> list() {
        List<TollEntity> all = tollRepository.findAll();
        return new BaseResponse(all);
    }


    @DeleteMapping("/{id}")
    public BaseResponse delete(@PathVariable("id") Integer id) {
        tollRepository.deleteById(id);
        return new BaseResponse();
    }

}
