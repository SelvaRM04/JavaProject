/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Model;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import moviezoom.MovieInfo;


/**
 *
 * @author Ragul S
 */
public class EditMovieInfo extends javax.swing.JFrame {

    MovieInfo m;
    public static Boolean opov=false;
    int ind1 = 0;
    int ind2 = 0;
    
    /**
     * Creates new form EditMovieInfo
     *
     * @param Movies
     * @param n
     * @param yr
     * @param tpe
     */
    public EditMovieInfo(/*ArrayList<MovieInfo> m1*/ArrayList<ArrayList<MovieInfo>> Movies, String n, String yr, String tpe) {

        /*for (int i = 0; i < m1.size(); i++) {
            if (m1.get(i).getTitle().equals(n) && m1.get(i).getYear().equals(yr) && m1.get(i).getTape().equals(tpe));
            m = m1.get(i);
        }*/
        opov=true;
        setUndecorated(true);
        setBounds(830,152,480, 590);
        initComponents();
        editnametxt.requestFocus();
        //setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        
        for(int i=0;i<Movies.size();i++)
        {
            for(int j=0;j<Movies.get(i).size();j++)
            {
                if (Movies.get(i).get(j).getTitle().equals(n) && Movies.get(i).get(j).getYear().equals(yr) && Movies.get(i).get(j).getTape().equals(tpe))
                {
                m = Movies.get(i).get(j);
                ind1=i;
                ind2=j;
                break;
                }
            }
        }

        editnametxt.setText(n);
        editactortxt.setText(m.getActor());
        editdirtxt.setText(m.getDirector());
        edityeartxt.setText(m.getYear());
        editgenretxt.setText(m.getGenre());
        editratingtxt.setText(m.getRating());
        edittapetxt.setText(m.getTape());
        editformattxt.setText(m.getFormat());
        this.addWindowListener(new WindowAdapter() {
    
            @Override
            public void windowClosed(WindowEvent e) {
                opov=false;
            }

            @Override
            public void windowClosing(WindowEvent e) {
                opov=false;
            }
        });
        
    }

    public EditMovieInfo() {
       // initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        editactortxt = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        editdirtxt = new javax.swing.JTextField();
        edityeartxt = new javax.swing.JTextField();
        editratingtxt = new javax.swing.JTextField();
        editnametxt = new javax.swing.JTextField();
        editformattxt = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        Addmovie = new javax.swing.JButton();
        Commenttxt = new javax.swing.JTextField();
        edittapetxt = new javax.swing.JTextField();
        editgenretxt = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        cmntbtn = new javax.swing.JButton();

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 440, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 102, 0));
        jLabel13.setText("Comment :");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 460, 100, 30));

        jLabel20.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(0, 102, 0));
        jLabel20.setText("Format :");
        getContentPane().add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 100, 30));

        editactortxt.setBackground(new java.awt.Color(0, 102, 0));
        editactortxt.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        editactortxt.setForeground(new java.awt.Color(255, 255, 255));
        editactortxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        editactortxt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        editactortxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editactortxtActionPerformed(evt);
            }
        });
        editactortxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                editactortxtKeyPressed(evt);
            }
        });
        getContentPane().add(editactortxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 110, 190, 30));

        jLabel14.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(0, 102, 0));
        jLabel14.setText("Name : ");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 80, 30));

        editdirtxt.setBackground(new java.awt.Color(0, 102, 0));
        editdirtxt.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        editdirtxt.setForeground(new java.awt.Color(255, 255, 255));
        editdirtxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        editdirtxt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        editdirtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editdirtxtActionPerformed(evt);
            }
        });
        editdirtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                editdirtxtKeyPressed(evt);
            }
        });
        getContentPane().add(editdirtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 160, 190, 30));

        edityeartxt.setBackground(new java.awt.Color(0, 102, 0));
        edityeartxt.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        edityeartxt.setForeground(new java.awt.Color(255, 255, 255));
        edityeartxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        edityeartxt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        edityeartxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                edityeartxtActionPerformed(evt);
            }
        });
        edityeartxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                edityeartxtKeyPressed(evt);
            }
        });
        getContentPane().add(edityeartxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, 190, 30));

        editratingtxt.setBackground(new java.awt.Color(0, 102, 0));
        editratingtxt.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        editratingtxt.setForeground(new java.awt.Color(255, 255, 255));
        editratingtxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        editratingtxt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        editratingtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editratingtxtActionPerformed(evt);
            }
        });
        editratingtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                editratingtxtKeyPressed(evt);
            }
        });
        getContentPane().add(editratingtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 260, 190, 30));

        editnametxt.setBackground(new java.awt.Color(0, 102, 0));
        editnametxt.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        editnametxt.setForeground(new java.awt.Color(255, 255, 255));
        editnametxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        editnametxt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(0, 102, 0), new java.awt.Color(0, 102, 0), null, null));
        editnametxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        editnametxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editnametxtActionPerformed(evt);
            }
        });
        editnametxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                editnametxtKeyPressed(evt);
            }
        });
        getContentPane().add(editnametxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 60, 190, 30));

        editformattxt.setBackground(new java.awt.Color(0, 102, 0));
        editformattxt.setColumns(10);
        editformattxt.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        editformattxt.setForeground(new java.awt.Color(255, 255, 255));
        editformattxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        editformattxt.setToolTipText("");
        editformattxt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        editformattxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editformattxtActionPerformed(evt);
            }
        });
        editformattxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                editformattxtKeyPressed(evt);
            }
        });
        getContentPane().add(editformattxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 410, 190, 30));

        jLabel15.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(0, 102, 0));
        jLabel15.setText("Actor :");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 100, 60, 50));

        jLabel16.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(0, 102, 0));
        jLabel16.setText("Director :");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 160, 100, 30));

        jLabel17.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 102, 0));
        jLabel17.setText("Year :");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 70, 40));

        jLabel18.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 102, 0));
        jLabel18.setText("Rating :");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, 70, 30));

        jLabel19.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(0, 102, 0));
        jLabel19.setText("Genre :");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 70, 30));

        jLabel21.setFont(new java.awt.Font("Century Gothic", 1, 15)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(0, 102, 0));
        jLabel21.setText("Tape :");
        getContentPane().add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 100, 30));

        Addmovie.setBackground(new java.awt.Color(0, 102, 0));
        Addmovie.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Addmovie.setForeground(new java.awt.Color(255, 255, 255));
        Addmovie.setText("Save");
        Addmovie.setActionCommand("");
        Addmovie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AddmovieActionPerformed(evt);
            }
        });
        getContentPane().add(Addmovie, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 510, 75, 36));

        Commenttxt.setBackground(new java.awt.Color(0, 102, 0));
        Commenttxt.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        Commenttxt.setForeground(new java.awt.Color(255, 255, 255));
        Commenttxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        getContentPane().add(Commenttxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 460, 190, 30));

        edittapetxt.setBackground(new java.awt.Color(0, 102, 0));
        edittapetxt.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        edittapetxt.setForeground(new java.awt.Color(255, 255, 255));
        edittapetxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        edittapetxt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        edittapetxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                edittapetxtKeyPressed(evt);
            }
        });
        getContentPane().add(edittapetxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 360, 190, 30));

        editgenretxt.setBackground(new java.awt.Color(0, 102, 0));
        editgenretxt.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        editgenretxt.setForeground(new java.awt.Color(255, 255, 255));
        editgenretxt.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        editgenretxt.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        editgenretxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editgenretxtActionPerformed(evt);
            }
        });
        editgenretxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                editgenretxtKeyPressed(evt);
            }
        });
        getContentPane().add(editgenretxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, 190, 30));

        jPanel2.setBackground(new java.awt.Color(204, 255, 204));

        cmntbtn.setBackground(new java.awt.Color(0, 102, 0));
        cmntbtn.setFont(new java.awt.Font("Century Gothic", 1, 24)); // NOI18N
        cmntbtn.setForeground(new java.awt.Color(255, 255, 255));
        cmntbtn.setText("+");
        cmntbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmntbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(369, Short.MAX_VALUE)
                .addComponent(cmntbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(453, Short.MAX_VALUE)
                .addComponent(cmntbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(77, 77, 77))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 440, 570));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void AddmovieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AddmovieActionPerformed
        String name = editnametxt.getText();
        String actor = editactortxt.getText();
        String director = editdirtxt.getText();
        String year = edityeartxt.getText();
        String rating = editratingtxt.getText();
        String genre = editgenretxt.getText();
        String tape = edittapetxt.getText();
        String format = editformattxt.getText();
        
        MovieInfo.Movies.get(ind1).get(ind2).setTitle(name);
        MovieInfo.Movies.get(ind1).get(ind2).setActor(actor);
        MovieInfo.Movies.get(ind1).get(ind2).setDirector(director);
        MovieInfo.Movies.get(ind1).get(ind2).setYear(year);
        MovieInfo.Movies.get(ind1).get(ind2).setRating(rating);
        MovieInfo.Movies.get(ind1).get(ind2).setGenre(genre);
        MovieInfo.Movies.get(ind1).get(ind2).setTape(tape);
        MovieInfo.Movies.get(ind1).get(ind2).setFormat(format);
        
        JOptionPane.showMessageDialog(null,"Movie Updated Successfully");
        setVisible(false);
        Home.em.setVisible(false);
    }//GEN-LAST:event_AddmovieActionPerformed

    private void cmntbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmntbtnActionPerformed
        String comment = Commenttxt.getText();
        Commenttxt.setText("");
        MovieInfo.Movies.get(ind1).get(ind2).setComment(comment);
        
        JOptionPane.showMessageDialog(null,"Comment added");
    }//GEN-LAST:event_cmntbtnActionPerformed

    private void editnametxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editnametxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editnametxtActionPerformed

    private void editactortxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editactortxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editactortxtActionPerformed

    private void editdirtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editdirtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editdirtxtActionPerformed

    private void edityeartxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_edityeartxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_edityeartxtActionPerformed

    private void editratingtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editratingtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editratingtxtActionPerformed

    private void editformattxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editformattxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editformattxtActionPerformed

    private void editgenretxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editgenretxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editgenretxtActionPerformed

    private void editnametxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_editnametxtKeyPressed
        // TODO add your handling code here:
        int a =evt.getKeyCode();
        if(a==10||a==40)
            editactortxt.requestFocus();
        
    }//GEN-LAST:event_editnametxtKeyPressed

    private void editactortxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_editactortxtKeyPressed
        // TODO add your handling code here:
        int a =evt.getKeyCode();
        if(a==10 || a==40)
            editdirtxt.requestFocus();
        else if(a==38)
            editnametxt.requestFocus();
    }//GEN-LAST:event_editactortxtKeyPressed

    private void editdirtxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_editdirtxtKeyPressed
        // TODO add your handling code here:
        int a =evt.getKeyCode();
        if(a==10 || a==40)
            edityeartxt.requestFocus();
        else if(a==38)
            editactortxt.requestFocus();
    }//GEN-LAST:event_editdirtxtKeyPressed

    private void edityeartxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edityeartxtKeyPressed
        // TODO add your handling code here:
        int a =evt.getKeyCode();
        if(a==10|| a==40)
            editratingtxt.requestFocus();
        else if(a==38)
            editdirtxt.requestFocus();
    }//GEN-LAST:event_edityeartxtKeyPressed

    private void editratingtxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_editratingtxtKeyPressed
        // TODO add your handling code here:
        int a =evt.getKeyCode();
        if(a==10 || a==40)
            editgenretxt.requestFocus();
        else if(a==38)
            edityeartxt.requestFocus();
    }//GEN-LAST:event_editratingtxtKeyPressed

    private void editgenretxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_editgenretxtKeyPressed
        // TODO add your handling code here:
        int a =evt.getKeyCode();
        if(a==10 || a==40)
            edittapetxt.requestFocus();
        else if(a==38)
            editratingtxt.requestFocus();
    }//GEN-LAST:event_editgenretxtKeyPressed

    private void edittapetxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_edittapetxtKeyPressed
        // TODO add your handling code here:
        int a =evt.getKeyCode();
        if(a==10 || a==40)
            editformattxt.requestFocus();
        else if(a==38)
            editgenretxt.requestFocus();
    }//GEN-LAST:event_edittapetxtKeyPressed

    private void editformattxtKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_editformattxtKeyPressed
        // TODO add your handling code here:
         int a =evt.getKeyCode();
        if(a==10 || a==40)
            Commenttxt.requestFocus();
        else if(a==38)
            edittapetxt.requestFocus();
    }//GEN-LAST:event_editformattxtKeyPressed

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
            java.util.logging.Logger.getLogger(EditMovieInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditMovieInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditMovieInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditMovieInfo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditMovieInfo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Addmovie;
    private javax.swing.JTextField Commenttxt;
    private javax.swing.JButton cmntbtn;
    private javax.swing.JTextField editactortxt;
    private javax.swing.JTextField editdirtxt;
    private javax.swing.JTextField editformattxt;
    private javax.swing.JTextField editgenretxt;
    private javax.swing.JTextField editnametxt;
    private javax.swing.JTextField editratingtxt;
    private javax.swing.JTextField edittapetxt;
    private javax.swing.JTextField edityeartxt;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
