package com.io.jenkins;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

	@Autowired
	public ProductRepository productRepository;

	public List<Product> getProducts() {

		return productRepository.getProducts();
	}
	
	
	public List<Product> getProduct() {

		return productRepository.getProduct();
	}
	
	public Product getProductById(int id) {

		return productRepository.findById(id);
	}
	

	public String deleteProduct(int id) {
		productRepository.delete(id);
        return "product removed !! " + id;
    }

	
	  public Product updateProduct(Product product) {
	       return productRepository.update(product);
	    }
}
