package GUI;

import Logic.Food;
import APIs.src.java.net.http.SpoonacularAPI;

import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.sql.*;
import java.awt.event.MouseAdapter;
import java.awt.event.KeyAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

import javax.swing.*;

/**
 * Adding food that user selected to storage. To search food that user wants to add, the app is calling Spoonacular Rest Api methods and give some results to user.
 * @author H.Emre
 * @date 31.07.2021
 */
public class AddFoodGUI extends javax.swing.JFrame {

    /**
     * Creates new form Remove
     */
    public AddFoodGUI(SpoonacularAPI foodApi ) {
        this.foodApi = foodApi;

        // Try to get username from file
        try
        {
            name = textReader();
        }
        catch( FileNotFoundException e)
        {
            System.out.println( "1" );
        }

        initComponents();
        setBackground( new Color( 100,150,250 ) );
        setPreferredSize( new Dimension( 561, 284 ) );
        setLocationRelativeTo( null );
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings( "unchecked" )
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        // Properties
        foodList = new String[8];
        labels = new ArrayList<>();
        foods = new ArrayList<>();

        // GUI properties
        jPanel1 = new javax.swing.JPanel();
        jLabelRemove = new javax.swing.JLabel();
        jButtonAdd = new javax.swing.JButton();
        jButtonAddAll = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabelName = new javax.swing.JLabel();
        jButtonBack = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextFieldAmount = new javax.swing.JTextField( 10);
        jLabelRemove1 = new javax.swing.JLabel();
        listModel = new DefaultListModel();
        jTable1 = new javax.swing.JTable();

        // GUI setup
        jPanel1.setBackground( new Color( 240,248,255 ) );
        jPanel2.setBackground(  new Color( 240,248,255 ) );
        jButtonBack.setBackground( new Color( 175,0,42 ) );
        jButtonAdd.setBackground( new Color( 128,119,110 ) );
        jButtonAddAll.setBackground( new Color( 128,119,110 ));

        labels.add( jLabel1 );
        labels.add( jLabel2 );
        labels.add( jLabel3 );
        labels.add( jLabel4 );

        for ( JLabel label: labels ) {
            label.setFont( FONT );
            label.addMouseListener( new AddFoodGUI.labelsListener( labels.indexOf(label), this ) );
        }

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabelRemove.setFont( new java.awt.Font("Tahoma", Font.BOLD, 12 ) );
        jLabelRemove.setText( "Search and Select Food" );

        jButtonAdd.setLabel( "Add List" );
        jButtonAdd.addActionListener(this::jButtonAddActionPerformed);

        jButtonAddAll.setText( "Add All" );
        jButtonAddAll.addActionListener(this::jButtonAddAllActionPerformed);

        jTable1.setEnabled( false );
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null},
                        {null, null},
                        {null, null},
                        {null, null},
                        {null, null},
                        {null, null},
                        {null, null}
                },
                new String [] {
                        "Food", "Amount"
                }
        ));


        jScrollPane1.setViewportView( jTable1 );

        jLabelName.setFont( new java.awt.Font("Tahoma", Font.BOLD, 12 ) );
        jLabelName.setText( "Selected Food(percentageString)" );


        jButtonBack.setText( "Back" );
        jButtonBack.addActionListener(this::jButtonBackActionPerformed);

        jTextField1.addKeyListener( new textFieldListener() );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout( jPanel2 );
        jPanel2.setLayout( jPanel2Layout );
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup( jPanel2Layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
                                        .addComponent( jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE )
                                        .addComponent( jLabel2 )
                                        .addComponent( jLabel3 )
                                        .addComponent( jLabel4 ) )
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
                        .addGroup( jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent( jLabel1 )
                                .addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.UNRELATED )
                                .addComponent( jLabel2 )
                                .addPreferredGap( javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE )
                                .addComponent( jLabel3)
                                .addGap( 12, 12, 12 )
                                .addComponent( jLabel4 )
                                .addContainerGap())
        );

        jLabelRemove1.setFont(new java.awt.Font("Tahoma", Font.BOLD, 12)); // NOI18N
        jLabelRemove1.setText("Add Amount(g)");

        // Layout
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout( jPanel1 );
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent( jButtonBack ) )
                                        .addGroup( jPanel1Layout.createSequentialGroup()
                                                .addGap( 42, 42, 42 )
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false )
                                                        .addComponent( jLabelRemove, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE )
                                                        .addComponent( jTextField1)
                                                        .addComponent( jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE ) )
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap( 72, 72, 72 )
                                                                .addComponent(jLabelRemove1))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap( 52, 52, 52 )
                                                                .addComponent(jTextFieldAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap( 67, 67, 67 )
                                                                .addComponent( jButtonAdd ) ) )
                                                .addGap(58, 58, 58 )
                                                .addGroup( jPanel1Layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
                                                        .addComponent( jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE )
                                                        .addComponent( jLabelName )
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(6, 6, 6)
                                                                .addComponent( jButtonAddAll, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE ) ) ) ) )
                                .addContainerGap( 53, Short.MAX_VALUE ) )
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup( javax.swing.GroupLayout.Alignment.LEADING )
                        .addGroup( jPanel1Layout.createSequentialGroup()
                                .addGap( 44, 44, 44 )
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent( jLabelRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE )
                                        .addComponent( jLabelRemove1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE )
                                        .addComponent( jLabelName ) )
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(jButtonAddAll)
                                                .addGap(0, 73, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jTextFieldAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(71, 71, 71)
                                                                .addComponent(jButtonAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButtonBack, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap())
        );

        jLabelRemove.getAccessibleContext().setAccessibleName("Search and Select Food");
        jButtonAddAll.getAccessibleContext().setAccessibleName("AddAll");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
        );

        pack();
    }// </editor-fold>



    public class textFieldListener extends KeyAdapter{

        // Autocomplete suggestions
        public void keyReleased(java.awt.event.KeyEvent evt) {
            jPanel2.setBackground(Color.lightGray );
            updateLabels();
            String text;

            text = ( (JTextField) evt.getSource() ).getText();

            if( ! text.equals( "" ) ) {
                try {
                    foodList = foodApi.getFoodId( text );

                } catch (IOException | InterruptedException e) {
                    e.printStackTrace();
                }

                updateLabels();
            }
        }
    }

    /**
     * Go back to StockControl page
     *
     * @param evt Action event
     */
    private void jButtonBackActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
        new StockControlPage().setVisible(true);
    }

    /**
     * Adds food to the table
     *
     * @param evt Action event
     */
    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {
        String amountStr;
        amountStr = findJustDigit( jTextFieldAmount.getText() );

        if( ! amountStr.equals( "" ) )
            if ( Integer.parseInt( amountStr ) > 0 && Integer.parseInt( amountStr ) < 10000 )
                amount = Integer.parseInt( amountStr );

        int count = 0;
        for ( int i = 0; i< jTable1.getRowCount(); i++){
            if ( jTable1.getValueAt( i, 1) != null )
                count++;
        }
        boolean isAmount = true;
        if ( count >= 1 ) {
            if (jTable1.getValueAt(count , 0) == null) {
                isAmount = false;
            }
        }
        if ( count < jTable1.getRowCount() && isAmount ){
            jTable1.setValueAt(amount , count, 1);
            food.setAmount( amount );
        }
        foods.add( food );
        jTextFieldAmount.setText( "" );
    }

    
    /**
     * Adding all foods that user selected to sql database when the button is pressed
     *
     * @param evt ActionEvent
     */
    private void jButtonAddAllActionPerformed(java.awt.event.ActionEvent evt) {
        for ( Food food : foods ){
            //System.out.println( "ID: " + food.getId() + " Name: " + food.toString() + " Main: " + food.getMain() + " Calorie: " + food.getCaloriePerPortion() );
            if( food.getMain().contains( ";" ) ){
                String[] mains = food.getMain().split(";");
                for (String main : mains) {

                    if (main.equals("Meat") || main.equals("Seafood") || main.equals("Baking")) {
                        food.setMain("Main Dishes");
                        food.setExpiryDate(180);
                        break;
                    } else if (main.equals("Health Foods") || main.equals("Produce") || main.equals("Dried Fruits") || main.equals("Nuts") || main.equals("Pasta and Rice")) {
                        if (food.getMain().equals("Dried Fruits") || main.equals("Nuts"))
                            food.setExpiryDate(365);
                        else
                            food.setExpiryDate(21);
                        food.setMain("Produce");
                        break;
                    } else if (main.equals("Refrigerated") || main.equals("Frozen")) {
                        food.setMain("Freezer");
                        food.setExpiryDate(365);
                        break;
                    } else if (main.equals("Tea and Coffee") || main.equals("Beverages") || main.equals("Alcoholic Beverages")) {
                        food.setMain("Drink");
                        food.setExpiryDate(365);
                        break;
                    } else if (main.equals("Bakery/Bread") || main.equals("Nut butters, Jams, and Honey") || main.equals("Bread") || main.equals("Milk, Eggs, Other Dairy") || main.equals("Cheese") || main.equals("Cereal")) {
                        food.setMain("Breakfast");
                        food.setExpiryDate(60);
                        break;
                    } else if (main.equals("Condiments") || main.equals("Ethnic Foods") || main.equals("Spices and Seasonings") || main.equals("Oil, Vinegar, Salad Dressing") || main.equals("Savory Snacks") || main.equals("Sweet Snacks") || main.equals("Canned and Jarred") || main.equals("Gourmet") || main.equals("Grilling Supplies") || main.equals("Online") || main.equals("Homemade") || main == null || main.equals("")) {
                        food.setMain("Food Addons");
                        food.setExpiryDate(365);
                        break;
                    }

                }
            }
            else{
                if ( food.getMain().equals( "Meat" ) || food.getMain().equals( "Seafood" ) ||  food.getMain().equals( "Baking" ) ){
                    food.setMain( "Main Dishes" );
                    food.setExpiryDate( 180 );
                }
                else if ( food.getMain().equals( "Health Foods" ) || food.getMain().equals( "Produce" ) || food.getMain().equals( "Dried Fruits" ) || food.getMain().equals( "Nuts" ) || food.getMain().equals( "Pasta and Rice" ) ) {
                    if( food.getMain().equals( "Dried Fruits" ) || food.getMain().equals( "Nuts" ))
                        food.setExpiryDate( 365 );
                    else{
                        food.setExpiryDate( 21 );
                    }
                    food.setMain("Produce");
                }
                else if ( food.getMain().equals( "Refrigerated" ) || food.getMain().equals( "Frozen" ) ) {
                    food.setMain("Freezer");
                    food.setExpiryDate( 365 );
                }
                else if ( food.getMain().equals( "Tea and Coffee" ) || food.getMain().equals( "Beverages" )|| food.getMain().equals( "Alcoholic Beverages" ) ) {
                    food.setMain("Drink");
                    food.setExpiryDate( 365 );
                }
                else if ( food.getMain().equals( "Bakery/Bread" ) || food.getMain().equals( "Nut butters, Jams, and Honey" ) || food.getMain().equals( "Bread" ) || food.getMain().equals( "Milk, Eggs, Other Dairy" ) || food.getMain().equals( "Cheese" ) || food.getMain().equals( "Cereal" )) {
                    food.setMain("Breakfast");
                    food.setExpiryDate( 60 );
                }
                else if ( food.getMain().equals( "Ethnic Foods" ) || food.getMain().equals( "Condiments" ) || food.getMain().equals( "Spices and Seasonings" ) || food.getMain().equals( "Oil, Vinegar, Salad Dressing" ) || food.getMain().equals( "Savory Snacks" ) || food.getMain().equals( "Sweet Snacks" ) || food.getMain().equals( "Canned and Jarred" ) || food.getMain().equals( "Gourmet" ) || food.getMain().equals( "Grilling Supplies" ) || food.getMain().equals( "Online" ) || food.getMain().equals( "Homemade" ) || food.getMain() == null || food.getMain().equals( "" )) {
                    food.setMain( "Food Addons" );
                    food.setExpiryDate( 365 );
                }
            }

            int id1 = food.getId();
            String foodname1 = food.getFoodName(); //
            int expirydate1 = food.getExpiryDate(); //
            String main1 = food.getMain();
            double quantity1 = food.getAmount();
            double calorie1 = food.getCaloriePerPortion().doubleValue();

            // Manipulate database
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                java.sql.Connection connect = DriverManager.getConnection(
                        "jdbc:mysql://34.141.44.144:3306/" + name, "root", "root");

                PreparedStatement statement = ((java.sql.Connection) connect).prepareStatement("insert into food  values (?,?,?,?,?,?)");

                statement.setInt(1, id1);
                statement.setString(2, foodname1);
                statement.setInt(3, expirydate1);
                statement.setString(4, main1);
                statement.setDouble(5, quantity1);
                statement.setDouble(6, calorie1);

                statement.executeUpdate();

            } catch (Exception e) {
                System.out.println(e);

            }
        }


        jTable1.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                        {null, null},
                        {null, null},
                        {null, null},
                        {null, null},
                        {null, null},
                        {null, null},
                        {null, null}
                },
                new String [] {
                        "Food", "Amount"
                }
        ));

        jTextField1.setText( "" );
        updateLabels();

        JFrame f = new JFrame();
        f.setBackground( new Color( 100,150,250 ) );
        JOptionPane.showMessageDialog(f,"All list has been added to storage.");
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

    /**
     * Labels Listener Class to display results of Spoonacular API method when user search wanted food 
     */
    private class labelsListener extends MouseAdapter{
        private int index;
        private AddFoodGUI frame;
        //Constructor

        public labelsListener( int index, AddFoodGUI frame ) {
            this.index = index;
            this.frame = frame;
        }

        public void mouseClicked( MouseEvent event ) {

            foodName = ( (JLabel) event.getSource() ).getText();

            if ( ! foodName.equals("") ) {

                //System.out.println( foodName );
                int index = -1;
                for (int count = 0; count < foodList.length; count++) {
                    if (Objects.equals(foodList[count], foodName))
                        index = count + foodList.length / 2;
                }

                if (index != -1) {
                    try {
                        food = foodApi.getFoodInformation(Integer.parseInt(foodList[index]));
                        //System.out.println( "ID: " + food.getId() + " Name: " + food.toString() + " Main: " + food.getMain() + " Calorie: " + food.getCaloriePerPortion() );
                    } catch (IOException | InterruptedException e) {
                        e.printStackTrace();
                    }
                }

                int count = 0;
                for ( int i = 0; i< jTable1.getRowCount(); i++){
                    if ( jTable1.getValueAt( i, 0) != null )
                        count++;
                }
                boolean isAmount = true;
                if ( count >= 1 )
                    if ( jTable1.getValueAt( count - 1, 1) == null )
                        isAmount = false;

                if ( count < jTable1.getRowCount() && isAmount && containFood(jTable1, foodName))
                    jTable1.setValueAt(foodName , count, 0);

            }
        }
        public void mouseEntered( MouseEvent event ) {
            Font font = labels.get( index ).getFont();
            labels.get(index).setFont( font.deriveFont( Font.BOLD ) );
        }

        public void mouseExited( MouseEvent e ) {
            labels.get(index).setFont( FONT );
        }
    }

    /**
     * Finding whether table contains food that is selected before
     *
     * @param jTable1 JTable
     * @param foodName String 
     * @return boolean 
     */
    private static boolean containFood( JTable jTable1 , String foodName ){
        for ( int i = 0; i< jTable1.getRowCount(); i++) {
            if (jTable1.getValueAt(i, 0) != null)
                if (jTable1.getValueAt(i, 0).equals(foodName))
                    return false;
        }
        return true;
    }

    /**
     * Finding just digits when user add amount of food to storage
     *
     * @param str String all text in text field
     * @return data String string that contains just digits
     */
    private static String findJustDigit( String str ){
        StringBuilder data = new StringBuilder();
        for( int count = 0; count < str.length(); count++ ){
            if ( Character.isDigit( str.charAt( count ) ) )
                data.append(str.charAt( count ) );
        }
        return data.toString();
    }

    /**
     * Updating labels
     */
    public void updateLabels(){

        if ( foodList != null && foodList.length != 0 ) {
            jPanel2.setBackground( Color.lightGray );
            if ( foodList[0] != null && Character.isAlphabetic( foodList[0].charAt(0) ) )
                jLabel1.setText(foodList[0]);
            else{
                jLabel1.setText( "" );
                jLabel2.setText( "" );
                jLabel3.setText( "" );
                jLabel4.setText( "" );
            }

            if( foodList.length > 1 ){
                if (foodList[1] != null && Character.isAlphabetic( foodList[1].charAt(0) ) )
                    jLabel2.setText(foodList[1]);
                else{
                    jLabel2.setText( "" );
                    jLabel3.setText( "" );
                    jLabel4.setText( "" );
                }
            }

            if( foodList.length > 2 ){
                if ( foodList[2] != null && Character.isAlphabetic( foodList[2].charAt(0) ) )
                    jLabel3.setText(foodList[2]);
                else{
                    jLabel3.setText( "" );
                    jLabel4.setText( "" );
                }
            }

            if( foodList.length > 3 ){
                if (foodList[3] != null && Character.isAlphabetic( foodList[3].charAt(0) ) )
                    jLabel4.setText(foodList[3]);
                else{
                    jLabel4.setText( "" );
                }
            }

        }
        if( jTextField1.getText().equals("") ){
            jPanel2.setBackground( jPanel1.getBackground() );
            jLabel1.setText( "" );
            jLabel2.setText( "" );
            jLabel3.setText( "" );
            jLabel4.setText( "" );
        }

    }

    // Property declarations
    private ArrayList<Food> foods;
    private DefaultListModel listModel;
    public final static Font FONT = new Font( "Comic Sans MS" , Font.PLAIN, 12);
    private Food food ;
    private double amount;
    private SpoonacularAPI foodApi;
    private String[] foodList;
    private String foodName = "";
    private ArrayList<JLabel> labels;
    private javax.swing.JTable jTable1;
    // Variables declaration - do not modify
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonAddAll;
    private javax.swing.JButton jButtonBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelRemove;
    private javax.swing.JLabel jLabelRemove1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextFieldAmount;
    private String name;
    // End of variables declaration

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch ( ClassNotFoundException | InstantiationException | IllegalAccessException | UnsupportedLookAndFeelException ex ) {
            java.util.logging.Logger.getLogger(Remove.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        String apiKey = "2b1ad64154msh266681e9461a336p1bfd1bjsndcdef3e10f2a";
        String apiKey2 = "609871132cmshf0661655cd3fa40p1266fbjsn0a5ce850b254";
        String apiKey3 = "da73587c8emsh6ca56b7d9f2a385p1699dcjsnf6a7ee99f8e3";

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new AddFoodGUI( new SpoonacularAPI() ).setVisible(true));
    }
}

