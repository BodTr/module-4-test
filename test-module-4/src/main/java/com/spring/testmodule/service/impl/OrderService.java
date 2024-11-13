package com.spring.testmodule.service.impl;

import com.spring.testmodule.model.dto.SavingOrderDTO;
import com.spring.testmodule.model.entity.ItemEntity;
import com.spring.testmodule.model.entity.OrderEntity;
import com.spring.testmodule.repository.IOrderRepository;
import com.spring.testmodule.service.IOderService;
import com.spring.testmodule.util.mapper.SavingOrderMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class OrderService implements IOderService {
    private final IOrderRepository orderRepository;

    private final ItemService itemService;

    private final ItemTypeService itemTypeService;

    private final SavingOrderMapper orderMapper;

    @Autowired
    public OrderService(IOrderRepository orderRepository, ItemService itemService, ItemTypeService itemTypeService, SavingOrderMapper orderMapper) {
        this.orderRepository = orderRepository;
        this.itemService = itemService;
        this.itemTypeService = itemTypeService;
        this.orderMapper = orderMapper;
    }

    @Override
    public Iterable<OrderEntity> findAll() {
        return orderRepository.findAll();
    }

    @Override
    public void save(OrderEntity order) {
        orderRepository.save(order);
    }

    @Override
    public Optional<OrderEntity> findById(Long id) {
        return Optional.empty();
    }

    @Override
    public void remove(Long id) {
        orderRepository.deleteById(id);
    }

    public void saveOrder(SavingOrderDTO orderDTO) {
        Long itemId = orderDTO.getItemId();
        Optional<ItemEntity> itemEntity = itemService.findById(itemId);
        if (itemEntity.isPresent()) {
            ItemEntity item = itemEntity.get();
            OrderEntity order = orderMapper.OrderDTOToEntity(orderDTO, item);
            this.save(order);
        } else {
            throw new NullPointerException("Item not found");
        }
    }

    public void updateOrder(Long id, SavingOrderDTO orderDTO) {
        Long itemId = orderDTO.getItemId();
        Optional<ItemEntity> itemEntity = itemService.findById(itemId);

        if (itemEntity.isPresent()) {
            ItemEntity item = itemEntity.get();
            OrderEntity editOrder = orderMapper.OrderDTOToEntity(orderDTO, item);
            Optional<OrderEntity> updatingOrder = orderRepository.findById(id);
            updatingOrder.map(order -> {
                order.setOrderDate(editOrder.getOrderDate());
                order.setItemCount(editOrder.getItemCount());
                order.setItemEntity(editOrder.getItemEntity());
                return orderRepository.save(order);
            }).orElseThrow(() -> new NullPointerException("Order not found"));
        } else {
            throw new NullPointerException("Item not found");
        }

    }


}
