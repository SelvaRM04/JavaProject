/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Model;

import java.awt.Color;
import moviezoom.MovieInfo;
import javax.swing.*;
/**
 *
 * @author Ragul S
 */
public class Catalog extends javax.swing.JFrame {

    /**
     * Creates new form Catalog
     */
    public Catalog() {
        setUndecorated(true);
        initComponents();
        nametxt.requestFocus();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(530,125,760,625);
        setBackground(Color. BLACK);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        actortxt = new javax.swing.JTextField();
        dirtxt = new javax.swing.JTextField();
        yeartxt = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        nametxt = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jPanel7 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        Addmovie = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        formattxt = new javax.swing.JTextField();
        sourcetxt = new javax.swing.JTextField();
        ratingtxt = new javax.swing.JComboBox<>();
        tapetxt = new javax.swing.JComboBox<>();
        Action = new javax.swing.JRadioButton();
        Romance = new javax.swing.JRadioButton();
        jLabel20 = new javax.swing.JLabel();
        Comedy = new javax.swing.JRadioButton();
        sci = new javax.swing.JRadioButton();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("ADD MOVIE");
        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(new java.awt.Color(51, 102, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        actortxt.setBackground(new java.awt.Color(91, 99, 142));
        actortxt.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        actortxt.setForeground(new java.awt.Color(255, 255, 255));
        actortxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        actortxt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        actortxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                actortxtActionPerformed(evt);
            }
        });
        actortxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                actortxtKeyPressed(evt);
            }
        });
        getContentPane().add(actortxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 190, 190, 30));

        dirtxt.setBackground(new java.awt.Color(91, 99, 142));
        dirtxt.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        dirtxt.setForeground(new java.awt.Color(255, 255, 255));
        dirtxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        dirtxt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        dirtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dirtxtActionPerformed(evt);
            }
        });
        dirtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                dirtxtKeyPressed(evt);
            }
        });
        getContentPane().add(dirtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 230, 190, 30));

        yeartxt.setBackground(new java.awt.Color(91, 99, 142));
        yeartxt.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        yeartxt.setForeground(new java.awt.Color(255, 255, 255));
        yeartxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        yeartxt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        yeartxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yeartxtActionPerformed(evt);
            }
        });
        yeartxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                yeartxtKeyPressed(evt);
            }
        });
        getContentPane().add(yeartxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 270, 190, 30));

        jPanel1.setBackground(new java.awt.Color(91, 99, 142));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Century Gothic", 1, 48)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("MovieZoom");
        jPanel1.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 270, 290, 70));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 310, 700));

        nametxt.setBackground(new java.awt.Color(91, 99, 142));
        nametxt.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        nametxt.setForeground(new java.awt.Color(255, 255, 255));
        nametxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nametxt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 102, 204), new java.awt.Color(0, 102, 204), null, null));
        nametxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nametxtActionPerformed(evt);
            }
        });
        nametxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                nametxtKeyPressed(evt);
            }
        });
        getContentPane().add(nametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 150, 190, 30));

        jPanel3.setBackground(new java.awt.Color(91, 99, 142));
        jPanel3.setForeground(new java.awt.Color(0, 102, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Add Page");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, 160, 20));

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("  X");
        jLabel12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel12MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 20, 30, 30));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, -20, 480, 50));

        jPanel5.setBackground(new java.awt.Color(91, 99, 142));
        jPanel5.setForeground(new java.awt.Color(0, 102, 0));
        getContentPane().add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 0, 40, 640));

        jPanel7.setBackground(new java.awt.Color(91, 99, 142));
        jPanel7.setForeground(new java.awt.Color(0, 102, 0));
        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 610, 460, 70));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(91, 99, 142));
        jLabel14.setText("Name : ");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 100, 30));

        jLabel15.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(91, 99, 142));
        jLabel15.setText("Actor :");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 60, 30));

        jLabel16.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(91, 99, 142));
        jLabel16.setText("Director :");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 220, 100, 50));

        jLabel17.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(91, 99, 142));
        jLabel17.setText("Year :");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 260, 100, 50));

        jLabel18.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(91, 99, 142));
        jLabel18.setText("Rating :");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 300, 100, 50));

        jLabel19.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(91, 99, 142));
        jLabel19.setText("Genre :");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, 70, 50));

        jPanel2.setBackground(new java.awt.Color(235, 221, 255));
        jPanel2.setForeground(new java.awt.Color(255, 255, 255));
        jPanel2.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Century Gothic", 1, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(91, 115, 151));
        jLabel9.setText("New Movie?");
        jPanel2.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 50, 236, 56));

        Addmovie.setBackground(new java.awt.Color(91, 99, 142));
        Addmovie.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Addmovie.setForeground(new java.awt.Color(255, 255, 255));
        Addmovie.setText("Add");
        Addmovie.setBorder(null);
        Addmovie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddmovieActionPerformed(evt);
            }
        });
        jPanel2.add(Addmovie, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 540, 75, 36));

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(91, 99, 142));
        jLabel13.setText("Source :");
        jPanel2.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 490, 100, 30));

        jLabel23.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(91, 99, 142));
        jLabel23.setText("Format :");
        jPanel2.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 450, 100, 30));

        formattxt.setBackground(new java.awt.Color(91, 99, 142));
        formattxt.setColumns(10);
        formattxt.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        formattxt.setForeground(new java.awt.Color(255, 255, 255));
        formattxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        formattxt.setToolTipText("");
        formattxt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        formattxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                formattxtActionPerformed(evt);
            }
        });
        formattxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formattxtKeyPressed(evt);
            }
        });
        jPanel2.add(formattxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 450, 190, 30));

        sourcetxt.setBackground(new java.awt.Color(91, 99, 142));
        sourcetxt.setColumns(10);
        sourcetxt.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        sourcetxt.setForeground(new java.awt.Color(255, 255, 255));
        sourcetxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        sourcetxt.setToolTipText("");
        sourcetxt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        sourcetxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sourcetxtActionPerformed(evt);
            }
        });
        sourcetxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                sourcetxtKeyPressed(evt);
            }
        });
        jPanel2.add(sourcetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 490, 190, 30));

        ratingtxt.setBackground(new java.awt.Color(91, 99, 142));
        ratingtxt.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        ratingtxt.setForeground(new java.awt.Color(255, 255, 255));
        ratingtxt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "U/A", "U", "V", "A" }));
        jPanel2.add(ratingtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 290, 190, 30));

        tapetxt.setBackground(new java.awt.Color(91, 99, 142));
        tapetxt.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        tapetxt.setForeground(new java.awt.Color(255, 255, 255));
        tapetxt.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "1", "2", "3", "4", "5" }));
        jPanel2.add(tapetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, 190, 30));

        Action.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        Action.setForeground(new java.awt.Color(91, 99, 142));
        Action.setText("Action");
        jPanel2.add(Action, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 331, -1, 30));

        Romance.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        Romance.setForeground(new java.awt.Color(91, 99, 142));
        Romance.setText("Romance");
        jPanel2.add(Romance, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 331, -1, 30));

        jLabel20.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(91, 99, 142));
        jLabel20.setText("Tape :");
        jPanel2.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 400, 100, 50));

        Comedy.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        Comedy.setForeground(new java.awt.Color(91, 99, 142));
        Comedy.setText("Comedy");
        jPanel2.add(Comedy, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 370, -1, -1));

        sci.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        sci.setForeground(new java.awt.Color(91, 99, 142));
        sci.setText("Science Fiction");
        jPanel2.add(sci, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 370, -1, -1));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 20, 460, 600));

        jLabel21.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 51, 153));
        jLabel21.setText("Tape :");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 380, 100, 50));

        jLabel22.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(0, 51, 153));
        jLabel22.setText("Format :");
        getContentPane().add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 430, 100, 30));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    private void Validate(){
        //JFrame addMsg = new JFrame();
        //addMsg.setVisible(false);
        try{
            String name = nametxt.getText();
            String actor = actortxt.getText();
            String director = dirtxt.getText();
            String year = yeartxt.getText();
            String rating = (String) ratingtxt.getSelectedItem();
            String genre = "d";
            
            if(Action.isSelected()) genre = "action";
            else if(Comedy.isSelected()) genre = "comedy";
            else if(Romance.isSelected()) genre = "romance";
            else if(sci.isSelected()) genre = "Science fiction";
            
            String tape = (String) tapetxt.getSelectedItem();
            String format = formattxt.getText();
            String source = sourcetxt.getText();
            if(name.equals("") || actor.equals("") || director.equals("") || year.equals("") || rating.equals("") || genre.equals("") || tape.equals("") || format.equals("") || source.equals(""))
                throw new NullPointerException();
            
            MovieInfo addinfo = new MovieInfo();
            
            addinfo.setActor(actor);
            addinfo.setTitle(name);
            addinfo.setDirector(director);
            addinfo.setYear(year);
            addinfo.setRating(rating);
            addinfo.setTape(tape);
            addinfo.setGenre(genre);
            addinfo.setFormat(format);
            addinfo.setSource(source);
            
            MovieInfo.Add(addinfo);
            
            //addMsg.setVisible(true);
            JOptionPane.showMessageDialog(null,"Movie Added Successfully");
            setVisible(false);
        }
        catch(NullPointerException e){
            //addMsg.setVisible(true);
            JOptionPane.showMessageDialog(null,"Please Enter all fields");
        }
    }
    
    private void AddmovieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddmovieActionPerformed
        Validate();
    }//GEN-LAST:event_AddmovieActionPerformed

    private void nametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nametxtActionPerformed

    private void jLabel12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel12MouseClicked
        // TODO add your handling code here:
        setVisible(false);
    }//GEN-LAST:event_jLabel12MouseClicked

    private void actortxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_actortxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_actortxtActionPerformed

    private void dirtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dirtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dirtxtActionPerformed

    private void yeartxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yeartxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yeartxtActionPerformed

    private void formattxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_formattxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_formattxtActionPerformed

    private void sourcetxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sourcetxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sourcetxtActionPerformed

    private void nametxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nametxtKeyPressed
        // TODO add your handling code here:
        int a =evt.getKeyCode();
        if(a==10 || a==40)
            actortxt.requestFocus();
    }//GEN-LAST:event_nametxtKeyPressed

    private void actortxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_actortxtKeyPressed
        // TODO add your handling code here:
        int a =evt.getKeyCode();
        if(a==10 || a==40)
            dirtxt.requestFocus();
    }//GEN-LAST:event_actortxtKeyPressed

    private void dirtxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_dirtxtKeyPressed
        // TODO add your handling code here:
        int a =evt.getKeyCode();
        if(a==10 || a==40)
            yeartxt.requestFocus();
    }//GEN-LAST:event_dirtxtKeyPressed

    private void yeartxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_yeartxtKeyPressed
        // TODO add your handling code here:
        int a =evt.getKeyCode();
        if(a==10 || a==40)
            ratingtxt.requestFocus();
    }//GEN-LAST:event_yeartxtKeyPressed

    private void formattxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formattxtKeyPressed
        // TODO add your handling code here:
        int a =evt.getKeyCode();
        if(a==10 || a==40)
            sourcetxt.requestFocus();
    }//GEN-LAST:event_formattxtKeyPressed

    private void sourcetxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_sourcetxtKeyPressed
        // TODO add your handling code here:
        //Validate();
    }//GEN-LAST:event_sourcetxtKeyPressed

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
            java.util.logging.Logger.getLogger(Catalog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Catalog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Catalog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Catalog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Catalog().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton Action;
    private javax.swing.JButton Addmovie;
    private javax.swing.JRadioButton Comedy;
    private javax.swing.JRadioButton Romance;
    private javax.swing.JTextField actortxt;
    private javax.swing.JTextField dirtxt;
    private javax.swing.JTextField formattxt;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTextField nametxt;
    private javax.swing.JComboBox<String> ratingtxt;
    private javax.swing.JRadioButton sci;
    private javax.swing.JTextField sourcetxt;
    private javax.swing.JComboBox<String> tapetxt;
    private javax.swing.JTextField yeartxt;
    // End of variables declaration//GEN-END:variables
}
