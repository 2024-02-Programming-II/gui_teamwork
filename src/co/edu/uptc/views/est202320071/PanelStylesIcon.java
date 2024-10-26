package co.edu.uptc.views.est202320071;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JSeparator;
import javax.swing.ImageIcon;
import javax.swing.Icon;
import javax.swing.SwingConstants;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PanelStylesIcon extends JPanel{

    public PanelStylesIcon(){
        
        setLayout(new GridLayout(2, 1));
        initComponents();
    }

    private void initComponents(){
        addPanelNorth();
        addPanelCenter();
    }

    private void addPanelNorth(){

        JPanel panelNorth = new JPanel();
        panelNorth.setLayout(new FlowLayout(FlowLayout.LEFT));
        initComponentsPanelNorth(panelNorth);
        
        add(panelNorth);
    }

    
    private void addPanelCenter(){
       
        JPanel panelCenter = new JPanel();
        panelCenter.setLayout(new FlowLayout(FlowLayout.LEFT));
        initComponentsPanelCenter(panelCenter);
      
        add(panelCenter);

    }

    private void initComponentsPanelNorth(JPanel panel){
       
        addJComBox( panel, "Calibri (cuerpo)");
        addJComBox11( panel, "11");
        addSeparator(panel);
        addButton("N.png", panel);
        addButton("cursiva.png", panel);
        addButton("S.png", panel);
        addSeparator(panel);
        addJComBox( panel, "  Automático");
       
    }
    private void initComponentsPanelCenter(JPanel panel){
        
        addButton("AlineaIzqui.png", panel);
        addButton("Alineacent.png", panel);
        addButton("AlineaDere.png", panel);
        addButton("justificar.png", panel);
        addSeparator(panel);
        addButtomAlig1( panel);
        addButtomAlig2( panel);
        addButtomAlig3( panel);
        addSeparator(panel);
        addButton("separar.png", panel);
        addButton("unir.png", panel);
        addSeparator(panel);
        addButton("sangriaLeft.png", panel);
    }

    private void addJComBox(JPanel panel, String opcion){
     
        String[] opciones = {opcion, "Opción 2", "Opción 3", "Opción 4"};
         JComboBox<String> comboBox = new JComboBox<>(opciones);
         comboBox.setBackground(Color.WHITE);
        comboBox.setPreferredSize(new Dimension(150, 20));
         comboBox.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                
              comboBox.removeItem(opcion);
             }
         });
         panel.add(comboBox);

      }
      private void addJComBox11(JPanel panel, String opcion){
     
        String[] opciones = {opcion, "14", "16", "18"};
         JComboBox<String> comboBox = new JComboBox<>(opciones);
         comboBox.setBackground(Color.WHITE);
        comboBox.setPreferredSize(new Dimension(50, 20));
         comboBox.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                
              comboBox.removeItem(opcion);
             }
         });
         panel.add(comboBox);

      }
      
      private void addSeparator(JPanel panel){
        JSeparator separator = new JSeparator(SwingConstants.VERTICAL);
        separator.setPreferredSize(new Dimension(2, 30)); 
     panel.add( separator) ; 
    }

    public void addButton(String name, JPanel panel) {
        JButton button = new JButton();
        Dimension buttonSize = new Dimension(20, 20);
        button.setPreferredSize(buttonSize);
        button.setMinimumSize(buttonSize);
        button.setMaximumSize(buttonSize);
        button.setBorderPainted(false);
        button.setMaximumSize(new Dimension(15,15));
       
        button.setIcon(imageRedimention(name));
       
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
            }
        });
        panel.add(button);
     }
     public void addButtonWithDimension(String name, JPanel panel) {
        JButton button = new JButton();
        Dimension buttonSize = new Dimension(20, 20);
        button.setPreferredSize(buttonSize);
        button.setMinimumSize(buttonSize);
        button.setMaximumSize(buttonSize);
        button.setBorderPainted(false);
        button.setMaximumSize(new Dimension(15,15));
        
        button.setIcon(imageRedimention(name));
    
        panel.add(button);
     }
     private Icon imageRedimention(String name) {
        String projectRoot = System.getProperty("user.dir");
        String imagePath = projectRoot + "/assents/" + name;
        ImageIcon icon = new ImageIcon(imagePath);
        Image img = icon.getImage();
       Image newImg = img.getScaledInstance(15, 15, java.awt.Image.SCALE_SMOOTH);
        icon = new ImageIcon(newImg);
        return icon;
    }
     private void addButtomAlig1(JPanel panel){
        addButtonWithDimension("Aliggg.png", panel);

     }
     private void addButtomAlig2(JPanel panel){
        addButtonWithDimension("Aliggg.png", panel);
     }
     private void addButtomAlig3(JPanel panel){
      
        addButtonWithDimension("Aliggg.png", panel);
       
     }


}
