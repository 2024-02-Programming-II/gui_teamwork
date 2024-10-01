package co.edu.uptc.views.mainViews;

import javax.swing.*;	

public class NumbersLine extends JDialog{
    public NumbersLine(){
        
        setSize(300, 300);
        setLocationRelativeTo(null);
    
        initComponents();
    }
    
    private void initComponents(){
        createPanel1();
    }

    private void createPanel1(){
        JPanel panel1 = new JPanel();
        panel1.setLayout(new BoxLayout(panel1, BoxLayout.Y_AXIS));
        panel1.add(new JLabel("Numeros de Línea"));
        panel1.add(new JCheckBox("Agregar Números de Línea"));
        panel1.add(createJLabelAndSpinner("Iniciar en:"));
        panel1.add(createJLabelAndSpinner("Desde el Texto:"));
        panel1.add(createJLabelAndSpinner("Intervalo:"));
        panel1.add(new JLabel("Numeración:"));
        panel1.add(new JRadioButton("Reinciar en cada Página"));
        panel1.add(new JRadioButton("Reiniciar en cada Sección"));
        panel1.add(new JRadioButton("Continua"));
        panel1.add(createPanel2());
        add(panel1);
    }

    private JPanel createPanel2(){
        JPanel panel2 = new JPanel();
        panel2.add(new JButton("Aceptar"));
        panel2.add(new JButton("Cancelar"));
        add(panel2);
        return panel2;
    }

    private JPanel createJLabelAndSpinner(String text){
        JPanel panel = new JPanel();
        panel.add(new JLabel(text));
        panel.add(new JSpinner(new SpinnerNumberModel(1, 1, 100, 1)));
        return panel;
    }
}
