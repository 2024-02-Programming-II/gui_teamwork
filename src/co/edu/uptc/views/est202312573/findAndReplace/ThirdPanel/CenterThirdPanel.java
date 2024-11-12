package co.edu.uptc.views.est202312573.findAndReplace.ThirdPanel;

import java.awt.BorderLayout;

import javax.swing.JPanel;

public class CenterThirdPanel extends JPanel{
    public CenterThirdPanel() {
        super();
        initConfigurations();
    }

    private void initConfigurations(){
        setLayout(new BorderLayout());
        addPrincipalPanel();
    }

    private void addPrincipalPanel(){
        PrincipalThirdPanel principal = new PrincipalThirdPanel();
        add(principal, BorderLayout.CENTER);
    }
}
