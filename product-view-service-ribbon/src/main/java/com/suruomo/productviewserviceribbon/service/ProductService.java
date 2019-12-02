package com.suruomo.productviewserviceribbon.service;

import com.suruomo.productviewserviceribbon.client.ProductClientRibbon;
import com.suruomo.productviewserviceribbon.pojo.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author 苏若墨
 */
@Service
public class ProductService {
    @Autowired
    ProductClientRibbon productClientRibbon;
    public List<Product> listProducts(){
        return productClientRibbon.listProdcuts();

    }
}
