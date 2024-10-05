package co.edu.uptc.views.views202214307;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.*;

import co.edu.uptc.views.constants.*;

public class DialogFormat extends JDialog {
    public DialogFormat() {
        setSize(350, 500);
        setLocationRelativeTo(null);
        getContentPane().setBackground(ColorPalette.COLOR_BACKGROUND_SECOND_MENU);
        setResizable(false);
        initComponents();
    }

    private void initComponents() {
        JPanel mainPanel = createMainPanel();

        mainPanel.add(createTopPanel(), BorderLayout.NORTH);

        mainPanel.add(createCenterPanel(), BorderLayout.CENTER);

        mainPanel.add(createBottomPanel(), BorderLayout.SOUTH);

        setContentPane(mainPanel);
    }

    private JPanel createMainPanel() {
        JPanel mainPanel = new JPanel(new BorderLayout(5, 5));
        mainPanel.setOpaque(false);
        Border outerBorder = new EmptyBorder(10, 10, 10, 10);
        Border innerBorder = new EtchedBorder();

        mainPanel.setBorder(new CompoundBorder(outerBorder, innerBorder));
        return mainPanel;
    }

    private JPanel createTopPanel() {
        JPanel panel = new JPanel();
        panel.setOpaque(false);
        panel.setLayout(new FlowLayout(FlowLayout.LEFT));
        JLabel titleLabel = new JLabel("Formato de efectos de texto");
        titleLabel.setFont(FontPalette.TITLE_FONT);
        panel.add(titleLabel);
        return panel;
    }

    private JPanel createCenterPanel() {
        JPanel panel = new JPanel(new BorderLayout(5, 5));
        panel.setOpaque(false);

        JPanel btnPanel = createbuttonsPanel();

        panel.add(btnPanel, BorderLayout.NORTH);

        createTextArea(panel);

        return panel;
    }

    private JPanel createbuttonsPanel() {
        JPanel buttonsPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        String path = "assets/icons";
        String[] images = { "aUnderLined.png", "a.png" };
        for (String image : images) {
            ImageIcon icon = new ImageIcon(path + image);
            Image img = icon.getImage().getScaledInstance(20, 20, Image.SCALE_SMOOTH);
            JButton btn = new JButton();
            btn.setIcon(new ImageIcon(img));
            buttonsPanel.add(btn);
        }
        return buttonsPanel;
    }

    private JTextArea createTextArea(JPanel panel) {
        JTextArea textArea = new JTextArea(5, 20);
        textArea.setText("Relleno de texto\n" + "Contorno de texto");
        textArea.setEditable(false);
        panel.add(new JScrollPane(textArea), BorderLayout.CENTER);
        return textArea;
    }

    private JPanel createBottomPanel() {
        JPanel panel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        JButton acceptButton = new JButton("Aceptar");
        acceptButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }

        });
        panel.add(acceptButton);
        return panel;
    }
}
