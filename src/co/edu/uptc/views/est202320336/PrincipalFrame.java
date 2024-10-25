package co.edu.uptc.views.est202320336;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class PrincipalFrame extends JPanel{

    private static PrincipalFrame instance=null;
    private JPanel jPanel;
    private PanelMyDay panelMyDay;
    private PanelImportant panelImportant;
    private PanelTerminadas panelTerminadas;
    private PanelPlaneadas panelPlaneadas;
    
    public JPanel getjPanel() {
        return jPanel;
    }
    
    private PrincipalFrame(){;
        setBackground(Color.WHITE);
        setLayout(new BorderLayout());
        setMinimumSize(new Dimension(500,500));
        initComponents();
        setVisible(true);
    }
    public static PrincipalFrame getInstantance(){
        if (instance == null){
            instance = new PrincipalFrame();
        }
        return instance;
    }
    private void initComponents() {
        this.setFocusable(true);
        this.requestFocus();
        createPanelFound();
       createPanelWest();
    }
    private void createPanel(){
        panelMyDay = new PanelMyDay();
        panelMyDay.setBounds(1,1,jPanel.getWidth(),jPanel.getHeight());
        panelImportant = new PanelImportant();
        panelImportant.setBounds(1,1,jPanel.getWidth(),jPanel.getHeight());
        panelTerminadas = new PanelTerminadas();
        panelTerminadas.setBounds(1,1,jPanel.getWidth(),jPanel.getHeight());
        panelPlaneadas = new PanelPlaneadas();
        panelPlaneadas.setBounds(1,1,jPanel.getWidth(),jPanel.getHeight());
        jPanel.add(panelMyDay);
        jPanel.add(panelImportant);
        jPanel.add(panelTerminadas);
        jPanel.add(panelPlaneadas);
    }


    public void activatePanel(int number){
        if (panelMyDay ==null) {
            createPanel();
        }
        panelMyDay.setVisible(false);
        panelImportant.setVisible(false); 
        panelTerminadas.setVisible(false);
        panelPlaneadas.setVisible(false);
        switch (number) {
            case 1:
                panelMyDay.setVisible(true);
                break;
            case 2:
                panelImportant.setVisible(true);
                break;
            case 3:
                panelTerminadas.setVisible(true);
            break;
            case 4:
                panelPlaneadas.setVisible(true);
            break;
            default:
                break;
        }
        paintComponents(getGraphics());
    }
    private void createPanelFound(){
        jPanel = new JPanel(){
        String projectRoot = System.getProperty("user.dir");
        String imagePath = projectRoot+"\\assents\\fondo.png";
        private Image image = new ImageIcon(imagePath).getImage();
        @Override
        protected void paintComponent(Graphics g) {
            super.paintComponent(g);
            g.drawImage(image, 0, 0, getWidth(), getHeight(), this);
        }
    };
        jPanel.setLayout(null);
        this.add(jPanel,BorderLayout.CENTER);
    }
    private void createPanelWest(){
        PanelWest jPanel = new PanelWest();
        this.add(jPanel,BorderLayout.WEST);
        this.addKeyListener(new KeyListener() {
            private boolean threePressed = false;
            private boolean hPressed = false;
            private boolean aPressed = false;
            @Override
            public void keyTyped(KeyEvent e) {}

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_CONTROL) {
                    threePressed = true;
                }
                if (e.getKeyCode() == KeyEvent.VK_H) {
                    hPressed = true;
                }
                if (e.getKeyCode() == KeyEvent.VK_A) {
                    aPressed = true;
                }
                if (threePressed && hPressed && aPressed) {
                    jPanel.setVisible(!jPanel.isVisible());
                }
            }
            
            @Override
            public void keyReleased(KeyEvent e) {
            if (e.getKeyCode() == KeyEvent.VK_3) {
                threePressed = false;
            }
            if (e.getKeyCode() == KeyEvent.VK_H) {
                hPressed = false;
            }
            if (e.getKeyCode() == KeyEvent.VK_A) {
                aPressed = false;
            }
        }
        });
    }
}
