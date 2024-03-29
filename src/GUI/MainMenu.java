package GUI;

import Logic.FoodSelect;
import Logic.PdfReader;
import Logic.User;
import Logic.Food;
import APIs.src.java.net.http.SpoonacularAPI;

import javax.swing.*;
import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Array;
import java.net.URISyntaxException;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
* Main Menu GUI - The page gives user some information about their storage, current day of bilkent menu, and some interesting jokes and facts
* @author goksu
* @author H.Emre Tas
* @author Amir Aliyev
*/
public class MainMenu extends javax.swing.JFrame {
    /**
     * Creates new form MainPageGui
     */
    public MainMenu() throws IOException {
        // Get username from file
        try
        {
            user = new User( name );

            name = textReader();
        }
        catch(FileNotFoundException e)
        {
            System.out.println("1");
        }
        setSize(1050,500);
        setLocationRelativeTo(null);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() throws IOException {

        // GUI properties
        jPanel1 = new javax.swing.JPanel();
        jButtonMain = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButtonSettings = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabelUser = new javax.swing.JLabel();
        jLabelCountry = new javax.swing.JLabel();
        jLabelProvince = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane6 = new javax.swing.JScrollPane();
        jTextAreaRefri = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jLabelLunch = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        jLabelDinner = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane8 = new javax.swing.JScrollPane();
        jTextAreaStrange = new javax.swing.JTextArea();
        jPanel6 = new javax.swing.JPanel();
        jScrollPane7 = new javax.swing.JScrollPane();
        jTextAreaJokes = new javax.swing.JTextArea();

        // Setup GUI elements
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jButtonMain.setBackground(new java.awt.Color(255, 102, 255));
        jButtonMain.setFont(new java.awt.Font("Times New Roman", Font.PLAIN, 12)); // NOI18N
        jButtonMain.setText("Main Menu");
        jButtonMain.setPreferredSize(new java.awt.Dimension(120, 35));
        jButtonMain.addActionListener(this::jButtonMainActionPerformed);

        jButton2.setBackground(new java.awt.Color(255, 51, 51));
        jButton2.setFont(new java.awt.Font("Times New Roman", Font.PLAIN, 12)); // NOI18N
        jButton2.setText("Stock Control");
        jButton2.setPreferredSize(new java.awt.Dimension(120, 35));
        jButton2.addActionListener(this::jButton2ActionPerformed);

        jButton3.setBackground(new java.awt.Color(0, 153, 0));
        jButton3.setFont(new java.awt.Font("Times New Roman", Font.PLAIN, 12)); // NOI18N
        jButton3.setText("Reciper");
        jButton3.setPreferredSize(new java.awt.Dimension(120, 35));
        jButton3.addActionListener(evt -> {
            try {
                jButton3ActionPerformed(evt);
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        });

        jButton4.setBackground(new java.awt.Color(255, 51, 0));
        jButton4.setFont(new java.awt.Font("Times New Roman", Font.PLAIN, 12)); // NOI18N
        jButton4.setText("Restaurants");
        jButton4.setPreferredSize(new java.awt.Dimension(120, 35));
        jButton4.addActionListener(evt -> {
            jButton4ActionPerformed(evt);
            RestaurantsPage restaurant = null;

        });

        jButton5.setBackground(new java.awt.Color(51, 153, 255));
        jButton5.setFont(new java.awt.Font("Times New Roman", Font.PLAIN, 12)); // NOI18N
        jButton5.setText("Bilkent Menu");
        jButton5.setPreferredSize(new java.awt.Dimension(120, 35));
        jButton5.addActionListener(this::jButton5ActionPerformed);

        jButton6.setBackground(new java.awt.Color(102, 255, 102));
        jButton6.setFont(new java.awt.Font("Times New Roman", Font.PLAIN, 12)); // NOI18N
        jButton6.setText("Shopping");
        jButton6.setPreferredSize(new java.awt.Dimension(120, 35));
        jButton6.addActionListener(this::jButton6ActionPerformed);

        jButtonSettings.setBackground(new java.awt.Color(0, 255, 204));
        jButtonSettings.setFont(new java.awt.Font("Times New Roman", Font.PLAIN, 12)); // NOI18N
        jButtonSettings.setText("Settings");
        jButtonSettings.setPreferredSize(new java.awt.Dimension(120, 35));
        jButtonSettings.addActionListener(this::jButtonSettingsActionPerformed);

        jLabel1.setFont(new java.awt.Font("Tahoma", Font.BOLD, 18)); // NOI18N
        jLabel1.setText("Main Menu");

        jLabel2.setFont(new java.awt.Font("Tahoma", Font.BOLD, 14)); // NOI18N
        jLabel2.setText("User Information");

        jLabel3.setFont(new java.awt.Font("Tahoma", Font.BOLD, 14)); // NOI18N
        jLabel3.setText("RefriMini");

        jLabel5.setFont(new java.awt.Font("Tahoma", Font.BOLD, 14)); // NOI18N
        jLabel5.setText("Strange Information ");

        jLabel6.setFont(new java.awt.Font("Tahoma", Font.BOLD, 14)); // NOI18N
        jLabel6.setText("Jokes");

        jPanel2.setBackground(new java.awt.Color(0, 153, 102));

        jLabel9.setFont(new java.awt.Font("Tahoma", Font.BOLD, 14)); // NOI18N
        jLabel9.setText("Username:");

        jLabel10.setFont(new java.awt.Font("Tahoma", Font.BOLD, 14)); // NOI18N
        jLabel10.setText("Country:");

        jLabel11.setFont(new java.awt.Font("Tahoma", Font.BOLD, 14)); // NOI18N
        jLabel11.setText("Province:");

        jLabelUser.setFont(new java.awt.Font("Tahoma", Font.BOLD, 13)); // NOI18N
        jLabelUser.setText( user.getUsername() );

        jLabelCountry.setFont(new java.awt.Font("Tahoma", Font.BOLD, 13)); // NOI18N
        jLabelCountry.setText(user.getCountry());

        jLabelProvince.setFont(new java.awt.Font("Tahoma", Font.BOLD, 13)); // NOI18N
        jLabelProvince.setText(user.getProvince());

        // Layout
        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(25, 25, 25)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabelCountry)
                                        .addComponent(jLabelUser)
                                        .addComponent(jLabelProvince))
                                .addContainerGap(116, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(29, 29, 29)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabelUser))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel10)
                                        .addComponent(jLabelCountry))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabelProvince))
                                .addContainerGap(36, Short.MAX_VALUE))
        );

        jPanel3.setBackground(new java.awt.Color(0, 204, 204));
        jTextAreaRefri.setBackground( new java.awt.Color(0, 204, 204) );
        jTextAreaRefri.setColumns(20);
        jTextAreaRefri.setRows(5);
        FoodSelect foodSelect = new FoodSelect();
        jScrollPane6.setViewportView( jTextAreaRefri );

        jTextAreaRefri.setLineWrap( true );
        jTextAreaRefri.setWrapStyleWord( true );
        jTextAreaRefri.append( "\n" );
        jTextAreaRefri.append( "There are " + foodSelect.getFood().size() + " foods in your storage!" );
        jTextAreaRefri.append( "\n" );
        jTextAreaRefri.append( "\n" );
        jTextAreaRefri.append( "There are total of " + calculateAllCalorie( foodSelect ) + " calories in your storage!" );
        jTextAreaRefri.setEditable(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                .addContainerGap(26, Short.MAX_VALUE)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21))
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(29, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));

        jPanel7.setBackground(new java.awt.Color(255, 102, 102));
        jLabelLunch.setBackground( new java.awt.Color(255, 102, 102) );
        jLabelDinner.setBackground( new java.awt.Color(255, 102, 102) );
        jLabel7.setFont(new java.awt.Font("Tahoma", Font.BOLD, 12)); // NOI18N
        jLabel7.setText("Lunch");

        jLabel8.setFont(new java.awt.Font("Tahoma", Font.BOLD, 12)); // NOI18N
        jLabel8.setText("Dinner");

        jScrollPane4.setViewportView(jLabelLunch);

        jScrollPane5.setViewportView(jLabelDinner);
        // TODO add your handling code here:

        jScrollPane4.getViewport().setBackground(new java.awt.Color(255, 255, 255));
        jScrollPane5.getViewport().setBackground(new java.awt.Color(255, 255, 255));

        // Setting up Bilkent menu
        Date now = new Date();
        Calendar c = Calendar.getInstance();
        c.setTime(now);
        int day = c.get(Calendar.DAY_OF_WEEK);
        PdfReader read = new PdfReader();
        String[] lines = read.give().split(System.getProperty("line.separator"));

        jLabelDinner.setLineWrap( true );
        jLabelDinner.setWrapStyleWord( true );
        jLabelDinner.setEditable(false);
        jLabelLunch.setLineWrap( true );
        jLabelLunch.setWrapStyleWord( true );
        jLabelLunch.setEditable(false);

        if(day == 1) {
            int n = 60;
            jLabelLunch.append( Array.get(lines, n) +  "\n" + Array.get(lines, n + 1) + "\n" + Array.get(lines, n + 2) +
                    "\n" + Array.get(lines, n + 3));

            jLabelDinner.append( Array.get(lines, n + 5) +  "\n"+ Array.get(lines, n + 6) +  "\n"+ Array.get(lines, n + 7) +  "\n"
                    + Array.get(lines, n + 8));
        }
        if(day == 2) {
            int n = 0;
            jLabelLunch.append( Array.get(lines, n) +  "\n" + Array.get(lines, n + 1) + "\n" + Array.get(lines, n + 2) +
                    "\n" + Array.get(lines, n + 3));
            jLabelDinner.append( Array.get(lines, n + 5) +  "\n"+ Array.get(lines, n + 6) +  "\n"+ Array.get(lines, n + 7) +  "\n"
                    + Array.get(lines, n + 8));
        }
        if(day == 3) {
            int n = 10;
            jLabelLunch.append( Array.get(lines, n) +  "\n" + Array.get(lines, n + 1) + "\n" + Array.get(lines, n + 2) +
                    "\n" + Array.get(lines, n + 3));
            jLabelDinner.append( Array.get(lines, n + 5) +  "\n"+ Array.get(lines, n + 6) +  "\n"+ Array.get(lines, n + 7) +  "\n"
                    + Array.get(lines, n + 8));
        }
        if(day == 4) {
            int n = 20;
            jLabelLunch.append( Array.get(lines, n) +  "\n" + Array.get(lines, n + 1) + "\n" + Array.get(lines, n + 2) +
                    "\n" + Array.get(lines, n + 3));
            jLabelDinner.append( Array.get(lines, n + 5) +  "\n"+ Array.get(lines, n + 6) +  "\n"+ Array.get(lines, n + 7) +  "\n"
                    + Array.get(lines, n + 8));
        }
        if(day == 5) {
            int n = 30;
            jLabelLunch.append( Array.get(lines, n) +  "\n" + Array.get(lines, n + 1) + "\n" + Array.get(lines, n + 2) +
                    "\n" + Array.get(lines, n + 3));
            jLabelDinner.append( Array.get(lines, n + 5) +  "\n"+ Array.get(lines, n + 6) +  "\n"+ Array.get(lines, n + 7) +  "\n"
                    + Array.get(lines, n + 8));
        }
        if(day == 6) {
            int n = 40;
            jLabelLunch.append( Array.get(lines, n) +  "\n" + Array.get(lines, n + 1) + "\n" + Array.get(lines, n + 2) +
                    "\n" + Array.get(lines, n + 3));
            jLabelDinner.append( Array.get(lines, n + 5) +  "\n"+ Array.get(lines, n + 6) +  "\n"+ Array.get(lines, n + 7) +  "\n"
                    + Array.get(lines, n + 8));
        }
        if(day == 7) {
            int n = 50;
            jLabelLunch.append( Array.get(lines, n) +  "\n" + Array.get(lines, n + 1) + "\n" + Array.get(lines, n + 2) +
                    "\n" + Array.get(lines, n + 3));
            jLabelDinner.append( Array.get(lines, n + 5) +  "\n"+ Array.get(lines, n + 6) +  "\n"+ Array.get(lines, n + 7) +  "\n"
                    + Array.get(lines, n + 8));
        }

        // Layout
        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
                jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                                .addGap(0, 40, Short.MAX_VALUE)
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)
                                        .addComponent(jScrollPane5))
                                .addGap(27, 27, 27))
                        .addGroup(jPanel7Layout.createSequentialGroup()
                                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel7Layout.createSequentialGroup()
                                                .addGap(156, 156, 156)
                                                .addComponent(jLabel7))
                                        .addGroup(jPanel7Layout.createSequentialGroup()
                                                .addGap(158, 158, 158)
                                                .addComponent(jLabel8)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
                jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel7Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(30, Short.MAX_VALUE))
        );

        jLabel4.setFont(new java.awt.Font("Tahoma", Font.BOLD, 14)); // NOI18N
        jLabel4.setText("Bilkent Menu for Today");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addGap(112, 112, 112)
                                                .addComponent(jLabel4))
                                        .addGroup(jPanel4Layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
                jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(27, Short.MAX_VALUE))
        );

        jPanel5.setBackground(new java.awt.Color(153, 153, 255));
        jTextAreaStrange.setBackground( new java.awt.Color(153, 153, 255) );
        jTextAreaStrange.setColumns(20);
        jTextAreaStrange.setRows(5);
        jTextAreaStrange.setLineWrap( true );
        jTextAreaStrange.setWrapStyleWord( true );
        jScrollPane8.setViewportView(jTextAreaStrange);

        SpoonacularAPI foodApi = new SpoonacularAPI();

        // Try to get trivia
        try {
            jTextAreaStrange.append( foodApi.getTrivia() );
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        jTextAreaStrange.setEditable(false);
        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                                .addContainerGap(26, Short.MAX_VALUE)
                                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21))
        );
        jPanel5Layout.setVerticalGroup(
                jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jScrollPane8, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(51, 204, 255));
        jTextAreaJokes.setBackground(new java.awt.Color(51, 204, 255));
        jTextAreaJokes.setColumns(20);
        jTextAreaJokes.setRows(5);
        jTextAreaJokes.setLineWrap( true );
        jTextAreaJokes.setWrapStyleWord( true );
        jTextAreaJokes.setEditable(false);
        jTextAreaJokes.append( "\n" );
        jScrollPane7.setViewportView(jTextAreaJokes);

        try{
            jTextAreaJokes.append( foodApi.getJoke()  );
        }
        catch (Exception e) {
            e.printStackTrace();
        }

        // Layout
        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                                .addContainerGap(26, Short.MAX_VALUE)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(21, 21, 21))
        );
        jPanel6Layout.setVerticalGroup(
                jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel6Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(jScrollPane7, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(24, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(97, 97, 97)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addGap(94, 94, 94))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(129, 129, 129)
                                                                .addComponent(jLabel3))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(27, 27, 27)
                                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGap(121, 121, 121)
                                                                .addComponent(jLabel6))))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(38, 38, 38)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel1)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jButtonMain, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(26, 26, 26)
                                                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButtonSettings, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(35, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jButtonMain, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonSettings, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(11, 11, 11)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(jLabel3)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jLabel6)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>

    private void jButtonMainActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    /**
     * Open StockControl page
     *
     * @param evt Action event
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
        new StockControlPage().setVisible(true);
    }

    /**
     * Open Recipe page
     *
     * @param evt Action event
     * @throws IOException
     * @throws InterruptedException
     */
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) throws IOException, InterruptedException {
        this.dispose();
        new RecipePage().setVisible(true);
    }

    /**
     * Open Restaurants page
     *
     * @param evt Action event
     */
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
        try {
            new RestaurantsPage().setVisible(true);
        }
        catch (InterruptedException | IOException | URISyntaxException e) {
            e.printStackTrace();
        }
    }

    /**
     * Open Bilkent Menu page
     *
     * @param evt Action event
     */
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
        try {
            new BilkentMenuPage().setVisible(true);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Open Shopping page
     *
     * @param evt Action event
     */
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
        new ShoppingPage().setVisible(true);
    }

    /**
     * Open Settings page
     *
     * @param evt Action event
     */
    private void jButtonSettingsActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
        new SettingsPage().setVisible(true);
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
     * Calculates sum of callories
     *
     * @param foodSelect FoodSelect instance
     * @return All calories
     */
    private long calculateAllCalorie( FoodSelect foodSelect ){
        foodSelect.getFood();
        long calories = 0;
        for ( int count = 0; count < foodSelect.getFood().size(); count++){
            Food food = foodSelect.getFood().get( count );
            calories += ( long ) ( food.getAmount() / 100 ) * ( (double) food.getCaloriePerPortion() );
        }
        return calories;
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
            java.util.logging.Logger.getLogger(MainMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            try {
                new MainMenu().setVisible(true);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });
    }

    // Variables declaration
    private String name;
    private User user;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButtonMain;
    private javax.swing.JButton jButtonSettings;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelCountry;
    private javax.swing.JLabel jLabelProvince;
    private javax.swing.JLabel jLabelUser;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JScrollPane jScrollPane8;
    private javax.swing.JTextArea jLabelDinner;
    private javax.swing.JTextArea jTextAreaJokes;
    private javax.swing.JTextArea jLabelLunch;
    private javax.swing.JTextArea jTextAreaRefri;
    private javax.swing.JTextArea jTextAreaStrange;
    // End of variables declaration
}
