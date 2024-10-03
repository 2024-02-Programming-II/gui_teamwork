package co.edu.uptc.views.est202310254;

import co.edu.uptc.views.constants.ColorPalette;
import co.edu.uptc.views.mainViews.MainFrame;
import java.awt.BorderLayout;
import java.awt.Dimension;
import javax.swing.Box;
import javax.swing.JDialog;

public class TextFormatDialog extends JDialog{


    private TextFormatPanel formatPanel;


    public TextFormatDialog (){
        super(MainFrame.getInstance(), true);
        setSize(500,Constants.WIDTH);
        getContentPane().setBackground(ColorPalette.COLOR_TITLE_BACKGROUND);
        setLocationRelativeTo(MainFrame.getInstance());
        setResizable(false);
        setLayout(new BorderLayout());
        initComponents();
    }

    private void initComponents(){
        addFormatPaneLimits();
        addFormatPane();
    }

    private void addFormatPane(){
        this.formatPanel = new TextFormatPanel();
        this.add(this.formatPanel, BorderLayout.CENTER);
    }
    
    private void addFormatPaneLimits(){
        this.add(Box.createRigidArea(new Dimension(Constants.WIDTH, 10)), BorderLayout.NORTH);
        this.add(Box.createRigidArea(new Dimension(Constants.WIDTH, 10)), BorderLayout.SOUTH);
        this.add(Box.createRigidArea(new Dimension(10, 500)), BorderLayout.EAST);
        this.add(Box.createRigidArea(new Dimension(10, 500)), BorderLayout.WEST);
    }


}
