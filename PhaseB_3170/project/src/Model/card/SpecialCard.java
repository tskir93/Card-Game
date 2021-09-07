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
public class SpecialCard implements Card{
    private int value,points;
    private CardType type;
    private String name;
    
    /**Constructor.
     * 
     * <b>Postcondition</b>Creates a new multiset with 'value' value, 'points' points and 'type' type.
     *
     * @param value
     * @param points
     * @param type
     */
    public SpecialCard (int value,String name){
        this.value = value;
        this.name = name;
    }
    
    
    /**
     * <b>Transformer:</b> sets the card's type
     * <b>Postcondition:</b> the card's type has been set
     * @param String type
     */
    public void setType(CardType type) 
    {
        this.type = type;
    }

    
    /**
     * <b>Accessor:</b> returns the card's type
     * <b>Postcondition:</b> the card's color has been returned
     * @return cards type
     */
    public CardType getType() 
    {
         return this.type;
    }
    
    

    
    @Override
    public int getValue() {
        return value;
    }

    @Override
    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public int getPoints() {
        return points;
    }

    @Override
    public void setPoints(int points) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override
    public String toString()
    {
         return this.type.toString();
    }
    
}
