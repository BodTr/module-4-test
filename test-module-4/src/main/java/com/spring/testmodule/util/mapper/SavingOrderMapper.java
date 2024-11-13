package com.spring.testmodule.util.mapper;

import com.spring.testmodule.model.dto.SavingOrderDTO;
import com.spring.testmodule.model.entity.ItemEntity;
import com.spring.testmodule.model.entity.OrderEntity;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class SavingOrderMapper {
    public OrderEntity OrderDTOToEntity(SavingOrderDTO orderDTO, ItemEntity itemEntity) {
        LocalDate orderDate = orderDTO.getOrderDate();
        int itemCount = orderDTO.getItemCount();
        ItemEntity item = itemEntity;
        OrderEntity orderEntity = new OrderEntity();
        orderEntity.setOrderDate(orderDate);
        orderEntity.setItemCount(itemCount);
        orderEntity.setItemEntity(item);
        return orderEntity;
    }
}
