/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.card;

import java.util.ArrayList;

/**
 *
 * @author Default
 */


public class Stoiva {
     private ArrayList<Card> cards;
     
      /**Constructor.
     * 
     * <b>Postcondition</b>Creates a new Stoiva with a new card ArrayList.
     *
     */
     public Stoiva(){
         cards = new ArrayList < Card > ();
     }
     
     
     /**
     * <b>Transformer:</b> Initializes and shuffles the cards.
     * <b>Postcondition:</b> The cards have been initialised and shuffled.
     */
     
     public void init_cards(){
     
     }
     
     /**
     * <b>Observer:</b> Returns true if this list contains no elements.
     * <b>Postcondition:</b> Returns true if this list contains no elements.
     * @return true if this list contains no elements
     */
     public boolean isEmpty()                                                           
    {
        return false;
    }
     
   
     
     /**
     * <b>Transformer:</b> Removes a card from the list.
     * <b>Postcondition:</b> A card has been removed from the list.
     * @param i
     */
    public void get_card_from_stoiva(Card i)
    {
        
    }
    
    
    /**
     * <b>Transformer:</b> Returns the size of a list.
     * <Postcondition:</b> The size of the list has been returned.
     * @return size of the list
     */
    public int size()
    {
        return cards.size();
    }
    
    
}
