package Com.cybage.dao;

import java.util.List;

import Com.cybage.model.Product;

public interface ProductDAO {
	Product getProductById(int productId);
	void addProduct(Product product);
	List<Product> getAllProduct();
	void deleteProduct(int productId);

}
