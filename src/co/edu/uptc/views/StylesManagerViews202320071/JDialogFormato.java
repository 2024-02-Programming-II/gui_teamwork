package co.edu.uptc.views.StylesManagerViews202320071;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import co.edu.uptc.views.constants.ColorPalette;
import co.edu.uptc.views.mainViews.MainFrame;

public class JDialogFormato extends JDialog {
    public static final Color MICROSOFT = new Color( 239, 239, 239); 
   

public JDialogFormato(){
    getContentPane().setBackground(Color.white);
    setSize(350, 400);
    setResizable(false);
    setLocationRelativeTo(MainFrame.getInstance());
    setLayout(new BorderLayout());
    initComponents();
}
private void initComponents(){
    addPanelContainer();
}
private void addPanelContainer(){
    JPanel panel = new JPanel();
    panel.setBackground(MICROSOFT);
    panel.setLayout(new BorderLayout());
    panel.setPreferredSize(new Dimension(this.getWidth(), this.getHeight()));
    Border topBorder = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.GRAY);
    panel.setBorder(topBorder);
    initComponentsPanelContainer(panel);
    add(panel, BorderLayout.CENTER);
}
private void initComponentsPanelContainer(JPanel panel){
    addPanelNorth(panel);
    addPanelCenter(panel);
    addPanelSouth(panel);
    
}
private void addPanelNorth(JPanel panel){
   
    JPanel panelNorth = new JPanel();
       panelNorth.setBackground(MICROSOFT);
        panelNorth.setLayout(new FlowLayout(FlowLayout.LEFT));
        panelNorth.setPreferredSize(new Dimension(this.getWidth(), 100));
        initComponentsPanelNorth(panelNorth);
        panel.add( panelNorth, BorderLayout.NORTH);
}
private void initComponentsPanelNorth(JPanel panel){
    addLabelFormatText("FORMATOS DE TEXTO", panel );
    addPanelButtoms(panel);
}
private JLabel addLabelFormatText(String name, JPanel panel){
    JLabel label = new JLabel(name); 
    label.setPreferredSize(new Dimension(600, 20));
    label.setForeground(ColorPalette.COLOR_BACKGROUND_MAIN_MENU);
    panel.add(label);
    return label;
  } 
  private void addPanelButtoms(JPanel panel){
    JPanel panelButtoms = new JPanel();
    panelButtoms.setBackground(Color.WHITE);
    panelButtoms.setLayout(new FlowLayout(FlowLayout.LEFT));
    panelButtoms.setPreferredSize(new Dimension(this.getWidth(), 100));
    addButton("ABlue.png", panelButtoms);
    addButton("AnonColor.png", panelButtoms);
    
    panel.add(panelButtoms);
  }

private void addPanelSouth(JPanel panel){
   
    JPanel panelSouth = new JPanel();
        panelSouth.setBackground(Color.LIGHT_GRAY);
        panelSouth.setLayout(new FlowLayout(FlowLayout.RIGHT));
        panelSouth.setPreferredSize(new Dimension(this.getWidth(), 30));
        Border topBorder = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.GRAY);
        panelSouth.setBorder(topBorder);
        addButtomSimpleAccept("Aceptar", panelSouth);
        panel.add( panelSouth, BorderLayout.SOUTH);
}
private void addPanelCenter(JPanel panel){
   
    JPanel panelCenter = new JPanel();
    panelCenter.setBackground(MICROSOFT);
    panelCenter.setLayout(new BoxLayout(panelCenter, BoxLayout.Y_AXIS));
    panelCenter.setPreferredSize(new Dimension(350, 100));
    Border topBorder = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.GRAY);
     panelCenter.setBorder(topBorder);
     panelCenter.setBorder(new EmptyBorder(10, 15, 10,15));
    addButtomSimple("Relleno de texto",panelCenter );
    addButtomSimple("Contorno de texto", panelCenter);
    panel.add( panelCenter, BorderLayout.CENTER);
        
}

public void addButton(String name, JPanel panel) {
    JButton button = new JButton();
    button.setBackground(Color.WHITE);
    button.setBorderPainted(false);
    button.setMaximumSize(new Dimension(15,15));
   
    button.setIcon(imageRedimention(name));
    panel.add(button);
 }
 private Icon imageRedimention(String name){
    String projectRoot = System.getProperty("user.dir");
    String imagePath = projectRoot + "/src/assest202320071/" + name;
    ImageIcon icon = new ImageIcon(imagePath);
    Image img = icon.getImage();
   Image newImg = img.getScaledInstance(15, 15, java.awt.Image.SCALE_SMOOTH);
    icon = new ImageIcon(newImg);
    return icon;

 }

 private void addButtomSimple(String name, JPanel panel){
    JButton button = new JButton(name);
    button.setBorder(null);
    button.setBackground(MICROSOFT);
    panel.add(button);

 }
 private void addButtomSimpleAccept(String name, JPanel panel){
    JButton button = new JButton(name);
    button.setBackground(Color.LIGHT_GRAY);
    panel.add(button);

 }

}
