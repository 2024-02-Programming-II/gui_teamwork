package co.edu.uptc.views.est202212890.panelStyle.panelDown;

import java.awt.*;
import javax.swing.*;

public class PS_PD_panelUp extends JPanel{
    
    private int HEIGHT = 50;
    private JComboBox comboStyle, comboSize, comboColor;
    JLabel label_IconN, label_IconK, label_IconS;

    public PS_PD_panelUp(){
        configurationPanel();
        initComponents();
    }

    private void configurationPanel(){
        setLayout(new FlowLayout(FlowLayout.LEFT));
        setPreferredSize(new Dimension(0,HEIGHT));     
    }

    private void initComponents(){
        addcomboStyle();
        addComboSize();
        addLabelN();
        addButtonK();
        addButtonS();
        addComboColor();
    }

    private void addcomboStyle(){
        String[] fonts = {"Calibri (Cuerpo)", "Times New Roman"};
        comboStyle = new JComboBox<>(fonts);
        add(comboStyle);
    }

    private void addComboSize(){
        String[] size = {"11","12"};
        comboSize = new JComboBox<>(size);
        add(comboSize);
    }

    private void addLabelN(){
        ImageIcon originalIcon = new ImageIcon("assents/N_D.png");
        Image orImage = originalIcon.getImage();
        Image resImage = orImage.getScaledInstance(28, 28, Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(resImage);
        label_IconN = new JLabel();
        label_IconN.setIcon(icon);
        add(label_IconN);
    }

    private void addButtonK(){
        ImageIcon originalIcon = new ImageIcon("assents/K_D.png");
        Image orImage = originalIcon.getImage();
        Image resImage = orImage.getScaledInstance(28, 28, Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(resImage);
        label_IconK = new JLabel();
        label_IconK.setIcon(icon);
        add(label_IconK);
    }

    private void addButtonS(){
        ImageIcon originalIcon = new ImageIcon("assents/S_D.png");
        Image orImage = originalIcon.getImage();
        Image resImage = orImage.getScaledInstance(28, 28, Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(resImage);
        label_IconS = new JLabel();
        label_IconS.setIcon(icon);
        add(label_IconS);
    }

    private void addComboColor(){
        String[] Color = {"Automatico", "Rojo", "Azul"};
        comboColor = new JComboBox<>(Color);
        add(comboColor);
    }


}
