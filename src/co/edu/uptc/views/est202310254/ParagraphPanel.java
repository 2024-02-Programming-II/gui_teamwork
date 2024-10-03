package co.edu.uptc.views.est202310254;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class ParagraphPanel extends JPanel{

    private ParagraphToolsPanel tools;
    private JTextArea paragraph;
    private final String defText = "sxdfcgvhbjunkml,ñkmjnihbugvyfctdxrfcgvbhjnkmlñ,mkojnibhuvgycftxdrszdfghjklñ,kjnibhuvgycftxdrzsxdfcgvbhjnklmñ,mknojibhuvgyctfxdrzsdfcgvubinomkonjibhuvgycftdxrszzdfxgchbjkml,ñ{´.pójiygutcrxdzsezdfxgchjbklmñ,{,lmknjibhvugcyfdxgfh}}";
    private JPanel styleInfo;

    public ParagraphPanel(){
        setLayout(new BorderLayout());
        setPreferredSize(new Dimension(Constants.WIDTH, 300));
        setOpaque(false);
        initComponents();
    }

    private void initComponents(){
        this.tools = new ParagraphToolsPanel();
        this.add(this.tools, BorderLayout.NORTH);
        addTextArea();
        addStyleInfo();
    }

    private void addTextArea(){
        this.paragraph = new JTextArea();
        this.paragraph.setText(defText);
        this.paragraph.setBackground(Color.white);
        this.paragraph.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.black));
        this.paragraph.setPreferredSize(new Dimension(Constants.WIDTH, 50));
        this.paragraph.setLineWrap(true);
        this.paragraph.setWrapStyleWord(true);
        this.add(this.paragraph, BorderLayout.CENTER);
    }

    private void addStyleInfo(){
        this.styleInfo = new JPanel();
        styleInfo.setLayout(new FlowLayout(FlowLayout.LEFT, 10, 2));
        styleInfo.setOpaque(false);
        styleInfo.setPreferredSize(new Dimension(Constants.WIDTH, 50));
        styleInfo.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
        this.add(this.styleInfo, BorderLayout.SOUTH);
        addInfoLabels();
    }
    
    private JLabel createLabel(String name){
        JLabel info = new JLabel(name);
        info.setOpaque(false);
        info.setPreferredSize(new Dimension(Constants.WIDTH, 14));
        return info;
    }

    private void addInfoLabels(){
        this.styleInfo.add(createLabel("Fuente: (Predeterminada) + Cuerpo (Calibri), Izquierda"));
        this.styleInfo.add(createLabel("Interlineado: Multiple 1,08 lín. Espacio"));
        this.styleInfo.add(createLabel("Despues: 8 pto, Control de líneas viudas y huerfanas, Estilo: Mostrar en la galeria de estilos"));
        
    }

}
