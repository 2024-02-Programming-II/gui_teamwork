package co.edu.uptc.views.StylesManagerViews202320071;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;

public class PanelStylesCenter extends JPanel {

    public PanelStylesCenter(){
        setLayout(new BorderLayout());
        setBackground(Color.LIGHT_GRAY);
        initComponents();

    }

    private void initComponents(){
        add(addPanelCenterNorth(), BorderLayout.NORTH);
        add(addPanelCenterCenter(), BorderLayout.CENTER);
        
      
    }


    private JPanel addPanelCenterNorth(){
        PanelCenterNorthStyles centerPanelNorth = new PanelCenterNorthStyles();
        centerPanelNorth.setPreferredSize(new Dimension(this.getWidth(), 190));
        centerPanelNorth.setBackground(Color.LIGHT_GRAY);
        centerPanelNorth.setBorder(new EmptyBorder(10, 10, 10, 0));
       
     
    return centerPanelNorth;
    }

    private JPanel addPanelCenterCenter(){
      
        JPanel centerPanelCenter = new JPanel();
        centerPanelCenter.setPreferredSize(new Dimension(this.getWidth(), 300));
        centerPanelCenter.setBackground(Color.CYAN);
        centerPanelCenter.setLayout(new BorderLayout());
        centerPanelCenter.add(addPanelCenterCenterNorth(), BorderLayout.NORTH);
        centerPanelCenter.add(addPanelCenterCenterJPanel(), BorderLayout.CENTER);
     
    return centerPanelCenter;
    }

    private JPanel addPanelCenterCenterNorth(){
       
      JPanel panelStylesIcon = new PanelStylesIcon();
      panelStylesIcon.setPreferredSize(new Dimension(this.getWidth(), 80));
      panelStylesIcon.setBorder(new EmptyBorder(0, 20, 0, 20));
     
        return panelStylesIcon;
    
       }
       private JPanel addPanelCenterCenterJPanel(){
       
          JPanel centerPanelCenter = new JPanel();
          centerPanelCenter.setPreferredSize(new Dimension(this.getWidth(), 100));
          centerPanelCenter.setBackground(Color.LIGHT_GRAY);
         
          centerPanelCenter.setBorder(new EmptyBorder(10, 10, 10, 10));
         centerPanelCenter.setLayout(new FlowLayout(FlowLayout.LEFT));
         initComponentsCenterPanelCenter(centerPanelCenter);
       
      return centerPanelCenter;
      }
      private void initComponentsCenterPanelCenter(JPanel jPanel){
        addPanelExampleText(jPanel);
        addPanelTextCenterPanel(jPanel);
        CheckBox("Agregar a la galería de estilos",  jPanel);
        ButtonGroup ( jPanel);
      
       
      }

  
  private JLabel addLabel(String name, JPanel panel, int x){
    JLabel label = new JLabel(name); 
    label.setPreferredSize(new Dimension(x, 20));
    panel.add(label);
    return label;
  } 

private void addPanelExampleText(JPanel jpanel){
    JPanel panelExampleText = new JPanel();
    panelExampleText.setLayout(new FlowLayout(FlowLayout.LEFT));
    addLabel("TextoEjemploTextoEjemploTextoEjemploTextoEjemploTextoEjemploTextoEjemploTextoEjemplo", panelExampleText, 1200);
    panelExampleText.setPreferredSize(new Dimension(1300, 250));
    panelExampleText.setBackground(Color.WHITE);
    Border topBorder = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.GRAY);
    panelExampleText.setBorder(topBorder);
    jpanel.add(panelExampleText);
  
  }
 
  private void addPanelTextCenterPanel(JPanel jpanel){
    JPanel panelExampleText = new JPanel();
    panelExampleText.setPreferredSize(new Dimension(1300, 70));
    addLabel("Fuente: (Predeterminada) +Cuerpo (Calibri), Izquierda\n" + 
          "\n" +  "Interlineado: Múltiple 1,08 lín., Espacio\n" + 
          "\n" + "Después: 8 pto, Control de líneas viudas y huérfanas, Estilo: Mostrar en la galería de estilos", panelExampleText, 1200);
     Border topBorder = BorderFactory.createMatteBorder(1, 1, 1, 1, Color.GRAY);
     panelExampleText.setBorder(topBorder);
    panelExampleText.setBackground(Color.LIGHT_GRAY);
    jpanel.add(panelExampleText);
   }
   private void CheckBox(String text, JPanel jpanel){
    JCheckBox checkBox = new JCheckBox(text);
    checkBox.setPreferredSize(new Dimension(1400, 20));
    checkBox.setBorder(null);
    checkBox.setBackground(Color.LIGHT_GRAY);
    jpanel.add(checkBox);
  
   }
  
   private void ButtonGroup ( JPanel jpanel){
  
    JRadioButton option1 = new JRadioButton("Solo en este documento");
    JRadioButton option2 = new JRadioButton("Documentos nuevos basados en esta plantilla");
  
    ButtonGroup group = new ButtonGroup();
    group.add(option1);
    group.add(option2);
    option1.setBackground(Color.LIGHT_GRAY);
    option2.setBackground(Color.LIGHT_GRAY);
     jpanel.add(option1);
     jpanel.add(option2);
  
  }

}
