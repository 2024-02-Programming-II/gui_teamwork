package co.edu.uptc.views.est202212890.panelStyle.panelDown.panelDown;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JCheckBox;
import javax.swing.JPanel;

public class PanelDown extends JPanel{

private JCheckBox checkBox;
private int HEIGHT = 30;
public PanelDown(){
    PanelConfiguration();
}

private void PanelConfiguration(){    
    initComponents();
    setLayout(new FlowLayout(FlowLayout.LEFT));
    setPreferredSize(new Dimension(0,HEIGHT));
}

private void initComponents(){
    addCheckBox();
}

private void addCheckBox(){
    checkBox = new JCheckBox("Agregar a la galeria de estilos");
    add(checkBox);
}

}