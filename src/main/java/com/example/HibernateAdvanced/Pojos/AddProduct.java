package com.example.HibernateAdvanced.Pojos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AddProduct {

    private String productName;
    private Long quantity;
    private Double price;
    private Long categoryId;
}
