package co.edu.uptc.views.est202310254;

import co.edu.uptc.views.constants.ColorPalette;
import java.awt.FlowLayout;
import javax.swing.JPanel;



public class StylesView extends JPanel{

    private PropertiesPanel propertiesPanel;
    private FormatPanel formatPanel;
    private ParagraphPanel paragraphView;
    private LowerOptionsPanel lowerButtonsView;
    
    public StylesView(){
        setLayout(new FlowLayout(FlowLayout.CENTER));
        setBackground(ColorPalette.COLOR_BACKGROUND_SECOND_MENU);
        initComponents();
    }

    private void initComponents(){
        addPropetiesPanel();
    }

    private void addPropetiesPanel(){
        this.propertiesPanel = new PropertiesPanel();
        add(this.propertiesPanel);
        this.formatPanel = new FormatPanel();
        add(this.formatPanel);
        this.paragraphView = new ParagraphPanel();
        add(this.paragraphView);
        this.lowerButtonsView = new LowerOptionsPanel();
        add(this.lowerButtonsView);
    }


}
