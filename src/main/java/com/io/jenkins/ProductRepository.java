package com.io.jenkins;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.stereotype.Repository;

@Repository
public class ProductRepository {

	public List<Product> productList = new ArrayList<Product>();
	public List<Product> productList1 = new ArrayList<Product>();

	public List<Product> createProducts() {

		productList.add(new Product(1, "book", 10, 500));
		productList.add(new Product(2, "computer", 5, 50000));
		productList.add(new Product(3, "bike", 1, 100000));

		System.out.println("Product List create "+productList);
		return productList;
	}

	public List<Product> getProducts() {

		ProductRepository repo = new ProductRepository();
//		if(productList!=null)
		productList = repo.createProducts();//return list
		return productList;
	}

	public List<Product> getProduct() {
		 ProductRepository repo = new ProductRepository();
		    repo.createProduct(new Product(4, "phone", 20, 30000));
		    return repo.productList1;  // 
		
		
	}
	
	
	public void createProduct(Product product) {
		productList1.add(product);
		System.out.println("productList1" + productList1);
	    
	}
	
	 public Product findById(int id){
		 System.out.println("In product id");
	        for (int i = 0; i < productList.size(); i++) {
	            if (productList.get(i).getId() == (id)) {
	                return productList.get(i);
	            }
	        }
	        return null;
	    }


	 public String delete(Integer id) {

//		 productList.removeIf(x -> x.getId() == (id));
		
		List l= productList.stream().filter(x->x.getId()==(id)).collect(Collectors.toList()); // productList.get(0).getId();
		System.out.println("List  "+l);
	productList.remove(l.get(0));
		System.out.println("deleted "+l);
	        return null;
	    }
	 
	 public Product update(Product product) {
	        int idx = 0;
	        int id = 0;
	  
	        for (int i = 0; i < productList.size(); i++) {
	            if (productList.get(i).getId() == (product.getId())) {
	                id = product.getId();
	                idx = i;
	                break;
	            }

	        }
	        Product product1 = new Product();
	        product1.setId(id);
	        product1.setProductName(product.getProductName());
	        product1.setProductQunatity(product.getProductQunatity());
	        product1.setProductPrice(product.getProductPrice());
	        productList.set(idx, product);
	        return product1;
}
}
