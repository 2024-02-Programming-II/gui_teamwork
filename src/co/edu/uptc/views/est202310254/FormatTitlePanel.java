package co.edu.uptc.views.est202310254;

import co.edu.uptc.views.constants.ColorPalette;
import co.edu.uptc.views.constants.FontPalette;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class FormatTitlePanel extends JPanel{

    private JLabel titleLabel;
    private JPanel optionsPanel;
    private ArrayList <JButton> formatOptions;
    private final int WIDTH = 100;

    public FormatTitlePanel(){
        setPreferredSize(new Dimension(WIDTH,50));
        setLayout(new GridLayout(2, 1));
        setOpaque(false);
        initComponents();
    }

    private void initComponents(){
        addTitleLabel();
        addOptionsPanel();
    }

    private void addTitleLabel(){
        this.titleLabel = createLabelTitle("Formato de efectos de texto");
        this.titleLabel.setForeground(ColorPalette.COLOR_TITLE_FOREGROUND);
        this.titleLabel.setFont(FontPalette.TITLE_FONT);
        this.add(this.titleLabel);
    }

    private JLabel createLabelTitle(String desiredText){
        JLabel defLabel = new JLabel(desiredText);
        defLabel.setAlignmentX(LEFT_ALIGNMENT);
        defLabel.setOpaque(false);
        defLabel.setBorder(BorderFactory.createEmptyBorder(0, 5, 5, 0));
        return defLabel;
    }

    private void addOptionsPanel(){
        this.optionsPanel = createOptionsPanel();  
        addFormatOptions();

    }

    private JPanel createOptionsPanel(){
        JPanel defPanel = new JPanel(new FlowLayout(FlowLayout.LEFT, 5, 2));
        defPanel.setBackground(Color.white);
        defPanel.setPreferredSize(new Dimension(WIDTH, 50));
        return defPanel;
    }

    private void addFormatOptions(){
         createFormatOption();
         this.optionsPanel.add(this.formatOptions.get(0));
         this.optionsPanel.add(this.formatOptions.get(1));
         this.add(this.optionsPanel);
    }

    private void createFormatOption(){
        this.formatOptions = new ArrayList<>();
        this.formatOptions.add(createButton());
        this.formatOptions.add(createButton());
    }

    private JButton createButton(){
        JButton defButton = new JButton();
        defButton.setPreferredSize(new Dimension(20,20));
        defButton.setOpaque(false);
        defButton.setContentAreaFilled(false);
        defButton.setBorderPainted(true);
        return defButton;
    }

}
