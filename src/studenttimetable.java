
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
public class studenttimetable extends javax.swing.JFrame {

    Connection con = null;
    Connection conn = null;
    PreparedStatement pst = null;
    ResultSet rs = null;
    ResultSet rst = null;
    
    public studenttimetable() {
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
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        g = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        t = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        m = new javax.swing.JComboBox<>();
        tu = new javax.swing.JComboBox<>();
        w = new javax.swing.JComboBox<>();
        th = new javax.swing.JComboBox<>();
        f = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(0, 0, 102));

        jLabel1.setFont(new java.awt.Font("STZhongsong", 1, 60)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 0));
        jLabel1.setText("Timetable");

        jButton1.setFont(new java.awt.Font("STZhongsong", 1, 24)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/back.png"))); // NOI18N
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("STZhongsong", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 255, 255));
        jLabel2.setText("Grade / Class    ---");

        g.setFont(new java.awt.Font("STZhongsong", 1, 24)); // NOI18N
        g.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Grade", "6a", "6b", "6c", "6d", "6e", "6f", "6g", "6h", "6i", "6j", "7a", "7b", "7c", "7d", "7e", "7f", "7g", "7h", "7i", "7j", "8a", "8b", "8c", "8d", "8e", "8f", "8g", "8h", "8i", "8j", "9a", "9b", "9c", "9d", "9e", "9f", "9g", "9h", "9i", "9j", "10a", "10b", "10c", "10d", "10e", "10f", "10g", "10h", "10i", "10j", "11a", "11b", "11c", "11d", "11e", "11f", "11g", "11h", "11i", "11j", "12a", "12b", "12c", "12d", "12e", "12f", "12g", "12h", "12i", "12j", "13a", "13b", "13c", "13d", "13e", "13f", "13g", "13h", "13i", "13j" }));

        jButton2.setFont(new java.awt.Font("STZhongsong", 1, 24)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        jButton2.setText("Add");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("STZhongsong", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 255, 255));
        jLabel3.setText("    Time");
        jLabel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 255, 255), 1, true));

        jLabel4.setFont(new java.awt.Font("STZhongsong", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 255, 255));
        jLabel4.setText("  Monday");
        jLabel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 255, 255), 1, true));

        jLabel5.setFont(new java.awt.Font("STZhongsong", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 255, 255));
        jLabel5.setText("  Tuesday");
        jLabel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 255, 255), 1, true));

        jLabel6.setFont(new java.awt.Font("STZhongsong", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 255, 255));
        jLabel6.setText("Wednesday");
        jLabel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 255, 255), 1, true));

        jLabel7.setFont(new java.awt.Font("STZhongsong", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 255, 255));
        jLabel7.setText(" Thursday");
        jLabel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 255, 255), 1, true));

        jLabel8.setFont(new java.awt.Font("STZhongsong", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 255, 255));
        jLabel8.setText("   Friday");
        jLabel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 255, 255), 1, true));

        t.setFont(new java.awt.Font("STZhongsong", 1, 14)); // NOI18N
        t.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Duration", "7:50 - 8:30", "8:30 - 9:10", "9:10 - 9:50", "9:50 - 10:30", "10:30 - 10:50", "10:50 - 11:30", "11:30 - 12:10", "12:10 - 12:50", "12:50 - 13:30" }));

        table.setFont(new java.awt.Font("STZhongsong", 1, 14)); // NOI18N
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
        m.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Subject", "Interval", "Buddhism", "Sinhala", "Mathematics", "Science", "History", "English", "Tamil", "Geography", "Civics", "Health", "PTS", "E.Music", "W.Music", "Art", "Dancing", "Drama", "S.Literature", "E.Literature", "Commerce", "IT", "Media", "Agriculture", "Chemistry", "Physics", "Biology", "Economics", "Business", "Accounting", "B.C", "Logistics" }));

        tu.setFont(new java.awt.Font("STZhongsong", 1, 14)); // NOI18N
        tu.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Subject", "Interval", "Buddhism", "Sinhala", "Mathematics", "Science", "History", "English", "Tamil", "Geography", "Civics", "Health", "PTS", "E.Music", "W.Music", "Art", "Dancing", "Drama", "S.Literature", "E.Literature", "Commerce", "IT", "Media", "Agriculture", "Chemistry", "Physics", "Biology", "Economics", "Business", "Accounting", "B.C", "Logistics" }));

        w.setFont(new java.awt.Font("STZhongsong", 1, 14)); // NOI18N
        w.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Subject", "Interval", "Buddhism", "Sinhala", "Mathematics", "Science", "History", "English", "Tamil", "Geography", "Civics", "Health", "PTS", "E.Music", "W.Music", "Art", "Dancing", "Drama", "S.Literature", "E.Literature", "Commerce", "IT", "Media", "Agriculture", "Chemistry", "Physics", "Biology", "Economics", "Business", "Accounting", "B.C", "Logistics" }));

        th.setFont(new java.awt.Font("STZhongsong", 1, 14)); // NOI18N
        th.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Subject", "Interval", "Buddhism", "Sinhala", "Mathematics", "Science", "History", "English", "Tamil", "Geography", "Civics", "Health", "PTS", "E.Music", "W.Music", "Art", "Dancing", "Drama", "S.Literature", "E.Literature", "Commerce", "IT", "Media", "Agriculture", "Chemistry", "Physics", "Biology", "Economics", "Business", "Accounting", "B.C", "Logistics" }));

        f.setFont(new java.awt.Font("STZhongsong", 1, 14)); // NOI18N
        f.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Subject", "Interval", "Buddhism", "Sinhala", "Mathematics", "Science", "History", "English", "Tamil", "Geography", "Civics", "Health", "PTS", "E.Music", "W.Music", "Art", "Dancing", "Drama", "S.Literature", "E.Literature", "Commerce", "IT", "Media", "Agriculture", "Chemistry", "Physics", "Biology", "Economics", "Business", "Accounting", "B.C", "Logistics" }));

        jButton3.setFont(new java.awt.Font("STZhongsong", 1, 24)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/cancel1.png"))); // NOI18N
        jButton3.setText("Delete");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(354, 354, 354)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(g, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(285, 285, 285)
                        .addComponent(jButton1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(t, 0, 0, Short.MAX_VALUE)
                                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE))
                                        .addGap(43, 43, 43)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE)
                                            .addComponent(m, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(41, 41, 41)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tu, 0, 142, Short.MAX_VALUE)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(40, 40, 40)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(w, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(46, 46, 46)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                                    .addComponent(th, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(28, 28, 28)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(f, 0, 131, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(134, 134, 134)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(g, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(f, javax.swing.GroupLayout.DEFAULT_SIZE, 45, Short.MAX_VALUE)
                    .addComponent(th)
                    .addComponent(w)
                    .addComponent(m)
                    .addComponent(t)
                    .addComponent(tu))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
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

        setSize(new java.awt.Dimension(1105, 632));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        
        if(g.getSelectedItem().toString().equals("Grade")){
            JOptionPane.showMessageDialog(null, "Fill Grade and Class");
        }else if(t.getSelectedItem().toString().equals("Duration")){
            JOptionPane.showMessageDialog(null, "Fill Time Duration");
                }
        else if(m.getSelectedItem().toString().equals("Subject")){
            JOptionPane.showMessageDialog(null, "Fill Subject");
                }
        else if(tu.getSelectedItem().toString().equals("Subject")){
            JOptionPane.showMessageDialog(null, "Fill Subject");
                }
        else if(w.getSelectedItem().toString().equals("Subject")){
            JOptionPane.showMessageDialog(null, "Fill Subject");
                }
        else if(th.getSelectedItem().toString().equals("Subject")){
            JOptionPane.showMessageDialog(null, "Fill Subject");
                }
        else if(f.getSelectedItem().toString().equals("Subject")){
            JOptionPane.showMessageDialog(null, "Fill Subject");
                }
        else{
        
        try{
            
            String query = "INSERT INTO ["+g.getSelectedItem().toString()+"](ID, Monday, Tuesday, WednesdaY, Thursday, Friday) VALUES (?,?,?,?,?,?);";
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/elearn", "root", "");//Establishing connection
            System.out.println("Connected With the database successfully");
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            pst = con.prepareStatement(query);
            
            
                pst.setString(1,t.getSelectedItem().toString());
                pst.setString(2,m.getSelectedItem().toString());
                pst.setString(3,tu.getSelectedItem().toString());
                pst.setString(4,w.getSelectedItem().toString());
                pst.setString(5,th.getSelectedItem().toString());
                pst.setString(6,f.getSelectedItem().toString());
            
                pst.executeUpdate();
            
                JOptionPane.showMessageDialog(null, "Timetable Added Successfully");
                
            Statement st;
            st = con.createStatement();
            String sql;
            sql = "select *from ["+g.getSelectedItem().toString()+"]";
            rs = st.executeQuery(sql);
            table.getTableHeader().setFont(new Font("SansSerif", Font.ITALIC, 22));
            table.setModel(DbUtils.resultSetToTableModel(rs));
            
        }catch(SQLException ex){
            JOptionPane.showMessageDialog(null, ex);
        }   catch (ClassNotFoundException ex) {
                Logger.getLogger(studenttimetable.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(studenttimetable.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(studenttimetable.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        
        try{
            if((g.getSelectedItem().toString().equals("Grade")) && ("Duration".equals(t.getSelectedItem().toString()))){
                JOptionPane.showMessageDialog(null, "Please enter Grade and Time period to delete record!");
                return;
            }
            int d = JOptionPane.showConfirmDialog(this, "Are you sure you want to delete.?", "Confirmation", JOptionPane.YES_NO_OPTION);
 
            if(d==0){
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/elearn", "root", "");//Establishing connection
                System.out.println("Connected With the database successfully");
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                String sql = "delete from ["+g.getSelectedItem().toString()+"] where ID='"+t.getSelectedItem().toString()+"'";
                pst = con.prepareStatement(sql);
                pst.execute();
                JOptionPane.showMessageDialog(this,"Successfully deleted","Record",JOptionPane.INFORMATION_MESSAGE);
                
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/elearn", "root", "");//Establishing connection
            System.out.println("Connected With the database successfully");
            Statement st;
            st = conn.createStatement();
            String sqll;
            sqll = "select *from ["+g.getSelectedItem().toString()+"]";
            rst = st.executeQuery(sqll);
            table.setModel(DbUtils.resultSetToTableModel(rst));
                
            }
 
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(studenttimetable.class.getName()).log(Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            Logger.getLogger(studenttimetable.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            Logger.getLogger(studenttimetable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        timetable page = new timetable();
        page.setVisible(true);
        
        new studenttimetable().setVisible(false);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(studenttimetable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(studenttimetable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(studenttimetable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(studenttimetable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new studenttimetable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> f;
    private javax.swing.JComboBox<String> g;
    private javax.swing.JButton jButton1;
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
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> m;
    private javax.swing.JComboBox<String> t;
    private javax.swing.JTable table;
    private javax.swing.JComboBox<String> th;
    private javax.swing.JComboBox<String> tu;
    private javax.swing.JComboBox<String> w;
    // End of variables declaration//GEN-END:variables
}
