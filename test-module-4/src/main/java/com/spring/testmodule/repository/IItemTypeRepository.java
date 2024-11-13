package com.spring.testmodule.repository;

import com.spring.testmodule.model.entity.ItemTypeEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IItemTypeRepository  extends JpaRepository<ItemTypeEntity, Long> {
}
