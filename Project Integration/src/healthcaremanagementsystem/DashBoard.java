
package healthcaremanagementsystem;

import DatabaseOperations.RegisterOperation;
import DatabaseOperations.DBConnection;
import DatabaseOperations.HealthCareDoctorOperation;
import DatabaseOperations.HealthCareOperation;
import Registration.LecturerRegistration;
import Registration.StudentRegistration;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class DashBoard extends javax.swing.JFrame {

    public DashBoard() throws SQLException {
        initComponents();
        this.setResizable(false);
         this.setBounds(0,0,1280,900);
         menuPnl.setBounds(0,0,200,900);
         bodyPnl.setBounds(200,0,1080,900);
         healthCareStaffSubMenuPnl.setVisible(false);
       academicSubMenuPnl.setVisible(false);
       HealthCareDoctorOperation.showTableData(this.appointmentDoctorTable);
       
    }
public  void openPnl(JPanel selectedPnl){
        interfacePnl.setVisible(false);
        //lecturer
        if(selectedPnl == lecturerPnl){lecturerPnl.setVisible(true);}
        else{ lecturerPnl.setVisible(false);}
       //student
       if(selectedPnl== studentPnl){studentPnl.setVisible(true);}
       else{studentPnl.setVisible(false);}
      //doctor
      if(selectedPnl == doctorPnl){ doctorPnl.setVisible(true);}
      else { doctorPnl.setVisible(false);}
      //nurse
      if(selectedPnl == nursePnl){ nursePnl.setVisible(true); }
      else{nursePnl.setVisible(false);}
      //about
      if(selectedPnl==aboutPnl){ aboutPnl.setVisible(true);}
      else{aboutPnl.setVisible(false);}
      //dashboard
      if(selectedPnl == studentDashboardPnl){studentDashboardPnl.setVisible(true);}
      else{studentDashboardPnl.setVisible(false);}
       if(selectedPnl ==lecturerDashboardPnl){lecturerDashboardPnl.setVisible(true); }
       else{lecturerDashboardPnl.setVisible(false);}
       if(selectedPnl ==doctorDashboardPnl){doctorDashboardPnl.setVisible(true); }
       else{doctorDashboardPnl.setVisible(false);}
       if(selectedPnl ==nurseDashboardPnl){nurseDashboardPnl.setVisible(true); }
       else{nurseDashboardPnl.setVisible(false);}
}
           
    
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menuPnl = new javax.swing.JPanel();
        logo2 = new javax.swing.JLabel();
        btnPnl = new javax.swing.JPanel();
        aboutBtn = new javax.swing.JButton();
        healthCareStaffBtn = new javax.swing.JButton();
        academicStaffBtn = new javax.swing.JButton();
        academicSubMenuPnl = new javax.swing.JPanel();
        lecturerBtn = new javax.swing.JButton();
        studentBtn = new javax.swing.JButton();
        healthCareStaffSubMenuPnl = new javax.swing.JPanel();
        doctorBtn = new javax.swing.JButton();
        nurseBtn = new javax.swing.JButton();
        bodyPnl = new javax.swing.JPanel();
        interfacePnl = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        studentPnl = new javax.swing.JPanel();
        label5 = new java.awt.Label();
        label6 = new java.awt.Label();
        stUserNameTxt = new javax.swing.JTextField();
        studentLoginBtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        stPassField = new javax.swing.JPasswordField();
        StudentRegisterBtn = new javax.swing.JButton();
        lecturerPnl = new javax.swing.JPanel();
        label7 = new java.awt.Label();
        label8 = new java.awt.Label();
        lecUserTxt = new javax.swing.JTextField();
        lecturerLoginBtn = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        lecPassField = new javax.swing.JPasswordField();
        lecturerRegisterBtn = new javax.swing.JButton();
        doctorPnl = new javax.swing.JPanel();
        doctorLoginBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        doctorUserNameTxt = new javax.swing.JTextField();
        doctorPassField = new javax.swing.JPasswordField();
        nursePnl = new javax.swing.JPanel();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        nurseUserNameTxt = new javax.swing.JTextField();
        nurseLoginBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        nursePassField = new javax.swing.JPasswordField();
        aboutPnl = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        studentDashboardPnl = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        latestStAppointmentDetailsPnl = new javax.swing.JPanel();
        jLabelStUserName = new javax.swing.JLabel();
        studentUserNameLbl = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        recentStAppTimeLbl = new javax.swing.JLabel();
        recentStAppDateLbl = new javax.swing.JLabel();
        jstLabel10 = new javax.swing.JLabel();
        recentStAppStatusLbl = new javax.swing.JLabel();
        ShowLastStudentAppointmentBtn = new javax.swing.JButton();
        CreateAppointmentPanel1 = new javax.swing.JPanel();
        jLabelCreateAppointmentTopic1 = new javax.swing.JLabel();
        jLabelAppoinmentQuestion2 = new javax.swing.JLabel();
        jLabelAppoinmentQuestion5 = new javax.swing.JLabel();
        jComboHours2 = new javax.swing.JComboBox<>();
        jComboBoxYear2 = new javax.swing.JComboBox<>();
        jComboBoxMonth2 = new javax.swing.JComboBox<>();
        jComboMinutes2 = new javax.swing.JComboBox<>();
        jComboBoxDate2 = new javax.swing.JComboBox<>();
        makeStudentAppointment1 = new javax.swing.JButton();
        submittedLbl1 = new javax.swing.JLabel();
        lecturerDashboardPnl = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        createAppointmentPnl = new javax.swing.JPanel();
        lecAppointmentSubmitBtn = new javax.swing.JButton();
        jComboMinutes = new javax.swing.JComboBox<>();
        jComboHours = new javax.swing.JComboBox<>();
        jLabelAppoinmentQuestion3 = new javax.swing.JLabel();
        jComboBoxYear = new javax.swing.JComboBox<>();
        jComboBoxDate = new javax.swing.JComboBox<>();
        jComboBoxMonth = new javax.swing.JComboBox<>();
        jLabelAppoinmentQuestion = new javax.swing.JLabel();
        jLabelCreateAppoinmentTopic = new javax.swing.JLabel();
        jLabelAll = new javax.swing.JLabel();
        latestAppointmentDetailsPnl = new javax.swing.JPanel();
        jLabelUserName = new javax.swing.JLabel();
        lecturerUserNameLbl = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        recentLecAppTimeLbl = new javax.swing.JLabel();
        recentLecAppDateLbl = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        recentLecAppStatusLbl = new javax.swing.JLabel();
        ShowLastLecturerAppointmentBtn = new javax.swing.JButton();
        doctorDashboardPnl = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        appointmentDoctorTable = new javax.swing.JTable();
        doctorUpdateBtn = new javax.swing.JButton();
        nurseDashboardPnl = new javax.swing.JPanel();
        jTextField6 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 255, 153));

        menuPnl.setBackground(new java.awt.Color(255, 255, 255));
        menuPnl.setForeground(new java.awt.Color(60, 63, 65));
        menuPnl.setPreferredSize(new java.awt.Dimension(335, 860));

        logo2.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Desktop\\project\\100phonendoscope_1262-6423.jpg")); // NOI18N
        logo2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        btnPnl.setBackground(new java.awt.Color(255, 255, 255));
        btnPnl.setAutoscrolls(true);

        aboutBtn.setText("About");
        aboutBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        aboutBtn.setMaximumSize(new java.awt.Dimension(117, 32));
        aboutBtn.setMinimumSize(new java.awt.Dimension(117, 32));
        aboutBtn.setPreferredSize(new java.awt.Dimension(117, 32));
        aboutBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aboutBtnMouseClicked(evt);
            }
        });

        healthCareStaffBtn.setText("Health Care Staff");
        healthCareStaffBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        healthCareStaffBtn.setMaximumSize(new java.awt.Dimension(117, 32));
        healthCareStaffBtn.setMinimumSize(new java.awt.Dimension(117, 32));
        healthCareStaffBtn.setPreferredSize(new java.awt.Dimension(117, 32));
        healthCareStaffBtn.setRolloverEnabled(true);
        healthCareStaffBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                healthCareStaffBtnMouseClicked(evt);
            }
        });
        healthCareStaffBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                healthCareStaffBtnActionPerformed(evt);
            }
        });

        academicStaffBtn.setText("Academic Staff");
        academicStaffBtn.setMargin(new java.awt.Insets(0, 0, 0, 0));
        academicStaffBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                academicStaffBtnMouseClicked(evt);
            }
        });

        academicSubMenuPnl.setBackground(new java.awt.Color(255, 255, 255));

        lecturerBtn.setText("Lecturer Login");
        lecturerBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lecturerBtnMouseClicked(evt);
            }
        });

        studentBtn.setText("Student Login");
        studentBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout academicSubMenuPnlLayout = new javax.swing.GroupLayout(academicSubMenuPnl);
        academicSubMenuPnl.setLayout(academicSubMenuPnlLayout);
        academicSubMenuPnlLayout.setHorizontalGroup(
            academicSubMenuPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(academicSubMenuPnlLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(academicSubMenuPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lecturerBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(studentBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        academicSubMenuPnlLayout.setVerticalGroup(
            academicSubMenuPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(academicSubMenuPnlLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lecturerBtn)
                .addGap(18, 18, 18)
                .addComponent(studentBtn)
                .addGap(18, 18, 18))
        );

        healthCareStaffSubMenuPnl.setBackground(new java.awt.Color(255, 255, 255));

        doctorBtn.setText("Doctor Login");
        doctorBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                doctorBtnMouseClicked(evt);
            }
        });

        nurseBtn.setText("Nurse Login");
        nurseBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nurseBtnMouseClicked(evt);
            }
        });
        nurseBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nurseBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout healthCareStaffSubMenuPnlLayout = new javax.swing.GroupLayout(healthCareStaffSubMenuPnl);
        healthCareStaffSubMenuPnl.setLayout(healthCareStaffSubMenuPnlLayout);
        healthCareStaffSubMenuPnlLayout.setHorizontalGroup(
            healthCareStaffSubMenuPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(healthCareStaffSubMenuPnlLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(healthCareStaffSubMenuPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nurseBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(doctorBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        healthCareStaffSubMenuPnlLayout.setVerticalGroup(
            healthCareStaffSubMenuPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(healthCareStaffSubMenuPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(doctorBtn)
                .addGap(18, 18, 18)
                .addComponent(nurseBtn)
                .addGap(0, 13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout btnPnlLayout = new javax.swing.GroupLayout(btnPnl);
        btnPnl.setLayout(btnPnlLayout);
        btnPnlLayout.setHorizontalGroup(
            btnPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnPnlLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(btnPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(academicStaffBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(healthCareStaffBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(healthCareStaffSubMenuPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(btnPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(aboutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(academicSubMenuPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 26, Short.MAX_VALUE))
        );
        btnPnlLayout.setVerticalGroup(
            btnPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btnPnlLayout.createSequentialGroup()
                .addComponent(healthCareStaffBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(healthCareStaffSubMenuPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(academicStaffBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(academicSubMenuPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addComponent(aboutBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(133, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout menuPnlLayout = new javax.swing.GroupLayout(menuPnl);
        menuPnl.setLayout(menuPnlLayout);
        menuPnlLayout.setHorizontalGroup(
            menuPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menuPnlLayout.createSequentialGroup()
                .addContainerGap(17, Short.MAX_VALUE)
                .addGroup(menuPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(logo2, javax.swing.GroupLayout.PREFERRED_SIZE, 211, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );
        menuPnlLayout.setVerticalGroup(
            menuPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuPnlLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(logo2)
                .addGap(34, 34, 34)
                .addComponent(btnPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(61, Short.MAX_VALUE))
        );

        bodyPnl.setLayout(new java.awt.CardLayout());

        interfacePnl.setBackground(new java.awt.Color(0, 153, 161));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Desktop\\project\\Healthcare_workforce_managment.jpg")); // NOI18N

        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Desktop\\project\\Healthcare_workforce_managment.jpg")); // NOI18N
        jLabel2.setName(""); // NOI18N

        javax.swing.GroupLayout interfacePnlLayout = new javax.swing.GroupLayout(interfacePnl);
        interfacePnl.setLayout(interfacePnlLayout);
        interfacePnlLayout.setHorizontalGroup(
            interfacePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(interfacePnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 679, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 623, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(92, Short.MAX_VALUE))
        );
        interfacePnlLayout.setVerticalGroup(
            interfacePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(interfacePnlLayout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addGroup(interfacePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 493, Short.MAX_VALUE))
        );

        bodyPnl.add(interfacePnl, "card2");

        studentPnl.setBackground(new java.awt.Color(68, 88, 103));

        label5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        label5.setForeground(new java.awt.Color(255, 255, 255));
        label5.setText("User Name :");

        label6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        label6.setForeground(new java.awt.Color(255, 255, 255));
        label6.setText("Password :");

        studentLoginBtn.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        studentLoginBtn.setText("Log in");
        studentLoginBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentLoginBtnMouseClicked(evt);
            }
        });
        studentLoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                studentLoginBtnActionPerformed(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Desktop\\project\\student.png")); // NOI18N

        StudentRegisterBtn.setText("Register");
        StudentRegisterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StudentRegisterBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout studentPnlLayout = new javax.swing.GroupLayout(studentPnl);
        studentPnl.setLayout(studentPnlLayout);
        studentPnlLayout.setHorizontalGroup(
            studentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentPnlLayout.createSequentialGroup()
                .addGroup(studentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(studentPnlLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(StudentRegisterBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(249, 249, 249)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(studentPnlLayout.createSequentialGroup()
                        .addGap(266, 266, 266)
                        .addGroup(studentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(studentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(stPassField, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(stUserNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(studentPnlLayout.createSequentialGroup()
                        .addGap(472, 472, 472)
                        .addComponent(studentLoginBtn)))
                .addContainerGap(710, Short.MAX_VALUE))
        );
        studentPnlLayout.setVerticalGroup(
            studentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentPnlLayout.createSequentialGroup()
                .addGroup(studentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(studentPnlLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(studentPnlLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(StudentRegisterBtn)))
                .addGap(24, 24, 24)
                .addGroup(studentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(stUserNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(studentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(stPassField, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addComponent(studentLoginBtn)
                .addContainerGap(259, Short.MAX_VALUE))
        );

        bodyPnl.add(studentPnl, "card5");

        lecturerPnl.setBackground(new java.awt.Color(54, 113, 153));

        label7.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        label7.setForeground(new java.awt.Color(255, 255, 255));
        label7.setText("User Name :");

        label8.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        label8.setForeground(new java.awt.Color(255, 255, 255));
        label8.setText("Password :");

        lecturerLoginBtn.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        lecturerLoginBtn.setText("Log in");
        lecturerLoginBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lecturerLoginBtnMouseClicked(evt);
            }
        });
        lecturerLoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lecturerLoginBtnActionPerformed(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Desktop\\project\\lecturer.png")); // NOI18N

        lecturerRegisterBtn.setText("Register");
        lecturerRegisterBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lecturerRegisterBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout lecturerPnlLayout = new javax.swing.GroupLayout(lecturerPnl);
        lecturerPnl.setLayout(lecturerPnlLayout);
        lecturerPnlLayout.setHorizontalGroup(
            lecturerPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lecturerPnlLayout.createSequentialGroup()
                .addGroup(lecturerPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lecturerPnlLayout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addGroup(lecturerPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68)
                        .addGroup(lecturerPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lecPassField, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lecUserTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(lecturerPnlLayout.createSequentialGroup()
                        .addGap(450, 450, 450)
                        .addComponent(lecturerLoginBtn))
                    .addGroup(lecturerPnlLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lecturerRegisterBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(699, Short.MAX_VALUE))
        );
        lecturerPnlLayout.setVerticalGroup(
            lecturerPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lecturerPnlLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lecturerRegisterBtn)
                .addGap(32, 32, 32)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(lecturerPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lecUserTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(lecturerPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lecPassField, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addComponent(lecturerLoginBtn)
                .addGap(213, 213, 213))
        );

        bodyPnl.add(lecturerPnl, "card5");

        doctorPnl.setBackground(new java.awt.Color(47, 133, 192));

        doctorLoginBtn.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        doctorLoginBtn.setText("Log in");
        doctorLoginBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                doctorLoginBtnMouseClicked(evt);
            }
        });
        doctorLoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorLoginBtnActionPerformed(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Desktop\\project\\depositphotos_212112752-stock-video-doctor-medical-cartoons-hd-animation.jpg")); // NOI18N

        label1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        label1.setText("User Name :");

        label2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        label2.setText("Password :");

        javax.swing.GroupLayout doctorPnlLayout = new javax.swing.GroupLayout(doctorPnl);
        doctorPnl.setLayout(doctorPnlLayout);
        doctorPnlLayout.setHorizontalGroup(
            doctorPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(doctorPnlLayout.createSequentialGroup()
                .addGroup(doctorPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(doctorPnlLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3))
                    .addGroup(doctorPnlLayout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addGroup(doctorPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(doctorPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(doctorUserNameTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                            .addComponent(doctorPassField)))
                    .addGroup(doctorPnlLayout.createSequentialGroup()
                        .addGap(473, 473, 473)
                        .addComponent(doctorLoginBtn)))
                .addContainerGap(501, Short.MAX_VALUE))
        );
        doctorPnlLayout.setVerticalGroup(
            doctorPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(doctorPnlLayout.createSequentialGroup()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19)
                .addGroup(doctorPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(doctorUserNameTxt)
                    .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(42, 42, 42)
                .addGroup(doctorPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(doctorPassField))
                .addGap(35, 35, 35)
                .addComponent(doctorLoginBtn)
                .addContainerGap(250, Short.MAX_VALUE))
        );

        bodyPnl.add(doctorPnl, "card5");

        nursePnl.setBackground(new java.awt.Color(0, 51, 51));

        label3.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        label3.setForeground(new java.awt.Color(255, 255, 255));
        label3.setText("User Name :");

        label4.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        label4.setForeground(new java.awt.Color(255, 255, 255));
        label4.setText("Password :");

        nurseLoginBtn.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        nurseLoginBtn.setText("Log in");
        nurseLoginBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nurseLoginBtnMouseClicked(evt);
            }
        });
        nurseLoginBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nurseLoginBtnActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Desktop\\project\\300nurse.png")); // NOI18N

        javax.swing.GroupLayout nursePnlLayout = new javax.swing.GroupLayout(nursePnl);
        nursePnl.setLayout(nursePnlLayout);
        nursePnlLayout.setHorizontalGroup(
            nursePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nursePnlLayout.createSequentialGroup()
                .addGroup(nursePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(nursePnlLayout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addGroup(nursePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68)
                        .addGroup(nursePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(nurseUserNameTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 179, Short.MAX_VALUE)
                            .addComponent(nursePassField)))
                    .addGroup(nursePnlLayout.createSequentialGroup()
                        .addGap(412, 412, 412)
                        .addComponent(nurseLoginBtn))
                    .addGroup(nursePnlLayout.createSequentialGroup()
                        .addGap(330, 330, 330)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 337, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(411, Short.MAX_VALUE))
        );
        nursePnlLayout.setVerticalGroup(
            nursePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nursePnlLayout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addGroup(nursePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nurseUserNameTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(nursePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nursePassField))
                .addGap(41, 41, 41)
                .addComponent(nurseLoginBtn)
                .addContainerGap(235, Short.MAX_VALUE))
        );

        bodyPnl.add(nursePnl, "card5");

        aboutPnl.setBackground(new java.awt.Color(0, 102, 102));

        jLabel9.setText("about");

        javax.swing.GroupLayout aboutPnlLayout = new javax.swing.GroupLayout(aboutPnl);
        aboutPnl.setLayout(aboutPnlLayout);
        aboutPnlLayout.setHorizontalGroup(
            aboutPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aboutPnlLayout.createSequentialGroup()
                .addGap(336, 336, 336)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(643, Short.MAX_VALUE))
        );
        aboutPnlLayout.setVerticalGroup(
            aboutPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aboutPnlLayout.createSequentialGroup()
                .addGap(174, 174, 174)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(594, Short.MAX_VALUE))
        );

        bodyPnl.add(aboutPnl, "card7");

        studentDashboardPnl.setBackground(new java.awt.Color(68, 88, 103));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Desktop\\project\\student.png")); // NOI18N

        latestStAppointmentDetailsPnl.setBackground(new java.awt.Color(0, 153, 153));
        latestStAppointmentDetailsPnl.setForeground(new java.awt.Color(0, 255, 0));

        jLabelStUserName.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelStUserName.setText("  Hi There ");

        studentUserNameLbl.setBackground(new java.awt.Color(0, 204, 204));
        studentUserNameLbl.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        studentUserNameLbl.setText("usename");

        jLabel14.setText("Recent Appointment Date  : ");

        jLabel15.setText("Recent Appointment Time :");

        recentStAppTimeLbl.setText("time");

        recentStAppDateLbl.setText("date");

        jstLabel10.setText("Recent Appointment status:");

        recentStAppStatusLbl.setText("status");

        ShowLastStudentAppointmentBtn.setText("Show Last  Appointment");
        ShowLastStudentAppointmentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowLastStudentAppointmentBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout latestStAppointmentDetailsPnlLayout = new javax.swing.GroupLayout(latestStAppointmentDetailsPnl);
        latestStAppointmentDetailsPnl.setLayout(latestStAppointmentDetailsPnlLayout);
        latestStAppointmentDetailsPnlLayout.setHorizontalGroup(
            latestStAppointmentDetailsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, latestStAppointmentDetailsPnlLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ShowLastStudentAppointmentBtn)
                .addGap(142, 142, 142))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, latestStAppointmentDetailsPnlLayout.createSequentialGroup()
                .addContainerGap(30, Short.MAX_VALUE)
                .addGroup(latestStAppointmentDetailsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(latestStAppointmentDetailsPnlLayout.createSequentialGroup()
                        .addComponent(jstLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(recentStAppStatusLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(latestStAppointmentDetailsPnlLayout.createSequentialGroup()
                        .addGroup(latestStAppointmentDetailsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(38, 38, 38)
                        .addGroup(latestStAppointmentDetailsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(recentStAppDateLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(recentStAppTimeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(latestStAppointmentDetailsPnlLayout.createSequentialGroup()
                        .addComponent(jLabelStUserName)
                        .addGap(18, 18, 18)
                        .addComponent(studentUserNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42))
        );
        latestStAppointmentDetailsPnlLayout.setVerticalGroup(
            latestStAppointmentDetailsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(latestStAppointmentDetailsPnlLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(latestStAppointmentDetailsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelStUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(studentUserNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addGroup(latestStAppointmentDetailsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(recentStAppDateLbl))
                .addGap(18, 18, 18)
                .addGroup(latestStAppointmentDetailsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(recentStAppTimeLbl))
                .addGap(18, 18, 18)
                .addGroup(latestStAppointmentDetailsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jstLabel10)
                    .addComponent(recentStAppStatusLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(ShowLastStudentAppointmentBtn)
                .addGap(16, 16, 16))
        );

        jLabelCreateAppointmentTopic1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabelCreateAppointmentTopic1.setText("Create Appoinment");

        jLabelAppoinmentQuestion2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelAppoinmentQuestion2.setText("Select Date : ");

        jLabelAppoinmentQuestion5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelAppoinmentQuestion5.setText("Select time :");

        jComboHours2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jComboHours2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "09", "10", "11", "12", "14", "15", "16", " " }));
        jComboHours2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboHours2ActionPerformed(evt);
            }
        });

        jComboBoxYear2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jComboBoxYear2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035" }));

        jComboBoxMonth2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jComboBoxMonth2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "June", "July", "August", "September", "October", "November", "December" }));
        jComboBoxMonth2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxMonth2ActionPerformed(evt);
            }
        });

        jComboMinutes2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jComboMinutes2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "30", " " }));

        jComboBoxDate2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jComboBoxDate2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        jComboBoxDate2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxDate2ActionPerformed(evt);
            }
        });

        makeStudentAppointment1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        makeStudentAppointment1.setText("Submit");
        makeStudentAppointment1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                makeStudentAppointment1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout CreateAppointmentPanel1Layout = new javax.swing.GroupLayout(CreateAppointmentPanel1);
        CreateAppointmentPanel1.setLayout(CreateAppointmentPanel1Layout);
        CreateAppointmentPanel1Layout.setHorizontalGroup(
            CreateAppointmentPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(CreateAppointmentPanel1Layout.createSequentialGroup()
                .addGroup(CreateAppointmentPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(CreateAppointmentPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(makeStudentAppointment1, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(72, 72, 72)
                        .addComponent(submittedLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 437, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CreateAppointmentPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabelAppoinmentQuestion2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxDate2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxMonth2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jComboBoxYear2, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(jLabelAppoinmentQuestion5, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboHours2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboMinutes2, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(CreateAppointmentPanel1Layout.createSequentialGroup()
                        .addGap(303, 303, 303)
                        .addComponent(jLabelCreateAppointmentTopic1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(46, 46, Short.MAX_VALUE))
        );
        CreateAppointmentPanel1Layout.setVerticalGroup(
            CreateAppointmentPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, CreateAppointmentPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabelCreateAppointmentTopic1)
                .addGap(32, 32, 32)
                .addGroup(CreateAppointmentPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAppoinmentQuestion2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxMonth2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxYear2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxDate2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAppoinmentQuestion5, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboHours2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboMinutes2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addGroup(CreateAppointmentPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(makeStudentAppointment1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(submittedLbl1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(56, 56, 56))
        );

        javax.swing.GroupLayout studentDashboardPnlLayout = new javax.swing.GroupLayout(studentDashboardPnl);
        studentDashboardPnl.setLayout(studentDashboardPnlLayout);
        studentDashboardPnlLayout.setHorizontalGroup(
            studentDashboardPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentDashboardPnlLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(studentDashboardPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CreateAppointmentPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(studentDashboardPnlLayout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(109, 109, 109)
                        .addComponent(latestStAppointmentDetailsPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(400, Short.MAX_VALUE))
        );
        studentDashboardPnlLayout.setVerticalGroup(
            studentDashboardPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentDashboardPnlLayout.createSequentialGroup()
                .addGroup(studentDashboardPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(studentDashboardPnlLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(studentDashboardPnlLayout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(latestStAppointmentDetailsPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CreateAppointmentPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(225, Short.MAX_VALUE))
        );

        bodyPnl.add(studentDashboardPnl, "card5");

        lecturerDashboardPnl.setBackground(new java.awt.Color(54, 113, 153));

        jLabel8.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Desktop\\project\\lecturer.png")); // NOI18N

        createAppointmentPnl.setBackground(new java.awt.Color(0, 102, 102));

        lecAppointmentSubmitBtn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        lecAppointmentSubmitBtn.setText("Submit");
        lecAppointmentSubmitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lecAppointmentSubmitBtnActionPerformed(evt);
            }
        });

        jComboMinutes.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jComboMinutes.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "30", " " }));

        jComboHours.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jComboHours.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "09", "10", "11", "12", "14", "15", "16", " " }));
        jComboHours.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboHoursActionPerformed(evt);
            }
        });

        jLabelAppoinmentQuestion3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelAppoinmentQuestion3.setText("Select time :");

        jComboBoxYear.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jComboBoxYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2020", "2021", "2022", "2023", "2024", "2025", "2026", "2027", "2028", "2029", "2030", "2031", "2032", "2033", "2034", "2035" }));

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

        jLabelAppoinmentQuestion.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabelAppoinmentQuestion.setText("Select Date : ");

        jLabelCreateAppoinmentTopic.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabelCreateAppoinmentTopic.setText("Create Appoinment");

        jLabelAll.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N

        javax.swing.GroupLayout createAppointmentPnlLayout = new javax.swing.GroupLayout(createAppointmentPnl);
        createAppointmentPnl.setLayout(createAppointmentPnlLayout);
        createAppointmentPnlLayout.setHorizontalGroup(
            createAppointmentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(createAppointmentPnlLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabelCreateAppoinmentTopic, javax.swing.GroupLayout.PREFERRED_SIZE, 383, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(createAppointmentPnlLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(createAppointmentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(createAppointmentPnlLayout.createSequentialGroup()
                        .addComponent(jLabelAppoinmentQuestion, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxDate, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lecAppointmentSubmitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(createAppointmentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(createAppointmentPnlLayout.createSequentialGroup()
                        .addComponent(jLabelAll, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(createAppointmentPnlLayout.createSequentialGroup()
                        .addComponent(jComboBoxMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jComboBoxYear, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                        .addComponent(jLabelAppoinmentQuestion3, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboHours, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboMinutes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(43, Short.MAX_VALUE))))
        );
        createAppointmentPnlLayout.setVerticalGroup(
            createAppointmentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createAppointmentPnlLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jLabelCreateAppoinmentTopic, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(createAppointmentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelAppoinmentQuestion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jComboBoxDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboHours, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboMinutes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelAppoinmentQuestion3, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(createAppointmentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(createAppointmentPnlLayout.createSequentialGroup()
                        .addComponent(lecAppointmentSubmitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(41, 41, 41))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, createAppointmentPnlLayout.createSequentialGroup()
                        .addComponent(jLabelAll, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(16, 16, 16))))
        );

        latestAppointmentDetailsPnl.setBackground(new java.awt.Color(0, 153, 153));
        latestAppointmentDetailsPnl.setForeground(new java.awt.Color(0, 255, 0));

        jLabelUserName.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelUserName.setText("Hi,There ");

        lecturerUserNameLbl.setBackground(new java.awt.Color(0, 204, 204));
        lecturerUserNameLbl.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lecturerUserNameLbl.setText("usename");

        jLabel10.setText("Recent Appointment Date  : ");

        jLabel12.setText("Recent Appointment Time :");

        recentLecAppTimeLbl.setText("time");

        recentLecAppDateLbl.setText("date");

        jLabel13.setText("Recent Appointment status:");

        recentLecAppStatusLbl.setText("status");

        ShowLastLecturerAppointmentBtn.setText("Show Last  Appointment");
        ShowLastLecturerAppointmentBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowLastLecturerAppointmentBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout latestAppointmentDetailsPnlLayout = new javax.swing.GroupLayout(latestAppointmentDetailsPnl);
        latestAppointmentDetailsPnl.setLayout(latestAppointmentDetailsPnlLayout);
        latestAppointmentDetailsPnlLayout.setHorizontalGroup(
            latestAppointmentDetailsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(latestAppointmentDetailsPnlLayout.createSequentialGroup()
                .addGroup(latestAppointmentDetailsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(latestAppointmentDetailsPnlLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabelUserName)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lecturerUserNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(latestAppointmentDetailsPnlLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(latestAppointmentDetailsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(latestAppointmentDetailsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(latestAppointmentDetailsPnlLayout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(latestAppointmentDetailsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(recentLecAppDateLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(recentLecAppTimeLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(latestAppointmentDetailsPnlLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(recentLecAppStatusLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(88, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, latestAppointmentDetailsPnlLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(ShowLastLecturerAppointmentBtn)
                .addGap(170, 170, 170))
        );
        latestAppointmentDetailsPnlLayout.setVerticalGroup(
            latestAppointmentDetailsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(latestAppointmentDetailsPnlLayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(latestAppointmentDetailsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lecturerUserNameLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabelUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(latestAppointmentDetailsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(recentLecAppDateLbl))
                .addGap(18, 18, 18)
                .addGroup(latestAppointmentDetailsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(recentLecAppTimeLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(latestAppointmentDetailsPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(recentLecAppStatusLbl))
                .addGap(18, 18, 18)
                .addComponent(ShowLastLecturerAppointmentBtn)
                .addContainerGap(10, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout lecturerDashboardPnlLayout = new javax.swing.GroupLayout(lecturerDashboardPnl);
        lecturerDashboardPnl.setLayout(lecturerDashboardPnlLayout);
        lecturerDashboardPnlLayout.setHorizontalGroup(
            lecturerDashboardPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lecturerDashboardPnlLayout.createSequentialGroup()
                .addGroup(lecturerDashboardPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lecturerDashboardPnlLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(latestAppointmentDetailsPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(lecturerDashboardPnlLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(createAppointmentPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(681, Short.MAX_VALUE))
        );
        lecturerDashboardPnlLayout.setVerticalGroup(
            lecturerDashboardPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lecturerDashboardPnlLayout.createSequentialGroup()
                .addGroup(lecturerDashboardPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lecturerDashboardPnlLayout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(latestAppointmentDetailsPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(lecturerDashboardPnlLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(50, 50, 50)
                .addComponent(createAppointmentPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(234, Short.MAX_VALUE))
        );

        bodyPnl.add(lecturerDashboardPnl, "card5");

        doctorDashboardPnl.setBackground(new java.awt.Color(47, 133, 192));

        appointmentDoctorTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "appointmentNo", "patientName", "patientType", "appointmentDate", "appointmentTime"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        appointmentDoctorTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                appointmentDoctorTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(appointmentDoctorTable);

        doctorUpdateBtn.setText("checked");
        doctorUpdateBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                doctorUpdateBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout doctorDashboardPnlLayout = new javax.swing.GroupLayout(doctorDashboardPnl);
        doctorDashboardPnl.setLayout(doctorDashboardPnlLayout);
        doctorDashboardPnlLayout.setHorizontalGroup(
            doctorDashboardPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(doctorDashboardPnlLayout.createSequentialGroup()
                .addGroup(doctorDashboardPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(doctorDashboardPnlLayout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(doctorDashboardPnlLayout.createSequentialGroup()
                        .addGap(685, 685, 685)
                        .addComponent(doctorUpdateBtn)))
                .addContainerGap(859, Short.MAX_VALUE))
        );
        doctorDashboardPnlLayout.setVerticalGroup(
            doctorDashboardPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(doctorDashboardPnlLayout.createSequentialGroup()
                .addGap(106, 106, 106)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(doctorUpdateBtn)
                .addContainerGap(407, Short.MAX_VALUE))
        );

        bodyPnl.add(doctorDashboardPnl, "card5");

        nurseDashboardPnl.setBackground(new java.awt.Color(0, 51, 51));

        javax.swing.GroupLayout nurseDashboardPnlLayout = new javax.swing.GroupLayout(nurseDashboardPnl);
        nurseDashboardPnl.setLayout(nurseDashboardPnlLayout);
        nurseDashboardPnlLayout.setHorizontalGroup(
            nurseDashboardPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nurseDashboardPnlLayout.createSequentialGroup()
                .addGap(421, 421, 421)
                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(806, Short.MAX_VALUE))
        );
        nurseDashboardPnlLayout.setVerticalGroup(
            nurseDashboardPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(nurseDashboardPnlLayout.createSequentialGroup()
                .addGap(521, 521, 521)
                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(315, Short.MAX_VALUE))
        );

        bodyPnl.add(nurseDashboardPnl, "card5");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menuPnl, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bodyPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1029, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(menuPnl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(bodyPnl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

//inside the main interface=============================================
    //show nurse and ldoctor btns
    private void healthCareStaffBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_healthCareStaffBtnMouseClicked
       showSubMenu( healthCareStaffSubMenuPnl);
    }//GEN-LAST:event_healthCareStaffBtnMouseClicked

    private void healthCareStaffBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_healthCareStaffBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_healthCareStaffBtnActionPerformed
 //show student and lecturer btns
    private void academicStaffBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_academicStaffBtnMouseClicked
     showSubMenu(academicSubMenuPnl);
    }//GEN-LAST:event_academicStaffBtnMouseClicked

    private void lecturerBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lecturerBtnMouseClicked
        openPnl(lecturerPnl);
    }//GEN-LAST:event_lecturerBtnMouseClicked

    private void studentBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentBtnMouseClicked
         openPnl(studentPnl);
    }//GEN-LAST:event_studentBtnMouseClicked

    private void doctorBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doctorBtnMouseClicked
        openPnl(doctorPnl);
    }//GEN-LAST:event_doctorBtnMouseClicked

    private void nurseBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nurseBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_nurseBtnMouseClicked

    private void nurseBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nurseBtnActionPerformed
      openPnl(nursePnl);
    }//GEN-LAST:event_nurseBtnActionPerformed

    private void aboutBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutBtnMouseClicked
      openPnl(aboutPnl);
    }//GEN-LAST:event_aboutBtnMouseClicked

    private void doctorLoginBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_doctorLoginBtnMouseClicked
       
    }//GEN-LAST:event_doctorLoginBtnMouseClicked

    private void nurseLoginBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nurseLoginBtnMouseClicked
       
    }//GEN-LAST:event_nurseLoginBtnMouseClicked

    private void studentLoginBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentLoginBtnMouseClicked
       
    }//GEN-LAST:event_studentLoginBtnMouseClicked

    private void lecturerLoginBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lecturerLoginBtnMouseClicked

    }//GEN-LAST:event_lecturerLoginBtnMouseClicked

//inside Student Login Interface=================================================
    private void studentLoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_studentLoginBtnActionPerformed
        String stusername = stUserNameTxt.getText();
        String stpassword = String.valueOf(stPassField.getPassword());
        if (stusername.isEmpty() || stpassword.isEmpty()){
            emptyloginFieldError();
        }else{
            String query="Select * from healthcaredb.studenttable Where studentUserName = ? And studentPassword = ? ";
           userLogin(stusername, stpassword,query,studentDashboardPnl);
           //pass student username to lecturer dashboard
           passStudentUserName(stusername);
        }
    }//GEN-LAST:event_studentLoginBtnActionPerformed
//inside  Lecturer  Login  Interface================================================
    private void lecturerLoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lecturerLoginBtnActionPerformed
         String lecusername = lecUserTxt.getText();
        String lecpassword = String.valueOf(lecPassField.getPassword());
        if (lecusername.isEmpty() || lecpassword.isEmpty()){
            emptyloginFieldError();
            }else{
            String query="Select * from healthcaredb.lecturertable Where username = ? And  userPassword = ? ";
           userLogin(lecusername, lecpassword,query,lecturerDashboardPnl);
           //pass username to lecturerDashboard
           passtLecturerUserName(lecusername);
        }     
    }//GEN-LAST:event_lecturerLoginBtnActionPerformed
//inside  Doctor  Login  Interface================================================
    private void doctorLoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorLoginBtnActionPerformed
         String docusername = doctorUserNameTxt.getText();
        String docpassword = String.valueOf(doctorPassField.getPassword());
        if (docusername.isEmpty() || docpassword.isEmpty()){
            emptyloginFieldError();
            }else{
            String query="Select * from healthcaredb.doctortable Where userName = ? And  userPassword = ? ";
           userLogin(docusername, docpassword,query,doctorDashboardPnl);
           
        }     
    }//GEN-LAST:event_doctorLoginBtnActionPerformed
//inside nurse Login Interface=================================================
    private void nurseLoginBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nurseLoginBtnActionPerformed
        String nurseusername = nurseUserNameTxt.getText();
        String nursepassword = String.valueOf(nursePassField.getPassword());
        if (nurseusername.isEmpty() || password.isEmpty()){
            emptyloginFieldError();
            }else{
            String query="Select * from healthcaredb.nursetable Where username = ? And  userPassword = ? ";
           userLogin(nurseusername, nursepassword,query,nurseDashboardPnl);
        }     
    }//GEN-LAST:event_nurseLoginBtnActionPerformed

//Opening  Registration inside studentLogin ==========================================
    private void StudentRegisterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StudentRegisterBtnActionPerformed
        StudentRegistration window = new StudentRegistration();
        window.setVisible(true);
        
    }//GEN-LAST:event_StudentRegisterBtnActionPerformed
//Opening  Registration inside lecturerLogin ===========================================
    private void lecturerRegisterBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lecturerRegisterBtnActionPerformed
        LecturerRegistration  lecregwindow =  new LecturerRegistration();
        lecregwindow.setVisible(true);
        
        
    }//GEN-LAST:event_lecturerRegisterBtnActionPerformed

//inside lecturer Dashboard=======================================================
    //get login name from login
      public String lecturerNameinput;
     public  void passtLecturerUserName(String name){
        lecturerNameinput= name;
        lecturerUserNameLbl.setText(lecturerNameinput);
    }
//creating appointment    
     
     //creating appointment by lecturer
    private void lecAppointmentSubmitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lecAppointmentSubmitBtnActionPerformed
        String lecStringDate = String.valueOf(jComboBoxDate.getSelectedItem());
        String lecStringMonth= String.valueOf(jComboBoxMonth.getSelectedItem());
        String lecStringYear = String.valueOf(jComboBoxYear.getSelectedItem());
        String lecStringHours= String.valueOf(jComboHours.getSelectedItem());
        String lecStringMinutes = String.valueOf(jComboMinutes.getSelectedItem());

        String lecFullName = lecturerUserNameLbl.getText();
        String all = " submited,  appoinment will be on " + lecStringDate + " " + lecStringMonth + "at "  + lecStringHours + ":" + lecStringMinutes;
        String lecAppointmentDate = lecStringDate + " " + lecStringMonth + " " + lecStringYear;
        String lecAppointmentTime = lecStringHours + ":" + lecStringMinutes;
        RegisterOperation lecAppointment = new  RegisterOperation();
        lecAppointment .insertAppoinment( lecturerNameinput,"lecturer",lecAppointmentDate,lecAppointmentTime);
        jLabelAll.setText(all);
    }//GEN-LAST:event_lecAppointmentSubmitBtnActionPerformed

    private void jComboHoursActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboHoursActionPerformed
       
    }//GEN-LAST:event_jComboHoursActionPerformed
    private void jComboBoxDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDateActionPerformed
        
    }//GEN-LAST:event_jComboBoxDateActionPerformed
    private void jComboBoxMonthActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMonthActionPerformed
        
    }//GEN-LAST:event_jComboBoxMonthActionPerformed

//show lastest lecturer apooinment
    private void ShowLastLecturerAppointmentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowLastLecturerAppointmentBtnActionPerformed
       
        try {
            getLastAppoinment(lecturerNameinput);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger("ShowLastLecturerAppointment Error "+ DashBoard.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_ShowLastLecturerAppointmentBtnActionPerformed
// get latest  lecturer appoinments
    public static String  url="jdbc:mysql://localhost:3306/healthcaredb";
    public static String user="root";
    public static  String  password = "1163078"; 
    
    public  void  getLastAppoinment(String lecNameFromLogin) throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        try (Connection conn = DriverManager.getConnection(url,user,password); 
              Statement st = conn.createStatement()) {
            String getLastAppointment  =  "Select appointmentDate, appointmentTime, channellingStatus from healthcaredb.appointmenttable where patientName ='"+ lecNameFromLogin +"'; ";
            ResultSet rs2 = st.executeQuery(getLastAppointment);
            while(rs2.next())
            {
                lecturerUserNameLbl.setText(lecNameFromLogin);
                recentLecAppDateLbl.setText(rs2.getString("appointmentDate"));
                recentLecAppTimeLbl.setText(rs2.getString("appointmentTime"));
                recentLecAppStatusLbl.setText(rs2.getString("channellingStatus"));
            }
        }
}




//inside student dashboard==================================================================
    String studentNameinput;
    public  void passStudentUserName(String name){
    studentNameinput= name;
    studentUserNameLbl.setText(studentNameinput);
    }
    
    private void ShowLastStudentAppointmentBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowLastStudentAppointmentBtnActionPerformed
        try {
            getLastStudentAppointmentData(studentNameinput);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger("Error studentNameinput  in ClassNotFound exception "+DashBoard.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger("Error studentNameinput  in SQLException "+DashBoard.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_ShowLastStudentAppointmentBtnActionPerformed

    private void jComboHours2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboHours2ActionPerformed

    }//GEN-LAST:event_jComboHours2ActionPerformed
    private void jComboBoxMonth2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxMonth2ActionPerformed

    }//GEN-LAST:event_jComboBoxMonth2ActionPerformed
    private void jComboBoxDate2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxDate2ActionPerformed

    }//GEN-LAST:event_jComboBoxDate2ActionPerformed

    private void makeStudentAppointment1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_makeStudentAppointment1ActionPerformed
        String stAppointmentDay = String.valueOf(jComboBoxDate.getSelectedIndex()+1);
        String stAppointmentMonth= String.valueOf(jComboBoxMonth.getSelectedItem());
        String stAppointmentYear = String.valueOf(jComboBoxYear.getSelectedItem());
        String stAppointmentHours= String.valueOf(jComboHours.getSelectedItem());
        String stAppointmentMinutes = String.valueOf(jComboMinutes.getSelectedItem());

        String stAppointment = "Your appoinment will successfully submitted";
        String stAppointmentDate =  stAppointmentDay  + " " + stAppointmentMonth + " " + stAppointmentYear;
        String stAppointmentTime = stAppointmentHours + ":" + stAppointmentMinutes;

        RegisterOperation makeStAppointment = new  RegisterOperation();
        makeStAppointment .insertAppoinment( studentNameinput,"student",stAppointmentDate,stAppointmentTime);
      //  submittedLbl.setText(stAppointment);

    }//GEN-LAST:event_makeStudentAppointment1ActionPerformed
// get latest  student appoinments
    public  void  getLastStudentAppointmentData(String stNameFromLogin) throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        try (Connection conn = DriverManager.getConnection(url,user,password); 
            Statement st = conn.createStatement()) {
            String getLastStAppointment  =  "Select appointmentDate, appointmentTime, channellingStatus from healthcaredb.appointmenttable where patientName ='"+ stNameFromLogin +"'; ";
            ResultSet rs1 = st.executeQuery( getLastStAppointment);
            while(rs1.next())
            {
                studentUserNameLbl.setText(stNameFromLogin);
                recentStAppDateLbl.setText(rs1.getString("appointmentDate"));
                recentStAppTimeLbl.setText(rs1.getString("appointmentTime"));
                recentStAppStatusLbl.setText(rs1.getString("channellingStatus"));
            }
        }
  }

//inside doctor interface=============================================
      int   selectedDoctorRowAppointmentNo;
    private void appointmentDoctorTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_appointmentDoctorTableMouseClicked
        int selectedRow =  appointmentDoctorTable.getSelectedRow();
        String selectedRowAppointment  =  (appointmentDoctorTable.getModel().getValueAt(selectedRow,0).toString());
        selectedDoctorRowAppointmentNo = Integer.parseInt(selectedRowAppointment);
    }//GEN-LAST:event_appointmentDoctorTableMouseClicked

    private void doctorUpdateBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_doctorUpdateBtnActionPerformed
    
        try {                                                
            
            String checkedStatus = "checked";
            try {
                HealthCareDoctorOperation.updateRecord(checkedStatus,selectedDoctorRowAppointmentNo);
            } catch (SQLException ex) {
                Logger.getLogger("SQL Exception occured   doctor update btn clicked "+DashBoard.class.getName()).log(Level.SEVERE, null, ex);
            }
            HealthCareOperation.showTableData(this.appointmentDoctorTable);
            
        } catch (SQLException ex) {
            Logger.getLogger("SQL Exception occured on checkedStatus  doctor update btn clicked"+DashBoard.class.getName()).log(Level.SEVERE, null, ex);
        }
//      
    }//GEN-LAST:event_doctorUpdateBtnActionPerformed
    
    
   
    //inside login interface===============================================
            //loginfunction
    
    public void emptyloginFieldError(){
    JOptionPane.showMessageDialog(this, "Username / Password should not be Empty.", "Error", JOptionPane.ERROR_MESSAGE);
}
    public  void  userLogin(String username, String password ,String query,JPanel dashboard ) {
        Connection dbconn = DBConnection.connectDB();
        if(dbconn != null){
        try {
            PreparedStatement st = (PreparedStatement)dbconn.prepareStatement(query);
            st.setString(1, username);
            st.setString(2, password);
            ResultSet res = st.executeQuery();
            //res.next();{
            if(res.next()){
              //this.setVisible(false);
              openPnl(dashboard);
            }else{
                System.out.println("username"+ username);
                System.out.println("password"+ password);
                JOptionPane.showMessageDialog(this, "Username / Password not found.", "Error", JOptionPane.ERROR_MESSAGE);
            }
           
        } catch (SQLException ex) {
            System.out.println(ex);
        }
        }else{
             System.out.println("The connection not available");
        }
    }

    
    
    
//   submenu
    public void showSubMenu(JPanel btnPnl){
        if(btnPnl.isVisible()== false)
            btnPnl.setVisible(true);
        else
            hideSubMenu(btnPnl);
    }
     public void hideSubMenu(JPanel btnPnl){
       btnPnl.setVisible(false);
    }
    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashBoard.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new DashBoard().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(DashBoard.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel CreateAppointmentPanel1;
    private javax.swing.JButton ShowLastLecturerAppointmentBtn;
    private javax.swing.JButton ShowLastStudentAppointmentBtn;
    private javax.swing.JButton StudentRegisterBtn;
    private javax.swing.JButton aboutBtn;
    private javax.swing.JPanel aboutPnl;
    private javax.swing.JButton academicStaffBtn;
    private javax.swing.JPanel academicSubMenuPnl;
    private javax.swing.JTable appointmentDoctorTable;
    private javax.swing.JPanel bodyPnl;
    private javax.swing.JPanel btnPnl;
    private javax.swing.JPanel createAppointmentPnl;
    private javax.swing.JButton doctorBtn;
    private javax.swing.JPanel doctorDashboardPnl;
    private javax.swing.JButton doctorLoginBtn;
    private javax.swing.JPasswordField doctorPassField;
    private javax.swing.JPanel doctorPnl;
    private javax.swing.JButton doctorUpdateBtn;
    private javax.swing.JTextField doctorUserNameTxt;
    private javax.swing.JButton healthCareStaffBtn;
    private javax.swing.JPanel healthCareStaffSubMenuPnl;
    private javax.swing.JPanel interfacePnl;
    private javax.swing.JComboBox<String> jComboBoxDate;
    private javax.swing.JComboBox<String> jComboBoxDate2;
    private javax.swing.JComboBox<String> jComboBoxMonth;
    private javax.swing.JComboBox<String> jComboBoxMonth2;
    private javax.swing.JComboBox<String> jComboBoxYear;
    private javax.swing.JComboBox<String> jComboBoxYear2;
    private javax.swing.JComboBox<String> jComboHours;
    private javax.swing.JComboBox<String> jComboHours2;
    private javax.swing.JComboBox<String> jComboMinutes;
    private javax.swing.JComboBox<String> jComboMinutes2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabelAll;
    private javax.swing.JLabel jLabelAppoinmentQuestion;
    private javax.swing.JLabel jLabelAppoinmentQuestion2;
    private javax.swing.JLabel jLabelAppoinmentQuestion3;
    private javax.swing.JLabel jLabelAppoinmentQuestion5;
    private javax.swing.JLabel jLabelCreateAppoinmentTopic;
    private javax.swing.JLabel jLabelCreateAppointmentTopic1;
    private javax.swing.JLabel jLabelStUserName;
    private javax.swing.JLabel jLabelUserName;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JLabel jstLabel10;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private java.awt.Label label8;
    private javax.swing.JPanel latestAppointmentDetailsPnl;
    private javax.swing.JPanel latestStAppointmentDetailsPnl;
    private javax.swing.JButton lecAppointmentSubmitBtn;
    private javax.swing.JPasswordField lecPassField;
    private javax.swing.JTextField lecUserTxt;
    private javax.swing.JButton lecturerBtn;
    private javax.swing.JPanel lecturerDashboardPnl;
    private javax.swing.JButton lecturerLoginBtn;
    private javax.swing.JPanel lecturerPnl;
    private javax.swing.JButton lecturerRegisterBtn;
    public static javax.swing.JLabel lecturerUserNameLbl;
    private javax.swing.JLabel logo2;
    private javax.swing.JButton makeStudentAppointment1;
    private javax.swing.JPanel menuPnl;
    private javax.swing.JButton nurseBtn;
    private javax.swing.JPanel nurseDashboardPnl;
    private javax.swing.JButton nurseLoginBtn;
    private javax.swing.JPasswordField nursePassField;
    private javax.swing.JPanel nursePnl;
    private javax.swing.JTextField nurseUserNameTxt;
    private javax.swing.JLabel recentLecAppDateLbl;
    private javax.swing.JLabel recentLecAppStatusLbl;
    private javax.swing.JLabel recentLecAppTimeLbl;
    private javax.swing.JLabel recentStAppDateLbl;
    private javax.swing.JLabel recentStAppStatusLbl;
    private javax.swing.JLabel recentStAppTimeLbl;
    private javax.swing.JPasswordField stPassField;
    private javax.swing.JTextField stUserNameTxt;
    private javax.swing.JButton studentBtn;
    private javax.swing.JPanel studentDashboardPnl;
    private javax.swing.JButton studentLoginBtn;
    private javax.swing.JPanel studentPnl;
    public static javax.swing.JLabel studentUserNameLbl;
    private javax.swing.JLabel submittedLbl1;
    // End of variables declaration//GEN-END:variables
}
