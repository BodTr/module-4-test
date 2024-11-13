package com.spring.testmodule.repository;

import com.spring.testmodule.model.entity.ItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IItemRepository extends JpaRepository<ItemEntity, Long> {
}
