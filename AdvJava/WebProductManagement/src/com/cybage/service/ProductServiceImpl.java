package com.cybage.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.cybage.model.Product;

import utility.JDBCUtility;

public class ProductServiceImpl implements IProductService {
	
	public Product getProductById(int productId) {
		Connection connection=JDBCUtility.getConnection();
		Product product = null;
	   try {
		PreparedStatement preparedStatement=connection.prepareStatement("select * from product where id=?");
	           preparedStatement.setInt(1,productId );
	     ResultSet resultSet=preparedStatement.executeQuery();
	          
	        	   int id=  resultSet.getInt(1);
	        	  String name= resultSet.getString(2);
	              int price=   resultSet.getInt(3);
	              product=new Product(id, name, price);
	              connection.close();
	              return product;
	   } catch (SQLException e) {
		
		e.printStackTrace();
	}
    return product;
	}

	public void addProduct(Product product) {
		Connection connection=JDBCUtility.getConnection();
		try {
		PreparedStatement preparedStatement=connection.prepareStatement("insert into product values(?,?,?)");
			  preparedStatement.setInt(1, product.getId());
			  preparedStatement.setString(2, product.getName());
			  preparedStatement.setInt(3, product.getPrice());
			  preparedStatement.execute();
			  connection.close();
			  System.out.println("product inserted successfully");
			  
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

	public List<Product> getAllProduct() {
		Connection connection=JDBCUtility.getConnection();
		List<Product> products=new ArrayList<Product>();
		
		Product product = null;
		   try {
			PreparedStatement preparedStatement=  connection.prepareStatement("select * from product");
		          
		     ResultSet resultSet=preparedStatement.executeQuery();
		          
		     while(resultSet.next()) {
		        	   int id=  resultSet.getInt(1);
		        	  String name= resultSet.getString(2);
		              int price=   resultSet.getInt(3);
		              product=new Product(id, name, price);
		              products.add(product);
		              
		     }
		              connection.close();
		              return products;
		            
		   } catch (SQLException e) {
			
			e.printStackTrace();
		}
		return products;
		
		
	}

	public void deleteProduct(int productId) {
		Connection connection=JDBCUtility.getConnection();
		Product product = null;
		   try {
			PreparedStatement preparedStatement=  connection.prepareStatement("delete from product where id=?");
		           preparedStatement.setInt(1,productId );
		     boolean isDeleted=preparedStatement.execute();
		          
//		        	 if(isDeleted)
//		        	 {
//		        		 System.out.println("Product deleted successfully");
//		        	 }
//		        	 else
//		        	 {
//		        		 System.out.println("product not present in product table");
//		        	 }
		              connection.close();
		             
		   } catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}

}
