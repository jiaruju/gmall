package com.atguigu.gmall.pms;

import com.atguigu.gmall.pms.entity.Brand;
import com.atguigu.gmall.pms.entity.Product;
import com.atguigu.gmall.pms.service.BrandService;
import com.atguigu.gmall.pms.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
class GmallPmsApplicationTests {

    @Autowired
    ProductService productService;

    @Autowired
    BrandService brandService;

    @Test
    void contextLoads() {

        Product product = productService.getById(1);
        System.out.println(product.getName());
    }

    @Test
    void test(){

//        Brand brand = new Brand();
//        brand.setName("哈哈哈");
//        brandService.save(brand);
//
//        System.out.println("保存成功......");

        Brand brand = brandService.getById(53);
        System.out.println("查询成功...."+brand.getName());
    }

}
