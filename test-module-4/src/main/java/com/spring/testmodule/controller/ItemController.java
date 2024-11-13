package com.spring.testmodule.controller;

import com.spring.testmodule.model.entity.ItemEntity;
import com.spring.testmodule.service.impl.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/items")
public class ItemController {
    @Autowired
    private ItemService itemService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public Iterable<ItemEntity> getItems() {
        return itemService.findAll();
    }
}
