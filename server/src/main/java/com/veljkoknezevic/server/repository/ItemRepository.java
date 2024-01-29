package com.veljkoknezevic.server.repository;

import com.veljkoknezevic.server.entity.Item;
import org.springframework.data.repository.CrudRepository;

public interface ItemRepository extends CrudRepository<Item, Integer> {
}
