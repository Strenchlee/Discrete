/*
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
public class probabilty extends javax.swing.JFrame {

    /**
     * Creates new form probabilty
     */
    public probabilty() {
        initComponents();
    }
//polymorp
    class function{
        public void formula(){
        }
}
    class nreps extends function
    {
        public  void formula()
        {
             if(num1.getText().equals("")|| num2.getText().equals(""))
                  {
                  JOptionPane.showMessageDialog(null,"DONT LEAVE IT BLANK ^_^");
                   } 
             else{
             BigInteger n=BigInteger.valueOf(Integer.parseInt(num1.getText()));
             BigInteger r=BigInteger.valueOf(Integer.parseInt(num2.getText()));
             
            
            if(n.compareTo(BigInteger.valueOf(500))<=1 && r.compareTo(BigInteger.valueOf(500))<=0 && n.compareTo(r)>=0){
               
            setnum1.setText(String.valueOf(n));
            setnum2.setText(String.valueOf(r));
            setnum3.setText(String.valueOf(n));
             BigInteger sub;
       
                BigInteger f=BigInteger.valueOf(1);

            BigInteger f1=BigInteger.valueOf(1);
            sub=n.subtract(r);

            for(BigInteger c=BigInteger.ONE;c.compareTo(sub)<=0;c=c.add(BigInteger.ONE)){
                f1=f1.multiply(c);

            }  for(BigInteger x=BigInteger.ONE;x.compareTo(n)<=0;x=x.add(BigInteger.ONE)){

                f =f.multiply(x);

            }answer.setText(String.valueOf(f.divide(f1)));
          
            }else{
                 JOptionPane.showMessageDialog(null,"Sorry Invalid Input(1-500 only)");
            }
            
        }}
}
    class wreps extends function{
        public void formula(){
            if(num1.getText().equals("")||num2.getText().equals(""))
                  {
                  JOptionPane.showMessageDialog(null,"DONT LEAVE IT BLANK ^_^");
                   } 
             else{
            BigInteger n=BigInteger.valueOf(Integer.parseInt(num1.getText()));
            int   r=Integer.parseInt(num2.getText());
             if(n.compareTo(BigInteger.valueOf(500))<=1 && r<=500 && n.compareTo(BigInteger.valueOf(r))>=0){
            expo.setText(String.valueOf(r));
            base.setText(String.valueOf(n));
            
           BigInteger result =n.pow(r);
             answer5.setText(String.valueOf(result));
             }else{
                 JOptionPane.showMessageDialog(null,"Sorry Invalid Input(1-500 only)");
            }
        }}
    }
  
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        num1 = new javax.swing.JTextField();
        num2 = new javax.swing.JTextField();
        compute = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        setnum1 = new javax.swing.JLabel();
        setnum2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        setnum3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        answer = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        base = new javax.swing.JLabel();
        expo = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        answer5 = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        opt1 = new javax.swing.JCheckBox();
        opt2 = new javax.swing.JCheckBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(911, 475));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Impact", 1, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("          PERMUTATION");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(90, 10, 530, 90);

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ENTER  N:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 110, 70, 18);

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ENTER  R:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(60, 140, 70, 30);

        num1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                num1KeyTyped(evt);
            }
        });
        getContentPane().add(num1);
        num1.setBounds(140, 100, 60, 30);

        num2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                num2KeyTyped(evt);
            }
        });
        getContentPane().add(num2);
        num2.setBounds(140, 140, 60, 30);

        compute.setText("COMPUTE");
        compute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                computeActionPerformed(evt);
            }
        });
        getContentPane().add(compute);
        compute.setBounds(60, 270, 140, 30);

        jPanel1.setLayout(null);

        jLabel15.setBackground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("___________________________");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(50, 70, 170, 14);

        jLabel18.setBackground(new java.awt.Color(255, 255, 255));
        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        jLabel18.setText("(");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(30, 80, 30, 60);

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        jLabel14.setText(")");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(220, 80, 17, 49);

        jLabel23.setBackground(new java.awt.Color(255, 255, 255));
        jLabel23.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel23.setText("!");
        jPanel1.add(jLabel23);
        jLabel23.setBounds(160, 30, 19, 29);

        setnum1.setBackground(new java.awt.Color(255, 255, 255));
        setnum1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        setnum1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(setnum1);
        setnum1.setBounds(100, 10, 60, 60);

        setnum2.setBackground(new java.awt.Color(255, 255, 255));
        setnum2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        setnum2.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(setnum2);
        setnum2.setBounds(160, 90, 50, 40);

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        jLabel8.setText("_");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(120, 70, 50, 50);

        setnum3.setBackground(new java.awt.Color(255, 255, 255));
        setnum3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        setnum3.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(setnum3);
        setnum3.setBounds(50, 90, 50, 40);

        jLabel9.setBackground(new java.awt.Color(255, 255, 255));
        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 40)); // NOI18N
        jLabel9.setText("!");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(240, 90, 20, 33);

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel11.setText("=");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(260, 50, 50, 60);

        answer.setColumns(20);
        answer.setRows(5);
        jScrollPane1.setViewportView(answer);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(310, 10, 290, 120);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(230, 90, 610, 140);

        jPanel2.setLayout(null);

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel12.setText("=");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(150, 30, 50, 60);

        base.setBackground(new java.awt.Color(255, 255, 255));
        base.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        base.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(base);
        base.setBounds(60, 40, 60, 60);

        expo.setBackground(new java.awt.Color(255, 255, 255));
        expo.setFont(new java.awt.Font("Tahoma", 0, 10)); // NOI18N
        expo.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel2.add(expo);
        expo.setBounds(120, 20, 30, 30);

        answer5.setColumns(20);
        answer5.setRows(5);
        jScrollPane2.setViewportView(answer5);

        jPanel2.add(jScrollPane2);
        jScrollPane2.setBounds(200, 10, 390, 96);

        getContentPane().add(jPanel2);
        jPanel2.setBounds(240, 270, 600, 120);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("WITH REPETITION");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(240, 230, 220, 30);

        opt1.setBackground(new java.awt.Color(153, 153, 153));
        opt1.setForeground(new java.awt.Color(255, 255, 255));
        opt1.setText("no repetition");
        getContentPane().add(opt1);
        opt1.setBounds(91, 190, 110, 23);

        opt2.setBackground(new java.awt.Color(153, 153, 153));
        opt2.setForeground(new java.awt.Color(255, 255, 255));
        opt2.setText("repetition");
        getContentPane().add(opt2);
        opt2.setBounds(91, 230, 110, 23);

        jButton1.setText("RESET");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(60, 310, 140, 23);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finaldec4discrete/home.png"))); // NOI18N
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(20, 360, 60, 50);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finaldec4discrete/1.jpg"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(10, 10, 840, 410);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void computeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_computeActionPerformed
        // TODO add your handling code here:
        if(opt1.isSelected()){
        function Nreps = new nreps();
        Nreps.formula();
        }else if(opt2.isSelected()){
            function Wreps = new wreps();
            Wreps.formula();
        }else{
            JOptionPane.showMessageDialog(null,"you must check one of the box"
            );
                                   
            
        }
    }//GEN-LAST:event_computeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        num1.setText("");
        num2.setText("");
        setnum1.setText("");
         setnum2.setText("");
         setnum3.setText("");
         expo.setText("");
         base.setText("");
         answer5.setText("");
         answer.setText("");
         
    }//GEN-LAST:event_jButton1ActionPerformed

    private void num1KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_num1KeyTyped
       char mander=evt.getKeyChar();
       if(!(Character.isDigit(mander))||(mander==KeyEvent.VK_BACK_SPACE)||(mander==KeyEvent.VK_DELETE))
               {
                   evt.consume();
       }
    }//GEN-LAST:event_num1KeyTyped

    private void num2KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_num2KeyTyped
          char mander=evt.getKeyChar();
       if(!(Character.isDigit(mander))||(mander==KeyEvent.VK_BACK_SPACE)||(mander==KeyEvent.VK_DELETE))
               {
                   evt.consume();
       }
    }//GEN-LAST:event_num2KeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
         new index().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(probabilty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(probabilty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(probabilty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(probabilty.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
         

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new probabilty().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea answer;
    private javax.swing.JTextArea answer5;
    private javax.swing.JLabel base;
    private javax.swing.JButton compute;
    private javax.swing.JLabel expo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField num1;
    private javax.swing.JTextField num2;
    private javax.swing.JCheckBox opt1;
    private javax.swing.JCheckBox opt2;
    private javax.swing.JLabel setnum1;
    private javax.swing.JLabel setnum2;
    private javax.swing.JLabel setnum3;
    // End of variables declaration//GEN-END:variables
}
