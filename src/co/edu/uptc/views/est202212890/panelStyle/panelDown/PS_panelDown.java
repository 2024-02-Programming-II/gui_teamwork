package co.edu.uptc.views.est202212890.panelStyle.panelDown;

import javax.swing.*;
import javax.swing.border.TitledBorder;

import co.edu.uptc.views.est202212890.panelStyle.panelDown.panelDown.PS_PD_panelDown;

import java.awt.*;

public class PS_panelDown extends JPanel{
    
    private PS_PD_panelUp panelUp;
    private PS_PD_panelCenter panelCenter;
    private PS_PD_panelDown panelDown;
    private int HEIGHT = 450;

    public PS_panelDown(){

        configurationPanel();
    }

    private void configurationPanel(){
        
        setPreferredSize(new Dimension(0,HEIGHT)); 
        TitledBorder titledBorder = BorderFactory.createTitledBorder("Formato");
        setBorder(titledBorder);
        setLayout(new BorderLayout());
        
        initComponents();
    }   

    private void initComponents(){

        addPanelUp();
        addPanelCenter();
        addPanelDown();
    }

    private void addPanelUp(){
        panelUp = new PS_PD_panelUp();
        add(panelUp, BorderLayout.NORTH);
    }

    private void addPanelCenter(){
        panelCenter = new PS_PD_panelCenter();
        add(panelCenter, BorderLayout.CENTER);
    }

    private void addPanelDown(){
        panelDown = new PS_PD_panelDown();
        add(panelDown, BorderLayout.SOUTH);
    }
    

}
