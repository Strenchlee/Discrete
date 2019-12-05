/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finaldec4discrete;

import java.awt.event.KeyEvent;
import java.math.BigInteger;
import javax.swing.JOptionPane;

/**
 *
 * @author XcmoiZoe
 */
public class Combination extends javax.swing.JFrame {

    /**
     * Creates new form Combination
     */
    public Combination() {
        initComponents();
    }
    //polymorp
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        num = new javax.swing.JTextField();
        num0 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        opt1 = new javax.swing.JCheckBox();
        opt2 = new javax.swing.JCheckBox();
        compute = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        c1 = new javax.swing.JLabel();
        c3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        c2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        c4 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        answer = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        c9 = new javax.swing.JLabel();
        c10 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        c11 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        answer2 = new javax.swing.JLabel();
        c12 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        c13 = new javax.swing.JLabel();
        c14 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        c15 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        answer3 = new javax.swing.JLabel();
        c16 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        c5 = new javax.swing.JLabel();
        w1 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        w2 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        w4 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        c17 = new javax.swing.JLabel();
        w3 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        answer1 = new javax.swing.JTextArea();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(880, 475));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Impact", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("          COMBINATION");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(90, 30, 530, 90);

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ENTER  N:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 110, 70, 18);

        num.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numActionPerformed(evt);
            }
        });
        num.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numKeyTyped(evt);
            }
        });
        getContentPane().add(num);
        num.setBounds(140, 100, 60, 30);

        num0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                num0ActionPerformed(evt);
            }
        });
        num0.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                num0KeyTyped(evt);
            }
        });
        getContentPane().add(num0);
        num0.setBounds(140, 140, 60, 30);

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ENTER  K:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 140, 70, 30);

        opt1.setForeground(new java.awt.Color(255, 255, 255));
        opt1.setText("no repetition");
        getContentPane().add(opt1);
        opt1.setBounds(91, 190, 110, 23);

        opt2.setForeground(new java.awt.Color(255, 255, 255));
        opt2.setText("repetition");
        getContentPane().add(opt2);
        opt2.setBounds(91, 230, 110, 23);

        compute.setText("COMPUTE");
        compute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                computeActionPerformed(evt);
            }
        });
        getContentPane().add(compute);
        compute.setBounds(60, 270, 140, 30);

        jButton1.setText("RESET");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(60, 310, 140, 23);

        jPanel1.setLayout(null);

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("___________________________");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(120, 70, 170, 14);

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        jLabel18.setText("(");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(100, 80, 30, 60);

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        jLabel14.setText(")");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(290, 80, 17, 49);

        jLabel23.setBackground(new java.awt.Color(255, 255, 255));
        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel23.setText("!");
        jPanel1.add(jLabel23);
        jLabel23.setBounds(230, 30, 19, 29);

        c1.setBackground(new java.awt.Color(255, 255, 255));
        c1.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        c1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c1);
        c1.setBounds(170, 10, 60, 60);

        c3.setBackground(new java.awt.Color(255, 255, 255));
        c3.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        c3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c3);
        c3.setBounds(230, 90, 50, 40);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        jLabel8.setText("_");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(190, 70, 50, 50);

        c2.setBackground(new java.awt.Color(255, 255, 255));
        c2.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        c2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c2);
        c2.setBounds(120, 90, 50, 40);

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        jLabel9.setText("!");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(310, 90, 20, 33);

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel11.setText("=");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(300, 50, 50, 60);

        c4.setBackground(new java.awt.Color(255, 255, 255));
        c4.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        c4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(c4);
        c4.setBounds(30, 90, 50, 40);

        jLabel24.setBackground(new java.awt.Color(255, 255, 255));
        jLabel24.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel24.setText("!");
        jPanel1.add(jLabel24);
        jLabel24.setBounds(80, 90, 20, 30);

        answer.setEditable(false);
        answer.setColumns(20);
        answer.setRows(5);
        jScrollPane1.setViewportView(answer);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(330, 10, 290, 120);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(220, 100, 630, 140);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("WITH REPETITION");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(220, 220, 220, 60);

        jPanel3.setLayout(null);

        jLabel20.setBackground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("___________________________");
        jPanel3.add(jLabel20);
        jLabel20.setBounds(120, 70, 170, 14);

        jLabel21.setBackground(new java.awt.Color(255, 255, 255));
        jLabel21.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        jLabel21.setText("(");
        jPanel3.add(jLabel21);
        jLabel21.setBounds(100, 80, 30, 60);

        jLabel22.setBackground(new java.awt.Color(255, 255, 255));
        jLabel22.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        jLabel22.setText(")");
        jPanel3.add(jLabel22);
        jLabel22.setBounds(290, 80, 17, 49);

        jLabel27.setBackground(new java.awt.Color(255, 255, 255));
        jLabel27.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel27.setText("!");
        jPanel3.add(jLabel27);
        jLabel27.setBounds(230, 30, 19, 29);

        c9.setBackground(new java.awt.Color(255, 255, 255));
        c9.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        c9.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.add(c9);
        c9.setBounds(170, 10, 60, 60);

        c10.setBackground(new java.awt.Color(255, 255, 255));
        c10.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        c10.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.add(c10);
        c10.setBounds(230, 90, 50, 40);

        jLabel28.setBackground(new java.awt.Color(255, 255, 255));
        jLabel28.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        jLabel28.setText("_");
        jPanel3.add(jLabel28);
        jLabel28.setBounds(190, 70, 50, 50);

        c11.setBackground(new java.awt.Color(255, 255, 255));
        c11.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        c11.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.add(c11);
        c11.setBounds(120, 90, 50, 40);

        jLabel29.setBackground(new java.awt.Color(255, 255, 255));
        jLabel29.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        jLabel29.setText("!");
        jPanel3.add(jLabel29);
        jLabel29.setBounds(310, 90, 20, 33);

        jLabel30.setBackground(new java.awt.Color(255, 255, 255));
        jLabel30.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel30.setText("=");
        jPanel3.add(jLabel30);
        jLabel30.setBounds(330, 50, 50, 60);

        answer2.setBackground(new java.awt.Color(255, 255, 255));
        answer2.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        answer2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.add(answer2);
        answer2.setBounds(370, 30, 70, 90);

        c12.setBackground(new java.awt.Color(255, 255, 255));
        c12.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        c12.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel3.add(c12);
        c12.setBounds(30, 90, 50, 40);

        jLabel31.setBackground(new java.awt.Color(255, 255, 255));
        jLabel31.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel31.setText("!");
        jPanel3.add(jLabel31);
        jLabel31.setBounds(80, 90, 20, 30);

        jPanel4.setLayout(null);

        jLabel32.setBackground(new java.awt.Color(255, 255, 255));
        jLabel32.setText("___________________________");
        jPanel4.add(jLabel32);
        jLabel32.setBounds(120, 70, 170, 14);

        jLabel33.setBackground(new java.awt.Color(255, 255, 255));
        jLabel33.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        jLabel33.setText("(");
        jPanel4.add(jLabel33);
        jLabel33.setBounds(100, 80, 30, 60);

        jLabel34.setBackground(new java.awt.Color(255, 255, 255));
        jLabel34.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        jLabel34.setText(")");
        jPanel4.add(jLabel34);
        jLabel34.setBounds(290, 80, 17, 49);

        jLabel35.setBackground(new java.awt.Color(255, 255, 255));
        jLabel35.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel35.setText("!");
        jPanel4.add(jLabel35);
        jLabel35.setBounds(230, 30, 19, 29);

        c13.setBackground(new java.awt.Color(255, 255, 255));
        c13.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        c13.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.add(c13);
        c13.setBounds(170, 10, 60, 60);

        c14.setBackground(new java.awt.Color(255, 255, 255));
        c14.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        c14.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.add(c14);
        c14.setBounds(230, 90, 50, 40);

        jLabel36.setBackground(new java.awt.Color(255, 255, 255));
        jLabel36.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        jLabel36.setText("_");
        jPanel4.add(jLabel36);
        jLabel36.setBounds(190, 70, 50, 50);

        c15.setBackground(new java.awt.Color(255, 255, 255));
        c15.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        c15.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.add(c15);
        c15.setBounds(120, 90, 50, 40);

        jLabel37.setBackground(new java.awt.Color(255, 255, 255));
        jLabel37.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        jLabel37.setText("!");
        jPanel4.add(jLabel37);
        jLabel37.setBounds(310, 90, 20, 33);

        jLabel38.setBackground(new java.awt.Color(255, 255, 255));
        jLabel38.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel38.setText("=");
        jPanel4.add(jLabel38);
        jLabel38.setBounds(330, 50, 50, 60);

        answer3.setBackground(new java.awt.Color(255, 255, 255));
        answer3.setFont(new java.awt.Font("Tahoma", 1, 50)); // NOI18N
        answer3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.add(answer3);
        answer3.setBounds(370, 30, 70, 90);

        c16.setBackground(new java.awt.Color(255, 255, 255));
        c16.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        c16.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel4.add(c16);
        c16.setBounds(30, 90, 50, 40);

        jLabel39.setBackground(new java.awt.Color(255, 255, 255));
        jLabel39.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel39.setText("!");
        jPanel4.add(jLabel39);
        jLabel39.setBounds(80, 90, 20, 30);

        jPanel3.add(jPanel4);
        jPanel4.setBounds(220, 100, 460, 140);

        getContentPane().add(jPanel3);
        jPanel3.setBounds(220, 100, 460, 140);

        jPanel2.setLayout(null);

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("__________________________________________________");
        jPanel2.add(jLabel16);
        jLabel16.setBounds(30, 70, 300, 14);

        jLabel19.setBackground(new java.awt.Color(255, 255, 255));
        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        jLabel19.setText("(");
        jPanel2.add(jLabel19);
        jLabel19.setBounds(20, 20, 30, 60);

        jLabel17.setBackground(new java.awt.Color(255, 255, 255));
        jLabel17.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        jLabel17.setText(")");
        jPanel2.add(jLabel17);
        jLabel17.setBounds(270, 20, 17, 49);

        jLabel25.setBackground(new java.awt.Color(255, 255, 255));
        jLabel25.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel25.setText("!");
        jPanel2.add(jLabel25);
        jLabel25.setBounds(290, 30, 19, 29);

        c5.setBackground(new java.awt.Color(255, 255, 255));
        c5.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        c5.setText(" 1");
        c5.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(c5);
        c5.setBounds(210, 30, 60, 40);

        w1.setBackground(new java.awt.Color(255, 255, 255));
        w1.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        w1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(w1);
        w1.setBounds(40, 30, 50, 40);

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        jLabel10.setText("+");
        jPanel2.add(jLabel10);
        jLabel10.setBounds(90, 20, 30, 50);

        w2.setBackground(new java.awt.Color(255, 255, 255));
        w2.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        w2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(w2);
        w2.setBounds(120, 90, 50, 40);

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        jLabel12.setText("!");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(310, 90, 20, 33);

        jLabel13.setBackground(new java.awt.Color(255, 255, 255));
        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel13.setText("=");
        jPanel2.add(jLabel13);
        jLabel13.setBounds(330, 50, 50, 60);

        w4.setBackground(new java.awt.Color(255, 255, 255));
        w4.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        w4.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(w4);
        w4.setBounds(30, 90, 50, 40);

        jLabel26.setBackground(new java.awt.Color(255, 255, 255));
        jLabel26.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel26.setText("!");
        jPanel2.add(jLabel26);
        jLabel26.setBounds(80, 90, 20, 30);

        jLabel40.setBackground(new java.awt.Color(255, 255, 255));
        jLabel40.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        jLabel40.setText(")");
        jPanel2.add(jLabel40);
        jLabel40.setBounds(290, 80, 15, 49);

        jLabel41.setBackground(new java.awt.Color(255, 255, 255));
        jLabel41.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        jLabel41.setText("_");
        jPanel2.add(jLabel41);
        jLabel41.setBounds(190, 70, 50, 50);

        c17.setBackground(new java.awt.Color(255, 255, 255));
        c17.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        c17.setText(" 1");
        c17.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(c17);
        c17.setBounds(230, 90, 50, 40);

        w3.setBackground(new java.awt.Color(255, 255, 255));
        w3.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        w3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(w3);
        w3.setBounds(120, 30, 50, 40);

        jLabel42.setBackground(new java.awt.Color(255, 255, 255));
        jLabel42.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        jLabel42.setText("_");
        jPanel2.add(jLabel42);
        jLabel42.setBounds(180, 10, 50, 50);

        jLabel43.setBackground(new java.awt.Color(255, 255, 255));
        jLabel43.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        jLabel43.setText("(");
        jPanel2.add(jLabel43);
        jLabel43.setBounds(100, 80, 30, 60);

        answer1.setColumns(20);
        answer1.setRows(5);
        jScrollPane2.setViewportView(answer1);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(360, 10, 260, 120);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(220, 270, 630, 140);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finaldec4discrete/home.png"))); // NOI18N
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(20, 370, 60, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finaldec4discrete/1.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 20, 850, 410);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    class function1{
    public void formula() 
    {
    }
    }
    
    class Nreps extends function1{
       
       public void formula(){
             if(num.getText().equals("")|| num0.getText().equals(""))
                  {
                  JOptionPane.showMessageDialog(null,"DONT LEAVE IT BLANK ^_^");
                   } 
             else{
        BigInteger n=BigInteger.valueOf(Integer.parseInt(num.getText()));
        BigInteger k=BigInteger.valueOf(Integer.parseInt(num0.getText()));
             
       if(n.compareTo(BigInteger.valueOf(500))<=1 && k.compareTo(BigInteger.valueOf(500))<=0 && n.compareTo(k)>=0){
                        
    c1.setText(String.valueOf(n));
     c3.setText(String.valueOf(k));
     c2.setText(String.valueOf(n));
    c4.setText(String.valueOf(k));
     
     BigInteger f=BigInteger.valueOf(1);
     BigInteger f2=BigInteger.valueOf(1);
     BigInteger f3=BigInteger.valueOf(1);
     BigInteger mult=BigInteger.valueOf(1);
   
     

     for(BigInteger x=BigInteger.ONE;x.compareTo(n)<=0;x=x.add(BigInteger.ONE))
     {
        f = f.multiply(x);
     }for(BigInteger c=BigInteger.ONE;c.compareTo(k)<=0;c=c.add(BigInteger.ONE))
        {
          f2 =f2.multiply(c); 
        } 
     BigInteger sub=n.subtract(k);
        for(BigInteger u=BigInteger.ONE;u.compareTo(sub)<=0;u=u.add(BigInteger.ONE))
        {
          f3 =f3.multiply(u); 
        }
         mult=f2.multiply(f3);
                answer.setText(String.valueOf(f.divide(mult)));
            
       }else{
                 JOptionPane.showMessageDialog(null,"Sorry Invalid Input(n<r)&&(1-500 only)");
            }
       
       
       }}
    }
    class wreps extends function1{
        @Override
        public void formula(){
          
             
             BigInteger f1=BigInteger.valueOf(1);
             BigInteger f2=BigInteger.valueOf(1);
             BigInteger f3=BigInteger.valueOf(1);
             
             if(num.getText().equals("")&& num0.getText().equals(""))
                  {
                  JOptionPane.showMessageDialog(null,"DONT LEAVE IT BLANK ^_^");
                   } 
             else 
                  {
         BigInteger n=BigInteger.valueOf(Integer.parseInt(num.getText()));
         BigInteger k=BigInteger.valueOf(Integer.parseInt(num0.getText()));
         
          if(n.compareTo(BigInteger.valueOf(500))<=1 && k.compareTo(BigInteger.valueOf(500))<=0 && n.compareTo(k)>=0){
          w1.setText(String.valueOf(n));
          w2.setText(String.valueOf(n));
          w3.setText(String.valueOf(k));
          w4.setText(String.valueOf(k));
         BigInteger r1=n.subtract(BigInteger.valueOf(1));
         BigInteger r=n.add(k).subtract(BigInteger.valueOf(1));
         
        
        for(BigInteger y=BigInteger.ONE;y.compareTo(r)<=0;y=y.add(BigInteger.ONE)){
            f1=f1.multiply(y);
        }
        for(BigInteger z=BigInteger.ONE;z.compareTo(k)<=0;z=z.add(BigInteger.ONE)){
            f2=f2.multiply(z);
        }
        for(BigInteger x=BigInteger.ONE;x.compareTo(r1)<=0;x=x.add(BigInteger.ONE)){
            
            f3=f3.multiply(x);
            
        }BigInteger fin =f2.multiply(f3);
               answer1.setText(String.valueOf(f1.divide(fin)));
          }
         
          else{
             JOptionPane.showMessageDialog(null,"Sorry Invalid Input(n<r)&&(1-500 only)");
          }
          
          }}
    }
    
    
    
    
    private void computeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_computeActionPerformed
        // TODO add your handling code here:
        if(opt1.isSelected())
        {
           function1 Nreps = new Nreps();
           Nreps.formula();
        }
        else if(opt2.isSelected())
        {
           function1 Wreps = new wreps();
            Wreps.formula();
        }
        else
        {
            JOptionPane.showMessageDialog(null,"you must check one of the box");
        }
    }//GEN-LAST:event_computeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
          num.setText("");
          num0.setText("");
          w1.setText(String.valueOf(""));
          w2.setText(String.valueOf(""));
          w3.setText(String.valueOf(""));
          w4.setText(String.valueOf(""));
          c1.setText(String.valueOf(""));
          c3.setText(String.valueOf(""));
          c2.setText(String.valueOf(""));
          c4.setText(String.valueOf(""));
          answer1.setText("");
           answer.setText(String.valueOf(""));
    }//GEN-LAST:event_jButton1ActionPerformed

    private void numActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numActionPerformed
         
    }//GEN-LAST:event_numActionPerformed

    private void numKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numKeyTyped
       char mander=evt.getKeyChar();
       if(!(Character.isDigit(mander))||(mander==KeyEvent.VK_BACK_SPACE)||(mander==KeyEvent.VK_DELETE))
               {
                   evt.consume();
       }
    }//GEN-LAST:event_numKeyTyped

    private void num0KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_num0KeyTyped
          char mander=evt.getKeyChar();
       if(!(Character.isDigit(mander))||(mander==KeyEvent.VK_BACK_SPACE)||(mander==KeyEvent.VK_DELETE))
               {
                 evt.consume();
       }
    }//GEN-LAST:event_num0KeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        new index().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void num0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_num0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_num0ActionPerformed

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
            java.util.logging.Logger.getLogger(Combination.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Combination.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Combination.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Combination.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Combination().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea answer;
    private javax.swing.JTextArea answer1;
    private javax.swing.JLabel answer2;
    private javax.swing.JLabel answer3;
    private javax.swing.JLabel c1;
    private javax.swing.JLabel c10;
    private javax.swing.JLabel c11;
    private javax.swing.JLabel c12;
    private javax.swing.JLabel c13;
    private javax.swing.JLabel c14;
    private javax.swing.JLabel c15;
    private javax.swing.JLabel c16;
    private javax.swing.JLabel c17;
    private javax.swing.JLabel c2;
    private javax.swing.JLabel c3;
    private javax.swing.JLabel c4;
    private javax.swing.JLabel c5;
    private javax.swing.JLabel c9;
    private javax.swing.JButton compute;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField num;
    private javax.swing.JTextField num0;
    private javax.swing.JCheckBox opt1;
    private javax.swing.JCheckBox opt2;
    private javax.swing.JLabel w1;
    private javax.swing.JLabel w2;
    private javax.swing.JLabel w3;
    private javax.swing.JLabel w4;
    // End of variables declaration//GEN-END:variables
}
