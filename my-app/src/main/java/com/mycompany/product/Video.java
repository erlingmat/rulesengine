package com.mycompany.product;
import com.mycompany.product.Product;

public class Video extends Product{
    private String title = "The best movie";
    @Override
    public String orderAction(){
	String action = "PackingslipAction, RoyaltyOrderAction";
	if (this.title == "Learning to Ski") {
	    action += "PackingFirstAid";
	}
	return action;
    }


}
