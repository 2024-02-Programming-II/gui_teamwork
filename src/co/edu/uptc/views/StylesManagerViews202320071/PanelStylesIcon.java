package co.edu.uptc.views.StylesManagerViews202320071;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelStylesIcon extends JPanel{

    public PanelStylesIcon(){
        
        setLayout(new GridLayout(2, 1));
        setBackground(Color.LIGHT_GRAY);
        initComponents();


    }

    private void initComponents(){
        addPanelNorth();
        addPanelCenter();
    }

    private void addPanelNorth(){

        JPanel panelNorth = new JPanel();
        panelNorth.setBackground(Color.LIGHT_GRAY);
        panelNorth.setLayout(new FlowLayout(FlowLayout.LEFT));
        initComponentsPanelNorth(panelNorth);
        
        add(panelNorth);
    }

    private void addPanelCenter(){
       
        JPanel panelSouth = new JPanel();
        panelSouth.setBackground(Color.LIGHT_GRAY);
        panelSouth.setLayout(new FlowLayout(FlowLayout.LEFT));
        initComponentsPanelCenter(panelSouth);
      
        add(panelSouth);

    }

    private void initComponentsPanelNorth(JPanel panel){
       
        addJComBox( panel, 150, "Calibri (cuerpo)");
        addJComBox( panel, 50, "11");
        addSeparator(panel);
        addButton("N.png", panel);
        addButton("cursiva.png", panel);
        addButton("S.png", panel);
        addSeparator(panel);
        addJComBox( panel, 150, "  Automático");
       
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

    private void addJComBox(JPanel panel, int x, String opcion){
     
        String[] opciones = {opcion, "Opción 2", "Opción 3", "Opción 4"};
         JComboBox<String> comboBox = new JComboBox<>(opciones);
         comboBox.setBackground(Color.WHITE);
        comboBox.setPreferredSize(new Dimension(x, 20));
       
      
         
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
        button.setBackground(Color.lightGray);
        button.setBorderPainted(false);
        button.setMaximumSize(new Dimension(15,15));
        String projectRoot = System.getProperty("user.dir");
        String imagePath = projectRoot + "/src/assest202320071/" + name;
        ImageIcon icon = new ImageIcon(imagePath);
        Image img = icon.getImage();
       Image newImg = img.getScaledInstance(15, 15, java.awt.Image.SCALE_SMOOTH);
        icon = new ImageIcon(newImg);
        button.setIcon(icon);
       
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
            }
        });
        panel.add(button);
     }
     public void addButtonWithDimension(String name, JPanel panel, int y) {
        JButton button = new JButton();
        Dimension buttonSize = new Dimension(20, 20);
        button.setPreferredSize(buttonSize);
        button.setMinimumSize(buttonSize);
        button.setMaximumSize(buttonSize);
        button.setBackground(Color.lightGray);
        button.setBorderPainted(false);
        button.setMaximumSize(new Dimension(15,15));
        String projectRoot = System.getProperty("user.dir");
        String imagePath = projectRoot + "/src/assest202320071/" + name;
        ImageIcon icon = new ImageIcon(imagePath);
        Image img = icon.getImage();
       Image newImg = img.getScaledInstance(15, y, java.awt.Image.SCALE_SMOOTH);
        icon = new ImageIcon(newImg);
        button.setIcon(icon);
    
        panel.add(button);
     }
     private void addButtomAlig1(JPanel panel){
        addButtonWithDimension("Aliggg.png", panel, 10);

     }
     private void addButtomAlig2(JPanel panel){
        addButtonWithDimension("Aliggg.png", panel, 15);
     }
     private void addButtomAlig3(JPanel panel){
      
        addButtonWithDimension("Aliggg.png", panel, 20);
       
     }


}
