package com.example.HibernateAdvanced.Modal;

import com.sun.istack.NotNull;
import lombok.*;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Product_id")
    private Long id;

    @Column(name = "Name")
    private String productName;

    @CreationTimestamp
    @Column(name = "EntryDate")
    private Date enteredDate;

    @UpdateTimestamp
    @Column(name = "UpdatedProductDate")
    private Date updateDate;

    @Column(name = "Quantity")
    private Long quantity;

    @Column(name = "Price")
    private Double price;

    @ManyToMany(mappedBy = "products")
    private List<Orders> orders;
    
    
    @ManyToOne(fetch = FetchType.LAZY)
    @NotNull
    private Category category;
}
