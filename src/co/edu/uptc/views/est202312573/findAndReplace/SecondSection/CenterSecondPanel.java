package co.edu.uptc.views.est202312573.findAndReplace.SecondSection;

import java.awt.BorderLayout;

import javax.swing.BorderFactory;
import javax.swing.JPanel;

import co.edu.uptc.views.constants.ColorPalette;
import co.edu.uptc.views.est202312573.findAndReplace.DialogFindReplace;

public class CenterSecondPanel extends JPanel{
    DialogFindReplace mainDialog;
    public CenterSecondPanel(DialogFindReplace mainDialog) {
        super();
        this.mainDialog = mainDialog;
        initConfigurations();
    }

    private void initConfigurations(){
        setLayout(new BorderLayout());
        addPanels();
        setBorder(BorderFactory.createMatteBorder(1, 0, 1, 0, ColorPalette.BORDER_COLOR));
    }

    private void addPanels(){
        addWestPanel();
    }

    private void addWestPanel(){
        PrincipalSecondSectionFR centerPanel = new PrincipalSecondSectionFR(mainDialog);
        add(centerPanel, BorderLayout.SOUTH);
    }
}
