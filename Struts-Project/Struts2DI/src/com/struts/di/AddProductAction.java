package com.struts.di;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.inject.Inject;

public class AddProductAction extends ActionSupport {
		@Inject("man")
		private ProductManager manager;
		private Product product;
		
		public String execute() {
			manager.add(product);
			return SUCCESS;
		}
		
		public ProductManager getManager() {
			return manager;
		}
		 
		// This method is used for Injecting Object
		public void setManager(ProductManager manager) {
			this.manager = manager;
		}
		 
		public Product getProduct() {
			return product;
		}
		 
		public void setProduct(Product product) {
			this.product = product;
		}
}