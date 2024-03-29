/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package intGrafica;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author cristian
 */
public class editare_contact extends javax.swing.JFrame {

    /**
     * Creates new form editare_contact
     */
    public editare_contact() {
        initComponents();
        try {
            show_user();
        } catch (ParseException ex) {
            Logger.getLogger(editare_contact.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public ArrayList<User> userList() {
        ArrayList<User> usersList = new ArrayList<>();
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_app?user=test&password=test&useLegacyDatetimeCOde=false&serverTimezone=UTC");
            String query1 = "SELECT * FROM agendajava";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(query1);
            User user;
            while (rs.next()) {
                user = new User(rs.getInt("ID"), rs.getString("Nume"), rs.getString("Prenume"), rs.getString("Data_nasterii"), rs.getString("Numar_de_telefon"), rs.getString("Tip_telefon"));
                usersList.add(user);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        return usersList;
    }

    public void show_user() throws ParseException {
        ArrayList<User> list = userList();
        DefaultTableModel model = (DefaultTableModel) jTable_display_editare.getModel();
        Object[] linie = new Object[6];
        for (int i = 0; i < list.size(); i++) {
            linie[0] = list.get(i).getID();
            linie[1] = list.get(i).getNume();
            linie[2] = list.get(i).getPrenume();
            linie[3] = list.get(i).getData_nasterii();
            linie[4] = list.get(i).getNumar_de_telefon();
            linie[5] = list.get(i).getTip_telefon();
            model.addRow(linie);
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

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        editare_nume = new javax.swing.JTextField();
        editare_prenume = new javax.swing.JTextField();
        editare_data_nasterii = new javax.swing.JTextField();
        editare_numar_de_telefon = new javax.swing.JTextField();
        tip_telefon_combo_editare = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        editeaza_contact = new javax.swing.JButton();
        cancel_button_editare = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_display_editare = new javax.swing.JTable();

        jLabel3.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 102, 102));
        jLabel3.setText("Nume : ");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Nume : ");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 102, 102));
        jLabel2.setText("Prenume : ");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("Data_nasterii : ");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 102));
        jLabel5.setText("Numar_de_telefon : ");

        tip_telefon_combo_editare.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Mobil", "Fix" }));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("Tip_telefon : ");

        editeaza_contact.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        editeaza_contact.setForeground(new java.awt.Color(0, 102, 102));
        editeaza_contact.setText("Editeaza contact");
        editeaza_contact.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editeaza_contactActionPerformed(evt);
            }
        });

        cancel_button_editare.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        cancel_button_editare.setForeground(new java.awt.Color(0, 102, 102));
        cancel_button_editare.setText("Cancel");
        cancel_button_editare.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_button_editareActionPerformed(evt);
            }
        });

        jTable_display_editare.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nume", "Prenume", "Data_nasterii", "Numar_de_telefon", "Tip_telefon"
            }
        ));
        jScrollPane1.setViewportView(jTable_display_editare);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(editeaza_contact))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editare_numar_de_telefon, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editare_data_nasterii, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editare_prenume, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editare_nume, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(tip_telefon_combo_editare, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cancel_button_editare, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 603, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(editare_nume, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(editare_prenume, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(editare_data_nasterii, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(editare_numar_de_telefon, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tip_telefon_combo_editare, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editeaza_contact)
                    .addComponent(cancel_button_editare))
                .addGap(32, 32, 32))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void cancel_button_editareActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_button_editareActionPerformed
        Agenda a = new Agenda();
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_cancel_button_editareActionPerformed

    private void editeaza_contactActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editeaza_contactActionPerformed
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/java_app?user=test&password=test");
            int linie = jTable_display_editare.getSelectedRow();
            String valori = (jTable_display_editare.getModel().getValueAt(linie, 0).toString());
            String query = "UPDATE agendajava SET Nume=?, Prenume=?, Data_nasterii=?, Numar_de_telefon=?, Tip_telefon=? WHERE ID=" + valori;
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, editare_nume.getText());
            pst.setString(2, editare_prenume.getText());
            pst.setString(3, editare_data_nasterii.getText());
            pst.setString(4, editare_numar_de_telefon.getText());
            String tip_telefon;
            tip_telefon = tip_telefon_combo_editare.getSelectedItem().toString();
            pst.setString(5, tip_telefon);
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, " Succes! ", "Editare Contact", JOptionPane.PLAIN_MESSAGE);
            dispose();
            Agenda a = new Agenda();
            a.setVisible(true);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Asigurati-va ca fieldurile nu sunt goale, contactul este selectat, Data nasterii tebuie introdusa in formatul (yyyy-MM-dd)", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_editeaza_contactActionPerformed

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
            java.util.logging.Logger.getLogger(editare_contact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(editare_contact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(editare_contact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(editare_contact.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new editare_contact().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancel_button_editare;
    private javax.swing.JTextField editare_data_nasterii;
    private javax.swing.JTextField editare_numar_de_telefon;
    private javax.swing.JTextField editare_nume;
    private javax.swing.JTextField editare_prenume;
    private javax.swing.JButton editeaza_contact;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_display_editare;
    private javax.swing.JComboBox<String> tip_telefon_combo_editare;
    // End of variables declaration//GEN-END:variables
}
