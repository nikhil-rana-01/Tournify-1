/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.HomeWindow;
import java.awt.*;
import javax.swing.*;    
import javax.swing.border.EmptyBorder;
import Code.*;
import java.util.ArrayList;
/**
 *
 * @author Nikhil Rana
 */
public class LeaderboardScrollPanel extends javax.swing.JPanel {

    /**
     * Creates new form HomePanel
     */
    public LeaderboardScrollPanel() {
       tmc = new TournamentManagementSystem();
        ctr += 3;
        System.out.print("constructor called");
        initComponents();
        initLeaderboardScrollPanel();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setForeground(new java.awt.Color(255, 0, 0));
        setPreferredSize(new java.awt.Dimension(980, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 980, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    void initLeaderboardScrollPanel() {

//        setBounds(0, 300, 778, 426); //******* first two terms set the location of the window to initialise

        scrollPane = new JScrollPane();
        scrollPane.setBounds(0, 0, 980, 600);
        // scrollPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);
        this.add(scrollPane);
        scrollPane.setBackground(Color.white);
        
        JPanel borderlaoutpanel = new JPanel();
        scrollPane.setViewportView(borderlaoutpanel);
        borderlaoutpanel.setBorder(new EmptyBorder(20, 20, 20, 20));
        borderlaoutpanel.setBackground(Color.white);
        
        JPanel columnpanel = new JPanel();
        borderlaoutpanel.add(columnpanel, BorderLayout.NORTH);
        columnpanel.setLayout(new GridLayout(0, 1, 60, 15)); //******setting the overall grid layout
        columnpanel.setBackground(Color.white);
        ArrayList<Team> leaderboard = tmc.getDummyLeaderboards();
        LeaderboardScrollCard[] rowPanel = new LeaderboardScrollCard[(leaderboard.size())+1];
        rowPanel[0] = new LeaderboardScrollCard();
         columnpanel.add(rowPanel[0]);
        for (int i = 0; i < leaderboard.size(); i++) {
            rowPanel[i] = new LeaderboardScrollCard(i+1,leaderboard.get(i).getTeamName(),leaderboard.get(i).getPoints(),leaderboard.get(i).getMatchesWon(),leaderboard.get(i).getMatchesDraw(),leaderboard.get(i).getMatchesLost());
//            rowPanel[i].setPreferredSize(new Dimension(450, 250)); //*****size of the each card
            columnpanel.add(rowPanel[i]); 
            
            // if (i % 4 == 0 || (i + 1) % 4 == 0)
            //     rowPanel.setBackground(SystemColor.inactiveCaptionBorder);
        }
    }
        
    
    private static int ctr = 0;
    private JScrollPane scrollPane;
    private TournamentManagementSystem tmc;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
