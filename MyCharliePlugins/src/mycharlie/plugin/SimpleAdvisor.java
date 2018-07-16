package mycharlie.plugin;


import charlie.card.Card;
import charlie.card.Hand;
import charlie.plugin.IAdvisor;
import charlie.util.Play;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Anirudh
 */
public class SimpleAdvisor implements IAdvisor {

    public boolean isValied(Hand myHand, Card upCard){
        if (upCard.value()!=0 && myHand.getValue()!=0 && myHand.size()==2 && myHand.getValue()<21 && myHand.getValue()>0){
            return true;
        }
        else
            return false;
    }
    @Override
    public Play advise(Hand myHand, Card upCard) {
        
        
        //Implementing Rules
        
        //Rule #1

        if((myHand.getCard(0).isAce() && myHand.getCard(1).isAce()) || (myHand.getCard(0).value()==8 && myHand.getCard(1).value()==8)) {
            return Play.SPLIT;
        }
        
        //Rule #2
        else if(myHand.getValue()>=17){
            return Play.STAY;
        }
        
        //Rule #3
        else if(myHand.getValue()<=10){
            return Play.HIT;
        }
        
        //Rule #4
        else if(myHand.getValue()==11){
            return Play.DOUBLE_DOWN;
        }
        
        //Rule #5
        else if((myHand.getValue()>=12 && myHand.getValue()<=16) && ((upCard.value()+10)<=16)){
            return Play.STAY;
        }
        
        //Rule #6
        else if((myHand.getValue()>=12 && myHand.getValue()<=16) && ((upCard.value()+10)>16)){
            return Play.HIT;
        }
        
        else
            return Play.NONE;
    }

    
}
