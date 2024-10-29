
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */
public class teachertimetable extends javax.swing.JFrame {

    Connection con = null;
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    ResultSet rst = null;
    
    public teachertimetable() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        t = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        m = new javax.swing.JComboBox<>();
        tu = new javax.swing.JComboBox<>();
        w = new javax.swing.JComboBox<>();
        th = new javax.swing.JComboBox<>();
        f = new javax.swing.JComboBox<>();
        jButton4 = new javax.swing.JButton();
        id = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));

        jLabel1.setFont(new java.awt.Font("STZhongsong", 1, 60)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("Timetable");

        jPanel2.setBackground(new java.awt.Color(0, 0, 102));

        jButton2.setFont(new java.awt.Font("STZhongsong", 1, 24)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        jButton2.setText("Back");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("STZhongsong", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 255));
        jLabel3.setText("Teacher's ID    ---");

        jButton3.setFont(new java.awt.Font("STZhongsong", 1, 24)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        jButton3.setText("Add");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("STZhongsong", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 255, 255));
        jLabel4.setText("    Time");
        jLabel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 255, 255), 1, true));

        jLabel5.setFont(new java.awt.Font("STZhongsong", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 255, 255));
        jLabel5.setText("  Monday");
        jLabel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 255, 255), 1, true));

        jLabel6.setFont(new java.awt.Font("STZhongsong", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 255, 255));
        jLabel6.setText("  Tuesday");
        jLabel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 255, 255), 1, true));

        jLabel7.setFont(new java.awt.Font("STZhongsong", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 255, 255));
        jLabel7.setText("Wednesday");
        jLabel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 255, 255), 1, true));

        jLabel8.setFont(new java.awt.Font("STZhongsong", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 255, 255));
        jLabel8.setText(" Thursday");
        jLabel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 255, 255), 1, true));

        jLabel9.setFont(new java.awt.Font("STZhongsong", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 255, 255));
        jLabel9.setText("   Friday");
        jLabel9.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 255, 255), 1, true));

        t.setFont(new java.awt.Font("STZhongsong", 1, 14)); // NOI18N
        t.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Duration", "7:50 - 8:30", "8:30 - 9:10", "9:10 - 9:50", "9:50 - 10:30", "10:30 - 10:50", "10:50 - 11:30", "11:30 - 12:10", "12:10 - 12:50", "12:50 - 13:30" }));

        table.setFont(new java.awt.Font("STZhongsong", 1, 18)); // NOI18N
        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        table.setRowHeight(25);
        jScrollPane1.setViewportView(table);

        m.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        m.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Class", "Interval", "6-A", "6-B", "6-C", "6-D", "6-E", "6-F", "6-G", "6-H", "6-I", "6-J", "7-A", "7-B", "7-C", "7-D", "7-E", "7-F", "7-G", "7-H", "7-I", "7-J", "8-A", "8-B", "8-C", "8-D", "8-E", "8-F", "8-G", "8-H", "8-I", "8-J", "9-A", "9-B", "9-C", "9-D", "9-E", "9-F", "9-G", "9-H", "9-I", "9-J", "10-A", "10-B", "10-C", "10-D", "10-E", "10-F", "10-G", "10-H", "10-I", "10-J", "11-A", "11-B", "11-C", "11-D", "11-E", "11-F", "11-G", "11-H", "11-I", "11-j", "12-A", "12-B", "12-C", "12-D", "12-E", "12-F", "12-G", "12-H", "12-I", "12-J", "13-A", "13-B", "13-C", "13-D", "13-E", "13-F", "13-G", "13-H", "13-I", "13-J" }));

        tu.setFont(new java.awt.Font("STZhongsong", 1, 14)); // NOI18N
        tu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Class", "Interval", "6-A", "6-B", "6-C", "6-D", "6-E", "6-F", "6-G", "6-H", "6-I", "6-J", "7-A", "7-B", "7-C", "7-D", "7-E", "7-F", "7-G", "7-H", "7-I", "7-J", "8-A", "8-B", "8-C", "8-D", "8-E", "8-F", "8-G", "8-H", "8-I", "8-J", "9-A", "9-B", "9-C", "9-D", "9-E", "9-F", "9-G", "9-H", "9-I", "9-J", "10-A", "10-B", "10-C", "10-D", "10-E", "10-F", "10-G", "10-H", "10-I", "10-J", "11-A", "11-B", "11-C", "11-D", "11-E", "11-F", "11-G", "11-H", "11-I", "11-j", "12-A", "12-B", "12-C", "12-D", "12-E", "12-F", "12-G", "12-H", "12-I", "12-J", "13-A", "13-B", "13-C", "13-D", "13-E", "13-F", "13-G", "13-H", "13-I", "13-J" }));

        w.setFont(new java.awt.Font("STZhongsong", 1, 14)); // NOI18N
        w.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Class", "Interval", "6-A", "6-B", "6-C", "6-D", "6-E", "6-F", "6-G", "6-H", "6-I", "6-J", "7-A", "7-B", "7-C", "7-D", "7-E", "7-F", "7-G", "7-H", "7-I", "7-J", "8-A", "8-B", "8-C", "8-D", "8-E", "8-F", "8-G", "8-H", "8-I", "8-J", "9-A", "9-B", "9-C", "9-D", "9-E", "9-F", "9-G", "9-H", "9-I", "9-J", "10-A", "10-B", "10-C", "10-D", "10-E", "10-F", "10-G", "10-H", "10-I", "10-J", "11-A", "11-B", "11-C", "11-D", "11-E", "11-F", "11-G", "11-H", "11-I", "11-j", "12-A", "12-B", "12-C", "12-D", "12-E", "12-F", "12-G", "12-H", "12-I", "12-J", "13-A", "13-B", "13-C", "13-D", "13-E", "13-F", "13-G", "13-H", "13-I", "13-J" }));

        th.setFont(new java.awt.Font("STZhongsong", 1, 14)); // NOI18N
        th.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Class", "Interval", "6-A", "6-B", "6-C", "6-D", "6-E", "6-F", "6-G", "6-H", "6-I", "6-J", "7-A", "7-B", "7-C", "7-D", "7-E", "7-F", "7-G", "7-H", "7-I", "7-J", "8-A", "8-B", "8-C", "8-D", "8-E", "8-F", "8-G", "8-H", "8-I", "8-J", "9-A", "9-B", "9-C", "9-D", "9-E", "9-F", "9-G", "9-H", "9-I", "9-J", "10-A", "10-B", "10-C", "10-D", "10-E", "10-F", "10-G", "10-H", "10-I", "10-J", "11-A", "11-B", "11-C", "11-D", "11-E", "11-F", "11-G", "11-H", "11-I", "11-j", "12-A", "12-B", "12-C", "12-D", "12-E", "12-F", "12-G", "12-H", "12-I", "12-J", "13-A", "13-B", "13-C", "13-D", "13-E", "13-F", "13-G", "13-H", "13-I", "13-J" }));

        f.setFont(new java.awt.Font("STZhongsong", 1, 14)); // NOI18N
        f.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Class", "Interval", "6-A", "6-B", "6-C", "6-D", "6-E", "6-F", "6-G", "6-H", "6-I", "6-J", "7-A", "7-B", "7-C", "7-D", "7-E", "7-F", "7-G", "7-H", "7-I", "7-J", "8-A", "8-B", "8-C", "8-D", "8-E", "8-F", "8-G", "8-H", "8-I", "8-J", "9-A", "9-B", "9-C", "9-D", "9-E", "9-F", "9-G", "9-H", "9-I", "9-J", "10-A", "10-B", "10-C", "10-D", "10-E", "10-F", "10-G", "10-H", "10-I", "10-J", "11-A", "11-B", "11-C", "11-D", "11-E", "11-F", "11-G", "11-H", "11-I", "11-j", "12-A", "12-B", "12-C", "12-D", "12-E", "12-F", "12-G", "12-H", "12-I", "12-J", "13-A", "13-B", "13-C", "13-D", "13-E", "13-F", "13-G", "13-H", "13-I", "13-J" }));

        jButton4.setFont(new java.awt.Font("STZhongsong", 1, 24)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancel1.png"))); // NOI18N
        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        id.setFont(new java.awt.Font("STZhongsong", 1, 24)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(952, 952, 952)
                .addComponent(jButton2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(t, 0, 0, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE))
                                .addGap(43, 43, 43)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                                    .addComponent(m, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(41, 41, 41)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tu, 0, 142, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(w, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(56, 56, 56)
                                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3)))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                                    .addComponent(th, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(f, 0, 131, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(134, 134, 134)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(id, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(f, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(th)
                    .addComponent(w)
                    .addComponent(m)
                    .addComponent(t)
                    .addComponent(tu))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(354, 354, 354)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(432, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(10, 10, 10)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(10, 10, 10)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(530, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
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

        setSize(new java.awt.Dimension(1125, 651));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        timetable page = new timetable();
        page.setVisible(true);

        new teachertimetable().setVisible(false);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        if(id.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Fill ID");
        }else if(t.getSelectedItem().toString().equals("Duration")){
            JOptionPane.showMessageDialog(null, "Fill Time Duration");
        }
        else if(m.getSelectedItem().toString().equals("Class")){
            JOptionPane.showMessageDialog(null, "Fill Class");
        }
        else if(tu.getSelectedItem().toString().equals("Class")){
            JOptionPane.showMessageDialog(null, "Fill Class");
        }
        else if(w.getSelectedItem().toString().equals("Class")){
            JOptionPane.showMessageDialog(null, "Fill Class");
        }
        else if(th.getSelectedItem().toString().equals("Class")){
            JOptionPane.showMessageDialog(null, "Fill Class");
        }
        else if(f.getSelectedItem().toString().equals("Class")){
            JOptionPane.showMessageDialog(null, "Fill Class");
        }
        else{

            try{
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/elearn", "root", "");//Establishing connection
                System.out.println("Connected With the database successfully");
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                String query = "INSERT INTO TeacherTimetable(ID, Time, Monday, Tuesday, Wednesday, Thursday, Friday) VALUES (?,?,?,?,?,?,?)";
                pst = con.prepareStatement(query);

                pst.setString(1,id.getText());
                pst.setString(2,t.getSelectedItem().toString());
                pst.setString(3,m.getSelectedItem().toString());
                pst.setString(4,tu.getSelectedItem().toString());
                pst.setString(5,w.getSelectedItem().toString());
                pst.setString(6,th.getSelectedItem().toString());
                pst.setString(7,f.getSelectedItem().toString());

                pst.executeUpdate();

                JOptionPane.showMessageDialog(null, "Timetable Added Successfully");

                Statement st;
                st = con.createStatement();
                String sql;
                sql = "select *from TeacherTimetable";
                rs = st.executeQuery(sql);
                table.getTableHeader().setFont(new Font("SansSerif", Font.ITALIC, 22));
                table.setModel(DbUtils.resultSetToTableModel(rs));

            }catch(SQLException ex){
                JOptionPane.showMessageDialog(null, ex);
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(teachertimetable.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(teachertimetable.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(teachertimetable.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        
        try{
            if((id.getText().equals(""))){
                JOptionPane.showMessageDialog(null, "Please enter ID to delete record!");
                return;
            }
            int d = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete.?", "Confirmation", JOptionPane.YES_NO_OPTION);

            if(d==0){
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/elearn", "root", "");//Establishing connection
                System.out.println("Connected With the database successfully");
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                String sql = "DELETE FROM TeacherTimetable WHERE ID='"+id.getText()+"'";
                pst = con.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(this,"Successfully deleted","Record",JOptionPane.INFORMATION_MESSAGE);

                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/elearn", "root", "");//Establishing connection
                Statement st;
                st = conn.createStatement();
                String sqll;
                sqll = "select *from TeacherTimetable";
                rst = st.executeQuery(sqll);
                table.getTableHeader().setFont(new Font("SansSerif", Font.ITALIC, 22));
                table.setModel(DbUtils.resultSetToTableModel(rst));

            }

        } catch (SQLException ex) {
            Logger.getLogger(studenttimetable.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(teachertimetable.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(teachertimetable.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(teachertimetable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

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
            java.util.logging.Logger.getLogger(teachertimetable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(teachertimetable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(teachertimetable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(teachertimetable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new teachertimetable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> f;
    private javax.swing.JTextField id;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> m;
    private javax.swing.JComboBox<String> t;
    private javax.swing.JTable table;
    private javax.swing.JComboBox<String> th;
    private javax.swing.JComboBox<String> tu;
    private javax.swing.JComboBox<String> w;
    // End of variables declaration//GEN-END:variables
}