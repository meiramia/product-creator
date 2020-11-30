package com.productcreator.resources;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductCreatorController
{



    @GetMapping("/GetProductName")
    public String getProductName()
    {
        return  "product #1";
    }
}
