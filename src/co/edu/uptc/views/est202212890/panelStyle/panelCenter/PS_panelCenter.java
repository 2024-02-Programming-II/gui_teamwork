package co.edu.uptc.views.est202212890.panelStyle.panelCenter;

import javax.swing.*;
import javax.swing.border.TitledBorder;

import java.awt.*;
public class PS_panelCenter extends JPanel {
    
    private int HEIGHT = 150;
    private GridBagConstraints gbc;
    private JLabel name, typeStyle, styleBased, styleNext; 
    private JTextField txt_Name;
    private JComboBox paragraph, noStyle, normal;

    public PS_panelCenter(){

        configurationPanel();
        initComponents();
    }

    private void configurationPanel(){

        //Creación del GridBagLayout
        setLayout(new GridBagLayout());
        gbc = new GridBagConstraints();
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.insets = new Insets(2,2,2,2);
        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.weightx = 1;
        gbc.weighty = 0;


        setPreferredSize(new Dimension(0,HEIGHT));
        TitledBorder titledBorder = BorderFactory.createTitledBorder("Propiedades");
        setBorder(titledBorder);
        initComponents();
    }

    private void initComponents(){
        addLabelName();
        addTxt_name();
        addLabelTypeSytle();
        addComboParagraph();
        addLabelBased();
        addComboNoStyle();
        addLabelStyleNext();
        addComboNormal();
    }

    private void addLabelName(){
        name = new JLabel("Nombre");
        gbc.gridx = 0;
        gbc.gridy = 0;
        add(name,gbc);
    }

    private void addTxt_name(){

        txt_Name = new JTextField("Nombre", 20);
        gbc.gridx = 1;
        gbc.gridy = 0;
        add(txt_Name, gbc);
    }

    private void addLabelTypeSytle(){
        
        typeStyle = new JLabel("Tipo de estilo: ");
        gbc.gridx = 0;
        gbc.gridy = 1;
        add(typeStyle,gbc);
    }

    private void addComboParagraph(){
        paragraph = new JComboBox<>(new String[]{"Parrafo"});
        gbc.gridx = 1;
        gbc.gridy = 1;
        add(paragraph, gbc);
    }

    private void addLabelBased(){

        styleBased = new JLabel("Estilo basado en: ");
        gbc.gridx = 0;
        gbc.gridy = 2;
        add(styleBased, gbc);
    }

    private void addComboNoStyle(){

        noStyle = new JComboBox<>(new String[]{"(Sin estilo)"});
        gbc.gridx = 1;
        gbc.gridy = 2;
        add(noStyle, gbc);
    }

    private void addLabelStyleNext(){

        styleNext = new JLabel("Estilo del párrafo siguiente: ");
        gbc.gridx = 0;
        gbc.gridy = 3;
        add(styleNext, gbc);
    }

    private void addComboNormal(){

        normal = new JComboBox<>(new String[]{"Normal"});
        gbc.gridx = 1;
        gbc.gridy = 3;
        add(normal, gbc);
    }
}
