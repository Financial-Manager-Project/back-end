package financial.manager.demo.service;

import java.util.List;
import java.util.UUID;

import financial.manager.demo.DTO.CategoryDTO;

interface CategoryService {
    List<CategoryDTO> getAllCategory();
    CategoryDTO getCategoryById(UUID id, CategoryDTO data);
    CategoryDTO createCategory(CategoryDTO data);
    CategoryDTO updateCategoryById(UUID id, CategoryDTO data);
    void deleteCategoryById(UUID id);    
}
