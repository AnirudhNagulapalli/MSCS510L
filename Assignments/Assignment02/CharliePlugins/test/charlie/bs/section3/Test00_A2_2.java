/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package charlie.bs.section3;

import charlie.advisor.advisor;
import charlie.card.Card;
import charlie.card.Hand;
import charlie.card.Hid;
import charlie.dealer.Seat;
import charlie.util.Play;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Anirudh
 */
public class Test00_A2_2 {
    
    public Test00_A2_2() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void hello() {
        Hid hid = new Hid(Seat.NONE);
        
        Hand myHand = new Hand(hid);
        
        Card Card1 = new Card(Card.ACE, Card.Suit.HEARTS);
        Card Card2 = new Card(4, Card.Suit.SPADES);
        Card upCard = new Card(4, Card.Suit.DIAMONDS);
        
        myHand.hit(Card1);
        myHand.hit(Card2);
        
        advisor Strategy = new advisor();
        Play result = Strategy.advise(myHand, upCard);
        
        Assert.assertEquals(Play.DOUBLE_DOWN, result);
    }
}
