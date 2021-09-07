/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelnew;

import Model.card.Card;
import Model.card.Position;
import Modelnew.Card2;
import java.util.ArrayList;

/**
 *
 * @author Default
 */


public class player2 
{
    private String name;
    private int score;
    private boolean hasPlayed,finished;
    private int potition1;
    private int potition2;
    private int potition3;
    private int potition4;
    private String idiotita;
    private String image;
    
    /**
     * 
     * @param name is the name of the player.
     */
    public player2() 
    { 
        this.potition1 = potition1;
        this.potition2 = potition2;
        this.potition3 = potition3;
        this.potition4 = potition4;
        
        this.name = name;
        this.score=0;
        this.idiotita = idiotita;
        this.image = image;
        this.hasPlayed=false;
        this.finished=false;
    }
    
   /**
    * <b>transformer(mutative)</b>: it sets the position of the pawn (pioni)  <br />
    * <b>postcondition</b>: the position has changed
    * @param pos the position of the pawn;
    */
   public void setPioni1(int x,String image){
       this.image = image;
       this.potition1 = x;
        
   }
   public void setPioni2(int x,String image){
       this.image = image;
       this.potition2 = x;
        
   }
   public void setPioni3(int x,String image){
       this.image = image;
       this.potition3 = x;
        
   }
   public void setPioni4(int x,String image){
       this.image = image;
       this.potition4 = x;
        
   }
   
   
   public int getPioni1(){
       return this.potition1;
   }
   public int getPioni2(){
       return this.potition2;
   }
   public int getPioni3(){
       return this.potition3;
   }
   public int getPioni4(){
       return this.potition4;
   }
   public String getPioniImage(){
       return this.image;
   }
   
   /**
    * <b>transformer(mutative)</b>: it sets the turn of the players  <br />
    * <b>postcondition</b>: the turn is set
    * @param k the player who will play now;
    */
   public void setTurn(player2 k){
       
   } 



   /**
    * <b>transformer(mutative)</b>: it sets the cards the player will have in his hand <br />
    * <b>postcondition</b>:cards list from empty now have 8 cards  
    * @param card the new card for the list;
    */
   public void setCards(Card cards[]){
   
   
   
            
          
   
   
   }
     
   /**
    * <b>accessor(selector)</b>:Returns the name of the player <br />
    * 
    * <p><b>Postcondition:</b> returns the name of the player </p>
    *
    * @return the the name of the player
    */
   
    
   
   
   
   
   
   public String getName() 
   {
        return name;
   }

   
   /**
    * <b>transformer(mutative)</b>: sets the name of the player to newName <br />
    * <p><b>Postcondition:</b> the name of this player is changed to newName</p>
    *
    * @param newName the new name of the player
    * 
    */ 
   public void setName(String newName) 
   {
        this.name = newName;
   }
 
   
    /**
    * <b>transformer(mutative)</b>: set a card who wants a player to play  to setCard_to_play <br />
    * 
    */ 
   
   
   public void setCard_to_play(Card k)
   {
      //this.Card_to_play = k; 
   }
   
 

   /**
    * <b>transformer(mutative)</b>: sets the variable has_played to true
    * <p><b>Postcondition:</b>  sets the variable has_played to true</p>
    */ 

   public void Played()
   {
        hasPlayed = true;
   }
   
   
   /**
    * <b>transformer(mutative)</b>: Sets the variable has_finished to true
    * <p><b>Postcondition:</b>  sets the variable has_finished to true</p>
    */ 
   public void has_finished()
   {
       this.finished = true;
   }
   
   
    
   /**
    * <b>Observer</b>:Returns if a player has finished the game(partida)<br />
    * 
    * <p><b>Postcondition:</b> Returns if a player has finished the game(partida) </p>
    *
    * @return true if a player has finished the game , false otherwise
    */
   public boolean Get_has_finished()
   {
        return this.finished;
   }

}
