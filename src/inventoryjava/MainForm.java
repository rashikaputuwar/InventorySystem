/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventoryjava;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;


/**
 *
 * @author rashi
 */
public class MainForm extends javax.swing.JFrame {

    /**
     * Creates new form MainForm
     */
    public MainForm() {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2,size.height/2-getHeight()/2);
        table_update();
        jComb_name.setSelectedItem(null);
        
    }
  
   Connection con;
   PreparedStatement pst,pst1,pst2;
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        addButt = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();
        txt2 = new javax.swing.JTextField();
        editButt = new javax.swing.JButton();
        delButt = new javax.swing.JButton();
        txt1 = new javax.swing.JTextField();
        jComb_type = new javax.swing.JComboBox<>();
        jComb_name = new javax.swing.JComboBox<>();
        txt3 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable3 = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        ProductMain = new javax.swing.JLabel();
        SalesMain = new javax.swing.JLabel();
        ItemsInStock = new javax.swing.JLabel();
        DamagedMain = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton2.setText("jButton2");

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel3.setBackground(new java.awt.Color(153, 51, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 21, Short.MAX_VALUE)
        );

        jLabel2.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 51, 0));
        jLabel2.setText(" Products");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel7.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel7.setText("Name");

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel9.setText("Types");

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel10.setText("Code");

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel11.setText("Cost Price");

        addButt.setText("Add");
        addButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel15.setText("Qty");

        editButt.setText("Edit");
        editButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtActionPerformed(evt);
            }
        });

        delButt.setText("Delete");
        delButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                delButtActionPerformed(evt);
            }
        });

        jComb_name.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Interior", "Exterior", "Primers", "Enamel", "Distemper", "Wall Putty", " " }));
        jComb_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComb_nameActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel10)
                        .addComponent(jLabel9)))
                .addGap(102, 102, 102)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComb_type, 0, 185, Short.MAX_VALUE)
                    .addComponent(jComb_name, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 458, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(94, 94, 94))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                        .addComponent(addButt, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(editButt)
                        .addGap(18, 18, 18)
                        .addComponent(delButt))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(txt2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, 26))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel11)
                    .addComponent(txt1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComb_name, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txt2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(jComb_type, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(addButt)
                    .addComponent(delButt)
                    .addComponent(txt3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editButt))
                .addContainerGap(59, Short.MAX_VALUE))
        );

        jTable3.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "S.No", "Product", "Types", "Code", "Cost Price", "Qty"
            }
        ));
        jTable3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable3MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable3);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 1225, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(611, 611, 611))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel2.setBackground(new java.awt.Color(153, 51, 0));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Inventory Management System");

        ProductMain.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        ProductMain.setForeground(new java.awt.Color(255, 255, 255));
        ProductMain.setText("Product");

        SalesMain.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        SalesMain.setForeground(new java.awt.Color(255, 255, 255));
        SalesMain.setText("Sales");
        SalesMain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SalesMainMouseClicked(evt);
            }
        });

        ItemsInStock.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        ItemsInStock.setForeground(new java.awt.Color(255, 255, 255));
        ItemsInStock.setText("Items in Stock");
        ItemsInStock.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ItemsInStockMouseClicked(evt);
            }
        });

        DamagedMain.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        DamagedMain.setForeground(new java.awt.Color(255, 255, 255));
        DamagedMain.setText("Damaged");
        DamagedMain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DamagedMainMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(ProductMain)
                        .addGap(250, 250, 250)
                        .addComponent(SalesMain)
                        .addGap(277, 277, 277)
                        .addComponent(DamagedMain, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ItemsInStock, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(50, 50, 50))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(47, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SalesMain)
                    .addComponent(ProductMain)
                    .addComponent(DamagedMain)
                    .addComponent(ItemsInStock))
                .addGap(36, 36, 36))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void table_update()
    {
    
        try {
            
            int c,count;
            try {
                Class.forName("com.mysql.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost/hamrocolorsansar","root","");
                pst = con.prepareStatement("select * from products");
                pst1 =  con.prepareStatement("select id from sales");
                pst2 =  con.prepareStatement("select id from damaged");
                ResultSet rs = pst.executeQuery();
                ResultSet rs1 = pst1.executeQuery();
                ResultSet rs2 = pst2.executeQuery();
                
                ResultSetMetaData rsd = rs.getMetaData();
                c = rsd.getColumnCount();
                
                DefaultTableModel d = (DefaultTableModel)jTable3.getModel();
                d.setRowCount(0);
                
                while(rs.next()) 
                {
                    count=0;
                    while(rs1.next()){
                        if(rs.getString("id")==rs1.getString("id")){
                            count++;
                            break;
                        }
                        
                    }
                    while(rs2.next()){
                        if(rs.getString("id")==rs2.getString("id")){
                            count++;
                            break;
                        }
                        
                    }
                    if(count==0){
                        Vector v2 = new Vector(); 
                   for(int i=1; i<=c; i++){
                       v2.add(rs.getString("id"));
                       v2.add(rs.getString("Name"));
                       v2.add(rs.getString("Types"));
                       v2.add(rs.getString("Code"));
                      v2.add(rs.getString("Price"));
                       v2.add(rs.getString("Qty"));
                   }
                
                   d.addRow(v2);
                    }
                    
                  
                }
         
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    
    }
    
    
    private void addButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtActionPerformed
        // TODO add your handling code here:
        
        String name = jComb_name.getSelectedItem().toString();
        String type = jComb_type.getSelectedItem().toString();
        String code = txt3.getText();
        String price = txt1.getText();
        String qty = txt2.getText();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/hamrocolorsansar","root","");
            pst =con.prepareStatement("insert into products(Name,Types,Qty,Code,Price)values(?,?,?,?,?)");
            pst.setString(1, name);
            pst.setString(2, type);
             pst.setString(3, qty);
            pst.setString(4, code);
            pst.setString(5,price);
           
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Product added");
            table_update();
            txt1.setText("");
            txt2.setText("");
            txt3.setText("");
            
            jComb_name.setSelectedIndex(-1);
            jComb_type.setSelectedIndex(-1);
            
            
            jComb_name.requestFocus();
            } 
        catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_addButtActionPerformed

    private void delButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delButtActionPerformed
        // TODO add your handling code here:
         DefaultTableModel d1 = (DefaultTableModel)jTable3.getModel();
        int selectIndex = jTable3.getSelectedRow();
        
        int id = Integer.parseInt(d1.getValueAt(selectIndex, 0).toString());
        
        int dialogResult = JOptionPane.showConfirmDialog(null,"Do you want to delete the record?","Warning",JOptionPane.YES_NO_OPTION);
        
        if(dialogResult == JOptionPane.YES_OPTION)
        {
             try {
                 Class.forName("com.mysql.cj.jdbc.Driver");
                 con = DriverManager.getConnection("jdbc:mysql://localhost/hamrocolorsansar","root","");
                pst =con.prepareStatement("delete from products where id=?");
                pst.setInt(1, id);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null,"Product deleted");
                table_update();
                txt1.setText("");
                txt2.setText("");
                txt3.setText("");

                jComb_name.setSelectedIndex(-1);
                
                jComb_type.setSelectedIndex(-1);
            
            
            jComb_name.requestFocus();
                
             } catch (ClassNotFoundException ex) {
                 Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
             } catch (SQLException ex) {
                 Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
             }
        }
    }//GEN-LAST:event_delButtActionPerformed

    private void SalesMainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SalesMainMouseClicked
        // TODO add your handling code here:
        new Sales().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_SalesMainMouseClicked

    private void editButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtActionPerformed
        // TODO add your handling code here:
        DefaultTableModel d1 = (DefaultTableModel)jTable3.getModel();
        int selectIndex = jTable3.getSelectedRow();
        
        int id = Integer.parseInt(d1.getValueAt(selectIndex, 0).toString()); 
        
        String name = jComb_name.getSelectedItem().toString();
        String type = jComb_type.getSelectedItem().toString();
        String code = txt3.getText();
        String price = txt1.getText();
        String qty = txt2.getText();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/hamrocolorsansar","root","");
            pst =con.prepareStatement("update products set name=?, types=?, qty=?, code=?, price=? where id=?");
            pst.setString(1, name);
            pst.setString(2, type);
            pst.setString(3, qty);
            pst.setString(4,code);
            pst.setString(5, price);
          
            pst.setInt(6, id);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Edited Successfully");
            table_update();
            txt1.setText("");
            txt2.setText("");
            txt3.setText("");
            
            jComb_name.setSelectedIndex(-1);
            jComb_type.setSelectedIndex(-1);
            
            
            jComb_name.requestFocus();
            } 
        catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_editButtActionPerformed

    private void ItemsInStockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ItemsInStockMouseClicked
        // TODO add your handling code here:
        new ItemsInStock().setVisible(true);
        this.dispose();
        
    }//GEN-LAST:event_ItemsInStockMouseClicked

    private void jTable3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable3MouseClicked
        // TODO add your handling code here:
        DefaultTableModel d1 = (DefaultTableModel)jTable3.getModel();
        int selectIndex = jTable3.getSelectedRow();
        
        jComb_name.setSelectedItem(d1.getValueAt(selectIndex, 1).toString());
        jComb_type.setSelectedItem(d1.getValueAt(selectIndex, 2).toString());
        txt3.setText(d1.getValueAt(selectIndex, 3).toString());
        txt1.setText(d1.getValueAt(selectIndex, 4).toString());
        txt2.setText(d1.getValueAt(selectIndex, 5).toString());
         
      
    }//GEN-LAST:event_jTable3MouseClicked

    private void jComb_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComb_nameActionPerformed
        // TODO add your handling code here:
        try{
            if(jComb_name.getSelectedItem().equals("Interior"))
            {
                jComb_type.removeAllItems();
                jComb_type.addItem("Impressions HD");
                jComb_type.addItem("Beauty Gold Washable");
                jComb_type.addItem("Beauty Gold Premium Finish");
                jComb_type.addItem("KNP Little Master");
                jComb_type.setSelectedItem(null);
            }else
            if(jComb_name.getSelectedItem().equals("Exterior"))
            {
                jComb_type.removeAllItems();
                jComb_type.addItem("Mica Marble");
                jComb_type.addItem("Total All In One");
                jComb_type.addItem("Anti-Peel Formula");
                jComb_type.addItem("Suraksha Plus");
                jComb_type.setSelectedItem(null);
            }else
            if(jComb_name.getSelectedItem().equals("Primers"))
            {
                jComb_type.removeAllItems();
                jComb_type.addItem("Nodamp");
                jComb_type.addItem("Wood");
                jComb_type.addItem("Popular Red Oxide");
                jComb_type.addItem("Exterior");
                jComb_type.setSelectedItem(null);
            }else
            if(jComb_name.getSelectedItem().equals("Enamel"))
            {
                jComb_type.removeAllItems();
                jComb_type.addItem("Hi Gloss Finish");   
                jComb_type.setSelectedItem(null);
            }else
            if(jComb_name.getSelectedItem().equals("Distemper"))
            {
                jComb_type.removeAllItems();
                jComb_type.addItem("Acrylic Distemper");  
                jComb_type.setSelectedItem(null);
            }else
            if(jComb_name.getSelectedItem().equals("Wall Putty"))
            {
                jComb_type.removeAllItems();
                jComb_type.addItem("Cement Putty");   
                jComb_type.setSelectedItem(null);
            }
        }
        catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_jComb_nameActionPerformed

    private void DamagedMainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DamagedMainMouseClicked
        // TODO add your handling code here:
        new Damaged().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_DamagedMainMouseClicked
   
        
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        
        //</editor-fold>
        
        try{
                UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
        }catch(Exception e){
            e.printStackTrace();
        }
                
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setLocationRelativeTo(null);
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DamagedMain;
    private javax.swing.JLabel ItemsInStock;
    private javax.swing.JLabel ProductMain;
    private javax.swing.JLabel SalesMain;
    private javax.swing.JButton addButt;
    private javax.swing.JButton delButt;
    private javax.swing.JButton editButt;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComb_name;
    private javax.swing.JComboBox<String> jComb_type;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTable jTable3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField txt1;
    private javax.swing.JTextField txt2;
    private javax.swing.JTextField txt3;
    // End of variables declaration//GEN-END:variables
}
