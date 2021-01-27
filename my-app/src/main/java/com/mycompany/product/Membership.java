package com.mycompany.product;
import com.mycompany.product.Product;

public class Membership extends Product{
    
    @Override
    public String orderAction(){
	return "MembershipActivationAction, MembershipActivationEmail";
    }


}
