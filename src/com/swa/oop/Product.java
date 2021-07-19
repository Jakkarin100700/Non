package com.swa.oop;

public class Product {
    private String productID;
    private String productName;

    Product(String p_id, String p_name){
      productID = p_id;
      productName = p_name;
    }

    public String getDetailProduct(){
      return "Product ID : "+productID+" and Product Name : "+productName;
    }

}
