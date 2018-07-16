/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package charlie.advisor;

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
    
    static Play H = Play.HIT;
    static Play S = Play.STAY;
    static Play D = Play.DOUBLE_DOWN;
    static Play SP = Play.SPLIT;
    static Play N = Play.NONE;
    
    public BasicStrategy(){
        FillGreaterThan11();
        FillLessThanOrEqual11();
        FillSingleAce();
        FillEquals();
    }
    
    
    
    public void FillGreaterThan11(){     
                                      // 2  3  4  5  6  7  8  9 10  A
            Play[][] PlaySectionOne = { {S, S, S, S, S, S, S, S, S, S},   //17+
                                        {S, S, S, S, S, H, H, H, H, H},   //16
                                        {S, S, S, S, S, H, H, H, H, H},   //15
                                        {S, S, S, S, S, H, H, H, H, H},   //14
                                        {S, S, S, S, S, H, H, H, H, H},   //13
                                        {H, H, S, S, S, H, H, H, H, H} }; //12
            GreaterThan11.put("20", PlaySectionOne[0]);
            GreaterThan11.put("19", PlaySectionOne[0]);
            GreaterThan11.put("18", PlaySectionOne[0]);
            GreaterThan11.put("17", PlaySectionOne[0]);
            GreaterThan11.put("16", PlaySectionOne[1]);
            GreaterThan11.put("15", PlaySectionOne[2]);
            GreaterThan11.put("14", PlaySectionOne[3]);
            GreaterThan11.put("13", PlaySectionOne[4]);
            GreaterThan11.put("12", PlaySectionOne[5]);
        }
        
        public void FillLessThanOrEqual11(){
                                      // 2  3  4  5  6  7  8  9 10  A
            Play[][] PlaySectionTwo = { {D, D, D, D, D, D, D, D, D, H},   //11
                                        {D, D, D, D, D, D, D, D, H, H},   //10
                                        {H, D, D, D, D, H, H, H, H, H},   //9
                                        {H, H, H, H, H, H, H, H, H, H} }; //5-8    
            LessThanOrEqual11.put("11", PlaySectionTwo[0]);
            LessThanOrEqual11.put("10", PlaySectionTwo[1]);
            LessThanOrEqual11.put("9", PlaySectionTwo[2]);
            LessThanOrEqual11.put("8", PlaySectionTwo[3]);
            LessThanOrEqual11.put("7", PlaySectionTwo[3]);
            LessThanOrEqual11.put("6", PlaySectionTwo[3]);
            LessThanOrEqual11.put("5", PlaySectionTwo[3]);
        }
        
        public void FillSingleAce(){
                                        // 2  3  4  5  6  7  8  9 10  A
            Play[][] PlaySectionThree = { {S, S, S, S, S, S, S, S, S, S},  //A8-10
                                          {S, D, D, D, D, S, S, H, H, H},  //A,7
                                          {H, D, D, D, D, H, H, H, H, H},  //A,6
                                          {H, H, D, D, D, H, H, H, H, H},  //A,5
                                          {H, H, D, D, D, H, H, H, H, H},  //A,4
                                          {H, H, H, D, D, H, H, H, H, H},  //A,3
                                          {H, H, H, D, D, H, H, H, H, H} };//A,2
            SingleAce.put("A,10", PlaySectionThree[0]);
            SingleAce.put("A,9", PlaySectionThree[0]);
            SingleAce.put("A,8", PlaySectionThree[0]);
            SingleAce.put("A,7", PlaySectionThree[1]);
            SingleAce.put("A,6", PlaySectionThree[2]);
            SingleAce.put("A,5", PlaySectionThree[3]);
            SingleAce.put("A,4", PlaySectionThree[4]);
            SingleAce.put("A,3", PlaySectionThree[5]);
            SingleAce.put("A,2", PlaySectionThree[6]);
        }
        
        public void FillEquals(){
                                       // 2   3   4   5   6   7   8   9   10  A
            Play[][] PlaySectionFour = { {SP, SP, SP, SP, SP, SP, SP, SP, SP, SP}, //A,A 8,8
                                         {S,  S,  S,  S,  S,  S,  S,  S,  S,  S},  //10,10
                                         {SP, SP, SP, SP, SP, S,  SP, SP, S,  S},  //9,9
                                         {SP, SP, SP, SP, SP, SP, H,  H,  H,  H},  //7,7
                                         {SP, SP, SP, SP, SP, H,  H,  H,  H,  H},  //6,6
                                         {D,  D,  D,  D,  D,  D,  D,  D,  H,  H},  //5,5
                                         {H,  H,  H,  SP, SP, H,  H,  H,  H,  H},  //4,4
                                         {SP, SP, SP, SP, SP, SP, H,  H,  H,  H},  //3,3
                                         {SP, SP, SP, SP, SP, SP, H,  H,  H,  H} };//2,2
            Equals.put("A,A", PlaySectionFour[0]);
            Equals.put("8,8", PlaySectionFour[0]);
            Equals.put("10,10", PlaySectionFour[1]);
            Equals.put("9,9", PlaySectionFour[2]);
            Equals.put("7,7", PlaySectionFour[3]);
            Equals.put("3,3", PlaySectionFour[4]);
            Equals.put("2,2", PlaySectionFour[5]);
            Equals.put("6,6", PlaySectionFour[6]);
            Equals.put("5,5", PlaySectionFour[7]);
            Equals.put("4,4", PlaySectionFour[8]);
        }   
    
}
