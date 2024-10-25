package co.edu.uptc.views.est202320336;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class PanelImportant extends JPanel{
    private JPanel jPanel ;
    public PanelImportant(){
        setLayout(new FlowLayout(FlowLayout.LEFT, 30, 10));
        setOpaque(false);
        init();
    }
    
    private void init(){
        addJlabelMiDia();
        addJlabelFecha();
        addPanel2();
    }
    
    private void addJlabelMiDia(){
        JLabel jLabel = new JLabel("Importantes");
        jLabel.setPreferredSize(new Dimension(1200,30));
        jLabel.setHorizontalAlignment(SwingConstants.LEFT);
        jLabel.setFont(new Font("arial",1,22));
        jLabel.setForeground(Color.WHITE);
        this.add(jLabel);
    }
    private void addJlabelFecha(){
        JLabel jLabel = new JLabel("Lunes, septiembre 5");
        jLabel.setPreferredSize(new Dimension(1200,30));
        jLabel.setHorizontalAlignment(SwingConstants.LEFT);
        jLabel.setFont(new Font("arial",2,12));
        jLabel.setForeground(Color.WHITE);
        this.add(jLabel);
    }
    private void addPanel2() {
        jPanel=createPanel("Visita amigos","/assents/circulo.png","/assents/checkImportante.png");
    }
    private JPanel createPanel(String text,String way, String way2){
        jPanel = new JPanel(){
        @Override
            protected void paintComponent(Graphics g){
                super.paintComponent(g);
                Graphics2D g2 = (Graphics2D) g;
                g2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
                g2.setColor(Color.WHITE);
                g2.fillRoundRect(0, 0, PrincipalFrame.getInstantance().getjPanel().getWidth()-60,60, 30, 30);
                g2.setColor(Color.BLACK); 
                g2.setStroke(new BasicStroke(1)); 
                g2.drawRoundRect(1, 1, getWidth() - 2, getHeight() - 2, 30, 30);
            }
        };
        propietiesPanel(text, way, way2);
        this.add(jPanel);
        return jPanel;
    }
    private void propietiesPanel(String text,String way, String way2){
        jPanel.setOpaque(false);
        jPanel.setLayout(new FlowLayout(FlowLayout.LEFT));
        jPanel.setPreferredSize(new Dimension(PrincipalFrame.getInstantance().getjPanel().getWidth()-60,60));
        addButtonPanel(way);
        JLabel jLabel = new JLabel(text);
        jPanel.add(jLabel);
        addButtonPanel(way2);
        jPanel.setVisible(true);
    }
    private void addButtonPanel(String way){
        String projectRoot = System.getProperty("user.dir");
        String imagePath = projectRoot+way;
        ImageIcon image = new ImageIcon(imagePath);
        JButton jButton = new JButton(image);
        jButton.setBackground(Color.WHITE);
        jButton.setBorder(null);
        jPanel.add(jButton);
    }
}
