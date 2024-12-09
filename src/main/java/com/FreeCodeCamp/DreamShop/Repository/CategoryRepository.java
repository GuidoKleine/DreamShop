package com.FreeCodeCamp.DreamShop.Repository;

import com.FreeCodeCamp.DreamShop.Entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
    Category findByName(String name);

    Boolean existsByName(String name);
}
