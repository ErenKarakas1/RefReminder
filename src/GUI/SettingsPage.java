package GUI;

import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

import javax.swing.*;

import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
import java.util.Hashtable;
import Logic.*;

/**
 *
 * @author goksu
 */
public class SettingsPage extends javax.swing.JFrame {
	String name;
	String actualCountry1;
    String actualProvince1;
    User user;
    
    private Hashtable<String, String[]> subItems = new Hashtable<>();
    
    String[] items = { "Afghanistan", "Albania", "Algeria", "Andorra", "Angola", "Antigua & Deps", "Argentina", "Armenia", "Australia", "Austria", "Azerbaijan", "Bahamas", "Bahrain", "Bangladesh", "Barbados", "Belarus", "Belgium", "Belize", "Benin", "Bhutan", "Bolivia", "Bosnia Herzegovina", "Botswana", "Brazil", "Brunei", "Bulgaria", "Burkina", "Burundi", "Cambodia", "Cameroon", "Canada", "Cape Verde", "Central African Rep", "Chad", "Chile", "China", "Colombia", "Comoros", "Congo", "Congo {Democratic Rep}", "Costa Rica", "Croatia", "Cuba", "Cyprus", "Czech Republic", "Denmark", "Djibouti", "Dominica", "Dominican Republic", "East Timor", "Ecuador", "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea", "Estonia", "Ethiopia", "Fiji", "Finland", "France", "Gabon", "Gambia", "Georgia", "Germany", "Ghana", "Greece", "Grenada", "Guatemala", "Guinea", "Guinea-Bissau", "Guyana", "Haiti", "Honduras", "Hungary", "Iceland", "India", "Indonesia", "Iran", "Iraq", "Ireland {Republic}", "Israel", "Italy", "Ivory Coast", "Jamaica", "Japan", "Jordan", "Kazakhstan", "Kenya", "Kiribati", "Korea North", "Korea South", "Kosovo", "Kuwait", "Kyrgyzstan", "Laos", "Latvia", "Lebanon", "Lesotho", "Liberia", "Libya", "Liechtenstein", "Lithuania", "Luxembourg", "Macedonia", "Madagascar", "Malawi", "Malaysia", "Maldives", "Mali", "Malta", "Marshall Islands", "Mauritania", "Mauritius", "Mexico", "Micronesia", "Moldova", "Monaco", "Mongolia", "Montenegro", "Morocco", "Mozambique", "Myanmar, {Burma}", "Namibia", "Nauru", "Nepal", "Netherlands", "New Zealand", "Nicaragua", "Niger", "Nigeria", "Norway", "Oman", "Pakistan", "Palau", "Panama", "Papua New Guinea", "Paraguay", "Peru", "Philippines", "Poland", "Portugal", "Qatar", "Romania", "Russian Federation", "Rwanda", "St Kitts & Nevis", "St Lucia", "Saint Vincent & the Grenadines", "Samoa", "San Marino", "Sao Tome & Principe", "Saudi Arabia", "Senegal", "Serbia", "Seychelles", "Sierra Leone", "Singapore", "Slovakia", "Slovenia", "Solomon Islands", "Somalia", "South Africa", "South Sudan", "Spain", "Sri Lanka", "Sudan", "Suriname", "Swaziland", "Sweden", "Switzerland", "Syria", "Taiwan", "Tajikistan", "Tanzania", "Thailand", "Togo", "Tonga", "Trinidad & Tobago", "Tunisia", "Turkey", "Turkmenistan", "Tuvalu", "Uganda", "Ukraine", "United Arab Emirates", "United Kingdom", "United States", "Uruguay", "Uzbekistan", "Vanuatu", "Vatican City", "Venezuela", "Vietnam", "Yemen", "Zambia", "Zimbabwe" };
    String[] turkey = { "Adana", "Adıyaman", "Afyonkarahisar", "Ağrı", "Aksaray", "Amasya", "Ankara", "Antalya", "Ardahan", "Artvin", "Aydın", "Balıkesir", "Bartın", "Batman", "Bayburt", "Bilecik", "Bingöl", "Bitlis", "Bolu", "Burdur", "Bursa", "Çanakkale", "Çankırı", "Çorum", "Denizli", "Diyarbakır", "Düzce", "Edirne", "Elazığ", "Erzincan", "Erzurum", "Eskişehir", "Gaziantep", "Giresun", "Gümüşhane", "Hakkâri", "Hatay", "Iğdır", "Isparta", "İstanbul", "İzmir", "Kahramanmaraş", "Karabük", "Karaman", "Kars", "Kastamonu", "Kayseri", "Kilis", "Kırıkkale", "Kırklareli", "Kırşehir", "Kocaeli", "Konya", "Kütahya", "Malatya", "Manisa", "Mardin", "Mersin", "Muğla", "Muş", "Nevşehir", "Niğde", "Ordu", "Osmaniye", "Rize", "Sakarya", "Samsun", "Şanlıurfa", "Siirt", "Sinop", "Sivas", "Şırnak", "Tekirdağ", "Tokat", "Trabzon", "Tunceli", "Uşak", "Van", "Yalova", "Yozgat", "Zonguldak" };


    /**
     * Creates new form Settings
     */
    public SettingsPage() {
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

        // GUI properties
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        AutoCompleteDecorator.decorate(jComboBox1);
    	AutoCompleteDecorator.decorate(jComboBox2);
    	
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setBackground(new java.awt.Color(255, 102, 255));
        jButton1.setFont(new java.awt.Font("Times New Roman", Font.PLAIN, 12)); // NOI18N
        jButton1.setText("Main Menu");
        jButton1.setPreferredSize(new java.awt.Dimension(120, 35));
        jButton1.addActionListener(evt -> {
            try {
                jButton1ActionPerformed(evt);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        jButton8.setBackground(new java.awt.Color(255, 51, 51));
        jButton8.setFont(new java.awt.Font("Times New Roman", Font.PLAIN, 12)); // NOI18N
        jButton8.setText("Stock Control");
        jButton8.setPreferredSize(new java.awt.Dimension(120, 35));
        jButton8.addActionListener(this::jButton8ActionPerformed);

        jButton9.setBackground(new java.awt.Color(255, 51, 0));
        jButton9.setFont(new java.awt.Font("Times New Roman", Font.PLAIN, 12)); // NOI18N
        jButton9.setText("Restaurants");
        jButton9.setPreferredSize(new java.awt.Dimension(120, 35));
        jButton9.addActionListener(evt -> {
            try {
                jButton9ActionPerformed(evt);
            } catch (URISyntaxException | IOException | InterruptedException e) {
                e.printStackTrace();
            }
        });

        jButton10.setBackground(new java.awt.Color(0, 153, 0));
        jButton10.setFont(new java.awt.Font("Times New Roman", Font.PLAIN, 12)); // NOI18N
        jButton10.setText("Reciper");
        jButton10.setPreferredSize(new java.awt.Dimension(120, 35));
        jButton10.addActionListener(evt -> {
            try {
                jButton10ActionPerformed(evt);
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        });

        jButton11.setBackground(new java.awt.Color(51, 153, 255));
        jButton11.setFont(new java.awt.Font("Times New Roman", Font.PLAIN, 12)); // NOI18N
        jButton11.setText("Bilkent Menu");
        jButton11.setPreferredSize(new java.awt.Dimension(120, 35));
        jButton11.addActionListener(evt -> {
            try {
                jButton11ActionPerformed(evt);
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        jButton12.setBackground(new java.awt.Color(102, 255, 102));
        jButton12.setFont(new java.awt.Font("Times New Roman", Font.PLAIN, 12)); // NOI18N
        jButton12.setText("Shopping");
        jButton12.setPreferredSize(new java.awt.Dimension(120, 35));
        jButton12.addActionListener(this::jButton12ActionPerformed);

        jButton13.setBackground(new java.awt.Color(0, 255, 204));
        jButton13.setFont(new java.awt.Font("Times New Roman", Font.PLAIN, 12)); // NOI18N
        jButton13.setText("Settings");
        jButton13.setPreferredSize(new java.awt.Dimension(120, 35));
        jButton13.addActionListener(this::jButton13ActionPerformed);

        jLabel1.setFont(new java.awt.Font("Tahoma", Font.BOLD, 18)); // NOI18N
        jLabel1.setText("Settings");

        jLabel2.setFont(new java.awt.Font("Tahoma", Font.BOLD, 14)); // NOI18N
        jLabel2.setText("Personalization");

        jLabel3.setFont(new java.awt.Font("Tahoma", Font.BOLD, 14)); // NOI18N
        jLabel3.setText("Preferences");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        jLabel4.setFont(new java.awt.Font("Tahoma", Font.BOLD, 12)); // NOI18N
        jLabel4.setText("Old Password");

        jLabel5.setFont(new java.awt.Font("Tahoma", Font.BOLD, 12)); // NOI18N
        jLabel5.setText("New Password");

        jButton2.setBackground(new java.awt.Color(255, 102, 102));
        jButton2.setText("Update");
        jButton2.addActionListener(this::jButton2ActionPerformed);

        jLabel6.setFont(new java.awt.Font("Tahoma", Font.BOLD, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 102, 102));
        jLabel6.setText("Update my password!");

        jButton5.setText("Delete My Account");
        jButton5.addActionListener(this::jButton5ActionPerformed);
        
        jButton6.setText("Log Out");
        jButton6.addActionListener(this::jButton6ActionPerformed);
        
        jButton7.setText("Send Us Feedback");
        jButton7.addActionListener(this::jButton7ActionPerformed);
        jLabel7.setFont(new java.awt.Font("Tahoma", Font.BOLD, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 102, 102));
        jLabel7.setText("Update my address!");

        jComboBox1.setEditable(true);
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Afghanistan", "Albania", "Algeria", "Andorra", "Angola", "Antigua & Deps", "Argentina", "Armenia", "Australia", "Austria", "Azerbaijan", "Bahamas", "Bahrain", "Bangladesh", "Barbados", "Belarus", "Belgium", "Belize", "Benin", "Bhutan", "Bolivia", "Bosnia Herzegovina", "Botswana", "Brazil", "Brunei", "Bulgaria", "Burkina", "Burundi", "Cambodia", "Cameroon", "Canada", "Cape Verde", "Central African Rep", "Chad", "Chile", "China", "Colombia", "Comoros", "Congo", "Congo {Democratic Rep}", "Costa Rica", "Croatia", "Cuba", "Cyprus", "Czech Republic", "Denmark", "Djibouti", "Dominica", "Dominican Republic", "East Timor", "Ecuador", "Egypt", "El Salvador", "Equatorial Guinea", "Eritrea", "Estonia", "Ethiopia", "Fiji", "Finland", "France", "Gabon", "Gambia", "Georgia", "Germany", "Ghana", "Greece", "Grenada", "Guatemala", "Guinea", "Guinea-Bissau", "Guyana", "Haiti", "Honduras", "Hungary", "Iceland", "India", "Indonesia", "Iran", "Iraq", "Ireland {Republic}", "Israel", "Italy", "Ivory Coast", "Jamaica", "Japan", "Jordan", "Kazakhstan", "Kenya", "Kiribati", "Korea North", "Korea South", "Kosovo", "Kuwait", "Kyrgyzstan", "Laos", "Latvia", "Lebanon", "Lesotho", "Liberia", "Libya", "Liechtenstein", "Lithuania", "Luxembourg", "Macedonia", "Madagascar", "Malawi", "Malaysia", "Maldives", "Mali", "Malta", "Marshall Islands", "Mauritania", "Mauritius", "Mexico", "Micronesia", "Moldova", "Monaco", "Mongolia", "Montenegro", "Morocco", "Mozambique", "Myanmar, {Burma}", "Namibia", "Nauru", "Nepal", "Netherlands", "New Zealand", "Nicaragua", "Niger", "Nigeria", "Norway", "Oman", "Pakistan", "Palau", "Panama", "Papua New Guinea", "Paraguay", "Peru", "Philippines", "Poland", "Portugal", "Qatar", "Romania", "Russian Federation", "Rwanda", "St Kitts & Nevis", "St Lucia", "Saint Vincent & the Grenadines", "Samoa", "San Marino", "Sao Tome & Principe", "Saudi Arabia", "Senegal", "Serbia", "Seychelles", "Sierra Leone", "Singapore", "Slovakia", "Slovenia", "Solomon Islands", "Somalia", "South Africa", "South Sudan", "Spain", "Sri Lanka", "Sudan", "Suriname", "Swaziland", "Sweden", "Switzerland", "Syria", "Taiwan", "Tajikistan", "Tanzania", "Thailand", "Togo", "Tonga", "Trinidad & Tobago", "Tunisia", "Turkey", "Turkmenistan", "Tuvalu", "Uganda", "Ukraine", "United Arab Emirates", "United Kingdom", "United States", "Uruguay", "Uzbekistan", "Vanuatu", "Vatican City", "Venezuela", "Vietnam", "Yemen", "Zambia", "Zimbabwe" }));
        jComboBox1.addActionListener(this::jComboBox1ActionPerformed);
        subItems.put(items[179], turkey);
        jComboBox2.setEditable(true);
        jComboBox2.addActionListener(this::jComboBox2ActionPerformed);
        
        jLabel10.setFont(new java.awt.Font("Tahoma", Font.BOLD, 12)); // NOI18N
        jLabel10.setText("Current Address Information");

        jLabel8.setFont(new java.awt.Font("Tahoma", Font.BOLD, 11)); // NOI18N
        jLabel8.setText("Country:");

        jLabel9.setFont(new java.awt.Font("Tahoma", Font.BOLD, 11)); // NOI18N
        jLabel9.setText("Province:");

        jLabel11.setFont(new java.awt.Font("Tahoma", Font.BOLD, 11)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 102, 102));
        
        jLabel11.setText(user.getCountry());

        jLabel12.setFont(new java.awt.Font("Tahoma", Font.BOLD, 11)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 102, 102));
        jLabel12.setText(user.getProvince());

        jLabel13.setFont(new java.awt.Font("Tahoma", Font.BOLD, 11)); // NOI18N
        jLabel13.setText("Province");

        jLabel14.setFont(new java.awt.Font("Tahoma", Font.BOLD, 11)); // NOI18N
        jLabel14.setText("Country");

        jButton4.setBackground(new java.awt.Color(255, 102, 102));
        jButton4.setText("Update");
        jButton4.addActionListener(this::jButton4ActionPerformed);

        // Layout
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 4, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(5, 5, 5)
                        .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton5)
                        .addGap(106, 106, 106))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addGap(42, 42, 42)
                                    .addComponent(jTextField1))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel5)
                                    .addGap(36, 36, 36)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(116, 116, 116)
                                .addComponent(jLabel3))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jButton6)
                        .addGap(135, 135, 135)
                        .addComponent(jButton7))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 13, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel9)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel12))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel14)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jComboBox1, 0, 229, Short.MAX_VALUE)
                                            .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel11))
                            .addComponent(jLabel10))
                        .addGap(162, 162, 162))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(398, 398, 398))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 749, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton11, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton12, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton13, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel2)
                        .addGap(21, 21, 21)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(32, 32, 32)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 304, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel14)
                                .addGap(4, 4, 4)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel11))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel12)
                                    .addComponent(jLabel9))
                                .addGap(10, 10, 10)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton5)
                    .addComponent(jButton6)
                    .addComponent(jButton7))
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    /**
     * Connect to database to update location
     *
     * @param evt Action event
     */
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
    	String driver = "com.mysql.cj.jdbc.Driver";
        String username = "root";
        String password = "root";
        String url = "jdbc:mysql://34.141.44.144:3306/user";
        
        User user = new User( name );
        String actualCountry = user.getCountry();
        String actualProvince = user.getProvince();
        String actualPassword = user.getPassword();

        
        String newCountry = (String)jComboBox1.getSelectedItem();
        String newProvince = (String)jComboBox2.getSelectedItem();

        if( !newProvince.equals("") )
        { 
                try
                {
                    Class.forName( driver );
                    java.sql.Connection conn3 = DriverManager.getConnection( url, username, password );
                    Statement statement = ( ( java.sql.Connection) conn3 ).createStatement();
                    String sql = "UPDATE user SET country = '" + newCountry + "'" + " WHERE password = '" + actualPassword + "' and username = '" + name + "'";
                    statement.executeUpdate(sql);
                    
                    Statement statement1 = ( ( java.sql.Connection) conn3 ).createStatement();
                    String sql1 = "UPDATE user SET province = '" + newProvince + "'" + " WHERE password = '" + actualPassword + "' and username = '" + name + "'";
                    statement1.executeUpdate(sql1);
                 
                }
                catch (ClassNotFoundException | SQLException e) { e.printStackTrace(); }


            jLabel11.setText(actualCountry);
                jLabel12.setText(actualProvince);
                setVisible(false);
                new SettingsPage().setVisible(true);
                JFrame d = new JFrame();
                JOptionPane.showMessageDialog( d, "Your country and province are changed succesfully!, new country is " + newCountry + ", new province is "+ newProvince );
        }

    }

    /**
     * Connect to database to update password
     *
     * @param evt Action event
     */
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {                                         
    	String driver = "com.mysql.cj.jdbc.Driver";
        String username = "root";
        String password = "root";
        String url = "jdbc:mysql://34.141.44.144:3306/user";
        
        User user = new User( name );
        String actualPassword = user.getPassword();
   
        String userPassword = jTextField1.getText();
        String newPassword = jTextField2.getText();
        
        if( !userPassword.equals("") && !newPassword.equals("") )
        {
            if ( userPassword.equals( actualPassword ) )
            { 
                try
                {
                    Class.forName( driver );
                    java.sql.Connection conn2 = DriverManager.getConnection( url, username, password );
                    Statement statement = ( ( java.sql.Connection) conn2 ).createStatement();
                    String sql = "UPDATE user SET password = '" + newPassword + "'" + " WHERE password = '" + actualPassword + "' and username = '" + name + "'";
                    statement.executeUpdate(sql);
                 
                }
                catch (ClassNotFoundException | SQLException e) { e.printStackTrace(); }

                JFrame d = new JFrame();
                JOptionPane.showMessageDialog( d, "Your password is changed succesfully!, new password is " + jTextField2.getText() );
                jTextField1.setText("");
                jTextField2.setText("");
                
            }
            
            else
            {
                JFrame f = new JFrame();
                JOptionPane.showMessageDialog( f, "Please be sure that your old password is true" );
            } 
        }
        else
        {
            JFrame f = new JFrame();
            JOptionPane.showMessageDialog( f, "Please be sure that\nthere is no missing part" );
        }
    }                                        

    private void jButton13ActionPerformed(java.awt.event.ActionEvent evt) {

        // TODO add your handling code here:
    }

    /**
     * Open Shopping page
     *
     * @param evt Action event
     */
    private void jButton12ActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
        new ShoppingPage().setVisible(true);
    }

    /**
     * Open Bilkent menu page
     *
     * @param evt Action event
     */
    private void jButton11ActionPerformed(java.awt.event.ActionEvent evt) throws IOException {
        this.dispose();
        new BilkentMenuPage().setVisible(true);
    }

    /**
     * Open Recipe page
     *
     * @param evt Action event
     */
    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) throws IOException, InterruptedException {
        this.dispose();
        new RecipePage().setVisible(true);
    }

    /**
     * Open Restaurant page
     *
     * @param evt Action event
     */
    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) throws URISyntaxException, IOException, InterruptedException {
        this.dispose();
        new RestaurantsPage().setVisible(true);
    }

    /**
     * Open StockControl page
     *
     * @param evt Action event
     */
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {
        this.dispose();
        new StockControlPage().setVisible(true);
    }

    /**
     * Open MainMenu page
     *
     * @param evt Action event
     */
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) throws IOException {
        this.dispose();
        new MainMenu().setVisible(true);
    }

    /**
     * Delete user from database
     *
     * @param evt Action event
     */
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {    
   	 String driver = "com.mysql.cj.jdbc.Driver";
        String username = "root";
        String password = "root";
        String url = "jdbc:mysql://34.141.44.144:3306/user";
        
        try
        {
            Class.forName( driver );
            java.sql.Connection conn2 = DriverManager.getConnection( url, username, password );
            Statement statement = ( ( java.sql.Connection ) conn2 ).createStatement();
            String sql = "DELETE FROM user WHERE username = '" + name + "'";
            statement.executeUpdate( sql );
            
            Class.forName( driver );
            java.sql.Connection conn3 = DriverManager.getConnection( url, username, password );
            Statement statement1 = ( ( java.sql.Connection ) conn3 ).createStatement();
            String sql2 = " DROP DATABASE " + name;
            statement1.executeUpdate( sql2 );
            
            
        } 
        catch( Exception e ) { e.printStackTrace(); }
        
        setVisible(false);
        JFrame f = new JFrame();
        JOptionPane.showMessageDialog( f, "Your account has been deleted.\nThank you for using our app, RefReminder Team! " );
    

   }

    /**
     * Logout
     *
     * @param evt Action event
     */
   private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {                                         
   	if ( evt.getSource() == jButton6 )
       {  
           name = "";
           setVisible( false );
       }
   }

    /**
     * Open Feedback menu
     *
     * @param evt Action event
     */
   private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {  
   	 if ( evt.getSource() == jButton7 )
        {  
            Feedback f = new Feedback();
            f.setVisible(true);
            setVisible(false);
        }
   }

    /**
     * List countries
     *
     * @param evt Action event
     */
   private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
   	String item = (String)jComboBox1.getSelectedItem();
       Object o = subItems.get( item );

       if (o == null)
       {
       	jComboBox2.setModel( new DefaultComboBoxModel() );
       }
       else
       {
       	jComboBox2.setModel( new DefaultComboBoxModel( (String[])o ) );
       }
   }  
   private void jComboBox2ActionPerformed(java.awt.event.ActionEvent evt) { 
   	
       //TODO

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
            java.util.logging.Logger.getLogger(SettingsPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new SettingsPage().setVisible(true));
    }

    /**
     * Gets username from file
     *
     * @return username
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

    // Variables declaration
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration                   
}

