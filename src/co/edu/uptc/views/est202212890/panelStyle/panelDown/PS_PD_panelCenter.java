package co.edu.uptc.views.est202212890.panelStyle.panelDown;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.MatteBorder;

public class PS_PD_panelCenter extends JPanel{

    private JButton btn_left, btn_center, btn_rigth, btn_columns, btn_twoLines, btn_ThreeLines, btn_fourLines, btn_out, btn_in, btn_leftColumns, btn_rigthColumns;
    public PS_PD_panelCenter(){
        configurationPanel();
    }

    private void configurationPanel(){
        setLayout(new FlowLayout(FlowLayout.LEFT));
        setBorder(new MatteBorder(1,0,0,0, Color.BLACK));
        initComponents();
    }

    private void initComponents(){
        addBtnLeft();
        addBtnCenter();
        addBtnRigth();
        addBtnColumns();
        addBtnTwoLines();
        addBtnThreeLines();
        addBtnFourLines();
        addBtnOut();
        addBtnIn();
        addBtnLeftColumns();
        addBtnRigthColumns();
    }  

    private void addBtnLeft(){
        ImageIcon originalIcon = new ImageIcon("assents/alineacion-izquierda.png");
        Image orImage = originalIcon.getImage();
        Image resImage = orImage.getScaledInstance(15, 15, Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(resImage);
        btn_left = new JButton();
        btn_left.setIcon(icon);
        add(btn_left);
    }

    private void addBtnCenter(){
        ImageIcon originalIcon = new ImageIcon("assents/alinear-al-centro.png");
        Image orImage = originalIcon.getImage();
        Image resImage = orImage.getScaledInstance(15, 15, Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(resImage);
        btn_center = new JButton();
        btn_center.setIcon(icon);
        add(btn_center);
    }

    private void addBtnRigth(){
        ImageIcon originalIcon = new ImageIcon("assents/alinear-a-la-derecha.png");
        Image orImage = originalIcon.getImage();
        Image resImage = orImage.getScaledInstance(15, 15, Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(resImage);
        btn_rigth = new JButton();
        btn_rigth.setIcon(icon);
        add( btn_rigth);
    }

    private void addBtnColumns(){
        ImageIcon originalIcon = new ImageIcon("assents/texto-justificado.png");
        Image orImage = originalIcon.getImage();
        Image resImage = orImage.getScaledInstance(15, 15, Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(resImage);
        btn_columns  = new JButton();
        btn_columns.setIcon(icon);
        add(btn_columns);
    }

    private void addBtnTwoLines(){
        ImageIcon originalIcon = new ImageIcon("assents/Aliggg.png");
        Image orImage = originalIcon.getImage();
        Image resImage = orImage.getScaledInstance(15, 15, Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(resImage);
        btn_twoLines = new JButton();
        btn_twoLines.setIcon(icon);
        add(btn_twoLines);
    }

    private void addBtnThreeLines(){
        ImageIcon originalIcon = new ImageIcon("assents/Aliggg.png");
        Image orImage = originalIcon.getImage();
        Image resImage = orImage.getScaledInstance(15, 15, Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(resImage);
        btn_ThreeLines = new JButton();
        btn_ThreeLines.setIcon(icon); 
        add(btn_ThreeLines);
    }

    private void addBtnFourLines(){
        ImageIcon originalIcon = new ImageIcon("assents/Aliggg.png");
        Image orImage = originalIcon.getImage();
        Image resImage = orImage.getScaledInstance(15, 15, Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(resImage);
        btn_fourLines = new JButton();
        btn_fourLines.setIcon(icon);
        add(btn_fourLines);
    }

    private void addBtnOut(){
        ImageIcon originalIcon = new ImageIcon("assents/separar.png");
        Image orImage = originalIcon.getImage();
        Image resImage = orImage.getScaledInstance(15, 15, Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(resImage);
        btn_out = new JButton();
        btn_out.setIcon(icon);
        add(btn_out);
    }

    private void addBtnIn(){
        ImageIcon originalIcon = new ImageIcon("assents/unir.png");
        Image orImage = originalIcon.getImage();
        Image resImage = orImage.getScaledInstance(15, 15, Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(resImage);
        btn_in = new JButton();
        btn_in.setIcon(icon);
        add(btn_in);
    }
    private void addBtnLeftColumns(){
        ImageIcon originalIcon = new ImageIcon("assents/sangriaLeft.png");
        Image orImage = originalIcon.getImage();
        Image resImage = orImage.getScaledInstance(15, 15, Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(resImage);
        btn_leftColumns = new JButton();
        btn_leftColumns.setIcon(icon);
        add(btn_leftColumns);
    }

    private void addBtnRigthColumns(){
        ImageIcon originalIcon = new ImageIcon("assents/disminuir.png");
        Image orImage = originalIcon.getImage();
        Image resImage = orImage.getScaledInstance(15, 15, Image.SCALE_SMOOTH);
        ImageIcon icon = new ImageIcon(resImage);
        btn_leftColumns = new JButton();
        btn_leftColumns.setIcon(icon);
        add(btn_leftColumns);
    }
}
