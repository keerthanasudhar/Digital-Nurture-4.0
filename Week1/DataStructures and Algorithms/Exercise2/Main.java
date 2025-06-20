package dsa;

import java.util.Arrays;
import java.util.Comparator;

		public class Main {
		    public static void main(String[] args) {
		        Product[] products = {
		            new Product(101, "Shoes", "Footwear"),
		            new Product(102, "T-shirt", "Clothing"),
		            new Product(103, "Watch", "Accessories"),
		            new Product(104, "Laptop", "Electronics"),
		        };

		        // Binary search requires sorted array
		        Arrays.sort(products, Comparator.comparing(Product::getProductName));

		        // Linear Search
		        Product result1 = SearchingUtility.linearSearch(products, "Watch");
		        System.out.println("Linear Search Result: " + (result1 != null ? result1 : "Not Found"));

		        // Binary Search
		        Product result2 = SearchingUtility.binarySearch(products, "Watch");
		        System.out.println("Binary Search Result: " + (result2 != null ? result2 : "Not Found"));


	}

}