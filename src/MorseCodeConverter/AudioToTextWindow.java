package MorseCodeConverter;

import javax.swing.JOptionPane;

/**
 *
 * TODO:
 * Pass toggle from English to Morse code output text from InputOutputGUI
 * Wait until guessing is stopped before interpreting
 * 
 * 
 * @author Jacob White
 */
public class AudioToTextWindow extends javax.swing.JFrame {

    public boolean isEnglishOutput = true;
    private WPMProcessor wpmp;
    private AudioToTextProcessor attp;
    private AudioToText att;
    /**
     * Creates new form AudioToTextWindow
     */
    public AudioToTextWindow() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        directions = new javax.swing.JTextArea();
        inputPanel = new javax.swing.JPanel();
        inputLabel = new javax.swing.JLabel();
        startWPMGuessButton = new javax.swing.JButton();
        stopWPMGuessButton = new javax.swing.JButton();
        durationLabel = new javax.swing.JLabel();
        startInterpretingButton = new javax.swing.JButton();
        stopInterpretingButton = new javax.swing.JButton();
        WPMSpinner = new javax.swing.JSpinner();
        outputPanel = new javax.swing.JPanel();
        outputLabel = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        outputArea = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Morse Audio to Text Converter");

        jScrollPane1.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane1.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);
        jScrollPane1.setEnabled(false);
        jScrollPane1.setFocusable(false);

        directions.setEditable(false);
        directions.setColumns(20);
        directions.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        directions.setLineWrap(true);
        directions.setRows(5);
        directions.setText("Enter a non-zero WPM value in order to convert audio to text (using Morse standard: 50 dots/word). If the WPM is unknown, press \"Start Guessing\" and play a sample at the same speed as the message (This will NOT be included in the final message). Then press \"Start Interpreting\" and play your message.");
        directions.setWrapStyleWord(true);
        directions.setFocusable(false);
        jScrollPane1.setViewportView(directions);

        inputLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        inputLabel.setText("Input:");

        startWPMGuessButton.setText("Start Guessing");
        startWPMGuessButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startWPMGuessButtonActionPerformed(evt);
            }
        });

        stopWPMGuessButton.setText("Stop Guessing");
        stopWPMGuessButton.setEnabled(false);
        stopWPMGuessButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopWPMGuessButtonActionPerformed(evt);
            }
        });

        durationLabel.setText("WPM:");

        startInterpretingButton.setText("Start Interpreting");
        startInterpretingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startInterpretingButtonActionPerformed(evt);
            }
        });

        stopInterpretingButton.setText("Stop Interpreting");
        stopInterpretingButton.setEnabled(false);
        stopInterpretingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                stopInterpretingButtonActionPerformed(evt);
            }
        });

        WPMSpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, 100, 1));

        javax.swing.GroupLayout inputPanelLayout = new javax.swing.GroupLayout(inputPanel);
        inputPanel.setLayout(inputPanelLayout);
        inputPanelLayout.setHorizontalGroup(
            inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(inputLabel)
                    .addGroup(inputPanelLayout.createSequentialGroup()
                        .addComponent(startWPMGuessButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(stopWPMGuessButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(durationLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(WPMSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(inputPanelLayout.createSequentialGroup()
                        .addComponent(startInterpretingButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(stopInterpretingButton)))
                .addContainerGap(228, Short.MAX_VALUE))
        );
        inputPanelLayout.setVerticalGroup(
            inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputPanelLayout.createSequentialGroup()
                .addComponent(inputLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startWPMGuessButton)
                    .addComponent(stopWPMGuessButton)
                    .addComponent(durationLabel)
                    .addComponent(WPMSpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(inputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startInterpretingButton)
                    .addComponent(stopInterpretingButton))
                .addGap(0, 13, Short.MAX_VALUE))
        );

        outputLabel.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        outputLabel.setText("Output:");

        jScrollPane3.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        jScrollPane3.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        outputArea.setEditable(false);
        outputArea.setColumns(20);
        outputArea.setFont(new java.awt.Font("Monospaced", 0, 18)); // NOI18N
        outputArea.setLineWrap(true);
        outputArea.setRows(5);
        outputArea.setWrapStyleWord(true);
        jScrollPane3.setViewportView(outputArea);

        javax.swing.GroupLayout outputPanelLayout = new javax.swing.GroupLayout(outputPanel);
        outputPanel.setLayout(outputPanelLayout);
        outputPanelLayout.setHorizontalGroup(
            outputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outputPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(outputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane3)
                    .addGroup(outputPanelLayout.createSequentialGroup()
                        .addComponent(outputLabel)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        outputPanelLayout.setVerticalGroup(
            outputPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(outputPanelLayout.createSequentialGroup()
                .addComponent(outputLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(inputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(outputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(inputPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(outputPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void startWPMGuessButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startWPMGuessButtonActionPerformed
        startInterpretingButton.setEnabled(false); //Disable to prevent 2 simultaneous lines
        if (att == null) {
            att = new AudioToText();
        }
        att.setStopped(false);
        //Start button disabled by SwingWorker wpmp until finished executing.
        wpmp = new WPMProcessor(this, startWPMGuessButton, stopWPMGuessButton, WPMSpinner, att);
        wpmp.execute();
    }//GEN-LAST:event_startWPMGuessButtonActionPerformed

    private void stopWPMGuessButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopWPMGuessButtonActionPerformed
        att.setStopped(true); //Stops the data collection
        startInterpretingButton.setEnabled(true);
    }//GEN-LAST:event_stopWPMGuessButtonActionPerformed

    private void startInterpretingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startInterpretingButtonActionPerformed
        if ((int)WPMSpinner.getValue() == 0) {
            JOptionPane.showMessageDialog(this, "Must have a non-zero words-per-minute value. If the message speed in WPM is unknown,\nuse \"Start Guessing\" and play a sample to estimate it.", "Zero WPM Error", JOptionPane.ERROR_MESSAGE);
        }
        else {
            outputArea.setText(""); //Clear any previous text
            startWPMGuessButton.setEnabled(false);//Disable to prevent 2 simultaneous lines

            if (att == null) {
                att = new AudioToText();
            }
            att.setStopped(false);
            attp = new AudioToTextProcessor(this, startInterpretingButton, stopInterpretingButton, WPMSpinner, outputArea, att);
            attp.execute(); 
        }
    }//GEN-LAST:event_startInterpretingButtonActionPerformed

    private void stopInterpretingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_stopInterpretingButtonActionPerformed
        att.setStopped(true);
        startWPMGuessButton.setEnabled(true);
    }//GEN-LAST:event_stopInterpretingButtonActionPerformed

    public void setTextOutput(boolean isEnglishOutput) {
        this.isEnglishOutput = isEnglishOutput;
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
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AudioToTextWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AudioToTextWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AudioToTextWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AudioToTextWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AudioToTextWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSpinner WPMSpinner;
    private javax.swing.JTextArea directions;
    private javax.swing.JLabel durationLabel;
    private javax.swing.JLabel inputLabel;
    private javax.swing.JPanel inputPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea outputArea;
    private javax.swing.JLabel outputLabel;
    private javax.swing.JPanel outputPanel;
    private javax.swing.JButton startInterpretingButton;
    private javax.swing.JButton startWPMGuessButton;
    private javax.swing.JButton stopInterpretingButton;
    private javax.swing.JButton stopWPMGuessButton;
    // End of variables declaration//GEN-END:variables
}
