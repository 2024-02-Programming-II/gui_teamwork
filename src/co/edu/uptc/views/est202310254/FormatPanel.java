package co.edu.uptc.views.est202310254;

import co.edu.uptc.views.constants.ColorPalette;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JToolBar;
import javax.swing.UIManager;
import javax.swing.border.BevelBorder;
import javax.swing.border.TitledBorder;

public class FormatPanel extends JPanel{

    private JToolBar tools;
    private final String [] FONT_OPTIONS = {"Calibri(Cuerpo)", "unimplemented","unimplemented"};
    private String [] sizeOptions;
    private final String [] FORMAT = {"Automático", "unimplemented","unimplemented"};
    private final String [] IMG_PATHS = {"/Assets/nLetter.png","/Assets/underlinedLetter.png"};
    
    public FormatPanel(){
        createSizeOptions();
        setLayout(new FlowLayout(FlowLayout.LEFT));
        setPreferredSize(new Dimension(Constants.WIDTH,65));
        setOpaque(false);
        setBorder(BorderFactory.createTitledBorder(BorderFactory.createMatteBorder(1, 0, 0, 0, ColorPalette.COLOR_TITLE_BACKGROUND ), "Formato", TitledBorder.LEFT,TitledBorder.CENTER));
        UIManager.put("TItledBorder.titleColor", ColorPalette.COLOR_TITLE_FOREGROUND);
        initComponents();
    }
    
    private void initComponents(){
       initializeToolBar();
       addFontSize();
       addFontButtons();
       add(createChooser(this.FORMAT, 130));
    }

    private void initializeToolBar(){
        this.tools = new JToolBar();
        this.tools.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 5));
        this.tools.setOpaque(false);
        this.tools.setBorderPainted(false);
        this.tools.setFloatable(false);
    }

    private void addFontSize(){
        this.tools.add(createChooser(this.FONT_OPTIONS, 130));
        this.tools.add(createChooser(this.sizeOptions, 45));
        addSeparator();
        add(this.tools);
    }

    private void addFontButtons(){
        for (String path : this.IMG_PATHS) {
            JButton btn = createButton(path);
            this.tools.add(btn);
        }
        addSeparator();
    }

    private JButton createButton(String imgPath){
        String path = System.getProperty("user.dir");
        ImageIcon btnIcon = new ImageIcon(path + imgPath);
        JButton btn = new JButton(btnIcon);
        btn.setOpaque(false);
        btn.setBorderPainted(false);
        btn.setContentAreaFilled(false);
        return btn;
    }

    private JComboBox createChooser(String [] options, int desiredWidth){
        JComboBox chooser = new JComboBox(options);
        chooser.setPreferredSize(new Dimension(desiredWidth, 30));
        chooser.setOpaque(false);
        chooser.setBackground(Color.white);
        chooser.setForeground(Color.black);
        chooser.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));

        return chooser;
    }

    private void addSeparator(){
        JSeparator sep = new JSeparator(JSeparator.VERTICAL);
        sep.setBackground(Color.gray);
        sep.setPreferredSize(new Dimension(1, 30));
        this.tools.add(sep);
    }

    private void createSizeOptions(){
        this.sizeOptions = new String [20];
        for(int i = 0; i < this.sizeOptions.length; i++){
            String option = "" + (i+1);
            this.sizeOptions[i] = option;
        }
    }
}
