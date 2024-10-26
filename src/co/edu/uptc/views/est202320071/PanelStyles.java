package co.edu.uptc.views.est202320071;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToggleButton;
import java.awt.Dimension;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

import co.edu.uptc.views.constants.ColorPalette;

public class PanelStyles extends JPanel{
  PanelStyles centerPanel;
   
    public PanelStyles(){
       
        setLayout(new BorderLayout());  
        initComponents();
      }

      private void initComponents() {
        addPanelNorth();
        addPanelCenter();
        addPanelSouth();
      }

      private void addPanelNorth(){
        JPanel northPanel = new JPanel();
        JLabel labelModi = new JLabel("Modificar estilo");
        northPanel.setPreferredSize(new Dimension(this.getWidth(), 30));
        northPanel.setLayout(new FlowLayout( FlowLayout.LEFT));
        northPanel.setBackground(ColorPalette.COLOR_BACKGROUND_INFO);
        northPanel.add(labelModi);
        add(northPanel, BorderLayout.NORTH);
      }

      private void addPanelCenter(){
        PanelStylesCenter centerPanel = new PanelStylesCenter();
        centerPanel.setPreferredSize(new Dimension(this.getWidth(), this.getHeight()-60));
        add(centerPanel, BorderLayout.CENTER);
    }
      private void addPanelSouth(){
        JPanel panelSouth = new JPanel();
        panelSouth.setPreferredSize(new Dimension(this.getWidth(), 50));
        panelSouth.setLayout(new FlowLayout( FlowLayout.LEFT));
        panelSouth.setBackground(ColorPalette.COLOR_BACKGROUND_INFO);
        panelSouth.setBorder(new EmptyBorder(0, 0, 2, 10));
        addMiniPanelSouthForButton(panelSouth);
        panelSouth.add(addJbuttonToggle("Aceptar"));
        panelSouth.add(addJbuttonToggle("Cancelar"));
        add(panelSouth, BorderLayout.SOUTH);
      }

      private void addMiniPanelSouthForButton(JPanel panel){
        JPanel miniPanel = new JPanel();
        miniPanel.setPreferredSize(new Dimension(1100, 40));
        miniPanel.setBorder(new EmptyBorder(0, 5, 0, 10));
        miniPanel.setLayout(new FlowLayout( FlowLayout.LEFT));
        miniPanel.setBackground(ColorPalette.COLOR_BACKGROUND_INFO);
        miniPanel.add(addButtomFormat());
        
        panel.add(miniPanel);

      }
      
      private JToggleButton  addButtomFormat(){
       
        RoundedToggleButtom toggleButton = new RoundedToggleButtom("Formato");
        toggleButton.addActionListener(new ActionListener() {
          @Override
          public void actionPerformed(ActionEvent e) {
    
           JDialogFormato dialog = new JDialogFormato();
           dialog.setVisible(true);
          }
       });
      return toggleButton;
      }

      private  JToggleButton addJbuttonToggle(String name){
        RoundedToggleButtom toggleButton = new RoundedToggleButtom(name);

        return toggleButton;
      }
    
    }
  