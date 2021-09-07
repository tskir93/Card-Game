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
public class Ariadne extends SpecialCard{
    private int value;
    private CardType type;
    
    public Ariadne(CardType type){
        super(2,"Ariadne");
        this.setType(type);
    }
}
