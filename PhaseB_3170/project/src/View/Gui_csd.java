/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Controller.Controller;
import Model.card.Board;
import Modelnew.Card2;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;








public class Gui_csd extends JFrame{
     JPanel menu = new JPanel(new GridLayout(1,0));
     JPanel tablo = new JPanel(new BorderLayout(3,0));
     JLayeredPane panel1 = new JLayeredPane();
     JLayeredPaneExtension panel2 ;
     
     JLayeredPane panel3 = new JLayeredPane();
     JMenuBar menu1 ;
     JMenuBar menu2 ;
     JMenuBar menu3 ;
     JMenuBar menu4 ;
     JMenuBar menu5 ;
     JButton[] table_button_xeri = new JButton[8]; 
     JButton[] table_button_xeri2 = new JButton[8]; 
     JButton[] table_button_paiksia = new JButton[4]; 
     JLabel[] table_icons_under = new JLabel[4];
     Controller control = new Controller();
     ArrayList<Card2> trapoula;
     JButton pithari;
     JButton[] table_button_paiksia2;
     JLabel paiktis1 = new JLabel();
     JLabel paiktis2 = new JLabel();
     JLabel[] labels_tablo1 ;
        
        JLabel[] labels_tablo2 ;
        JLabel[] labels_tablo3 ;
        JLabel[] labels_tablo4 ;
        JLabel[] labels_tablo5 ;
     
     String imageUrl;
     JLabel available_points;
     
     
     
    public Gui_csd() throws IOException{
        control.initializeControler();
        trapoula = control.getBoard().getGameCards();
        control.init_table();
        control.init_player_cards();
        
        
        this.setTitle("Αναζητώντας τα Χαμένα Μινωικά Ανάκτορα");
        this.setSize(600,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setLayout(new BorderLayout());
        
        
        
        
        this.add(menu,BorderLayout.PAGE_START);
        this.add(tablo,BorderLayout.CENTER);
        
       
        panel1.setPreferredSize(new Dimension(1315,150));
        tablo.add(panel1,BorderLayout.PAGE_START);
        
        imageUrl = "src\\resources\\images\\background.jpg";
        Image image = new ImageIcon(imageUrl).getImage();
        panel2 = new JLayeredPaneExtension(image);
        panel2.setBorder(BorderFactory.createLineBorder(Color.yellow));
        
        
        
        
        panel2.setPreferredSize(new Dimension(1315,500));
        tablo.add(panel2,BorderLayout.CENTER);
        
        
        
        panel3.setPreferredSize(new Dimension(1315,150));
        tablo.add(panel3,BorderLayout.PAGE_END);
        
        
        panel1.setBorder(BorderFactory.createLineBorder(Color.red));
        
        
        
        panel3.setBorder(BorderFactory.createLineBorder(Color.green));
        
        
        
         menu1 = new JMenuBar();
         menu2 = new JMenuBar();
         menu3 = new JMenuBar();
         menu4 = new JMenuBar();
         menu5 = new JMenuBar();
        
        menu.add(menu1);
        menu.add(menu2);
        menu.add(menu3);
        menu.add(menu4);
        menu.add(menu5);
        
        JMenuItem newgame = new JMenuItem("New game");
        JMenuItem save = new JMenuItem("Save game");
        JMenuItem cont = new JMenuItem("Continue");
        JMenuItem saved = new JMenuItem("Saved game");
        
        JMenuItem exit = new JMenuItem("Exit");
        exit.addActionListener(new exitApp());
        menu5.add(exit);
        
        menu1.add(newgame);
        menu2.add(save);
        menu3.add(cont);
        menu4.add(saved);
        
//player 1
        
        
        int x=0;
        //button xeri
        for(int i =0; i<8 ;i++){
            
            table_button_xeri[i] = new JButton(trapoula.get(i).getIdiotita()+"/"+trapoula.get(i).getValue()+"/"+Integer.toString(i));
            table_button_xeri[i].setBounds(x+50, 20, 50, 70);
            panel1.add(table_button_xeri[i],new Integer(1));
            ImageIcon MyImage2 = new ImageIcon(trapoula.get(i).getImage());
            Image img2 = MyImage2.getImage();
            Image newImg2 = img2.getScaledInstance(table_button_xeri[i].getWidth(), table_button_xeri[i].getHeight(),Image.SCALE_SMOOTH);        
            ImageIcon image2 = new ImageIcon(newImg2);
            table_button_xeri[i].setIcon(image2);
            System.out.println("xeri p1 :"+trapoula.get(i).getImage());
            
            
            
            trapoula.remove(i);
            table_button_xeri[i].addActionListener(new CardListener());
            
            
            
            
            
             
            
            x = x + 60;
            //(megethos-deksia-
            
        }
        //label kato apo paiksia
        for(int i =0; i<4 ;i++){
            
            table_icons_under[i] = new JLabel("icon"+Integer.toString(i));
            x = x + 60;
            //(megethos-deksia-megethos deksia aristera-megethos pano kato
            table_icons_under[i].setBounds(x+250, 90, 50, 70);
            panel1.add(table_icons_under[i],new Integer(1));
        }
        //button paiksias
        for(int i =0; i<4 ;i++){
            
            table_button_paiksia[i] = new JButton("button"+Integer.toString(i));
            x = x + 60;
            //(megethos-deksia-megethos deksia aristera-megethos pano kato
            table_button_paiksia[i].setBounds(x, 20, 50, 70);
            panel1.add(table_button_paiksia[i],new Integer(1));
        }
        
        JLabel skor = new JLabel("to skor moy");
        skor.setBounds(1100, -5, 150, 70);
        panel1.add(skor);
        
        JButton toixografies = new JButton("oi toixografies moy");
        toixografies.setBounds(1100, 60, 150, 30);
        panel1.add(toixografies);
        
        
        JLabel agalmatakia = new JLabel("agalmatakia");
        agalmatakia.setBounds(1100, 90, 150, 70);
        panel1.add(agalmatakia);
        
        
        JLabel agalmatakia_photo = new JLabel("agalmatakia_foto");
        agalmatakia_photo.setBounds(1250, 90, 150, 70);
        panel1.add(agalmatakia_photo);
        
        JLabel info = new JLabel("Paiktis 1 - diathesima pionia 3 arxaiologoi thiseas");
        info.setBounds(10, 90, 350, 70);
        panel1.add(info);
        
//------------- telos player 1--------------------//
//player 2
        
        table_button_paiksia2 = new JButton[4]; 
        JLabel[] table_icons_under2 = new JLabel[4];
        
        int x2=0;
        //button xeri
        for(int i =0; i<8 ;i++){
            
            
            table_button_xeri2[i] = new JButton(trapoula.get(i).getIdiotita()+"/"+trapoula.get(i).getValue()+"/"+Integer.toString(i));
            table_button_xeri2[i].setBounds(x2+50, 20, 50, 70);
            panel3.add(table_button_xeri2[i],new Integer(1));
            ImageIcon MyImage2 = new ImageIcon(trapoula.get(i).getImage());
            Image img2 = MyImage2.getImage();
            Image newImg2 = img2.getScaledInstance(table_button_xeri2[i].getWidth(), table_button_xeri2[i].getHeight(),Image.SCALE_SMOOTH);        
            ImageIcon image2 = new ImageIcon(newImg2);
            table_button_xeri2[i].setIcon(image2);
            System.out.println("xeri p2 :"+trapoula.get(i).getImage());
            trapoula.remove(i);
            table_button_xeri2[i].addActionListener(new CardListener2());
            
            
            
           
            x2 = x2 + 60;
            //(megethos-deksia-
            
            //panel3.add(table_button_xeri2[i],new Integer(1));
        }
        //label kato apo paiksia
        for(int i =0; i<4 ;i++){
            
            table_icons_under2[i] = new JLabel("icon"+Integer.toString(i));
            x2 = x2 + 60;
            //(megethos-deksia-megethos deksia aristera-megethos pano kato
            table_icons_under2[i].setBounds(x+250, 90, 50, 70);
            panel3.add(table_icons_under2[i],new Integer(1));
        }
        //button paiksias
        for(int i =0; i<4 ;i++){
            
            table_button_paiksia2[i] = new JButton("button"+Integer.toString(i));
            x2 = x2 + 60;
            //(megethos-deksia-megethos deksia aristera-megethos pano kato
            table_button_paiksia2[i].setBounds(x2, 20, 50, 70);
            panel3.add(table_button_paiksia2[i],new Integer(1));
        }
        
        JLabel skor2 = new JLabel("to skor moy");
        skor2.setBounds(1100, -5, 150, 70);
        panel3.add(skor2);
        
        JButton toixografies2 = new JButton("oi toixografies moy");
        toixografies2.setBounds(1100, 60, 150, 30);
        panel3.add(toixografies2);
        
        
        JLabel agalmatakia2 = new JLabel("agalmatakia");
        agalmatakia2.setBounds(1100, 90, 150, 70);
        panel3.add(agalmatakia2);
        
        
        JLabel agalmatakia_photo2 = new JLabel("agalmatakia_foto");
        agalmatakia_photo2.setBounds(1250, 90, 150, 70);
        panel3.add(agalmatakia_photo2);
        
        JLabel info2 = new JLabel("Paiktis 1 - diathesima pionia 3 arxaiologoi thiseas");
        info2.setBounds(10, 90, 350, 70);
        panel3.add(info2);
        
//------------- telos player 2--------------------//


//tablo mesh----------------------->

         labels_tablo1 = new JLabel[19];
        
         labels_tablo2 = new JLabel[19];  
         labels_tablo3 = new JLabel[19];  
         labels_tablo4 = new JLabel[19];  
         labels_tablo5 = new JLabel[19];  
        
        
        pithari = new JButton();
        pithari.setBounds(20, 60, 150, 170);
        panel2.add(pithari,new Integer(1));
        ImageIcon MyImage2 = new ImageIcon(trapoula.get(0).getImage());
        Image img2 = MyImage2.getImage();
        Image newImg2 = img2.getScaledInstance(pithari.getWidth(), pithari.getHeight(),Image.SCALE_SMOOTH);        
        ImageIcon image2 = new ImageIcon(newImg2);
        pithari.setIcon(image2);
            
            //trapoula.remove(0);
        
        
        
        
        
        available_points = new JLabel("available cards: "+trapoula.size());
        available_points.setBackground(Color.white);
        available_points.setOpaque(true);
        
        
        available_points.setBounds(20, 250, 200, 120);
        panel2.add(available_points,new Integer(1));
        
        int x3=0;
        //tablo mesh megalh fotografia
        
        int y=-25;
        String path2,path3,path4,path5;
        for(int i = 1; i<10 ;i++){
            
            if(i%2==0){
                path2 = "src\\resources\\images\\paths\\knossos2.jpg"; 
                path3 = "src\\resources\\images\\paths\\malia2.jpg";
                path4 ="src\\resources\\images\\paths\\phaistos2.jpg";
                path5 = "src\\resources\\images\\paths\\zakros2.jpg";
            }
            else{
                path2 = "src\\resources\\images\\paths\\knossos.jpg"; 
                path3 = "src\\resources\\images\\paths\\malia.jpg"; 
                path4 = "src\\resources\\images\\paths\\phaistos.jpg"; 
                path5 = "src\\resources\\images\\paths\\zakros.jpg"; 
            }
            if(i==9){
                 path2  = "src\\resources\\images\\paths\\knossosPalace.jpg"; 
                 path3  = "src\\resources\\images\\paths\\maliaPalace.jpg";
                 path4  = "src\\resources\\images\\paths\\phaistosPalace.jpg";
                 path5  = "src\\resources\\images\\paths\\zakrosPalace.jpg";

            }
            
            labels_tablo1[i] = new JLabel(Integer.toString(y+=5));
            labels_tablo1[i].setBounds(x3+510, 10, 40, 10);
            panel2.add(labels_tablo1[i],new Integer(1));
            
            
            labels_tablo2[i] = new JLabel();
            labels_tablo2[i].setBounds(x3+500, 40, 80, 70);
            panel2.add(labels_tablo2[i],new Integer(1));
            MyImage2 = new ImageIcon(path2);
            img2 = MyImage2.getImage();
            newImg2 = img2.getScaledInstance(labels_tablo2[i].getWidth(), labels_tablo2[i].getHeight(),Image.SCALE_SMOOTH);        
            image2 = new ImageIcon(newImg2);
            labels_tablo2[i].setIcon(image2);
            
            
 
            
            
            labels_tablo3[i] = new JLabel();
            labels_tablo3[i].setBounds(x3+500, 120, 80, 70);
            //labels_tablo2[i].setText(trapoula.get(i).getImage());
            panel2.add(labels_tablo3[i],new Integer(1));
            ImageIcon MyImage3 = new ImageIcon(path3);
            Image img3 = MyImage3.getImage();
            Image newImg3 = img3.getScaledInstance(labels_tablo3[i].getWidth(), labels_tablo3[i].getHeight(),Image.SCALE_SMOOTH);        
            ImageIcon image3 = new ImageIcon(newImg3);
            labels_tablo3[i].setIcon(image3);
            
            
            
            labels_tablo4[i] = new JLabel();
            labels_tablo4[i].setBounds(x3+500, 200, 80, 70);
            //labels_tablo2[i].setText(trapoula.get(i).getImage());
            panel2.add(labels_tablo4[i],new Integer(1));
            ImageIcon MyImage4 = new ImageIcon(path4);
            Image img4= MyImage4.getImage();
            Image newImg4 = img4.getScaledInstance(labels_tablo4[i].getWidth(), labels_tablo4[i].getHeight(),Image.SCALE_SMOOTH);        
            ImageIcon image4 = new ImageIcon(newImg4);
            labels_tablo4[i].setIcon(image4);
            
            
            
            
            labels_tablo5[i] = new JLabel();
            labels_tablo5[i].setBounds(x3+500, 280, 80, 70);
            //labels_tablo2[i].setText(trapoula.get(i).getImage());
            panel2.add(labels_tablo5[i],new Integer(1));
            ImageIcon MyImage5 = new ImageIcon(path5);
            Image img5 = MyImage5.getImage();
            Image newImg5 = img5.getScaledInstance(labels_tablo5[i].getWidth(), labels_tablo5[i].getHeight(),Image.SCALE_SMOOTH);        
            ImageIcon image5 = new ImageIcon(newImg5);
            labels_tablo5[i].setIcon(image5);
            
           
            
            x3 = x3 + 90;
          
            
            
        }
        
        labels_tablo1[4].setText(Integer.toString(5));
        labels_tablo1[5].setText(Integer.toString(10));
        labels_tablo1[6].setText(Integer.toString(15));
        labels_tablo1[7].setText(Integer.toString(30));
        labels_tablo1[8].setText(Integer.toString(35));
        labels_tablo1[9].setText(Integer.toString(50));
        
        



//-------------------telos tablo mesh-------------------//
        
    }
public int potition2=1,potition3=1,potition4=1,potition5=1;

public class CardListener implements ActionListener{
        String idiotita;
        int value,koumpi;
        @Override
        public void actionPerformed(ActionEvent e) {
            
            if(potition2 >= 9 || potition3 >= 9 || potition4 >= 9 || potition5 >=9){
                System.out.println("nikise o player1");
                System.exit(1);
            }
            
            
            
            available_points.setText("available cards: "+trapoula.size());
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            System.out.println(e.getActionCommand());
            idiotita = e.getActionCommand().split("/")[0];
            value = Integer.parseInt(e.getActionCommand().split("/")[1]);
            koumpi = Integer.parseInt(e.getActionCommand().split("/")[2]);
            System.out.println("to koumpi einai : "+koumpi);
            
            if(idiotita.equals("knossos")){
                table_button_paiksia[0].setIcon(table_button_xeri[koumpi].getIcon());
                
                ImageIcon MyImage55 = new ImageIcon(control.getPlayer1().getPioniImage());
                Image img5 = MyImage55.getImage();
                Image newImg5 = img5.getScaledInstance(labels_tablo2[1].getWidth(), labels_tablo2[1].getHeight(),Image.SCALE_SMOOTH);        
                ImageIcon image5 = new ImageIcon(newImg5);
                labels_tablo2[potition2].setIcon(image5);
                potition2++;
            
            
            }else if(idiotita.equals("malia")){
                table_button_paiksia[1].setIcon(table_button_xeri[koumpi].getIcon());
                
                ImageIcon MyImage55 = new ImageIcon(control.getPlayer1().getPioniImage());
                Image img5 = MyImage55.getImage();
                Image newImg5 = img5.getScaledInstance(labels_tablo2[1].getWidth(), labels_tablo2[1].getHeight(),Image.SCALE_SMOOTH);        
                ImageIcon image5 = new ImageIcon(newImg5);
                labels_tablo3[potition3].setIcon(image5);
                potition3++;
                
                
            }else if(idiotita.equals("phaistos")){
                table_button_paiksia[2].setIcon(table_button_xeri[koumpi].getIcon());
                
                ImageIcon MyImage55 = new ImageIcon(control.getPlayer1().getPioniImage());
                Image img5 = MyImage55.getImage();
                Image newImg5 = img5.getScaledInstance(labels_tablo2[1].getWidth(), labels_tablo2[1].getHeight(),Image.SCALE_SMOOTH);        
                ImageIcon image5 = new ImageIcon(newImg5);
                labels_tablo4[potition4].setIcon(image5);
                potition4++;
                
                
            }else if(idiotita.equals("zakros")){
                table_button_paiksia[3].setIcon(table_button_xeri[koumpi].getIcon());
                
                ImageIcon MyImage55 = new ImageIcon(control.getPlayer1().getPioniImage());
                Image img5 = MyImage55.getImage();
                Image newImg5 = img5.getScaledInstance(labels_tablo2[1].getWidth(), labels_tablo2[1].getHeight(),Image.SCALE_SMOOTH);        
                ImageIcon image5 = new ImageIcon(newImg5);
                labels_tablo5[potition5].setIcon(image5);
                potition5++;
                
                
            }else{
                    System.out.println("idiki karta :"+idiotita);    
                        
            }
            
            table_button_xeri[koumpi].setText(trapoula.get(0).getIdiotita()+"/"+trapoula.get(0).getValue()+"/"+Integer.toString(0));
            
            ImageIcon MyImage2 = new ImageIcon(trapoula.get(0).getImage());
            Image img2 = MyImage2.getImage();
            Image newImg2 = img2.getScaledInstance(table_button_xeri[koumpi].getWidth(), table_button_xeri[koumpi].getHeight(),Image.SCALE_SMOOTH);        
            ImageIcon image2 = new ImageIcon(newImg2);
            table_button_xeri[koumpi].setIcon(image2);
            
            trapoula.remove(0);
            
            
           
            MyImage2 = new ImageIcon(trapoula.get(0).getImage());
            img2 = MyImage2.getImage();
            newImg2 = img2.getScaledInstance(pithari.getWidth(), pithari.getHeight(),Image.SCALE_SMOOTH);        
            image2 = new ImageIcon(newImg2);
            pithari.setIcon(image2);
            
        }
        
    
}  


public class CardListener2 implements ActionListener{
        String idiotita;
        int value,koumpi;
        @Override
        public void actionPerformed(ActionEvent e) {
            if(potition2 >= 9 || potition3 >= 9 || potition4 >= 9 || potition5 >=9){
                System.out.println("nikise o player2");
                System.exit(1);
            }
            available_points.setText("available cards: "+trapoula.size());
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            System.out.println(e.getActionCommand());
            idiotita = e.getActionCommand().split("/")[0];
            value = Integer.parseInt(e.getActionCommand().split("/")[1]);
            koumpi = Integer.parseInt(e.getActionCommand().split("/")[2]);
            System.out.println("to koumpi einai : "+koumpi);
            
            if(idiotita.equals("knossos")){
                table_button_paiksia2[0].setIcon(table_button_xeri2[koumpi].getIcon());
                
                
                
                ImageIcon MyImage55 = new ImageIcon(control.getPlayer2().getPioniImage());
                Image img5 = MyImage55.getImage();
                Image newImg5 = img5.getScaledInstance(labels_tablo2[1].getWidth(), labels_tablo2[1].getHeight(),Image.SCALE_SMOOTH);        
                ImageIcon image5 = new ImageIcon(newImg5);
                labels_tablo2[potition2].setIcon(image5);
                potition2++;
                
                
                
                
            }else if(idiotita.equals("malia")){
                table_button_paiksia2[1].setIcon(table_button_xeri2[koumpi].getIcon());
                
                ImageIcon MyImage55 = new ImageIcon(control.getPlayer2().getPioniImage());
                Image img5 = MyImage55.getImage();
                Image newImg5 = img5.getScaledInstance(labels_tablo3[1].getWidth(), labels_tablo3[1].getHeight(),Image.SCALE_SMOOTH);        
                ImageIcon image5 = new ImageIcon(newImg5);
                labels_tablo3[potition3].setIcon(image5);
                potition3++;
            
            
            }else if(idiotita.equals("phaistos")){
                table_button_paiksia2[2].setIcon(table_button_xeri2[koumpi].getIcon());
                
                ImageIcon MyImage55 = new ImageIcon(control.getPlayer2().getPioniImage());
                Image img5 = MyImage55.getImage();
                Image newImg5 = img5.getScaledInstance(labels_tablo4[1].getWidth(), labels_tablo4[1].getHeight(),Image.SCALE_SMOOTH);        
                ImageIcon image5 = new ImageIcon(newImg5);
                labels_tablo4[potition4].setIcon(image5);
                potition4++;
            
            
            }else if(idiotita.equals("zakros")){
                table_button_paiksia2[3].setIcon(table_button_xeri2[koumpi].getIcon());
                
                ImageIcon MyImage55 = new ImageIcon(control.getPlayer2().getPioniImage());
                Image img5 = MyImage55.getImage();
                Image newImg5 = img5.getScaledInstance(labels_tablo5[1].getWidth(), labels_tablo5[1].getHeight(),Image.SCALE_SMOOTH);        
                ImageIcon image5 = new ImageIcon(newImg5);
                labels_tablo5[potition5].setIcon(image5);
                potition5++;
            
            
            }else{
                    System.out.println("idiki karta :"+idiotita);    
                        
            }
        
            table_button_xeri2[koumpi].setText(trapoula.get(0).getIdiotita()+"/"+trapoula.get(0).getValue()+"/"+Integer.toString(0));
            
            ImageIcon MyImage2 = new ImageIcon(trapoula.get(0).getImage());
            Image img2 = MyImage2.getImage();
            Image newImg2 = img2.getScaledInstance(table_button_xeri2[koumpi].getWidth(), table_button_xeri2[koumpi].getHeight(),Image.SCALE_SMOOTH);        
            ImageIcon image2 = new ImageIcon(newImg2);
            table_button_xeri2[koumpi].setIcon(image2);
            
            trapoula.remove(0);
            
            
           
            MyImage2 = new ImageIcon(trapoula.get(0).getImage());
            img2 = MyImage2.getImage();
            newImg2 = img2.getScaledInstance(pithari.getWidth(), pithari.getHeight(),Image.SCALE_SMOOTH);        
            image2 = new ImageIcon(newImg2);
            pithari.setIcon(image2);
            
        
        }
    
        
    
}
    
  class exitApp implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            System.exit(0);
        }
    }   
    
    
    
    
    
    
    public static void main(String[] args) throws IOException {
        Gui_csd gui = new Gui_csd();
        gui.setVisible(true);
    }
    
}
