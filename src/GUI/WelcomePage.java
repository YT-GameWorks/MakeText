package GUI;

import Core.Main;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class WelcomePage
{

    public JPanel MainPanel;
    private JLabel WelcomeLb;
    private JButton NewFileBtn;
    public JFrame MainFrame;

    public WelcomePage()
    {
        //Create the frame
        CreateFrame();

        NewFileBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.out.println("Initialising Editing Page....");
                MainFrame.setVisible(false);
                EditingPage editingPage = new EditingPage();
                editingPage.CreateEditFrame();
            }
        });
    }

    private void CreateFrame()
    {
        MainFrame = new JFrame("MakeText - v0.2");
        MainFrame.setContentPane(MainPanel);
        MainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        MainFrame.pack();
        MainFrame.setVisible(true);
    }
}
