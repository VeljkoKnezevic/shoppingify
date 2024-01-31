package com.veljkoknezevic.server.repository;

import com.veljkoknezevic.server.entity.ShoppingList;
import org.springframework.data.repository.CrudRepository;

public interface ListRepository extends CrudRepository<ShoppingList, Integer> {
}
