package com.veljkoknezevic.server.service;

import com.google.gson.Gson;
import com.veljkoknezevic.server.entity.Item;
import com.veljkoknezevic.server.entity.ShoppingList;
import com.veljkoknezevic.server.repository.ItemRepository;
import com.veljkoknezevic.server.repository.ListRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListService {

    private final ListRepository listRepository;
    private final ItemRepository itemRepository;

    Gson gson = new Gson();

    public ListService(ListRepository listRepository, ItemRepository itemRepository) {
        this.listRepository = listRepository;
        this.itemRepository = itemRepository;
    }

    public List<ShoppingList> getAllLists() {
        return (List<ShoppingList>) listRepository.findAll();
    }

    public ShoppingList addNewList(ShoppingList list) {
        return listRepository.save(list);
    }
}
