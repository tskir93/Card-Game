/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.player;

import Model.card.Card;
import Model.card.Position;
import Modelnew.Card2;
import java.util.ArrayList;

/**
 *
 * @author Default
 */


public class Player 
{
    private String name;
    private int score;
    private boolean hasPlayed,finished;
    private Card2 cards[];
    private Card2 Card_to_play;
    private Position p1,p2,p3,p4;
    
    /**
     * 
     * @param name is the name of the player.
     */
    public Player(String name) 
    { 
        this.name = name;
        this.score=0;
        this.hasPlayed=false;
        Card cards[] = new Card [8];
        this.finished=false;
    }
    
   /**
    * <b>transformer(mutative)</b>: it sets the position of the pawn (pioni)  <br />
    * <b>postcondition</b>: the position has changed
    * @param pos the position of the pawn;
    */
   public void setPioni(Position pos){
       
   }
   
   /**
    * <b>transformer(mutative)</b>: it sets the turn of the players  <br />
    * <b>postcondition</b>: the turn is set
    * @param k the player who will play now;
    */
   public void setTurn(Player k){
       
   } 



   /**
    * <b>transformer(mutative)</b>: it sets the cards the player will have in his hand <br />
    * <b>postcondition</b>:cards list from empty now have 8 cards  
    * @param card the new card for the list;
    */
   public void setCards(Card cards[]){
   
   
   
            this.cards[0].setValue(420);
            this.cards[0].setIdiotita("paiktis1");
            this.cards[0].setImage("src\\resources\\images\\pionia\\arch.jpg");
            
   
            this.cards[1].setValue(420);
            this.cards[1].setIdiotita("paiktis2");
            this.cards[1].setImage("src\\resources\\images\\pionia\\theseus.jpg");
          
   
   
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
