package co.edu.uptc.views.views202214307;

import java.awt.*;
import javax.swing.*;

import co.edu.uptc.views.constants.*;

public class Panel202214307 extends JPanel {
    private JComboBox<String> fontCombo;
    private JToggleButton boldButton, italicButton, underlineButton;
    private JComboBox<String> alignmentCombo;
    private JTextArea previewArea;

    public Panel202214307() {
        setLayout(new BorderLayout(10, 10));
        setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));
        setBackground(ColorPalette.COLOR_BACKGROUND_SECOND_MENU);
        initComponents();
    }

    private void initComponents() {
        JPanel mainPanel = createMainPanel();
        add(createPropertiesPanel(), BorderLayout.NORTH);
        add(mainPanel, BorderLayout.CENTER);
        add(createBottomBtns(), BorderLayout.SOUTH);
    }

    private JPanel createMainPanel() {
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BoxLayout(mainPanel, BoxLayout.Y_AXIS));
        mainPanel.setOpaque(false);
        mainPanel.add(createFormatPanel());
        mainPanel.add(createPreviewPanel());
        mainPanel.add(createCheckBtnPanel());
        return mainPanel;
    }

    private JPanel createPropertiesPanel() {
        JPanel panel = new JPanel(new GridBagLayout());
        panel.setBorder(BorderFactory.createTitledBorder("Propiedades"));
        panel.setSize(new Dimension(Integer.MAX_VALUE, Integer.MAX_VALUE));
        GridBagConstraints gbc = createGridBagConstraints();
        addPropertiesComponents(panel, gbc);
        panel.setOpaque(false);
        return panel;
    }

    private GridBagConstraints createGridBagConstraints() {
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.anchor = GridBagConstraints.WEST;
        gbc.insets = new Insets(5, 5, 5, 5);
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.weightx = 1.0;
        return gbc;
    }

    private void addPropertiesComponents(JPanel panel, GridBagConstraints gbc) {
        addLabelAndComponent(panel, gbc, "Nombre:", new JTextField(20));
        addLabelAndComponent(panel, gbc, "Tipo de estilo:", new JComboBox<>(new String[] { "Párrafo" }));
        addLabelAndComponent(panel, gbc, "Estilo basado en:", new JComboBox<>(new String[] { "Normal" }));
        addLabelAndComponent(panel, gbc, "Estilo del párrafo siguiente:", new JComboBox<>(new String[] { "Normal" }));
    }

    private void addLabelAndComponent(JPanel panel, GridBagConstraints gbc, String labelText, JComponent component) {
        gbc.gridx = 0;
        gbc.gridy++;
        panel.add(new JLabel(labelText), gbc);
        gbc.gridx = 1;
        panel.add(component, gbc);
    }

    private JPanel createFormatPanel() {
        JPanel panel = new JPanel(new BorderLayout());
        JPanel topPanel = createTopPanel();
        panel.add(topPanel, BorderLayout.NORTH);
        panel.add(createExampleTextArea(), BorderLayout.CENTER);
        panel.setOpaque(false);
        return panel;
    }

    private JPanel createTopPanel() {
        JPanel topPanel = new JPanel(new BorderLayout());
        topPanel.setOpaque(false);
        topPanel.add(createFormatButtonsPanel(), BorderLayout.NORTH);
        topPanel.add(createToolPanel(), BorderLayout.SOUTH);
        return topPanel;
    }

    private JScrollPane createExampleTextArea() {
        JTextArea exampleText = new JTextArea(8, 50);
        exampleText.setText("Texto de ejemplo".repeat(15));
        exampleText.setEditable(false);
        exampleText.setLineWrap(true);
        exampleText.setWrapStyleWord(true);
        exampleText.setPreferredSize(new Dimension(500, 150));
        return new JScrollPane(exampleText);
    }

    private JPanel createFormatButtonsPanel() {
        JPanel buttons = new JPanel(new FlowLayout(FlowLayout.LEFT));
        buttons.setOpaque(false);
        buttons.setBorder(BorderFactory.createTitledBorder("Formato"));
        addFormatComponents(buttons);
        return buttons;
    }

    private void addFormatComponents(JPanel buttons) {
        fontCombo = new JComboBox<>(new String[] { "Calibri (Cuerpo)", "NUevo" });
        boldButton = new JToggleButton("N");
        italicButton = new JToggleButton("K");
        underlineButton = new JToggleButton("S");
        alignmentCombo = new JComboBox<>(new String[] { "Izquierda", "Centro", "Derecha", "Justificar" });
        buttons.add(fontCombo);
        buttons.add(boldButton);
        buttons.add(italicButton);
        buttons.add(underlineButton);
        buttons.add(alignmentCombo);
    }

    private JPanel createToolPanel() {
        JPanel tools = new JPanel(new FlowLayout(FlowLayout.LEFT));
        tools.setOpaque(false);
        String route = "src/co/edu/uptc/views/views202214307/assets/";
        String[] images = { "left.png", "center.png", "right.png", "justify.png", "indenting3.png", "indenting1.png",
                "indenting2.png", "moreSpace.jpeg", "lessSpace.png", "indentRight.png", "indentLeft.png" };
        addToolButtons(tools, route, images);
        return tools;
    }

    private void addToolButtons(JPanel tools, String route, String[] images) {
        for (String image : images) {
            JButton btn = new JButton();
            ImageIcon icon = new ImageIcon(route + image);
            Image img = icon.getImage().getScaledInstance(16, 16, Image.SCALE_SMOOTH);
            btn.setIcon(new ImageIcon(img));
            tools.add(btn);
        }
    }

    private JPanel createPreviewPanel() {
        JPanel panel = new JPanel(new BorderLayout());
        panel.setOpaque(false);
        previewArea = new JTextArea(5, 30);
        setPreviewAreaProperties();
        panel.add(new JScrollPane(previewArea), BorderLayout.CENTER);
        return panel;
    }

    private void setPreviewAreaProperties() {
        previewArea.setText("Fuente: (Predeterminada) + Cuerpo(Calibri), Izquierda\n" +
                "   Interlineado: Múltiple 1,08 lin., Espacio\n" +
                "   Después: 8 pto, Control de líneas viudas y huérfanas, Estilo: Mostrar en la galería de estilos\n");
        previewArea.setLineWrap(true);
        previewArea.setWrapStyleWord(true);
        previewArea.setEditable(false);
        previewArea.setPreferredSize(new Dimension(400, 60));
    }

    private JPanel createCheckBtnPanel() {
        JPanel buttons = new JPanel(new FlowLayout());
        buttons.setOpaque(false);
        String[] options = { "Solo este documento", "Documentos nuevos basados en esta plantilla" };
        addCheckBoxes(buttons, options);
        return buttons;
    }

    private void addCheckBoxes(JPanel buttons, String[] options) {
        JCheckBox addGallety = new JCheckBox("Agregar la galeria de estilos");
        addGallety.setOpaque(false);
        buttons.add(addGallety);
        for (String option : options) {
            JRadioButton checkBox = new JRadioButton(option);
            checkBox.setOpaque(false);
            buttons.add(checkBox);
        }
    }

    private JPanel createBottomBtns() {
        JPanel buttons = new JPanel(new BorderLayout());
        buttons.add(createFormatButton(), BorderLayout.WEST);
        buttons.add(createAcceptCancelPanel(), BorderLayout.EAST);
        buttons.setOpaque(false);
        return buttons;
    }

    private JButton createFormatButton() {
        JButton format = new JButton("Formato");
        format.addActionListener(e -> {
            Dialog202214307 format1 = new Dialog202214307();
            format1.setVisible(true);
        });
        return format;
    }

    private JPanel createAcceptCancelPanel() {
        JPanel acceptCancelPanel = new JPanel(new FlowLayout());
        acceptCancelPanel.add(new JButton("Aceptar"));
        acceptCancelPanel.add(new JButton("Cancelar"));
        acceptCancelPanel.setOpaque(false);
        return acceptCancelPanel;
    }
}
