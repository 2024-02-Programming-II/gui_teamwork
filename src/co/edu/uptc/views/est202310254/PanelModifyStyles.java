package co.edu.uptc.views.est202310254;

import co.edu.uptc.views.constants.ColorPalette;
import co.edu.uptc.views.constants.FontPalette;

import java.awt.BorderLayout;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class PanelModifyStyles extends JPanel{

    private JComponent btn;
    private StylesView centerPanel;
    private final String [] OPTIONS = {"Formato de efectos de texto", "Unimplemented", "Unimplemented"};

    public PanelModifyStyles() {
        setBackground(ColorPalette.COLOR_TITLE_BACKGROUND);
        setLayout(new BorderLayout());
        initComponents();
    }

    private void initComponents(){
         addTitle();
         addCenterPanel();
         addOptions();
    }

    private void addTitle(){
        JPanel titleContainer = new JPanel();
        titleContainer.setLayout(new FlowLayout(FlowLayout.LEFT));
        titleContainer.setBackground(ColorPalette.COLOR_TITLE_BACKGROUND);
        titleContainer.setBorder(BorderFactory.createLineBorder(ColorPalette.COLOR_TITLE_BACKGROUND, 1, true));
        JLabel title = new JLabel("Modificar estilo");
        title.setOpaque(false);
        title.setFont(FontPalette.TITLE_FONT);
        titleContainer.add(title);
        add(titleContainer, BorderLayout.NORTH);
    }

    private void addCenterPanel(){
        this.centerPanel = new StylesView();
        add(this.centerPanel, BorderLayout.CENTER);
    }

    private void addOptions(){
        JPanel buttonsContainer = new JPanel();
        buttonsContainer.setLayout(new BorderLayout());
        buttonsContainer.setOpaque(false);
        buttonsContainer.add(createFormat(), BorderLayout.CENTER);
        buttonsContainer.add(addCancelConfirmBtn(), BorderLayout.EAST);
        add(buttonsContainer, BorderLayout.SOUTH);
    }

    private JPanel createFormat(){
        JPanel formatContainer = new JPanel(new FlowLayout(FlowLayout.LEFT));
        formatContainer.setOpaque(false);
        this.btn = new JComboBox(this.OPTIONS);
        customizeButton(this.btn);
        addFormatTextAction(this.btn);
        formatContainer.add(btn);
        return formatContainer;
    }

    public PanelModifyStyles getInstance(){
        return this;
    }

     private void addFormatTextAction(JComponent chooser){
        ((JComboBox) chooser).addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(java.awt.event.ActionEvent e) {
                TextFormatDialog dialog = new TextFormatDialog();
                dialog.setVisible(true);
            }
        });  
    }

    private JPanel addCancelConfirmBtn(){
        JPanel container = new JPanel(new FlowLayout(FlowLayout.RIGHT));
        container.setOpaque(false);
        JComponent confirm = new JButton("Aceptar");
        JComponent cancel = new JButton("Cancelar");
        customizeButton(cancel);
        customizeButton(confirm);
        container.add(cancel);
        container.add(confirm);
        return container; 
    }
    
    private void customizeButton(JComponent desiredButton){
        desiredButton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        desiredButton.setPreferredSize(new Dimension(190, 25));
    }

}
