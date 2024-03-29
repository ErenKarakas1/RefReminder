package GUI;

import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.Scanner;

import javax.swing.*;
import java.net.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author goksu
 */
public class Feedback extends javax.swing.JFrame {
	
	ImageIcon icon = new ImageIcon("lib/images/star.jpg");
	int count = 0;
    String name;
    Desktop desktop;

    /**
     * Creates new form NewJFrame1
     */
    public Feedback() {
    	 try
         {
             name = textReader();
         }

         catch(FileNotFoundException e)
         {
             System.out.println("1");
         }
    	setSize(938,578);
     	setLocationRelativeTo(null);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton6 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();
        jRadioButton7 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jRadioButton8 = new javax.swing.JRadioButton();
        jLabel5 = new javax.swing.JLabel();
        jRadioButton9 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jRadioButton10 = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", Font.BOLD, 24)); // NOI18N
        jLabel1.setText("Feedback");

        jRadioButton6.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton6.setText("5");
        jRadioButton6.addActionListener(this::jRadioButton6ActionPerformed);

        jLabel3.setIcon(icon); // NOI18N

        jRadioButton7.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton7.setText("4");
        jRadioButton7.addActionListener(this::jRadioButton7ActionPerformed);

        jLabel4.setIcon(icon); // NOI18N

        jRadioButton8.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton8.setText("3");
        jRadioButton8.addActionListener(this::jRadioButton8ActionPerformed);

        jLabel5.setIcon(icon); // NOI18N

        jRadioButton9.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton9.setText("2");
        jRadioButton9.addActionListener(this::jRadioButton9ActionPerformed);

        jLabel6.setIcon(icon); // NOI18N

        jRadioButton10.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton10.setText("1");
        jRadioButton10.addActionListener(this::jRadioButton10ActionPerformed);

        jLabel7.setIcon(icon); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", Font.BOLD, 12)); // NOI18N
        jLabel2.setText("Rate Us!");

        jButton1.setBackground(new java.awt.Color(255, 102, 102));
        jButton1.setText("Send");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        jTextArea1.setBackground(new java.awt.Color(245, 245, 245));
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Tahoma", Font.BOLD, 12)); // NOI18N
        jTextArea1.setRows(5);
        jTextArea1.setText("Write your comment!");
        jTextArea1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextArea1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTextArea1);

        jButton3.setBackground(new java.awt.Color(255, 102, 102));
        jButton3.setText("Back");
        jButton3.addActionListener(this::jButton3ActionPerformed);

        jButton4.setBackground(new java.awt.Color(255, 102, 102));
        jButton4.setText("Contact Us");
        jButton4.setActionCommand("Contact");
        jButton4.addActionListener(evt -> {
            try {
                jButton4ActionPerformed(evt);
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(405, 405, 405)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGap(72, 72, 72)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jRadioButton8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel5))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jRadioButton9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jRadioButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jRadioButton7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel4))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jRadioButton6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3))
                            .addComponent(jLabel2))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 239, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton4)
                .addGap(63, 63, 63))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton6)
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton7)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jRadioButton9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jRadioButton10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(52, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>                        

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
    	try{
            Class.forName( "com.mysql.cj.jdbc.Driver" );
            java.sql.Connection connect = DriverManager.getConnection(
                    "jdbc:mysql://34.141.44.144:3306/feedback" , "root", "root" );

            Statement statement1 = ((java.sql.Connection) connect).createStatement();
            
            PreparedStatement statement = ((java.sql.Connection) connect).prepareStatement("insert into feedbacks  values (?,?,?)");
            if(jTextArea1.getText().equals("")) {
            	JFrame f = new JFrame();
                JOptionPane.showMessageDialog( f, "You should type something to send!" ); 
            }
            else {
            statement.setString(1, jTextArea1.getText() );
            }
            
            if(jRadioButton6.isSelected()){
            statement.setInt(2,5 );
            }
            else if(jRadioButton7.isSelected()){
                statement.setInt(2,4 );
            }
            else if(jRadioButton8.isSelected()){
                statement.setInt(2,3 );
            }
            else if(jRadioButton9.isSelected()){
             statement.setInt(2,2 );
             }
            else if(jRadioButton10.isSelected()){
             statement.setInt(2,1 );
             }
            else {
            	JFrame f = new JFrame();
                JOptionPane.showMessageDialog( f, "You should give a rate for us!" ); 
             }
             
             statement.setString(3, name );

            statement.executeUpdate();

            SettingsPage s = new SettingsPage();
            s.setVisible(true);
            setVisible(false);
            
            
        }
        catch( Exception e ) {
            System.out.println( e ) ;
            
        }    }                                        

    private void jRadioButton10ActionPerformed(java.awt.event.ActionEvent evt) {                                               
    	jRadioButton7.setSelected(false);
    	jRadioButton8.setSelected(false);
    	jRadioButton9.setSelected(false);
    	jRadioButton6.setSelected(false);
    }                                              

    private void jRadioButton9ActionPerformed(java.awt.event.ActionEvent evt) {                                              
    	jRadioButton7.setSelected(false);
    	jRadioButton8.setSelected(false);
    	jRadioButton6.setSelected(false);
    	jRadioButton10.setSelected(false);
    }                                             

    private void jRadioButton8ActionPerformed(java.awt.event.ActionEvent evt) {                                              
    	jRadioButton7.setSelected(false);
    	jRadioButton9.setSelected(false);
    	jRadioButton6.setSelected(false);
    	jRadioButton10.setSelected(false);
    }                                             

    private void jRadioButton7ActionPerformed(java.awt.event.ActionEvent evt) {                                              
    	jRadioButton6.setSelected(false);
    	jRadioButton8.setSelected(false);
    	jRadioButton9.setSelected(false);
    	jRadioButton10.setSelected(false);
    }                                             

    private void jRadioButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                              
    	jRadioButton7.setSelected(false);
    	jRadioButton8.setSelected(false);
    	jRadioButton9.setSelected(false);
    	jRadioButton10.setSelected(false);
    }                                             

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        SettingsPage s = new SettingsPage();
        s.setVisible(true);
        setVisible(false);
    }

    /**
     * Opens default mail app from Contact Us
     *
     * @param evt Action event
     * @throws IOException
     */
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) throws IOException {
    	 
        desktop = Desktop.getDesktop();
        String message = "mailto:refreminder@gmail.com?subject=About%20Refreminder%20App";
        URI uri = URI.create(message);
        desktop.mail(uri);
    }                                        

    private void jTextArea1MouseClicked(java.awt.event.MouseEvent evt) {  
    	if(count == 0) {
    		jTextArea1.setText("");
    		count++;
    	}
    	
    }   
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | UnsupportedLookAndFeelException | IllegalAccessException |
                 InstantiationException ex) {
            java.util.logging.Logger.getLogger(Feedback.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Feedback().setVisible(true));
    }

    /**
     * Get username from file
     *
     * @return Username
     * @throws FileNotFoundException
     */
    public static String textReader() throws FileNotFoundException
    {
        File file = new File("lib/logs/filename.txt");
        Scanner scan = new Scanner( file );
        String name = scan.next();
        scan.close();
        return name;
    }  

    // Variables declaration - do not modify                     
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton10;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JRadioButton jRadioButton7;
    private javax.swing.JRadioButton jRadioButton8;
    private javax.swing.JRadioButton jRadioButton9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration                   
}
