package com.veljkoknezevic.server.service;

import com.veljkoknezevic.server.entity.Category;
import com.veljkoknezevic.server.entity.Item;
import com.veljkoknezevic.server.repository.CategoryRepository;
import com.veljkoknezevic.server.repository.ItemRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemService {

    private final ItemRepository itemRepository;
    private final CategoryRepository categoryRepository;

    public ItemService(ItemRepository itemRepository, CategoryRepository categoryRepository) {
        this.itemRepository = itemRepository;
        this.categoryRepository = categoryRepository;
    }

    public List<Item> getItems() {
        return (List<Item>) itemRepository.findAll();
    }

    public Item getItemByName(String name) {
        return itemRepository.findByName(name).orElse(null);
    }

    public Item addItem(Item item) {

        if(categoryRepository.findById(1).isEmpty()) {
            categoryRepository.save(new Category("Vegetable"));
        }

        return itemRepository.save(item);
    }

}
