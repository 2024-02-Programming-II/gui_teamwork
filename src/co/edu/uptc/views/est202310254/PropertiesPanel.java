package co.edu.uptc.views.est202310254;

import co.edu.uptc.views.constants.ColorPalette;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;

public class PropertiesPanel extends JPanel{

    private final String [] STYLE_TYPES = {"Párrafo","unimplemented","unimplemented"};
    private final String [] BASED_STYLES = {"(Sin estilo)","unimplemented","unimplemented"};
    private String [] PARAGRAPH_STYLE = {"Normal","unimplemented","unimplemented"};

    public PropertiesPanel(){
        setLayout(new FlowLayout(FlowLayout.LEFT));
        setPreferredSize(new Dimension(Constants.WIDTH,100));
        setOpaque(false);
        setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(1, 0, 0, 0,ColorPalette.COLOR_TITLE_FOREGROUND ), "Properties", TitledBorder.LEFT,TitledBorder.CENTER));
        UIManager.put("TitledBorder.titleColor",ColorPalette.COLOR_TITLE_FOREGROUND);
        initComponents();
    }

    private void initComponents(){
        createFields("Nombre:", ColorPalette.COLOR_TITLE_FOREGROUND);
        createPickBox("Tipo de estilo:", ColorPalette.COLOR_TITLE_FOREGROUND, this.STYLE_TYPES);
        createPickBox("Estilo basado en:", ColorPalette.COLOR_TITLE_FOREGROUND, this.BASED_STYLES);
        createPickBox("Estilo del parrafo siguiente:", ColorPalette.COLOR_TITLE_FOREGROUND, this.PARAGRAPH_STYLE);
    }

    private JLabel createLabel(String text, Color desiredForeColor){
        JLabel def = new JLabel(text);
        def.setPreferredSize(new Dimension(180,20));
        def.setForeground(desiredForeColor);
        return def;
    }

    private JTextField textArea(String name){
        JTextField text = new JTextField(name);
        text.setPreferredSize(new Dimension(500,20));
        text.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        return text;
    }

    private void createFields(String name, Color desiredColor){
        JPanel fieldsContainer = new JPanel();
        setPreferredSize(new Dimension(Constants.WIDTH,150));
        fieldsContainer.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 0));
        fieldsContainer.setOpaque(false);
        fieldsContainer.add(createLabel(name, desiredColor));
        fieldsContainer.add(textArea(name));
        add(fieldsContainer);
    }

    private void createPickBox(String name, Color desiredColor, String [] options){
        JPanel fieldContainer = new JPanel();
        fieldContainer.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 0));
        fieldContainer.setOpaque(false);
        fieldContainer.add(createLabel(name, desiredColor));
        fieldContainer.add(createChooser(options));
        add(fieldContainer);
    }

    private JComboBox createChooser(String [] options){
        JComboBox chooser = new JComboBox(options);
        chooser.setPreferredSize(new Dimension(500,22));
        chooser.setBackground(Color.lightGray);
        chooser.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
        return chooser;
    }

}
