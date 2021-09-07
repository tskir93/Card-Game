/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.card.Card;
import Model.card.Stoiva;
import Model.player.Player;

/**
 *
 * @author Default
 */
public class Controller {
    private int fold, points,score;
    private boolean notstarted,empty_table,new_round,CardsHasPlayed;
    private Player p1,p2;
    private Stoiva allcards = new Stoiva();
   
    
    
    
    public Controller(){
        Player p1 = new Player("p1");
        Player p2 = new Player("p2");
    }
    
    
    
    /**
     * <b>transformer(mutative)</b>: sets the variable not_started to false
     * <p><b>Postcondition:</b>  sets the variable not_started to false</p>
     */ 
    public void set_started()
    {
        this.notstarted=false;
    }
    

    
    /**
     * <b>transformer(mutative):</b> increases the variable isready by 1(isready++)
     * <p><b>Postcondition:</b>  increases the variable isready by 1(isready++)</p>
     */ 
    public void isready()
    {
        
    }
    
    
    
    
    /**
     * <b>transformer(mutative)</b>: sets the score of a game after the game has finished
     * <p><b>Postcondition:</b>  sets the score of a game after the game has finished </p>
     */ 
    public void setScore()
    {
        
    }
    
  
   /**
    * <b>accessor(selector)</b>:Returns the score of the game <br />
    * <p><b>Postcondition:</b> returns the score of the game </p>
    * @return the number of players which are ready for dealing the last 6 cards
    */
    public int GetScore()
    {
        return score;
    }
    
    
    /**
    * <b>transformer(mutative)</b>: initializes players cards in the beginning
    * <p><b>Postcondition:</b> initializes players cards in the beginning </p>
    */ 
    public void init_player_cards()
    {
       
    }
    
    
   /**
    * <b>transformer(mutative)</b>: initializes some things ( allcards,board,stoiva) for a new game
    * <p><b>Postcondition:</b>  initializes some things(allcards,board,stoiva) for a new game</p>
    */ 
    public void init_table()
    {
          
    }
    
    /**
    * <b>Observer</b>:Return true if a game has finished, false otherwise
    * <p><b>Postcondition:</b> return true if a game has finished, false otherwise
    * </p>
    * @return true if a game has finished, false otherwise
    */
    public boolean game_has_finished()
    {
       
        return false;
    }
}
