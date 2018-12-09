package com.claymore.fire.gas.controller;

import com.claymore.fire.common.domain.BaseResponse;
import com.claymore.fire.common.domain.PageResult;
import com.claymore.fire.gas.entity.GasEntity;
import com.claymore.fire.gas.repository.GasRepository;
import com.claymore.fire.roadlineinfo.entity.RoadLineInfoEntity;
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
@RequestMapping("/gas")
public class GasController {
    
    @Autowired
    private GasRepository gasRepository;

    @GetMapping("/{id}")
    @ApiOperation(value = "query roadline info with id", consumes = "GET", response = RoadLineInfoEntity.class)
    public BaseResponse<GasEntity> findById(@PathVariable("id") Integer id) {
        return new BaseResponse<>(gasRepository.findById(id).get());
    }

    @PostMapping
    public BaseResponse create(@RequestBody GasEntity gasEntity) {
        gasRepository.save(gasEntity);
        return BaseResponse.instance();
    }

    @PutMapping
    public BaseResponse update(@RequestBody GasEntity updatedGasEntity) {
        gasRepository.save(updatedGasEntity);
        return BaseResponse.instance();
    }

    @GetMapping("/{pageSize}/{pageNo}")
    public BaseResponse<PageResult<GasEntity>> page(@PathVariable("pageSize") int pageSize, @PathVariable("pageNo") int pageNo) {
        Page<GasEntity> page = gasRepository.findAll(PageRequest.of(pageNo - 1, pageSize));
        PageResult<GasEntity> result = new PageResult<GasEntity>();
        result.setContent(page.getContent());
        result.setPageNo(pageNo);
        result.setPageSize(pageSize);
        result.setTotalRecords(page.getTotalElements());
        return new BaseResponse(result);
    }

    @GetMapping("/list")
    public BaseResponse<List<GasEntity>> list() {
        List<GasEntity> all = gasRepository.findAll();
        return new BaseResponse(all);
    }

    @DeleteMapping("/{id}")
    public BaseResponse delete(@PathVariable("id") Integer id) {
        gasRepository.deleteById(id);
        return new BaseResponse();
    }

}
