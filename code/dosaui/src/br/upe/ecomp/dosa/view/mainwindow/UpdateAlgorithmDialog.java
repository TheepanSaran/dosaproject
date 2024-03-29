/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * UpdateAlgorithmDialog.java
 *
 * Created on Sep 20, 2010, 10:34:01 PM
 */

package br.upe.ecomp.dosa.view.mainwindow;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;
import org.jdesktop.layout.GroupLayout;
import org.jdesktop.layout.LayoutStyle;

/**
 *
 * @author rodrigo
 */
public class UpdateAlgorithmDialog extends javax.swing.JDialog {

    /** Creates new form UpdateAlgorithmDialog */
    public UpdateAlgorithmDialog(java.awt.Frame parent, boolean modal) {
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
        updatePanel = new JPanel();
        updateComboBox = new JComboBox();
        updateLabel = new JLabel();
        updateTitleSeparator = new JSeparator();
        updateDescriptionScrollPane = new JScrollPane();
        updateDescriptionTextArea = new JTextArea();
        jLabel7 = new JLabel();
        jSeparator6 = new JSeparator();
        flowButtonsPanel = new JPanel();
        finishButton = new JButton();
        cancelButton = new JButton();

        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

        defaultPanel.setLayout(new CardLayout());

        updateLabel.setText("Algorithm");

        updateDescriptionScrollPane.setBackground(new Color(153, 153, 153));
        updateDescriptionScrollPane.setBorder(null);

        updateDescriptionTextArea.setBackground(new Color(238, 238, 238));
        updateDescriptionTextArea.setColumns(20);
        updateDescriptionTextArea.setEditable(false);
        updateDescriptionTextArea.setRows(5);
        updateDescriptionTextArea.setText("Algorithm description goes here...");
        updateDescriptionTextArea.setWrapStyleWord(true);
        updateDescriptionTextArea.setCaretColor(new Color(238, 238, 238));
        updateDescriptionTextArea.setCursor(new Cursor(Cursor.DEFAULT_CURSOR));
        updateDescriptionScrollPane.setViewportView(updateDescriptionTextArea);

        jLabel7.setText("Description");

        GroupLayout updatePanelLayout = new GroupLayout(updatePanel);
        updatePanel.setLayout(updatePanelLayout);
        updatePanelLayout.setHorizontalGroup(
            updatePanelLayout.createParallelGroup(GroupLayout.LEADING)
            .add(updatePanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(updatePanelLayout.createParallelGroup(GroupLayout.LEADING)
                    .add(jLabel7)
                    .add(updateDescriptionScrollPane, GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE)
                    .add(jSeparator6, GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE)
                    .add(updateComboBox, 0, 659, Short.MAX_VALUE)
                    .add(updateTitleSeparator, GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE)
                    .add(updateLabel))
                .addContainerGap())
        );
        updatePanelLayout.setVerticalGroup(
            updatePanelLayout.createParallelGroup(GroupLayout.LEADING)
            .add(updatePanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(updateLabel)
                .add(0, 0, 0)
                .add(updateTitleSeparator, GroupLayout.PREFERRED_SIZE, 10, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.UNRELATED)
                .add(updateComboBox, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(LayoutStyle.RELATED, 184, Short.MAX_VALUE)
                .add(jLabel7)
                .add(0, 0, 0)
                .add(jSeparator6, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .add(0, 0, 0)
                .add(updateDescriptionScrollPane, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        defaultPanel.add(updatePanel, "card2");

        getContentPane().add(defaultPanel, BorderLayout.CENTER);

        flowButtonsPanel.setMinimumSize(new Dimension(100, 40));
        flowButtonsPanel.setPreferredSize(new Dimension(508, 40));
        flowButtonsPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));

        finishButton.setText("Finish");
        finishButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                finishButtonActionPerformed(evt);
            }
        });
        flowButtonsPanel.add(finishButton);

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });
        flowButtonsPanel.add(cancelButton);

        getContentPane().add(flowButtonsPanel, BorderLayout.PAGE_END);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void finishButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_finishButtonActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_finishButtonActionPerformed

    private void cancelButtonActionPerformed(ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_cancelButtonActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                UpdateAlgorithmDialog dialog = new UpdateAlgorithmDialog(new javax.swing.JFrame(), true);
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
    protected JPanel defaultPanel;
    protected JButton finishButton;
    protected JPanel flowButtonsPanel;
    protected JLabel jLabel7;
    protected JSeparator jSeparator6;
    protected JComboBox updateComboBox;
    protected JScrollPane updateDescriptionScrollPane;
    protected JTextArea updateDescriptionTextArea;
    protected JLabel updateLabel;
    protected JPanel updatePanel;
    protected JSeparator updateTitleSeparator;
    // End of variables declaration//GEN-END:variables

}
