package com.qing.owl.lime.domain.category;

import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository {
    Category findById(Long id);
}
