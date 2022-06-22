package com.example.HibernateAdvanced.Controllers;
import com.example.HibernateAdvanced.Pojos.AddCategory;
import com.example.HibernateAdvanced.Service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/category")
public class CategoryController {


    @Autowired
    private CategoryService categoryService;

    @PostMapping("/")
    private String addCategory(@RequestBody AddCategory addCategory) throws Exception{
        return categoryService.addCategory(addCategory);
    }
}
