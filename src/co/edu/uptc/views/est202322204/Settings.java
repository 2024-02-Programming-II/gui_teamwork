package co.edu.uptc.views.est202322204;

import co.edu.uptc.views.constants.ColorPalette;
import co.edu.uptc.views.mainViews.NumbersLine;
import java.awt.*;
import javax.swing.*;

public class Settings extends JPanel{


    public Settings(){
        this.setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
        this.setBackground(ColorPalette.COLOR_BACKGROUND_SECOND_MENU);
        initComponents();
    }

    private void initComponents(){
        createPanelProperties();
        createPanelFormat();
        createPanelPage();
        createPanelPreview();
        createPanelFooter();
    }

    private void createPanelProperties(){
        JPanel panelProperties = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = createGridBagConstraints();
        panelProperties.setBorder(BorderFactory.createTitledBorder("Sección"));
        panelProperties.setAlignmentX(Component.LEFT_ALIGNMENT);
        createJLabelAndComponent(panelProperties, gbc, "Nombre de la Página:",new JComboBox<>(new String[] { "Página nueva" }));
        addComponentToPanel(panelProperties, gbc, new JCheckBox("Suprimir notas al final"));
        this.add(panelProperties);
    }

    private void createPanelFormat(){
        JPanel panelFormat = new JPanel(new GridBagLayout());
        panelFormat.setBorder(BorderFactory.createTitledBorder("Encabezados y pie de página"));
        GridBagConstraints gbc = createGridBagConstraints();
        panelFormat.setAlignmentX(Component.LEFT_ALIGNMENT);
        addComponentToPanel(panelFormat, gbc, new JCheckBox("Pares e impares diferentes"));
        addComponentToPanel(panelFormat, gbc, new JCheckBox("Primera página diferente"));
        addComponentToPanel(panelFormat, gbc, createSubPanelBorders());
        this.add(panelFormat);
    }

    private void createJLabelAndComponent(JPanel panel, GridBagConstraints gbc,String text, JComponent component){
        gbc.gridx = 0;
        gbc.gridy++;
        panel.add(new JLabel(text), gbc);
        gbc.gridx = 1;
        panel.add(component, gbc);
    }

    private JPanel createSubPanelBorders(){
        JPanel panelBorders = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelBorders.add(new JLabel("Desde el Borde:    "));
        JPanel panelSnippers = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = createGridBagConstraints();
        createJLabelAndComponent(panelSnippers, gbc, "Encabezado: ", new JSpinner(new SpinnerNumberModel(1, 1, 100, 1)));
        createJLabelAndComponent(panelSnippers, gbc, "Pie de Página: ", new JSpinner(new SpinnerNumberModel(1, 1, 100, 1)));
        panelBorders.add(panelSnippers);
        return panelBorders;
    }

    private void createPanelPage(){
        JPanel panelProperties = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelProperties.setBorder(BorderFactory.createTitledBorder("Página"));
        panelProperties.setAlignmentX(Component.LEFT_ALIGNMENT);
        panelProperties.add(new JLabel("Alineación vertical:"));
       
        JComboBox<String> optionsAlineation = new JComboBox<>(new String[] {"Superior", "Inferior", "Centrado"});
        optionsAlineation.setPreferredSize(new Dimension(150, 20));
        panelProperties.add(optionsAlineation);
        this.add(panelProperties);
    }

    private void createPanelPreview(){
        JPanel panelPreview = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = createGridBagConstraints();
        gbc.fill = GridBagConstraints.EAST;
        panelPreview.setAlignmentX(Component.LEFT_ALIGNMENT);
        panelPreview.setBorder(BorderFactory.createTitledBorder("Vista previa"));
        ImageIcon imageIcon = createImageIcon("image");
        addComponentToPanel(panelPreview, gbc, new JLabel(imageIcon));
        gbc.fill = GridBagConstraints.HORIZONTAL;
        addComponentToPanel(panelPreview, gbc, subPanelPreview());
        this.add(panelPreview);
    }


    private JPanel subPanelPreview(){
        JPanel subPreview = new JPanel(new BorderLayout());
        JPanel panelLeft = new JPanel(new FlowLayout(FlowLayout.LEFT));
        panelLeft.add(new JLabel("Aplicar a:  "));
        panelLeft.add(new JComboBox<>(new String[] {"Todas el Documento", "Todas las Secciones"}));
        JPanel panelRight = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JButton buttonLines = new JButton("Números de Línea...");
        addEventToButton(buttonLines);
        panelRight.add(buttonLines);
        panelRight.add(new JButton("Bordes..."));
        subPreview.add(panelLeft, BorderLayout.WEST);
        subPreview.add(panelRight, BorderLayout.EAST);
        return subPreview;
    }

    private void createPanelFooter(){
        JPanel panelFooter = new JPanel(new BorderLayout());
        panelFooter.setAlignmentX(Component.LEFT_ALIGNMENT);
        JPanel subPanel1 = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel subPanel2 = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        subPanel1.add(new JButton("Establecer como Predeterminado"));
        subPanel2.add(new JButton("Aceptar"));
        subPanel2.add(new JButton("Cancelar"));

        panelFooter.add(subPanel1, BorderLayout.WEST);
        panelFooter.add(subPanel2, BorderLayout.EAST);
        this.add(panelFooter);
    }
    private GridBagConstraints createGridBagConstraints() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;
        return gbc;
    }

    private void addComponentToPanel(JPanel panel, GridBagConstraints gbc, JComponent component){
        gbc.gridx = 0;
        gbc.gridy++;
        gbc.gridwidth = 2;
        panel.add(component, gbc);
        gbc.gridwidth = 1;
    }

    private ImageIcon createImageIcon(String path) {
        String fullPath = System.getProperty("user.dir") + "\\public\\" + path + ".png";
        
        ImageIcon icon = new ImageIcon(fullPath);
        Image img = icon.getImage();
        Image resizedImg = img.getScaledInstance(60, 60, Image.SCALE_SMOOTH);
       
        ImageIcon resizedIcon = new ImageIcon(resizedImg);
        
        return resizedIcon;
    }

    private void addEventToButton(JButton button){
        button.addActionListener( e -> {
            NumbersLine numbersLine = new NumbersLine();
            numbersLine.setVisible(true);
        });
    }
}
