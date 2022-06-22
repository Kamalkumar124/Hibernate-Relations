package com.example.HibernateAdvanced.Pojos;

import com.example.HibernateAdvanced.Modal.Category;
import com.example.HibernateAdvanced.Modal.Customer;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AddOrder {

    private Long categoryId;
    private Long customerId;
    private List<Long> products;
}
