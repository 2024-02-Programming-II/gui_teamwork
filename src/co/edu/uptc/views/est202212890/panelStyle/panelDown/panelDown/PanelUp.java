package co.edu.uptc.views.est202212890.panelStyle.panelDown.panelDown;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.MatteBorder;

public class PanelUp extends JPanel{
    JTextArea textArea;
    private int HEIGHT = 200;
    public PanelUp(){
        PanelConfiguration();
    }

    private void PanelConfiguration(){
        initComponents();
        setPreferredSize(new Dimension(0,HEIGHT));
        setLayout(new FlowLayout(FlowLayout.LEFT));
        setBorder(new MatteBorder(1,1,1,1, Color.BLACK));
    }

    private void initComponents(){
        addTextArea();
    }

    private void addTextArea(){
        textArea = new JTextArea("Texto de ejemlo Texto de ejemlo Texto de ejemlo Texto de ejemlo Texto de ejemlo Texto de ejemlo Texto de ejemlo Texto de ejemlo ");
        textArea.setPreferredSize(new Dimension(1040, 190));
        add(textArea, FlowLayout.LEFT);
    }
}
