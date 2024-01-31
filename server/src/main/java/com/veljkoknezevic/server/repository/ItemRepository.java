package com.veljkoknezevic.server.repository;

import com.veljkoknezevic.server.entity.Item;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ItemRepository extends CrudRepository<Item, Integer> {

    Optional<Item> findByName(String name);
}
