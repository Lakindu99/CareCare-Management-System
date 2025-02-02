/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.table.TableColumn;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.activation.*;
import javax.activation.DataHandler;

/**
 *
 * @author ccs
 */
public class Add_to_service extends javax.swing.JFrame {

    /**
     * Creates new form UPSS
     */
    
     Connection conn=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
    String sqr;
    
    String sid;
    String vnum;
    String nic;
    String oname;
    String model;
    String modelnum;
    String type;
    
    public Add_to_service() {
        initComponents();
        conn=DBConnect.connect();
        autoId();
        tablelord();
        btndelete.setEnabled(false);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        txtvnumber = new javax.swing.JTextField();
        txtnic = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        txtmodel = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        btndelete = new javax.swing.JButton();
        txttype = new javax.swing.JComboBox();
        jLabel11 = new javax.swing.JLabel();
        txtmnumber = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        txtsid = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        txtsearch = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblups = new javax.swing.JTable();
        jButton4 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtbill = new javax.swing.JTextArea();
        btnadd = new javax.swing.JButton();
        btnallocate = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblname = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMinimumSize(new java.awt.Dimension(880, 200));
        jPanel1.setPreferredSize(new java.awt.Dimension(880, 350));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Microsoft Tai Le", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 45, 86));
        jLabel4.setText("Vehicle Number");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        jLabel5.setFont(new java.awt.Font("Microsoft Tai Le", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 45, 86));
        jLabel5.setText("Owner NIC");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, -1, -1));

        jLabel6.setFont(new java.awt.Font("Microsoft Tai Le", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 45, 86));
        jLabel6.setText("Name");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 320, 50, -1));

        jLabel18.setFont(new java.awt.Font("Microsoft Tai Le", 1, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 45, 86));
        jLabel18.setText("Model");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        txtvnumber.setFont(new java.awt.Font("Microsoft Tai Le", 0, 14)); // NOI18N
        txtvnumber.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtvnumberKeyReleased(evt);
            }
        });
        jPanel1.add(txtvnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 180, 25));

        txtnic.setEditable(false);
        txtnic.setFont(new java.awt.Font("Microsoft Tai Le", 0, 14)); // NOI18N
        jPanel1.add(txtnic, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, 190, 25));

        txtname.setEditable(false);
        txtname.setFont(new java.awt.Font("Microsoft Tai Le", 0, 14)); // NOI18N
        jPanel1.add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 320, 190, 25));

        txtmodel.setEditable(false);
        txtmodel.setFont(new java.awt.Font("Microsoft Tai Le", 0, 14)); // NOI18N
        txtmodel.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtmodelKeyReleased(evt);
            }
        });
        jPanel1.add(txtmodel, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, 190, 25));

        jLabel21.setFont(new java.awt.Font("Microsoft Tai Le", 1, 16)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 45, 86));
        jLabel21.setText("Service Type");
        jPanel1.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        btndelete.setBackground(new java.awt.Color(102, 102, 102));
        btndelete.setFont(new java.awt.Font("Microsoft Tai Le", 1, 16)); // NOI18N
        btndelete.setForeground(new java.awt.Color(255, 255, 255));
        btndelete.setText("Delete");
        btndelete.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 204), 2, true));
        btndelete.setBorderPainted(false);
        btndelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndeleteActionPerformed(evt);
            }
        });
        jPanel1.add(btndelete, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 470, 100, 40));

        txttype.setFont(new java.awt.Font("Microsoft Tai Le", 0, 14)); // NOI18N
        txttype.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select service type", "Cleanning", "Repairing" }));
        txttype.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttypeActionPerformed(evt);
            }
        });
        jPanel1.add(txttype, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 360, 190, 25));

        jLabel11.setFont(new java.awt.Font("Microsoft Tai Le", 1, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 45, 86));
        jLabel11.setText("Model Number");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, -1, -1));

        txtmnumber.setEditable(false);
        txtmnumber.setFont(new java.awt.Font("Microsoft Tai Le", 0, 14)); // NOI18N
        jPanel1.add(txtmnumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 220, 190, 30));

        jLabel19.setFont(new java.awt.Font("Microsoft Tai Le", 1, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 45, 86));
        jLabel19.setText("Service ID");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(11, 80, 90, -1));

        txtsid.setEditable(false);
        txtsid.setFont(new java.awt.Font("Microsoft Tai Le", 0, 14)); // NOI18N
        txtsid.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsidKeyReleased(evt);
            }
        });
        jPanel1.add(txtsid, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 190, 25));

        jLabel16.setFont(new java.awt.Font("Microsoft Tai Le", 1, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 45, 86));
        jLabel16.setText("Service Id");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 60, 110, 30));

        txtsearch.setFont(new java.awt.Font("Microsoft Tai Le", 0, 14)); // NOI18N
        txtsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsearchKeyReleased(evt);
            }
        });
        jPanel1.add(txtsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 60, 270, 30));

        tblups.setFont(new java.awt.Font("Microsoft Tai Le", 0, 14)); // NOI18N
        tblups.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblups.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tblups.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblupsMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblups);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 100, 500, 230));

        jButton4.setBackground(new java.awt.Color(102, 102, 102));
        jButton4.setFont(new java.awt.Font("Microsoft Tai Le", 1, 16)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Print");
        jButton4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 204), 2, true));
        jButton4.setBorderPainted(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 470, 160, 40));

        txtbill.setColumns(20);
        txtbill.setFont(new java.awt.Font("Microsoft Tai Le", 0, 12)); // NOI18N
        txtbill.setRows(5);
        jScrollPane3.setViewportView(txtbill);

        jPanel1.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 350, 270, 160));

        btnadd.setBackground(new java.awt.Color(102, 102, 102));
        btnadd.setFont(new java.awt.Font("Microsoft Tai Le", 1, 16)); // NOI18N
        btnadd.setForeground(new java.awt.Color(255, 255, 255));
        btnadd.setText("Add");
        btnadd.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 204), 2, true));
        btnadd.setBorderPainted(false);
        btnadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnaddActionPerformed(evt);
            }
        });
        jPanel1.add(btnadd, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 470, 100, 40));

        btnallocate.setBackground(new java.awt.Color(102, 102, 102));
        btnallocate.setFont(new java.awt.Font("Microsoft Tai Le", 1, 16)); // NOI18N
        btnallocate.setForeground(new java.awt.Color(255, 255, 255));
        btnallocate.setText("Allocate Job");
        btnallocate.setActionCommand("sendEmails()");
        btnallocate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnallocateMouseClicked(evt);
            }
        });
        btnallocate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnallocateActionPerformed(evt);
            }
        });
        jPanel1.add(btnallocate, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 470, 130, 40));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 520));

        jPanel2.setBackground(new java.awt.Color(255, 0, 0));

        lblname.setBackground(new java.awt.Color(255, 255, 255));
        lblname.setFont(new java.awt.Font("Microsoft Tai Le", 1, 24)); // NOI18N
        lblname.setForeground(new java.awt.Color(255, 255, 255));
        lblname.setText("Add to service");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(335, 335, 335)
                .addComponent(lblname, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(375, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(lblname, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 880, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 880, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    
    private void getData()
    {
    
        sid = txtsid.getText();
        vnum = txtvnumber.getText();
        model = txtmodel.getText();
        modelnum = txtmnumber.getText();
        nic = txtnic.getText();
        oname = txtname.getText();
        type = txttype.getSelectedItem().toString();
    
    }
    
    private void autoId()
    {
        try {
             String sql="SELECT sid FROM add_to_service ORDER BY sid DESC LIMIT 1";
           // String q="SELECT returndate FROM borrowdetails where mid='"+ name +"'";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
           if(rs.next())
           {
                String rnno=rs.getString("sid");
                int co=rnno.length();
               String txt= rnno.substring(0, 2);
               String num=rnno.substring(2, co);
               int n=Integer.parseInt(num);
               n++;
               String snum=Integer.toString(n);
               String ftxt=txt+snum;
               txtsid.setText(ftxt);
            
           }
           else
           {
               txtsid.setText("SI1000");
           }
           
                            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
       
    }
    
     private void clear()
    {
    txtvnumber.setText("");
    txtmodel.setText("");
    txtmnumber.setText("");
    txtnic.setText("");
    txtname.setText("");
    txttype.setSelectedIndex(0);
    
    
    
    }    
    
      private void tablelord()
    {
        try {
            String sql="SELECT `sid` as 'Service ID', `vnumber` as 'Vehicle Number', `model` as 'Model Number', `modelname` as 'Model', `nic` as 'Owner NIC', `oname` as 'Owner Name', `stype` as 'Service Type', `date` as 'Receive Date' FROM `add_to_service`";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            tblups.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
       theader();
    }
    
     private void  theader()
    {
        try {
            JTableHeader thead = tblups.getTableHeader();
       thead.setForeground(Color.BLUE);
    
       thead.setFont(new Font("Tahome", Font.BOLD, 14));
       
        TableColumn col1=tblups.getColumnModel().getColumn(0);
        col1.setPreferredWidth(120);
        TableColumn col2=tblups.getColumnModel().getColumn(1);
        col2.setPreferredWidth(120);
        TableColumn col3=tblups.getColumnModel().getColumn(2);
        col3.setPreferredWidth(120);
        TableColumn col4=tblups.getColumnModel().getColumn(3);
        col4.setPreferredWidth(120);
        TableColumn col5=tblups.getColumnModel().getColumn(4);
        col5.setPreferredWidth(120);
        TableColumn col6=tblups.getColumnModel().getColumn(5);
        col6.setPreferredWidth(120);
        TableColumn col7=tblups.getColumnModel().getColumn(6);
        col7.setPreferredWidth(120);
        
        
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
       
        
        
    }

    
    private void txttypeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttypeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttypeActionPerformed

    private void recipt()
    {
        try {
            txtbill.append(" Vehicle Service Center \n" +
            "  No.000 xxxxxxxxxxxxxxxxxx. \n" +
            "  0777-000000 / 0810000000  \n" +
            "  Email: service@gmail.com  \n" +
            
            "\n=================================\n\n" +
            "Service ID: " +txtsid.getText()+ "\n" +
            "Vehicle Number: " +txtvnumber.getText()+ "\n" +
            "Vehicle Model: \t" +txtmodel.getText()+ "\n" +
            "Model Number: \t" +txtmnumber.getText()+ "\n" +
            "Owner NIC: \t" +txtnic.getText()+ "\n" +
            "Owner Name: \t" +txtname.getText()+ "\n" +
            "Service Type: \t" +txttype.getSelectedItem().toString()+ "\n" +
            "Date: \t" +Home.date+ "\n" +
            
            
            "\n=================================\n\n"+
              "Thank You"+ "\n\n\n\n\n" 
               
            
            );
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
     
    
    }
    
    
    
    private void btndeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndeleteActionPerformed
       
         int x=JOptionPane.showConfirmDialog(rootPane, "Do you realy want to delete");
        if(x==0)
        {
            try {
                String sql="DELETE FROM add_to_service where sid='"+ txtsid.getText() +"'";
                pst=conn.prepareStatement(sql);
                pst.execute();
                
                tablelord();
                clear();
                JOptionPane.showMessageDialog(rootPane, "Successfully Deleted");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, e);
            }
        }
        autoId();
        
    }//GEN-LAST:event_btndeleteActionPerformed

    private void txtsearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearchKeyReleased
      
        try {

            String parseSql="SELECT `sid` as 'Service ID', `vnumber` as 'Vehicle Number', `model` as 'Model Number', `modelname` as 'Model', `nic` as 'Owner NIC', `oname` as 'Owner Name', `stype` as 'Service Type', `date` as 'Receive Date' FROM `add_to_service` where vnumber Like'%"+txtsearch.getText()+"%'";
            pst=conn.prepareStatement(parseSql);
            rs=pst.executeQuery();
            tblups.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
            theader();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
        
    }//GEN-LAST:event_txtsearchKeyReleased

    private void tblupsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblupsMouseClicked
        try {
             DefaultTableModel tmodel=(DefaultTableModel)tblups.getModel();
        int selectrowindex=tblups.getSelectedRow();

        txtsid.setText(tmodel.getValueAt(selectrowindex, 0).toString());
        txtvnumber.setText(tmodel.getValueAt(selectrowindex, 1).toString());
        txtmnumber.setText(tmodel.getValueAt(selectrowindex, 2).toString());
        txtmodel.setText(tmodel.getValueAt(selectrowindex, 3).toString());
        txtnic.setText(tmodel.getValueAt(selectrowindex, 4).toString());
        txtname.setText(tmodel.getValueAt(selectrowindex, 5).toString());
        txttype.setSelectedItem(tmodel.getValueAt(selectrowindex, 6).toString());
        
       
        txtbill.setText("");
       // btnupdate.setEnabled(true);
        btndelete.setEnabled(true);
        } catch (Exception e) {
             JOptionPane.showMessageDialog(rootPane, e);
        }
       
    }//GEN-LAST:event_tblupsMouseClicked

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       
         try {
            txtbill.print();
            txtbill.setText("");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
        
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtmodelKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtmodelKeyReleased
       btnallocate.setEnabled(true);
    }//GEN-LAST:event_txtmodelKeyReleased

    private void txtsidKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsidKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsidKeyReleased

    private void txtvnumberKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtvnumberKeyReleased
       
         try {
             String sql="SELECT `v_num`, `nic`, `name`, `v_model`, `model_num`, `fual_type`, `date` FROM `add_vehicle` Where v_num='"+txtvnumber.getText()+"'";
           // String q="SELECT returndate FROM borrowdetails where mid='"+ name +"'";
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
           if(rs.next())
           {
               
               txtmodel.setText(rs.getString("v_model"));
               txtmnumber.setText(rs.getString("model_num"));
               txtnic.setText(rs.getString("nic"));
               txtname.setText(rs.getString("name"));
               btnallocate.setEnabled(true);
            
           }
           else
           {
               txtmnumber.setText("");
               txtmodel.setText("");
               txtname.setText("");
               txtnic.setText("");
           }
           
                            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
        
    }//GEN-LAST:event_txtvnumberKeyReleased

    private void btnaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnaddActionPerformed
        // txtbill.setText("");
        
         getData();
       

        try {
            String q= "INSERT INTO `add_to_service`(`sid`, `vnumber`, `model`, `modelname`, `nic`, `oname`, `stype`, `date`, `status`) VALUES ('"+sid+"','"+vnum+"','"+modelnum+"' ,'"+model+"' ,'"+nic+"' ,'"+oname+"' ,'"+type+"' ,'"+Home.date+"','1')";
            pst=conn.prepareStatement(q);
            pst.execute();
            JOptionPane.showMessageDialog(rootPane,"Successfully registered");

        }
        catch (Exception e)
        {
            JOptionPane.showMessageDialog(rootPane,e);
        }
        btnadd.setEnabled(false);
        serviceUpdate();
        recipt();
       // it_record();
        clear();
        autoId();
        tablelord();
        
        
    }                                      

    private void serviceUpdate()
    {
    
         try {
                String sql="DELETE FROM next_service where v_number='"+ txtvnumber.getText() +"'";
                pst=conn.prepareStatement(sql);
                pst.execute();
                
               // JOptionPane.showMessageDialog(rootPane, "Successfully Deleted");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, e);
            }
    }//GEN-LAST:event_btnaddActionPerformed
  // Method to send emails to all employees
private void sendEmails() {
    try {
        // SQL query to retrieve email addresses from the employee table
        String sql = "SELECT e_email FROM `employee`;";
        pst = conn.prepareStatement(sql);
        rs = pst.executeQuery();

        // Loop through the result set and send emails
        while (rs.next()) {
            String to = rs.getString("e_email");
            String subject = "Alert!!";
            String message = "Dear Employee,\n\nReport right now a car has arrived and yet to clean or service.";

            // Call the sendEmail method to send the email
            sendEmail(to, subject, message);
        }
    } catch (Exception e) {
        JOptionPane.showMessageDialog(rootPane, e);
    }
}
private void sendEmail(String to, String subject, String message) {
    // Replace these values with your email and password
    final String from = "sasindusavi@gmail.com";
    final String password = "izip voot slgp anwh";

    // Set the host and port for the SMTP server (e.g., Gmail's SMTP server)
    String host = "smtp.gmail.com";
    String port = "587";

    // Set the properties for the JavaMail API
    Properties properties = new Properties();
    properties.put("mail.smtp.host", host);
    properties.put("mail.smtp.port", port);
    properties.put("mail.smtp.auth", "true");
    properties.put("mail.smtp.starttls.enable", "true");

    // Get the Session object
    Session session = Session.getInstance(properties,
            new javax.mail.Authenticator() {
                protected PasswordAuthentication getPasswordAuthentication() {
                    return new PasswordAuthentication(from, password);
                }
            });

    try {
        // Create a default MimeMessage object
        Message emailMessage = new MimeMessage(session);

        // Set From: header field of the header
        emailMessage.setFrom(new InternetAddress(from));

        // Set To: header field of the header
        emailMessage.setRecipients(Message.RecipientType.TO, InternetAddress.parse(to));

        // Set Subject: header field
        emailMessage.setSubject(subject);

        // Now set the actual message
        emailMessage.setText(message);

        // Send message
        Transport.send(emailMessage);

        System.out.println("Sent message successfully to " + to);
    } catch (MessagingException e) {
        throw new RuntimeException(e);
    }
}
    private void btnallocateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnallocateMouseClicked

    }//GEN-LAST:event_btnallocateMouseClicked

    private void btnallocateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnallocateActionPerformed
       sendEmails();
    }//GEN-LAST:event_btnallocateActionPerformed

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
            java.util.logging.Logger.getLogger(Add_to_service.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_to_service.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_to_service.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_to_service.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_to_service().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnadd;
    private javax.swing.JButton btnallocate;
    private javax.swing.JButton btndelete;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblname;
    private javax.swing.JTable tblups;
    private javax.swing.JTextArea txtbill;
    private javax.swing.JTextField txtmnumber;
    private javax.swing.JTextField txtmodel;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtnic;
    private javax.swing.JTextField txtsearch;
    private javax.swing.JTextField txtsid;
    private javax.swing.JComboBox txttype;
    private javax.swing.JTextField txtvnumber;
    // End of variables declaration//GEN-END:variables
}
