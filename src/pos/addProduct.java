/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pos;

/**
 *
 * @author kcu
 */
import java.awt.*;


import com.itextpdf.text.BaseColor;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.Dimension;
import java.awt.Toolkit;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Font.FontFamily;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.GrayColor;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfWriter;
import com.itextpdf.text.pdf.PdfPTable;
import java.awt.Font;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;
public class addProduct extends javax.swing.JFrame {

    /**
     * Creates new form addProduct
     */
    double sum=0;
    Connection conn=null;
ResultSet rs=null;
PreparedStatement pst=null;
    
    public addProduct() {
        initComponents();
         conn=db.java_db();
 Toolkit toolkit = getToolkit();
  Dimension size = toolkit.getScreenSize();
  setLocation(size.width/2 - getWidth()/2, 
   size.height/2 - getHeight()/2);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_id = new javax.swing.JTextField();
        txt_name = new javax.swing.JTextField();
        txt_price = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        txt_search = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        kartbtn = new javax.swing.JButton();
        endbtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        txt_quantity = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txt_invoice = new javax.swing.JTextField();
        invoicebtn = new javax.swing.JButton();
        txt_sum = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txt_r = new javax.swing.JTextField();
        txt_c = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Product ID:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Product Name:");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Price:");

        txt_id.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txt_id.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_id.setEnabled(false);
        txt_id.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_idActionPerformed(evt);
            }
        });

        txt_name.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txt_name.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        txt_price.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txt_price.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_priceActionPerformed(evt);
            }
        });

        jButton2.setText("Main menu");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Logout");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        txt_search.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txt_search.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_searchActionPerformed(evt);
            }
        });
        txt_search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_searchKeyReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("search:");

        kartbtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        kartbtn.setText("Add to Kart");
        kartbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                kartbtnActionPerformed(evt);
            }
        });

        endbtn.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        endbtn.setText("Conclude Transaction");
        endbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                endbtnActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel5.setText("Quantity:");

        txt_quantity.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txt_quantity.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_quantity.setText("1");
        txt_quantity.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_quantityActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel6.setText("Invoice ID:");

        txt_invoice.setEditable(false);
        txt_invoice.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txt_invoice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_invoice.setText("POS000");

        invoicebtn.setText("Generate Invoive ID");
        invoicebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                invoicebtnActionPerformed(evt);
            }
        });

        txt_sum.setEditable(false);
        txt_sum.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txt_sum.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        jLabel7.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel7.setText("Total Price:");

        jLabel8.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel8.setText("Cash received BDT:");

        jLabel9.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel9.setText("Change BDT:");

        txt_r.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txt_r.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txt_r.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_rActionPerformed(evt);
            }
        });
        txt_r.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_rKeyReleased(evt);
            }
        });

        txt_c.setEditable(false);
        txt_c.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        txt_c.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(71, 71, 71)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel2)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_r)
                            .addComponent(txt_c, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE))
                        .addGap(196, 196, 196)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(kartbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(endbtn))
                        .addGap(20, 20, 20))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton3))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txt_id, javax.swing.GroupLayout.DEFAULT_SIZE, 203, Short.MAX_VALUE)
                                        .addComponent(txt_name)
                                        .addComponent(txt_price))
                                    .addComponent(txt_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_sum)
                                    .addComponent(txt_invoice))
                                .addGap(18, 18, 18)
                                .addComponent(invoicebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(250, 250, 250)))
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jButton3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_id, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_price, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_quantity, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_invoice, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(invoicebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(25, 25, 25)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_sum, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kartbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(txt_r, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_c, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(endbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(65, 65, 65))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_priceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_priceActionPerformed

    private void txt_idActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_idActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_txt_idActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         login j=new login();
            j.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void txt_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_searchActionPerformed
        // TODO add your handling code here:
               
    }//GEN-LAST:event_txt_searchActionPerformed

    private void txt_searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_searchKeyReleased
        // TODO add your handling code here:
         try{

            String sql ="select * from products where name=? ";

            pst=conn.prepareStatement(sql);
            pst.setString(1,txt_search.getText());
            rs=pst.executeQuery();
            
                String add1 =rs.getString("product_id");
                txt_id.setText(add1);

                String add2 =rs.getString("name");
                txt_name.setText(add2);

                String add3 =rs.getString("price");
                txt_price.setText(add3);
                
       
            
        }catch(Exception e){
          
        }
        finally {

            try{

                rs.close();
                pst.close();
               
            }
            catch(Exception e){

            }
        }
    }//GEN-LAST:event_txt_searchKeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
         mainMenu j=new mainMenu();
            j.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txt_quantityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_quantityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_quantityActionPerformed

    private void kartbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_kartbtnActionPerformed
        // TODO add your handling code here:
         double price=Double.parseDouble(txt_price.getText());
         double quantity=Double.parseDouble(txt_quantity.getText());
         sum=sum+(price*quantity);
         txt_sum.setText(""+sum);
        try {
                String sql ="insert into sales values (?,?,?,?,?) ";

                pst=conn.prepareStatement(sql);
                pst.setString(1,txt_invoice.getText());
                pst.setString(2,txt_name.getText());
                pst.setString(3,txt_price.getText());
                pst.setString(4,txt_quantity.getText());
                pst.setString(5,""+(price*quantity));
    
                pst.execute();
                JOptionPane.showMessageDialog(null,"added to kart successfully");
                //txt_name.setText("");
                //txt_price.setText("");

            }
            catch (Exception e)

            {
                JOptionPane.showMessageDialog(null,e);
            }
        
            finally {

                try{
                    rs.close();
                    pst.close();
                   txt_search.setText("");
                  txt_id.setText("");
                txt_quantity.setText("1");
                 txt_name.setText("");
                  txt_price.setText("");
                
                   

                }
                 catch(Exception e){
                   //JOptionPane.showMessageDialog(null,e);
                }
             
               
         }
    }//GEN-LAST:event_kartbtnActionPerformed

    private void invoicebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_invoicebtnActionPerformed
        // TODO add your handling code here:
        Random rand = new Random();
        int rand1 = rand.nextInt(1000);
        String S1=txt_invoice.getText();
        txt_invoice.setText(S1+rand1);
        
    }//GEN-LAST:event_invoicebtnActionPerformed

    private void endbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_endbtnActionPerformed
 
        
            JFileChooser dialog = new JFileChooser();
            dialog.setSelectedFile(new File("receipt"+txt_invoice.getText()+".pdf"));
            int dialogResult = dialog.showSaveDialog(null);
            if (dialogResult==JFileChooser.APPROVE_OPTION){
            String filePath = dialog.getSelectedFile().getPath();
           
        try {
            // TODO add your handling code here:
            
            String sql ="select * from sales where invoice_no=?";
            
 
            pst=conn.prepareStatement(sql);
            pst.setString(1,txt_invoice.getText());
            rs=pst.executeQuery();
            
           
           Document myDocument = new Document();
           PdfWriter myWriter = PdfWriter.getInstance(myDocument, new FileOutputStream(filePath ));
           PdfPTable table = new PdfPTable(4);
           myDocument.open();
           
   
           float[] columnWidths = new float[] { 6,6,6,6};
           table.setWidths(columnWidths);

           table.setWidthPercentage(100); //set table width to 100%
           
          
           myDocument.add(new Paragraph("===Sales Invoice===",FontFactory.getFont(FontFactory.TIMES_BOLD,20,Font.BOLD )));
           myDocument.add(new Paragraph(new Date().toString()));
             myDocument.add(new Paragraph("-------------------------------------------------------------------------------------------"));
              myDocument.add(new Paragraph("--------------------------------------------------------------------------------------------"));
             myDocument.add(new Paragraph("Sales ID: "+txt_invoice.getText()));
           myDocument.add(new Paragraph("-------------------------------------------------------------------------------------------"));
            myDocument.add(new Paragraph("--------------------------------------------------------------------------------------------"));
          //table.addCell(new PdfPCell(new Paragraph("sales ID",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
          table.addCell(new PdfPCell(new Paragraph("Product Name",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
          table.addCell(new PdfPCell(new Paragraph("Price",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
          table.addCell(new PdfPCell(new Paragraph("Quantity",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));
          table.addCell(new PdfPCell(new Paragraph("Subtotal",FontFactory.getFont(FontFactory.TIMES_ROMAN,10,Font.BOLD))));

               while(rs.next())
            {
          // table.addCell(new PdfPCell(new Paragraph(rs.getString(1),FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.PLAIN))));
           table.addCell(new PdfPCell(new Paragraph(rs.getString(2),FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.PLAIN))));
           table.addCell(new PdfPCell(new Paragraph(rs.getString(3),FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.PLAIN))));
           table.addCell(new PdfPCell(new Paragraph(rs.getString(4),FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.PLAIN))));
           table.addCell(new PdfPCell(new Paragraph(rs.getString(5),FontFactory.getFont(FontFactory.TIMES_ROMAN,9,Font.PLAIN))));
            }
           
           myDocument.add(table);
            myDocument.add(new Paragraph("--------------------------------------------------------------------------------------------"));
             myDocument.add(new Paragraph("--------------------------------------------------------------------------------------------"));
             myDocument.add(new Paragraph("Total BDT: "+txt_sum.getText()));
             myDocument.add(new Paragraph("Received BDT: "+txt_r.getText()));
             myDocument.add(new Paragraph("Change BDT: "+txt_c.getText()));
           myDocument.add(new Paragraph("--------------------------------------------------------------------------------------------"));
            myDocument.add(new Paragraph("--------------------------------------------------------------------------------------------"));
            myDocument.add(new Paragraph(""));
            myDocument.add(new Paragraph(""));
            myDocument.add(new Paragraph(""));
            myDocument.add(new Paragraph(""));
            myDocument.add(new Paragraph("***Contact within 24hours in case of any complaint which will be resolved as per our sales policy***"));
           myDocument.close();  
           JOptionPane.showMessageDialog(null,"receipt was successfully generated");
            
     }
        catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
         
         
     }
     finally {
            
            try{
                rs.close();
                pst.close();
                sum=0;
                 txt_search.setText("");
                  txt_id.setText("");
                txt_quantity.setText("1");
                 txt_name.setText("");
                  txt_price.setText("");
                 txt_sum.setText("");
                 txt_r.setText("");
                 txt_c.setText("");
                 txt_invoice.setText("POS000");
             
            }
            catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
         
            }
     }
   }
                
        
    }//GEN-LAST:event_endbtnActionPerformed

    private void txt_rKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_rKeyReleased
        // TODO add your handling code here:
        double r=Integer.parseInt(txt_r.getText());
        double c=r-sum;
        txt_c.setText(""+c);
        
    }//GEN-LAST:event_txt_rKeyReleased

    private void txt_rActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_rActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_rActionPerformed

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
            java.util.logging.Logger.getLogger(addProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(addProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(addProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(addProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new addProduct().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton endbtn;
    private javax.swing.JButton invoicebtn;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton kartbtn;
    private javax.swing.JTextField txt_c;
    private javax.swing.JTextField txt_id;
    private javax.swing.JTextField txt_invoice;
    private javax.swing.JTextField txt_name;
    private javax.swing.JTextField txt_price;
    private javax.swing.JTextField txt_quantity;
    private javax.swing.JTextField txt_r;
    private javax.swing.JTextField txt_search;
    private javax.swing.JTextField txt_sum;
    // End of variables declaration//GEN-END:variables
   
}
