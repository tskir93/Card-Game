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
public class Position {
    private CardType Anak_anoikei;
    private int score;
    
    Position(CardType k,int score){
        this.score = score;
        this.Anak_anoikei = k;
    }
    public int getScore(){
        return score;
    }
    
    /**
     * <b>Transformer:</b> sets the score for each position.
     * <b>Postcondition:</b> the score  has been set
     * @param int score
     */
    
    public void setScore(int scor){
        this.score = scor;
    }
    
    
    /**
     * <b>Transformer:</b> sets the road type.
     * <b>Postcondition:</b> the road type has been set
     * @param CardType anak
     */
    public void setPositionType(CardType anak){
        this.Anak_anoikei = anak;
    }
    
    
    /**
     * <b>Accessor:</b> returns the road type
     * <b>Postcondition:</b> the road type has been returned
     * @return road type
     */
    public CardType getPositionType(){
        return Anak_anoikei;
    }
    
    
}
