package com.techevents.app.Repositories;

import com.techevents.app.domain.Models.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoryRepository extends JpaRepository<Category, Long> {

}
