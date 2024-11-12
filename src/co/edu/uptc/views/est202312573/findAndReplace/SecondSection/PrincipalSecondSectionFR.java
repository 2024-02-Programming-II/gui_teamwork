package co.edu.uptc.views.est202312573.findAndReplace.SecondSection;

import co.edu.uptc.views.est202312573.findAndReplace.DialogFindReplace;
import co.edu.uptc.views.est202312573.findAndReplace.palettes.*;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class PrincipalSecondSectionFR extends JPanel {
   DialogFindReplace mainDialog;
   private boolean thirdPanelStatus = true;
    public PrincipalSecondSectionFR(DialogFindReplace mainDialog) {
        super();
        this.mainDialog = mainDialog;
        initConfigurations();
    }

    private void initConfigurations() {
        setLayout(new BoxLayout(this, BoxLayout.X_AXIS));
        addComponents();
        setPreferredSize(new Dimension(0, 60));
        setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, ColorPalette.BORDER_COLOR));
    }

    private void addComponents() {
        add(Box.createHorizontalStrut(40));
        generateMoreOptionsButton();
        add(Box.createHorizontalStrut(40));
        generateButton("Help");
        generateButton("Close");

    }

    private void generateMoreOptionsButton() {
        JButton btnMoreOptions = new JButton("More options");
        btnMoreOptions.setPreferredSize(new Dimension(120, 30));
        btnMoreOptions.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                mainDialog.setThirdPanelStatus(thirdPanelStatus);
                thirdPanelStatus = (thirdPanelStatus)? false:true;
            }

        });
        add(btnMoreOptions);
    }

    private void generateButton(String text) {
        JButton button = new JButton(text);
        button.setPreferredSize(new Dimension(120, 30));
        add(button);
    }
}
