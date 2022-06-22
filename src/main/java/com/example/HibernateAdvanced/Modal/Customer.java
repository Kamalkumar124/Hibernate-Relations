package com.example.HibernateAdvanced.Modal;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Customer_Id")
    private Long idd;

    @Column(name = "Customer_name")
    private String customerName;

    @Column(name = "Register_date")
    @CreationTimestamp
    private Date registeredDate;

    @Column(name = "Birth_Date")
    private Date dateOfBirth;

    @OneToMany(mappedBy = "customer")
    private List<Orders> orders;
}
