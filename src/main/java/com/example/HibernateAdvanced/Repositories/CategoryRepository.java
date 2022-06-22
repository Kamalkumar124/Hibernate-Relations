package com.example.HibernateAdvanced.Repositories;

import com.example.HibernateAdvanced.Modal.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Long> {

}
