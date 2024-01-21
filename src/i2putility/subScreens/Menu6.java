/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package i2putility.subScreens;

import java.awt.Color;
import java.awt.GridLayout;
import java.util.List;
import java.io.IOException;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameUI;

/**
 *
 * @author Alee
 */
public class Menu6 extends javax.swing.JInternalFrame {

    Color DefaultColor,HoveredColor;
    private int rows = 4;
    private int cols = 4;
    public Menu6() {
        initComponents();
        this.setBorder(BorderFactory.createEmptyBorder(0,0,0,0));
        BasicInternalFrameUI ui = (BasicInternalFrameUI)this.getUI();
        ui.setNorthPane(null);
        
        List<String> content = getPrinterNames();
        this.setLayout(new GridLayout(rows, cols));
        generateGrid(content);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(770, 510));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 754, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 480, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
 
private static List<String> getPrinterNames() {
    PrintService[] services = PrintServiceLookup.lookupPrintServices(null, null);
    List<String> content = new ArrayList<>();
    if (services.length != 0 || services != null) {
        int i = 0;
        for (PrintService service : services) {
            content.add(service.getName());
            i++;
        }
    }
    return content;
}


private void generateGrid(List<String> content) {
    int totalLabels = rows * cols;
    for (int index = 0; index < totalLabels; index++) {
        if (index < content.size()) {
            String printerName = content.get(index);
            JLabel label = new JLabel(content.get(index));
            label.setIcon(new ImageIcon(getClass().getResource("/Icons/printer/icons8-printer-50.png")));
//            label.addMouseListener(new MouseAdapter() {
//               public void mousePressed(MouseEvent e) {
//                    try {
//                        String osName = System.getProperty("os.name").toLowerCase();
//                        if (osName.contains("windows")) {
//                            ProcessBuilder processBuilder = new ProcessBuilder("rundll32 printui.dll,PrintUIEntry /p /n \"" + printerName + "\"");
//                            processBuilder.start();
//                        }  else {
//                            // Handle other platforms or unsupported operations here
//                            JOptionPane.showMessageDialog(null, "Printer properties not supported on this platform.");
//                        }
//                    } catch (IOException ex) {
//                        ex.printStackTrace();
//                    }
//                }
//            });
            this.add(label);
        } else {
            JLabel emptyLabel = new JLabel();
            this.add(emptyLabel);
        }
    }
}



 
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
