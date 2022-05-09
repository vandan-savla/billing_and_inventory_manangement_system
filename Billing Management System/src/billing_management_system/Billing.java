package billing_management_system;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import billing_management_system.bill_area;

public class Billing extends javax.swing.JFrame {

    
    public Billing() {
        initComponents();
        clock();
    }

    float total = 0;
    float totalq = 0;

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel12 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jTextField12 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel13 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        inner_image = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTable1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(160, 210));
        setUndecorated(true);
        setResizable(false);
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
        });
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing/management/system/billing frame.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 10, 70, 80));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing/management/system/Billing ani.gif"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 10, 270, 80));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Date");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(839, 22, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Time");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 50, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 22, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("jLabel6");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 50, -1, -1));
        getContentPane().add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 1130, 10));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel12.setText("Product Details:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel14.setText("Product Name");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jTextField6.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 220, 160, 30));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel16.setText("Quantity");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, -1, -1));

        jTextField8.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextField8.setNextFocusableComponent(jButton5);
        getContentPane().add(jTextField8, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 220, 90, 30));
        getContentPane().add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 580, 10));

        jTable2.setAutoCreateRowSorter(true);
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Product Name", "Category", "Quantity", "Rate", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable2.setColumnSelectionAllowed(true);
        jTable2.getTableHeader().setReorderingAllowed(false);
        jScrollPane2.setViewportView(jTable2);
        jTable2.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        if (jTable2.getColumnModel().getColumnCount() > 0) {
            jTable2.getColumnModel().getColumn(0).setResizable(false);
            jTable2.getColumnModel().getColumn(1).setResizable(false);
            jTable2.getColumnModel().getColumn(2).setResizable(false);
            jTable2.getColumnModel().getColumn(3).setResizable(false);
        }

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 190, 530, 200));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Calculation Details:");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 190, 40));

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel20.setText("Total Amount");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel21.setText("Paid Amount");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel22.setText("Return Amount");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 440, -1, -1));

        jTextField4.setEditable(false);
        jTextField4.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextField4.setPreferredSize(new java.awt.Dimension(200, 30));
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 330, -1, -1));

        jTextField11.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextField11.setNextFocusableComponent(jButton1);
        jTextField11.setPreferredSize(new java.awt.Dimension(200, 30));
        jTextField11.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jTextField11ComponentAdded(evt);
            }
        });
        jTextField11.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jTextField11FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField11FocusLost(evt);
            }
        });
        jTextField11.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jTextField11InputMethodTextChanged(evt);
            }
        });
        jTextField11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField11ActionPerformed(evt);
            }
        });
        jTextField11.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField11KeyTyped(evt);
            }
        });
        getContentPane().add(jTextField11, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, -1, -1));

        jTextField12.setEditable(false);
        jTextField12.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextField12.setPreferredSize(new java.awt.Dimension(200, 30));
        jTextField12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField12ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField12, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 440, -1, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing/management/system/save.png"))); // NOI18N
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 320, -1, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing/management/system/Reset.png"))); // NOI18N
        jButton2.setText("Reset");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 370, -1, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing/management/system/close Jframe.png"))); // NOI18N
        jButton3.setText("Close");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 420, -1, -1));

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing_management_system/add.png"))); // NOI18N
        jButton5.setText("Add");
        jButton5.setNextFocusableComponent(jButton4);
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 220, -1, 30));

        jSeparator4.setOrientation(javax.swing.SwingConstants.VERTICAL);
        getContentPane().add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 190, 10, 350));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel13.setText("Total Quantity");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, -1, -1));

        jTextField5.setEditable(false);
        jTextField5.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextField5.setPreferredSize(new java.awt.Dimension(200, 30));
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 490, -1, -1));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing_management_system/delete.png"))); // NOI18N
        jButton4.setText("Delete");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1040, 400, -1, -1));
        getContentPane().add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 1130, 10));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setText("Buyer's Details");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 150, 30));

        jPanel1.setPreferredSize(new java.awt.Dimension(1030, 80));
        jPanel1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jPanel1FocusLost(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel11.setText("Phone No");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, 100, 30));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel10.setText("Address");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 20, 90, 30));

        jTextField1.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextField1.setPreferredSize(new java.awt.Dimension(8, 23));
        jTextField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField1FocusLost(evt);
            }
        });
        jPanel1.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 150, 30));

        jTextField2.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextField2.setMinimumSize(new java.awt.Dimension(8, 23));
        jTextField2.setPreferredSize(new java.awt.Dimension(8, 23));
        jPanel1.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 20, 170, 30));

        jTextField3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jTextField3.setMinimumSize(new java.awt.Dimension(8, 23));
        jTextField3.setNextFocusableComponent(jPanel1);
        jTextField3.setPreferredSize(new java.awt.Dimension(8, 23));
        jTextField3.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextField3FocusLost(evt);
            }
        });
        jPanel1.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 20, 160, 30));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel8.setText("Buyer Name");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 120, 30));
        jPanel1.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 20, -1, -1));

        inner_image.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        inner_image.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing/management/system/billing background.png"))); // NOI18N
        inner_image.setPreferredSize(new java.awt.Dimension(1030, 80));
        inner_image.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                inner_imageFocusLost(evt);
            }
        });
        jPanel1.add(inner_image, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 1030, -1));
        jPanel1.getAccessibleContext().setAccessibleDescription("");

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/billing/management/system/billing background.png"))); // NOI18N
        getContentPane().add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1160, 550));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public void clock() {
        Thread clock = new Thread() {
            public void run() {
                try {
                    while (true) {
                        Calendar cal = new GregorianCalendar();
                        int day = cal.get(Calendar.DAY_OF_MONTH);
                        int month = cal.get(Calendar.MONTH) + 1;
                        int year = cal.get(Calendar.YEAR);
                        int second = cal.get(Calendar.SECOND);
                        int minute = cal.get(Calendar.MINUTE);
                        int hour = cal.get(Calendar.HOUR);

                        jLabel6.setText(hour + ":" + minute + ":" + second);
                        jLabel5.setText(year + "-" + month + "-" + day);

                        sleep(1000);
                    }
                } catch (Exception e) {
                    JOptionPane.showMessageDialog(null, e);

                }
            }
        };
        clock.start();
    }
    private void jTextField12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField12ActionPerformed

    }//GEN-LAST:event_jTextField12ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
        total = totalq = 0;
        int pid;
        float q;
        float aq;
        //int row ;
        DefaultTableModel table1 = (DefaultTableModel) jTable2.getModel();
        try {
            for (int i = 0; i < jTable2.getRowCount(); i++) {

                pid = Integer.parseInt(table1.getValueAt(i, 0).toString());
                q = (Float.parseFloat(table1.getValueAt(i, 3).toString()));
                Connection con = BillingManagementSystem.getConnection();
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select Quantity from products where Product_id= '" + pid + "'");
                if (rs.next()) {

                    aq = rs.getFloat(1);

                    aq = aq + q;

                    st.executeUpdate("update products set Quantity ='" + aq + "' where Product_id = '" + pid + "'");
                }
            }
            table1.setRowCount(0);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        
        
        jTextField4.setText(String.valueOf(total));
        jTextField5.setText(String.valueOf(totalq));
        jTextField12.setText(String.valueOf(0.0));
        jTextField11.setText(String.valueOf(0.0));
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField11ActionPerformed

    }//GEN-LAST:event_jTextField11ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained

    }//GEN-LAST:event_formFocusGained

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (jTextField6.getText().equals("") || jTextField8.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Enter Every Details");
        } else {
            String Pname = jTextField6.getText();
            float rq = Float.parseFloat(jTextField8.getText());
            int pid;
            float rate;
            int act;
            String cat;
            float aq;
            float price;

            float c = 0;
            try {
                Connection con = BillingManagementSystem.getConnection();
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery("select * from products where P_Name= '" + Pname + "'");
                if (rs.next()) {
                    pid = rs.getInt(1);
                    rate = rs.getFloat(3);
                    act = rs.getInt(5);
                    cat = rs.getString(6);
                    aq = rs.getFloat(7);
                    if (act == 1) {
                        if (aq >= rq) {
                            price = rate * rq;
                            switch (cat) {
                                case "GST 0%":
                                    c = 0;
                                    break;
                                case "GST 5%":
                                    c = price * (float) 0.05;
                                    break;
                                case "GST 12%":
                                    c = price * (float) 0.12;
                                    break;
                                case "GST 18%":
                                    c = price * (float) 0.18;
                                    break;
                                case "GST 28%":
                                    c = price * (float) 0.28;
                                    break;
                            }
                            price = price + c;
                            aq = aq - rq;
                            if (aq == 0) {
                                act = 0;
                            }
                            total = total + price;
                            totalq = totalq + rq;
                            st.executeUpdate("update products set Activate = '" + act + "',Quantity ='" + aq + "' where Product_id = '" + pid + "'");
                            String tableData[] = {String.valueOf(pid), Pname, cat, String.valueOf(rq), String.valueOf(rate), String.valueOf(price)};

                            DefaultTableModel table1 = (DefaultTableModel) jTable2.getModel();
                            table1.addRow(tableData);

                        } else {
                            JOptionPane.showMessageDialog(null, "Product is Not enough");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Product Not Available");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "Product Dosent Exixt");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
            jTextField4.setText(String.valueOf(total));
            jTextField5.setText(String.valueOf(totalq));
            jTextField6.setText("");
            jTextField8.setText("");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField11FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField11FocusGained
        if (jTextField11.getText().equals("0.0")) {
            jTextField11.setText("");
        }
    }//GEN-LAST:event_jTextField11FocusGained

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        jTextField4.setText("0.0");
        jTextField11.setText("0.0");
        jTextField12.setText("0.0");
    }//GEN-LAST:event_formComponentShown

    private void jTextField11InputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jTextField11InputMethodTextChanged

    }//GEN-LAST:event_jTextField11InputMethodTextChanged

    private void jTextField11KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField11KeyTyped

    }//GEN-LAST:event_jTextField11KeyTyped

    private void jTextField11ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jTextField11ComponentAdded

    }//GEN-LAST:event_jTextField11ComponentAdded

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        int pid;
        float q;
        float aq;
        float t;
        int row = jTable2.getSelectedRow();
        try {
            if (row != -1) {

                DefaultTableModel table1 = (DefaultTableModel) jTable2.getModel();
                pid = Integer.parseInt(table1.getValueAt(row, 0).toString());
                q = (Float.parseFloat(table1.getValueAt(row, 3).toString()));
                t = Float.parseFloat(table1.getValueAt(row, 5).toString());
                
                
                total = total - t;
                jTextField4.setText(String.valueOf(total));

                Connection con = BillingManagementSystem.getConnection();
                Statement st = con.createStatement();
                totalq = totalq - q;
                jTextField5.setText(String.valueOf((Float.parseFloat(jTextField5.getText()) - q)));

                ResultSet rs = st.executeQuery("select Quantity from products where Product_id= '" + pid + "'");
                if (rs.next()) {

                    aq = rs.getFloat(1);

                    aq = aq + q;

                    st.executeUpdate("update products set Quantity ='" + aq + "' where Product_id = '" + pid + "'");
                }
                table1.removeRow(row);
            }
            if (totalq == 0) {
                jTextField11.setText("0.0");
                jTextField12.setText("0.0");
                jTextField4.setText("0.0");
                jTextField5.setText("0.0");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (Float.parseFloat(jTextField12.getText()) >= 0 && Float.parseFloat(jTextField11.getText()) > 0) {
            try {
                int pId;
                //Integer.parseInt(jtext.getText());
                String pname;
                //jTextField1.getText();
                float rate;
                String date = jLabel5.getText();
                // Float.parseFloat(jTextField2.getText());
                //describe = jTextField3.getText();

                //category = (String)jComboBox2.getSelectedItem();
                float quantity;
                //= Float.parseFloat(jTextField4.getText());
                DefaultTableModel model = (DefaultTableModel) jTable2.getModel();
                int row = model.getRowCount();
                for (int i = 0; i < row; i++) {
                    pId = Integer.parseInt(model.getValueAt(i, 0).toString());
                    pname = model.getValueAt(i, 1).toString();
                    quantity = Float.parseFloat(model.getValueAt(i, 3).toString());
                    rate = Float.parseFloat(model.getValueAt(i, 5).toString());

                    Connection con = BillingManagementSystem.getConnection();
                    String sql = "insert into sales values('" + pId + "','" + pname + "','" + date + "','" + quantity + "','" + rate + "')";

                    Statement stm = con.createStatement();

                    stm.executeUpdate(sql);

                }
                new bill_area().setVisible(true);

                String amt;
                String sub_tot = jTextField4.getText();
                String paid = jTextField11.getText();
                String ret = jTextField12.getText();
                String tot_quantity = jTextField5.getText();
                bill_area.bill_area.setText(bill_area.bill_area.getText() + "\t\t" + "*********************************\n");
                bill_area.bill_area.setText(bill_area.bill_area.getText() + "\t\t" + "*****  BILLING SYSTEM  *****\n");
                bill_area.bill_area.setText(bill_area.bill_area.getText() + "\t\t" + "*********************************\n\n\n");
                bill_area.bill_area.setText(bill_area.bill_area.getText() + "Name: \t" + jTextField1.getText() + "\n");
                bill_area.bill_area.setText(bill_area.bill_area.getText() + "Phone Number: \t" + jTextField3.getText() + "\n");
                bill_area.bill_area.setText(bill_area.bill_area.getText() + "Address: \t" + jTextField2.getText() + "\n\n\n");
                bill_area.bill_area.setText(bill_area.bill_area.getText() + "Products " + "\t" + "Quantity " + "\t" + "Rate " + "\t" + "Total " + "\n");

                for (int i = 0; i < row; i++) {

                    pname = (String) model.getValueAt(i, 1);
                    quantity = Float.parseFloat(model.getValueAt(i, 3).toString());
                    rate = Float.parseFloat(model.getValueAt(i, 4).toString());
                    amt = (String) model.getValueAt(i, 5);

                    bill_area.bill_area.setText(bill_area.bill_area.getText() + pname + "\t" + quantity + "\t" + rate + "\t" + amt + "\n");

                }

                bill_area.bill_area.setText(bill_area.bill_area.getText() + "\n\n\n");
                bill_area.bill_area.setText(bill_area.bill_area.getText() + "\t" + "\t" + "Total Quantity: " + tot_quantity + "\n\n");
                bill_area.bill_area.setText(bill_area.bill_area.getText() + "\t" + "\t" + "Subtotal: " + sub_tot + "\n\n");
                bill_area.bill_area.setText(bill_area.bill_area.getText() + "\t" + "\t" + "Paid Amount: " + paid + "\n\n");
                bill_area.bill_area.setText(bill_area.bill_area.getText() + "\t" + "\t" + "Remaining: " + ret + "\n\n");

            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Enter Amount Properly!!!");
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField11FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField11FocusLost
        float pa = Float.parseFloat(jTextField11.getText());
        float ra;
        float total = Float.parseFloat(jTextField4.getText());
        ra = pa - total;

        jTextField12.setText(String.valueOf(String.format("%.2f", ra)));
    }//GEN-LAST:event_jTextField11FocusLost

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField3FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField3FocusLost


    }//GEN-LAST:event_jTextField3FocusLost

    private void jTextField1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextField1FocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1FocusLost

    private void inner_imageFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_inner_imageFocusLost
        // TODO add your handling code here:
    }//GEN-LAST:event_inner_imageFocusLost

    private void jPanel1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel1FocusLost
        // TODO add your handling code here:
        if (jTextField1.getText().length() == 0 || jTextField2.getText().length() == 0) {
            JOptionPane.showMessageDialog(null, "Fields should not be empty!!");
        }
        if (jTextField3.getText().length() != 10 && jTextField3.getText().matches("^[0-9]*$")) {
            JOptionPane.showMessageDialog(null, "Enter proper Phone no!!");
        }
    }//GEN-LAST:event_jPanel1FocusLost

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
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Billing.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Billing().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel inner_image;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField8;
    // End of variables declaration//GEN-END:variables
}
