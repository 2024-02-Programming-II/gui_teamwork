package co.edu.uptc.views.est202310254;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class FormatOptionsPanel extends JPanel{

    private ArrayList<JButton> options;
    private final int WIDTH = 300;

    public FormatOptionsPanel(){
        setBackground(Color.white);
        setPreferredSize(new Dimension(WIDTH,WIDTH));
        setLayout(new FlowLayout(FlowLayout.LEFT));
        setAlignmentX(LEFT_ALIGNMENT);
        setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.lightGray));
        initComponents();
    }

    private void initComponents(){
        addOptionButtons();
    }

    private void addOptionButtons(){
        this.options = new ArrayList<>();
        this.options.add(createButton("Relleno de texto"));
        this.options.add(createButton("Contorno de texto"));
        this.add(this.options.get(0));
        this.add(this.options.get(1));
    }

    private JButton createButton(String text){
        JButton defButton = new JButton();
        defButton.setOpaque(false);
        defButton.setContentAreaFilled(false);
        defButton.setBorderPainted(false);
        defButton.setPreferredSize(new Dimension(WIDTH,20));
        defButton.setText(text);
        defButton.setHorizontalAlignment(SwingConstants.LEFT);
        
        return defButton;
    }

}
