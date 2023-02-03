package com.example.rest.controller;

import com.example.rest.entity.Brand_c;
import com.example.rest.entity.Customers_c;
import com.example.rest.entity.Product_c;
import com.example.rest.service.ServiceClass_c;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class ControllerClass_c {
    @Autowired
    ServiceClass_c serviceClass;
    Logger l= LoggerFactory.getLogger(ControllerClass_c.class);

    @GetMapping("/getAllCustomers")
    public List<Customers_c> getAllCustomers(){
        return serviceClass.getCustomers();
    }
    @GetMapping("/getAllProduct")
    public List<Product_c> getAllProduct(){
        return serviceClass.getProduct();
    }
    @GetMapping("/getAllBrand")
    public List<Brand_c> getAllBrand(){ return  serviceClass.getBrand();}
    @GetMapping("/getProductById/{id}")
    public int getProductById(@PathVariable int id){
        return serviceClass.getProductById(id);
    }

   @GetMapping("/getCustomersById/{id}")
   public List<Product_c> getCustomersById(@PathVariable int id){
        return serviceClass.getCustomersById(id);
   }

    @GetMapping("/getSortedBrand/{field}")
    public List<Brand_c> getSortedBrand(@PathVariable String field){
        return serviceClass.getAllBrandAfterSorting(field);
    }

   @GetMapping("/getEmployeeById/{id}")
   public List<Brand_c> getEmployeeById(@PathVariable int id){ return  serviceClass.getEmployeeById(id);

    }
    @GetMapping("/getCount/{id}")
    public Long getCount(@PathVariable int id){ return serviceClass.getCountOfEmployee(id);}

    @GetMapping("/getCountOfProduct/{id}")
    public Long getCountOfProduct(@PathVariable int id){ return serviceClass.getCountOfProduct(id);}
@GetMapping("/getCountOfEachBrand/{id}")
  public Map<String,Integer> getCountOfEachBrand(@PathVariable int id ){ return serviceClass.getCountOfEachBrand(id);}
}


