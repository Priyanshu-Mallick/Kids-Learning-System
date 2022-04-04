

import jaco.mp3.player.MP3Player;
import java.io.File;
import java.util.Random;
import javax.swing.JOptionPane;
public class ODDEven extends javax.swing.JFrame {
    static int score=0;
    static int count=0;
    static int k=0;
    Random r=new Random();
    int randomNum;
    public ODDEven() {
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

        lblNumber = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        Lblscore = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblNumber.setFont(new java.awt.Font("Tahoma", 1, 85)); // NOI18N
        lblNumber.setForeground(new java.awt.Color(255, 255, 0));
        getContentPane().add(lblNumber, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 200, 150));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/od.png"))); // NOI18N
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, 150, 70));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ev.png"))); // NOI18N
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 400, 150, 70));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/sc2.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-50, 650, 290, 90));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/3D-Red-Heart-Image.png"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 10, 60, -1));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/3D-Red-Heart-Image.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/3D-Red-Heart-Image.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 10, -1, -1));

        Lblscore.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        Lblscore.setForeground(new java.awt.Color(51, 255, 0));
        Lblscore.setText("0");
        getContentPane().add(Lblscore, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 670, 90, 50));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/PRE.png"))); // NOI18N
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 50, 50));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 255, 0));
        jLabel6.setText("/");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 660, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 255, 0));
        jLabel5.setText("0");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 670, 70, 50));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/giphy (1).gif"))); // NOI18N
        jLabel7.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(153, 255, 0), 5, true));
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      
        int num=Integer.parseInt(lblNumber.getText());
        count=count+1;
        if(count==50){
            
           if(num%2!=0)
           {
              mp3player.play();
               score=score+1;
              Lblscore.setText(String.valueOf(score));
              jLabel5.setText(String.valueOf(count));
                         }
           else{
                jLabel5.setText(String.valueOf(count));
               k=k+1;         
            if(k==1){
                jLabel2.setVisible(false);
                new Warning().setVisible(true);
            }
            if(k==2){
                jLabel3.setVisible(false);
                new Warning2().setVisible(true);
            }
            if(k==3){
                jLabel4.setVisible(false);
                new Warning3().setVisible(true);
                setVisible(false);
               GameOverOddEven x=new GameOverOddEven();
     GameOverOddEven.jLabel10.setText(ODDEven.Lblscore.getText());
          x.setVisible(true);
           if(score<=5){
               GameOverOddEven.jLabel16.setVisible(true);
               GameOverOddEven.jLabel13.setVisible(false);
               GameOverOddEven.jLabel7.setVisible(false);
               GameOverOddEven.jLabel14.setVisible(false); 
               GameOverOddEven.jLabel15.setVisible(false);
               
           }
           else{
               if(score<=15){
                GameOverOddEven.jLabel16.setVisible(true);
               GameOverOddEven.jLabel13.setVisible(true);
               GameOverOddEven.jLabel7.setVisible(false);
               GameOverOddEven.jLabel14.setVisible(false);
               GameOverOddEven.jLabel15.setVisible(false);
               }
                else{
               if(score<=30){
                GameOverOddEven.jLabel16.setVisible(true);
               GameOverOddEven.jLabel13.setVisible(true);
               GameOverOddEven.jLabel7.setVisible(true);
               GameOverOddEven.jLabel14.setVisible(true);
                GameOverOddEven.jLabel15.setVisible(true);     
               }
               else{
               if(score<=40){
                GameOverOddEven.jLabel16.setVisible(true);
                GameOverOddEven.jLabel13.setVisible(true);
                GameOverOddEven.jLabel7.setVisible(true);
                GameOverOddEven.jLabel14.setVisible(false);
                GameOverOddEven.jLabel15.setVisible(false);
                }
               else{
                  GameOverOddEven.jLabel16.setVisible(true);
                GameOverOddEven.jLabel13.setVisible(true);
                GameOverOddEven.jLabel7.setVisible(true);
                GameOverOddEven.jLabel14.setVisible(true);
                GameOverOddEven.jLabel15.setVisible(true);    

               }
               
           }
               }}
                
                
            }              
                mp3player3.play();
                         
           }
            
           JOptionPane.showMessageDialog(this,"Your score is: "+score+"/"+count);
           mp3player2.play();
            GameOverOddEven x=new GameOverOddEven();
     GameOverOddEven.jLabel10.setText(ODDEven.Lblscore.getText());
          x.setVisible(true);
           if(score<=5){
               GameOverOddEven.jLabel16.setVisible(true);
               GameOverOddEven.jLabel13.setVisible(false);
               GameOverOddEven.jLabel7.setVisible(false);
               GameOverOddEven.jLabel14.setVisible(false); 
               GameOverOddEven.jLabel15.setVisible(false);
               
           }
           else{
               if(score<=15){
                GameOverOddEven.jLabel16.setVisible(true);
               GameOverOddEven.jLabel13.setVisible(true);
               GameOverOddEven.jLabel7.setVisible(false);
               GameOverOddEven.jLabel14.setVisible(false);
               GameOverOddEven.jLabel15.setVisible(false);
               }
                else{
               if(score<=30){
                GameOverOddEven.jLabel16.setVisible(true);
               GameOverOddEven.jLabel13.setVisible(true);
               GameOverOddEven.jLabel7.setVisible(true);
               GameOverOddEven.jLabel14.setVisible(true);
                GameOverOddEven.jLabel15.setVisible(true);     
               }
               else{
               if(score<=40){
                GameOverOddEven.jLabel16.setVisible(true);
                GameOverOddEven.jLabel13.setVisible(true);
                GameOverOddEven.jLabel7.setVisible(true);
                GameOverOddEven.jLabel14.setVisible(false);
                GameOverOddEven.jLabel15.setVisible(false);
                }
               else{
                  GameOverOddEven.jLabel16.setVisible(true);
                GameOverOddEven.jLabel13.setVisible(true);
                GameOverOddEven.jLabel7.setVisible(true);
                GameOverOddEven.jLabel14.setVisible(true);
                GameOverOddEven.jLabel15.setVisible(true);    

               }
               
           }
               }}
           
           setVisible(false);
        }
        else{
        
           if(num%2!=0)
           {
              mp3player.play();
               score=score+1;
              Lblscore.setText(String.valueOf(score));
              jLabel5.setText(String.valueOf(count));
                         }
           else{
                jLabel5.setText(String.valueOf(count));
               k=k+1;         
            if(k==1){
                jLabel2.setVisible(false);
                new Warning().setVisible(true);
            }
            if(k==2){
                jLabel3.setVisible(false);
                new Warning2().setVisible(true);
            }
            if(k==3){
                jLabel4.setVisible(false);
                new Warning3().setVisible(true);
                GameOverOddEven x=new GameOverOddEven();
     GameOverOddEven.jLabel10.setText(ODDEven.Lblscore.getText());
          x.setVisible(true);
           if(score<=5){
               GameOverOddEven.jLabel16.setVisible(true);
               GameOverOddEven.jLabel13.setVisible(false);
               GameOverOddEven.jLabel7.setVisible(false);
               GameOverOddEven.jLabel14.setVisible(false); 
               GameOverOddEven.jLabel15.setVisible(false);
               
           }
           else{
               if(score<=15){
                GameOverOddEven.jLabel16.setVisible(true);
               GameOverOddEven.jLabel13.setVisible(true);
               GameOverOddEven.jLabel7.setVisible(false);
               GameOverOddEven.jLabel14.setVisible(false);
               GameOverOddEven.jLabel15.setVisible(false);
               }
                else{
               if(score<=30){
                GameOverOddEven.jLabel16.setVisible(true);
               GameOverOddEven.jLabel13.setVisible(true);
               GameOverOddEven.jLabel7.setVisible(true);
               GameOverOddEven.jLabel14.setVisible(true);
                GameOverOddEven.jLabel15.setVisible(true);     
               }
               else{
               if(score<=40){
                GameOverOddEven.jLabel16.setVisible(true);
                GameOverOddEven.jLabel13.setVisible(true);
                GameOverOddEven.jLabel7.setVisible(true);
                GameOverOddEven.jLabel14.setVisible(false);
                GameOverOddEven.jLabel15.setVisible(false);
                }
               else{
                  GameOverOddEven.jLabel16.setVisible(true);
                GameOverOddEven.jLabel13.setVisible(true);
                GameOverOddEven.jLabel7.setVisible(true);
                GameOverOddEven.jLabel14.setVisible(true);
                GameOverOddEven.jLabel15.setVisible(true);    

               }
               
           }
               }}
                setVisible(false);
                
            }              
                mp3player3.play();
                         
           }
            
           
            randomNum=r.nextInt(100);
             lblNumber.setText(String.valueOf(randomNum));
    }
                    
      
       
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
int num=Integer.parseInt(lblNumber.getText());
      count=count+1;
      if(count==50){
           if(num%2==0)
           {
                mp3player.play();
               score=score+1;
               Lblscore.setText(String.valueOf(score));
               jLabel5.setText(String.valueOf(count));
           }                    
          else{
                k=k+1;   
                jLabel5.setText(String.valueOf(count));
            if(k==1){
                jLabel2.setVisible(false);
            }
            if(k==2){
                jLabel3.setVisible(false);
            }
            if(k==3){
                jLabel4.setVisible(false);
                 GameOverOddEven x=new GameOverOddEven();
     GameOverOddEven.jLabel10.setText(ODDEven.Lblscore.getText());
          x.setVisible(true);
           if(score<=5){
               GameOverOddEven.jLabel16.setVisible(true);
               GameOverOddEven.jLabel13.setVisible(false);
               GameOverOddEven.jLabel7.setVisible(false);
               GameOverOddEven.jLabel14.setVisible(false); 
               GameOverOddEven.jLabel15.setVisible(false);
               
           }
           else{
               if(score<=15){
                GameOverOddEven.jLabel16.setVisible(true);
               GameOverOddEven.jLabel13.setVisible(true);
               GameOverOddEven.jLabel7.setVisible(false);
               GameOverOddEven.jLabel14.setVisible(false);
               GameOverOddEven.jLabel15.setVisible(false);
               }
                else{
               if(score<=30){
                GameOverOddEven.jLabel16.setVisible(true);
               GameOverOddEven.jLabel13.setVisible(true);
               GameOverOddEven.jLabel7.setVisible(true);
               GameOverOddEven.jLabel14.setVisible(true);
                GameOverOddEven.jLabel15.setVisible(true);     
               }
               else{
               if(score<=40){
                GameOverOddEven.jLabel16.setVisible(true);
                GameOverOddEven.jLabel13.setVisible(true);
                GameOverOddEven.jLabel7.setVisible(true);
                GameOverOddEven.jLabel14.setVisible(false);
                GameOverOddEven.jLabel15.setVisible(false);
                }
               else{
                  GameOverOddEven.jLabel16.setVisible(true);
                GameOverOddEven.jLabel13.setVisible(true);
                GameOverOddEven.jLabel7.setVisible(true);
                GameOverOddEven.jLabel14.setVisible(true);
                GameOverOddEven.jLabel15.setVisible(true);    

               }
               
           }
               }}
           setVisible(false);
                
            }
               mp3player3.play();
                      }
           JOptionPane.showMessageDialog(this,"Your score is: "+score+"/"+count);
           mp3player2.play();
          GameOverOddEven x=new GameOverOddEven();
     GameOverOddEven.jLabel10.setText(ODDEven.Lblscore.getText());
          x.setVisible(true);
           if(score<=5){
               GameOverOddEven.jLabel16.setVisible(true);
               GameOverOddEven.jLabel13.setVisible(false);
               GameOverOddEven.jLabel7.setVisible(false);
               GameOverOddEven.jLabel14.setVisible(false); 
               GameOverOddEven.jLabel15.setVisible(false);
               
           }
           else{
               if(score<=15){
                GameOverOddEven.jLabel16.setVisible(true);
               GameOverOddEven.jLabel13.setVisible(true);
               GameOverOddEven.jLabel7.setVisible(false);
               GameOverOddEven.jLabel14.setVisible(false);
               GameOverOddEven.jLabel15.setVisible(false);
               }
                else{
               if(score<=30){
                GameOverOddEven.jLabel16.setVisible(true);
               GameOverOddEven.jLabel13.setVisible(true);
               GameOverOddEven.jLabel7.setVisible(true);
               GameOverOddEven.jLabel14.setVisible(true);
                GameOverOddEven.jLabel15.setVisible(true);     
               }
               else{
               if(score<=40){
                GameOverOddEven.jLabel16.setVisible(true);
                GameOverOddEven.jLabel13.setVisible(true);
                GameOverOddEven.jLabel7.setVisible(true);
                GameOverOddEven.jLabel14.setVisible(false);
                GameOverOddEven.jLabel15.setVisible(false);
                }
               else{
                  GameOverOddEven.jLabel16.setVisible(true);
                GameOverOddEven.jLabel13.setVisible(true);
                GameOverOddEven.jLabel7.setVisible(true);
                GameOverOddEven.jLabel14.setVisible(true);
                GameOverOddEven.jLabel15.setVisible(true);    

               }
               
           }
               }}
           setVisible(false);
      }
      else{
          if(num%2==0)
           {
                mp3player.play();
               score=score+1;
               Lblscore.setText(String.valueOf(score));
               jLabel5.setText(String.valueOf(count));
           }                    
          else{
                k=k+1;   
                jLabel5.setText(String.valueOf(count));
            if(k==1){
                jLabel2.setVisible(false);
            }
            if(k==2){
                jLabel3.setVisible(false);
            }
            if(k==3){
                jLabel4.setVisible(false);
                 GameOverOddEven x=new GameOverOddEven();
     GameOverOddEven.jLabel10.setText(ODDEven.Lblscore.getText());
          x.setVisible(true);
           if(score<=5){
               GameOverOddEven.jLabel16.setVisible(true);
               GameOverOddEven.jLabel13.setVisible(false);
               GameOverOddEven.jLabel7.setVisible(false);
               GameOverOddEven.jLabel14.setVisible(false); 
               GameOverOddEven.jLabel15.setVisible(false);
               
           }
           else{
               if(score<=15){
                GameOverOddEven.jLabel16.setVisible(true);
               GameOverOddEven.jLabel13.setVisible(true);
               GameOverOddEven.jLabel7.setVisible(false);
               GameOverOddEven.jLabel14.setVisible(false);
               GameOverOddEven.jLabel15.setVisible(false);
               }
                else{
               if(score<=30){
                GameOverOddEven.jLabel16.setVisible(true);
               GameOverOddEven.jLabel13.setVisible(true);
               GameOverOddEven.jLabel7.setVisible(true);
               GameOverOddEven.jLabel14.setVisible(true);
                GameOverOddEven.jLabel15.setVisible(true);     
               }
               else{
               if(score<=40){
                GameOverOddEven.jLabel16.setVisible(true);
                GameOverOddEven.jLabel13.setVisible(true);
                GameOverOddEven.jLabel7.setVisible(true);
                GameOverOddEven.jLabel14.setVisible(false);
                GameOverOddEven.jLabel15.setVisible(false);
                }
               else{
                  GameOverOddEven.jLabel16.setVisible(true);
                GameOverOddEven.jLabel13.setVisible(true);
                GameOverOddEven.jLabel7.setVisible(true);
                GameOverOddEven.jLabel14.setVisible(true);
                GameOverOddEven.jLabel15.setVisible(true);    

               }
               
           }
               }}
           setVisible(false);
                
            }
               mp3player3.play();
                      }
           
         randomNum=r.nextInt(100);
          lblNumber.setText(String.valueOf(randomNum));
           
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
            java.util.logging.Logger.getLogger(ODDEven.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ODDEven.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ODDEven.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ODDEven.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ODDEven().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JLabel Lblscore;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblNumber;
    // End of variables declaration//GEN-END:variables

    private Object jLabel2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
