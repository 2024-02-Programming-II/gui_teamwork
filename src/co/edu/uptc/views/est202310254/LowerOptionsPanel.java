package co.edu.uptc.views.est202310254;

import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.JCheckBox;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;

public class LowerOptionsPanel extends JPanel{

    private JToggleButton galleryStyles;
    private JToggleButton onlyInDoc;
    private JToggleButton DocsBased;

    public LowerOptionsPanel(){
        setPreferredSize(new Dimension(Constants.WIDTH, 200));
        setLayout(new FlowLayout(FlowLayout.LEFT));
        setOpaque(false);
        initComponents();
    }

    private void initComponents(){
        createButtons();
        addGalleryStyles();
        addRountBtnPane();
        
    }

    private void createButtons(){
        createGalleryBtn();
        createDocBtn();
        creatNewInBtn();
    }

    private void addGalleryStyles(){
        JPanel stylesGalleryPane = new JPanel(new FlowLayout(FlowLayout.LEFT));
        stylesGalleryPane .setPreferredSize(new Dimension(Constants.WIDTH, 25));
        stylesGalleryPane.setOpaque(false);
        stylesGalleryPane.add(this.galleryStyles);
        this.add(stylesGalleryPane);
    }

    private void addRountBtnPane(){
        JPanel roundOptions = new JPanel(new FlowLayout(FlowLayout.LEFT));
        roundOptions .setPreferredSize(new Dimension(Constants.WIDTH, 25));
        roundOptions.setOpaque(false);
        roundOptions.add(this.onlyInDoc);
        roundOptions.add(this.DocsBased);
        this.add(roundOptions);
    }

    private void createGalleryBtn(){
        this.galleryStyles = new JCheckBox("Agregar a la galeria de estilos");
        customizeButton(this.galleryStyles);

    }   

    private void createDocBtn(){
        this.onlyInDoc = new JRadioButton("Solo en este documento");
        customizeButton(this.onlyInDoc);
    }

    private void creatNewInBtn(){
        this.DocsBased= new JRadioButton("Documentos nuevos basados en esta plantilla");
        customizeButton(this.DocsBased);
    }

    private void customizeButton(JToggleButton desiredButton){
        desiredButton.setOpaque(false);
        desiredButton.setBorderPainted(false);
        desiredButton.setContentAreaFilled(false);
    }

}
