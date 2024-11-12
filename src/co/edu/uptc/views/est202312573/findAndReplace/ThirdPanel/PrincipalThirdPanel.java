package co.edu.uptc.views.est202312573.findAndReplace.ThirdPanel;
import javax.swing.JCheckBox;
import javax.swing.JPanel;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;

public class PrincipalThirdPanel extends JPanel {
    GridBagConstraints gbc = new GridBagConstraints();

    public PrincipalThirdPanel() {
        super();
        initConfigurations();

    }

    private void initConfigurations() {
        setPreferredSize(new Dimension(120, 60));
        setLayout(new GridBagLayout());
        addComponents();
    }

    private void addComponents(){
        setFirstSection();
        setSecondSections();
    }

    private void setFirstSection(){
        setGbc(0, 0);
        addCheckBox("Current section Only");
        setGbc(0, 2);
        addCheckBox("Backwards");
        setGbc(0, 4);
        addCheckBox("Regular expresions");
        
    }

    private void setSecondSections(){
        setGbc(0, 6);
        addCheckBox("Similarity search");
        setGbc(0, 8);
        addCheckBox("Search for Styles");
        setGbc(0, 10);
        addCheckBox("Notes");
    }
    
    private void addCheckBox(String text) {
        JCheckBox checkBox = new JCheckBox(text);
        setPreferredSize(new Dimension(150,30));
        add(checkBox, gbc);
    }

    private void setGbc(int x, int y) {
        gbc.gridx = x;
        gbc.gridy = y;
        gbc.anchor = GridBagConstraints.NORTHWEST;
        gbc.fill = GridBagConstraints.HORIZONTAL;
        gbc.gridheight = 1;
        gbc.insets = new Insets(5, 10, 5, 10);
    }


}
