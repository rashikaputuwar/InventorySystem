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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author rashi
 */
public class Sales extends javax.swing.JFrame {

    /**
     * Creates new form Sales
     */
    public Sales() {
        initComponents();
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2,size.height/2-getHeight()/2);
        table_update();
        jComb_type.setSelectedItem(null);
    }

    Connection con;
    PreparedStatement pst;
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel5 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        ProductMain = new javax.swing.JLabel();
        SalesMain = new javax.swing.JLabel();
        DamagedMain = new javax.swing.JLabel();
        ItemsInStock = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTable4 = new javax.swing.JTable();
        jPanel7 = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        addButt = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        txtbox2 = new javax.swing.JTextField();
        editButt = new javax.swing.JButton();
        delButt = new javax.swing.JButton();
        txtbox1 = new javax.swing.JTextField();
        jComb_name = new javax.swing.JComboBox<>();
        txtbox3 = new javax.swing.JTextField();
        jComb_type = new javax.swing.JComboBox<>();
        jLabel17 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(32767, 32767));
        setPreferredSize(new java.awt.Dimension(1370, 905));
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel5.setBackground(new java.awt.Color(153, 51, 0));
        jPanel5.setForeground(new java.awt.Color(255, 255, 255));

        jLabel13.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Inventory Management System");

        ProductMain.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        ProductMain.setForeground(new java.awt.Color(255, 255, 255));
        ProductMain.setText("Product");
        ProductMain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductMainMouseClicked(evt);
            }
        });

        SalesMain.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        SalesMain.setForeground(new java.awt.Color(255, 255, 255));
        SalesMain.setText("Sales");

        DamagedMain.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        DamagedMain.setForeground(new java.awt.Color(255, 255, 255));
        DamagedMain.setText("Damaged");
        DamagedMain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DamagedMainMouseClicked(evt);
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

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(ProductMain)
                .addGap(241, 241, 241)
                .addComponent(SalesMain)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jLabel13)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(330, 330, 330)
                        .addComponent(DamagedMain, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 187, Short.MAX_VALUE)
                        .addComponent(ItemsInStock, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81))))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ProductMain)
                    .addComponent(SalesMain)
                    .addComponent(DamagedMain)
                    .addComponent(ItemsInStock))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel5);
        jPanel5.setBounds(0, 0, 1370, 170);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jTable4.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Id", "Product", "Types", "Code", "Sold Price", "Qty"
            }
        ));
        jTable4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable4MouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(jTable4);

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel18.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel18.setText("Name");

        jLabel19.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel19.setText("Types");

        jLabel20.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel20.setText("Code");

        jLabel21.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel21.setText("Sold Price");

        addButt.setText("Add");
        addButt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtActionPerformed(evt);
            }
        });

        jLabel22.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabel22.setText("Qty");

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

        jComb_name.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Interior", "Exterior", "Primers", "Enamel", "Distemper", "Wall Putty" }));
        jComb_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComb_nameActionPerformed(evt);
            }
        });

        jComb_type.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComb_typeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel20)
                        .addComponent(jLabel19)))
                .addGap(102, 102, 102)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComb_name, 0, 185, Short.MAX_VALUE)
                    .addComponent(txtbox3)
                    .addComponent(jComb_type, 0, 185, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 453, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel21))
                        .addGap(94, 94, 94))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                        .addComponent(addButt, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtbox1, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                    .addComponent(txtbox2, javax.swing.GroupLayout.DEFAULT_SIZE, 176, Short.MAX_VALUE)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addComponent(editButt)
                        .addGap(18, 18, 18)
                        .addComponent(delButt)))
                .addGap(26, 26, 26))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(jLabel21)
                    .addComponent(txtbox1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComb_name, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel22)
                    .addComponent(txtbox2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19)
                    .addComponent(jComb_type, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(txtbox3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addButt)
                    .addComponent(editButt)
                    .addComponent(delButt))
                .addContainerGap(64, Short.MAX_VALUE))
        );

        jLabel17.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(153, 51, 0));
        jLabel17.setText("Sales Record");

        jPanel3.setBackground(new java.awt.Color(153, 51, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 15, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 1220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(562, 562, 562)
                        .addComponent(jLabel17)))
                .addContainerGap(72, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 180, 1370, 690);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

      private void table_update()
    {
    
        try {
            
            int c;
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost/hamrocolorsansar","root","");
                pst = con.prepareStatement("select * from sales");
                ResultSet rs = pst.executeQuery();
                
                ResultSetMetaData rsd = rs.getMetaData();
                c = rsd.getColumnCount();
                
                DefaultTableModel d = (DefaultTableModel)jTable4.getModel();
                d.setRowCount(0);
                
                while(rs.next())
                {
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
         
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
            
        } catch (SQLException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }
   
    }
      
    private void ProductMainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductMainMouseClicked
        // TODO add your handling code here:
        new MainForm().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ProductMainMouseClicked

    private void delButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_delButtActionPerformed
        // TODO add your handling code here:
        DefaultTableModel d1 = (DefaultTableModel)jTable4.getModel();
        int selectIndex = jTable4.getSelectedRow();

        int id = Integer.parseInt(d1.getValueAt(selectIndex, 0).toString());

        int dialogResult = JOptionPane.showConfirmDialog(null,"Do you want to delete the record?","Warning",JOptionPane.YES_NO_OPTION);

        if(dialogResult == JOptionPane.YES_OPTION)
        {
            try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                con = DriverManager.getConnection("jdbc:mysql://localhost/hamrocolorsansar","root","");
                pst =con.prepareStatement("delete from sales where id=?");
                pst.setInt(1, id);
                pst.executeUpdate();
                JOptionPane.showMessageDialog(null,"Product deleted");
                table_update();
                txtbox1.setText("");
                txtbox2.setText("");
                txtbox3.setText("");

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

    private void addButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtActionPerformed
        // TODO add your handling code here:

        String name = jComb_name.getSelectedItem().toString();
        String type = jComb_type.getSelectedItem().toString();
        String code = txtbox3.getText();
        String price = txtbox1.getText();
        String qty = txtbox2.getText();

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/hamrocolorsansar","root","");
            pst =con.prepareStatement("insert into Sales (Name,Types,Code,Price,Qty)values(?,?,?,?,?)");
            pst.setString(1, name);
            pst.setString(2, type);
            pst.setString(3, code);
            pst.setString(4,price);
            pst.setString(5, qty);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Sales added");
           
            table_update();
            
            txtbox1.setText("");
            txtbox2.setText("");
            txtbox3.setText("");

            jComb_name.setSelectedIndex(-1);
            jComb_type.setSelectedIndex(-1);
          
            jComb_name.requestFocus();
        }
        catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_addButtActionPerformed

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

    private void editButtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtActionPerformed
        // TODO add your handling code here:
        DefaultTableModel d1 = (DefaultTableModel)jTable4.getModel();
        int selectIndex = jTable4.getSelectedRow();
        
        int id = Integer.parseInt(d1.getValueAt(selectIndex, 0).toString()); 
        
        String name = jComb_name.getSelectedItem().toString();
        String type = jComb_type.getSelectedItem().toString();
        String code = txtbox3.getText();
        String price = txtbox1.getText();
        String qty = txtbox2.getText();
       
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
           con = DriverManager.getConnection("jdbc:mysql://localhost/hamrocolorsansar","root","");
            pst =con.prepareStatement("update sales set name=?, types=?, code=?, price=?, qty=? where id=?");
            pst.setString(1, name);
            pst.setString(2, type);
            pst.setString(3,code);
            pst.setString(4, price);
            pst.setString(5, qty);
            pst.setInt(6,id);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null,"Edited Successfully");
            table_update();
            txtbox1.setText("");
            txtbox2.setText("");
            txtbox3.setText("");
            
            jComb_name.setSelectedIndex(-1);
            jComb_type.setSelectedIndex(-1);
        

            
            jComb_name.requestFocus();
            } 
        catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(MainForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_editButtActionPerformed

    private void DamagedMainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DamagedMainMouseClicked
        // TODO add your handling code here:
        new Damaged().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_DamagedMainMouseClicked

    private void jTable4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable4MouseClicked
        // TODO add your handling code here:
         DefaultTableModel d1 = (DefaultTableModel)jTable4.getModel();
        int selectIndex = jTable4.getSelectedRow();
        
      jComb_name.setSelectedItem(d1.getValueAt(selectIndex, 1).toString());
      jComb_type.setSelectedItem(d1.getValueAt(selectIndex, 2).toString());
      txtbox3.setText(d1.getValueAt(selectIndex, 3).toString());
      txtbox1.setText(d1.getValueAt(selectIndex, 4).toString());
      txtbox2.setText(d1.getValueAt(selectIndex, 5).toString());
      
    }//GEN-LAST:event_jTable4MouseClicked

    private void jComb_typeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComb_typeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComb_typeActionPerformed

    private void ItemsInStockMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ItemsInStockMouseClicked
        // TODO add your handling code here:
        new ItemsInStock().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_ItemsInStockMouseClicked

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
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Sales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                 new MainForm().setLocationRelativeTo(null);
                new Sales().setVisible(true);
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
    private javax.swing.JComboBox<String> jComb_name;
    private javax.swing.JComboBox<String> jComb_type;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable jTable4;
    private javax.swing.JTextField txtbox1;
    private javax.swing.JTextField txtbox2;
    private javax.swing.JTextField txtbox3;
    // End of variables declaration//GEN-END:variables

}

