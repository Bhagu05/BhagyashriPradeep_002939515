/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Model.Customer;
import Model.DeliveryPackage;
import Model.Product;
import javax.swing.JOptionPane;

/**
 *
  * @author Bhagyashri Chavan

 */
public class CreateJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJPanel
     */
    
    private DeliveryPackage delPackage;
    
    private Boolean validate = false;
    
    public CreateJPanel() {
        initComponents();
        
    }

    CreateJPanel(DeliveryPackage deliveryPackage) {
        initComponents();
        
        // logic to take information from the user and store it in the delivery package
        this.delPackage = deliveryPackage;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        packageIdCreate = new javax.swing.JTextField();
        packageWtCreate = new javax.swing.JTextField();
        custIdCreate = new javax.swing.JTextField();
        productIdCreate = new javax.swing.JTextField();
        productNameCreate = new javax.swing.JTextField();
        productPriceCreate = new javax.swing.JTextField();
        custNameCreate = new javax.swing.JTextField();
        custIdLabel = new javax.swing.JLabel();
        packageIdLabel = new javax.swing.JLabel();
        packageWeightLabel = new javax.swing.JLabel();
        prodIdLabel = new javax.swing.JLabel();
        prodNameLabel = new javax.swing.JLabel();
        prodPriceLabel = new javax.swing.JLabel();
        custNameLabel = new javax.swing.JLabel();
        btnSave = new javax.swing.JButton();
        btnSaveProd = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 255));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(packageIdCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 130, 30));
        add(packageWtCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 130, 30));
        add(custIdCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 130, 30));
        add(productIdCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 370, 130, 30));
        add(productNameCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 430, 130, 30));
        add(productPriceCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 490, 130, 30));

        custNameCreate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                custNameCreateFocusLost(evt);
            }
        });
        add(custNameCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 70, 130, 30));

        custIdLabel.setText("ID");
        add(custIdLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 130, -1, 20));

        packageIdLabel.setText("Package Id");
        add(packageIdLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        packageWeightLabel.setText("weight");
        add(packageWeightLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 140, -1, -1));

        prodIdLabel.setText("ProdId");
        add(prodIdLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, -1, 20));

        prodNameLabel.setText("ProdName");
        add(prodNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 440, -1, 20));

        prodPriceLabel.setText("ProdPrice");
        add(prodPriceLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, -1, 20));

        custNameLabel.setText("Customer name");
        add(custNameLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 80, -1, 20));

        btnSave.setText("SAVE");
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });
        add(btnSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 200, -1, -1));

        btnSaveProd.setText("SAVE PRODUCT");
        btnSaveProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveProdActionPerformed(evt);
            }
        });
        add(btnSaveProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 490, 140, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        
        // get the data
        String id = packageIdCreate.getText();
        String weight = packageWtCreate.getText();
        
        String customerId = custIdCreate.getText();
        String customername = custNameCreate.getText();
        
        
        
        // store the data
        this.delPackage.setPackageId(Integer.valueOf(id));
        this.delPackage.setPackageWeight(Double.valueOf(weight));
        
     
        Customer customer = this.delPackage.getCustomer();
        customer.setCustomerId(Integer.valueOf(customerId));
        customer.setFullName(customername);
        
        if(validate) {
            JOptionPane.showMessageDialog(null, "Pleae fill all fields");
        } else {
            JOptionPane.showMessageDialog(null, "Saved!");
        }
        
                
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnSaveProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveProdActionPerformed
        // TODO add your handling code here:
        String productId = productIdCreate.getText();
        String productName = productNameCreate.getText();
        String productPrice = productPriceCreate.getText();
        
        Product product = this.delPackage.createProduct(Integer.valueOf(productId), productName, Double.valueOf(productPrice));
       
         JOptionPane.showMessageDialog(null, "Added Product");
    }//GEN-LAST:event_btnSaveProdActionPerformed

    private void custNameCreateFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_custNameCreateFocusLost
        // TODO add your handling code here:
        
        System.out.println(custNameCreate.getText() + " -- the customer name");
        String name = custNameCreate.getText();
        
        if(name.isEmpty()) {
           // JOptionPane.showMessageDialog(null, "Please fill name");
            this.validate = true;
        } else {
            this.validate = false;
        }
    }//GEN-LAST:event_custNameCreateFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnSaveProd;
    private javax.swing.JTextField custIdCreate;
    private javax.swing.JLabel custIdLabel;
    private javax.swing.JTextField custNameCreate;
    private javax.swing.JLabel custNameLabel;
    private javax.swing.JTextField packageIdCreate;
    private javax.swing.JLabel packageIdLabel;
    private javax.swing.JLabel packageWeightLabel;
    private javax.swing.JTextField packageWtCreate;
    private javax.swing.JLabel prodIdLabel;
    private javax.swing.JLabel prodNameLabel;
    private javax.swing.JLabel prodPriceLabel;
    private javax.swing.JTextField productIdCreate;
    private javax.swing.JTextField productNameCreate;
    private javax.swing.JTextField productPriceCreate;
    // End of variables declaration//GEN-END:variables
}
