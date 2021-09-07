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
public class Minotaur extends SpecialCard{
    private int value;
    private CardType type;
    
    public Minotaur(CardType type){
        super(-2,"Minotaur");
        this.setType(type);
    }
    
}
