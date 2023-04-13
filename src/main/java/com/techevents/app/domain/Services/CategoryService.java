package com.techevents.app.domain.Services;

import com.techevents.app.domain.Models.Category;
//import com.techevents.app.infrastructure.Repositories.ICategoryRepository;
import com.techevents.app.Repositories.ICategoryRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {
    private final ICategoryRepository categoryRepository;

    public CategoryService(ICategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    public List<Category> findAllCategories(){
        return categoryRepository.findAll();
    }

    public Category findCategoryById(Long id){
        var categoryOptional = this.categoryRepository.findById(id);
        if(categoryOptional.isEmpty()) throw new RuntimeException("Please be informed that the category with the ID of " + id + " is not available in our database at the moment. Kindly try again with a different ID or reach out to our support team for further assistance.");
        return categoryOptional.get();
    }
}
