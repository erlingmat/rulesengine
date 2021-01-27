package com.mycompany.app;

import com.mycompany.product.*;
import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertEquals;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void PhysicalProductShouldGeneratePacking() {
	Book thisBook = new Book();
	String actionList = thisBook.orderAction();
	assertEquals(actionList, "PackingslipAction, RoyaltyOrderAction");
	
    }
    @Test
    public void VideoProductShouldGeneratePacking () {
	Video thisVideo = new Video();
	String actionList = thisVideo.orderAction();
	assertEquals(actionList, "PackingslipAction");
    }
    @Test
    public void VideoLearningToSkiShouldGenerateAdditionalPacking() {
	Video thisVideo = new Video();
	thisVideo.title = "Learning to Ski";
	String actionList = thisVideo.orderAction();
	assertEquals(actionList, "PackingslipAction, PackingFirstAid");
    }
    @Test
    public void MembershipShouldActivateAndSendEmail() {
	Membership thisMembership = new Membership();
	String actionList = thisMembership.orderAction();
	assertEquals(actionList, "MembershipActivationAction, MembershipActivationEmail");
    }
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }
}
