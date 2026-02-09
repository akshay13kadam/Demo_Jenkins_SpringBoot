package com.io.jenkins;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@Autowired
	public ProductService productService;
//	
//	@Autowired
//	public ProductRepository productRepository;
	
//	
	@GetMapping("/home")
	public String home() {

		return "Welcome to first demo page";

	}
	
	
	@GetMapping("/products/")
	public List<Product> getProduct() {

		return productService.getProducts();

	}
	
	@GetMapping("/product/")
	public List<Product> getProducts() {
		
		return productService.getProduct();

	}
	
	
	@GetMapping("/products/{id}")
	public Product getProductById(@PathVariable int id) {
			
		return productService.getProductById(id);

	}
	
	
	
	 @DeleteMapping("/products/{id}")
	    public String deleteProduct(@PathVariable int id) {
	        return productService.deleteProduct(id);
	    }
	 
	   @PutMapping
	    public Product updateProduct(@RequestBody Product product) {
	        return productService.updateProduct(product);
	    }
	 
	//id->deleteid->updatebyid
	
	
//	@RequestMapping(value="/products",method = RequestMethod.GET)
//	public List<Product> createProduct() {
//		
////		Product p=new Product();
//
//		return productRepository.getProducts();
//
//	}

	
	
}
