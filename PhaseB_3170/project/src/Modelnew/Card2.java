/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelnew;



/**
 *
 * @author Default
 */
public class Card2 {
    private int value;
    private String idiotita;
    private String image;
    
    public Card2(){
        this.value = value;
        this.idiotita = idiotita;
        this.image = image;
    }
    

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
     /**
     * <b>Accessor:</b> returns the card's value
     * <b>Postcondition:</b> card's value has been returned
     * @return int value
     */
    public int getValue(){
        return this.value;
    };
    
    /**
     * <b>Transformer:</b> sets the card's value
     * <b>Postcondition:</b> card's value has been set
     * @param int value
     */
    public void setValue(int value){
        this.value = value;
    };
    
    /**
     * <b>accessor(selector)</b>:Returns the points of a card <br />
     * <p><b>Postcondition:</b> the points of a card have been returned</p>
     *
     *@return the points of a card
     */
    public String getIdiotita(){
        return this.idiotita;
    };
    
    /**
     * <b>transformer(mutative)</b>: sets the points of a card <br />
     * <p><b>Postcondition:</b> the points of a card have been set</p>
     *
     * @param int points
     * 
     */ 
    public void setIdiotita(String points){
        this.idiotita = points;
    };
    
    
}

