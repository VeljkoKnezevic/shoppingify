package com.veljkoknezevic.server.repository;

import com.veljkoknezevic.server.entity.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Integer> {
}
