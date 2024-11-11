package co.edu.uptc.views.est202212890.panelStyle.panelDown.panelDown;

import javax.swing.*;
import java.awt.*;

public class PS_PD_panelDown extends JPanel {

    private PanelCenter panelCenter;
    private PanelDown panelDown;
    private PanelUp panelUp;

    private int HEIGHT = 340;

    public PS_PD_panelDown(){
        configurationPanel();
    }

    private void configurationPanel(){
        setBackground(Color.LIGHT_GRAY);
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(0,HEIGHT));
        initComponents();
    }

    private void initComponents(){
        addPanelUp();
        addPanelCenter();
        addPanelDown();
    }

    private void addPanelUp(){
        panelUp = new PanelUp();
        add(panelUp, BorderLayout.NORTH);
    }

    private void addPanelCenter(){
        panelCenter = new PanelCenter();
        add(panelCenter, BorderLayout.CENTER);
    }

    private void addPanelDown(){
        panelDown = new PanelDown();
        add(panelDown, BorderLayout.SOUTH);
    }
}
