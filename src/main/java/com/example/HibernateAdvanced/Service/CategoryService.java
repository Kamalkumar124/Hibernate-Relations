package com.example.HibernateAdvanced.Service;

import com.example.HibernateAdvanced.Modal.Category;
import com.example.HibernateAdvanced.Pojos.AddCategory;
import com.example.HibernateAdvanced.Repositories.CategoryRepository;
import com.example.HibernateAdvanced.Repositories.CustomerRepository;
import com.example.HibernateAdvanced.Repositories.OrdersRepository;
import com.example.HibernateAdvanced.Repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoryService {

    @Autowired
    private OrdersRepository ordersRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private ProductRepository productRepository;


    public String addCategory(AddCategory addCategory) throws Exception{

        Category category = new Category();
        category.setName(addCategory.getCategoryName());
        categoryRepository.save(category);
        return "Category Added Successfully";
    }

}
