package com.educandowen.course.repositories;

import com.educandowen.course.entities.Category;
import com.educandowen.course.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
