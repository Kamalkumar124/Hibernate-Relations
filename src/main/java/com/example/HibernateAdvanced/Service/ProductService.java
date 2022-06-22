package com.example.HibernateAdvanced.Service;

import com.example.HibernateAdvanced.Modal.Category;
import com.example.HibernateAdvanced.Modal.Product;
import com.example.HibernateAdvanced.Pojos.AddProduct;
import com.example.HibernateAdvanced.Repositories.CategoryRepository;
import com.example.HibernateAdvanced.Repositories.CustomerRepository;
import com.example.HibernateAdvanced.Repositories.OrdersRepository;
import com.example.HibernateAdvanced.Repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private OrdersRepository ordersRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private ProductRepository productRepository;


    public String AddProduct(AddProduct addProduct) throws Exception{

        Product product = new Product();
        product.setProductName(addProduct.getProductName());
        product.setPrice(addProduct.getPrice());
        product.setQuantity(addProduct.getQuantity());

        Optional<Category> category = categoryRepository.findById(addProduct.getCategoryId());
        if(category.isPresent() == true){
            product.setCategory(category.get());
            productRepository.save(product);
        }else {
            throw new Exception("Category not found on this id: "+addProduct.getCategoryId());
        }

        return "Product added Successfully";
    }

}
