package com.thp.boundary;




import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Kenneth
 */
public class EditWidgetForm extends javax.swing.JFrame {

    /**
     * Creates new form editWidgetForm
     */
    public EditWidgetForm() {
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

        jFrame1 = new javax.swing.JFrame();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jEditName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jEditDesc = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jEditCost = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jEditPrice = new javax.swing.JTextField();
        jEditQuant = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jSave = new javax.swing.JButton();
        jLeave = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jStatus = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSearchWidget = new javax.swing.JButton();
        jDesiredWidget = new javax.swing.JTextField();
        jCancelSearch = new javax.swing.JButton();

        jFrame1.addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                jFrame1WindowOpened(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Widget Information");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Name:");

        jEditName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jEditName.setText("jTextField2");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Description:");

        jEditDesc.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jEditDesc.setText("jTextField3");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Unit Cost: $");

        jEditCost.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jEditCost.setText("jTextField4");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Unit Price: $");

        jEditPrice.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jEditPrice.setText("jTextField5");

        jEditQuant.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jEditQuant.setText("jTextField6");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Quantity:");

        jSave.setText("Save");
        jSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jSaveMouseReleased(evt);
            }
        });

        jLeave.setText("Cancel");
        jLeave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jLeaveMouseReleased(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel9.setText("Status:");

        jStatus.setEditable(false);
        jStatus.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jStatus.setForeground(new java.awt.Color(0, 204, 0));
        jStatus.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jStatus.setText("jTextField7");

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel5)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jEditQuant, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                    .addComponent(jEditCost)
                    .addComponent(jEditPrice))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLeave, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE))
                .addGap(83, 83, 83))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jFrame1Layout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jEditDesc, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                        .addComponent(jEditName)))
                .addGap(147, 147, 147))
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jFrame1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jEditName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jEditDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jEditCost, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jEditPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSave, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jEditQuant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(jLeave, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Edit Widget Information");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Search the desired widget to edit");

        jSearchWidget.setText("Search");
        jSearchWidget.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jSearchWidgetMouseReleased(evt);
            }
        });

        jDesiredWidget.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jDesiredWidget.setText("jTextField1");
        jDesiredWidget.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jDesiredWidgetActionPerformed(evt);
            }
        });

        jCancelSearch.setText("Cancel");
        jCancelSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jCancelSearchMouseReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(221, 221, 221)
                        .addComponent(jDesiredWidget, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(229, 229, 229)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jSearchWidget, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jCancelSearch, javax.swing.GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE))))
                .addContainerGap(171, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(1, 1, 1)
                .addComponent(jDesiredWidget, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSearchWidget)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jCancelSearch)
                .addContainerGap(272, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jSearchWidgetMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSearchWidgetMouseReleased
        // TODO add your handling code here:
        // TODO add your handling code here:
        String driver = "org.apache.derby.jdbc.EmbeddedDriver";
        String dbName = "//localhost:1527/ardatabase;";
        String connectionURL = "jdbc:derby:" + dbName;
        Connection conn = null;
        boolean found = false;
        try
        {
            Class.forName(driver);
        }catch(ClassNotFoundException e){System.out.println(e);}
        
        try
        {
            conn = DriverManager.getConnection(connectionURL);
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            
            ResultSet rs = stmt.executeQuery("Select * From APP.WIDGET");
            
            while(rs.next())
            {
                if(jDesiredWidget.getText().equalsIgnoreCase(rs.getString("NAME")))
                {
                    jEditName.setText(rs.getString("NAME"));
                    jEditDesc.setText(rs.getString("DESCRIPTION"));
                    jEditCost.setText(rs.getString("COST"));
                    jEditPrice.setText(rs.getString("PRICE"));
                    jEditQuant.setText(rs.getString("QUANTITY"));
                    jFrame1.setVisible(true);
                    found=true;
                }
            }
            if(found==false)
            {
                jDesiredWidget.setText("NO MATCH FOUND!");
            }
            stmt.close();
            rs.close();
         }catch(SQLException e){System.err.print(e);}
        
    }//GEN-LAST:event_jSearchWidgetMouseReleased

    private void jDesiredWidgetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jDesiredWidgetActionPerformed
        // TODO add your handling code here:
        jDesiredWidget.getText();

    }//GEN-LAST:event_jDesiredWidgetActionPerformed

    private void jCancelSearchMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCancelSearchMouseReleased
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jCancelSearchMouseReleased

    private void jSaveMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSaveMouseReleased
        // TODO add your handling code here:
        String driver = "org.apache.derby.jdbc.EmbeddedDriver";
        String dbName = "//localhost:1527/ardatabase;";
        String connectionURL = "jdbc:derby:" + dbName;
        Connection conn = null;
        boolean found = false;
        try
        {
            Integer.parseInt(jEditQuant.getText());
            Double.parseDouble(jEditCost.getText());
            Double.parseDouble(jEditPrice.getText());
        }catch(NumberFormatException e){System.out.println(e);}

        try
        {
            Class.forName(driver);
        }catch(ClassNotFoundException e){System.out.println(e);}
        
        try
        {
            conn = DriverManager.getConnection(connectionURL);
            Statement stmt = conn.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_UPDATABLE);
            
            ResultSet rs = stmt.executeQuery("Select * From APP.WIDGET");
            
            while(rs.next())
            {
                if(jDesiredWidget.getText().equalsIgnoreCase(rs.getString("NAME")))
                {
                    rs.updateString("NAME", jEditName.getText());
                    rs.updateString("DESCRIPTION", jEditDesc.getText());
                    rs.updateString("COST", jEditCost.getText());
                    rs.updateString("PRICE", jEditPrice.getText());
                    rs.updateString("QUANTITY", jEditQuant.getText());
                    rs.updateRow();
                    found = true;
                    jStatus.setText("SUCCESS!");
                }
            }
            if(found==false){
                jDesiredWidget.setText("No Match Found!");
            }
            stmt.close();
            rs.close();
            
            
        }catch(SQLException e){System.err.print(e);}
    }//GEN-LAST:event_jSaveMouseReleased

    private void jLeaveMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLeaveMouseReleased
        // TODO add your handling code here:
        jFrame1.dispose();
    }//GEN-LAST:event_jLeaveMouseReleased

    private void jFrame1WindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_jFrame1WindowOpened
        // TODO add your handling code here:
        jFrame1.setSize(510,370);
        jFrame1.setLocation(80,200);
        jStatus.setText("");
    }//GEN-LAST:event_jFrame1WindowOpened

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        jDesiredWidget.setText("");
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(EditWidgetForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditWidgetForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditWidgetForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditWidgetForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditWidgetForm().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jCancelSearch;
    private javax.swing.JTextField jDesiredWidget;
    private javax.swing.JTextField jEditCost;
    private javax.swing.JTextField jEditDesc;
    private javax.swing.JTextField jEditName;
    private javax.swing.JTextField jEditPrice;
    private javax.swing.JTextField jEditQuant;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton jLeave;
    private javax.swing.JButton jSave;
    private javax.swing.JButton jSearchWidget;
    private javax.swing.JTextField jStatus;
    // End of variables declaration//GEN-END:variables
}
