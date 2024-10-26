package co.edu.uptc.views.est202320071;
import javax.swing.JPanel;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.ListCellRenderer;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Component;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import co.edu.uptc.views.components.ComboItem;

public class PanelCenterNorthStyles extends JPanel{

    public PanelCenterNorthStyles(){

        setLayout(new BorderLayout());
        initComponents();

    }
    private void initComponents(){
       addPanelLeft();
       addPanelRigth();
        
      }
   
      
      private JLabel addLabel(String name, JPanel panel){
        JLabel label = new JLabel(name); 
        label.setPreferredSize(new Dimension(300, 20));
        panel.add(label);
        return label;
      } 
    
      private void addJtextField(String name, JPanel panel){
      
        JTextField textField = new JTextField(name);
        textField.setPreferredSize(new Dimension(1000, 20));
        panel.add(textField);
      
      }
      private void addJComBox(JPanel panel, String opcion){
     
        String[] opciones = {opcion, "Opción 2", "Opción 3", "Opción 4"};
         JComboBox<String> comboBox = new JComboBox<>(opciones);
         comboBox.setBackground(Color.WHITE);
         comboBox.setEnabled(false);
        comboBox.setPreferredSize(new Dimension(1000, 20));
         comboBox.addActionListener(new ActionListener() {
             @Override
             public void actionPerformed(ActionEvent e) {
        
             }
         });
         panel.add(comboBox);
      
      }

      private void addPanelLeft(){

        JPanel panelLeft = new JPanel();
        panelLeft.setPreferredSize(new Dimension(300, 350));
        panelLeft.setLayout(new GridLayout(6, 1, 0, 5));
        initComponentsPanelLeft(panelLeft);
        add(panelLeft, BorderLayout.WEST);

      }
      private void initComponentsPanelLeft(JPanel panel){
        addSeparator(panel);
        addLabel("Nombre: ", panel);
        addLabel("Tipo de estilo: ", panel);
        addLabel("Estilo basado en: ", panel);
        addLabel("Estilo del párrafo siguiente: ", panel);
        addSeparator(panel);
      }
   
      private void addPanelRigth(){
      
        JPanel panelRigth = new JPanel();
        panelRigth.setPreferredSize(new Dimension(300, 350));
        panelRigth.setLayout(new GridLayout(6, 1, 0, 5));
        setBorder(new EmptyBorder(0, 0, 0, 30));
        initComponentsPanelRigth(panelRigth);
        add(panelRigth, BorderLayout.CENTER);

      }
      private void initComponentsPanelRigth(JPanel panel){
       
        addSeparator(panel);
        addJtextField("Nombre", panel);
        addJComBox(panel, "Párrafo" );
        addJComBox(panel, "   (Sin estilo)" );
        addJComboBoxItem(panel, "   Normal" );
        addSeparator(panel);
      }
private void addSeparator(JPanel panel) {
    JSeparator separator = new JSeparator(SwingConstants.HORIZONTAL);
    separator.setPreferredSize(new Dimension(1000, 1)); 
    panel.add(separator);
}
      private void addJComboBoxItem(JPanel panel, String opcion) {
        JComboBox<ComboItem> comboBox = createComboBox(opcion, 1000);
        setupComboBoxRenderer(comboBox);
        panel.add(comboBox);
    }
    
    private JComboBox<ComboItem> createComboBox(String opcion, int width) {
        String imagePath = getImagePath();
        ComboItem[] opciones = { new ComboItem(opcion, new ImageIcon(imagePath)) };
        
        JComboBox<ComboItem> comboBox = new JComboBox<>(opciones);
        comboBox.setPreferredSize(new Dimension(width, 20));
        comboBox.setBackground(Color.WHITE);
        comboBox.addActionListener(createComboBoxActionListener());
        
        return comboBox;
    }
    
    private String getImagePath() {
        String projectRoot = System.getProperty("user.dir");
        return projectRoot + "/assents/paragraph.png";
    }
    
    private void setupComboBoxRenderer(JComboBox<ComboItem> comboBox) {
        comboBox.setRenderer(new ListCellRenderer<ComboItem>() {
            @Override
            public Component getListCellRendererComponent(JList<? extends ComboItem> list, ComboItem value, int index, boolean isSelected, boolean cellHasFocus) {
                JLabel label = new JLabel();
                label.setText(value.getText());
                label.setIcon(value.getIcon());
                label.setOpaque(true);  
                return label;
            }
        });
    }
    
    private ActionListener createComboBoxActionListener() {
        return new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               
            }
        };
    }
    


}
