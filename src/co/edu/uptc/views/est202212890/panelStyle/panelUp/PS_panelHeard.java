package co.edu.uptc.views.est202212890.panelStyle.panelUp;

import javax.swing.*;


import java.awt.*;

public class PS_panelHeard extends JPanel {
    
    private int HEIGHT = 40;

    public PS_panelHeard(){

        configurationPanel();
    }

    private void configurationPanel(){

        setBackground(new Color(212, 243, 243));
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(0,HEIGHT));
        JLabel label = new JLabel("Modificar Estilo");
        add(label, BorderLayout.CENTER);
    }

}
