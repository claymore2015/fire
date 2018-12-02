package com.claymore.bamder.cybersecurity.unit.service;

import com.claymore.bamder.cybersecurity.unit.entity.UnitsEntity;
import com.claymore.bamder.cybersecurity.unit.repository.UnitsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

/**
 * @author li.zhuo
 * @create 2018/11/12 11:29 PM
 * @since 1.0.0
 */
@Service
public class UnitsService {

    @Autowired private UnitsRepository unitsRepository;

    public UnitsEntity save(UnitsEntity entity) {
        return unitsRepository.save(entity);
    }

    public UnitsEntity findById(Long unitId) {
        return unitsRepository.findById(unitId).get();
    }

    public Page<UnitsEntity> findPage(int pageSize, int pageNo) {
        return unitsRepository.findAll(PageRequest.of(pageNo - 1, pageSize));
    }

}
