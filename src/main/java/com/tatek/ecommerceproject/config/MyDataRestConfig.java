package com.tatek.ecommerceproject.config;//Created on: #6/23/2021

import com.tatek.ecommerceproject.entity.Product;
import com.tatek.ecommerceproject.entity.ProductCategory;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;
import org.springframework.http.HttpMethod;

//Author Tatek Ahmed
@Configuration
public class MyDataRestConfig implements RepositoryRestConfigurer {

    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config){

        HttpMethod[] theUnsupportedActions = { HttpMethod.DELETE, HttpMethod.POST, HttpMethod.PUT};

        //disabling listed Http methods for product
        config.getExposureConfiguration ()
                .forDomainType (Product.class)
                .withItemExposure ((metdata, httpMethods) -> httpMethods.disable (theUnsupportedActions))
                .withCollectionExposure ((metdata, httpMethods) -> httpMethods.disable (theUnsupportedActions));

        //disabling listed Http methods for product category
        config.getExposureConfiguration ()
                .forDomainType (ProductCategory.class)
                .withItemExposure ((metdata, httpMethods) -> httpMethods.disable (theUnsupportedActions))
                .withCollectionExposure ((metdata, httpMethods) -> httpMethods.disable (theUnsupportedActions));
    }
}
