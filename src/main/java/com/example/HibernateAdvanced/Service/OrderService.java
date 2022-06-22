package com.example.HibernateAdvanced.Service;

import com.example.HibernateAdvanced.Modal.Category;
import com.example.HibernateAdvanced.Modal.Customer;
import com.example.HibernateAdvanced.Modal.Orders;
import com.example.HibernateAdvanced.Modal.Product;
import com.example.HibernateAdvanced.Pojos.AddOrder;
import com.example.HibernateAdvanced.Repositories.CategoryRepository;
import com.example.HibernateAdvanced.Repositories.CustomerRepository;
import com.example.HibernateAdvanced.Repositories.OrdersRepository;
import com.example.HibernateAdvanced.Repositories.ProductRepository;
import org.hibernate.annotations.NotFound;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.nio.file.attribute.UserPrincipalNotFoundException;
import java.util.Optional;

@Service
public class OrderService {

    @Autowired
    private OrdersRepository ordersRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private ProductRepository productRepository;



    public String AddOrder(AddOrder addOrder) throws Exception{


        Orders orders = new Orders();
        Optional<Customer> customer = customerRepository.findById(addOrder.getCustomerId());
        if(customer.isPresent() == false){
            throw new Exception("Customer doesn't exists on this id: "+addOrder.getCustomerId());
        }

        Optional<Category> category = categoryRepository.findById(addOrder.getCategoryId());
        if(category.isPresent() == false){
            throw new Exception("Category doesn't exists on this id: "+addOrder.getCategoryId());
        }

        for(Long i: addOrder.getProducts()){
            Optional<Product> product = productRepository.findById(addOrder.getProducts().get(i.intValue()));
            if(product.isPresent() == true){
                productRepository.save(product.get());
            }else{
                System.out.println("Product doesn't exists on this id: "+addOrder.getProducts().get(i.intValue()));
            }
        }
        return "Order Added Successfully";
    }


}
