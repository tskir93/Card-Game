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
public class FindingPosition extends Position{
    private Finding evrima;

    public FindingPosition(CardType k, int score) {
        super(k, score);
    }
    
    
    
    /**
     * <b>Accessor:</b> returns the finding which is in this position
     * <b>Postcondition:</b> the finding has been returned
     * @return evrima
     */
    public Finding getEvrima(){
        return evrima;
    }
    
    /**
     * <b>Accessor:</b> returns if the finding is available
     * <b>Postcondition:</b> the availability has been returned
     * @return evrima.getAvailable();
     */
    public boolean isAvailable(){
        return evrima.getAvailable();
    }
}
