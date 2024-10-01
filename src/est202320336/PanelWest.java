package est202320336;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class PanelWest extends JPanel{
    private JPanel jPanelNorth = new JPanel();
    private JPanel jPanelCenter = new JPanel();
    private JPanel jPanelSouth = new JPanel();
    public PanelWest(){
        setLayout(new BorderLayout());
        setBackground(Color.GRAY);
        setAlignmentY(LEFT_ALIGNMENT); 
        setPreferredSize(new Dimension(150, 1200));
        setMaximumSize(new Dimension(150, Integer.MAX_VALUE));
        setVisible(true);
        init();
    }
    private void init(){
        UbicationJPanelNorth();
        UbicationJPanelCenter();
        UbicationJPanelSouth();
    }
    private void UbicationJPanelNorth(){
        jPanelNorth.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 10));
        jPanelSouth.setPreferredSize(new Dimension(150,200));
        jPanelNorth.setAlignmentX(LEFT_ALIGNMENT);
        jPanelNorth.setBackground(Color.WHITE);
        initJPanelNorth();
        Border topBorder = BorderFactory.createMatteBorder(0, 0, 2, 0, Color.BLACK);
        jPanelNorth.setBorder(topBorder);
        this.add( jPanelNorth,BorderLayout.NORTH);
        jPanelNorth.setVisible(true);
    }
    private void UbicationJPanelCenter(){
        jPanelNorth.setLayout(new FlowLayout(FlowLayout.LEFT));
        jPanelCenter.setBackground(Color.WHITE);
        initJPanelCenter();
        this.add( jPanelCenter,BorderLayout.CENTER);
        jPanelCenter.setVisible(true);
    }
    private void UbicationJPanelSouth(){
        jPanelSouth.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 10));
        jPanelSouth.setPreferredSize(new Dimension(150,200));
        jPanelSouth.setAlignmentX(LEFT_ALIGNMENT);
        jPanelSouth.setBackground(Color.WHITE);
        this.add( jPanelSouth,BorderLayout.SOUTH);
        Border topBorder = BorderFactory.createMatteBorder(2, 0, 0, 0, Color.BLACK);
        jPanelSouth.setBorder(topBorder); 
        initJPanelSouth();
        jPanelSouth.setVisible(true);
    }
    private void initJPanelNorth(){
        addJlabelFoto();
        addJlabelUsuario();
        addJlabelLine();
    }
    private void initJPanelCenter(){
        addJbuttonMyDay();
        addJbuttonImportantes();
        addJbuttonTerminadas();
        addJbuttonPlaneadas();
    }
    private void initJPanelSouth(){
        addJbuttonConfiguaration();
        addJbuttonExit();
    }
    private void addJlabelFoto(){
        JLabel jLabel = new JLabel();
        String projectRoot = System.getProperty("user.dir");
        String imagePath = projectRoot+"/src/est202320336/pictes/usuario.png";
        ImageIcon image = new ImageIcon(imagePath);
        jLabel.setIcon(image);
        jPanelNorth.add(jLabel);
    }
    private void addJlabelUsuario(){
        JLabel jLabel = new JLabel("Carlos Torres");
        jLabel.setLayout(new FlowLayout(FlowLayout.CENTER));
        jPanelNorth.add(jLabel);
    }
    private void addJlabelLine(){
        JLabel jLabel = new JLabel("________________________");
        jLabel.setLayout(new FlowLayout(FlowLayout.CENTER));
        jPanelNorth.add(jLabel);
    }
    
    private JButton addJbutton(String name, ImageIcon image){
        JButton jButton = new JButton(name, image);
        jButton.setPreferredSize(new Dimension(150,30));
        jButton.setHorizontalAlignment(SwingConstants.LEFT);
        jButton.setFont(new Font ("arial",2,14));
        jButton.setBorder(null);
        jButton.setBackground(Color.WHITE);
        jButton.setForeground(Color.GRAY);
        return jButton;
    }
    private void addJbuttonMyDay(){
        String projectRoot = System.getProperty("user.dir");
        String imagePath = projectRoot+"/src/est202320336/pictes/Dia.png";
        ImageIcon image = new ImageIcon(imagePath);
        JButton jButton = addJbutton("Mi día",image);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               PrincipalFrame.getInstantance().activatePanel(1);
               PrincipalFrame.getInstantance().setFocusable(true);
                PrincipalFrame.getInstantance().requestFocus();
            }
        });
       jPanelCenter.add(jButton);
    }
    private void addJbuttonImportantes(){
        String projectRoot = System.getProperty("user.dir");
        String imagePath = projectRoot+"/src/est202320336/pictes/importante.png";
        ImageIcon image = new ImageIcon(imagePath);
        JButton jButton = addJbutton("Importantes",image);
        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               PrincipalFrame.getInstantance().activatePanel(2);
               PrincipalFrame.getInstantance().setFocusable(true);
                PrincipalFrame.getInstantance().requestFocus();
            }
        });
        jPanelCenter.add(jButton);
     }
     private void addJbuttonTerminadas(){
         String projectRoot = System.getProperty("user.dir");
         String imagePath = projectRoot+"/src/est202320336/pictes/checklist.png";
         ImageIcon image = new ImageIcon(imagePath);
         JButton jButton = addJbutton("Terminadas",image);
         jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               PrincipalFrame.getInstantance().activatePanel(3);
               PrincipalFrame.getInstantance().setFocusable(true);
                PrincipalFrame.getInstantance().requestFocus();
            }
        });jPanelCenter.add(jButton);
     }
     private void addJbuttonPlaneadas(){
         String projectRoot = System.getProperty("user.dir");
         String imagePath = projectRoot+"/src/est202320336/pictes/calendario.png";
         ImageIcon image = new ImageIcon(imagePath);
         JButton jButton = addJbutton("Planeadas",image);
         jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
               PrincipalFrame.getInstantance().activatePanel(4);
               PrincipalFrame.getInstantance().setFocusable(true);
                PrincipalFrame.getInstantance().requestFocus();
            }
        });
        jPanelCenter.add(jButton);
     }
     private void addJbuttonConfiguaration(){
         String projectRoot = System.getProperty("user.dir");
         String imagePath = projectRoot+"/src/est202320336/pictes/configuracion.png";
         ImageIcon image = new ImageIcon(imagePath);
         JButton jButton = addJbutton("Configuración",image);
       
        jPanelSouth.add(jButton);
     }
     private void addJbuttonExit(){
         String projectRoot = System.getProperty("user.dir");
         String imagePath = projectRoot+"/src/est202320336/pictes/salir.png";
         ImageIcon image = new ImageIcon(imagePath);
         JButton jButton = addJbutton("Exit",image);
        jPanelSouth.add(jButton);
     }
}
