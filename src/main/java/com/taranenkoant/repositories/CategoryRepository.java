package com.taranenkoant.repositories;

import com.taranenkoant.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
