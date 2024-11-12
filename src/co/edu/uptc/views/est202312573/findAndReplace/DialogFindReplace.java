package co.edu.uptc.views.est202312573.findAndReplace;

import java.awt.Dimension;
import javax.swing.BoxLayout;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import co.edu.uptc.views.mainViews.MainFrame;
import co.edu.uptc.views.est202312573.findAndReplace.FirstSection.*;
import co.edu.uptc.views.est202312573.findAndReplace.ThirdPanel.*;

public class DialogFindReplace extends JDialog {
    JPanel totalPanel = new JPanel();
    PrincipalFirstPanel firstPanel;
    CenterThirdPanel thirdPanel;

    public DialogFindReplace(MainFrame mainFrame, String title) {
        super(mainFrame, title, true);
        initPanels();
        initConfigurations(mainFrame, title);
    }

    public void start() {
        setVisible(true);
    }

    private void initPanels() {
        firstPanel = new PrincipalFirstPanel(this);
        thirdPanel = new CenterThirdPanel();
    }

    private void initConfigurations(MainFrame mainFrame, String title) {
        totalPanel.setLayout(new BoxLayout(totalPanel, BoxLayout.Y_AXIS));
        setSize(new Dimension(600, 700));
        JScrollPane scrollPane = new JScrollPane(totalPanel);
        scrollPane.setPreferredSize(new Dimension(600, 700));
        addPanels();
        add(scrollPane);
        setLocationRelativeTo(mainFrame);
    }

    private void addPanels() {
        addFirstPanel();
    }

    private void addFirstPanel() {
        totalPanel.add(firstPanel);
        totalPanel.add(thirdPanel);
    }

    public void setThirdPanelStatus(boolean thirdPanelStatus){
        if (thirdPanelStatus) {
            totalPanel.remove(thirdPanel);
        }else{
            totalPanel.add(thirdPanel);
        }
        revalidate();
        repaint();
    }
}
