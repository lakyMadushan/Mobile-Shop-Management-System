
import java.awt.Image;
import java.sql.ResultSet;
import java.text.MessageFormat;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Profit extends javax.swing.JFrame {
    
    public Profit() {
        initComponents();
        
        Image icon = new ImageIcon(this.getClass().getResource("/icon.png")).getImage();
        this.setIconImage(icon);
        
        try {            
            ResultSet rs = dbcon.SEARCH("SELECT `income` FROM income");
            while(rs.next()){
                
                String income = rs.getString("income");
                              
                Vector v = new Vector();
                v.add(income);
                DefaultTableModel dtm = (DefaultTableModel) income_table.getModel();
                dtm.addRow(v);
            }
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
         try {            
            ResultSet rs = dbcon.SEARCH("SELECT `cost` FROM cost");
            while(rs.next()){
                
                String cost = rs.getString("cost");
                              
                Vector v = new Vector();
                v.add(cost);
                DefaultTableModel dtm = (DefaultTableModel) cost_table.getModel();
                dtm.addRow(v);
            }
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
         
         try {            
            ResultSet rs = dbcon.SEARCH("SELECT * FROM profit");
            while(rs.next()){
                
                String id = rs.getString("id");
                String time = rs.getString("time");
                String profit = rs.getString("profit");
                              
                Vector v = new Vector();
                v.add(id);
                v.add(time);
                v.add(profit);
                DefaultTableModel dtm = (DefaultTableModel) main_table.getModel();
                dtm.addRow(v);
            }
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        print_btn = new javax.swing.JButton();
        profit_lbl = new javax.swing.JLabel();
        time_range_txt = new javax.swing.JTextField();
        add_profit_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        cost_table = new javax.swing.JTable();
        back_btn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        date_search2_txt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        income_lbl = new javax.swing.JLabel();
        cost_lbl = new javax.swing.JLabel();
        date_search1_txt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        main_table = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        income_table = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Profit");
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        print_btn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        print_btn.setForeground(new java.awt.Color(255, 255, 255));
        print_btn.setText("PRINT");
        print_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        print_btn.setContentAreaFilled(false);
        print_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        print_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                print_btnActionPerformed(evt);
            }
        });
        jPanel1.add(print_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 750, 150, 45));

        profit_lbl.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        profit_lbl.setForeground(new java.awt.Color(255, 255, 255));
        profit_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        profit_lbl.setText("0");
        profit_lbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
        jPanel1.add(profit_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 240, 300, 60));

        time_range_txt.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        time_range_txt.setForeground(new java.awt.Color(255, 255, 255));
        time_range_txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        time_range_txt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        time_range_txt.setOpaque(false);
        jPanel1.add(time_range_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 280, 40));

        add_profit_btn.setBackground(new java.awt.Color(0, 0, 255));
        add_profit_btn.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        add_profit_btn.setForeground(new java.awt.Color(255, 255, 255));
        add_profit_btn.setText("ADD PROFIT REPORT");
        add_profit_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 8));
        add_profit_btn.setContentAreaFilled(false);
        add_profit_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add_profit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_profit_btnActionPerformed(evt);
            }
        });
        jPanel1.add(add_profit_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 320, 310, 60));

        cost_table.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        cost_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "COST"
            }
        ));
        cost_table.setRowHeight(40);
        cost_table.setRowMargin(5);
        jScrollPane1.setViewportView(cost_table);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 400, 520, 20));

        back_btn.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        back_btn.setForeground(new java.awt.Color(255, 255, 255));
        back_btn.setText("BACK");
        back_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        back_btn.setContentAreaFilled(false);
        back_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        back_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                back_btnActionPerformed(evt);
            }
        });
        jPanel1.add(back_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 750, 150, 45));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("TIME RANGE");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("DATE SEARCH");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 340, -1, -1));

        date_search2_txt.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        date_search2_txt.setForeground(new java.awt.Color(255, 255, 255));
        date_search2_txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        date_search2_txt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        date_search2_txt.setOpaque(false);
        date_search2_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                date_search2_txtKeyReleased(evt);
            }
        });
        jPanel1.add(date_search2_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 330, 280, 40));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("DATE SEARCH");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("INCOME");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 90, -1, -1));

        jLabel9.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("COST");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 170, -1, -1));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("PROFIT");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 250, -1, -1));

        income_lbl.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        income_lbl.setForeground(new java.awt.Color(255, 255, 255));
        income_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        income_lbl.setText("0");
        income_lbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
        jPanel1.add(income_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 80, 300, 60));

        cost_lbl.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        cost_lbl.setForeground(new java.awt.Color(255, 255, 255));
        cost_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cost_lbl.setText("0");
        cost_lbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
        jPanel1.add(cost_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 160, 300, 60));

        date_search1_txt.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        date_search1_txt.setForeground(new java.awt.Color(255, 255, 255));
        date_search1_txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        date_search1_txt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        date_search1_txt.setOpaque(false);
        date_search1_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                date_search1_txtKeyReleased(evt);
            }
        });
        jPanel1.add(date_search1_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 110, 280, 40));

        jLabel12.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("------ PROFIT ------");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 20, -1, -1));

        main_table.setBackground(new java.awt.Color(204, 204, 204));
        main_table.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        main_table.setForeground(new java.awt.Color(0, 0, 0));
        main_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Time Range", "Profit"
            }
        ));
        main_table.setRowHeight(28);
        main_table.setRowMargin(5);
        jScrollPane2.setViewportView(main_table);
        if (main_table.getColumnModel().getColumnCount() > 0) {
            main_table.getColumnModel().getColumn(1).setHeaderValue("Time Range");
            main_table.getColumnModel().getColumn(2).setHeaderValue("Profit");
        }

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 420, 1080, 310));

        income_table.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        income_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "INCOME"
            }
        ));
        income_table.setRowHeight(40);
        income_table.setRowMargin(5);
        jScrollPane3.setViewportView(income_table);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 400, 560, 20));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("LAKY_COMPUTER SHOP");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 20, -1, -1));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Lakshitha Madushan - Java. All Rights Reserved (c), 2023");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 790, 620, -1));

        bg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/bank.png"))); // NOI18N
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

    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed
        // TODO add your handling code here:
        Owner_Menu on = new Owner_Menu();
        on.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_back_btnActionPerformed

    private void print_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_print_btnActionPerformed
        // TODO add your handling code here:
        MessageFormat header = new MessageFormat("...........LAKSHITHA SOFTWARE JAVA (C) All Rights...........");
        MessageFormat footer = new MessageFormat("......................Thank You!!!..........................");
        
        try {
            main_table.print(JTable.PrintMode.NORMAL,header,footer);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_print_btnActionPerformed

    private void date_search1_txtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_date_search1_txtKeyReleased
        // TODO add your handling code here:
        
        DefaultTableModel dtm = (DefaultTableModel) income_table.getModel();
        String txt = date_search1_txt.getText();
        TableRowSorter <DefaultTableModel> trs = new TableRowSorter<DefaultTableModel>(dtm);
        income_table.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(txt));
        
        DefaultTableModel dtm1 = (DefaultTableModel) cost_table.getModel();
        String txt1 = date_search1_txt.getText();
        TableRowSorter <DefaultTableModel> trs1 = new TableRowSorter<DefaultTableModel>(dtm1);
        cost_table.setRowSorter(trs1);
        trs.setRowFilter(RowFilter.regexFilter(txt1));
        
        double sum =0;
        for(int i=0;i < income_table.getRowCount();i++){
            sum = sum + Double.parseDouble(income_table.getValueAt(i, 0).toString());
        }
        String income =String.valueOf(sum);
        income_lbl.setText(income);
        
        double sum1 =0;
        for(int i=0;i < cost_table.getRowCount();i++){
            sum1 = sum1+ Double.parseDouble(cost_table.getValueAt(i, 0).toString());
        }
        String cost = String.valueOf(sum1);
        cost_lbl.setText(cost);
        
        Double inc = Double.parseDouble(income);
        Double cos = Double.parseDouble(cost);
        Double profit = inc - cos ;
        profit_lbl.setText(String.valueOf(profit));
        
    }//GEN-LAST:event_date_search1_txtKeyReleased

    private void add_profit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_profit_btnActionPerformed
        // TODO add your handling code here:
        try {
            String income = income_lbl.getText();
            String cost = cost_lbl.getText();
            String profit = profit_lbl.getText();
            String time = time_range_txt.getText();
           
            dbcon.IUD("INSERT INTO profit (`income`,`cost`,`profit`,`time`) VALUES ('"+income+"','"+cost+"','"+profit+"','"+time+"')");
            JOptionPane.showMessageDialog(this, "Profit Details Added Successfully","DONE!",JOptionPane.INFORMATION_MESSAGE);
            
            time_range_txt.setText(null);
            date_search1_txt.setText(null);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_add_profit_btnActionPerformed

    private void date_search2_txtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_date_search2_txtKeyReleased
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel) main_table.getModel();
        String txt = date_search2_txt.getText();
        TableRowSorter <DefaultTableModel> trs = new TableRowSorter<DefaultTableModel>(dtm);
        main_table.setRowSorter(trs);
        trs.setRowFilter(RowFilter.regexFilter(txt));
    }//GEN-LAST:event_date_search2_txtKeyReleased

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
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inventory.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inventory().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_profit_btn;
    private javax.swing.JButton back_btn;
    private javax.swing.JLabel bg;
    private javax.swing.JLabel cost_lbl;
    private javax.swing.JTable cost_table;
    private javax.swing.JTextField date_search1_txt;
    private javax.swing.JTextField date_search2_txt;
    private javax.swing.JLabel income_lbl;
    private javax.swing.JTable income_table;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable main_table;
    private javax.swing.JButton print_btn;
    private javax.swing.JLabel profit_lbl;
    private javax.swing.JTextField time_range_txt;
    // End of variables declaration//GEN-END:variables
}
