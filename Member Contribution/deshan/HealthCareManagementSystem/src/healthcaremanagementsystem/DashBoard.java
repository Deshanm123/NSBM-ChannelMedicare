
package healthcaremanagementsystem;

import javax.swing.JPanel;

public class DashBoard extends javax.swing.JFrame {

    public DashBoard() {
        initComponents();
        this.setResizable(false);
         this.setBounds(0,0,1280,900);
         menuPnl.setBounds(0,0,200,900);
         bodyPnl.setBounds(200,0,1080,900);
         healthCareStaffSubMenuPnl.setVisible(false);
       academicSubMenuPnl.setVisible(false);
    }
public  void openPnl(JPanel selectedPnl){
        interfacePnl.setVisible(false);
        if(selectedPnl == lecturerPnl){
          lecturerPnl.setVisible(true);
        }
        else
        {  lecturerPnl.setVisible(false);}
       //student
       if(selectedPnl== studentPnl){
       studentPnl.setVisible(true);}
       else
       {studentPnl.setVisible(false);}
      //doctor
      if(selectedPnl == doctorPnl)
        { doctorPnl.setVisible(true);}
      else { doctorPnl.setVisible(false);}
      //nurse
      if(selectedPnl == nursePnl)
        { nursePnl.setVisible(true); }
      else
      {nursePnl.setVisible(false);}
      //about
      if(selectedPnl==aboutPnl){
          aboutPnl.setVisible(true);
      }else
      aboutPnl.setVisible(false);
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
        lecturerLoginBtn = new javax.swing.JButton();
        studentLoginBtn = new javax.swing.JButton();
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
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        nurseLoginBtn1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        lecturerPnl = new javax.swing.JPanel();
        label7 = new java.awt.Label();
        label8 = new java.awt.Label();
        jTextField7 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        nurseLoginBtn2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        doctorPnl = new javax.swing.JPanel();
        doctorLoginBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        label1 = new java.awt.Label();
        label2 = new java.awt.Label();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        nursePnl = new javax.swing.JPanel();
        label3 = new java.awt.Label();
        label4 = new java.awt.Label();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        nurseLoginBtn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        aboutPnl = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        doctorDashboardPnl = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();

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

        lecturerLoginBtn.setText("Lecturer Login");
        lecturerLoginBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lecturerLoginBtnMouseClicked(evt);
            }
        });

        studentLoginBtn.setText("Student Login");
        studentLoginBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                studentLoginBtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout academicSubMenuPnlLayout = new javax.swing.GroupLayout(academicSubMenuPnl);
        academicSubMenuPnl.setLayout(academicSubMenuPnlLayout);
        academicSubMenuPnlLayout.setHorizontalGroup(
            academicSubMenuPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(academicSubMenuPnlLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(academicSubMenuPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lecturerLoginBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(studentLoginBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        academicSubMenuPnlLayout.setVerticalGroup(
            academicSubMenuPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(academicSubMenuPnlLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lecturerLoginBtn)
                .addGap(18, 18, 18)
                .addComponent(studentLoginBtn)
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
                .addGap(0, 469, Short.MAX_VALUE))
        );

        bodyPnl.add(interfacePnl, "card2");

        studentPnl.setBackground(new java.awt.Color(68, 88, 103));

        label5.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        label5.setForeground(new java.awt.Color(255, 255, 255));
        label5.setText("User Name :");

        label6.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        label6.setForeground(new java.awt.Color(255, 255, 255));
        label6.setText("Password :");

        nurseLoginBtn1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        nurseLoginBtn1.setText("Log in");
        nurseLoginBtn1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nurseLoginBtn1MouseClicked(evt);
            }
        });

        jLabel5.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Desktop\\project\\student.png")); // NOI18N

        javax.swing.GroupLayout studentPnlLayout = new javax.swing.GroupLayout(studentPnl);
        studentPnl.setLayout(studentPnlLayout);
        studentPnlLayout.setHorizontalGroup(
            studentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentPnlLayout.createSequentialGroup()
                .addGroup(studentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(studentPnlLayout.createSequentialGroup()
                        .addGap(412, 412, 412)
                        .addComponent(nurseLoginBtn1))
                    .addGroup(studentPnlLayout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addGroup(studentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68)
                        .addGroup(studentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(studentPnlLayout.createSequentialGroup()
                        .addGap(316, 316, 316)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(755, Short.MAX_VALUE))
        );
        studentPnlLayout.setVerticalGroup(
            studentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(studentPnlLayout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addGroup(studentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(studentPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(studentPnlLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(label6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(studentPnlLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addComponent(nurseLoginBtn1)
                .addContainerGap(217, Short.MAX_VALUE))
        );

        bodyPnl.add(studentPnl, "card5");

        lecturerPnl.setBackground(new java.awt.Color(54, 113, 153));

        label7.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        label7.setForeground(new java.awt.Color(255, 255, 255));
        label7.setText("User Name :");

        label8.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        label8.setForeground(new java.awt.Color(255, 255, 255));
        label8.setText("Password :");

        nurseLoginBtn2.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        nurseLoginBtn2.setText("Log in");
        nurseLoginBtn2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nurseLoginBtn2MouseClicked(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\USER\\Desktop\\project\\lecturer.png")); // NOI18N

        javax.swing.GroupLayout lecturerPnlLayout = new javax.swing.GroupLayout(lecturerPnl);
        lecturerPnl.setLayout(lecturerPnlLayout);
        lecturerPnlLayout.setHorizontalGroup(
            lecturerPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lecturerPnlLayout.createSequentialGroup()
                .addGroup(lecturerPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lecturerPnlLayout.createSequentialGroup()
                        .addGap(412, 412, 412)
                        .addComponent(nurseLoginBtn2))
                    .addGroup(lecturerPnlLayout.createSequentialGroup()
                        .addGap(212, 212, 212)
                        .addGroup(lecturerPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68)
                        .addGroup(lecturerPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(lecturerPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(699, Short.MAX_VALUE))
        );
        lecturerPnlLayout.setVerticalGroup(
            lecturerPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(lecturerPnlLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 347, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34)
                .addGroup(lecturerPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(lecturerPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(lecturerPnlLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(lecturerPnlLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addComponent(nurseLoginBtn2)
                .addContainerGap(217, Short.MAX_VALUE))
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
                        .addGroup(doctorPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(jTextField1)
                    .addComponent(label1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(42, 42, 42)
                .addGroup(doctorPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(label2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTextField2))
                .addGap(35, 35, 35)
                .addComponent(doctorLoginBtn)
                .addContainerGap(180, Short.MAX_VALUE))
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
                            .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(68, 68, 68)
                        .addGroup(nursePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)))
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
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(nursePnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(nursePnlLayout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(label4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(nursePnlLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32)
                .addComponent(nurseLoginBtn)
                .addContainerGap(186, Short.MAX_VALUE))
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
                .addContainerGap(576, Short.MAX_VALUE))
        );

        bodyPnl.add(aboutPnl, "card7");

        doctorDashboardPnl.setBackground(new java.awt.Color(0, 51, 51));
        doctorDashboardPnl.setForeground(new java.awt.Color(255, 255, 255));

        jLabel10.setText("insside doctor Pnl");

        javax.swing.GroupLayout doctorDashboardPnlLayout = new javax.swing.GroupLayout(doctorDashboardPnl);
        doctorDashboardPnl.setLayout(doctorDashboardPnlLayout);
        doctorDashboardPnlLayout.setHorizontalGroup(
            doctorDashboardPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(doctorDashboardPnlLayout.createSequentialGroup()
                .addGap(253, 253, 253)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(672, Short.MAX_VALUE))
        );
        doctorDashboardPnlLayout.setVerticalGroup(
            doctorDashboardPnlLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(doctorDashboardPnlLayout.createSequentialGroup()
                .addGap(266, 266, 266)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(480, Short.MAX_VALUE))
        );

        bodyPnl.add(doctorDashboardPnl, "card8");

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

    private void healthCareStaffBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_healthCareStaffBtnMouseClicked
       showSubMenu( healthCareStaffSubMenuPnl);
    }//GEN-LAST:event_healthCareStaffBtnMouseClicked

    private void healthCareStaffBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_healthCareStaffBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_healthCareStaffBtnActionPerformed

    private void academicStaffBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_academicStaffBtnMouseClicked
     showSubMenu(academicSubMenuPnl);
    }//GEN-LAST:event_academicStaffBtnMouseClicked

    private void lecturerLoginBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lecturerLoginBtnMouseClicked
        openPnl(lecturerPnl);
    }//GEN-LAST:event_lecturerLoginBtnMouseClicked

    private void studentLoginBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_studentLoginBtnMouseClicked
         openPnl(studentPnl);
    }//GEN-LAST:event_studentLoginBtnMouseClicked

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
        // TODO add your handling code here:
    }//GEN-LAST:event_doctorLoginBtnMouseClicked

    private void nurseLoginBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nurseLoginBtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_nurseLoginBtnMouseClicked

    private void nurseLoginBtn1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nurseLoginBtn1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_nurseLoginBtn1MouseClicked

    private void nurseLoginBtn2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nurseLoginBtn2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_nurseLoginBtn2MouseClicked

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
                new DashBoard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton aboutBtn;
    private javax.swing.JPanel aboutPnl;
    private javax.swing.JButton academicStaffBtn;
    private javax.swing.JPanel academicSubMenuPnl;
    private javax.swing.JPanel bodyPnl;
    private javax.swing.JPanel btnPnl;
    private javax.swing.JButton doctorBtn;
    private javax.swing.JPanel doctorDashboardPnl;
    private javax.swing.JButton doctorLoginBtn;
    private javax.swing.JPanel doctorPnl;
    private javax.swing.JButton healthCareStaffBtn;
    private javax.swing.JPanel healthCareStaffSubMenuPnl;
    private javax.swing.JPanel interfacePnl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private java.awt.Label label1;
    private java.awt.Label label2;
    private java.awt.Label label3;
    private java.awt.Label label4;
    private java.awt.Label label5;
    private java.awt.Label label6;
    private java.awt.Label label7;
    private java.awt.Label label8;
    private javax.swing.JButton lecturerLoginBtn;
    private javax.swing.JPanel lecturerPnl;
    private javax.swing.JLabel logo2;
    private javax.swing.JPanel menuPnl;
    private javax.swing.JButton nurseBtn;
    private javax.swing.JButton nurseLoginBtn;
    private javax.swing.JButton nurseLoginBtn1;
    private javax.swing.JButton nurseLoginBtn2;
    private javax.swing.JPanel nursePnl;
    private javax.swing.JButton studentLoginBtn;
    private javax.swing.JPanel studentPnl;
    // End of variables declaration//GEN-END:variables
}
