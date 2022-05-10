/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testwindow;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

    private JFrame jFrame;
    private JPanel jPanel;
    private JButton jButton;
    private JMenu jMenu;
    private JMenuItem item1, item2, item3, item4, item5;
    private JMenuBar jMenubar;

    void initframe() {

        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        int ngang = (int) screenSize.getWidth();
        int cao = (int) screenSize.getHeight();

        jFrame = new JFrame();
        jFrame.setTitle("Test frame");
        int frameNgang = ngang - 200;
        int frameCao = cao - 200;
        System.out.printf("ngang: %d\ncao:%d\n", frameNgang, frameCao);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setResizable(false);

        jPanel = new JPanel();
        jPanel.setBounds(0,0,frameNgang,frameCao);
        jPanel.setBackground(Color.red);
        jFrame.add(jPanel);


        jButton = new JButton();
        jButton.setText("Show");
        jButton.setBounds(0, 0, 800, 200);
        jPanel.add(jButton);

        jMenubar = new JMenuBar();
        jMenu = new JMenu("Menu");
        item1 = new JMenuItem("Item 1");
        item2 = new JMenuItem("Item 2");
        item3 = new JMenuItem("Item 3");
        item4 = new JMenuItem("Item 4");
        item5 = new JMenuItem("Item 5");
        jMenu.add(item1); jMenu.add(item2); jMenu.add(item3); jMenu.add(item4); 
        jMenu.add(item5); 
        jMenubar.add(jMenu);
        
        jFrame.setJMenuBar(jMenubar);
        jFrame.setSize(frameNgang, frameCao);
        jFrame.setLocationRelativeTo(null);
        jFrame.setLayout(null);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
