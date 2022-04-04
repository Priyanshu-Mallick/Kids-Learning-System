
import jaco.mp3.player.MP3Player;
import java.io.File;
import java.util.Random;
import javax.swing.JOptionPane;
public class Prime extends javax.swing.JFrame {
static int score=0;
    public static int count=0;
   public  static int l=0;
    Random r=new Random();
    int randomNum;
    public Prime() {
        initComponents();
        randomNum=r.nextInt(100);
        lblNumber.setText(String.valueOf(randomNum));
    }
public static final String SONG="D:\\Dipti\\KidsLearningSystem\\Audio file\\Correct-Answer-3-Sound-Effect_0ZQ-Lk--ILE.mp3";
MP3Player mp3player=new MP3Player(new File(SONG));
public static final String Song2="D:\\Dipti\\KidsLearningSystem\\Audio file\\Game-Over-Sound-Effect-HD_NN_8vfN0HP4.mp3";
MP3Player mp3player2=new MP3Player(new File(Song2));
public static final String Song3="D:\\Dipti\\KidsLearningSystem\\Audio file\\Buzzer-Wrong-Answer-Gaming-Sound-Effect-HD_FRpq7o1mKXY.mp3";
MP3Player mp3player3=new MP3Player(new File(Song3));
public static final String SONG4="D:\\Dipti\\KidsLearningSystem\\Audio file\\Mouse-Click-Sound-Effect-HD_h6_8SlZZwvQ.mp3";
MP3Player mp3player4=new MP3Player(new File(SONG4));

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        lblNumber = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/11prime.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 220, 130));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/11not prime.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, 220, 130));

        lblNumber.setFont(new java.awt.Font("Tahoma", 1, 78)); // NOI18N
        lblNumber.setForeground(new java.awt.Color(255, 0, 51));
        getContentPane().add(lblNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, 151, 98));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sc.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 600, 350, 110));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/3D-Red-Heart-Image.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 10, 50, 40));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/3D-Red-Heart-Image.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, 40));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/3D-Red-Heart-Image.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 10, 50, 40));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(102, 255, 0));
        jLabel5.setText("/");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 620, -1, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(102, 255, 0));
        jLabel6.setText("00");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 630, 70, 60));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Pre077.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 50, 50));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(102, 255, 0));
        jLabel8.setText("00");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 630, 70, 60));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giphy (1).gif"))); // NOI18N
        jLabel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 255, 0), 5, true));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
       
       int num=Integer.parseInt(lblNumber.getText());
       if(count==40)
       {
        int a=1;
        int c=0;
        while(a<=num)
        {
            if(num%a==0)
            {
                c=c+1;
                a=a+1;
            }
            else
            {
                a=a+1;
            }
        }//end of while block
        if(c==2)
        {
            mp3player.play();
            score=score+1;
           jLabel8.setText(String.valueOf(score));
            randomNum=r.nextInt(100);
        }
        else
        {
            mp3player3.play();
            l=l+1;         
            if(l==1){
                jLabel1.setVisible(false);
                new Warning().setVisible(true);
            }
            if(l==2){
                jLabel3.setVisible(false);
                new Warning2().setVisible(true);
            }
            if(l==3){
                jLabel4.setVisible(false);
                
            }
            randomNum=r.nextInt(100);
            lblNumber.setText(String.valueOf(randomNum));              
        }
         JOptionPane.showMessageDialog(this,"Your score is: "+score+"/"+count);
           mp3player2.play();
         new GameOver().setVisible(true);
                 GameOver x=new GameOver();
     GameOver.jLabel10.setText(Prime.jLabel8.getText());
          x.setVisible(true);
           if(score<=5){
               GameOver.jLabel16.setVisible(true);
               GameOver.jLabel13.setVisible(false);
               GameOver.jLabel7.setVisible(false);
               GameOver.jLabel14.setVisible(false); 
               GameOver.jLabel15.setVisible(false);
               
           }
           else{
               if(score<=15){
                GameOver.jLabel16.setVisible(true);
               GameOver.jLabel13.setVisible(true);
               GameOver.jLabel7.setVisible(false);
               GameOver.jLabel14.setVisible(false);
               GameOver.jLabel15.setVisible(false);
               }
                else{
               if(score<=30){
                GameOver.jLabel16.setVisible(true);
               GameOver.jLabel13.setVisible(true);
               GameOver.jLabel7.setVisible(true);
               GameOver.jLabel14.setVisible(true);
                GameOver.jLabel15.setVisible(true);     
               }
               else{
               if(score<=40){
                GameOver.jLabel16.setVisible(true);
                GameOver.jLabel13.setVisible(true);
                GameOver.jLabel7.setVisible(true);
                GameOver.jLabel14.setVisible(false);
                GameOver.jLabel15.setVisible(false);
                }
               else{
                  GameOver.jLabel16.setVisible(true);
                GameOver.jLabel13.setVisible(true);
                GameOver.jLabel7.setVisible(true);
                GameOver.jLabel14.setVisible(true);
                GameOver.jLabel15.setVisible(true);    

               }
               
           }
           }
           }
           setVisible(false);
score=0;count=0;l=0;
           randomNum=r.nextInt(50);
           lblNumber.setText(String.valueOf(randomNum));
           
       }
       else{
           int a=1;
        int c=0;
        while(a<=num)
        {
            if(num%a==0)
            {
                c=c+1;
                a=a+1;
            }
            else
            {
                a=a+1;
            }
        }//end of while block
        if(c==2)
        {
            mp3player.play();
               count=count+1;
               jLabel6.setText(String.valueOf(count));
               score=score+1;
               jLabel8.setText(String.valueOf(score));
               randomNum=r.nextInt(50);
               lblNumber.setText(String.valueOf(randomNum));
               
           }else{
            mp3player3.play();
             count=count+1;
               jLabel6.setText(String.valueOf(count));
              
            l=l+1;         
            if(l==1){
                jLabel1.setVisible(false);
                new Warning().setVisible(true);
            }
            if(l==2){
                jLabel3.setVisible(false);
                new Warning2().setVisible(true);
            }
            if(l==3){
               jLabel4. setVisible(false);
                 JOptionPane.showMessageDialog(this,"Your score is: "+score+"/"+count);
           mp3player2.play();
         new GameOver().setVisible(true);
           setVisible(false);
           GameOver x=new GameOver();
       GameOver.jLabel10.setText(Prime.jLabel8.getText());
          x.setVisible(true);
            if(score<=5){
               GameOver.jLabel16.setVisible(true);
               GameOver.jLabel13.setVisible(false);
               GameOver.jLabel7.setVisible(false);
               GameOver.jLabel14.setVisible(false); 
               GameOver.jLabel15.setVisible(false);
               
           }
           else{
               if(score<=15){
                GameOver.jLabel16.setVisible(true);
               GameOver.jLabel13.setVisible(true);
               GameOver.jLabel7.setVisible(false);
               GameOver.jLabel14.setVisible(false);
               GameOver.jLabel15.setVisible(false);
               }
                else{
               if(score<=30){
                GameOver.jLabel16.setVisible(true);
               GameOver.jLabel13.setVisible(true);
               GameOver.jLabel7.setVisible(true);
               GameOver.jLabel14.setVisible(true);
                GameOver.jLabel15.setVisible(true);     
               }
               else{
               if(score<=40){
                GameOver.jLabel16.setVisible(true);
                GameOver.jLabel13.setVisible(true);
                GameOver.jLabel7.setVisible(true);
                GameOver.jLabel14.setVisible(false);
                GameOver.jLabel15.setVisible(false);
                }
               else{
                  GameOver.jLabel16.setVisible(true);
                GameOver.jLabel13.setVisible(true);
                GameOver.jLabel7.setVisible(true);
                GameOver.jLabel14.setVisible(true);
                GameOver.jLabel15.setVisible(true);    

               }
               
           }
           }
           }
            }
               randomNum=r.nextInt(50);
               lblNumber.setText(String.valueOf(randomNum));
           }
       }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

       int num=Integer.parseInt(lblNumber.getText());
       if(count==40)
       {
        int a=1;
        int c=0;
        while(a<=num)
        {
            if(num%a==0)
            {
                c=c+1;
                a=a+1;
            }
            else
            {
                a=a+1;
            }
        }//end of while block
        if(c!=2)
        {
             mp3player.play();
            score=score+1;
            jLabel8.setText(String.valueOf(score));
            randomNum=r.nextInt(50);
        }
        else
        {
            mp3player3.play();
             l=l+1;         
            if(l==1){
                jLabel1.setVisible(false);
                new Warning().setVisible(true);
            }
            if(l==2){
                jLabel3.setVisible(false);
                new Warning2().setVisible(false);
            }
            if(l==3){
                jLabel4.setVisible(false);
                new Warning2().setVisible(true);
            }
            randomNum=r.nextInt(50);
            lblNumber.setText(String.valueOf(randomNum));
               
        }
         JOptionPane.showMessageDialog(this,"Your score is: "+score+"/"+count);
           randomNum=r.nextInt(50);
           lblNumber.setText(String.valueOf(randomNum));
           GameOver x=new GameOver();
      GameOver.jLabel10.setText(String.valueOf(score));
          x.setVisible(true);
           if(score<=5){
               GameOver.jLabel16.setVisible(true);
               GameOver.jLabel13.setVisible(false);
               GameOver.jLabel7.setVisible(false);
               GameOver.jLabel14.setVisible(false); 
               GameOver.jLabel15.setVisible(false);
               
           }
           else{
               if(score<=15){
                GameOver.jLabel16.setVisible(true);
               GameOver.jLabel13.setVisible(true);
               GameOver.jLabel7.setVisible(false);
               GameOver.jLabel14.setVisible(false);
               GameOver.jLabel15.setVisible(false);
               }
                else{
               if(score<=30){
                GameOver.jLabel16.setVisible(true);
               GameOver.jLabel13.setVisible(true);
               GameOver.jLabel7.setVisible(true);
               GameOver.jLabel14.setVisible(true);
                GameOver.jLabel15.setVisible(true);     
               }
               else{
               if(score<=40){
                GameOver.jLabel16.setVisible(true);
                GameOver.jLabel13.setVisible(true);
                GameOver.jLabel7.setVisible(true);
                GameOver.jLabel14.setVisible(false);
                GameOver.jLabel15.setVisible(false);
                }
               else{
                  GameOver.jLabel16.setVisible(true);
                GameOver.jLabel13.setVisible(true);
                GameOver.jLabel7.setVisible(true);
                GameOver.jLabel14.setVisible(true);
                GameOver.jLabel15.setVisible(true);    

               }
               
           }
           }
           }
           
       }
       else{
           int a=1;
        int c=0;
        while(a<=num)
        {
            if(num%a==0)
            {
                c=c+1;
                a=a+1;
            }
            else
            {
                a=a+1;
            }
        }//end of while block
        if(c!=2)
        {
            count=count+1;
            jLabel6.setText(String.valueOf(count));
            mp3player.play();
               score=score+1;
               jLabel8.setText(String.valueOf(score));
               randomNum=r.nextInt(50);
               lblNumber.setText(String.valueOf(randomNum));
               
           }else{
            mp3player3.play();
             count=count+1;
            jLabel6.setText(String.valueOf(count));

             l=l+1;  
             
            if(l==1){
                jLabel1.setVisible(false);
                new Warning().setVisible(true);
            }
            if(l==2){
                jLabel3.setVisible(false);
                 new Warning2().setVisible(true);
            }
            if(l==3){
                jLabel4.setVisible(false);
                 JOptionPane.showMessageDialog(this,"Your score is: "+score+"/"+count);
           mp3player2.play();
         new  Prime(). setVisible(false);
           GameOver x=new GameOver();
           GameOver.jLabel10.setText(Prime.jLabel8.getText());
          x.setVisible(true);
          if(score<=5){
               GameOver.jLabel16.setVisible(true);
               GameOver.jLabel13.setVisible(false);
               GameOver.jLabel7.setVisible(false);
               GameOver.jLabel14.setVisible(false); 
               GameOver.jLabel15.setVisible(false);
               
           }
           else{
               if(score<=15){
                GameOver.jLabel16.setVisible(true);
               GameOver.jLabel13.setVisible(true);
               GameOver.jLabel7.setVisible(false);
               GameOver.jLabel14.setVisible(false);
               GameOver.jLabel15.setVisible(false);
               }
                else{
               if(score<=30){
                GameOver.jLabel16.setVisible(true);
               GameOver.jLabel13.setVisible(true);
               GameOver.jLabel7.setVisible(true);
               GameOver.jLabel14.setVisible(true);
                GameOver.jLabel15.setVisible(true);     
               }
               else{
               if(score<=40){
                GameOver.jLabel16.setVisible(true);
                GameOver.jLabel13.setVisible(true);
                GameOver.jLabel7.setVisible(true);
                GameOver.jLabel14.setVisible(false);
                GameOver.jLabel15.setVisible(false);
                }
               else{
                  GameOver.jLabel16.setVisible(true);
                GameOver.jLabel13.setVisible(true);
                GameOver.jLabel7.setVisible(true);
                GameOver.jLabel14.setVisible(true);
                GameOver.jLabel15.setVisible(true);    

               }
               
           }
           }
           }
            }
               randomNum=r.nextInt(50);
               lblNumber.setText(String.valueOf(randomNum));
           }
       }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
         mp3player4.play();
        int a=JOptionPane.showConfirmDialog(null,"Do you really want to stop playing","Select",JOptionPane.YES_NO_OPTION);
        if(a==0)
        {           
            new Math().setVisible(true);
             setVisible(false);
        }
        
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(Prime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Prime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Prime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Prime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Prime().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public static javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    public static javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblNumber;
    // End of variables declaration//GEN-END:variables
}
