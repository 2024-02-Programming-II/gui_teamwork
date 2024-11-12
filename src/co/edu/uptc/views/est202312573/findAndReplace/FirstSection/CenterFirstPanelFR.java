package co.edu.uptc.views.est202312573.findAndReplace.FirstSection;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import co.edu.uptc.views.constants.ColorPalette;


public class CenterFirstPanelFR extends JPanel {
    GridBagConstraints gbc = new GridBagConstraints();
    String[] combo1options = { "" };
    String[] combo2options = { "" };
    JComboBox<String> combo1 = new JComboBox<>(), combo2 = new JComboBox<>();
    JButton btnFind = new JButton(), btnFindAll = new JButton(), btnReplace = new JButton(), btnReplaceAll  = new JButton();
    public CenterFirstPanelFR() {
        super();
        initConfigurations();
        initComponents();
    }

    private void initConfigurations() {
        setLayout(new GridBagLayout());
    }

    private void initComponents() {
        addFirstSectionComponents();
        addSecondSectionComponents();
        addThirdSectionsComponents();
        addFourthSectionComponents();
    }

    private void addFirstSectionComponents() {
        setGbc(0, 0);
        addLabel("Search for");
        setGbc(0, 2);
        addComboBox(combo1, combo1options);
        setGbc(0, 4);
        addLabel("Replace with");
        setGbc(0, 6);
        addComboBox(combo2, combo2options);
    }

    private void addSecondSectionComponents() {
        setGbcForButtons(1, 0);
        addComponentsSeparator();
        setGbcForButtons(2, 0);
        addButton(btnFind, "Find");
        setGbcForButtons(2,2);
        addButton(btnFindAll, "Find All");
        setGbc(2, 3);
        addBorder();
    }

    private void addThirdSectionsComponents(){
        setGbcForButtons(2, 4);
        addButton(btnReplace, "Replace");
        setGbcForButtons(2,6);
        addButton(btnReplaceAll, "Replace All");
    }

    private void addFourthSectionComponents(){
        setGbc(0, 10);
        addCheckBox("Match case");
        setGbc(0, 11);
        addCheckBox("Whole words only");
    }
    private void addLabel(String text) {
        JLabel label = new JLabel(text);
        label.setHorizontalAlignment(SwingConstants.LEFT);
        label.setPreferredSize(new Dimension(80, 30));
        add(label, gbc);
    }

    private void setGbc(int x, int y) {
        gbc.gridx = x;
        gbc.gridy = y;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridheight = 1;
        gbc.insets = new Insets(5, 10, 5, 10);
    }

    private void setGbcForButtons(int x, int y){
        gbc.gridx = x;
        gbc.gridy = y;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridheight = 2;
        gbc.insets = new Insets(5, 10, 15, 10);
    }

    private void addComboBox(JComboBox<String> comboBox, String[] options) {
        comboBox = new JComboBox<String>();
        for (String string : options) {
            comboBox.addItem(string);
        }
        comboBox.setPreferredSize(new Dimension(360, 30));
        comboBox.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black));
        add(comboBox, gbc);
    }

    private void addButton(JButton button, String title){
        button.setText(title);
        button.setPreferredSize(new Dimension(80, 30));
        button.setEnabled(false);
        add(button, gbc);
    }

    private void addCheckBox(String text){
        JCheckBox checkBox = new JCheckBox(text);
        setPreferredSize(new Dimension());
        add(checkBox, gbc);
    }

    private void addBorder(){
        JLabel borderLabel = new JLabel(" ");
        borderLabel.setPreferredSize(new Dimension(400, 3));
        borderLabel.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, ColorPalette.BORDER_COLOR));
        add(borderLabel, gbc);
    }

    private void addComponentsSeparator(){
        JLabel borderLabel = new JLabel("                                                  ");
        borderLabel.setPreferredSize(new Dimension(500, 30));
        borderLabel.setSize(new Dimension(500, 30));
        add(borderLabel, gbc);
    }
}
