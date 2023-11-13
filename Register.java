
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
//import java.io.FileInputStream;
//import java.io.InputStream;
//import java.sql.PreparedStatement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;


public class Register extends javax.swing.JFrame implements Runnable{
    int hour, minute, second;
    int year, month, day;
    String displayTime, displayDate;
  
    public Register() {
        Thread t = new Thread(this);
        t.start();
        initComponents();
        
        Image icon = new ImageIcon(this.getClass().getResource("/icon.png")).getImage();
        this.setIconImage(icon);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        serialKey_txt = new javax.swing.JTextField();
        register_btn = new javax.swing.JButton();
        img_btn = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        back_btn1 = new javax.swing.JButton();
        user_txt = new javax.swing.JTextField();
        name_txt = new javax.swing.JTextField();
        contact_txt = new javax.swing.JTextField();
        address_txt = new javax.swing.JTextField();
        dob_txt = new javax.swing.JTextField();
        password_txt = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        time_txt = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        date_txt = new javax.swing.JLabel();
        img_lbl = new javax.swing.JLabel();
        bg1 = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Register");
        setResizable(false);

        jPanel1.setPreferredSize(new java.awt.Dimension(1088, 844));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("LAKY_COMPUTER SHOP");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 20, -1, -1));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Maximum 3MB Image Upload");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 750, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("FULLNAME");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, -1, -1));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("USERNAME");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 140, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("CONTACT NO.");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 280, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("ADDRESS");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 360, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("DOB");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 440, -1, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("SERIAL KEY");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 520, -1, -1));

        serialKey_txt.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        serialKey_txt.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        serialKey_txt.setForeground(new java.awt.Color(51, 51, 255));
        serialKey_txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        serialKey_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        serialKey_txt.setOpaque(false);
        serialKey_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                serialKey_txtKeyReleased(evt);
            }
        });
        jPanel1.add(serialKey_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 510, 364, 40));

        register_btn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        register_btn.setForeground(new java.awt.Color(255, 0, 0));
        register_btn.setText("REGISTER");
        register_btn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 0, 51), 4, true));
        register_btn.setContentAreaFilled(false);
        register_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        register_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                register_btnActionPerformed(evt);
            }
        });
        jPanel1.add(register_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 700, 130, 40));

        img_btn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        img_btn.setForeground(new java.awt.Color(255, 255, 255));
        img_btn.setText("ADD IMAGE");
        img_btn.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 4, true));
        img_btn.setContentAreaFilled(false);
        img_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        img_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                img_btnActionPerformed(evt);
            }
        });
        jPanel1.add(img_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 680, 200, 50));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("PASSWORD");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 590, -1, -1));

        back_btn1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        back_btn1.setForeground(new java.awt.Color(0, 0, 0));
        back_btn1.setText("BACK");
        back_btn1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 4, true));
        back_btn1.setContentAreaFilled(false);
        back_btn1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back_btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btn1ActionPerformed(evt);
            }
        });
        jPanel1.add(back_btn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 700, 130, 40));

        user_txt.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        user_txt.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        user_txt.setForeground(new java.awt.Color(51, 51, 255));
        user_txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        user_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        user_txt.setOpaque(false);
        user_txt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_txtActionPerformed(evt);
            }
        });
        user_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                user_txtKeyReleased(evt);
            }
        });
        jPanel1.add(user_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 364, 40));

        name_txt.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        name_txt.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        name_txt.setForeground(new java.awt.Color(51, 51, 255));
        name_txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        name_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        name_txt.setOpaque(false);
        name_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                name_txtKeyReleased(evt);
            }
        });
        jPanel1.add(name_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 200, 364, 40));

        contact_txt.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        contact_txt.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        contact_txt.setForeground(new java.awt.Color(51, 51, 255));
        contact_txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        contact_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        contact_txt.setOpaque(false);
        contact_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                contact_txtKeyReleased(evt);
            }
        });
        jPanel1.add(contact_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 280, 364, 40));

        address_txt.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        address_txt.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        address_txt.setForeground(new java.awt.Color(51, 51, 255));
        address_txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        address_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        address_txt.setOpaque(false);
        address_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                address_txtKeyReleased(evt);
            }
        });
        jPanel1.add(address_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 360, 364, 40));

        dob_txt.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        dob_txt.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        dob_txt.setForeground(new java.awt.Color(51, 51, 255));
        dob_txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dob_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        dob_txt.setOpaque(false);
        dob_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                dob_txtKeyReleased(evt);
            }
        });
        jPanel1.add(dob_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 430, 364, 40));

        password_txt.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.background"));
        password_txt.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        password_txt.setForeground(new java.awt.Color(51, 51, 255));
        password_txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        password_txt.setText("jPasswordField1");
        password_txt.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        password_txt.setOpaque(false);
        password_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                password_txtMouseClicked(evt);
            }
        });
        jPanel1.add(password_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 590, 364, 40));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("------ REGISTER ------");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 20, -1, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Lakshitha Madushan - Java. All Rights Reserved (c), 2023");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 810, 620, -1));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Date");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 160, 70, 50));

        time_txt.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        time_txt.setForeground(new java.awt.Color(255, 255, 255));
        time_txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        time_txt.setText("00 : 00 : 00");
        time_txt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel1.add(time_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 90, 160, 50));

        jLabel14.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Time");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 90, 70, 50));

        date_txt.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        date_txt.setForeground(new java.awt.Color(255, 255, 255));
        date_txt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        date_txt.setText("0000 / 00 / 00");
        date_txt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        jPanel1.add(date_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 160, 160, 50));

        img_lbl.setBackground(new java.awt.Color(102, 102, 102));
        img_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        img_lbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 5));
        img_lbl.setOpaque(true);
        img_lbl.setPreferredSize(new java.awt.Dimension(375, 400));
        jPanel1.add(img_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 260, -1, -1));

        bg1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/regi 2.png"))); // NOI18N
        bg1.setText("jLabel11");
        jPanel1.add(bg1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 630, 680));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/register 1.png"))); // NOI18N
        jPanel1.add(bg, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void img_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_img_btnActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser =  new JFileChooser();
        chooser.showOpenDialog(null);
        File f = chooser.getSelectedFile();
        //imag_lbl.setIcon(new ImageIcon(f.toString()));
        String parth = f.getAbsolutePath();
       // text_txt.setText(filename);
       
        try {
            BufferedImage bi = ImageIO.read(new File(parth));
            Image img = bi.getScaledInstance(375, 400, Image.SCALE_SMOOTH);
            ImageIcon icon = new ImageIcon(img);
            img_lbl.setIcon(icon);
            //parth2 = parth;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_img_btnActionPerformed

    private void register_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_register_btnActionPerformed
        // TODO add your handling code here:
        try {
            
            
           String user = user_txt.getText();
           String name = name_txt.getText();
           String contact =contact_txt.getText();
           String address = address_txt.getText();
           String dob = dob_txt.getText();
           String serial = serialKey_txt.getText();
           String password = password_txt.getText();
           String img = String.valueOf(img_lbl.getIcon());
          
         
//           InputStream is = new FileInputStream(new File(parth2));
           
           int charval = contact.length(); 
           if(charval > 8 && charval < 15){
                //JOptionPane.showMessageDialog(this,"Valid Number","DONE!",JOptionPane.INFORMATION_MESSAGE);
           }else{
                JOptionPane.showMessageDialog(this,"Invalid Number","ERROR!",JOptionPane.ERROR_MESSAGE);
               
           }
           
           if(serialKey_txt.getText().equals("1")){
            JOptionPane.showMessageDialog(this,"You are Owner!","ADMIN",JOptionPane.INFORMATION_MESSAGE);
           }else{
                if(serialKey_txt.getText().equals("0")){
                    JOptionPane.showMessageDialog(this,"You are Employee!","EMPLOYEE",JOptionPane.INFORMATION_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(this,"Invalid number. You must 0(Employee) or 1(Admin)","ERROR",JOptionPane.ERROR_MESSAGE);
                }
            }
           
        
           if(img_lbl.equals(0)){
               JOptionPane.showMessageDialog(this,"Select Your Image","ERROR IMAGE",JOptionPane.ERROR_MESSAGE);
           }else{
               
           }
                              
           dbcon.IUD("INSERT INTO user (`username`,`full_name`,`contact_no`,`address`,`dob`,`serial_key`,`password`,`image`) VALUES ('"+user+"','"+name+"','"+contact+"','"+address+"','"+dob+"','"+serial+"','"+password+"','"+img+"')");
           JOptionPane.showMessageDialog(this,"User Registration Succesfully !!","DONE!",JOptionPane.INFORMATION_MESSAGE);
           
           user_txt.setText(null);
           name_txt.setText(null);
           contact_txt.setText(null);
           address_txt.setText(null);
           dob_txt.setText(null);
           serialKey_txt.setText(null);
           password_txt.setText(null);
           img_lbl.setIcon(null);
           
//           Login l = new Login();
//           l.setVisible(true);
//           this.dispose();
           
        } catch (Exception e) {
        e.printStackTrace();
        }
    }//GEN-LAST:event_register_btnActionPerformed

    private void user_txtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_user_txtKeyReleased
        // TODO add your handling code here:
        char letter = evt.getKeyChar();
        if(Character.isLetter(letter) | evt.getKeyCode() == KeyEvent.VK_BACK_SPACE ) {
            user_txt.setEditable(true);
        }else{
            user_txt.setEditable(false);
            JOptionPane.showMessageDialog(this,"Use only letters,backspace button or delete button.","ERROR!",JOptionPane.ERROR_MESSAGE);
            user_txt.setText(null);
            user_txt.grabFocus();
        }
    }//GEN-LAST:event_user_txtKeyReleased

    private void name_txtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_name_txtKeyReleased
        // TODO add your handling code here:
        char letter = evt.getKeyChar();
        if(Character.isLetter(letter) | evt.getKeyCode() == KeyEvent.VK_SPACE | evt.getKeyCode() == KeyEvent.VK_PERIOD
                | evt.getKeyCode() == KeyEvent.VK_BACK_SPACE | evt.getKeyCode() == KeyEvent.VK_CAPS_LOCK | evt.getKeyCode() == KeyEvent.VK_SHIFT | evt.getKeyCode() == KeyEvent.VK_DELETE) {
            name_txt.setEditable(true);
        }else{
            name_txt.setEditable(false);
            JOptionPane.showMessageDialog(this,"Use only letters,space,dot,backspace,shift or caps lock.","ERROR!",JOptionPane.ERROR_MESSAGE);
            name_txt.setText(null);
            name_txt.grabFocus();
        }
    }//GEN-LAST:event_name_txtKeyReleased

    private void contact_txtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_contact_txtKeyReleased
        // TODO add your handling code here:
        char digit = evt.getKeyChar();
        if(Character.isDigit(digit)| evt.getKeyCode() == KeyEvent.VK_BACK_SPACE | evt.getKeyCode() == KeyEvent.VK_SHIFT | evt.getKeyCode() == KeyEvent.VK_EQUALS | evt.getKeyCode() == KeyEvent.VK_MINUS | evt.getKeyCode() == KeyEvent.VK_DELETE | evt.getKeyCode() == KeyEvent.VK_NUM_LOCK ) {
            contact_txt.setEditable(true);
        }else{
            contact_txt.setEditable(false);
            JOptionPane.showMessageDialog(this,"Use only numbers,backspace,shift,Plus or Minus keys","ERROR!",JOptionPane.ERROR_MESSAGE);
            contact_txt.setText(null);
            contact_txt.grabFocus();
        }
    }//GEN-LAST:event_contact_txtKeyReleased

    private void address_txtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_address_txtKeyReleased
        // TODO add your handling code here:
        char letter = evt.getKeyChar();
        if(Character.isLetter(letter) |Character.isDigit(letter) | evt.getKeyCode() == KeyEvent.VK_SPACE | evt.getKeyCode() == KeyEvent.VK_PERIOD
                | evt.getKeyCode() == KeyEvent.VK_BACK_SPACE | evt.getKeyCode() == KeyEvent.VK_CAPS_LOCK | evt.getKeyCode() == KeyEvent.VK_SHIFT | evt.getKeyCode() == KeyEvent.VK_DELETE | evt.getKeyCode() == KeyEvent.VK_BACK_SLASH | evt.getKeyCode() == KeyEvent.VK_NUM_LOCK) {
            address_txt.setEditable(true);
        }else{
            address_txt.setEditable(false);
            JOptionPane.showMessageDialog(this,"Use only letters,space,dot,backspace,shift,back flash,num lock or caps lock.","ERROR!",JOptionPane.ERROR_MESSAGE);
            address_txt.setText(null);
            address_txt.grabFocus();
        }
    }//GEN-LAST:event_address_txtKeyReleased

    private void serialKey_txtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_serialKey_txtKeyReleased
        // TODO add your handling code here:
        if( evt.getKeyCode() == KeyEvent.VK_BACK_SPACE  | evt.getKeyCode() == KeyEvent.VK_NUM_LOCK | evt.getKeyCode() == KeyEvent.VK_0 | evt.getKeyCode() == KeyEvent.VK_1 ) {
            serialKey_txt.setEditable(true);
            
        }else{
            serialKey_txt.setEditable(false);
            JOptionPane.showMessageDialog(this,"Use only 0 or 1 numbers and backspace,num lock","ERROR!",JOptionPane.ERROR_MESSAGE);
            serialKey_txt.setText(null);
            serialKey_txt.grabFocus();
        }
    }//GEN-LAST:event_serialKey_txtKeyReleased

    private void password_txtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_password_txtMouseClicked
        // TODO add your handling code here:
        password_txt.setText(null);
    }//GEN-LAST:event_password_txtMouseClicked

    private void dob_txtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dob_txtKeyReleased
        // TODO add your handling code here:
        char digit = evt.getKeyChar();
        if(Character.isDigit(digit)| evt.getKeyCode() == KeyEvent.VK_BACK_SPACE | evt.getKeyCode() == KeyEvent.VK_BACK_SLASH | evt.getKeyCode() == KeyEvent.VK_DELETE | evt.getKeyCode() == KeyEvent.VK_NUM_LOCK ) {
            dob_txt.setEditable(true);
        }else{
            dob_txt.setEditable(false);
            JOptionPane.showMessageDialog(this,"Use only numbers,backspace,back slash","ERROR!",JOptionPane.ERROR_MESSAGE);
            dob_txt.setText(null);
            dob_txt.grabFocus();
        }
    }//GEN-LAST:event_dob_txtKeyReleased

    private void user_txtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_txtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_user_txtActionPerformed

    private void back_btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_back_btn1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Add_Banking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_Banking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_Banking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_Banking.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run(){
                new Register().setVisible(true);
            }
        });
    }
    
    public void run() {
        while(true){
            try {
                 Calendar c = Calendar.getInstance();
                 hour = c.get(Calendar.HOUR_OF_DAY);
                 if(hour > 12);
                 hour = hour - 12;
                 minute = c.get(Calendar.MINUTE);
                 second = c.get(Calendar.SECOND);
                 day = c.get(Calendar.DAY_OF_MONTH);
                 month = c.get(Calendar.MONTH);
                 year = c.get(Calendar.YEAR);
                
                 SimpleDateFormat sdf = new SimpleDateFormat("YYYY / MM / dd");
                 SimpleDateFormat sdf1 = new SimpleDateFormat("hh : mm : ss");
                
                 Date d = c.getTime();
                
                 displayDate = sdf.format(d);
                 displayTime = sdf1.format(d);
                
                 date_txt.setText(displayDate);
                 time_txt.setText(displayTime);
                
            } catch (Exception e) {
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField address_txt;
    private javax.swing.JButton back_btn1;
    private javax.swing.JLabel bg;
    private javax.swing.JLabel bg1;
    private javax.swing.JTextField contact_txt;
    private javax.swing.JLabel date_txt;
    private javax.swing.JTextField dob_txt;
    private javax.swing.JButton img_btn;
    private javax.swing.JLabel img_lbl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JTextField name_txt;
    private javax.swing.JPasswordField password_txt;
    private javax.swing.JButton register_btn;
    private javax.swing.JTextField serialKey_txt;
    private javax.swing.JLabel time_txt;
    private javax.swing.JTextField user_txt;
    // End of variables declaration//GEN-END:variables
}
