package com.example.HibernateAdvanced.Modal;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Category_Id")
    private Long id;

    @Column(name = "Name")
    private String name;

    @Column(name = "Order_Create_Date")
    @CreationTimestamp
    private Date orderCreatedDate;

    @Column(name = "Order_Update_Date")
    @UpdateTimestamp
    private Date updatedOrderDate;

    @OneToMany(mappedBy = "category")
    private List<Orders> orders;

    @OneToMany(mappedBy = "category")
    private List<Product> products;
}
