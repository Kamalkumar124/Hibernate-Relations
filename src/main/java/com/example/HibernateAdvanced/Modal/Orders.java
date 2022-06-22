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
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Order_Id")
    private Long id;


    @Column(name = "Order_Create_Date")
    @CreationTimestamp
    private Date orderCreatedDate;

    @Column(name = "Order_Update_Date")
    @UpdateTimestamp
    private Date updatedOrderDate;

    @ManyToOne(fetch = FetchType.LAZY)
    private Category category;

    @ManyToOne(fetch = FetchType.LAZY)
    private Customer customer;


    @ManyToMany
    @JoinTable(name = "OrderProduct", joinColumns = @JoinColumn(name = "Order_Id"), inverseJoinColumns = @JoinColumn(name = "Product_id"))
    private List<Product> products;
}
