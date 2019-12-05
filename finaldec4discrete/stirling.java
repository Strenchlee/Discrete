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
public class stirling extends javax.swing.JFrame {

    /**
     * Creates new form stirling
     */
    public stirling() {
        initComponents();
    }

   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        num1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        num2 = new javax.swing.JTextField();
        compute = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        answer = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(757, 547));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Impact", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("  STIRLING SECOND KIND");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(110, 10, 530, 90);

        num1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                num1KeyTyped(evt);
            }
        });
        getContentPane().add(num1);
        num1.setBounds(120, 250, 60, 30);

        jLabel3.setFont(new java.awt.Font("Berlin Sans FB", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("ENTER  N:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(40, 260, 70, 18);

        jLabel4.setFont(new java.awt.Font("Berlin Sans FB", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ENTER  K:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 290, 70, 30);

        num2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                num2KeyTyped(evt);
            }
        });
        getContentPane().add(num2);
        num2.setBounds(120, 290, 60, 30);

        compute.setText("COMPUTE");
        compute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                computeActionPerformed(evt);
            }
        });
        getContentPane().add(compute);
        compute.setBounds(40, 330, 140, 30);

        jButton1.setText("RESET");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(40, 370, 140, 23);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finaldec4discrete/home.png"))); // NOI18N
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(30, 410, 60, 50);

        jPanel1.setLayout(null);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finaldec4discrete/79ac7d5a1d742b3652ad55b4865ae154d44b66d4.png"))); // NOI18N
        jPanel1.add(jLabel6);
        jLabel6.setBounds(20, 10, 600, 130);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(50, 100, 630, 140);

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 40)); // NOI18N
        jLabel11.setText("=");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(230, 300, 50, 60);

        answer.setColumns(20);
        answer.setRows(5);
        jScrollPane1.setViewportView(answer);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(270, 260, 420, 140);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/finaldec4discrete/1.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(22, 11, 680, 460);

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
     
    

    private void computeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_computeActionPerformed
          if(num1.getText().equals("")||num2.getText().equals("") )
                  {
                  JOptionPane.showMessageDialog(null,"DONT LEAVE IT BLANK ^_^");
                   } 
             else{
             BigInteger n=BigInteger.valueOf(Integer.parseInt(num1.getText()));
             BigInteger k=BigInteger.valueOf(Integer.parseInt(num2.getText()));
             
           if(n.compareTo(BigInteger.valueOf(500))<=1&& k.compareTo(BigInteger.valueOf(500))<=1 && n.compareTo(k)>=1){
                long n3=n.longValue();
                long r1=k.longValue();
               answer.setText(String.valueOf(stir(n3,r1)));
  
    }else{
           JOptionPane.showMessageDialog(null,"Sorry Invalid Input(1-500 only)");
           } }}
    
     public static BigInteger stir(long n, long r){
   
            long n1 = r;
            long n2 = r;
            
            BigInteger factorial = new BigInteger("1");
            BigInteger next = new BigInteger("0");
            BigInteger last = new BigInteger("0");
            BigInteger comp = new BigInteger("0");
            BigInteger help = new BigInteger("-1");
            
            for(int q = 0; q < r; q++){
                last = last.add(stir2(n, r, q, n1));
                
                n1--;
            }
        
            // R!
            for(int a = 1; a <=  n2; a++){
                factorial = factorial.multiply(BigInteger.valueOf(a));
            }
                        
            next = last.divide(factorial);
            
            if(next.compareTo(comp) < 0){
                next = next.multiply(help);
                return next;
            }
            else{
                return next;
            }
    }
    
    public static BigInteger stir2(long n, long r, long m, long p){
            long nnum1 = n;
            long xnum1 = m;
            long rnum1 = r;
            long rnum2 = r;
            long xnum2 = rnum2 -  m;
            
            int res = 1;
            int mul = -1;
            
            BigInteger resultN = new BigInteger("1");
            BigInteger resultR = new BigInteger("1");
            BigInteger resultNR = new BigInteger("1");
            BigInteger xresult;
            BigInteger zresult;
            
            long X = rnum1 - m;
            
            BigInteger res2 = new BigInteger("1");
            
            BigInteger F1 = new BigInteger("0");
            BigInteger F2 = new BigInteger("0");
            BigInteger XF = new BigInteger("0");
                    
            // (-1)^j
            for(; xnum1 <= r; xnum1++){
                res *=  mul;
            }
            //Combination
            //N!
            for(long a = 1; a <= rnum1; a++){
                resultN =  resultN.multiply(BigInteger.valueOf(a));
            }
            
            //R!
            for(long b =1; b <= m; b++){
                resultR = resultR.multiply(BigInteger.valueOf(b));
            }
            
            //(N-R)!
            for(long c = 1; c <= X; c++){
                resultNR = resultNR.multiply(BigInteger.valueOf(c));
            }
            
            //R! (N-R)!
                xresult = resultR.multiply(resultNR);
                
            //N! / R! (N-R)!
                zresult = resultN.divide(xresult);
                
            //(R-i) ^ N
            while(n != 0){
                res2 = res2.multiply(BigInteger.valueOf(xnum2));
                
                n--;
            }
            
            //num (-1) ^ i * (jCi) * (j-i) ^ n
            F1 = zresult.multiply(BigInteger.valueOf(res));
            F2 = F1.multiply(res2);
   
            return F2;
    }//GEN-LAST:event_computeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        num1.setText("");
        num2.setText("");
        answer.setText("");

    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(stirling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(stirling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(stirling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(stirling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new stirling().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea answer;
    private javax.swing.JButton compute;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField num1;
    private javax.swing.JTextField num2;
    // End of variables declaration//GEN-END:variables
}
