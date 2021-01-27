package com.mycompany.product;
import com.mycompany.product.Product;

public class Book extends Product{
    
    @Override
    public String orderAction(){
	return "BookOrderAction, RoyaltyOrderAction";
    }


}
