/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package i2putility.subScreens;

import i2putility.components.Database;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import i2putility.components.RoundedPanel;
import javax.swing.JOptionPane;
/**
 *
 * @author Alee
 */
public class Menu7 extends javax.swing.JInternalFrame {

    Color DefaultColor,HoveredColor;
    private int rows = 4;
    private int cols = 4;
    public Menu7() {
        initComponents();
        this.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
        
        DefaultColor=new Color(54,70,78);
        HoveredColor = new Color(240,151,70);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new RoundedPanel(50);
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        setttings = new RoundedPanel(50);
        jLabel4 = new javax.swing.JLabel();
        resetPasswordLabel = new javax.swing.JLabel();
        DatabaseLogger = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(770, 510));

        jPanel1.setBackground(new java.awt.Color(54, 70, 78));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/account.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Admin");

        setttings.setBackground(new java.awt.Color(204, 204, 204));
        setttings.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                setttingsMouseMoved(evt);
            }
        });
        setttings.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                setttingsMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                setttingsMouseExited(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-setting-23.png"))); // NOI18N

        resetPasswordLabel.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        resetPasswordLabel.setForeground(new java.awt.Color(54, 70, 78));
        resetPasswordLabel.setText("Reset Password");

        javax.swing.GroupLayout setttingsLayout = new javax.swing.GroupLayout(setttings);
        setttings.setLayout(setttingsLayout);
        setttingsLayout.setHorizontalGroup(
            setttingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, setttingsLayout.createSequentialGroup()
                .addContainerGap(13, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(resetPasswordLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        setttingsLayout.setVerticalGroup(
            setttingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(setttingsLayout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(setttingsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                    .addComponent(resetPasswordLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(setttings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(setttings, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47))
        );

        DatabaseLogger.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DatabaseLogger, javax.swing.GroupLayout.PREFERRED_SIZE, 363, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(199, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, Short.MAX_VALUE)
                .addComponent(DatabaseLogger, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void setttingsMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setttingsMouseMoved
        setttings.setBackground(HoveredColor);
        resetPasswordLabel.setForeground(Color.WHITE);
    }//GEN-LAST:event_setttingsMouseMoved

    private void setttingsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setttingsMouseExited
        setttings.setBackground(Color.GRAY);
        resetPasswordLabel.setForeground(DefaultColor);
    }//GEN-LAST:event_setttingsMouseExited

    private void setttingsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_setttingsMouseClicked
        this.resetAdminPassword();
    }//GEN-LAST:event_setttingsMouseClicked
 
    private void resetAdminPassword(){
        String pgUser = JOptionPane.showInputDialog("Enter PG User:");
        String pgPassword = JOptionPane.showInputDialog("Enter PG Password:");
        String pgdb = JOptionPane.showInputDialog("Enter Database Name:");
        
        if(pgPassword.length() > 0 && pgdb.length() > 0 && pgUser.length() > 0){
            Database database = new Database();
            Boolean connection = database.connect(pgdb, pgUser, pgPassword);
            if(connection){
                Boolean updated = database.updateUserPassword("admin", "GU3/9L0jZ7qrygzV3NSAFw==");
                if(updated){
                    DatabaseLogger.setForeground(Color.GREEN);
                    DatabaseLogger.setText("Connection Success and Password Updated Successfully");                    
                }
                else{
                    DatabaseLogger.setForeground(Color.RED);
                    DatabaseLogger.setText("Connection Success but Error Updatating Password");                      
                }
            }
            else{
                DatabaseLogger.setForeground(Color.RED);
                DatabaseLogger.setText("Database connection Error ");
            }
        }
        else{
            DatabaseLogger.setForeground(Color.RED);
            DatabaseLogger.setText("Credential Error");
            
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel DatabaseLogger;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel resetPasswordLabel;
    private javax.swing.JPanel setttings;
    // End of variables declaration//GEN-END:variables
}
