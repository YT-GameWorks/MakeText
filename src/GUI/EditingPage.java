package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EditingPage
{
    JFrame EditingFrame;
    public JPanel EditPanel;
    public JEditorPane MainEditor;
    private JPanel ButtonPanel;
    private JButton fontSizeButton;

    public EditingPage() {
        fontSizeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                FontDialouge dialog = new FontDialouge();
                dialog.pack();
                dialog.setVisible(true);
            }
        });
    }
    public void CreateEditFrame()
    {
        EditingFrame = new JFrame("MakeText - Untitled File");
        EditingFrame.setContentPane(EditPanel);
        EditingFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        EditingFrame.pack();
        EditingFrame.setVisible(true);

        System.out.println("Initialized Editing Page.");
    }
}
