package com.example.HibernateAdvanced.Controllers;
import com.example.HibernateAdvanced.Pojos.AddProduct;
import com.example.HibernateAdvanced.Service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("product")
public class ProductController {

    @Autowired
    private ProductService productService;

    @PostMapping("/")
    public String addProduct(@RequestBody AddProduct addProduct) throws Exception{
        return productService.AddProduct(addProduct);
    }

    @GetMapping("/getproduct")
    public void getProduct(){

    }
}
