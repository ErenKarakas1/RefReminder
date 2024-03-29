package GUI;

import Logic.User;

import Logic.Food;
import Logic.FoodSelect;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.*;

/**
 * Removes food from database in StockControl page
 *
 * @author goksu
 */
public class Remove extends javax.swing.JFrame {
    // Properties
    String name;
    User user;
    FoodSelect sd;

    int index;
    DefaultListModel liss;
    ArrayList<Food> foodList1;
    ArrayList<String> foodList2;

    String[] strArray;


    /**
     * Creates new form Remove
     */
    public Remove() {
        sd = new FoodSelect();
        liss = new DefaultListModel();
        foodList1 = new ArrayList<>();
        foodList2 = new ArrayList<>();

        strArray = new String[sd.getFood().size()];

        try
        {
            user = new User( name );

            name = textReader();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("1");
        }

        setSize(455,309);
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
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        AutoCompleteDecorator.decorate(jComboBox1);


        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        foodList1.addAll(sd.getFood());
        String[] strArray = new String[foodList1.size()];

        for(int i = 0; i < foodList1.size(); i++) {
            strArray[i] = foodList1.get(i).getFoodName();

        }

        jComboBox1.setEditable(true);
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(strArray));
        jComboBox1.addActionListener(this::jComboBox1ActionPerformed);

        jLabel1.setFont(new java.awt.Font("Tahoma", Font.BOLD, 12)); // NOI18N
        jLabel1.setText("Remove Food From Storage:");

        jButton1.setText("Add");
        jButton1.addActionListener(this::jButton1ActionPerformed);

        jButton2.setText("Remove");
        jButton2.addActionListener(this::jButton2ActionPerformed);



        jLabel2.setFont(new java.awt.Font("Tahoma", Font.BOLD, 12)); // NOI18N
        jLabel2.setText("Selected Food/percentageString");

        jButton3.setText("Back");
        jButton3.setActionCommand("Back");
        jButton3.addActionListener(this::jButton3ActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel1))
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton1)
                                                .addGap(42, 42, 42)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jLabel2)
                                                                .addGap(10, 10, 10)))
                                                .addContainerGap(43, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(jButton3)
                                                .addGap(0, 0, Short.MAX_VALUE))))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2)
                                .addGap(70, 70, 70))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {

        String foodName = (String) jComboBox1.getSelectedItem();

        liss.addElement(foodName);
        foodList2.add(foodName);

        jList1.setModel(liss);


            for(int h = 0; h < liss.size(); h++){
                if(liss.getElementAt(h).equals(foodName)){
                    jComboBox1.removeItemAt( jComboBox1.getSelectedIndex() );
                }

        }

        jScrollPane1.setViewportView(jList1);

    }


    /**
     * Removes food from database
     *
     * @param evt Action event
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {

        jList1.getSelectedIndex();
        String driver = "com.mysql.cj.jdbc.Driver";
        String username = "root";
        String password = "root";
        String url = "jdbc:mysql://34.141.44.144:3306/" + name;
        try {
            for ( index = 0; index < foodList2.size(); index++ ) {
                String fname = foodList2.get( index );

                Class.forName(driver);
                java.sql.Connection conn2 = DriverManager.getConnection(url, username, password);
                Statement statement = ((java.sql.Connection) conn2).createStatement();
                String sql = "DELETE FROM food WHERE foodname = '" + fname + "'";
                statement.executeUpdate(sql);

            }


        }  catch( Exception e ) { e.printStackTrace(); }

        JFrame frame = new JFrame();

        int messageAnswer = JOptionPane.showConfirmDialog(frame, " Do you want to remove more?", "Quit", JOptionPane.YES_NO_CANCEL_OPTION);

        if (messageAnswer == JOptionPane.YES_OPTION) {

            liss = new DefaultListModel();
            jList1.setModel(liss);


        }
        if (messageAnswer == JOptionPane.CLOSED_OPTION) {

            liss = new DefaultListModel();
            jList1.setModel(liss);

        }

        else if (messageAnswer == JOptionPane.NO_OPTION) {
            StockControlPage stk = new StockControlPage();
            stk.setVisible(true);
            setVisible(false);
        }


    }

    /**
     * Returns to StockControl page
     *
     * @param evt Action event
     */
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        StockControlPage stk = new StockControlPage();
        stk.setVisible(true);
        setVisible(false);    }


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
            java.util.logging.Logger.getLogger(Remove.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Remove().setVisible(true));
    }


    // Variables declaration
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration
}
