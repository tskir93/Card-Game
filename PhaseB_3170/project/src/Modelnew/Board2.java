/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelnew;

import java.util.ArrayList;
import java.util.Collections;

public class Board2 {

    Card2 lastCardPlayed;
    ArrayList<Card2> gameCards = new ArrayList<Card2>();
    
    
    
    public ArrayList<Card2> getGameCards() {
        return gameCards;
    }

    public void setGameCards(ArrayList<Card2> gameCards) {
        this.gameCards = gameCards;
    }

    
    

    public void initCards() {
         
         
        int flag=0;
        
        for (int i = 1; i <= 10; i++) {
           
            Card2 card = new Card2();
            Card2 card2 = new Card2();
            Card2 card3 = new Card2();
            Card2 card4 = new Card2();
            
            card.setValue(i);
            card.setIdiotita("knossos");
            card.setImage("src\\resources\\images\\cards\\knossos" + (i) + ".jpg");
            gameCards.add(card);
            
            card2.setValue(i);
            card2.setIdiotita("malia");
            card2.setImage("src\\resources\\images\\cards\\malia" + (i) + ".jpg");
            gameCards.add(card2);
            
            card3.setValue(i);
            card3.setIdiotita("phaistos");
            card3.setImage("src\\resources\\images\\cards\\phaistos" + (i) + ".jpg");
            gameCards.add(card3);
            
            card4.setValue(i);
            card4.setIdiotita("zakros");
            card4.setImage("src\\resources\\images\\cards\\zakros" + (i) + ".jpg");
            gameCards.add(card4);
            
            if(i==10 && flag == 0){
                i=0;
                flag =1;
            }
            
//            System.out.println("karta :"+card.getImage());
//            System.out.println("karta :"+card2.getImage());
//            System.out.println("karta :"+card3.getImage());
//            System.out.println("karta :"+card4.getImage());
        }
        
        for (int k = 0; k <= 3; k++) {
            
            Card2 card5 = new Card2();
            card5.setValue(100);
            card5.setIdiotita("knossosAri");
            card5.setImage("src\\resources\\images\\cards\\knossosAri.jpg");
            gameCards.add(card5);
            
            
            Card2 card6 = new Card2();
            card6.setValue(100);
            card6.setIdiotita("zakrosAri");
            card6.setImage("src\\resources\\images\\cards\\zakrosAri.jpg");
            gameCards.add(card6);
            
            
            Card2 card7 = new Card2();
            card7.setValue(100);
            card7.setIdiotita("maliaAri");
            card7.setImage("src\\resources\\images\\cards\\maliaAri.jpg");
            gameCards.add(card7);
            
            
            Card2 card8 = new Card2();
            card8.setValue(100);
            card8.setIdiotita("phaistosAri");
            card8.setImage("src\\resources\\images\\cards\\phaistosAri.jpg");
            gameCards.add(card8);
        }
        
        for (int j = 0; j <= 3; j++) {
            
            Card2 card9 = new Card2();
            card9.setValue(408);
            card9.setIdiotita("knossosMin");
            card9.setImage("src\\resources\\images\\cards\\knossosMin.jpg");
            gameCards.add(card9);
            
            Card2 card10 = new Card2();
            card10.setValue(408);
            card10.setIdiotita("phaistosMin");
            card10.setImage("src\\resources\\images\\cards\\phaistosMin.jpg");
            gameCards.add(card10);
            
            Card2 card11 = new Card2();
            card11.setValue(408);
            card11.setIdiotita("maliaMin");
            card11.setImage("src\\resources\\images\\cards\\maliaMin.jpg");
            gameCards.add(card11);
            
            Card2 card12 = new Card2();
            card12.setValue(408);
            card12.setIdiotita("zakrosMin");
            card12.setImage("src\\resources\\images\\cards\\zakrosMin.jpg");
            gameCards.add(card12);
            
            
        }
        
        for(int q=0; q<100; q++){
            System.out.println("karta"+1+" : "+gameCards.get(q).getIdiotita()+" "+"value: "+gameCards.get(q).getValue());
        }
        
        
        Collections.shuffle(gameCards);
    }
    
    public Card2 getLastCardPlayed() {
        return lastCardPlayed;
    }

    
    public void movePlayer(player2 player1){
        //player1.movePosition();
        
    }
    
    public void setLastCardPlayed(Card2 lastCardPlayed) {
        this.lastCardPlayed = lastCardPlayed;
    }
    
        
	int position;
	public void setPosition(int pos){
			this.position=pos;
	}
	
	public int getPosition(){
		return position;
	}
        
        
}


