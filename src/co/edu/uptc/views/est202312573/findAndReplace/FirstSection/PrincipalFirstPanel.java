package co.edu.uptc.views.est202312573.findAndReplace.FirstSection;

import java.awt.BorderLayout;
import javax.swing.BorderFactory;

import javax.swing.JPanel;

import co.edu.uptc.views.constants.ColorPalette;
import co.edu.uptc.views.est202312573.findAndReplace.DialogFindReplace;
import co.edu.uptc.views.est202312573.findAndReplace.SecondSection.CenterSecondPanel;

public class PrincipalFirstPanel extends JPanel{
    DialogFindReplace mainDialog;
    public PrincipalFirstPanel(DialogFindReplace mainDialog) {
        super();
        this.mainDialog = mainDialog;
        initConfigurations();
    }

    private void initConfigurations(){
        setLayout(new BorderLayout());
        addPanels();
        setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, ColorPalette.BORDER_COLOR));
    }

    private void addPanels(){
        addWestPanel();
    }

    private void addWestPanel(){
        CenterFirstPanelFR centerPanel = new CenterFirstPanelFR();
        add(centerPanel, BorderLayout.CENTER);
        CenterSecondPanel south = new CenterSecondPanel(mainDialog);
        add(south, BorderLayout.SOUTH);
    }
}
