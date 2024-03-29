/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package i2putility.subScreens;

import java.awt.Color;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.BorderFactory;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;
import javax.swing.JPanel;
import i2putility.components.RoundedPanel;
/**
 *
 * @author Alee
 */
public class SecondLevelDeployment extends javax.swing.JInternalFrame {

    Color DefaultColor,HoveredColor; 
    public SecondLevelDeployment() {
        initComponents();
        this.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
        
        DefaultColor=new Color(54,70,78);
        HoveredColor = new Color(240,151,70);
        
        backupBuilds.setBackground(DefaultColor);
        deleteBackup.setBackground(DefaultColor);
        deployBackend.setBackground(DefaultColor);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        deployBackend = new RoundedPanel(50);
        stopTomcat2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        backupBuilds = new RoundedPanel(50);
        stopTomcat1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        deleteBackup = new RoundedPanel(50);
        stopTomcat = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        deployFrontend = new RoundedPanel(50);
        stopTomcat3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        deployPrint = new RoundedPanel(50);
        stopTomcat4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        deploymentLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(770, 510));

        deployBackend.setBackground(new java.awt.Color(54, 70, 78));
        deployBackend.setPreferredSize(new java.awt.Dimension(129, 129));
        deployBackend.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                deployBackendMouseMoved(evt);
            }
        });
        deployBackend.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deployBackendMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deployBackendMouseExited(evt);
            }
        });

        stopTomcat2.setBackground(new java.awt.Color(54, 70, 78));
        stopTomcat2.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        stopTomcat2.setForeground(new java.awt.Color(255, 255, 255));
        stopTomcat2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stopTomcat2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/deployment/icons8-backend-80.png"))); // NOI18N
        stopTomcat2.setPreferredSize(new java.awt.Dimension(129, 129));

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Deploy Backend");

        javax.swing.GroupLayout deployBackendLayout = new javax.swing.GroupLayout(deployBackend);
        deployBackend.setLayout(deployBackendLayout);
        deployBackendLayout.setHorizontalGroup(
            deployBackendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deployBackendLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(deployBackendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(deployBackendLayout.createSequentialGroup()
                        .addGap(13, 13, 13)
                        .addComponent(stopTomcat2, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 16, Short.MAX_VALUE)))
                .addContainerGap())
        );
        deployBackendLayout.setVerticalGroup(
            deployBackendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deployBackendLayout.createSequentialGroup()
                .addComponent(stopTomcat2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addContainerGap())
        );

        backupBuilds.setBackground(new java.awt.Color(54, 70, 78));
        backupBuilds.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                backupBuildsMouseMoved(evt);
            }
        });
        backupBuilds.addMouseWheelListener(new java.awt.event.MouseWheelListener() {
            public void mouseWheelMoved(java.awt.event.MouseWheelEvent evt) {
                backupBuildsMouseWheelMoved(evt);
            }
        });
        backupBuilds.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                backupBuildsMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                backupBuildsMouseExited(evt);
            }
        });

        stopTomcat1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stopTomcat1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/deployment/icons8-folder-80.png"))); // NOI18N
        stopTomcat1.setPreferredSize(new java.awt.Dimension(129, 129));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Backup Builds");

        javax.swing.GroupLayout backupBuildsLayout = new javax.swing.GroupLayout(backupBuilds);
        backupBuilds.setLayout(backupBuildsLayout);
        backupBuildsLayout.setHorizontalGroup(
            backupBuildsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backupBuildsLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(backupBuildsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(backupBuildsLayout.createSequentialGroup()
                        .addComponent(stopTomcat1, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 12, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        backupBuildsLayout.setVerticalGroup(
            backupBuildsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backupBuildsLayout.createSequentialGroup()
                .addComponent(stopTomcat1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addContainerGap())
        );

        deleteBackup.setBackground(new java.awt.Color(54, 70, 78));
        deleteBackup.setPreferredSize(new java.awt.Dimension(129, 129));
        deleteBackup.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                deleteBackupMouseMoved(evt);
            }
        });
        deleteBackup.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deleteBackupMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deleteBackupMouseExited(evt);
            }
        });

        stopTomcat.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stopTomcat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/deployment/icons8-delete-folder-80.png"))); // NOI18N
        stopTomcat.setPreferredSize(new java.awt.Dimension(129, 129));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Delete previous build");

        javax.swing.GroupLayout deleteBackupLayout = new javax.swing.GroupLayout(deleteBackup);
        deleteBackup.setLayout(deleteBackupLayout);
        deleteBackupLayout.setHorizontalGroup(
            deleteBackupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteBackupLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(stopTomcat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
        );
        deleteBackupLayout.setVerticalGroup(
            deleteBackupLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deleteBackupLayout.createSequentialGroup()
                .addComponent(stopTomcat, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addContainerGap())
        );

        deployFrontend.setBackground(new java.awt.Color(54, 70, 78));
        deployFrontend.setPreferredSize(new java.awt.Dimension(129, 129));
        deployFrontend.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                deployFrontendMouseMoved(evt);
            }
        });
        deployFrontend.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deployFrontendMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deployFrontendMouseExited(evt);
            }
        });

        stopTomcat3.setBackground(new java.awt.Color(54, 70, 78));
        stopTomcat3.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        stopTomcat3.setForeground(new java.awt.Color(255, 255, 255));
        stopTomcat3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stopTomcat3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/deployment/icons8-layout-80.png"))); // NOI18N
        stopTomcat3.setPreferredSize(new java.awt.Dimension(129, 129));

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Deploy Frontend");

        javax.swing.GroupLayout deployFrontendLayout = new javax.swing.GroupLayout(deployFrontend);
        deployFrontend.setLayout(deployFrontendLayout);
        deployFrontendLayout.setHorizontalGroup(
            deployFrontendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deployFrontendLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(deployFrontendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deployFrontendLayout.createSequentialGroup()
                        .addGap(0, 10, Short.MAX_VALUE)
                        .addComponent(stopTomcat3, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(19, 19, 19))))
        );
        deployFrontendLayout.setVerticalGroup(
            deployFrontendLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deployFrontendLayout.createSequentialGroup()
                .addComponent(stopTomcat3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addContainerGap())
        );

        deployPrint.setBackground(new java.awt.Color(54, 70, 78));
        deployPrint.setPreferredSize(new java.awt.Dimension(129, 129));
        deployPrint.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                deployPrintMouseMoved(evt);
            }
        });
        deployPrint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deployPrintMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                deployPrintMouseExited(evt);
            }
        });

        stopTomcat4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        stopTomcat4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/deployment/icons8-print-80.png"))); // NOI18N
        stopTomcat4.setPreferredSize(new java.awt.Dimension(129, 129));

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Deploy Print");

        javax.swing.GroupLayout deployPrintLayout = new javax.swing.GroupLayout(deployPrint);
        deployPrint.setLayout(deployPrintLayout);
        deployPrintLayout.setHorizontalGroup(
            deployPrintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deployPrintLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(deployPrintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, deployPrintLayout.createSequentialGroup()
                        .addGap(0, 14, Short.MAX_VALUE)
                        .addComponent(stopTomcat4, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))))
        );
        deployPrintLayout.setVerticalGroup(
            deployPrintLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(deployPrintLayout.createSequentialGroup()
                .addComponent(stopTomcat4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                .addContainerGap())
        );

        deploymentLabel.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        deploymentLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(backupBuilds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(deleteBackup, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addComponent(deployBackend, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(142, 142, 142)
                        .addComponent(deployPrint, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130)
                        .addComponent(deployFrontend, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addComponent(deploymentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 522, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deployBackend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteBackup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(backupBuilds, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(85, 85, 85)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(deployPrint, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deployFrontend, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addComponent(deploymentLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void backupBuildsMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backupBuildsMouseMoved
        backupBuilds.setBackground(HoveredColor);
    }//GEN-LAST:event_backupBuildsMouseMoved

    private void backupBuildsMouseWheelMoved(java.awt.event.MouseWheelEvent evt) {//GEN-FIRST:event_backupBuildsMouseWheelMoved
        // TODO add your handling code here:
    }//GEN-LAST:event_backupBuildsMouseWheelMoved

    private void backupBuildsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backupBuildsMouseExited
        backupBuilds.setBackground(DefaultColor);
    }//GEN-LAST:event_backupBuildsMouseExited

    private void deleteBackupMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteBackupMouseMoved
        deleteBackup.setBackground(HoveredColor);
    }//GEN-LAST:event_deleteBackupMouseMoved

    private void deleteBackupMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteBackupMouseExited
        deleteBackup.setBackground(DefaultColor);
    }//GEN-LAST:event_deleteBackupMouseExited

    private void deployBackendMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deployBackendMouseExited
        deployBackend.setBackground(DefaultColor);
    }//GEN-LAST:event_deployBackendMouseExited

    private void deployBackendMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deployBackendMouseMoved
       deployBackend.setBackground(HoveredColor);
    }//GEN-LAST:event_deployBackendMouseMoved

    private void backupBuildsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_backupBuildsMouseClicked
       try{
           createBackupOfBuilds();
       }
       catch(Exception ex){
           Logger.getLogger(SecondLevelDeployment.class.getName()).log(Level.SEVERE, null, ex);
       }
    }//GEN-LAST:event_backupBuildsMouseClicked

    private void deleteBackupMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deleteBackupMouseClicked
        try{
            deletefilesOrDirectory();
        }
        catch(Exception ex){
            Logger.getLogger(SecondLevelDeployment.class.getName()).log(Level.SEVERE,null,ex);
        }
    }//GEN-LAST:event_deleteBackupMouseClicked

    private void deployBackendMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deployBackendMouseClicked
      try{
           deployBackendOrPrint();
       }
       catch(Exception ex){
           Logger.getLogger(SecondLevelDeployment.class.getName()).log(Level.SEVERE, null, ex);
       }
    }//GEN-LAST:event_deployBackendMouseClicked

    private void deployPrintMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deployPrintMouseMoved
        deployPrint.setBackground(HoveredColor);
    }//GEN-LAST:event_deployPrintMouseMoved

    private void deployFrontendMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deployFrontendMouseMoved
        deployFrontend.setBackground(HoveredColor);
    }//GEN-LAST:event_deployFrontendMouseMoved

    private void deployFrontendMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deployFrontendMouseExited
        deployFrontend.setBackground(DefaultColor);
    }//GEN-LAST:event_deployFrontendMouseExited

    private void deployPrintMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deployPrintMouseExited
        deployPrint.setBackground(DefaultColor);
    }//GEN-LAST:event_deployPrintMouseExited

    private void deployPrintMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deployPrintMouseClicked
       try{
           deployBackendOrPrint();
       }
       catch(Exception ex){
           Logger.getLogger(SecondLevelDeployment.class.getName()).log(Level.SEVERE, null, ex);
       } 
    }//GEN-LAST:event_deployPrintMouseClicked

    private void deployFrontendMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deployFrontendMouseClicked
        
        final JFileChooser fc = new JFileChooser();
        fc.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int returnValue = fc.showOpenDialog(new JPanel());

        if (returnValue == JFileChooser.APPROVE_OPTION) {
        File selectedfile = fc.getSelectedFile();
        String destDir = "C:\\I2p\\apache-tomcat-9.0.52\\webapps\\ROOT";  
            try {
                unzip(selectedfile, destDir);
                deploymentLabel.setText("Zip file extracted successfully.");
            } catch (IOException e) {
                deploymentLabel.setText(e.getMessage());
            }
        }
    }//GEN-LAST:event_deployFrontendMouseClicked
    
    private Boolean createBackupOfBuilds( )throws Exception{
        JFileChooser fileChooser = new JFileChooser("C:\\I2p\\apache-tomcat-9.0.52\\webapps");
        fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        fileChooser.setMultiSelectionEnabled(true);
        
        int selection = fileChooser.showOpenDialog(null);
        if (selection == JFileChooser.APPROVE_OPTION) {
            File[] selectedFiles = fileChooser.getSelectedFiles();
            File destinationDir = null;
                Boolean output = createDirectory("C:\\I2p\\apache-tomcat-9.0.52" , "oldBuilds");
                if(output){
                    destinationDir = new File("C:\\I2p\\apache-tomcat-9.0.52\\oldBuilds");
                }
                for (File file : selectedFiles) {
                    try {
                        copyFile(file, new File(destinationDir, file.getName()));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                deploymentLabel.setText("Files copied successfully.");
        }
        return true;
    }
    
    private Boolean createDirectory(String parentDirectory , String directoryName){
        File directory = new File(parentDirectory, directoryName);
        Boolean output = false;
        if (!directory.exists()) {
            boolean created = directory.mkdir();

            if (created) {
                deploymentLabel.setText("Directory created successfully.");
                output = true;
            } else {
                deploymentLabel.setText("Failed to create the directory.");
                output = false;
            }
        } else {
            deploymentLabel.setText("Directory already exists.");
            output = true;
        } 
        return output;
    }
    
    private static void copyFile(File sourceFile, File destFile) throws IOException {
        if (sourceFile.isDirectory()) {
            if (!destFile.exists()) {
                destFile.mkdir();
            }
            
            String[] files = sourceFile.list();
            
            for (String file : files) {
                File srcFile = new File(sourceFile, file);
                File newDestFile = new File(destFile, file);
                copyFile(srcFile, newDestFile);
            }
        } else {
            Files.copy(sourceFile.toPath(), destFile.toPath(), StandardCopyOption.REPLACE_EXISTING);
        }
    }
    
    private void deployBackendOrPrint()throws Exception{
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
        fileChooser.setMultiSelectionEnabled(false);
        
        int selection = fileChooser.showOpenDialog(null);
        if (selection == JFileChooser.APPROVE_OPTION) {
            File source = fileChooser.getSelectedFile();
            File destinationDir = new File("C:\\I2p\\apache-tomcat-9.0.52\\webapps");
                    try {
                        copyFile(source, new File(destinationDir, source.getName()));
                    } catch (IOException e) {
                        e.printStackTrace();
                    }                
                deploymentLabel.setText("File copied successfully.");
        }
    }
    private Boolean deletefilesOrDirectory(){
        JFileChooser fileChooser = new JFileChooser("C:\\I2p\\apache-tomcat-9.0.52\\webapps\\");
        fileChooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
        fileChooser.setMultiSelectionEnabled(true);
        int selection = fileChooser.showOpenDialog(null);
        if (selection == JFileChooser.APPROVE_OPTION) {
            File[] selectedFiles = fileChooser.getSelectedFiles();        
            
            int result = JOptionPane.showConfirmDialog(null,"Sure? You want to delete?", "Confirmation Box",
               JOptionPane.YES_NO_OPTION,
               JOptionPane.QUESTION_MESSAGE);
            if(result == JOptionPane.YES_OPTION){
               for (File file : selectedFiles) {
                    try {
                        Files.delete(file.toPath());
                    } catch (IOException ex) {
                        Logger.getLogger(SecondLevelDeployment.class.getName()).log(Level.SEVERE, null, ex);
                    }     
                }
               deploymentLabel.setText("Files Deleted Successfully");
            }
        }
        return true;
    }
    
    public static void unzip(File zipFile, String destDirectory) throws IOException {
        File destDir = new File(destDirectory);
        if (!destDir.exists()) {
            destDir.mkdir();
        }
        ZipInputStream zipIn = new ZipInputStream(new FileInputStream(zipFile));
        ZipEntry entry = zipIn.getNextEntry();
        while (entry != null) {
            String filePath = destDirectory + File.separator + entry.getName();
            if (!entry.isDirectory()) {
                // If the entry is a file, extract it
                extractFile(zipIn, filePath);
            } else {
                // If the entry is a directory, create the directory
                File dir = new File(filePath);
                dir.mkdir();
            }
            zipIn.closeEntry();
            entry = zipIn.getNextEntry();
        }
    }
    
    public static void extractFile(ZipInputStream zipIn, String filePath) throws IOException {
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(filePath));
        byte[] buffer = new byte[1024];
        int bytesRead;
        while ((bytesRead = zipIn.read(buffer)) != -1) {
            bos.write(buffer, 0, bytesRead);
        }
        bos.close();
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel backupBuilds;
    private javax.swing.JPanel deleteBackup;
    private javax.swing.JPanel deployBackend;
    private javax.swing.JPanel deployFrontend;
    private javax.swing.JPanel deployPrint;
    private javax.swing.JLabel deploymentLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel stopTomcat;
    private javax.swing.JLabel stopTomcat1;
    private javax.swing.JLabel stopTomcat2;
    private javax.swing.JLabel stopTomcat3;
    private javax.swing.JLabel stopTomcat4;
    // End of variables declaration//GEN-END:variables
}
