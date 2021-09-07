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
public interface Finding {
       
       
       /**
     * <b>Transformer:</b> sets the points of the finding.
     * <b>Postcondition:</b> the points  has been set
     * @param points
     * @param int points

     */
        public void setPoints(int points); 
        
       /**
     * <b>Accessor:</b> returns the points of the finding
     * <b>Postcondition:</b> the points has been returned
     * @return points
     */
         public int getPoints();  
    /**
     * <b>Transformer:</b> sets the description of the finding.
     * <b>Postcondition:</b> the description  has been set
     * @param peri
     * @param String peri
     */
        public void setPerigrafi(String peri);
        
    /**
     * <b>Accessor:</b> returns the description of the finding
     * <b>Postcondition:</b> the description has been returned
     * @return perigrafi
     */
        public String getPerigrafi();
        
    /**
     * <b>Transformer:</b> sets the availability of the finding.
     * <b>Postcondition:</b> the availability  has been set
     * @param av
     * @param boolean av
     */
        public void setAvailable(boolean av);
        
    /**
     * <b>Accessor:</b> returns the availability of the finding
     * <b>Postcondition:</b> the availability has been returned
     * @return available
     */
        public boolean getAvailable();
        
        
    /**
     * <b>Transformer:</b> sets the image of the finding.
     * <b>Postcondition:</b> the image  has been set
     * @param image
     * @param String image
     */        
        public void setImage(String image);
        
        
    /**
     * <b>Accessor:</b> returns the image of the finding
     * <b>Postcondition:</b> the image has been returned
     * @return image
     */        
        public String getImage();
        
        
}
