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
 * @author acer
 */
public class MonthlyReport extends javax.swing.JInternalFrame {
    //String date="";
    Connection conn;
    PreparedStatement pst=null;
    ResultSet rs=null;
    String sqr;

    /**
     * Creates new form MonthlyReport
     */
    public MonthlyReport() throws SQLException {
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

        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        fDate = new com.toedter.calendar.JDateChooser();
        tDate = new com.toedter.calendar.JDateChooser();
        jButtonProcess = new javax.swing.JButton();
        jButtonPrint = new javax.swing.JButton();
        jButtonClear = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblsale = new javax.swing.JTable();

        jPanel2.setBackground(new java.awt.Color(212, 194, 148));

        jLabel10.setFont(new java.awt.Font("Sitka Text", 3, 18)); // NOI18N
        jLabel10.setText("Monthly Report");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel3MouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Sales");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("To");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("From");

        fDate.setDateFormatString("yyyy-MM-dd");
        fDate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                fDateMouseClicked(evt);
            }
        });

        tDate.setDateFormatString("yyyy-MM-dd");

        jButtonProcess.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonProcess.setText("Process");
        jButtonProcess.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonProcessActionPerformed(evt);
            }
        });

        jButtonPrint.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonPrint.setText("Print");
        jButtonPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPrintActionPerformed(evt);
            }
        });

        jButtonClear.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButtonClear.setText("Clear");
        jButtonClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonClearActionPerformed(evt);
            }
        });

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
        tblsale.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblsaleMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblsale);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 604, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(17, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButtonProcess)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonPrint)
                        .addGap(18, 18, 18)
                        .addComponent(jButtonClear)
                        .addGap(50, 50, 50))))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fDate, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tDate, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonProcess)
                        .addComponent(jButtonClear)
                        .addComponent(jButtonPrint)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(tDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPrintActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonPrintActionPerformed

    private void tblsaleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblsaleMouseClicked
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

    }//GEN-LAST:event_tblsaleMouseClicked

     private void clear()
    {
        ((JTextField)fDate.getDateEditor().getUiComponent()).setText("");
        ((JTextField)tDate.getDateEditor().getUiComponent()).setText("");
    }
    
    private void jButtonClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonClearActionPerformed
        clear();
        tableLoad();
    }//GEN-LAST:event_jButtonClearActionPerformed

    private void jButtonProcessActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonProcessActionPerformed
        String saleFDate = ((JTextField)fDate.getDateEditor().getUiComponent()).getText();
        String saleTDate = ((JTextField)tDate.getDateEditor().getUiComponent()).getText();
        
        if(saleFDate.length()>0 && saleTDate.isEmpty())
        {
            try {
                PreparedStatement pst= conn.prepareStatement("select * from CUSTOMERPURCHASE where DATEPURCHASED='"+saleFDate+"'");
                // pst=conn.prepareStatement(sql);
                rs=pst.executeQuery();
                tblsale.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));            
            } catch (Exception e) {
                JOptionPane.showConfirmDialog(rootPane, e);
            }
        }
        
        else if(saleFDate.length()>0 && saleTDate.length()>0)
        {
            
            try {
                PreparedStatement pst= conn.prepareStatement("select * from CUSTOMERPURCHASE where DATEPURCHASED between '"+saleFDate+"' and '"+saleTDate+"'");
                // pst=conn.prepareStatement(sql);
                rs=pst.executeQuery();
                tblsale.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));            
            } catch (Exception e) {
                JOptionPane.showConfirmDialog(rootPane, e);
            }
        }
        
        else
        {
            JOptionPane.showConfirmDialog(rootPane, "Select date");
        }
    }//GEN-LAST:event_jButtonProcessActionPerformed

    private void fDateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_fDateMouseClicked
        
    }//GEN-LAST:event_fDateMouseClicked

    private void jPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseClicked
        
    }//GEN-LAST:event_jPanel3MouseClicked

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
    private com.toedter.calendar.JDateChooser fDate;
    private javax.swing.JButton jButtonClear;
    private javax.swing.JButton jButtonPrint;
    private javax.swing.JButton jButtonProcess;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private com.toedter.calendar.JDateChooser tDate;
    private javax.swing.JTable tblsale;
    // End of variables declaration//GEN-END:variables

    
}
