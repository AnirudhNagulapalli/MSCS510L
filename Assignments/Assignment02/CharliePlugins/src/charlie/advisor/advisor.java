/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package charlie.advisor;
import charlie.card.Card;
import charlie.card.Hand;
import charlie.plugin.IAdvisor;
import charlie.util.Play;
import java.util.HashMap;
/**
 *
 * @author Anirudh
 */
public class advisor extends BasicStrategy implements IAdvisor {
    

    Play[] result;
    @Override
    public Play advise(Hand myHand, Card upCard) {
        Card myCard1 = myHand.getCard(0);               //1st Card
        Card myCard2 = myHand.getCard(1);               //2nd Card
        int MyTotal = myHand.getValue();                //Count (Card1+Card2)
        int DealerCard = upCard.value();                //Dealers Open Card
        
        if(myCard1!=myCard2){                           //If Cards are not same
            if(MyTotal>=12 && MyTotal<=20){             //If 11<Count<21
                String PlayerValue = Integer.toString(myHand.getValue());
                result = GreaterThan11.get(PlayerValue);        //Give Inputs to GreaterThan11 HashMap
            }
        
            else if(MyTotal>=5 && MyTotal<=11){         //If 4<Count<12
                String PlayerValue = Integer.toString(myHand.getValue());
                result = LessThanOrEqual11.get(PlayerValue);    //Give Inputs to LessThanOrEqual11 HashMap
            }
        }        
        if(myCard1.isAce() && !myCard2.isAce()){        //If 1st Card is an Ace
            //String PlayerValue = Integer.toString(myHand.getValue());
            result = SingleAce.get("A,"+Integer.toString(myCard2.value())); //Give Inputs as A, 2nd Card to SingleAce HashMap
        }
        else if(myCard2.isAce() && !myCard1.isAce()){   //If 2nd Card is an Ace
            //String PlayerValue = Integer.toString(myHand.getValue());
            result = SingleAce.get("A,"+Integer.toString(myCard1.value())); //Give Inputs as A, 1st Card to SingleAce HashMap
        }
        if(myCard1.equals(myCard2)){                    //If Cards are same
            //String PlayerValue = Integer.toString(myHand.getValue());
            result = Equals.get(myCard1+","+myCard2);   //Return both Cards to Equals HashMap      
        }
        
        if(upCard.isAce()){                             //If Dealers Card is an Ace
            //String DealerValue = "A";
            return result[9];                           //Returns Value for result[9] in result array
        }
        else{
            return result[upCard.value()-2];            //As array index starts from 0
        }
    }
    
    
}
