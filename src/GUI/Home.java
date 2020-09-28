/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import java.awt.*;
import javax.swing.*;


/**
 *
 * @author Vishal Singh Rajput
 */
public class Home extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    CardLayout cd;
    JTabbedPane t = new JTabbedPane();
    public Home() {
        initComponents();
        initScrollPanel();
        this.setLocationRelativeTo(null);
       cd = (CardLayout)(CardHolder.getLayout());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NavBar = new javax.swing.JPanel();
        LogoTournify = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        HomeBtn = new keeptoo.KButton();
        TeamsBtn = new keeptoo.KButton();
        PlayersBtn = new keeptoo.KButton();
        AdminBtn = new keeptoo.KButton();
        TopBar = new javax.swing.JPanel();
        SearchBar = new javax.swing.JTextField();
        SearchIcon = new javax.swing.JLabel();
        ExitIcon = new javax.swing.JLabel();
        CardHolder = new javax.swing.JPanel();
        HomePanel = new javax.swing.JPanel();
        Players = new javax.swing.JPanel();
        Admin = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setLocation(new java.awt.Point(360, 110));
        setLocationByPlatform(true);
        setMinimumSize(new java.awt.Dimension(990, 500));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1210, 680));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        NavBar.setBackground(new java.awt.Color(23, 35, 51));
        NavBar.setPreferredSize(new java.awt.Dimension(230, 680));
        NavBar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LogoTournify.setFont(new java.awt.Font("SansSerif", 1, 20)); // NOI18N
        LogoTournify.setForeground(new java.awt.Color(255, 255, 255));
        LogoTournify.setText("TOURNIFY");
        NavBar.add(LogoTournify, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 10, 120, 50));

        jSeparator1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jSeparator1MouseClicked(evt);
            }
        });
        NavBar.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 170, 10));

        HomeBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        HomeBtn.setText("Home");
        HomeBtn.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        HomeBtn.setkAllowGradient(false);
        HomeBtn.setkBackGroundColor(new java.awt.Color(23, 35, 51));
        HomeBtn.setkHoverColor(new java.awt.Color(57, 62, 70));
        HomeBtn.setkHoverForeGround(java.awt.SystemColor.controlHighlight);
        HomeBtn.setPreferredSize(new java.awt.Dimension(230, 60));
        HomeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeBtnActionPerformed(evt);
            }
        });
        NavBar.add(HomeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 150, 230, 60));

        TeamsBtn.setText("Teams");
        TeamsBtn.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        TeamsBtn.setkAllowGradient(false);
        TeamsBtn.setkBackGroundColor(new java.awt.Color(23, 35, 51));
        TeamsBtn.setkHoverColor(new java.awt.Color(57, 62, 70));
        TeamsBtn.setkHoverForeGround(java.awt.SystemColor.controlHighlight);
        TeamsBtn.setPreferredSize(new java.awt.Dimension(230, 60));
        TeamsBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TeamsBtnActionPerformed(evt);
            }
        });
        NavBar.add(TeamsBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 220, -1, 60));

        PlayersBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        PlayersBtn.setText("Players");
        PlayersBtn.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        PlayersBtn.setkAllowGradient(false);
        PlayersBtn.setkBackGroundColor(new java.awt.Color(23, 35, 51));
        PlayersBtn.setkHoverColor(new java.awt.Color(57, 62, 70));
        PlayersBtn.setkHoverForeGround(java.awt.SystemColor.controlHighlight);
        PlayersBtn.setPreferredSize(new java.awt.Dimension(230, 60));
        PlayersBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PlayersBtnActionPerformed(evt);
            }
        });
        NavBar.add(PlayersBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 290, -1, 60));

        AdminBtn.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        AdminBtn.setText("Admin");
        AdminBtn.setFont(new java.awt.Font("SansSerif", 1, 18)); // NOI18N
        AdminBtn.setkAllowGradient(false);
        AdminBtn.setkBackGroundColor(new java.awt.Color(23, 35, 51));
        AdminBtn.setkHoverColor(new java.awt.Color(57, 62, 70));
        AdminBtn.setkHoverForeGround(java.awt.SystemColor.controlHighlight);
        AdminBtn.setPreferredSize(new java.awt.Dimension(230, 60));
        AdminBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AdminBtnActionPerformed(evt);
            }
        });
        NavBar.add(AdminBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 360, -1, 60));

        getContentPane().add(NavBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 230, 680));

        TopBar.setBackground(new java.awt.Color(71, 120, 197));
        TopBar.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                TopBarMouseDragged(evt);
            }
        });
        TopBar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                TopBarMousePressed(evt);
            }
        });

        SearchBar.setBackground(new java.awt.Color(123, 156, 225));
        SearchBar.setForeground(new java.awt.Color(255, 255, 255));
        SearchBar.setCaretColor(new java.awt.Color(255, 255, 255));
        SearchBar.setPreferredSize(new java.awt.Dimension(2, 20));

        SearchIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8_Search_18px.png"))); // NOI18N

        ExitIcon.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        ExitIcon.setForeground(new java.awt.Color(255, 255, 255));
        ExitIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ExitIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/icons8_Exit_25px.png"))); // NOI18N
        ExitIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ExitIconMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout TopBarLayout = new javax.swing.GroupLayout(TopBar);
        TopBar.setLayout(TopBarLayout);
        TopBarLayout.setHorizontalGroup(
            TopBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, TopBarLayout.createSequentialGroup()
                .addContainerGap(719, Short.MAX_VALUE)
                .addComponent(SearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(SearchIcon)
                .addGap(39, 39, 39)
                .addComponent(ExitIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        TopBarLayout.setVerticalGroup(
            TopBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(TopBarLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(TopBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ExitIcon)
                    .addComponent(SearchIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        getContentPane().add(TopBar, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 0, 980, 80));

        CardHolder.setPreferredSize(new java.awt.Dimension(830, 750));
        CardHolder.setLayout(new java.awt.CardLayout());

        HomePanel.setBackground(new java.awt.Color(102, 102, 0));
        HomePanel.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout HomePanelLayout = new javax.swing.GroupLayout(HomePanel);
        HomePanel.setLayout(HomePanelLayout);
        HomePanelLayout.setHorizontalGroup(
            HomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 980, Short.MAX_VALUE)
        );
        HomePanelLayout.setVerticalGroup(
            HomePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        CardHolder.add(HomePanel, "card2");

        Players.setBackground(new java.awt.Color(255, 102, 102));

        javax.swing.GroupLayout PlayersLayout = new javax.swing.GroupLayout(Players);
        Players.setLayout(PlayersLayout);
        PlayersLayout.setHorizontalGroup(
            PlayersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 980, Short.MAX_VALUE)
        );
        PlayersLayout.setVerticalGroup(
            PlayersLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        CardHolder.add(Players, "card4");

        Admin.setBackground(new java.awt.Color(0, 153, 255));

        javax.swing.GroupLayout AdminLayout = new javax.swing.GroupLayout(Admin);
        Admin.setLayout(AdminLayout);
        AdminLayout.setHorizontalGroup(
            AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 980, Short.MAX_VALUE)
        );
        AdminLayout.setVerticalGroup(
            AdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );

        CardHolder.add(Admin, "card5");

        getContentPane().add(CardHolder, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 80, 980, 600));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    
    void initScrollPanel() {
        TeamScrollPanel = new ScrollPanel();
//        TeamScrollPanel.setBackground(new Color(255,255,255));
//        javax.swing.GroupLayout TeamsLayout = new javax.swing.GroupLayout(TeamScrollPanel);
//        TeamScrollPanel.setLayout(TeamsLayout);
//        TeamsLayout.setHorizontalGroup(
//            TeamsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGap(0, 980, Short.MAX_VALUE)
//        );
//        TeamsLayout.setVerticalGroup(
//            TeamsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
//            .addGap(0, 600, Short.MAX_VALUE)
//        );

        CardHolder.add(TeamScrollPanel, "card3");
    }
    
    int xx,xy;
    private void TopBarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TopBarMousePressed
        // TODO add your handling code here:
        //drag this pane
        xx = evt.getX();
        xy = evt.getY();
    }//GEN-LAST:event_TopBarMousePressed

    private void TopBarMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TopBarMouseDragged
        // TODO add your handling code here:
        
        //source to drag
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xx,y-xy);
    }//GEN-LAST:event_TopBarMouseDragged

    private void ExitIconMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ExitIconMouseClicked
        System.exit(0);
    }//GEN-LAST:event_ExitIconMouseClicked

    private void jSeparator1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jSeparator1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jSeparator1MouseClicked

    private void TeamsBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TeamsBtnActionPerformed
        // TODO add your handling code here:
        CardHolder.removeAll();
//      CardHolder.add(Teams);
        
        CardHolder.repaint();
        CardHolder.revalidate();
        TeamScrollPanel.removeAll();
        initScrollPanel();
//        TeamScrollPanel.repaint();
//        TeamScrollPanel.revalidate();
        CardHolder.add(TeamScrollPanel);
        

    }//GEN-LAST:event_TeamsBtnActionPerformed

    private void HomeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeBtnActionPerformed
        // TODO add your handling code here:
        CardHolder.removeAll();
   CardHolder.add(HomePanel);
   CardHolder.repaint();
   CardHolder.revalidate();

    }//GEN-LAST:event_HomeBtnActionPerformed

    private void PlayersBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PlayersBtnActionPerformed
        // TODO add your handling code here:
        CardHolder.removeAll();
   CardHolder.add(Players);
   CardHolder.repaint();
   CardHolder.revalidate();


    }//GEN-LAST:event_PlayersBtnActionPerformed

    private void AdminBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AdminBtnActionPerformed
        // TODO add your handling code here:
       
   CardHolder.removeAll();
   CardHolder.add(Admin);
   CardHolder.repaint();
   CardHolder.revalidate();

    }//GEN-LAST:event_AdminBtnActionPerformed

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }
   
    
    private void setColor(JPanel pane)
    {
        pane.setBackground(new Color(41,57,80));
    }
    
    private void resetColor(JPanel [] pane, JPanel [] indicators)
    {
        for(int i=0;i<pane.length;i++){
           pane[i].setBackground(new Color(23,35,51));
           
        } for(int i=0;i<indicators.length;i++){
           indicators[i].setOpaque(false);           
        }
        
    }
    
    private ScrollPanel TeamScrollPanel;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Admin;
    private keeptoo.KButton AdminBtn;
    private javax.swing.JPanel CardHolder;
    private javax.swing.JLabel ExitIcon;
    private keeptoo.KButton HomeBtn;
    private javax.swing.JPanel HomePanel;
    private javax.swing.JLabel LogoTournify;
    private javax.swing.JPanel NavBar;
    private javax.swing.JPanel Players;
    private keeptoo.KButton PlayersBtn;
    private javax.swing.JTextField SearchBar;
    private javax.swing.JLabel SearchIcon;
    private keeptoo.KButton TeamsBtn;
    private javax.swing.JPanel TopBar;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
