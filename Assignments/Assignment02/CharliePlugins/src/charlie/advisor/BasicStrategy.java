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
public class BasicStrategy{
    public HashMap<String, Play[]> GreaterThan11 = new HashMap();       
    public HashMap<String, Play[]> LessThanOrEqual11 = new HashMap();
    public HashMap<String, Play[]> SingleAce = new HashMap();
    public HashMap<String, Play[]> Equals = new HashMap();
    
    public BasicStrategy(){
        FillGreaterThan11();
        FillLessThanOrEqual11();
        FillSingleAce();
        FillEquals();
    }
    
    
    
    public void FillGreaterThan11(){
            Play[] PlaySectionOne = new Play[]{Play.STAY, Play.STAY, Play.STAY, 
                Play.STAY, Play.STAY, Play.STAY, Play.STAY, Play.STAY, Play.STAY, Play.STAY}; 
            GreaterThan11.put("20", PlaySectionOne);
            GreaterThan11.put("19", PlaySectionOne);
            GreaterThan11.put("18", PlaySectionOne);
            GreaterThan11.put("17", PlaySectionOne);
            PlaySectionOne = new Play[]{Play.STAY, Play.STAY, Play.STAY, Play.STAY, 
                Play.STAY, Play.HIT, Play.HIT, Play.HIT, Play.HIT, Play.HIT};
            GreaterThan11.put("16", PlaySectionOne);
            GreaterThan11.put("15", PlaySectionOne);
            GreaterThan11.put("14", PlaySectionOne);
            GreaterThan11.put("13", PlaySectionOne);
            PlaySectionOne = new Play[]{Play.HIT, Play.HIT, Play.STAY, Play.STAY, 
                Play.STAY, Play.HIT, Play.HIT, Play.HIT, Play.HIT, Play.HIT};
            GreaterThan11.put("12", PlaySectionOne);
        }
        
        public void FillLessThanOrEqual11(){
            Play[] PlaySectionTwo = new Play[]{Play.DOUBLE_DOWN, Play.DOUBLE_DOWN, 
                Play.DOUBLE_DOWN, Play.DOUBLE_DOWN, Play.DOUBLE_DOWN, Play.DOUBLE_DOWN, 
                    Play.DOUBLE_DOWN, Play.DOUBLE_DOWN, Play.DOUBLE_DOWN, Play.HIT};
            LessThanOrEqual11.put("11", PlaySectionTwo);
            PlaySectionTwo = new Play[]{Play.DOUBLE_DOWN, Play.DOUBLE_DOWN, Play.DOUBLE_DOWN, 
                Play.DOUBLE_DOWN, Play.DOUBLE_DOWN, Play.DOUBLE_DOWN, Play.DOUBLE_DOWN, 
                    Play.DOUBLE_DOWN, Play.HIT, Play.HIT};
            LessThanOrEqual11.put("10", PlaySectionTwo);
            PlaySectionTwo = new Play[]{Play.HIT, Play.DOUBLE_DOWN, Play.DOUBLE_DOWN, 
                Play.DOUBLE_DOWN, Play.DOUBLE_DOWN, Play.HIT, Play.HIT, Play.HIT, Play.HIT, Play.HIT};
            LessThanOrEqual11.put("9", PlaySectionTwo);
            PlaySectionTwo = new Play[]{Play.HIT, Play.HIT, Play.HIT, Play.HIT, 
                Play.HIT, Play.HIT, Play.HIT, Play.HIT, Play.HIT, Play.HIT};
            LessThanOrEqual11.put("8", PlaySectionTwo);
            LessThanOrEqual11.put("7", PlaySectionTwo);
            LessThanOrEqual11.put("6", PlaySectionTwo);
            LessThanOrEqual11.put("5", PlaySectionTwo);
        }
        
        public void FillSingleAce(){
            Play[] PlaySectionThree = new Play[]{Play.STAY, Play.STAY, Play.STAY, 
                Play.STAY, Play.STAY, Play.STAY, Play.STAY, Play.STAY, Play.STAY, Play.STAY};
            SingleAce.put("A,10", PlaySectionThree);
            SingleAce.put("A,9", PlaySectionThree);
            SingleAce.put("A,8", PlaySectionThree);
            PlaySectionThree = new Play[]{Play.STAY, Play.DOUBLE_DOWN, Play.DOUBLE_DOWN, 
                Play.DOUBLE_DOWN, Play.DOUBLE_DOWN, Play.STAY, Play.STAY, Play.HIT, Play.HIT, Play.HIT};
            SingleAce.put("A,7", PlaySectionThree);
            PlaySectionThree = new Play[]{Play.HIT, Play.DOUBLE_DOWN, Play.DOUBLE_DOWN, 
                Play.DOUBLE_DOWN, Play.DOUBLE_DOWN, Play.HIT, Play.HIT, Play.HIT, Play.HIT, Play.HIT};
            SingleAce.put("A,6", PlaySectionThree);
            PlaySectionThree = new Play[]{Play.HIT, Play.HIT, Play.DOUBLE_DOWN, Play.DOUBLE_DOWN, 
                Play.DOUBLE_DOWN, Play.HIT, Play.HIT, Play.HIT, Play.HIT, Play.HIT};
            SingleAce.put("A,5", PlaySectionThree);
            SingleAce.put("A,4", PlaySectionThree);
            PlaySectionThree = new Play[]{Play.HIT, Play.HIT, Play.HIT, Play.DOUBLE_DOWN, 
                Play.DOUBLE_DOWN, Play.HIT, Play.HIT, Play.HIT, Play.HIT, Play.HIT};
            SingleAce.put("A,3", PlaySectionThree);
            SingleAce.put("A,2", PlaySectionThree);
        }
        
        public void FillEquals(){
            Play[] PlaySectionFour = new Play[]{Play.SPLIT, Play.SPLIT, Play.SPLIT, 
                Play.SPLIT, Play.SPLIT, Play.SPLIT, Play.SPLIT, Play.SPLIT, Play.SPLIT, Play.SPLIT};
            Equals.put("A,A", PlaySectionFour);
            Equals.put("8,8", PlaySectionFour);
            PlaySectionFour = new Play[]{Play.STAY, Play.STAY, Play.STAY, Play.STAY, 
                Play.STAY, Play.STAY, Play.STAY, Play.STAY, Play.STAY, Play.STAY};
            Equals.put("10,10", PlaySectionFour);
            PlaySectionFour = new Play[]{Play.SPLIT, Play.SPLIT, Play.SPLIT, Play.SPLIT, 
                Play.SPLIT, Play.STAY, Play.SPLIT, Play.SPLIT, Play.STAY, Play.STAY};
            Equals.put("9,9", PlaySectionFour);
            PlaySectionFour = new Play[]{Play.SPLIT, Play.SPLIT, Play.SPLIT, Play.SPLIT, 
                Play.SPLIT, Play.SPLIT, Play.HIT, Play.HIT, Play.HIT, Play.HIT};
            Equals.put("7,7", PlaySectionFour);
            Equals.put("3,3", PlaySectionFour);
            Equals.put("2,2", PlaySectionFour);
            PlaySectionFour = new Play[]{Play.SPLIT, Play.SPLIT, Play.SPLIT, Play.SPLIT, 
                Play.SPLIT, Play.HIT, Play.HIT, Play.HIT, Play.HIT, Play.HIT};
            Equals.put("6,6", PlaySectionFour);
            PlaySectionFour = new Play[]{Play.DOUBLE_DOWN, Play.DOUBLE_DOWN, Play.DOUBLE_DOWN, 
                Play.DOUBLE_DOWN, Play.DOUBLE_DOWN, Play.DOUBLE_DOWN, Play.DOUBLE_DOWN, 
                    Play.DOUBLE_DOWN, Play.HIT, Play.HIT};
            Equals.put("5,5", PlaySectionFour);
            PlaySectionFour = new Play[]{Play.HIT, Play.HIT, Play.HIT, Play.SPLIT, 
                Play.SPLIT, Play.HIT, Play.HIT, Play.HIT, Play.HIT, Play.HIT};
            Equals.put("4,4", PlaySectionFour);
        }   
    
}
