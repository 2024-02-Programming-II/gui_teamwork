package co.edu.uptc.views.components;

import javax.swing.Icon;

public class ComboItem {
       private String text;
    private Icon icon;

    public ComboItem(String text, Icon icon) {
        this.text = text;
        this.icon = icon;
    }

    public String getText() {
        return text;
    }

    public Icon getIcon() {
        return icon;
    }

    @Override
    public String toString() {
        return text;  // Esto es importante para mostrar el texto en el JComboBox
    }
}


