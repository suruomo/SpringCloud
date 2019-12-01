package com.suruomo.productdataservice.controller;

import com.suruomo.productdataservice.pojo.Product;
import com.suruomo.productdataservice.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


/**
 * @author 苏若墨
 */
@RestController
public class ProductController {
 
	@Autowired
    ProductService productService;
	
    @RequestMapping("/products")
    public Object products() {
    	List<Product> ps = productService.listProducts();
    	return ps;
    }
}