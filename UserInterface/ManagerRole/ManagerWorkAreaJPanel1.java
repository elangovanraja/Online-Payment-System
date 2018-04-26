/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.ManagerRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import UserInterface.CustomerRole.CustomerService;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author Pooja Narasimhan
 */
public class ManagerWorkAreaJPanel1 extends javax.swing.JPanel {

    /**
     * Creates new form ManagerWorkAreaJPanel1
     */
    private JPanel container;
    private UserAccount account; 
    private Organization organization;
    private Enterprise enterprise;
    private EcoSystem system;
    public ManagerWorkAreaJPanel1(JPanel container,UserAccount account,Organization organization,Enterprise enterprise,EcoSystem system) {
        
        initComponents();
        this.container = container;
        this.account = account;
        this.system = system;
        this.organization = organization;
        this.enterprise = enterprise;
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 204));

        jButton1.setText("Assign Work");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Approve Address");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(178, 178, 178)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, 173, Short.MAX_VALUE))
                .addContainerGap(206, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jButton1)
                .addGap(63, 63, 63)
                .addComponent(jButton2)
                .addContainerGap(172, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        ManagerWorkAreaJPanel mwa = new ManagerWorkAreaJPanel(container, account, organization, enterprise, system);
                container.add("ManagerWorkAreaJPanel", mwa);
                CardLayout layout = (CardLayout) container.getLayout();
                layout.next(container);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        ChangeofAddressRequest car = new ChangeofAddressRequest(container, account, organization, enterprise, system);
                container.add("ChangeofAddressRequest", car);
                CardLayout layout = (CardLayout) container.getLayout();
                layout.next(container);
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    // End of variables declaration//GEN-END:variables
}