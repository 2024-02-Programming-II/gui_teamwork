package co.edu.uptc.views.est202128307;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSpinner;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.TitledBorder;

import co.edu.uptc.views.constants.ColorPalette;
import co.edu.uptc.views.constants.FontPalette;

public class PanelConPage extends JPanel {

    public PanelConPage() {
        setBackground(Color.LIGHT_GRAY);
        setLayout(new BorderLayout());
        initComponents();
    }

    private void initComponents() {
        JPanel ContenPanel = mainContainerPanel();
        add(ContenPanel, BorderLayout.CENTER);
    }

    private JPanel mainContainerPanel() {
        JPanel ContenPanel = new JPanel(new BorderLayout());
        ContenPanel.add(addTitle(), BorderLayout.NORTH);
        ContenPanel.add(containerDesign(), BorderLayout.CENTER);
        return ContenPanel;
    }

    private JPanel addTitle() {
        JPanel titlePanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        titlePanel.setBackground(ColorPalette.COLOR_BACKGROUND_INFO);

        JLabel titleLabel = new JLabel("Configuracion Pagina");
        titleLabel.setFont(FontPalette.TITLE_FONT);
        titleLabel.setForeground(Color.BLACK);

        titlePanel.add(titleLabel);
        return titlePanel;
    }
    
   

        private JPanel containerDesign() {
        JPanel containerDesign = createContainerPanelDesign();
        containerDesign.add(addSeccion());
        containerDesign.add(addHeader());
        containerDesign.add(addPage());
        containerDesign.add(addPreview());
        containerDesign.add(createPanelDesing());
        return containerDesign;
    }
    
    private JPanel createContainerPanelDesign() {
        JPanel containerPanel = new JPanel();
        containerPanel.setLayout(new BoxLayout(containerPanel, BoxLayout.Y_AXIS));
        containerPanel.setBorder(new CompoundBorder(
                new TitledBorder("Diseño"),
                new EmptyBorder(15, 15, 15, 15)));
        return containerPanel;
    }
    
    private JPanel createPanelDesing() {
        JPanel buttonPanel = new JPanel(new BorderLayout());
        JButton defaultButton = new JButton("Establecer como predeterminado");
        JButton acceptButton = new JButton("Aceptar");
        JButton cancelButton = new JButton("Cancelar");
    
        JPanel leftPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JPanel rightPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
    
        leftPanel.add(defaultButton);
        rightPanel.add(acceptButton);
        rightPanel.add(cancelButton);
    
        buttonPanel.add(leftPanel, BorderLayout.WEST);
        buttonPanel.add(rightPanel, BorderLayout.EAST);
    
        return buttonPanel;
    }


    private JPanel addSeccion() {
        JPanel seccionPanel = new JPanel(new GridLayout(2, 1));
        seccionPanel.setBorder(new CompoundBorder(new TitledBorder("Seccion"), new EmptyBorder(15, 15, 15, 15)));

        JPanel labelComboPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        labelComboPanel.add(new JLabel("Empezar sección:"));

        JComboBox<String> sectionCombo = new JComboBox<>(new String[] { "Página nueva", " " });
        sectionCombo.setBackground(ColorPalette.COLOR_FOREGROUND_STATUS_BAR);
        labelComboPanel.add(sectionCombo);

        seccionPanel.add(labelComboPanel);
        seccionPanel.add(new JCheckBox("Suprimir notas al final"));

        return seccionPanel;
    }

    private JPanel addHeader() {
        JPanel headerPanel = createHeaderPanel();
        JPanel mainContainerPanel = createMainContainerPanel();
        JPanel containerPanel = createContainerPanel();
        JPanel comboPanel = createComboPanel();

        containerPanel.add(comboPanel);
        mainContainerPanel.add(containerPanel);
        headerPanel.add(mainContainerPanel);

        return headerPanel;
    }

    private JPanel createHeaderPanel() {
        JPanel headerPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        headerPanel.setBorder(new CompoundBorder(
                new TitledBorder("Encabezados y pies de pagina"),
                new EmptyBorder(15, 15, 15, 15)));
        return headerPanel;
    }

    private JPanel createMainContainerPanel() {
        JPanel mainContainerPanel = new JPanel(new GridLayout(3, 1));

        JCheckBox differentPairs = new JCheckBox("Pares e impares diferentes");
        mainContainerPanel.add(differentPairs);

        JCheckBox differentPages = new JCheckBox("Primera página diferente");
        mainContainerPanel.add(differentPages);

        return mainContainerPanel;
    }

    private JPanel createContainerPanel() {
        JPanel containerPanel = new JPanel(new GridLayout(1, 2));
        JLabel edgesSection = new JLabel("Desde el borde:");
        containerPanel.add(edgesSection);
        return containerPanel;
    }

    private JPanel createComboPanel() {
        JPanel comboPanel = new JPanel(new GridLayout(2, 1));

        JLabel headerLabel = new JLabel("Encabezado:");
        comboPanel.add(headerLabel);

        SpinnerModel headerModel = new SpinnerNumberModel(1.25, 0.0, 10.0, 0.1);
        JSpinner headerSpinner = new JSpinner(headerModel);
        headerSpinner.setEditor(new JSpinner.NumberEditor(headerSpinner, "0.00 cm"));
        comboPanel.add(headerSpinner);

        JLabel footerLabel = new JLabel("Pie de página:");
        comboPanel.add(footerLabel);

        SpinnerModel footerModel = new SpinnerNumberModel(1.25, 0.0, 10.0, 0.1);
        JSpinner footPageSpinner = new JSpinner(footerModel);
        footPageSpinner.setEditor(new JSpinner.NumberEditor(footPageSpinner, "0.00 cm"));
        comboPanel.add(footPageSpinner);

        return comboPanel;
    }

    private JPanel addPage() {
        JPanel pagePanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        pagePanel.setBorder(new CompoundBorder(new TitledBorder("Pagina"), new EmptyBorder(15, 15, 15, 15)));

        JLabel sectionLabel = new JLabel("Alineacion vertical:");
        pagePanel.add(sectionLabel);

        JComboBox<String> sectionCombo = new JComboBox<>(new String[] { "Superior", " " });
        sectionCombo.setBackground(ColorPalette.COLOR_FOREGROUND_STATUS_BAR);
        pagePanel.add(sectionCombo);

        return pagePanel;
    }

    private JPanel addPreview() {
        JPanel previewPanel = createPreviewPanel();
        JPanel imageAndComboPanel = createImageAndComboPanel();
        JPanel buttonPanel = createButtonPanel();

        previewPanel.add(imageAndComboPanel, BorderLayout.WEST);
        previewPanel.add(buttonPanel, BorderLayout.EAST);

        return previewPanel;
    }

    private JPanel createPreviewPanel() {
        JPanel previewPanel = new JPanel(new BorderLayout());
        previewPanel.setBorder(new CompoundBorder(
                new TitledBorder("Vista Previa"),
                new EmptyBorder(15, 15, 15, 15)));
        return previewPanel;
    }

    private JPanel createImageAndComboPanel() {
        JPanel imageAndComboPanel = new JPanel(new BorderLayout());

        ImageIcon originalIcon = new ImageIcon("assents\\imagenLabel.png");
        Image originalImage = originalIcon.getImage();
        Image resizedImage = originalImage.getScaledInstance(100, 100, Image.SCALE_SMOOTH);
        ImageIcon resizedIcon = new ImageIcon(resizedImage);

        JLabel previewLabel = new JLabel(resizedIcon);
        imageAndComboPanel.add(previewLabel, BorderLayout.NORTH);

        JPanel labelComboPanel = createLabelComboPanel();
        imageAndComboPanel.add(labelComboPanel, BorderLayout.CENTER);

        return imageAndComboPanel;
    }

    private JPanel createLabelComboPanel() {
        JPanel labelComboPanel = new JPanel(new FlowLayout(FlowLayout.LEFT));
        JLabel applyLabel = new JLabel("Aplicar a:");
        labelComboPanel.add(applyLabel);

        JComboBox<String> sectionCombo = new JComboBox<>(new String[] { "Todo el documento", " " });
        sectionCombo.setBackground(ColorPalette.COLOR_FOREGROUND_STATUS_BAR);
        labelComboPanel.add(sectionCombo);

        return labelComboPanel;
    }

    private JPanel createButtonPanel() {
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        JButton numberLinesButton = new JButton("Numero de lineas");
        JButton buttonEdges = new JButton("Bordes");
        buttonPanel.add(numberLinesButton);
        buttonPanel.add(buttonEdges);

        return buttonPanel;
    }
}
