package com.struts.di;

import java.util.List;
import com.opensymphony.xwork2.inject.Inject;
 
public   class ListProductAction {
 
@Inject("man")// requires setter 
private ProductManager manager; 
private List<Product> productList;
 
public  String execute() {
setProductList(manager.getProducts());
return "success";
}
 
public  ProductManager getManager() {
 return  manager;
}
 
public void  setManager(ProductManager manager) {
this.manager = manager;
}
 
public  List<Product> getProductList() {
 return  productList;
}
 
public void setProductList(List<Product> productList) {
 this.productList = productList;
}
}