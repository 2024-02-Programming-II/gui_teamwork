package co.edu.uptc.views.est202212890.panelStyle;

import javax.swing.*;

import co.edu.uptc.views.est202212890.panelStyle.panelCenter.PS_panelCenter;
import co.edu.uptc.views.est202212890.panelStyle.panelDown.PS_panelDown;
import co.edu.uptc.views.est202212890.panelStyle.panelUp.PS_panelHeard;

import java.awt.*;

public class PanelStyleModification extends JPanel {

    private PS_panelHeard panelHeard;
    private PS_panelCenter panelCenter;
    private PS_panelDown panelDown;

    public PanelStyleModification(){
        setLayout(new BorderLayout());
        setBackground(Color.DARK_GRAY);
        initComponents();
    }

    private void initComponents(){
        addPanelHeader();
        addPanelCenter();
        addPanelDown();
    }

    private void addPanelHeader(){

        panelHeard = new PS_panelHeard();
        add(panelHeard, BorderLayout.NORTH);
    }

    private void addPanelCenter(){

        panelCenter = new PS_panelCenter();
        add(panelCenter, BorderLayout.CENTER);

    }

    private void addPanelDown(){

        panelDown = new PS_panelDown();
        add(panelDown, BorderLayout.SOUTH);

    }

    
}
