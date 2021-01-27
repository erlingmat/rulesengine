package com.mycompany.product;
import com.mycompany.product.Product;

public class MembershipUpgrade extends Product{
    
    @Override
    public String orderAction(){
	return "MembershipUpgradeAction, MembershipUpgradeEmail";
    }


}
