package Com.cybage.service;

import java.util.List;

import Com.cybage.model.Product;

public interface ProductService {
	Product getProductById(int productId);
	void addProduct(Product product);
	List<Product> getAllProduct();
	void deleteProduct(int productId);


}
