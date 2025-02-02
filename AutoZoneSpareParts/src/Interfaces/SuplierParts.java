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
public class SuplierParts extends javax.swing.JInternalFrame {

    /**
     * Creates new form Suplier
     */
    Connection conn;
//    String nic="";
//    String ftname="";
//    String lname="";
//    String address="";
//    String city="";
//    int pcode=0;
//    int phone=0;
//    String email="";
//    String birth;
    
    PreparedStatement pst=null;
    ResultSet rs=null;
    String sqr;
    
                      
    public SuplierParts() throws SQLException {
        initComponents();
        conn = DBconnect.connect();
        tableLoad();
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
        jScrollPane2 = new javax.swing.JScrollPane();
        tblsup = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();
        txtnic = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        txtserial = new javax.swing.JTextField();
        jButton7 = new javax.swing.JButton();

        setClosable(true);
        setPreferredSize(new java.awt.Dimension(720, 470));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(212, 194, 148));

        jLabel10.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        jLabel10.setText("Suplier Parts");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addContainerGap(575, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 50));

        tblsup.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tblsup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblsupMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblsup);

        jPanel1.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 670, 250));

        jButton5.setFont(new java.awt.Font("Sitka Text", 3, 12)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/clear.png"))); // NOI18N
        jButton5.setText("Clear");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, 150, 60));

        txtnic.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtnicKeyReleased(evt);
            }
        });
        jPanel1.add(txtnic, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 140, -1));

        jButton6.setFont(new java.awt.Font("Sitka Text", 3, 12)); // NOI18N
        jButton6.setText("Search");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, 140, -1));

        jLabel12.setFont(new java.awt.Font("Sitka Text", 3, 12)); // NOI18N
        jLabel12.setText("Suplier NIC");
        jPanel1.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 90, -1));

        jLabel13.setFont(new java.awt.Font("Sitka Text", 3, 12)); // NOI18N
        jLabel13.setText("Serial Number");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 60, 90, -1));

        txtserial.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtserialKeyReleased(evt);
            }
        });
        jPanel1.add(txtserial, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 140, -1));

        jButton7.setFont(new java.awt.Font("Sitka Text", 3, 12)); // NOI18N
        jButton7.setText("Search");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 140, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

//    private void getData()
//    {
//    
//        try {
//            nic = txtnic.getText();
//        ftname = txtfname.getText();
//        lname = txtlname.getText();
//        address = txtaddress.getText();
//        city = txtcity.getText();
//        pcode = Integer.parseInt(txtpcode.getText());
//        phone = Integer.parseInt(txtphone.getText());
//        email = txtemail.getText();
//        birth = ((JTextField)txtbirth.getDateEditor().getUiComponent()).getText();
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(rootPane, e);
//        }
//    }
    
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
    
    
//    private void clear()
//    {
//    
//        txtnic.setText("");
//        txtfname.setText("");
//        txtlname.setText("");
//        txtaddress.setText("");
//        txtcity.setText("");
//        txtpcode.setText("");
//        txtphone.setText("");
//        txtemail.setText("");
//        lblimage.setIcon(null);
//        ((JTextField)txtbirth.getDateEditor().getUiComponent()).setText("");
//        
//                
//    
//    }
    
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
       
        tableLoad();
        txtnic.setText("");
        txtserial.setText("");
    }//GEN-LAST:event_jButton5ActionPerformed

    private void tblsupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblsupMouseClicked
//      DefaultTableModel tmodel=(DefaultTableModel)tblsup.getModel();
//        int selectrowindex=tblsup.getSelectedRow();
//        txtnic.setText(tmodel.getValueAt(selectrowindex, 0).toString());
//        txtfname.setText(tmodel.getValueAt(selectrowindex, 1).toString());
//        txtlname.setText(tmodel.getValueAt(selectrowindex, 2).toString());
//        txtaddress.setText(tmodel.getValueAt(selectrowindex, 3).toString());
//        txtcity.setText(tmodel.getValueAt(selectrowindex, 4).toString());
//        txtpcode.setText(tmodel.getValueAt(selectrowindex, 5).toString());
//        txtphone.setText(tmodel.getValueAt(selectrowindex, 6).toString());
//        txtemail.setText(tmodel.getValueAt(selectrowindex, 7).toString());
//        ((JTextField)txtbirth.getDateEditor().getUiComponent()).setText(tmodel.getValueAt(selectrowindex, 8).toString());
       
    }//GEN-LAST:event_tblsupMouseClicked

    private void txtnicKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnicKeyReleased
       
        
        
    }//GEN-LAST:event_txtnicKeyReleased

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
       try {
            PreparedStatement pst= conn.prepareStatement("select * from SUPPLIERPART Where SUPNIC='"+txtnic.getText()+"'");
           // pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            tblsup.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void txtserialKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtserialKeyReleased
        // TODO add your handling code here:
    }//GEN-LAST:event_txtserialKeyReleased

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        try {
            PreparedStatement pst= conn.prepareStatement("select * from SUPPLIERPART Where SERIALNUMBER='"+txtserial.getText()+"'");
           // pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            tblsup.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
    }//GEN-LAST:event_jButton7ActionPerformed

    private void tableLoad()
    {
    
     try {
            PreparedStatement pst= conn.prepareStatement("select * from SUPPLIERPART");
           // pst=conn.prepareStatement(sql);
            rs=pst.executeQuery();
            tblsup.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));            
        } catch (Exception e) {
            JOptionPane.showConfirmDialog(rootPane, e);
        }
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblsup;
    private javax.swing.JTextField txtnic;
    private javax.swing.JTextField txtserial;
    // End of variables declaration//GEN-END:variables
}
