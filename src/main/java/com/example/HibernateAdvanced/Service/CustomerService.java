package com.example.HibernateAdvanced.Service;

import com.example.HibernateAdvanced.Modal.Customer;
import com.example.HibernateAdvanced.Pojos.AddCustomer;
import com.example.HibernateAdvanced.Repositories.CategoryRepository;
import com.example.HibernateAdvanced.Repositories.CustomerRepository;
import com.example.HibernateAdvanced.Repositories.OrdersRepository;
import com.example.HibernateAdvanced.Repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Service
public class CustomerService {

    @Autowired
    private OrdersRepository ordersRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private ProductRepository productRepository;



    public String addCustomer(AddCustomer addCustomer) throws Exception {

        Customer customer = new Customer();
        customer.setCustomerName(addCustomer.getCustomerName());
        Date dateOfBirth = new SimpleDateFormat("dd/mm/yyyy").parse(addCustomer.getDateOfBirth());
        customer.setDateOfBirth(dateOfBirth);
        customerRepository.save(customer);
        return "Customer added successfully";
    }
}
