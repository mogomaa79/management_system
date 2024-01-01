/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package management_system;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author moham
 */
public class GUI extends javax.swing.JFrame {
    
    DefaultTableModel model;
    DefaultTableModel model2;
    
    /**
     * Creates new form GUI
     */
    public GUI() {
        initComponents();
        model = (DefaultTableModel) jTable1.getModel();
        model2 = (DefaultTableModel) jTable2.getModel();
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
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setText("Management System");

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("More Info");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Faculty", "Department", "CGPA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setHeaderValue("Faculty");
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setHeaderValue("CGPA");
        }

        jTabbedPane1.addTab("Students", jScrollPane1);

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Department"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable2);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
            jTable2.getColumnModel().getColumn(1).setResizable(false);
            jTable2.getColumnModel().getColumn(2).setResizable(false);
        }

        jTabbedPane1.addTab("Professors", jScrollPane2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jTabbedPane1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4)
                        .addGap(0, 303, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(276, 276, 276)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.getAccessibleContext().setAccessibleName("Students");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        if(jTabbedPane1.getSelectedIndex() == 0){
            String id = JOptionPane.showInputDialog("Enter ID: ");
            String name = JOptionPane.showInputDialog("Enter Name: ");
            String faculty = JOptionPane.showInputDialog("Enter Faculty: ");
            String department = JOptionPane.showInputDialog("Enter Department: ");
            String cgpa = JOptionPane.showInputDialog("Enter CGPA: ");
            
            Student s = new Student(name, id, cgpa, faculty, cgpa);
            model.addRow(new Object[]{id,name,faculty,department,cgpa});
        }
        else{
            String id = JOptionPane.showInputDialog("Enter ID: ");
            String name = JOptionPane.showInputDialog("Enter Name: ");
            String department = JOptionPane.showInputDialog("Enter Department: ");
            
            Professor p = new Professor(name, id, department);
            model2.addRow(new Object[]{id,name,department});
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        if(jTabbedPane1.getSelectedIndex() == 0){
            String id = JOptionPane.showInputDialog("Enter ID: ");
            boolean flag = false;
            int i = 0;
            for(i = 0; i < model.getRowCount(); i++){
                flag = model.getValueAt(i, 0).equals(id);
                if(flag) break;
            }
            if(!flag){
                JOptionPane.showMessageDialog(this, "No such id found");
                return;
            }
            id = JOptionPane.showInputDialog("Enter New ID: ");
            String name = JOptionPane.showInputDialog("Enter New Name: ");
            String faculty = JOptionPane.showInputDialog("Enter New Faculty: ");
            String department = JOptionPane.showInputDialog("Enter New Department: ");
            String cgpa = JOptionPane.showInputDialog("Enter New CGPA: ");
            
            Student.UniversityStudents.get(i).setId(id);
            Student.UniversityStudents.get(i).setName(name);
            Student.UniversityStudents.get(i).setFaculty(faculty);
            Student.UniversityStudents.get(i).setDept(department);
            Student.UniversityStudents.get(i).setCGPA(cgpa);
            
            model.removeRow(i);
            model.insertRow(i, new Object[]{id,name,faculty,department,cgpa});
        }
        else{
            String id = JOptionPane.showInputDialog("Enter ID: ");
            boolean flag = false;
            int i = 0;
            for(i = 0; i < model2.getRowCount(); i++){
                flag = model2.getValueAt(i, 0).equals(id);
                if(flag) break;
            }
            if(!flag){
                JOptionPane.showMessageDialog(this, "No such id found");
                return;
            }
            id = JOptionPane.showInputDialog("Enter New ID: ");
            String name = JOptionPane.showInputDialog("Enter New Name: ");
            String department = JOptionPane.showInputDialog("Enter New Department: ");
            
            Professor.UniversityProfessors.get(i).setId(id);
            Professor.UniversityProfessors.get(i).setName(name);
            Professor.UniversityProfessors.get(i).setDept(department);
            
            model2.removeRow(i);
            model2.insertRow(i, new Object[]{id,name,department});
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        if(jTabbedPane1.getSelectedIndex() == 0){
            String id = JOptionPane.showInputDialog("Enter ID: ");
            boolean flag = false;
            int i = 0;
            for(i = 0; i < model.getRowCount(); i++){
                flag = model.getValueAt(i, 0).equals(id);
                if(flag) break;
            }
            if(!flag){
                JOptionPane.showMessageDialog(this, "No such id found");
                return;
            }
            model.removeRow(i);
            Student.UniversityStudents.remove(i);
        }
        else{
            String id = JOptionPane.showInputDialog("Enter ID: ");
            boolean flag = false;
            int i = 0;
            for(i = 0; i < model2.getRowCount(); i++){
                flag = model2.getValueAt(i, 0).equals(id);
                if(flag) break;
            }
            if(!flag){
                JOptionPane.showMessageDialog(this, "No such id found");
                return;
            }
            model2.removeRow(i);
            Professor.UniversityProfessors.remove(i);
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    // End of variables declaration//GEN-END:variables
}
