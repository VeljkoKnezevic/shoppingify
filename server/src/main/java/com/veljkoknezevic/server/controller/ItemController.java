package com.veljkoknezevic.server.controller;

import com.veljkoknezevic.server.entity.Item;
import com.veljkoknezevic.server.repository.ItemRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/item")
public class ItemController {

    @Autowired
    private ItemRepository itemRepository;

    @PostMapping("/new")
    public Item newItem(@RequestBody Item item) {
        itemRepository.save(item);

        return item;
    }
}
