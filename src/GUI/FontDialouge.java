package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class FontDialouge extends JDialog
{
    private JPanel contentPane;
    private JButton buttonOK;
    private JTextField FontSizeTextBox;

    public FontDialouge()
    {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });
    }

    private void onOK()
    {
        String inputFontSize = FontSizeTextBox.getText();

        //Converting string to int
        try
        {
            int OutputFontSize = Integer.parseInt(inputFontSize);
            System.out.println("Successfully set the font!");
            EditingPage editingPage = new EditingPage();
            editingPage.MainEditor.setFont(new Font("JetBrains Mono", Font.PLAIN, OutputFontSize));
        }
        catch (NumberFormatException nfe)
        {
            JOptionPane.showMessageDialog(null, "Not a valid size !");
            System.out.println("ERROR! not a valid size! ERROR: " + nfe);
        }
    }

}
