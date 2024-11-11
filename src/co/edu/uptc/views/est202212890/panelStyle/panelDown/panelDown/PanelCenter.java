package co.edu.uptc.views.est202212890.panelStyle.panelDown.panelDown;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;

import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.border.MatteBorder;

public class PanelCenter extends JPanel {
    
    private JTextArea textArea;
    private int HEIGHT = 120;
    public PanelCenter(){
        PanelConfiguration();   
    }

    private void PanelConfiguration(){
        initComponents();
        setLayout(new FlowLayout(FlowLayout.LEFT));
        setPreferredSize(new Dimension(0,HEIGHT));
        setBorder(new MatteBorder(0,1,1,1, Color.BLACK));
    }

    private void initComponents(){
        addTextArea();
    }

    private void addTextArea(){
        textArea = new JTextArea("Fuente: (Predeterminada) +Cuerpo (Calibri), Izquierda\n" +
                        "\n" +  "Interlineado: Múltiple 1,08 lín., Espacio\n" + 
                          "\n" + " Después: 8 pto, Control de líneas viudas y huérfanas, Estilo: Mostrar en la galería de estilos");
    textArea.setPreferredSize(new Dimension(1040, 100));
    textArea.setEditable(false);
    add(textArea);
    }
}
