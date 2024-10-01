package co.edu.uptc.views;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.MatteBorder;

import co.edu.uptc.views.constants.ColorPalette;

public class PanelNicolasC extends JPanel{

    public PanelNicolasC(){
        //setLayout(new GridLayout(6, 1, 30, 30));
        setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        addSpaceTittle();
        addPropiedadesPanel();
        addFormatoPanel();
        addButtonsPanel();
        addTextAreaPanel();
        addInfoTextAreaPanel();
        addItemsChecbox();
        addbuttonsEndPanel();
    }

    public void addSpaceTittle(){
        JPanel jPanel = new JPanel();
        jPanel.setPreferredSize(new Dimension(100,10));
        jPanel.setBackground(ColorPalette.COLOR_TITLE_BACKGROUND);
        JLabel jLabel = new JLabel("Modificar estilos");
        jPanel.add(jLabel);
        this.add(jPanel);
    }

    private JLabel addTextDeshabilitado(String texto){
        JLabel jLabel = new JLabel(texto);
        jLabel.setEnabled(false);
        return jLabel;
    }

    private JComboBox addComboBoxDeshabilitado(String[] options){
        JComboBox<String> ComboBox = new JComboBox<>(options);
        ComboBox.setEnabled(false);
        return ComboBox;
    }

    private JComboBox addComboBoxHabilitado(String[] options){
        JComboBox<String> ComboBox = new JComboBox<>(options);
        return ComboBox;
    }

    private void addComponentsToPropiedadesPanel(JPanel panel){
        panel.add(new JLabel("Nombre:  "));
        panel.add(new JTextField("Escribir"));
        panel.add(addTextDeshabilitado("Tipo de Estilo"));
        panel.add(addComboBoxDeshabilitado(new String[]{"Parrafo",""}));
        panel.add(addTextDeshabilitado("Estilo basado en:"));
        panel.add(addComboBoxDeshabilitado(new String[]{"(Sin estilo)"}));
        panel.add(new JLabel("Estilo  parrafo siguiente:"));
        panel.add(addComboBoxHabilitado(new String[]{"Normal","Centrado"}));
    }

    private void addPropiedadesPanel(){
        JPanel propiedadesSubPanel;
        propiedadesSubPanel = new JPanel(new GridLayout(4, 2, 2, 2));
        propiedadesSubPanel.setBorder(BorderFactory.createTitledBorder("Propiedades"));
        addComponentsToPropiedadesPanel(propiedadesSubPanel);
        this.add(propiedadesSubPanel );
    }


    public void addFormatoPanel(){
        JPanel jPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        jPanel.setBorder(BorderFactory.createTitledBorder("Formato"));
        jPanel.add(addComboBoxHabilitado(new String[]{"Calibri", "Times", "Arial","Roman"}));
        jPanel.add(new JSpinner(new SpinnerNumberModel(13, 1, 100, 1)));
        jPanel.add(new JButton("N"));
        jPanel.add(new JButton("I"));
        jPanel.add(new JButton("S"));jPanel.add(addComboBoxHabilitado(new String[]{"Automatico", "Manual"}));
        this.add(jPanel);
    }


    private JButton addButton(String direction){
        JButton jButton = new JButton();
        ImageIcon image = new ImageIcon(System.getProperty("user.dir")+"/assets/iconos/"+direction);
        jButton.setIcon(new ImageIcon(image.getImage().getScaledInstance(15,15, Image.SCALE_SMOOTH)));
        return jButton;
    }

    private void addButtonsPanel(){
        JPanel buttonsPanel = new JPanel();
        buttonsPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        buttonsPanel.setPreferredSize(new Dimension(this.getWidth(),20));
        buttonsPanel.add(addButton("izquierda.png"));
        buttonsPanel.add(addButton("derecha.png"));
        buttonsPanel.add(addButton("centrado.png"));
        buttonsPanel.add(addButton("centrado.png"));
        buttonsPanel.add(addButton("justificado.png"));
        buttonsPanel.add(new JLabel("|"));
        this.add(buttonsPanel);
    }
    
    public void addTextAreaPanel(){
        JTextArea vistaPrevia = new JTextArea(10, 50);
        vistaPrevia.setText("Texto de ejemplo Texto de ejemplo Texto de ejemplo Texto de ejemplo\n" +
                            "Texto de ejemplo Texto de ejemplo Texto de ejemplo Texto de ejemplo\n" +
                            "Texto de ejemplo Texto de ejemplo Texto de ejemplo Texto de ejemplo\n" +
                            "Texto de ejemplo Texto de ejemplo Texto de ejemplo Texto de ejemplo\n" +
                            "Texto de ejemplo Texto de ejemplo Texto de ejemplo Texto de ejemplo");
        vistaPrevia.setForeground(new Color(255, 0, 0));
        vistaPrevia.setBorder(BorderFactory.createTitledBorder("Vista Previa")); 
        add(new JScrollPane(vistaPrevia));
    }

    public void addInfoTextAreaPanel(){
        JLabel jLabel = new JLabel();
        jLabel.setText("Informacion referentes sobre el texto a modificar\n Formato, Letra y demas");
        jLabel.setBorder(new MatteBorder(1, 1, 1, 1, Color.BLACK));
        JPanel jPanel = new JPanel();
        jPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        jPanel.add(jLabel);
        this.add(jPanel);
    }

    public void addItemsChecbox(){
        JPanel jPanel = new JPanel();
        jPanel.setPreferredSize(new Dimension(100,50));
        jPanel.setLayout(new BoxLayout(jPanel,BoxLayout.X_AXIS ));
        jPanel.add(new JCheckBox("Agregar Galeria de Estilos"));
        jPanel.add(new JCheckBox("Documentos nuevos basados en esta plantilla"));
        this.add(jPanel);
    }

    public void addbuttonsEndPanel(){
        JPanel jPanel = new JPanel(new GridLayout(1, 2, 2, 2));
        JPanel panelFormato = new JPanel();
        panelFormato.setLayout(new FlowLayout(FlowLayout.LEFT));
        panelFormato.add(new JButton("Formato"));
        jPanel.add(panelFormato);
        JPanel botonesPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        botonesPanel.add(new JButton("Aceptar"));
        botonesPanel.add(new JButton("Cancelar"));
        jPanel.add(botonesPanel);
        add(jPanel);
    }
    
}
