package co.edu.uptc.views.est202310254;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.BevelBorder;

import co.edu.uptc.views.constants.ColorPalette;

public class TextFormatPanel extends JPanel{

    private FormatTitlePanel titlePanel;
    private FormatOptionsPanel optionsPanel;

    public TextFormatPanel(){
        setPreferredSize(new Dimension(200,100));
        setLayout(new BorderLayout());
        setBackground(ColorPalette.COLOR_BACKGROUND_SECOND_MENU);
        setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED, ColorPalette.COLOR_BACKGROUND_SECOND_MENU, ColorPalette.COLOR_TITLE_BACKGROUND));
        initComponents();
    }
    
    private void initComponents(){
        addTitlePane();
        addOptionsPane();
    }

    private void addTitlePane(){
        this.titlePanel = new FormatTitlePanel();
        this.add(this.titlePanel, BorderLayout.NORTH);
    }
    
    private void addOptionsPane(){
       this.optionsPanel = new FormatOptionsPanel();
       this.add(this.optionsPanel, BorderLayout.CENTER);
    }
   
}
