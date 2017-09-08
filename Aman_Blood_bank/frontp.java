
package Aman_Blood_bank;
import javax.swing.JOptionPane;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.text.SimpleDateFormat;
import net.proteanit.sql.DbUtils;



public class frontp extends javax.swing.JFrame {
    Connection con=null;
    Statement stmt=null;
    PreparedStatement ps=null;
    ResultSet rs=null;
    public String comb="Select...";
   public String d;
   public int val;
   public int totblood=50;
   Date dates = new Date();
               
    
    public frontp() {
         String url="url:oracle:thin:@localhost:1521:XE";
         
        try
            {
                Class.forName("oracle.jdbc.driver.OracleDriver");
                 
                
                System.out.println("driver loaded\n");
                con=DriverManager.getConnection(url,"system","aman");
                
                System.out.println("Connection aman Established\n");
                

                //con.close();
            }
        catch(ClassNotFoundException e)
        {
            System.out.println("driver not found\n");
        }
        catch(SQLException e)
        {
            System.out.println("Connection not establish");
        }
        if(con!=null)
        {
            initComponents();
            updatetable();
            updatedonor();
            date.setText(dates.toString());
        }
        
        
    }
     private void updatetable()
        {
            try
            {
                
                String s="select * from issuedblood";
                ps=con.prepareStatement(s);
                rs=ps.executeQuery(s);
                tran_blood.setModel(DbUtils.resultSetToTableModel(rs));
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(this,"Unable to Display Table!!!",
            "Error",JOptionPane.ERROR_MESSAGE);
            }
        }
        private void updatedonor()
        {
            try
            {
                
                String s="select * from donor";
                ps=con.prepareStatement(s);
                rs=ps.executeQuery(s);
                donor_table.setModel(DbUtils.resultSetToTableModel(rs));
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(this,"Unable to Display Table!!!","Error",JOptionPane.ERROR_MESSAGE);
            }
        }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTabbedPane2 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        name = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cn = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        add_donor = new javax.swing.JButton();
        bloodgr = new javax.swing.JComboBox<>();
        sex_sel = new javax.swing.JComboBox<>();
        address = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        state = new javax.swing.JComboBox<>();
        city = new javax.swing.JTextField();
        jPanel7 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        donor_table = new javax.swing.JTable();
        jPanel6 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        update_donor = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        cont = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        datas = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        issueblood = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        namei = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        date = new javax.swing.JTextField();
        bloodgroup = new javax.swing.JComboBox<>();
        numunit = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        issue_for = new javax.swing.JComboBox<>();
        check_comp = new javax.swing.JButton();
        jLabel19 = new javax.swing.JLabel();
        contact = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tran_blood = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        delete = new javax.swing.JToggleButton();
        t_delete = new javax.swing.JToggleButton();
        jLabel15 = new javax.swing.JLabel();
        logout = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 583));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(51, 51, 255));
        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("BLOOD BANK");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 480, 40));

        jTabbedPane2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTabbedPane2.setTabPlacement(javax.swing.JTabbedPane.LEFT);
        jTabbedPane2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(228, 11, 280, 32));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel2.setText("NAME");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 170, 32));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel3.setText("BLOOD GROUP");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 170, 36));

        jTextField2.setText("jTextField1");
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(376, 49, 183, 0));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel4.setText("CONTACT NUMBER");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, 35));
        jPanel1.add(cn, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 280, 35));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel5.setText("SEX");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 50, 38));

        add_donor.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        add_donor.setText("ADD");
        add_donor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                add_donorMouseClicked(evt);
            }
        });
        add_donor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_donorActionPerformed(evt);
            }
        });
        jPanel1.add(add_donor, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 440, 140, 34));

        bloodgr.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select...", "A+", "B+", "O+", "AB+", "A-", "O-", "B-", "AB-" }));
        jPanel1.add(bloodgr, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 140, 30));

        sex_sel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select...", "Male", "Female" }));
        jPanel1.add(sex_sel, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 140, 30));

        address.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addressActionPerformed(evt);
            }
        });
        jPanel1.add(address, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 290, 30));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel13.setText("ADDRESS");
        jPanel1.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 110, 30));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("CITY");
        jPanel1.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 80, 30));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel16.setText("STATE");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 90, 30));

        state.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select...", "Andhra Pradesh (AP)", "Arunachal Pradesh (AR)", "Assam (AS)", "Bihar (BR)", "Chhattisgarh (CG)", "Goa (GA)", "Gujarat (GJ)", "Haryana (HR)", "Himachal Pradesh (HP)", "Jammu and Kashmir (JK)", "Jharkhand (JH)", "Karnataka (KA)", "Kerala (KL)", "Madhya Pradesh (MP)", "Maharashtra (MH)", "Manipur (MN)", "Meghalaya (ML)", "Mizoram (MZ)", "Nagaland (NL)", "Odisha(OR)", "Punjab (PB)", "Rajasthan (RJ)", "Sikkim (SK)", "Tamil Nadu (TN)", "Tripura (TR)", "Uttar Pradesh (UP)", "Uttarakhand (UK)", "West Bengal (WB)", " " }));
        jPanel1.add(state, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 130, 30));

        city.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cityActionPerformed(evt);
            }
        });
        jPanel1.add(city, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 290, 30));

        jTabbedPane2.addTab("ADD DONOR", jPanel1);

        donor_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(donor_table);

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 726, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 72, Short.MAX_VALUE))
        );

        jTabbedPane2.addTab("DONORS", jPanel7);

        jPanel6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel17.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel17.setText("UPDATE DONOR DETAIL");
        jPanel6.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 53, 200, 30));

        update_donor.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        update_donor.setText("UPDATE DONOR");
        update_donor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                update_donorMouseClicked(evt);
            }
        });
        jPanel6.add(update_donor, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 50, 160, 30));

        jLabel18.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jPanel6.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 250, 20));

        jTabbedPane2.addTab("UPDATE DONOR", jPanel6);

        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("CONTACT NUMBER");
        jPanel3.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 25, -1, 29));

        cont.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel3.add(cont, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 26, 223, 29));

        search.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        search.setText("SEARCH");
        search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchMouseClicked(evt);
            }
        });
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel3.add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 61, 223, -1));
        jPanel3.add(datas, new org.netbeans.lib.awtextra.AbsoluteConstraints(428, 379, 171, 29));

        jTabbedPane2.addTab("SEARCH DONOR", jPanel3);

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel11.setText("PATIENT BLOOD GROUP:");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 230, 32));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("NUMBERS OF UNIT:");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 150, 198, 32));

        issueblood.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        issueblood.setText("ISSUE BLOOD");
        issueblood.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                issuebloodMouseClicked(evt);
            }
        });
        issueblood.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                issuebloodActionPerformed(evt);
            }
        });
        jPanel4.add(issueblood, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 450, 262, 39));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("NAME");
        jLabel7.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 36, 198, 31));
        jPanel4.add(namei, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 36, 262, 31));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("DATE:");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 78, 30));
        jPanel4.add(date, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 262, 31));

        bloodgroup.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select...", "A+", "O+", "B+", "AB+", "A-", "O-", "B-", "AB-" }));
        jPanel4.add(bloodgroup, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 160, 30));

        numunit.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select...", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10" }));
        jPanel4.add(numunit, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 160, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setText("ISSUED BLOOD :");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 350, 160, 30));

        issue_for.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select...", "A+", "O+", "B+", "AB+", "A-", "O-", "B-", "AB-" }));
        jPanel4.add(issue_for, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, 160, 30));

        check_comp.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        check_comp.setText("CHECK COMPATIBLITY");
        check_comp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                check_compMouseClicked(evt);
            }
        });
        jPanel4.add(check_comp, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 400, 250, -1));

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel19.setText("CONTACT:");
        jPanel4.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 290, 160, 30));
        jPanel4.add(contact, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 290, 260, 30));

        jTabbedPane2.addTab("ISSUE BLOOD", jPanel4);

        tran_blood.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Name", "Blood group", "Date", "Units"
            }
        ));
        jScrollPane1.setViewportView(tran_blood);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 736, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 499, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(148, Short.MAX_VALUE)))
        );

        jTabbedPane2.addTab("TRANSACTION", jPanel2);

        jPanel5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        delete.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        delete.setText("DONOR DETAIL");
        delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteMouseClicked(evt);
            }
        });
        jPanel5.add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 160, 30));

        t_delete.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        t_delete.setText("TRANSACTION DETAIL");
        t_delete.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                t_deleteMouseClicked(evt);
            }
        });
        jPanel5.add(t_delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, 30));

        jLabel15.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel15.setText("Select the Choice to Delete ?");
        jPanel5.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 330, 30));

        jTabbedPane2.addTab("DELETE", jPanel5);

        getContentPane().add(jTabbedPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 910, 510));

        logout.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        logout.setText("LogOut");
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        getContentPane().add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 10, 100, 30));

        jLabel10.setText("___________________________________________________________________________________________________________________________________________________________");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(2, 60, 930, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void add_donorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_donorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_add_donorActionPerformed

    private void add_donorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add_donorMouseClicked
        // TODO add your handling code here:
        try{
             stmt = con.createStatement();
              String nam = name.getText();
              String sx =sex_sel.getSelectedItem().toString();
              String bloodg = bloodgr.getSelectedItem().toString();
              String ph = (cn.getText());
              String addr=address.getText()+city.getText()+state.getSelectedItem().toString();
                      
              String sq="insert into donor values('"+nam+"','"+bloodg+"','"+sx+"','"+addr+"','"+ph+"')";
              stmt.executeUpdate(sq);
              System.out.println("Records inserted into the table");
              val=val+1;
              totblood=totblood+val;
              name.setText("");
              address.setText("");
              city.setText("");
              cn.setText("");
              
        }
        catch(SQLException se){
      //Handle errors for JDBC
      se.printStackTrace();
   }catch(Exception e){
      //Handle errors for Class.forName
      e.printStackTrace();
   }
              
    }//GEN-LAST:event_add_donorMouseClicked

    private void searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchMouseClicked
        // TODO add your handling code here:
        
        try{
            //stmt = con.createStatement();
            String contact=cont.getText();
            String sq="select name,bloodgroup,sex,contact from donor where contact='"+contact+"'";
            stmt=con.createStatement();
            ResultSet rs = stmt.executeQuery(sq);
             if(rs.next())
                {
                            String name  = rs.getString("name");
                            String sex = rs.getString("sex");
                            String blood = rs.getString("bloodgroup");
                            String ph = rs.getString("contact");
                            userdetail obj=new userdetail(name,sex,blood,ph);
                            obj.setVisible(true);
                            this.setVisible(false);
                            System.out.println("Name: " + name);
                            System.out.println("Sex : " + sex);
                            System.out.println("Blood group : " + blood);
                            System.out.println("Phone number : " + ph);
                            cont.setText("");

                }
             else
                {
                    JOptionPane.showMessageDialog(this,"No Such Record found!!!","Error",JOptionPane.ERROR_MESSAGE);
                }          
        }
        catch(SQLException se)
        {
                se.printStackTrace();
        }catch(Exception e)
        {
                e.printStackTrace();
        }
    }//GEN-LAST:event_searchMouseClicked

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchActionPerformed

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_logoutActionPerformed

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        // TODO add your handling code here:
        try{
                    //bank obj=new bank();
                    confirm_logout ob=new confirm_logout(con);
                    ob.setVisible(true);
                    ob.setSize(400, 150);
                    this.setVisible(false);
                    //obj.setVisible(true);

                  
        }
        catch(Exception e)
        {
            System.out.println("Unable to Logout!!!");
        }
        
        
        
    }//GEN-LAST:event_logoutMouseClicked
    
    private void issuebloodMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_issuebloodMouseClicked
        // TODO add your handling code here:
        try{
            if(totblood>0)
            {
                if(bloodgroup.getSelectedItem().toString().equalsIgnoreCase("Select...")||numunit.getSelectedItem().toString().equalsIgnoreCase("Select..."))
                {
                     JOptionPane.showMessageDialog(this,"Too Large Input.Unable to Issue!!!","Error",JOptionPane.ERROR_MESSAGE);
                }
                else
                {
                    stmt=con.createStatement();
                    String blty=bloodgroup.getSelectedItem().toString();
                    String un=numunit.getSelectedItem().toString();
                    String namee=namei.getText();
                    int v=1500;
                     d=(dates).toString();
                    int req=Integer.parseInt(un);
                    String sq="insert into issuedblood values('"+namee+"','"+blty+"','"+req+"','"+d+"','"+contact.getText()+"')";
                    stmt.executeUpdate(sq);
                    System.out.println("Record Inserted\n");
                    prebill pb=new prebill(req,namee,blty,v,d);
                    this.setVisible(false);
                    pb.setVisible(true);
                    totblood=totblood-req;
                }
                    
            }
            else
            {
                 JOptionPane.showMessageDialog(this,"Too Large Input.Unable to Issue!!!","Error",JOptionPane.ERROR_MESSAGE);
            }
                    
                    
                    
                    
        }catch(SQLException se){
      //Handle errors for JDBC
      se.printStackTrace();
   }catch(Exception e){
      //Handle errors for Class.forName
      e.printStackTrace();
   }
             
                   
    }//GEN-LAST:event_issuebloodMouseClicked

    private void issuebloodActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_issuebloodActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_issuebloodActionPerformed

    private void check_compMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_check_compMouseClicked
        // TODO add your handling code here:
        if(bloodgroup.getSelectedItem().toString().equalsIgnoreCase("AB+"))
        {
            JOptionPane.showMessageDialog(this,"Blood is Compatible for patient",
            "Success",JOptionPane.PLAIN_MESSAGE);
        }
        else if(bloodgroup.getSelectedItem().toString().equalsIgnoreCase("AB-")&&((issue_for.getSelectedItem().toString().equalsIgnoreCase("o-"))||(issue_for.getSelectedItem().toString().equalsIgnoreCase("b-"))||issue_for.getSelectedItem().toString().equalsIgnoreCase("a-")||issue_for.getSelectedItem().toString().equalsIgnoreCase("ab-")))
        {
            JOptionPane.showMessageDialog(this,"Blood is Compatible for patient",
            "Success",JOptionPane.PLAIN_MESSAGE);
        }
        else if(bloodgroup.getSelectedItem().toString().equalsIgnoreCase("A+")&&((issue_for.getSelectedItem().toString().equalsIgnoreCase("a+"))||(issue_for.getSelectedItem().toString().equalsIgnoreCase("o+"))||issue_for.getSelectedItem().toString().equalsIgnoreCase("a-")||issue_for.getSelectedItem().toString().equalsIgnoreCase("a+")))
        {
            JOptionPane.showMessageDialog(this,"Blood is Compatible for patient",
            "Success",JOptionPane.PLAIN_MESSAGE);
        }
        else if(bloodgroup.getSelectedItem().toString().equalsIgnoreCase("A-")&&((issue_for.getSelectedItem().toString().equalsIgnoreCase("o-"))||(issue_for.getSelectedItem().toString().equalsIgnoreCase("a-"))))
        {
            JOptionPane.showMessageDialog(this,"Blood is Compatible for patient",
            "Success",JOptionPane.PLAIN_MESSAGE);
        }
        else if(bloodgroup.getSelectedItem().toString().equalsIgnoreCase("B+")&&((issue_for.getSelectedItem().toString().equalsIgnoreCase("o-"))||(issue_for.getSelectedItem().toString().equalsIgnoreCase("o+"))||issue_for.getSelectedItem().toString().equalsIgnoreCase("b-")||issue_for.getSelectedItem().toString().equalsIgnoreCase("b+")))
        {
            JOptionPane.showMessageDialog(this,"Blood is Compatible for patient",
            "Success",JOptionPane.PLAIN_MESSAGE);
        }
        else if(bloodgroup.getSelectedItem().toString().equalsIgnoreCase("B-")&&((issue_for.getSelectedItem().toString().equalsIgnoreCase("o-"))||(issue_for.getSelectedItem().toString().equalsIgnoreCase("b-"))))
        {
            JOptionPane.showMessageDialog(this,"Blood is Compatible for patient",
            "Success",JOptionPane.PLAIN_MESSAGE);
        }
        else if(bloodgroup.getSelectedItem().toString().equalsIgnoreCase("o+")&&((issue_for.getSelectedItem().toString().equalsIgnoreCase("o-"))||(issue_for.getSelectedItem().toString().equalsIgnoreCase("o+"))))
        {
            JOptionPane.showMessageDialog(this,"Blood is Compatible for patient",
            "Success",JOptionPane.PLAIN_MESSAGE);
        }
        else if(bloodgroup.getSelectedItem().toString().equalsIgnoreCase("o-")&&((issue_for.getSelectedItem().toString().equalsIgnoreCase("o-"))))
        {
            JOptionPane.showMessageDialog(this,"Blood is Compatible for patient",
            "Success",JOptionPane.PLAIN_MESSAGE);
        }
        else
        {
            JOptionPane.showMessageDialog(this,"Not Compatible for patient",
            "Error...!!!",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_check_compMouseClicked

    private void addressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addressActionPerformed

    private void deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteMouseClicked
        // TODO add your handling code here:
        deleterec obj =new deleterec();
        this.setVisible(false);
        obj.setVisible(true);
        
       /* try
        {
            stmt=con.createStatement();
            String s="select contact from blood where contact='"+contact.getText()+"'";
            if(rs.next())
            {
                confirm_delete obj=new confirm_delete(contact.getText());
                this.setVisible(false);
                obj.setVisible(true);
            }
            else
            {
                JOptionPane.showMessageDialog(this,"No Such Record Found...!!!",
            "Error...!!!",JOptionPane.ERROR_MESSAGE);
            }
        }catch(Exception e)
        {
            e.printStackTrace();
        }*/
        
    }//GEN-LAST:event_deleteMouseClicked

    private void t_deleteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_t_deleteMouseClicked
        // TODO add your handling code here:
        
        deleterec_t obj =new deleterec_t();
        this.setVisible(false);
        obj.setVisible(true);
    }//GEN-LAST:event_t_deleteMouseClicked

    private void cityActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cityActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cityActionPerformed

    private void update_donorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_update_donorMouseClicked
        // TODO add your handling code here:
        update_donor obj=new update_donor();
        this.setVisible(false);
        obj.setVisible(true);
        
    }//GEN-LAST:event_update_donorMouseClicked
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
            java.util.logging.Logger.getLogger(prebill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(prebill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(prebill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(prebill.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frontp().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton add_donor;
    private javax.swing.JTextField address;
    private javax.swing.JComboBox<String> bloodgr;
    private javax.swing.JComboBox<String> bloodgroup;
    private javax.swing.JButton check_comp;
    private javax.swing.JTextField city;
    private javax.swing.JTextField cn;
    private javax.swing.JTextField cont;
    private javax.swing.JTextField contact;
    private javax.swing.JLabel datas;
    private javax.swing.JTextField date;
    private javax.swing.JToggleButton delete;
    private javax.swing.JTable donor_table;
    private javax.swing.JComboBox<String> issue_for;
    private javax.swing.JButton issueblood;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTabbedPane jTabbedPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JButton logout;
    private javax.swing.JTextField name;
    private javax.swing.JTextField namei;
    private javax.swing.JComboBox<String> numunit;
    private javax.swing.JButton search;
    private javax.swing.JComboBox<String> sex_sel;
    private javax.swing.JComboBox<String> state;
    private javax.swing.JToggleButton t_delete;
    private javax.swing.JTable tran_blood;
    private javax.swing.JButton update_donor;
    // End of variables declaration//GEN-END:variables
}

