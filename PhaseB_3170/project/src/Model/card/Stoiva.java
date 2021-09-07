/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model.card;

//import static Model.card.CardType;
import static Model.card.CardType.FESTOS;
import static Model.card.CardType.KNOSSOS;
import static Model.card.CardType.MALIA;
import static Model.card.CardType.ZAKROS;
import java.util.Random;
import java.util.Arrays;
//
//import java.util.ArrayList;

/**
 *
 * @author Default
 */


public class Stoiva {
     private Card [] c = new Card[80];
     
      /**Constructor.
     * 
     * <b>Postcondition</b>Creates a new Stoiva with an array of all cards.
     *
     */
     public Stoiva(){
        // c = new ArrayList < Card > ();
        int i ;
        for(i=0;i<10;i++){
            c[i] = new SimpleCard(KNOSSOS,i+1);
            c[i+10] = new SimpleCard(KNOSSOS,i+1);
        }
        for(i=20;i<30;i++){
            c[i] = new SimpleCard(MALIA,i+1);
            c[i+10] = new SimpleCard(MALIA,i+1);
        }
        for(i=40;i<50;i++){
            c[i] = new SimpleCard(FESTOS,i+1);
            c[i+10] = new SimpleCard(FESTOS,i+1);
        }
        for(i=60;i<70;i++){
            c[i] = new SimpleCard(ZAKROS,i+1);
            c[i+10] = new SimpleCard(ZAKROS,i+1);
        }
        for(i=80;i<83;i++){
             c[i] = new Ariadne(KNOSSOS);
        }
        for(i=83;i<86;i++){
             c[i] = new Ariadne(MALIA);
        }
        for(i=86;i<89;i++){
             c[i] = new Ariadne(FESTOS);
        }
        for(i=89;i<92;i++){
             c[i] = new Ariadne(ZAKROS);
        }
        for(i=92;i<94;i++){
            c[i] = new Minotaur(KNOSSOS);
        }
        for(i=94;i<96;i++){
            c[i] = new Minotaur(MALIA);
        }
        for(i=96;i<98;i++){
            c[i] = new Minotaur(FESTOS);
        }
        for(i=98;i<100;i++){
            c[i] = new Minotaur(ZAKROS);
        }
     }
     
     /**
     * <b>Transformer:</b> Helping function to make the shuffle of the array 
     * <b>Postcondition:</b> The cards have been shuffled.
     */
     
     public void randomize( Card c[], int n)
    {
        // Creating a object for Random class
        Random r = new Random();
         
        // Start from the last element and swap one by one. We don't
        // need to run for the first element that's why i > 0
        for (int i = n-1; i > 0; i--) {
             
            // Pick a random index from 0 to i
            int j = r.nextInt(i);
             
            // Swap arr[i] with the element at random index
            Card temp = c[i];
            c[i] = c[j];
            c[j] = temp;
        }
        
    }
     
     /**
     * <b>Transformer:</b> Initializes and shuffles the cards.
     * <b>Postcondition:</b> The cards have been initialised and shuffled.
     */
     
     public void init_cards(){
         int n = c.length;
         randomize (c , n);
     }
     
     /**
     * <b>Observer:</b> Returns true if this list contains no elements.
     * <b>Postcondition:</b> Returns true if this list contains no elements.
     * @return true if this list contains no elements
     */
     public boolean isEmpty()                                                           
    {
        int i=0;
        int k=0;
        while(i!=99){
            if(c[i] != null ){
                i++;
                k++;
                break;
            }
           i++;   
        }
        if(k!=0){
            return false;
        }else{
            return true;
        }
        
    }
     
   
     
     /**
     * <b>Transformer:</b> Removes a card from the array of cards.
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
    //public int size()
   // {
  //      return c.size();
  //  }
    
    
}
