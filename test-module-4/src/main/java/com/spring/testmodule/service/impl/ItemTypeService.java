package com.spring.testmodule.service.impl;


import com.spring.testmodule.model.entity.ItemTypeEntity;
import com.spring.testmodule.repository.IItemTypeRepository;
import com.spring.testmodule.service.IItemTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ItemTypeService implements IItemTypeService {
    @Autowired
    private IItemTypeRepository itemTypeRepository;

    @Override
    public void remove(Long id) {
        itemTypeRepository.deleteById(id);
    }

    @Override
    public Optional<ItemTypeEntity> findById(Long id) {
        return itemTypeRepository.findById(id);
    }

    @Override
    public void save(ItemTypeEntity itemTypeEntity) {
        itemTypeRepository.save(itemTypeEntity);
    }

    @Override
    public Iterable<ItemTypeEntity> findAll() {
        return itemTypeRepository.findAll();
    }
}
