/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package i2putility.subScreens;

import java.awt.Color;
import java.io.BufferedReader;
import java.io.File;
import i2putility.components.RoundedPanel;
import java.awt.Desktop;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.SwingUtilities;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author Alee
 */
public class Menu1 extends javax.swing.JInternalFrame {

    Color DefaultColor,HoveredColor; 
    public Menu1() {
        initComponents();
        this.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
        
        DefaultColor=new Color(54,70,78);
        HoveredColor = new Color(240,151,70);

        start.setBackground(DefaultColor);
        status.setBackground(DefaultColor);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        status = new RoundedPanel(50);
        stopTomcat2 = new javax.swing.JLabel();
        start = new RoundedPanel(50);
        stopTomcat = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tomcatStatusLabel = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(770, 510));

        status.setBackground(new java.awt.Color(54, 70, 78));
        status.setPreferredSize(new java.awt.Dimension(129, 129));
        status.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                statusMouseMoved(evt);
            }
        });
        status.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                statusMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                statusMouseExited(evt);
            }
        });

        stopTomcat2.setBackground(new java.awt.Color(54, 70, 78));
        stopTomcat2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        stopTomcat2.setForeground(new java.awt.Color(255, 255, 255));
        stopTomcat2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stopTomcat2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-status-50.png"))); // NOI18N
        stopTomcat2.setText("Status");
        stopTomcat2.setPreferredSize(new java.awt.Dimension(129, 129));

        javax.swing.GroupLayout statusLayout = new javax.swing.GroupLayout(status);
        status.setLayout(statusLayout);
        statusLayout.setHorizontalGroup(
            statusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(statusLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(stopTomcat2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        statusLayout.setVerticalGroup(
            statusLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, statusLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(stopTomcat2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        start.setBackground(new java.awt.Color(54, 70, 78));
        start.setPreferredSize(new java.awt.Dimension(129, 129));
        start.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                startMouseMoved(evt);
            }
        });
        start.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                startMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                startMouseExited(evt);
            }
        });

        stopTomcat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stopTomcat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/icons8-start-50.png"))); // NOI18N
        stopTomcat.setPreferredSize(new java.awt.Dimension(129, 129));

        javax.swing.GroupLayout startLayout = new javax.swing.GroupLayout(start);
        start.setLayout(startLayout);
        startLayout.setHorizontalGroup(
            startLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, startLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(stopTomcat, javax.swing.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                .addContainerGap())
        );
        startLayout.setVerticalGroup(
            startLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, startLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(stopTomcat, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        tomcatStatusLabel.setEditable(false);
        tomcatStatusLabel.setBackground(new java.awt.Color(240, 240, 240));
        tomcatStatusLabel.setColumns(20);
        tomcatStatusLabel.setRows(5);
        jScrollPane1.setViewportView(tomcatStatusLabel);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(169, 169, 169)
                        .addComponent(start, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(status, javax.swing.GroupLayout.DEFAULT_SIZE, 217, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(138, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 481, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(135, 135, 135))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(76, 76, 76)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(start, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 109, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startMouseMoved
        start.setBackground(HoveredColor);
    }//GEN-LAST:event_startMouseMoved

    private void startMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startMouseExited
        start.setBackground(DefaultColor);
    }//GEN-LAST:event_startMouseExited

    private void statusMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_statusMouseExited
        status.setBackground(DefaultColor);
    }//GEN-LAST:event_statusMouseExited

    private void statusMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_statusMouseMoved
       status.setBackground(HoveredColor);
    }//GEN-LAST:event_statusMouseMoved

    private void startMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_startMouseClicked
        try {
            File tomcat = new File("C:\\I2p\\apache-tomcat-9.0.52\\bin\\tomcat9w.exe");
            if(tomcat.exists()){
                this.openTomcat(tomcat);
            }
            else{
                tomcatStatusLabel.setText("Tomcat9 not located in the system");
            }
            } catch (Exception ex) {
                Logger.getLogger(Menu1.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_startMouseClicked

    private void statusMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_statusMouseClicked
            try {
                this.CheckTomcateStatus();
            } catch (Exception ex) {
                Logger.getLogger(Menu1.class.getName()).log(Level.SEVERE, null, ex);
            }
    }//GEN-LAST:event_statusMouseClicked
    private void openTomcat(File file) {
        try {
            // Check if Desktop is supported on the current platform
            if (Desktop.isDesktopSupported()) {
                Desktop desktop = Desktop.getDesktop();
                if(file.getName().contains("tomcat9w.exe")){
                    desktop.open(file);
                }
            } else {
                tomcatStatusLabel.setText("Desktop is not supported on this platform.");
            }
        } catch (IOException e) {
            tomcatStatusLabel.setText("An error occurred while opening the file: " + e.getMessage());
        }
     }
    
    private Boolean stopTomcat(String directoryPath, String fileName)throws Exception{
        String command = "cmd /c " + fileName;
        Process process = Runtime.getRuntime().exec(command, null, new File(directoryPath));
    int exitCode = process.waitFor();
    if(exitCode == 0){
        tomcatStatusLabel.setForeground(Color.GREEN);
        tomcatStatusLabel.setText("Command Executed Successfully");
       return true;
    }
    else{
        tomcatStatusLabel.setForeground(Color.RED);
        InputStream stderr = process.getErrorStream();
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(stderr))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String finalLine = line;
                SwingUtilities.invokeLater(() -> tomcatStatusLabel.setText(finalLine + "\n"));
            }
            return false;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
        return true;
    }
    
    private void CheckTomcateStatus()throws Exception{
            Process process = Runtime.getRuntime().exec("cmd /c sc query Tomcat9");
            BufferedReader reader = new BufferedReader(new InputStreamReader(process.getInputStream()));
            String line;
            String status = "";
            while ((line = reader.readLine()) != null) {
                if (line.contains("STATE")) {
                    status = line.substring(line.indexOf(":") + 2);
                    break;
                }
            }
            if (status.contains("RUNNING")) {
                System.out.println(status);
                tomcatStatusLabel.setForeground(Color.GREEN);
                tomcatStatusLabel.setText("Tomcat Running");
                
            } else {
                tomcatStatusLabel.setForeground(Color.RED);
                tomcatStatusLabel.setText("Tomcat Stopped");
                
            }
    } 
        
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel start;
    private javax.swing.JPanel status;
    private javax.swing.JLabel stopTomcat;
    private javax.swing.JLabel stopTomcat2;
    private javax.swing.JTextArea tomcatStatusLabel;
    // End of variables declaration//GEN-END:variables
}