package co.edu.uptc.views.StylesManagerViews202320071;
import javax.swing.*;
import java.awt.*;
import javax.swing.border.EmptyBorder;

import co.edu.uptc.views.components.ComboItem;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class PanelCenterNorthStyles extends JPanel{

    public PanelCenterNorthStyles(){

        setLayout(new BorderLayout());
        setBackground(Color.LIGHT_GRAY);
        initComponents();

    }
    private void initComponents(){
       addPanelLeft();
       addPanelRigth();
        
      }
   
      
      private JLabel addLabel(String name, JPanel panel, int x){
        JLabel label = new JLabel(name); 
        label.setPreferredSize(new Dimension(x, 20));
        panel.add(label);
        return label;
      } 
    
      private void addJtextField(String name, JPanel panel, int x){
      
        JTextField textField = new JTextField(name);
        textField.setPreferredSize(new Dimension(x, 20));
        panel.add(textField);
      
      }
      private void addJComBox(JPanel panel, int x, String opcion){
     
        String[] opciones = {opcion, "Opción 2", "Opción 3", "Opción 4"};
         JComboBox<String> comboBox = new JComboBox<>(opciones);
         comboBox.setBackground(Color.WHITE);
         comboBox.setEnabled(false);
        comboBox.setPreferredSize(new Dimension(x, 20));
       
      
         
         comboBox.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
                
              comboBox.removeItem(opcion);
                 
                
             }
         });
         panel.add(comboBox);
      
      }

      private void addPanelLeft(){

        JPanel panelLeft = new JPanel();
        panelLeft.setPreferredSize(new Dimension(300, 350));
        panelLeft.setLayout(new GridLayout(6, 1, 0, 5));
        panelLeft.setBackground(Color.LIGHT_GRAY);
        initComponentsPanelLeft(panelLeft);
        add(panelLeft, BorderLayout.WEST);

      }
      private void initComponentsPanelLeft(JPanel panel){
        addLabel("Propiedades _________________________________________________________________________________________________________", panel, 100);
        addLabel("Nombre: ", panel, 300);
        addLabel("Tipo de estilo: ", panel, 300);
        addLabel("Estilo basado en: ", panel, 300);
        addLabel("Estilo del párrafo siguiente: ", panel, 300);
        addLabel("Formato _________________________________________________________________________________________________________", panel, 100);
      }
   
      private void addPanelRigth(){
      
        JPanel panelRigth = new JPanel();
        panelRigth.setPreferredSize(new Dimension(300, 350));
        panelRigth.setLayout(new GridLayout(6, 1, 0, 5));
        panelRigth.setBackground(Color.LIGHT_GRAY);
        setBorder(new EmptyBorder(0, 0, 0, 30));
        initComponentsPanelRigth(panelRigth);
        add(panelRigth, BorderLayout.CENTER);

      }
      private void initComponentsPanelRigth(JPanel panel){
       
        addLabel("___________________________________________________________________________________________________________________________", panel,300);
        addJtextField("Nombre", panel, 1000);
        addJComBox(panel,1000, "Párrafo" );
        addJComBox(panel,1000, "   (Sin estilo)" );
        addJComBoxItem(panel,1000, "   Normal" );
        addLabel("___________________________________________________________________________________________________________________________", panel,300);
      }

      private void addJComBoxItem(JPanel panel, int x, String opcion) {
        String projectRoottt = System.getProperty("user.dir");
        String imagePath = projectRoottt + "/src/assest202320071/paragraph.png";
        ComboItem[] opciones = {
          
            new ComboItem(opcion, new ImageIcon(imagePath)),
        };
        
        JComboBox<ComboItem> comboBox = new JComboBox<>(opciones);
        comboBox.setPreferredSize(new Dimension(x, 20));
        comboBox.setBackground(Color.WHITE);
        comboBox.setRenderer(new ListCellRenderer<ComboItem>() {
            @Override
            public Component getListCellRendererComponent(JList<? extends ComboItem> list, ComboItem value, int index, boolean isSelected, boolean cellHasFocus) {
                JLabel label = new JLabel();
                label.setText(value.getText());
                label.setIcon(value.getIcon());
                if (isSelected) {
                    label.setBackground(list.getSelectionBackground());
                    label.setForeground(list.getSelectionForeground());
                } else {
                    label.setBackground(list.getBackground());
                    label.setForeground(list.getForeground());
                }
                label.setOpaque(true);  
                return label;
            }
        });
    
        comboBox.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                comboBox.removeItem(opcion); 
            }
        });
    
        panel.add(comboBox);
    }
    


}
