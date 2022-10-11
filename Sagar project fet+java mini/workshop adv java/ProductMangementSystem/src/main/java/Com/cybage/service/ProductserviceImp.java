package Com.cybage.service;

import java.util.List;

import Com.cybage.dao.ProductDAO;
import Com.cybage.dao.ProductDAOImp;
import Com.cybage.model.Product;

public class ProductserviceImp implements ProductService {
   
	
	public Product getProductById(int productId) {
		ProductDAO dao=new ProductDAOImp();
	return dao.getProductById(productId);
		
	}

	public void addProduct(Product product) {
		ProductDAO dao=new ProductDAOImp();
		dao.addProduct(product);
	}

	public List<Product> getAllProduct() {
		ProductDAO dao=new ProductDAOImp();
		 return dao.getAllProduct();
		
	}

	public void deleteProduct(int productId) {
		ProductDAO dao=new ProductDAOImp();
		dao.deleteProduct(productId);
		
	}

}
