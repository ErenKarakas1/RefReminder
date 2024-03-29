package GUI;

import Logic.PdfReader;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.lang.reflect.Array;
import java.net.URISyntaxException;

/**
 *
 * @author Amir Aliyev
 */
public class BilkentMenuPage extends javax.swing.JFrame {

    /**
     * Creates new form BilkentMenuPage
     */
    public BilkentMenuPage() throws IOException {
        setSize(840,510);
        setLocationRelativeTo(null);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() throws IOException {
        PdfReader e = new PdfReader();
        String[] lines = e.give().split(System.getProperty( "line.separator" ) );

        // GUI properties
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jButton9 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();

        // GUI setup
        setDefaultCloseOperation( javax.swing.WindowConstants.EXIT_ON_CLOSE );
        setBackground(new java.awt.Color( 255, 255, 255 ) );
        setPreferredSize(new java.awt.Dimension(840, 510 ) );

        jPanel1.setBackground(new java.awt.Color( 255, 255, 255 ) );
        jPanel1.setLayout(new java.awt.GridLayout( 1, 0));

        jButton1.setBackground(new java.awt.Color( 255, 102, 255 ) );
        jButton1.setFont(new java.awt.Font( "Times New Roman", Font.PLAIN, 12 ) );
        jButton1.setText( "Main Menu" );
        jButton1.setToolTipText( "" );
        jButton1.setPreferredSize(new java.awt.Dimension(120, 35 ) );
        jButton1.addActionListener(evt -> {
            try {
                jButton1ActionPerformed( evt );
            } catch ( IOException ex ) {
                ex.printStackTrace();
            }
        });
        jPanel1.add( jButton1 );

        jButton2.setBackground(new java.awt.Color(255, 51, 51 ) );
        jButton2.setFont( new java.awt.Font( "Times New Roman", Font.PLAIN, 12 ) );
        jButton2.setText( "Stock Control" );
        jButton2.setPreferredSize( new java.awt.Dimension(120, 35 ) );
        jButton2.addActionListener(this::jButton2ActionPerformed);
        jPanel1.add(jButton2);

        jButton3.setBackground(new java.awt.Color( 0, 153, 0 ) );
        jButton3.setFont(new java.awt.Font("Times New Roman", Font.PLAIN, 12 ) );
        jButton3.setText( "Reciper" );
        jButton3.setPreferredSize( new java.awt.Dimension(120, 35 ) );
        jButton3.setPreferredSize( new java.awt.Dimension(120, 35 ) );
        jButton3.addActionListener(evt -> {
            try {
                jButton3ActionPerformed( evt );
            } catch ( IOException | InterruptedException ex ) {
                ex.printStackTrace();
            }
        });
        jPanel1.add( jButton3 );

        jButton4.setBackground( new java.awt.Color(255, 51, 0 ) );
        jButton4.setFont( new java.awt.Font("Times New Roman", Font.PLAIN, 12 ) ); // NOI18N
        jButton4.setText( "Restaurants" );
        jButton4.setPreferredSize( new java.awt.Dimension(120, 35 ) );
        jButton4.setPreferredSize( new java.awt.Dimension(120, 35 ) );
        jButton4.addActionListener(this::jButton4ActionPerformed);
        jPanel1.add( jButton4 );

        jButton5.setBackground(new java.awt.Color(51, 153, 255 ) );
        jButton5.setFont(new java.awt.Font("Times New Roman", Font.PLAIN, 12 ) ); // NOI18N
        jButton5.setText( "Bilkent Menu" );
        jButton5.setPreferredSize( new java.awt.Dimension(120, 35 ) );
        jButton5.setPreferredSize( new java.awt.Dimension(120, 35 ) );
        jPanel1.add( jButton5 );

        jButton6.setBackground(new java.awt.Color(102, 255, 102));
        jButton6.setFont(new java.awt.Font("Times New Roman", Font.PLAIN, 12)); // NOI18N
        jButton6.setText("Shopping");
        jButton6.setPreferredSize(new java.awt.Dimension(120, 35));
        jButton6.setPreferredSize(new java.awt.Dimension(120, 35));
        jButton6.addActionListener(this::jButton6ActionPerformed);
        jPanel1.add(jButton6);

        jButton7.setBackground(new java.awt.Color(0, 255, 204));
        jButton7.setFont(new java.awt.Font("Times New Roman", Font.PLAIN, 12)); // NOI18N
        jButton7.setText("Settings");
        jButton7.setPreferredSize(new java.awt.Dimension(120, 35));
        jButton7.setPreferredSize(new java.awt.Dimension(120, 35));
        jButton7.addActionListener(this::jButton7ActionPerformed);
        jPanel1.add(jButton7);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setPreferredSize(new java.awt.Dimension(840, 445));

        jLabel5.setFont(new java.awt.Font("Tahoma", Font.BOLD, 18)); // NOI18N
        jLabel5.setText("Dinner");

        jButton8.setText("Monday");
        jButton8.addActionListener(evt -> {
            jButton8ActionPerformed(evt);
            int n = 0;
            jLabel8.setText("<html>" + "<br>" + Array.get(lines, n) + "<br>" + Array.get(lines, n + 1) + "<br>" + Array.get(lines, n + 2) +
                    "<br>" + Array.get(lines, n + 3) +  "<br>" + Array.get(lines, n + 4) + "<br>" + "</html>");
            jLabel9.setText("<html>" + "<br>" + Array.get(lines, n + 5) + "<br>" + Array.get(lines, n + 6) + "<br>" + Array.get(lines, n + 7) +
                    "<br>" + Array.get(lines, n + 8) +  "<br>" + Array.get(lines, n + 9) + "<br>" + "</html>");
        });

        jLabel2.setIcon(new javax.swing.ImageIcon("lib/images/bilkent.png")); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", Font.BOLD, 22)); // NOI18N
        jLabel1.setText("Bilkent Menu");

        jButton9.setText("Tuesday");
        jButton9.addActionListener(evt -> {
            jButton9ActionPerformed(evt);
            int n = 10;
            jLabel8.setText("<html>" + "<br>" + Array.get(lines, n) + "<br>" + Array.get(lines, n + 1) + "<br>" + Array.get(lines, n + 2) +
                    "<br>" + Array.get(lines, n + 3) +  "<br>" + Array.get(lines, n + 4) + "<br>" + "</html>");
            jLabel9.setText("<html>" + "<br>" + Array.get(lines, n + 5) + "<br>" + Array.get(lines, n + 6) + "<br>" + Array.get(lines, n + 7) +
                    "<br>" + Array.get(lines, n + 8) +  "<br>" + Array.get(lines, n + 9) + "<br>" + "</html>");
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", Font.BOLD, 16)); // NOI18N
        jLabel3.setText("Select the Day");

        jButton10.setText("Wednesday");
        jButton10.addActionListener(evt -> {
            jButton10ActionPerformed(evt);
            int n = 20;
            jLabel8.setText("<html>" + "<br>" + Array.get(lines, n) + "<br>" + Array.get(lines, n + 1) + "<br>" + Array.get(lines, n + 2) +
                    "<br>" + Array.get(lines, n + 3) +  "<br>" + Array.get(lines, n + 4) + "<br>" + "</html>");
            jLabel9.setText("<html>" + "<br>" + Array.get(lines, n + 5) + "<br>" + Array.get(lines, n + 6) + "<br>" + Array.get(lines, n + 7) +
                    "<br>" + Array.get(lines, n + 8) +  "<br>" + Array.get(lines, n + 9) + "<br>" + "</html>");
        });

        jButton11.setText("Thursday");
        jButton11.addActionListener(evt -> {
            jButton11ActionPerformed(evt);
            int n = 30;
            jLabel8.setText("<html>" + "<br>" + Array.get(lines, n) + "<br>" + Array.get(lines, n + 1) + "<br>" + Array.get(lines, n + 2) +
                    "<br>" + Array.get(lines, n + 3) +  "<br>" + Array.get(lines, n + 4) + "<br>" + "</html>");
            jLabel9.setText("<html>" + "<br>" + Array.get(lines, n + 5) + "<br>" + Array.get(lines, n + 6) + "<br>" + Array.get(lines, n + 7) +
                    "<br>" + Array.get(lines, n + 8) +  "<br>" + Array.get(lines, n + 9) + "<br>" + "</html>");
        });

        jButton12.setText("Friday");
        jButton12.addActionListener(evt -> {
            jButton12ActionPerformed(evt);
            int n = 40;
            jLabel8.setText("<html>" + "<br>" + Array.get(lines, n) + "<br>" + Array.get(lines, n + 1) + "<br>" + Array.get(lines, n + 2) +
                    "<br>" + Array.get(lines, n + 3) +  "<br>" + Array.get(lines, n + 4) + "<br>" + "</html>");
            jLabel9.setText("<html>" + "<br>" + Array.get(lines, n + 5) + "<br>" + Array.get(lines, n + 6) + "<br>" + Array.get(lines, n + 7) +
                    "<br>" + Array.get(lines, n + 8) +  "<br>" + Array.get(lines, n + 9) + "<br>" + "</html>");
        });

        jButton13.setText("Saturday");
        jButton13.addActionListener(evt -> {
            jButton13ActionPerformed(evt);
            int n = 50;
            jLabel8.setText("<html>" + "<br>" + Array.get(lines, n) + "<br>" + Array.get(lines, n + 1) + "<br>" + Array.get(lines, n + 2) +
                    "<br>" + Array.get(lines, n + 3) +  "<br>" + Array.get(lines, n + 4) + "<br>" + "</html>");
            jLabel9.setText("<html>" + "<br>" + Array.get(lines, n + 5) + "<br>" + Array.get(lines, n + 6) + "<br>" + Array.get(lines, n + 7) +
                    "<br>" + Array.get(lines, n + 8) +  "<br>" + Array.get(lines, n + 9) + "<br>" + "</html>");
        });

        jButton14.setText("Sunday");
        jButton14.addActionListener(evt -> {
            jButton14ActionPerformed(evt);
            int n = 60;
            jLabel8.setText("<html>" + "<br>" + Array.get(lines, n) + "<br>" + Array.get(lines, n + 1) + "<br>" + Array.get(lines, n + 2) +
                    "<br>" + Array.get(lines, n + 3) +  "<br>" + Array.get(lines, n + 4) + "<br>" + "</html>");
            jLabel9.setText("<html>" + "<br>" + Array.get(lines, n + 5) + "<br>" + Array.get(lines, n + 6) + "<br>" + Array.get(lines, n + 7) +
                    "<br>" + Array.get(lines, n + 8) +  "<br>" + Array.get(lines, n + 9) + "<br>" + "</html>");
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", Font.BOLD, 18)); // NOI18N
        jLabel4.setText("Lunch");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
        );

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 578, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGap(0, 135, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                                .addGap(57, 57, 57)
                                                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                                .addGap(236, 236, 236)
                                                                .addComponent(jLabel4)))
                                                .addGap(0, 0, Short.MAX_VALUE))
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel3)
                                                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                                .addComponent(jButton14, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jButton13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jButton12, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jButton11, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jButton10, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 110, Short.MAX_VALUE)
                                                                .addComponent(jButton9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(jButton8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                                                .addComponent(jLabel5)
                                                                .addGap(235, 235, 235))
                                                        .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addComponent(jLabel2)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel3)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton8)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton9)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton10)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton11)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(jButton12)
                                                        .addComponent(jLabel5)))
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addComponent(jLabel1)
                                                .addGap(18, 18, 18)
                                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addComponent(jButton13)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton14))
                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>

    /**
     * Opens MainMenu page
     *
     * @param evt Action event
     * @throws IOException
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) throws IOException {
        this.dispose();
        new MainMenu().setVisible(true);
    }

    /**
     * Opens Recipe page
     *
     * @param evt Action event
     * @throws IOException
     * @throws InterruptedException
     */
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) throws IOException, InterruptedException {
        this.dispose();
        try {
            new RecipePage().setVisible(true);
        } catch (InterruptedException | IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Opens Restaurant page
     *
     * @param evt Action event
     */
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
        try {
            new RestaurantsPage().setVisible(true);
        } catch (InterruptedException | IOException | URISyntaxException e) {
            e.printStackTrace();
        }
    }

    /**
     * Opens Shopping page
     *
     * @param evt Action event
     */
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
        new ShoppingPage().setVisible(true);
    }

    /**
     * Opens Settings page
     *
     * @param evt Action event
     */
    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
        new SettingsPage().setVisible(true);
    }

    /**
     * Opens StockControl page
     *
     * @param evt Action event
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
        new StockControlPage().setVisible(true);
    }

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton14ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
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
            java.util.logging.Logger.getLogger(BilkentMenuPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new BilkentMenuPage().setVisible(true);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    // Variables declaration
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    // End of variables declaration                   
}
