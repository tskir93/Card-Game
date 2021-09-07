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
public class Fresco implements Finding{
        private String perigrafi;
       private String image;
       private boolean available;
       private int points;
       
       
       
       
    /** <b>Transformer:</b> sets the points of the finding.
     * <b>Postcondition:</b> the points  has been set
     * @param points
     * @param int points

     */
       @Override
        public void setPoints(int points){
           this.points = points;
        }  
        
       /**
     * <b>Accessor:</b> returns the points of the finding
     * <b>Postcondition:</b> the points has been returned
     * @return points
     */
       @Override
         public int getPoints(){
            return points;
        }  
    /**
     * <b>Transformer:</b> sets the description of the finding.
     * <b>Postcondition:</b> the description  has been set
     * @param peri
     * @param String peri
     */
       @Override
        public void setPerigrafi(String peri){
            this.perigrafi = peri;
        }
        
    /**
     * <b>Accessor:</b> returns the description of the finding
     * <b>Postcondition:</b> the description has been returned
     * @return perigrafi
     */
       @Override
        public String getPerigrafi(){
            return perigrafi;
        }
        
    /**
     * <b>Transformer:</b> sets the availability of the finding.
     * <b>Postcondition:</b> the availability  has been set
     * @param av
     * @param boolean av
     */
       @Override
        public void setAvailable(boolean av){
            this.available= av;
        }
        
    /**
     * <b>Accessor:</b> returns the availability of the finding
     * <b>Postcondition:</b> the availability has been returned
     * @return available
     */
       @Override
        public boolean getAvailable(){
            return available;
        }
        
        
    /**
     * <b>Transformer:</b> sets the image of the finding.
     * <b>Postcondition:</b> the image  has been set
     * @param String image
     */        
       @Override
        public void setImage(String image){
            this.image = image;
        }
        
        
    /**
     * <b>Accessor:</b> returns the image of the finding
     * <b>Postcondition:</b> the image has been returned
     * @return image
     */        
       @Override
        public String getImage(){
            return image;
        }
        
          
    
}
