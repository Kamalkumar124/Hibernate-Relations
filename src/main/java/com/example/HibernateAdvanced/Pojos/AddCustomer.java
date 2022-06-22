package com.example.HibernateAdvanced.Pojos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class AddCustomer {

    private String customerName;
    private String dateOfBirth;
}
