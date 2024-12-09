package com.FreeCodeCamp.DreamShop.Service.Category;

import com.FreeCodeCamp.DreamShop.Entity.Category;
import com.FreeCodeCamp.DreamShop.Exceptions.AlreadyExistException;
import com.FreeCodeCamp.DreamShop.Exceptions.ResourceNotFoundException;
import com.FreeCodeCamp.DreamShop.Repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CategoryService implements ICategoryService {

    private final CategoryRepository categoryRepository;

    @Override
    public Category addCategory(Category category) {
        return Optional.of(category).filter(c -> !categoryRepository.existsByName(c.getName()))
                .map(categoryRepository :: save)
                .orElseThrow(() -> new AlreadyExistException(category.getName()+" already exist"));
    }

    @Override
    public void deleteCategory(Long id) {
        categoryRepository.findById(id).ifPresentOrElse(categoryRepository::delete,
                () -> {new ResourceNotFoundException("Category not found!");});
    }

    @Override
    public Category updateCategory(Category category, Long id) {
        // Find existing category by ID
        // Set new name for category with name from category variable
        return Optional.ofNullable(getCategoryById(id))
                .map(oldCategory -> {
                    oldCategory.setName(category.getName());
                    return categoryRepository.save(oldCategory);
                }).orElseThrow(() -> new ResourceNotFoundException("Category not found!"));
    }

    @Override
    public List<Category> getAllCategories() {
        return categoryRepository.findAll();
    }

    @Override
    public Category getCategoryByName(String name) {
        return categoryRepository.findByName(name);
    }

    @Override
    public Category getCategoryById(Long id) {
        return categoryRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Category not found!"));
    }
}
