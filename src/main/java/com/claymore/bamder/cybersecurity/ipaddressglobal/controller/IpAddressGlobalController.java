package com.claymore.bamder.cybersecurity.ipaddressglobal.controller;

import com.claymore.bamder.common.domain.BaseResponse;
import com.claymore.bamder.common.domain.PageResult;
import com.claymore.bamder.cybersecurity.ipaddressglobal.domain.IpAddressGlobalDomain;
import com.claymore.bamder.cybersecurity.ipaddressglobal.entity.IpAddressGlobalEntity;
import com.claymore.bamder.cybersecurity.ipaddressglobal.repository.IpAddressGlobalRepository;
import com.claymore.bamder.cybersecurity.ipaddressglobal.support.IpAddressGlobalSupport;
import com.claymore.bamder.cybersecurity.unit.entity.UnitsEntity;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.*;

import java.util.stream.Collectors;

/**
 * @author li.zhuo
 * @create 2018/11/15 11:01 PM
 * @since 1.0.0
 */
@RestController
@RequestMapping("/ip_address_global")
public class IpAddressGlobalController {
    @Autowired
    private IpAddressGlobalRepository ipAddressGlobalRepository;

    @GetMapping("/{id}")
    @ApiOperation(value = "query ip address global with id", consumes = "GET", response = UnitsEntity.class)
    public BaseResponse<IpAddressGlobalDomain> findById(@PathVariable("id") Long id) {
        return new BaseResponse<>(IpAddressGlobalSupport.transferToDomain(ipAddressGlobalRepository.findById(id).get()));
    }

    @PostMapping
    public BaseResponse create(@RequestBody IpAddressGlobalDomain ipAddressGlobalDomain) {
        ipAddressGlobalRepository.save(IpAddressGlobalSupport.transferToEntity(ipAddressGlobalDomain));
        return BaseResponse.instance();
    }

    @PutMapping
    public BaseResponse update(@RequestBody IpAddressGlobalDomain updatedIpAddressGlobalDomainy) {
        ipAddressGlobalRepository.save(IpAddressGlobalSupport.transferToEntity(updatedIpAddressGlobalDomainy));
        return BaseResponse.instance();
    }

    @GetMapping("/{pageSize}/{pageNo}")
    public BaseResponse<PageResult<IpAddressGlobalDomain>> page(@PathVariable("pageSize") int pageSize, @PathVariable("pageNo") int pageNo) {
        Page<IpAddressGlobalEntity> page = ipAddressGlobalRepository.findAll(PageRequest.of(pageNo - 1, pageSize));
        PageResult<IpAddressGlobalDomain> result = new PageResult<IpAddressGlobalDomain>();
        result.setContent(page.getContent().stream().map(IpAddressGlobalSupport::transferToDomain).collect(Collectors.toList()));
        result.setPageNo(pageNo);
        result.setPageSize(pageSize);
        result.setTotalRecords(page.getTotalElements());
        return new BaseResponse(result);
    }
}
