/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imageprocessor;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.awt.image.ColorModel;
import java.awt.image.WritableRaster;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JFileChooser;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author cstuser
 */
public class ImageProcessorWindow extends javax.swing.JFrame {

    /**
     * Creates new form ImageProcessorWindow
     */
    public ImageProcessorWindow() {
        initComponents();
        inputImagePanel.setImage("images/no-image.png");
        outputImagePanel.setImage("images/no-image.png");
        boxBlurSlider.setValue(0);

    }

    /**
     * This method is called from within the constructor to initialize the form. WARNING: Do NOT modify this code. The content of this method is always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        checkbox1 = new java.awt.Checkbox();
        boxFilterCheck = new javax.swing.JCheckBox();
        openButton = new javax.swing.JButton();
        gammaCorrectionSlider = new javax.swing.JSlider();
        applyButton = new javax.swing.JButton();
        textLabel1 = new javax.swing.JLabel();
        textLabel2 = new javax.swing.JLabel();
        greyScale = new javax.swing.JCheckBox();
        inputImagePanel = new imageprocessor.ImagePanel();
        outputImagePanel = new imageprocessor.ImagePanel();
        edgeDetectionFilterLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        edgeCheck = new javax.swing.JCheckBox();
        gaussianFilterBox = new javax.swing.JCheckBox();
        saveButton = new javax.swing.JButton();
        processLabel = new javax.swing.JLabel();
        boxBlurSlider = new javax.swing.JSlider();
        jLabel3 = new javax.swing.JLabel();
        sharpenBox = new javax.swing.JCheckBox();
        jMenuBar1 = new javax.swing.JMenuBar();
        FileItem = new javax.swing.JMenu();
        OpenMenuItem = new javax.swing.JMenuItem();
        saveMenuItem = new javax.swing.JMenuItem();
        applyButtonItem = new javax.swing.JMenuItem();
        escapeMenuItem = new javax.swing.JMenuItem();

        checkbox1.setLabel("checkbox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        openButton.setText("Open");
        openButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openButtonActionPerformed(evt);
            }
        });

        gammaCorrectionSlider.setMaximum(1000);
        gammaCorrectionSlider.setMinimum(-1000);
        gammaCorrectionSlider.setValue(0);

        applyButton.setText("Apply");
        applyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyButtonActionPerformed(evt);
            }
        });

        textLabel1.setText("Gamma Correction:");

        textLabel2.setText("Convert to Grey Scale:");

        javax.swing.GroupLayout inputImagePanelLayout = new javax.swing.GroupLayout(inputImagePanel);
        inputImagePanel.setLayout(inputImagePanelLayout);
        inputImagePanelLayout.setHorizontalGroup(
            inputImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 197, Short.MAX_VALUE)
        );
        inputImagePanelLayout.setVerticalGroup(
            inputImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 135, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout outputImagePanelLayout = new javax.swing.GroupLayout(outputImagePanel);
        outputImagePanel.setLayout(outputImagePanelLayout);
        outputImagePanelLayout.setHorizontalGroup(
            outputImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        outputImagePanelLayout.setVerticalGroup(
            outputImagePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        edgeDetectionFilterLabel.setText("Edge Detection Filter:");

        jLabel1.setText("Gaussian Filter:");

        jLabel2.setText("Box Filter:");

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        processLabel.setText("No Image Loaded");

        jLabel3.setText("Sharpen:");

        FileItem.setText("File");

        OpenMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
        OpenMenuItem.setText("Open");
        OpenMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpenMenuItemActionPerformed(evt);
            }
        });
        FileItem.add(OpenMenuItem);

        saveMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        saveMenuItem.setText("Save");
        saveMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveMenuItemActionPerformed(evt);
            }
        });
        FileItem.add(saveMenuItem);

        applyButtonItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        applyButtonItem.setText("Apply");
        applyButtonItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyButtonItemActionPerformed(evt);
            }
        });
        FileItem.add(applyButtonItem);

        escapeMenuItem.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_ESCAPE, 0));
        escapeMenuItem.setText("Exit");
        escapeMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                escapeMenuItemActionPerformed(evt);
            }
        });
        FileItem.add(escapeMenuItem);

        jMenuBar1.add(FileItem);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(applyButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(openButton, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(5, 5, 5)
                                        .addComponent(inputImagePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(outputImagePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(saveButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(textLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(textLabel2)
                                            .addComponent(jLabel1)
                                            .addComponent(edgeDetectionFilterLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(0, 0, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(gaussianFilterBox)
                                    .addComponent(edgeCheck)
                                    .addComponent(greyScale)
                                    .addComponent(gammaCorrectionSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sharpenBox)
                                    .addComponent(boxBlurSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(10, 10, 10))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(processLabel)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(inputImagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(outputImagePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(openButton, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(processLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(sharpenBox))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(boxBlurSlider, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(gaussianFilterBox)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(edgeCheck)
                    .addComponent(edgeDetectionFilterLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(textLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gammaCorrectionSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(textLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(applyButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(greyScale))
                .addGap(9, 9, 9))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    File inputFile;
    File outputFile;
    BufferedImage img;
    BufferedImage output;
    boolean changes;

    /**
     * Action performed for open button
     *
     * @param evt
     */
    private void openButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openButtonActionPerformed
        try {
            openFileChooser();
        } catch (IOException ex) {
            Logger.getLogger(ImageProcessorWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_openButtonActionPerformed

    /**
     * Action performed for save button
     *
     * @param evt
     */
    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        try {
            if (!changes) {
                processLabel.setText("ERROR: IMAGE HAS NOT BEEN MODIFIED");
            } else {
                saveFile();
            }
        } catch (IOException ex) {
            Logger.getLogger(ImageProcessorWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void applyButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applyButtonActionPerformed

        output = imageCopy(img);
        changes = false;
        
        processLabel.setText("...");

        if (sharpenBox.isSelected()) {
            output = sharpen(output);
            changes = true;
        }

        //Box Blur implementation        
        if (boxBlurSlider.getValue() != 0) {
            output = boxBlurFliter(output, boxBlurSlider.getValue());
            changes = true;
        }


        //Gaussian filter implementation
        if (gaussianFilterBox.isSelected()) {
            output = gaussianFilter(output);
            changes = true;
        }

        //Edge detection Implementation
        if (edgeCheck.isSelected()) {
            output = edgeDetection(output);
            changes = true;
        }

        //Grey Scales implementation
        if (greyScale.isSelected()) {
            output = greyScales(output);
            changes = true;
        }

        outputImagePanel.setImage(output);
        processLabel.setText("IMAGE PROCESSED");

        //Implementation of gamma correction 
        gammaCorrection(output);
    }//GEN-LAST:event_applyButtonActionPerformed

    /**
     * Action performed for the open menu Item
     *
     * @param evt
     */
    private void OpenMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpenMenuItemActionPerformed
        try {
            openFileChooser();
        } catch (IOException ex) {
            Logger.getLogger(ImageProcessorWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_OpenMenuItemActionPerformed

    /**
     * Action performed for the exit menu Item
     *
     * @param evt
     */
    private void escapeMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_escapeMenuItemActionPerformed
        System.exit(0);
    }//GEN-LAST:event_escapeMenuItemActionPerformed

    /**
     * Action performed for the save menu Item
     *
     * @param evt
     */
    private void saveMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveMenuItemActionPerformed
        try {
            saveFile();
        } catch (IOException ex) {
            Logger.getLogger(ImageProcessorWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_saveMenuItemActionPerformed

    private void applyButtonItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applyButtonItemActionPerformed
        applyButtonActionPerformed(evt);
    }//GEN-LAST:event_applyButtonItemActionPerformed

    /**
     * Gamma correction method
     */
    private void gammaCorrection(BufferedImage imgo) {
        if (gammaCorrectionSlider.getValue() != 0) {
            try {
                BufferedImage img1 = imageCopy(imgo);
                float brightness;
                for (int i = 0; i < img1.getWidth(); ++i) {
                    for (int j = 0; j < img1.getHeight(); ++j) {
                        Color rgb = new Color(img1.getRGB(i, j));
                        float[] hsb = Color.RGBtoHSB(rgb.getRed(),
                                rgb.getGreen(),
                                rgb.getBlue(),
                                null);

                        float hue = hsb[0];
                        float saturation = hsb[1];
                        float brightnessTemp = hsb[2];

                        brightness = (float) Math.pow(brightnessTemp, ((1000.0 - gammaCorrectionSlider.getValue()) / 1000.0));
                        Color newColor = new Color(Color.HSBtoRGB(hue, saturation, brightness));
                        img1.setRGB(i, j, newColor.getRGB());
                        changes = true;
                    }
                }
                outputImagePanel.setImage(img1);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Method for grey scales
     *
     * @return BufferedImage
     */
    private BufferedImage greyScales(BufferedImage imgo) {
        for (int i = 0; i < imgo.getWidth(); ++i) {
            for (int j = 0; j < imgo.getHeight(); ++j) {
                Color color = new Color(imgo.getRGB(i, j));
                int newCol = ((color.getRed() + color.getBlue() + color.getGreen()) / 3);
                Color newColor = new Color(newCol, newCol, newCol);
                imgo.setRGB(i, j, newColor.getRGB());
            }
        }
        return imgo;
    }

    /**
     * Method for Gaussian Blur Filter
     *
     * @param imgo
     * @return
     */
    private BufferedImage gaussianFilter(BufferedImage imgo) {
        imgo = ImageProcessing.applyGaussianBlur(imgo);
        return imgo;
    }

    /**
     * Method for Box Blur Filter
     *
     * @param imgo
     * @param radius
     * @return
     */
    private BufferedImage boxBlurFliter(BufferedImage imgo, int radius) {
        imgo = ImageProcessing.applyBoxBlur(img, radius / 10);
        return imgo;
    }

    /**
     * Method to apply sharpen filter
     *
     * @param imgo
     * @return
     */
    private BufferedImage sharpen(BufferedImage imgo) {
        imgo = ImageProcessing.applySharpen(imgo);
        return imgo;
    }

    /**
     * Method for edge detection
     *
     * @return BufferedImage
     */
    private BufferedImage edgeDetection(BufferedImage imgo) {
        imgo = ImageProcessing.applyEdgeDetection(img);
        return imgo;
    }

    /**
     * Method to open file chooser and choose a file
     *
     * @throws IOException
     */
    private void openFileChooser() throws IOException {
        JFileChooser fc = new JFileChooser();
        fc.setDialogTitle("Select an image");
        fc.setCurrentDirectory(new File("images"));
        FileNameExtensionFilter fnef = new FileNameExtensionFilter("PNG & JPG Files", "jpg", "png", "jpeg", "bmp");
        fc.setFileFilter(fnef);
        int returnVal = fc.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            inputFile = fc.getSelectedFile();
            outputFile = inputFile;
            img = ImageIO.read(inputFile);
            inputImagePanel.setImage(inputFile.getAbsolutePath());
            outputImagePanel.setImage(outputFile.getAbsolutePath());
            boxBlurSlider.setValue(0);
            gammaCorrectionSlider.setValue(0);
            changes = false;
            processLabel.setText("IMAGE LOADED");
        } else {
            processLabel.setText("FILE ACCESS CANCELED BY USER");
        }
    }

    /**
     * Method to save a File
     *
     * @return void
     */
    private void saveFile() throws IOException {
        JFileChooser fc = new JFileChooser();
        fc.setDialogTitle("Save your Image");
        fc.setCurrentDirectory(new File("images"));
        int returnVal = fc.showSaveDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            ImageIO.write(output, "png", new File(fc.getSelectedFile().getAbsolutePath() + "_modified.png"));
            processLabel.setText("IMAGE SAVED");
        } else {
            processLabel.setText("FILE ACCESS CANCELED BY USER");

        }
        
    }

    /**
     * Method to clone a BufferedImage
     *
     * @param bi
     * @return BufferedImage
     */
    private BufferedImage imageCopy(BufferedImage bi) {
        ColorModel cm = bi.getColorModel();
        boolean isAlphaPremultiplied = cm.isAlphaPremultiplied();
        WritableRaster raster = bi.copyData(null);
        return new BufferedImage(cm, raster, isAlphaPremultiplied, null);
    }

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
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsClassicLookAndFeel");
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ImageProcessorWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ImageProcessorWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ImageProcessorWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ImageProcessorWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ImageProcessorWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu FileItem;
    private javax.swing.JMenuItem OpenMenuItem;
    private javax.swing.JButton applyButton;
    private javax.swing.JMenuItem applyButtonItem;
    private javax.swing.JSlider boxBlurSlider;
    private javax.swing.JCheckBox boxFilterCheck;
    private java.awt.Checkbox checkbox1;
    private javax.swing.JCheckBox edgeCheck;
    private javax.swing.JLabel edgeDetectionFilterLabel;
    private javax.swing.JMenuItem escapeMenuItem;
    private javax.swing.JSlider gammaCorrectionSlider;
    private javax.swing.JCheckBox gaussianFilterBox;
    private javax.swing.JCheckBox greyScale;
    private imageprocessor.ImagePanel inputImagePanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JButton openButton;
    private imageprocessor.ImagePanel outputImagePanel;
    private javax.swing.JLabel processLabel;
    private javax.swing.JButton saveButton;
    private javax.swing.JMenuItem saveMenuItem;
    private javax.swing.JCheckBox sharpenBox;
    private javax.swing.JLabel textLabel1;
    private javax.swing.JLabel textLabel2;
    // End of variables declaration//GEN-END:variables
}
