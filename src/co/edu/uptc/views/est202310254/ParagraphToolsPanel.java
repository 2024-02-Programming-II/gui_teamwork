package co.edu.uptc.views.est202310254;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JToolBar;


public class ParagraphToolsPanel extends JPanel{

    private JToolBar tools;
    private final String [] ALIGN_IMG = {"/Assets/leftAlign.png","/Assets/centerAlign.png","/Assets/rightAlign.png","/Assets/justifyText.png"};
    private final String [] INTERLINE_IMG = {"/Assets/space.png","/Assets/removeSpace.png"};
    private final String [] JUSTIFY_IMG = {"/Assets/sangria.png","/Assets/sin-sangria.png"};
    private final String [] LINE_SPACING_IMG = {"/Assets/littleSpace.png","/Assets/middleSpace.png","/Assets/greatSpace.png"};

    public ParagraphToolsPanel(){
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(800,50));
        setOpaque(false);
        setBorder(BorderFactory.createMatteBorder(1, 0, 0, 0, Color.gray));
        initComponents();
    }

    private void initComponents(){
        createToolBar();
        addAlignButtons();
        addSpacingButtons();
        addInterlineButtons();
        addJustifyButtons();
    }

    private void createToolBar(){
        this.tools = new JToolBar();
        this.tools.setOpaque(false);
        this.tools.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 10));
        this.tools.setPreferredSize(new Dimension(Constants.WIDTH,50));
        this.tools.setBorderPainted(false);
        this.tools.setFloatable(false);
        add(this.tools, BorderLayout.NORTH);
    }

    private void addAlignButtons(){
       addButtons(this.ALIGN_IMG);
    }

    private void addInterlineButtons(){
        addButtons(this.INTERLINE_IMG);
    }

    private void addJustifyButtons(){
        addButtons(this.JUSTIFY_IMG);
    }

    private void addSpacingButtons(){
        addButtons(this.LINE_SPACING_IMG);
    }
    
    private void addButtons(String [] options){
        for (String path: options) {
            JButton btn = createButton(path);
            this.tools.add(btn);
        }
        addSeparator();
    }

    private JButton createButton(String imgPath){
        String dir = System.getProperty("user.dir");
        ImageIcon img = new ImageIcon(dir + imgPath);
        JButton desiredButton = new JButton(img);
        desiredButton.setOpaque(false);
        desiredButton.setBorderPainted(false);
        return desiredButton;
    }

    private void addSeparator(){
        JSeparator sep = new JSeparator(JSeparator.VERTICAL);
        sep.setBackground(Color.gray);
        sep.setPreferredSize(new Dimension(1, 30));
        this.tools.add(sep);
    }



}
