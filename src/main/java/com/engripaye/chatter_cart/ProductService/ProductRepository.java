package com.engripaye.chatter_cart.ProductService;

import com.engripaye.chatter_cart.UserService.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {


}
