/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ConfigureSimulation.java
 *
 * Created on Sep 23, 2010, 10:00:48 PM
 */

package br.upe.ecomp.dosa.view.mainwindow;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JProgressBar;
import javax.swing.JSpinner;
import javax.swing.WindowConstants;
import org.jdesktop.layout.GroupLayout;
import org.jdesktop.layout.LayoutStyle;

/**
 *
 * @author rodrigo
 */
public class ConfigureSimulation extends javax.swing.JDialog {

    /** Creates new form ConfigureSimulation */
    public ConfigureSimulation(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        defaultPanel = new JPanel();
        progressPanel = new JPanel();
        progressBar = new JProgressBar();
        progressLabel = new JLabel();
        configurationPanel = new JPanel();
        numberSimulationsLabel = new JLabel();
        numberSimulationsSpinner = new JSpinner();
        cancelButton = new JButton();
        startButton = new JButton();
        realtimeSimulationCheckBox = new JCheckBox();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Configure Simulation");
        setMinimumSize(new Dimension(330, 150));
        setModal(true);
        setResizable(false);

        defaultPanel.setLayout(new CardLayout());

        progressLabel.setText("Simulating...");

        GroupLayout progressPanelLayout = new GroupLayout(progressPanel);
        progressPanel.setLayout(progressPanelLayout);
        progressPanelLayout.setHorizontalGroup(
            progressPanelLayout.createParallelGroup(GroupLayout.LEADING)
            .add(progressPanelLayout.createSequentialGroup()
                .add(progressPanelLayout.createParallelGroup(GroupLayout.LEADING)
                    .add(progressPanelLayout.createSequentialGroup()
                        .add(118, 118, 118)
                        .add(progressLabel))
                    .add(progressPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .add(progressBar, GroupLayout.DEFAULT_SIZE, 287, Short.MAX_VALUE)))
                .addContainerGap())
        );
        progressPanelLayout.setVerticalGroup(
            progressPanelLayout.createParallelGroup(GroupLayout.LEADING)
            .add(progressPanelLayout.createSequentialGroup()
                .add(22, 22, 22)
                .add(progressLabel)
                .add(18, 18, 18)
                .add(progressBar, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(52, Short.MAX_VALUE))
        );

        defaultPanel.add(progressPanel, "card3");

        configurationPanel.setLayout(null);

        numberSimulationsLabel.setText("Number of simulations:");
        numberSimulationsLabel.setToolTipText("Number of simulations");
        configurationPanel.add(numberSimulationsLabel);
        numberSimulationsLabel.setBounds(40, 20, 149, 16);
        configurationPanel.add(numberSimulationsSpinner);
        numberSimulationsSpinner.setBounds(200, 10, 79, 30);

        cancelButton.setText("Cancel");
        cancelButton.setToolTipText("Cancel");
        cancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        configurationPanel.add(cancelButton);
        cancelButton.setBounds(200, 90, 97, 29);

        startButton.setText("Start");
        startButton.setToolTipText("Start");
        startButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                startButtonActionPerformed(evt);
            }
        });
        configurationPanel.add(startButton);
        startButton.setBounds(100, 90, 97, 29);

        realtimeSimulationCheckBox.setText("Show realtime simulation");
        realtimeSimulationCheckBox.setToolTipText("Show realtime simulation");
        realtimeSimulationCheckBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                realtimeSimulationCheckBoxActionPerformed(evt);
            }
        });
        configurationPanel.add(realtimeSimulationCheckBox);
        realtimeSimulationCheckBox.setBounds(30, 50, 240, 23);

        defaultPanel.add(configurationPanel, "card2");

        getContentPane().add(defaultPanel, BorderLayout.CENTER);

        getAccessibleContext().setAccessibleDescription("Configure Simulation");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void realtimeSimulationCheckBoxActionPerformed(ActionEvent evt) {//GEN-FIRST:event_realtimeSimulationCheckBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_realtimeSimulationCheckBoxActionPerformed

    private void startButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_startButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_startButtonActionPerformed

    private void cancelButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelButtonActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ConfigureSimulation dialog = new ConfigureSimulation(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected JButton cancelButton;
    protected JPanel configurationPanel;
    protected JPanel defaultPanel;
    protected JLabel numberSimulationsLabel;
    protected JSpinner numberSimulationsSpinner;
    protected JProgressBar progressBar;
    protected JLabel progressLabel;
    protected JPanel progressPanel;
    protected JCheckBox realtimeSimulationCheckBox;
    protected JButton startButton;
    // End of variables declaration//GEN-END:variables

}