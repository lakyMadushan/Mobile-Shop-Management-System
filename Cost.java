
import java.awt.Image;
import java.sql.ResultSet;
import java.text.MessageFormat;
import java.util.Vector;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DELL
 */
public class Cost extends javax.swing.JFrame {

    /**
     * Creates new form Inventory
     */
    public Cost() {
        initComponents();
        
        Image icon = new ImageIcon(this.getClass().getResource("/icon.png")).getImage();
        this.setIconImage(icon);
        
        cbLoadData("distributor","name", dis_combo);
        AutoCompleteDecorator.decorate(dis_combo);
        
//        cbLoadData("expences","category", expenCate_combo);
//        AutoCompleteDecorator.decorate(expenCate_combo);
        
        try {
            
            ResultSet rs = dbcon.SEARCH("SELECT * FROM cost");
            while(rs.next()){
                
                String id = rs.getString("id");
                String date = rs.getString("date");
                String bill = rs.getString("bill");
                String dis = rs.getString("distributor");
                String expence = rs.getString("expence");
                String cost = rs.getString("cost");
                
                Vector v = new Vector();
                v.add(id);
                v.add(date);
                v.add(bill);
                v.add(dis);
                v.add(expence);
                v.add(cost);
                DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
                dtm.addRow(v);
            }
            
            
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        for(int r = 0; r<jTable1.getRowCount(); r++){    
            String cost = jTable1.getValueAt(r,5).toString();
            double cost2 = Double.parseDouble(cost);
            double cost3 = Double.parseDouble(jLabel5.getText());
            double sum = cost2 + cost3;
            jLabel5.setText(String.valueOf(sum));
            cost_lbl.setText(String.valueOf(sum));     
            }
        

        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jPanel1 = new javax.swing.JPanel();
        print_btn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        search_txt = new javax.swing.JTextField();
        edit_btn = new javax.swing.JButton();
        remove_btn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        back_btn = new javax.swing.JButton();
        cost_lbl = new javax.swing.JLabel();
        expenCate_combo = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        dis_combo = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        bg = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cost");
        setResizable(false);

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        print_btn.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
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
        jPanel1.add(print_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 730, 150, 45));

        jLabel3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("SEARCH");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, -1));

        search_txt.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        search_txt.setForeground(new java.awt.Color(255, 255, 255));
        search_txt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        search_txt.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        search_txt.setOpaque(false);
        search_txt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                search_txtMouseClicked(evt);
            }
        });
        search_txt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                search_txtKeyReleased(evt);
            }
        });
        jPanel1.add(search_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 320, 40));

        edit_btn.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        edit_btn.setForeground(new java.awt.Color(255, 255, 255));
        edit_btn.setText("EDIT");
        edit_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        edit_btn.setContentAreaFilled(false);
        edit_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        edit_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edit_btnActionPerformed(evt);
            }
        });
        jPanel1.add(edit_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 240, 140, 50));

        remove_btn.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        remove_btn.setForeground(new java.awt.Color(255, 255, 255));
        remove_btn.setText("REMOVE");
        remove_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        remove_btn.setContentAreaFilled(false);
        remove_btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        remove_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remove_btnActionPerformed(evt);
            }
        });
        jPanel1.add(remove_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 240, 140, 50));

        jTable1.setBackground(new java.awt.Color(204, 204, 204));
        jTable1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jTable1.setForeground(new java.awt.Color(0, 0, 0));
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "DATE", "BILL NO.", "DISTRIBUTER", "EXPENCE", "COST"
            }
        ));
        jTable1.setRowHeight(28);
        jTable1.setRowMargin(5);
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 300, 1070, 417));

        back_btn.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
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
        jPanel1.add(back_btn, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 730, 150, 45));

        cost_lbl.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        cost_lbl.setForeground(new java.awt.Color(255, 255, 255));
        cost_lbl.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cost_lbl.setText("0");
        cost_lbl.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 4));
        jPanel1.add(cost_lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 220, 230, 60));

        expenCate_combo.setBackground(new java.awt.Color(204, 204, 204));
        expenCate_combo.setEditable(true);
        expenCate_combo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        expenCate_combo.setForeground(new java.awt.Color(0, 0, 0));
        expenCate_combo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "WATER BILL", "ELECTRICITY BILL", "SALARY PAYMENT", "REPAIRS", "CASUALS", "OTHER", "EMPTY" }));
        expenCate_combo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        expenCate_combo.setOpaque(false);
        expenCate_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                expenCate_comboActionPerformed(evt);
            }
        });
        jPanel1.add(expenCate_combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 190, 320, 40));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("EXPENCE CATEGORY");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("COST");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 240, -1, 30));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("DISTRIBUTOR");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        dis_combo.setBackground(new java.awt.Color(204, 204, 204));
        dis_combo.setEditable(true);
        dis_combo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        dis_combo.setForeground(new java.awt.Color(0, 0, 0));
        dis_combo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        dis_combo.setOpaque(false);
        dis_combo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dis_comboActionPerformed(evt);
            }
        });
        jPanel1.add(dis_combo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 320, 40));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 3)); // NOI18N
        jLabel5.setForeground(javax.swing.UIManager.getDefaults().getColor("Label.background"));
        jLabel5.setText("0");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 420, 90, 30));

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("------ COST -------");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(990, 10, -1, -1));

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setText("Lakshitha Madushan - Java. All Rights Reserved (c), 2023");
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 760, 620, -1));

        jLabel2.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("LAKY_COMPUTER SHOP");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 20, -1, -1));

        bg.setForeground(new java.awt.Color(255, 255, 255));
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

    private void remove_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remove_btnActionPerformed
        // TODO add your handling code here:'
        try {
            int r = jTable1.getSelectedRow();
            String delr = jTable1.getValueAt(r, 0).toString(); // 0 veni row
            dbcon.IUD("DELETE FROM cost WHERE `id` = '"+delr+"'");
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.removeRow(r);
            JOptionPane.showMessageDialog(this, "Row Deleted Successfulll!","DONE",JOptionPane.INFORMATION_MESSAGE);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_remove_btnActionPerformed

    private void back_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_back_btnActionPerformed
        // TODO add your handling code here:
        Owner_Menu on = new Owner_Menu();
        on.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_back_btnActionPerformed

    private void print_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_print_btnActionPerformed
        // TODO add your handling code here:
        MessageFormat header = new MessageFormat("LAKSHITHA SOFTWARE JAVA (C) All Rights");
        MessageFormat footer = new MessageFormat("Thank You!!!");
        
        try {
            jTable1.print(JTable.PrintMode.NORMAL,header,footer);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_print_btnActionPerformed

    private void search_txtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_search_txtKeyReleased
        // TODO add your handling code here:
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
         String txt = search_txt.getText();
         TableRowSorter <DefaultTableModel> trs = new TableRowSorter<DefaultTableModel>(dtm);
         jTable1.setRowSorter(trs);
         trs.setRowFilter(RowFilter.regexFilter(txt));
    }//GEN-LAST:event_search_txtKeyReleased

    private void edit_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edit_btnActionPerformed
        // TODO add your handling code here:
        try {
            int r = jTable1.getSelectedRow();
            
            String id = jTable1.getValueAt(r, 0).toString();
            String date = jTable1.getValueAt(r, 1).toString();
            String bill = jTable1.getValueAt(r, 2).toString();
            String distributor = jTable1.getValueAt(r, 3).toString();
            String expence = jTable1.getValueAt(r, 4).toString();
            String cost = jTable1.getValueAt(r, 5).toString();
            
            dbcon.IUD("UPDATE cost SET `date` = '"+date+"' WHERE `id` = '"+id+"' ");
            dbcon.IUD("UPDATE cost SET `bill` = '"+bill+"' WHERE `id` = '"+id+"' ");
            dbcon.IUD("UPDATE cost SET `distributor` = '"+distributor+"' WHERE `id` = '"+id+"'");
            dbcon.IUD("UPDATE cost SET `expence` = '"+expence+"' WHERE `id` = '"+id+"'");
            dbcon.IUD("UPDATE cost SET `cost` = '"+cost+"' WHERE `id` = '"+id+"'");
            
            JOptionPane.showMessageDialog(this,"Row Update Successfully!","DONE",JOptionPane.INFORMATION_MESSAGE);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_edit_btnActionPerformed

    private void dis_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dis_comboActionPerformed
        // TODO add your handling code here:
        try {
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);
            ResultSet rs = dbcon.SEARCH("SELECT*FROM cost WHERE `distributor` = '"+String.valueOf(dis_combo.getSelectedItem())+"'");
            while(rs.next()){
                String id = rs.getString("id");
                String date = rs.getString("date");
                String cat = rs.getString("bill");
                String customer = rs.getString("distributor");
                String expence = rs.getString("expence");
                String cost = rs.getString("cost");
                
               
                Vector v = new Vector();                
                v.add(id);
                v.add(date);
                v.add(cat);
                v.add(customer);
                v.add(expence);
                v.add(cost);
                               
                dtm.addRow(v);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_dis_comboActionPerformed

    private void expenCate_comboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_expenCate_comboActionPerformed
        // TODO add your handling code here:
         try {
            DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
            dtm.setRowCount(0);
            ResultSet rs = dbcon.SEARCH("SELECT * FROM cost WHERE `expence` = '"+String.valueOf(expenCate_combo.getSelectedItem())+"'");
            while(rs.next()){
                String id = rs.getString("id");
                String date = rs.getString("date");
                String cat = rs.getString("bill");
                String customer = rs.getString("distributor");
                String expence = rs.getString("expence");
                String cost = rs.getString("cost");
                
                Vector v = new Vector();                
                v.add(id);
                v.add(date);
                v.add(cat);
                v.add(customer);
                v.add(expence);
                v.add(cost);
               
                dtm.addRow(v);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_expenCate_comboActionPerformed

    private void search_txtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_search_txtMouseClicked
        // TODO add your handling code here:
        search_txt.setText(null);
    }//GEN-LAST:event_search_txtMouseClicked

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
    private javax.swing.JButton back_btn;
    private javax.swing.JLabel bg;
    private javax.swing.JLabel cost_lbl;
    private javax.swing.JComboBox<String> dis_combo;
    private javax.swing.JButton edit_btn;
    private javax.swing.JComboBox<String> expenCate_combo;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton print_btn;
    private javax.swing.JButton remove_btn;
    private javax.swing.JTextField search_txt;
    // End of variables declaration//GEN-END:variables

public void cbLoadData(String table , String column, JComboBox cb){
    Vector v = new Vector();
    try {
        
        ResultSet rs = dbcon.SEARCH("SELECT * FROM "+table+" ");
        while(rs.next()){
            String col = rs.getString(column);
            v.add(col);
            DefaultComboBoxModel dcm = new DefaultComboBoxModel(v);
            cb.setModel(dcm);
            
        }
        
    } catch (Exception e) {
        e.printStackTrace();
    }
}
}
