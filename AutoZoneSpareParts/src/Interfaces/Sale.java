/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

//import com.sun.jmx.snmp.BerDecoder;
import java.awt.Image;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ccs
 */
public class Sale extends javax.swing.JInternalFrame {

    /**
     * Creates new form Suplier
     */
    Connection conn;
    String pid="";
    String nic="";
    String serialnum="";
    int quantity=0;
    String date="";
    Double payment=0.0;
   
    
    PreparedStatement pst=null;
    ResultSet rs=null;
    String sqr;
    
    
    public Sale() throws SQLException {
        initComponents();
        conn = DBconnect.connect();
        tableLoad();
        combolordNIC();
        combolordSerial();
        autoId();
    }

    private void combolordNIC()
    {

         try {
        
        
         String sql="select DISTINCT CUSTNIC from CUSTOMER";          
            pst=conn.prepareStatement(sql);
           
           
         //  PreparedStatement pst= conn.prepareStatement("select * from CATEGORY Where CATEGORYID="+txtsearch.getText()+"");
           // pst=conn.prepareStatement(sql);
//            rs=pst.executeQuery();
//            tblsup.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs)); 
//        
//        
//        
//           // String sq="SELECT DISTINCT CATEGORYID from receivestock inner join stock where receivestock.item_number=stock.item_number";
//           
//                PreparedStatement pst= conn.prepareStatement("select DISTINCT CUSTNIC from CUSTOMER");
//           ///  pst=conn.prepareStatement(sq);
             rs=pst.executeQuery();
             while(rs.next())
             {
             String name=rs.getString("CUSTNIC");
             cmbnic.addItem(name);
             }
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(rootPane, ex);
         }
    }
    
    private void combolordSerial()
    {

           // String sq="SELECT DISTINCT CATEGORYID from receivestock inner join stock where receivestock.item_number=stock.item_number";
            try {
                
                String sql="select DISTINCT SERIALNUMBER from SPAREPART";          
            pst=conn.prepareStatement(sql);
                
                
                
              //  PreparedStatement pst= conn.prepareStatement("select DISTINCT SERIALNUMBER from SPAREPART");
           ///  pst=conn.prepareStatement(sq);
             rs=pst.executeQuery();
             while(rs.next())
             {
             String name=rs.getString("SERIALNUMBER");
             cmbserial.addItem(name);
             }
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(rootPane, ex);
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtpid = new javax.swing.JTextField();
        txtquantity = new javax.swing.JTextField();
        txtpayment = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblsale = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        txtbirth = new com.toedter.calendar.JDateChooser();
        txtsearch = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        cmbnic = new javax.swing.JComboBox();
        cmbserial = new javax.swing.JComboBox();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(720, 470));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(212, 194, 148));

        jLabel10.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        jLabel10.setText("Customer Purchase");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addContainerGap(523, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 50));

        jLabel2.setFont(new java.awt.Font("Sitka Text", 3, 14)); // NOI18N
        jLabel2.setText("Cust NIC");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, -1, -1));

        jLabel3.setFont(new java.awt.Font("Sitka Text", 3, 14)); // NOI18N
        jLabel3.setText("Serial Number");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jLabel4.setFont(new java.awt.Font("Sitka Text", 3, 14)); // NOI18N
        jLabel4.setText("Quantity");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        jLabel5.setFont(new java.awt.Font("Sitka Text", 3, 14)); // NOI18N
        jLabel5.setText("Date");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 260, -1, -1));

        jLabel6.setFont(new java.awt.Font("Sitka Text", 3, 14)); // NOI18N
        jLabel6.setText("Payment");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, -1, -1));

        txtpid.setEditable(false);
        txtpid.setPreferredSize(new java.awt.Dimension(59, 22));
        jPanel1.add(txtpid, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 164, -1));

        txtquantity.setPreferredSize(new java.awt.Dimension(59, 22));
        jPanel1.add(txtquantity, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, 164, -1));

        txtpayment.setPreferredSize(new java.awt.Dimension(59, 22));
        jPanel1.add(txtpayment, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 310, 164, -1));

        jLabel11.setFont(new java.awt.Font("Sitka Text", 3, 14)); // NOI18N
        jLabel11.setText("Purchas ID");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        tblsale.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblsale.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        tblsale.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblsaleMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblsale);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 400, 210));

        jButton2.setFont(new java.awt.Font("Sitka Text", 3, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/add.png"))); // NOI18N
        jButton2.setText("Add Data");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 390, 150, 40));

        jButton3.setFont(new java.awt.Font("Sitka Text", 3, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/edit-validated-icon (1).png"))); // NOI18N
        jButton3.setText("Update Data");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, 150, 40));

        jButton4.setFont(new java.awt.Font("Sitka Text", 3, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/delete.png"))); // NOI18N
        jButton4.setText("Delete Data");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 390, 140, 40));

        jButton5.setFont(new java.awt.Font("Sitka Text", 3, 14)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/clear.png"))); // NOI18N
        jButton5.setText("Clear");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 390, 140, 40));

        txtbirth.setDateFormatString("yyyy-MM-dd");
        jPanel1.add(txtbirth, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 260, 160, -1));

        txtsearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtsearchKeyReleased(evt);
            }
        });
        jPanel1.add(txtsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 120, 140, -1));

        jButton6.setFont(new java.awt.Font("Sitka Text", 3, 12)); // NOI18N
        jButton6.setText("Search");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 120, 140, -1));

        jLabel12.setFont(new java.awt.Font("Sitka Text", 3, 12)); // NOI18N
        jLabel12.setText("Purchase ID");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, 80, -1));

        jPanel1.add(cmbnic, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, 160, -1));

        jPanel1.add(cmbserial, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 170, 160, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void getData()
    {
    
        try {
            pid = txtpid.getText();
            nic =cmbnic.getSelectedItem().toString();
     //   pid = Integer.parseInt(txtpid.getText());
        serialnum = cmbserial.getSelectedItem().toString();
        quantity = Integer.parseInt(txtquantity.getText());
        date = ((JTextField)txtbirth.getDateEditor().getUiComponent()).getText();
        payment = Double.parseDouble(txtpayment.getText());
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }
    }
    
//    private ImageIcon format=null;
//String fname=null;
//int s=0;
//byte[] pimage=null;
//
//      public ImageIcon resizeImage(String imagePath, byte[] pic){
//          
//        ImageIcon myImage=null;
//        if(imagePath !=null)
//        {
//        myImage=new ImageIcon(imagePath);
//        
//        }else{
//         myImage=new ImageIcon(pic);
//        }
//                
//        Image img=myImage.getImage();
//        Image img2=img.getScaledInstance(lblimage.getHeight(), lblimage.getWidth(),  Image.SCALE_SMOOTH);
//        ImageIcon image=new ImageIcon(img2);
//        return image;
//    } 
    
    
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       
        getData();
        try {
//Connection conn;
//conn = DriverManager.getConnection("jdbc:derby://localhost:1527/autozone", "root", "root");
         //   getData();
            
            PreparedStatement pst= conn.prepareStatement("insert into CUSTOMERPURCHASE(PURCHASID,CUSTNIC,SERIALNUMBER,QUANTITYPURCHASED,DATEPURCHASED,PAYMENT)values(?,?,?,?,?,?)");
       // ps.setInt(1, 10);
        pst.setString(1, pid);
                pst.setString(2, nic);
                pst.setString(3, serialnum);
                pst.setInt(4, quantity);
                pst.setString(5, date);
                pst.setDouble(6, payment);
                              
               // pst.execute();
        int a =pst.executeUpdate();
        if(a>0)
        {
            JOptionPane.showMessageDialog(rootPane, "Record data!!");
       // System.out.println("Record Data!!!");
        }
            
        } catch (Exception e) {
            System.out.println(e);
           // JOptionPane.showMessageDialog(rootPane, e+"eoorr");
        }
        clear();
        tableLoad();
        autoId();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void clear()
    {
    
        txtpid.setText("");
        cmbnic.setSelectedIndex(0);
        cmbserial.setSelectedIndex(0);
        
        txtquantity.setText("");

        txtpayment.setText("");

        ((JTextField)txtbirth.getDateEditor().getUiComponent()).setText("");
        
                
    
    }
    
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        clear();
        tableLoad();
        autoId();
    }//GEN-LAST:event_jButton5ActionPerformed

    private void tblsaleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblsaleMouseClicked
      DefaultTableModel tmodel=(DefaultTableModel)tblsale.getModel();
        int selectrowindex=tblsale.getSelectedRow();
        txtpid.setText(tmodel.getValueAt(selectrowindex, 0).toString());
        cmbnic.setSelectedItem(tmodel.getValueAt(selectrowindex, 1).toString());
        cmbserial.setSelectedItem(tmodel.getValueAt(selectrowindex, 2).toString());

        txtquantity.setText(tmodel.getValueAt(selectrowindex, 3).toString());
        ((JTextField)txtbirth.getDateEditor().getUiComponent()).setText(tmodel.getValueAt(selectrowindex, 4).toString());
        txtpayment.setText(tmodel.getValueAt(selectrowindex, 5).toString());

        
       
    }//GEN-LAST:event_tblsaleMouseClicked

    
    
    private void autoId()
    {
        try {
            String sql="SELECT `PURCHASID` FROM `customerpurchase` ORDER BY PURCHASID DESC LIMIT 1";          
            pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
           if(rs.next())
           {
               String rnno=rs.getString("PURCHASID");
               int co=rnno.length();
               String txt= rnno.substring(0, 3);
               String num=rnno.substring(3, co);
               int n=Integer.parseInt(num);
               n++;
               String snum=Integer.toString(n);
               String ftxt=txt+snum;
               txtpid.setText(ftxt);
           }
            else
           {
               txtpid.setText("PID1000");
           }                           
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane, e);
        }       
    }
    
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
     getData();
        try {
            
            PreparedStatement pst= conn.prepareStatement("Update customerpurchase Set CUSTNIC=?,SERIALNUMBER=?,QUANTITYPURCHASED=?,DATEPURCHASED=?,PAYMENT=? Where PURCHASID='"+txtpid.getText()+"'");
       // ps.setInt(1, 10);                                                     `PURCHASID`, `CUSTNIC`, `SERIALNUMBER`, `QUANTITYPURCHASED`, `DATEPURCHASED`, `PAYMENT` 
            
        /// pst.setString(1, nic);
                pst.setString(1, nic);
                pst.setString(2, serialnum);
                pst.setInt(3, quantity);
                pst.setString(4, date);
                pst.setDouble(5, payment);
          
        int a =pst.executeUpdate();
        if(a>0)
        {
            JOptionPane.showMessageDialog(rootPane, "Update data!!");
       // System.out.println("Record Data!!!");
        }
          tableLoad();
          clear();
          autoId();
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(rootPane,e);
        }
               
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        getData();
        try {
            
            PreparedStatement pst= conn.prepareStatement("Delete from CUSTOMERPURCHASE Where PURCHASID='"+txtpid.getText()+"'");
       
        int a =pst.executeUpdate();
        if(a>0)
        {
            JOptionPane.showMessageDialog(rootPane, "Delete data!!");
       // System.out.println("Record Data!!!");
        }
          tableLoad();
          clear();
          autoId();
            
        } catch (Exception e) {
            System.out.println(e);
            JOptionPane.showMessageDialog(rootPane,e);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void txtsearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearchKeyReleased
       
        
        
    }//GEN-LAST:event_txtsearchKeyReleased

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       try {
            PreparedStatement pst= conn.prepareStatement("select * from CUSTOMERPURCHASE Where PURCHASEID="+txtsearch.getText()+"");
           // pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            tblsale.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void tableLoad()
    {
    
     try {
            PreparedStatement pst= conn.prepareStatement("select * from CUSTOMERPURCHASE");
           // pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            tblsale.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox cmbnic;
    private javax.swing.JComboBox cmbserial;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblsale;
    private com.toedter.calendar.JDateChooser txtbirth;
    private javax.swing.JTextField txtpayment;
    private javax.swing.JTextField txtpid;
    private javax.swing.JTextField txtquantity;
    private javax.swing.JTextField txtsearch;
    // End of variables declaration//GEN-END:variables
}
