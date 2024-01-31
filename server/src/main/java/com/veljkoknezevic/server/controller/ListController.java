package com.veljkoknezevic.server.controller;

import com.veljkoknezevic.server.entity.ShoppingList;
import com.veljkoknezevic.server.service.ListService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/list")
public class ListController {

    private final ListService listService;

    public ListController(ListService listService) {
        this.listService = listService;
    }

    @GetMapping("/all")
    public ResponseEntity<?> getAllLists() {
        List<ShoppingList> shoppingLists = listService.getAllLists();
        return ResponseEntity.ok(shoppingLists);
    }

    @PostMapping("/new")
    public ResponseEntity<?> addNewList(@RequestBody ShoppingList shoppingList) {
        ShoppingList newList = listService.addNewList(shoppingList);
        return ResponseEntity.ok(newList);
    }

}
