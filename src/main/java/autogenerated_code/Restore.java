/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package autogenerated_code;

import model.SaveFile;

import javax.swing.*;
import java.awt.event.WindowEvent;

/**
 *
 * @author Chris
 */
public abstract class Restore extends JDialog {

  /**
   * Creates new form Restore
   */
  public Restore(java.awt.Frame parent, boolean modal) {
    super(parent, modal);
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
    saveDataModel = new DefaultListModel<SaveFile>();
    jScrollPane1 = new JScrollPane();
    backupList = new JList(saveDataModel);
    jLabel2 = new JLabel();
    closeButton = new JButton();
    restoreButton = new JButton();
    jLabel3 = new JLabel();
    jSeparator1 = new JSeparator();
    statusDisplay = new JLabel();
    jLabel1 = new JLabel();
    setLocationRelativeTo(getParent());
    setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
    setMinimumSize(new java.awt.Dimension(565, 389));
    setMaximumSize(new java.awt.Dimension(565, 389));
    setModal(true);
    getContentPane().setLayout(null);


//    backupList.setModel(new javax.swing.DefaultListModel<SaveFile>() {
//      SaveFile[] data = {};
//      public int getSize() { return data.length; }
//      public SaveFile getElementAt(int i) { return data[i]; }
//    });
    jScrollPane1.setViewportView(backupList);

    getContentPane().add(jScrollPane1);
    jScrollPane1.setBounds(20, 120, 520, 130);

    jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
    jLabel2.setForeground(new java.awt.Color(255, 255, 255));
    jLabel2.setText("Restore Game Files");
    getContentPane().add(jLabel2);
    jLabel2.setBounds(20, 20, 150, 25);

    closeButton.setText("Close");
    closeButton.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        closeButtonMouseClicked(evt);
      }
    });
    getContentPane().add(closeButton);
    closeButton.setBounds(440, 320, 100, 28);

    restoreButton.setText("Restore!");
    restoreButton.addMouseListener(new java.awt.event.MouseAdapter() {
      public void mouseClicked(java.awt.event.MouseEvent evt) {
        restoreButtonMouseClicked(evt);
      }
    });
    getContentPane().add(restoreButton);
    restoreButton.setBounds(20, 260, 100, 28);

    jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
    jLabel3.setForeground(new java.awt.Color(255, 255, 255));
    jLabel3.setText("Snapshots");
    getContentPane().add(jLabel3);
    jLabel3.setBounds(20, 100, 70, 16);
    getContentPane().add(jSeparator1);
    jSeparator1.setBounds(0, 310, 560, 10);

    statusDisplay.setForeground(new java.awt.Color(255, 255, 255));
    statusDisplay.setText("Select the snapshot that you'd like to restore");
    getContentPane().add(statusDisplay);
    statusDisplay.setBounds(20, 290, 320, 16);

    jLabel1.setIcon(new ImageIcon(getClass().getResource("/restore_dark.png"))); // NOI18N
    getContentPane().add(jLabel1);
    jLabel1.setBounds(0, 0, 560, 360);

    addWindowListener(new java.awt.event.WindowAdapter() {
      public void windowOpened(WindowEvent evt) {
        formWindowOpened(evt);
      }
    });

    pack();
    setResizable(false);
  }// </editor-fold>//GEN-END:initComponents

  public abstract void restoreButtonMouseClicked(java.awt.event.MouseEvent evt);

  public abstract void closeButtonMouseClicked(java.awt.event.MouseEvent evt);

  public void formWindowOpened(WindowEvent evt){}

//  /**
//   * @param args the command line arguments
//   */
//  public static void main(String args[]) {
//    /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//     * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
//     */
//    try {
//      for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//        if ("Nimbus".equals(info.getName())) {
//          javax.swing.UIManager.setLookAndFeel(info.getClassName());
//          break;
//        }
//      }
//    } catch (ClassNotFoundException ex) {
//      java.util.logging.Logger.getLogger(Restore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//    } catch (InstantiationException ex) {
//      java.util.logging.Logger.getLogger(Restore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//    } catch (IllegalAccessException ex) {
//      java.util.logging.Logger.getLogger(Restore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//    } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//      java.util.logging.Logger.getLogger(Restore.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//    }
//        //</editor-fold>
//
//    /* Create and display the dialog */
//    java.awt.EventQueue.invokeLater(new Runnable() {
//      public void run() {
//        Restore dialog = new Restore(new javax.swing.JFrame(), true);
//        dialog.addWindowListener(new java.awt.event.WindowAdapter() {
//          @Override
//          public void windowClosing(java.awt.event.WindowEvent e) {
//            System.exit(0);
//          }
//        });
//        dialog.setVisible(true);
//      }
//    });
//  }

  protected void addToList(SaveFile saveFile) {

  }

  // Variables declaration - do not modify//GEN-BEGIN:variables
  protected JList backupList;
  protected JButton closeButton;
  protected JLabel jLabel1;
  protected JLabel jLabel2;
  protected JLabel jLabel3;
  protected JScrollPane jScrollPane1;
  protected JSeparator jSeparator1;
  protected JButton restoreButton;
  protected JLabel statusDisplay;
  protected DefaultListModel<SaveFile> saveDataModel;
  // End of variables declaration//GEN-END:variables
}
