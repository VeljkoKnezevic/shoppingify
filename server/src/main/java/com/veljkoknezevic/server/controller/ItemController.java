package com.veljkoknezevic.server.controller;

import com.google.gson.Gson;
import com.veljkoknezevic.server.entity.Item;
import com.veljkoknezevic.server.service.ItemService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/item")
@CrossOrigin
public class ItemController {

    private final ItemService itemService;

    Gson gson = new Gson();

    public ItemController(ItemService itemService) {
        this.itemService = itemService;
    }

    @GetMapping("/all")
    public ResponseEntity<?> getAllItems() {
        List<Item> allItems = itemService.getItems();


        if(allItems.size() == 0) {
            return ResponseEntity.badRequest().body(gson.toJson("There are no items"));
        }

        return ResponseEntity.ok().body(allItems);
    }

    @GetMapping("/{name}")
    public ResponseEntity<?> getItemByName(@PathVariable String name) {
        Item item = itemService.getItemByName(name);

        if(item == null) {
            return ResponseEntity.badRequest().body(gson.toJson("There is no item with that name"));
        }

        return ResponseEntity.ok().body(item);
    }

    @PostMapping("/new")
    public ResponseEntity<?> addNewItem(@RequestBody Item item) {
        Item item1 = itemService.addItem(item);

        return ResponseEntity.ok().body(item1);
    }





}
