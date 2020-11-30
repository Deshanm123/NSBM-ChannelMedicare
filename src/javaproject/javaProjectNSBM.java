/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;


public class javaProjectNSBM extends javax.swing.JFrame {

    
    public javaProjectNSBM() throws ClassNotFoundException, SQLException {
        initComponents();
        
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabelUserName = new javax.swing.JLabel();
        jLabelStudentID = new javax.swing.JLabel();
        jLabelDegree = new javax.swing.JLabel();
        jLabelBatch = new javax.swing.JLabel();
        jLabelCreateAppointmentTopic = new javax.swing.JLabel();
        jlName15 = new javax.swing.JLabel();
        jlName16 = new javax.swing.JLabel();
        jlName17 = new javax.swing.JLabel();
        jlFullName = new javax.swing.JLabel();
        jlUserName = new javax.swing.JLabel();
        jlDegree1 = new javax.swing.JLabel();
        jlStudentID = new javax.swing.JLabel();
        jLabelYear = new javax.swing.JLabel();
        jlName23 = new javax.swing.JLabel();
        jLabelFullName = new javax.swing.JLabel();
        jlYear = new javax.swing.JLabel();
        jlDegree = new javax.swing.JLabel();
        jlBatch = new javax.swing.JLabel();
        jLabelAppoinmentQuestion = new javax.swing.JLabel();
        jComboBoxDate = new javax.swing.JComboBox<>();
        jComboBoxMonth = new javax.swing.JComboBox<>();
        jComboBoxYear = new javax.swing.JComboBox<>();
        jLabelAppoinmentQuestion3 = new javax.swing.JLabel();
        jComboHours = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jComboMinutes = new javax.swing.JComboBox<>();
        jLabelAll = new javax.swing.JLabel();
        jButtonSubmit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));
        setMaximumSize(new java.awt.Dimension(0, 0));
        setSize(new java.awt.Dimension(0, 0));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaproject/download.png"))); // NOI18N

        jLabelUserName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelUserName.setText("UserName : ");

        jLabelStudentID.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelStudentID.setText("Student ID : ");

        jLabelDegree.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelDegree.setText("Degree : ");

        jLabelBatch.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelBatch.setText("Batch : ");

        jLabelCreateAppointmentTopic.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabelCreateAppointmentTopic.setText("Create Appoinment");

        jlName15.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jlName15.setMaximumSize(new java.awt.Dimension(2147483647, 2147483647));

        jlName16.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jlName17.setBackground(new java.awt.Color(204, 255, 204));
        jlName17.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jlFullName.setBackground(new java.awt.Color(204, 255, 204));
        jlFullName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jlUserName.setBackground(new java.awt.Color(204, 255, 204));
        jlUserName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jlDegree1.setBackground(new java.awt.Color(204, 255, 204));
        jlDegree1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jlStudentID.setBackground(new java.awt.Color(204, 255, 204));
        jlStudentID.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLabelYear.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelYear.setText("Year :");

        jlName23.setBackground(new java.awt.Color(204, 255, 204));
        jlName23.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLabelFullName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelFullName.setText("Full Name : ");

        jlYear.setBackground(new java.awt.Color(204, 255, 204));
        jlYear.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jlDegree.setBackground(new java.awt.Color(204, 255, 204));
        jlDegree.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jlBatch.setBackground(new java.awt.Color(204, 255, 204));
        jlBatch.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jLabelAppoinmentQuestion.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelAppoinmentQuestion.setText("Select Date : ");

        jComboBoxDate.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jComboBoxDate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jComboBoxDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDateActionPerformed(evt);
            }
        });

        jComboBoxMonth.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jComboBoxMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "June", "July", "August", "September", "October", "November", "December" }));
        jComboBoxMonth.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMonthActionPerformed(evt);
            }
        });

        jComboBoxYear.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jComboBoxYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035" }));

        jLabelAppoinmentQuestion3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelAppoinmentQuestion3.setText("Select time");

        jComboHours.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jComboHours.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "09", "10", "11", "12", "14", "15", "16", " " }));
        jComboHours.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboHoursActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText(":");

        jComboMinutes.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jComboMinutes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "30", " " }));

        jLabelAll.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        jButtonSubmit.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButtonSubmit.setText("Submit");
        jButtonSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(381, 381, 381)
                        .addComponent(jlName15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabelYear, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabelStudentID)
                                            .addComponent(jLabelBatch, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabelFullName))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addGroup(layout.createSequentialGroup()
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                            .addComponent(jlYear, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                            .addComponent(jlStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addGap(396, 396, 396)
                                                        .addComponent(jlName17, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(jlDegree1, javax.swing.GroupLayout.PREFERRED_SIZE, 376, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jlName23, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addComponent(jlBatch, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jlFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 379, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelDegree)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jlDegree, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(107, 107, 107))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabelUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(1255, 1255, 1255))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(jLabelAppoinmentQuestion3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(707, 707, 707)
                        .addComponent(jlName16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelCreateAppointmentTopic, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabelAppoinmentQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBoxDate, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboBoxMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBoxYear, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboHours, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jComboMinutes, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabelAll, javax.swing.GroupLayout.PREFERRED_SIZE, 824, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelUserName)
                            .addComponent(jlUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlFullName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabelFullName))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jlName17, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jlName23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(167, 167, 167))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlStudentID, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelStudentID, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jlDegree, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabelDegree)
                                    .addComponent(jlDegree1, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelYear, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlYear, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabelBatch, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlBatch, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jLabelCreateAppointmentTopic, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAppoinmentQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(39, 39, 39)
                        .addComponent(jlName16, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelAppoinmentQuestion3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jComboHours, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2)
                                .addComponent(jComboMinutes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabelAll, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(99, 99, 99)
                .addComponent(jlName15, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBoxDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxDateActionPerformed

    private void jComboBoxMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMonthActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBoxMonthActionPerformed

    private void jComboHoursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboHoursActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboHoursActionPerformed

    private void jButtonSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSubmitActionPerformed

        try {
            String myStringDate = String.valueOf(jComboBoxDate.getSelectedIndex()+1);
            String myStringMonth= String.valueOf(jComboBoxMonth.getSelectedItem());
            String myStringYear = String.valueOf(jComboBoxYear.getSelectedItem());
            String myStringHours= String.valueOf(jComboHours.getSelectedItem());
            String myStringMinutes = String.valueOf(jComboMinutes.getSelectedItem());
            
            //         System.out.println(myStringDate);
            //         System.out.println(myStringMonth);
            //         System.out.println(myStringYear);
            //         System.out.println(myStringMonth);
            //         System.out.println(myStringMonth);
            
            String all = "Your appoinment will be on " + myStringDate + " " + myStringMonth + " " + myStringYear + " " + "at "  + myStringHours + ":" + myStringMinutes;
            String wholeDate = myStringDate + " " + myStringMonth + " " + myStringYear;
            String wholeTime = myStringHours + ":" + myStringMinutes;
            jLabelAll.setText(all);
            String fullName = jlFullName.getText();
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3325/jproject","root","");
            PreparedStatement st = conn.prepareStatement("INSERT INTO appoinment(FullName,Date,Time) VALUES ('"+ fullName +"','"+ wholeDate +"','"+ wholeTime +"')");
            st.execute();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(javaProjectNSBM.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(javaProjectNSBM.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButtonSubmitActionPerformed

   public static void  passData(String answer) throws ClassNotFoundException, SQLException{
       //System.out.println(answer);
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3325/jproject","root","");
        Statement st = conn.createStatement();
        
        ResultSet rs1 = st.executeQuery("SELECT FullName,StudentID,Degree,Year,Batch FROM student WHERE UserName = '"+ answer +"'");
        while(rs1.next())
       {
          jlUserName.setText(answer);
          jlFullName.setText(rs1.getString("FullName"));
          jlStudentID.setText(rs1.getString("StudentID"));
          jlDegree1.setText(rs1.getString("Degree"));
          jlYear.setText(String.valueOf(rs1.getInt("Year")));
          jlBatch.setText(String.valueOf(rs1.getFloat("Batch")));
       }
           st.close();
           conn.close();
  }
    public static void main(String args[]){
//       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
//               javaProjectNSBM.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonSubmit;
    private javax.swing.JComboBox<String> jComboBoxDate;
    private javax.swing.JComboBox<String> jComboBoxMonth;
    private javax.swing.JComboBox<String> jComboBoxYear;
    private javax.swing.JComboBox<String> jComboHours;
    private javax.swing.JComboBox<String> jComboMinutes;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelAll;
    private javax.swing.JLabel jLabelAppoinmentQuestion;
    private javax.swing.JLabel jLabelAppoinmentQuestion3;
    private javax.swing.JLabel jLabelBatch;
    private javax.swing.JLabel jLabelCreateAppointmentTopic;
    private javax.swing.JLabel jLabelDegree;
    private javax.swing.JLabel jLabelFullName;
    private javax.swing.JLabel jLabelStudentID;
    private javax.swing.JLabel jLabelUserName;
    private javax.swing.JLabel jLabelYear;
    public static javax.swing.JLabel jlBatch;
    private javax.swing.JLabel jlDegree;
    public static javax.swing.JLabel jlDegree1;
    public static javax.swing.JLabel jlFullName;
    private javax.swing.JLabel jlName15;
    private javax.swing.JLabel jlName16;
    private javax.swing.JLabel jlName17;
    private javax.swing.JLabel jlName23;
    public static javax.swing.JLabel jlStudentID;
    public static javax.swing.JLabel jlUserName;
    public static javax.swing.JLabel jlYear;
    // End of variables declaration//GEN-END:variables
}
