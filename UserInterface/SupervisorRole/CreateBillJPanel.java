/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UserInterface.SupervisorRole;

import Business.DB4OUtil.DB4OUtil;
import Business.EBillPayment.EBill;
import Business.EcoSystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Pooja Narasimhan
 */
public class CreateBillJPanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateBillJPanel
     */
    private JPanel container;
    private UserAccount account;
    private Organization organization;
    private Enterprise enterprise;
    private EcoSystem system;
    private DB4OUtil db4OUtil;
    private Employee emp;

    public CreateBillJPanel(JPanel container, UserAccount account, Organization organization, Enterprise enterprise, EcoSystem system, Employee emp) {
        initComponents();
        this.container = container;
        this.account = account;
        this.system = system;
        this.organization = organization;
        this.enterprise = enterprise;

        this.emp = emp;
        lblName.setText(emp.getName());

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
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        lblName = new javax.swing.JLabel();
        txtWattUsed = new javax.swing.JTextField();
        txtCostperWatt = new javax.swing.JTextField();
        lblAmount = new javax.swing.JLabel();
        lblFine = new javax.swing.JLabel();
        lblDueDate = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        txtDate = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 255, 204));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Bill Details ");

        jLabel2.setText("Name");

        jLabel3.setText("Cost Per Watt");

        jLabel4.setText("Watt Used");

        jLabel5.setText("Amount");

        jLabel6.setText("Fine");

        jLabel7.setText("Date");

        jLabel8.setText("Due Date");

        jButton1.setText("Submit");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(54, 54, 54)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel8)
                            .addComponent(jButton3))
                        .addGap(89, 89, 89)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblDueDate)
                            .addComponent(lblFine)
                            .addComponent(lblAmount)
                            .addComponent(lblName)
                            .addComponent(txtWattUsed)
                            .addComponent(txtCostperWatt, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)
                            .addComponent(jButton1)
                            .addComponent(txtDate))))
                .addContainerGap(207, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1)
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblName))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtCostperWatt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtWattUsed, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(lblAmount))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(lblFine))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(lblDueDate))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                        .addComponent(jButton1)
                        .addGap(29, 29, 29))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jButton3)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            int costperWatt = Integer.parseInt(txtCostperWatt.getText());
            int wattUsed = Integer.parseInt(txtWattUsed.getText());
            lblAmount.setText(String.valueOf(costperWatt * wattUsed));
            int amount = Integer.parseInt(lblAmount.getText());

            //int fine = InlblFine.getText());
            String date = txtDate.getText();
            SimpleDateFormat dateformat = new SimpleDateFormat("MM/dd/yyyy");
            Date date1 = null;            //System.out.println(monthSys +dateSys +yearSys);
            date1 = dateformat.parse(date);
//                   

            if (!dateformat.format(date1).equals(date)) {
                JOptionPane.showMessageDialog(null, "Invalid Date Format");
                return;
            }
            Date date2 = new Date();
            String sysDate = dateformat.format(date2);
            String sysmonth = sysDate.substring(0, 2);
            String sysday = sysDate.substring(3, 5);
            String sysyear = sysDate.substring(6, 10);

            String month = date.substring(0, 2);
            System.out.println(month);
            String day = date.substring(3, 5);
            System.out.println(day);
            String year = date.substring(6, 10);
            System.out.println(year);

            if (Integer.parseInt(year) > Integer.parseInt(sysyear)) {
                JOptionPane.showMessageDialog(this, "Wrong date ");
                return;
            }
            if (Integer.parseInt(month) == Integer.parseInt(sysmonth)) {
                if (Integer.parseInt(year) > Integer.parseInt(sysyear)) {
                    JOptionPane.showMessageDialog(this, "Wrong date");
                    return;
                }
            }
            if(Integer.parseInt(month)> Integer.parseInt(sysmonth) && Integer.parseInt(year)== Integer.parseInt(sysyear)){
                JOptionPane.showMessageDialog(this, "Wrong date");
                return;
            }
            if (Integer.parseInt(month) == Integer.parseInt(sysmonth)) {
                if (Integer.parseInt(year) == Integer.parseInt(sysyear)) {
                    if (Integer.parseInt(day) > Integer.parseInt(day)) {
                        JOptionPane.showMessageDialog(this, "Wrong date");
                        return;
                    }
                }
            }
        int fl=0;
        if (emp.geteBillDirectory().geteBillDirectory().size() == 0) {

                fl = 1;

            }

if (fl == 0) {
                int size = emp.geteBillDirectory().geteBillDirectory().size();
                EBill ebill2 = emp.geteBillDirectory().geteBillDirectory().get(size - 1);
                System.out.println(ebill2.getBillNumber());
                int nextMonth = Integer.parseInt(ebill2.getDate().substring(0, 2)) + 1;
                int nextYear = Integer.parseInt(ebill2.getDate().substring(6, 10)) + 1;
                int lastBillYear = Integer.parseInt(ebill2.getDate().substring(6, 10));
                int lastMonth = Integer.parseInt(ebill2.getDate().substring(0, 2));
                if (lastMonth == 12) {
                    if (Integer.parseInt(month) != 01 || Integer.parseInt(year) != nextYear) {
                        JOptionPane.showMessageDialog(null, "Generate bill  for 01 " + nextYear);

                        return;
                    }
                } else if (Integer.parseInt(month) != nextMonth || Integer.parseInt(year) != lastBillYear) {
                    JOptionPane.showMessageDialog(null, "Generate bill  for " + nextMonth + "" + lastBillYear);

                    return;
                }
                fl = 1;

            }
if(fl==1){
            EBill ebill = emp.geteBillDirectory().createEBill();
            ebill.setAmount(amount);
            ebill.setCostPerWatt(costperWatt);
            ebill.setDate(date);
            ebill.setWattUsed(wattUsed);
            day = "01";
            if (month.equals("12")) {
                month = "01";
                year = String.valueOf(Integer.parseInt(year) + 1);

            } else {
                month = String.valueOf(Integer.parseInt(month) + 1);
            }
            String dueDate = month + "-" + day + "-" + year;
            lblDueDate.setText(dueDate);
            ebill.setDueDate(dueDate);
            ebill.setStatus("unpaid");
            if (emp.geteBillDirectory().geteBillDirectory().size() == 1) {
                ebill.setFineAmount(0);
                lblFine.setText(String.valueOf(ebill.getFineAmount()));

            } else {
                int size = emp.geteBillDirectory().geteBillDirectory().size();
                EBill ebill1 = emp.geteBillDirectory().geteBillDirectory().get(size - 1);
                int count = 0;
                if (ebill1.getPaymentDate() == null) {
                    ebill.setFineAmount(1000);
                } else if (ebill1.getDueDate().substring(0, 2).equals(ebill1.getPaymentDate().substring(0, 2))) {
                    int dueDay = Integer.parseInt(ebill1.getDueDate().substring(3, 5));
                    int paymentDay = Integer.parseInt(ebill1.getPaymentDate().substring(3, 5));
                    ebill.setFineAmount((paymentDay - dueDay) * 5);

                } else {
                    ebill.setFineAmount(0);
                }
            }}

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Invalid Date");
           
            return;
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        container.remove(this);
        CardLayout layout = (CardLayout) container.getLayout();
        layout.previous(container);
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblAmount;
    private javax.swing.JLabel lblDueDate;
    private javax.swing.JLabel lblFine;
    private javax.swing.JLabel lblName;
    private javax.swing.JTextField txtCostperWatt;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtWattUsed;
    // End of variables declaration//GEN-END:variables
}
