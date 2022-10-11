package Com.cybage.pms;

import java.util.List;
import java.util.Scanner;

import Com.cybage.dao.ProductDAO;
import Com.cybage.dao.ProductDAOImp;
import Com.cybage.model.Product;
import Com.cybage.service.ProductService;
import Com.cybage.service.ProductserviceImp;

public class ProductMain {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ProductService productService;
		ProductDAO productDao;
		
		while(true)
		{
			System.out.println("****** Welcome*****");
			System.out.println("Select Operation From Following...!! /n");
			System.out.println("1.Add Product");
			System.out.println("2.Get All Product");
			System.out.println("3.Delete Product by id");
			System.out.println("4.Quit from application");
			System.out.println("*******************");
			System.out.println("Enter Choice: ");
			int choice=sc.nextInt();
			switch (choice) {
			case 1:System.out.println("Enter Product ID:");
			int id=sc.nextInt();
			System.out.println("Enter Product Name:");
			String name=sc.next();
			System.out.println("Enter Product Price");
			int price=sc.nextInt();
			Product product=new Product(id, name, price);
			productService=new ProductserviceImp();
			productService.addProduct(product);
			break;

			case 2:
				productService=new ProductserviceImp();
				List<Product> products=productService.getAllProduct();
				for(Product p:products)
				{
					System.out.println(p);
				}

				break;
			case 3:
				System.out.println("Enter Product Id to delete:");
				int id1=sc.nextInt();
				productService=new ProductserviceImp();
				productDao=new ProductDAOImp();
				
				Product product1=productDao.getProductById(id1);
				String productName=product1.getName();
				
//				Product product1=productService.getProductById(id1);
//				String productName=product1.getName();
			    System.out.println("Deleted product is:"+productName);
				productService.deleteProduct(id1);
				
				break;
			case 4:
                      System.exit(0);
				break;

			default:
				break;
			}

		}

	}

}
