package GUI;

import java.awt.Button;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;

import org.omg.CORBA.Current;


public class ManualOnlyPage extends javax.swing.JFrame {
	
		Manual_Controller Current_Controller = new Manual_Controller();
	    private javax.swing.JButton BackToMain;
	    //Direction
	    private javax.swing.JButton Forward;
	    private javax.swing.JButton Left;
	    private javax.swing.JButton Right;
		private javax.swing.JButton Back;
	    private javax.swing.JButton Stop;
	    //panel to place the buttons
	    private javax.swing.JPanel StopPanel;
	    private javax.swing.JLabel Intro_Stop;
	    private javax.swing.JPanel ControlPanel;
	    private javax.swing.JPanel TheWholeLayout;
	    private javax.swing.JLabel Title;

    public ManualOnlyPage() {
        init();
    }

    private void init() {
    	
        TheWholeLayout = new javax.swing.JPanel();
        Title = new javax.swing.JLabel();
        ControlPanel = new javax.swing.JPanel();
        Forward = new javax.swing.JButton();
        Left = new javax.swing.JButton();
        Right = new javax.swing.JButton();
        Back = new javax.swing.JButton();
        StopPanel = new javax.swing.JPanel();
        Stop = new javax.swing.JButton();
        Intro_Stop = new javax.swing.JLabel();
        BackToMain = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(97, 212, 195));
        setPreferredSize(new java.awt.Dimension(1000, 600));

        TheWholeLayout.setBackground(new java.awt.Color(97, 212, 195));

        Title.setFont(new java.awt.Font("Papyrus", 1, 36));
        Title.setForeground(new java.awt.Color(255, 255, 255));
        Title.setText("Manual-Only Mode");

        ControlPanel.setBackground(new java.awt.Color(97, 212, 195));

        Forward.setBackground(new java.awt.Color(36, 47, 65));
        Forward.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Forward.setBorderPainted(false);
        Forward.setContentAreaFilled(false);
  
        Left.setBackground(new java.awt.Color(36, 47, 65));
        Left.setBorderPainted(false);
        Left.setContentAreaFilled(false);

        Right.setBackground(new java.awt.Color(36, 47, 65));
        Right.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        Right.setBorderPainted(false);
        Right.setContentAreaFilled(false);

        Back.setBackground(new java.awt.Color(36, 47, 65));
        Back.setBorderPainted(false);
        Back.setContentAreaFilled(false);
        
        javax.swing.GroupLayout ControlPanelLayout = new javax.swing.GroupLayout(ControlPanel);
        ControlPanel.setLayout(ControlPanelLayout);
        ControlPanelLayout.setHorizontalGroup(
            ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ControlPanelLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(Left, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ControlPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ControlPanelLayout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(Right, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ControlPanelLayout.createSequentialGroup()
                .addGap(0, 169, Short.MAX_VALUE)
                .addComponent(Forward)
                .addGap(412, 412, 412))
        );
        ControlPanelLayout.setVerticalGroup(
            ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ControlPanelLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(Forward)
                .addGroup(ControlPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ControlPanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Right)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Back, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(ControlPanelLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(Left)))
                .addGap(368, 368, 368))
        );

        StopPanel.setBackground(new java.awt.Color(97, 212, 195));

        Stop.setBackground(new java.awt.Color(36, 47, 65));
        Stop.setBorderPainted(false);
        Stop.setContentAreaFilled(false);

        Intro_Stop.setBackground(new java.awt.Color(255, 255, 255));
        Intro_Stop.setFont(new java.awt.Font("Papyrus", 1, 18)); // NOI18N
        Intro_Stop.setForeground(new java.awt.Color(255, 255, 255));
        Intro_Stop.setText("Press To Stop");
        Intro_Stop.setToolTipText("");

        javax.swing.GroupLayout StopPanelLayout = new javax.swing.GroupLayout(StopPanel);
        StopPanel.setLayout(StopPanelLayout);
        StopPanelLayout.setHorizontalGroup(
            StopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StopPanelLayout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(Stop)
                .addGap(110, 110, 110))
            .addGroup(StopPanelLayout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(Intro_Stop)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        StopPanelLayout.setVerticalGroup(
            StopPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, StopPanelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(Intro_Stop, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Stop)
                .addGap(83, 83, 83))
        );
        BackToMain.setBorderPainted(false);
        BackToMain.setContentAreaFilled(false);
        
        button_format();
        Listeners();
        
        javax.swing.GroupLayout TheWholeLayoutLayout = new javax.swing.GroupLayout(TheWholeLayout);
        TheWholeLayout.setLayout(TheWholeLayoutLayout);
        TheWholeLayoutLayout.setHorizontalGroup(
            TheWholeLayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TheWholeLayoutLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(TheWholeLayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(TheWholeLayoutLayout.createSequentialGroup()
                        .addComponent(BackToMain)
                        .addGap(280, 280, 280)
                        .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ControlPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(StopPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(716, Short.MAX_VALUE))
        );
        TheWholeLayoutLayout.setVerticalGroup(
            TheWholeLayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TheWholeLayoutLayout.createSequentialGroup()
                .addGroup(TheWholeLayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(TheWholeLayoutLayout.createSequentialGroup()
                        .addGroup(TheWholeLayoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(BackToMain, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ControlPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 482, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(TheWholeLayoutLayout.createSequentialGroup()
                        .addGap(162, 162, 162)
                        .addComponent(StopPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(110, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TheWholeLayout, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(TheWholeLayout, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 103, Short.MAX_VALUE))
        );
        pack();
    }                    
    
    private void button_format(){
    	
    	java.awt.Image forward_icon = new ImageIcon(this.getClass().getResource("/forward.png")).getImage();
        Forward.setIcon(new javax.swing.ImageIcon(forward_icon));
        
        java.awt.Image left_icon = new ImageIcon(this.getClass().getResource("/rotate-to-left.png")).getImage();
        Left.setIcon(new javax.swing.ImageIcon(left_icon));
        
        java.awt.Image right_icon = new ImageIcon(this.getClass().getResource("/rotate-to-right.png")).getImage();
        Right.setIcon(new javax.swing.ImageIcon(right_icon));
        
        java.awt.Image back_icon = new ImageIcon(this.getClass().getResource("/back.png")).getImage();
        Back.setIcon(new javax.swing.ImageIcon(back_icon));
        
        java.awt.Image stop_icon = new ImageIcon(this.getClass().getResource("/stop.png")).getImage();
        Stop.setIcon(new javax.swing.ImageIcon(stop_icon));
        
        java.awt.Image previous_icon = new ImageIcon(this.getClass().getResource("/previous.png")).getImage();
        BackToMain.setIcon(new javax.swing.ImageIcon(previous_icon));
    
    } 
    private void Listeners(){
    	  
        Forward.addMouseListener(new java.awt.event.MouseAdapter() {
        	public void mouseEntered(java.awt.event.MouseEvent evt) {
        		clickable(evt, Forward);
        	}
        	public void mouseExited(java.awt.event.MouseEvent evt) {
        		MouseLeave(evt, Forward);
        	}
        });
        
        Left.addMouseListener(new java.awt.event.MouseAdapter() {
        	public void mouseEntered(java.awt.event.MouseEvent evt) {
        		clickable(evt, Left);
        	}
        	public void mouseExited(java.awt.event.MouseEvent evt) {
        		MouseLeave(evt, Left);
        	}
        });
  
        Right.addMouseListener(new java.awt.event.MouseAdapter()  {
        	public void mouseEntered(java.awt.event.MouseEvent evt) {
        		clickable(evt, Right);
        	}
        	public void mouseExited(java.awt.event.MouseEvent evt) {
        		MouseLeave(evt, Right);
        	}
        });
        
        Back.addMouseListener(new java.awt.event.MouseAdapter() {
        	 public void mouseEntered(java.awt.event.MouseEvent evt) {
             	clickable(evt, Back);
             }
             public void mouseExited(java.awt.event.MouseEvent evt) {
            	MouseLeave(evt, Back);
             }
        });
        
        Stop.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
            	clickable(evt, Stop);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
            	MouseLeave(evt, Stop);
            }
        });
        BackToMain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BackToMainToMain(evt);
            }
        });
       
        /*click listener*/
		Forward.addActionListener(new forward_clicked());
		Left.addActionListener(new Left_clicked());
		Right.addActionListener(new Right_clicked());
		Back.addActionListener(new Back_clicked());
		Stop.addActionListener(new Stop_clicked());
	
    }
    
	public class forward_clicked implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			Current_Controller.Forward_Pressed();
		}
	}
	public class Left_clicked implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			Current_Controller.Left_Pressed();
		}
	}
	public class Right_clicked implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			Current_Controller.Right_Pressed();
		}
	}
	public class Back_clicked implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			Current_Controller.Back_Pressed();
		}
	}
	public class Stop_clicked implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			Current_Controller.Stop_Pressed();
		}
	}
    
	
    private void clickable(java.awt.event.MouseEvent evt,JButton button) {                           
        button.setContentAreaFilled(true);
    }                          

    private void MouseLeave(java.awt.event.MouseEvent evt,JButton button) {                             
    	button.setContentAreaFilled(false);
    }           
    
    private void BackToMainToMain(java.awt.event.MouseEvent evt) {                                  
        this.dispose();
        new MainPage().setVisible(true);
    }                                 

        
              
}
