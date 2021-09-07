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
public class SimpleCard implements Card{
    private CardType type;
    private int value;
    private int points;
        
    
    
    
    public SimpleCard(CardType type, int value){
        this.type = type;
        this.value = value;
        
    }
    
    public CardType getType(){
        return type;
    }
   
    public void setType(CardType type){
        this.type = type;
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
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void setPoints(int points) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    @Override
    public String toString(){
        return this.value + "(" + type.toString() + ")";
    }
}
