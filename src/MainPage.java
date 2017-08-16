package GUI;

import java.awt.Dimension;
import java.awt.image.*;
import javax.swing.ImageIcon;

import org.omg.CORBA.Current;

import com.sun.medialib.mlib.Image;

public class MainPage extends javax.swing.JFrame {
	
    
	private javax.swing.JButton Manual_Only;
	private javax.swing.JButton Manual_Auto;
	private javax.swing.JLabel Manual_Intro;
	private javax.swing.JLabel Manual_Auto_Intro;
	private javax.swing.JPanel Left_Side;
	private javax.swing.JPanel Right_Side;

    public MainPage() {
    	init();
    }
    
    private void init() {

        Left_Side = new javax.swing.JPanel();
        Manual_Intro = new javax.swing.JLabel();
        Manual_Only = new javax.swing.JButton();
        Right_Side = new javax.swing.JPanel();
        Manual_Auto_Intro = new javax.swing.JLabel();
        Manual_Auto = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);
        setPreferredSize(new Dimension(1000,600));
        Left_Side.setBackground(new java.awt.Color(97, 212, 195));
        Left_Side.setPreferredSize(new java.awt.Dimension(500, 600));

        Manual_Intro.setFont(new java.awt.Font("Papyrus", 0, 18)); 
        Manual_Intro.setForeground(new java.awt.Color(255, 255, 255));
        Manual_Intro.setText("Manual-Only Mode");
        Manual_Only.setBackground(new java.awt.Color(97, 212, 195));
        
        Manual_OnlyListener();
  
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(Left_Side);
        Left_Side.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Manual_Intro, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Manual_Only, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(179, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(120, 120, 120)
                .addComponent(Manual_Intro, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(Manual_Only, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(171, Short.MAX_VALUE))
        );

        getContentPane().add(Left_Side);
        Left_Side.setBounds(0, 0, 500, 600);

        Right_Side.setBackground(new java.awt.Color(36, 47, 65));
        Right_Side.setForeground(new java.awt.Color(204, 204, 204));

        Manual_Auto_Intro.setBackground(new java.awt.Color(255, 255, 255));
        Manual_Auto_Intro.setFont(new java.awt.Font("Papyrus", 0, 18)); 
        Manual_Auto_Intro.setForeground(new java.awt.Color(255, 255, 255));
        Manual_Auto_Intro.setText("Manual&Auto Mode with Map");
        Manual_Auto.setBackground(new java.awt.Color(36, 47, 65));
        
        button_format();
        Manual_AutoListener();

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(Right_Side);
        Right_Side.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(156, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(Manual_Auto_Intro)
                        .addGap(99, 99, 99))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(Manual_Auto)
                        .addGap(173, 173, 173))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(Manual_Auto_Intro)
                .addGap(116, 116, 116)
                .addComponent(Manual_Auto)
                .addContainerGap(173, Short.MAX_VALUE))
        );

        getContentPane().add(Right_Side);
        Right_Side.setBounds(500, 0, 500, 600);
        pack();
    }                   
    
    private void button_format(){
        java.awt.Image manaul_icon = new ImageIcon(this.getClass().getResource("/Controller.png")).getImage();
        Manual_Only.setIcon(new javax.swing.ImageIcon(manaul_icon)); 
        Manual_Only.setBorder(null);
        Manual_Only.setBorderPainted(false);
        Manual_Only.setBorderPainted(false);
        Manual_Only.setContentAreaFilled(false);
        
        java.awt.Image map_icon = new ImageIcon(this.getClass().getResource("/map.png")).getImage();
        Manual_Auto.setIcon(new javax.swing.ImageIcon(map_icon));   
        Manual_Auto.setBorder(null);
        Manual_Auto.setBorderPainted(false);
        Manual_Auto.setContentAreaFilled(false);
    }
    
    // Listener
    private void Manual_OnlyListener(){
    	  Manual_Only.addMouseListener(new java.awt.event.MouseAdapter() {
              public void mouseExited(java.awt.event.MouseEvent evt) {
                  MunualLeave(evt);
              }
              public void mouseEntered(java.awt.event.MouseEvent evt) {
                  ManualClickable(evt);
              }
          });
          Manual_Only.addActionListener(new java.awt.event.ActionListener() {
              public void actionPerformed(java.awt.event.ActionEvent evt) {
                  Manual_OnlyAction(evt);
              }
          });
    }
    
    private void Manual_AutoListener(){
        Manual_Auto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Manual_AutoAction(evt);
            }
        });
    }
    
    private void Manual_AutoAction(java.awt.event.ActionEvent evt) {                                         
        
    }                
    
    private void Manual_OnlyAction(java.awt.event.ActionEvent evt) {                                         
    	 Manual_Controller c = new Manual_Controller();
    	 c.connect("The current mode is Manual-Only");
  
         this.dispose();
         new ManualOnlyPage().setVisible(true);
    }                                        
    
    private void ManualClickable(java.awt.event.MouseEvent evt) {                                 
           Manual_Only.setContentAreaFilled(true);        
    }                                

    private void MunualLeave(java.awt.event.MouseEvent evt) {                             
    	   Manual_Only.setContentAreaFilled(false);    
    }                            
              
}
