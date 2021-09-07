/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.card;

/**
 *
 * @author Default
 */
public interface Card {
    
    
     /**
     * <b>Accessor:</b> returns the card's value
     * <b>Postcondition:</b> card's value has been returned
     * @return int value
     */
    public int getValue();
    
    /**
     * <b>Transformer:</b> sets the card's value
     * <b>Postcondition:</b> card's value has been set
     * @param int value
     */
    public void setValue(int value);
    
    /**
     * <b>accessor(selector)</b>:Returns the points of a card <br />
     * <p><b>Postcondition:</b> the points of a card have been returned</p>
     *
     *@return the points of a card
     */
    public int getPoints();
    
    /**
     * <b>transformer(mutative)</b>: sets the points of a card <br />
     * <p><b>Postcondition:</b> the points of a card have been set</p>
     *
     * @param int points
     * 
     */ 
    public void setPoints(int points);
    
     /**
     * Returns the string representation of a card
     * <p><b>Postcondition:</b> The string representation of a card is returned</p>
     * @return The string representation of a card 
     */
    @Override
    public String toString();
}
