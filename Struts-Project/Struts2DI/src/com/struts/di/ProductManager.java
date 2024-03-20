package com.struts.di;

import java.util.*;

public class ProductManager {
		private List<Product> products;
		 
		public ProductManager() {
			System.out.println("Creating new manager...");
			products = new LinkedList<Product>();
			System.out.println("Empty Product list generated");
		}
		 
		public void add(Product p) {
			products.add(p);
		}
		 
		public Product search(String name) {
			Product p = null;
			for (int i = 0; i < products.size(); i++) {
				if (products.get(i).getName().equals(name)) {
					p = products.get(i);
					break;
				}
			}
			return p;
		}
		 
		public void delete(String name) {
			Product p = search(name);
			if (p != null) {
				products.remove(p);
			}
		}
		 
		public List<Product> getProducts() {
			return products;
		}
		 
		public void setProducts(List<Product> products) {
			this.products = products;
		}
}