package co.edu.uptc.views.mainViews;

import java.awt.Color;
import java.awt.Dimension;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.JPanel;

import co.edu.uptc.enums.PanelEnum;
import co.edu.uptc.views.components.JToggleButtonCustom;
import co.edu.uptc.views.constants.ColorPalette;

public class PanelMenu extends JPanel {

  private final int WIDTH = 200;
  private final int HEIGHT = 100;
  private final int HEIGHT_BTN = 30;
  private final int TOP_MENU = 10;
  private final int HGAP = 5;
  private final int VGAP = 1;
  private Color colorBackground = ColorPalette.COLOR_BACKGROUND_MAIN_MENU;
  private Color colorForeground = ColorPalette.COLOR_TEXT_MAIN_MENU;
  private Color colorBackgroundSelected = ColorPalette.COLOR_SELECT_MAIN_MENU;

  ButtonGroup group = new ButtonGroup();

  public PanelMenu() {
    setBackground(colorBackground);
    setLayout(new BoxLayout(this, BoxLayout.Y_AXIS));
    createMenu();
  }

  private void createMenu() {
    addSeparator();
    addBtnMain();
    addBtnVehicleManager();
    addBtnAction201920837();
    addBtnAction202320195();
    addBtnAction202310254();
    addBtnAction202320336();
    addBtnAction202311816();
    addBtnAction202320071();
    addBtnAction202320147();
    addBtnAction202310132();
    addBtnAction202021647();
    addBtnAction202310297();
    addBtnAction202312573();
    addBtnAction202320207();
    addBtnAction202128307();
    addBtnAction202310814();
    addBtnAction201923513();
    addBtnAction202010100();
    addBtnAction202321020();
    addBtnAction202212890();
    addBtnAction202214307();
    addBtnAction202310052();
    addBtnAction202322204();
    addBtnAction202320626();

    addBtnExit();
  }

  public void addSeparator() {
    JPanel panelSeparator = new JPanel();
    panelSeparator.setPreferredSize(new Dimension(WIDTH - (HGAP * 2), TOP_MENU));
    panelSeparator.setBackground(colorBackground);
    // add(panelSeparator);
  }

  private void addBtnMain() {
    addButton("Principal").addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        MainFrame.getInstance().activatePanel(PanelEnum.MAIN);
      }

    });
  }

  private void addBtnAction201920837() {
    addButton("201920837").addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        MainFrame.getInstance().activatePanel(PanelEnum.DEFAULT);
      }

    });
  }

  private void addBtnAction202320195() {
    addButton("202320195").addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        MainFrame.getInstance().activatePanel(PanelEnum.DEFAULT);
      }

    });
  }

  private void addBtnAction202310254() {
    addButton("202310254").addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        MainFrame.getInstance().activatePanel(PanelEnum.MODIFY_STYLES);
      }

    });
  }

  private void addBtnAction202320336() {
    addButton("202320336").addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        MainFrame.getInstance().activatePanel(PanelEnum.DEFAULT);
      }

    });
  }

  private void addBtnAction202311816() {
    addButton("202311816").addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        MainFrame.getInstance().activatePanel(PanelEnum.DEFAULT);
      }

    });
  }

  private void addBtnAction202320071() {
    addButton("202320071").addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        MainFrame.getInstance().activatePanel(PanelEnum.STYLES_MANAGER);
      }

    });
  }

  private void addBtnAction202320147() {
    addButton("202320147").addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        MainFrame.getInstance().activatePanel(PanelEnum.DEFAULT);
      }

    });
  }

  private void addBtnAction202310132() {
    addButton("202310132").addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        MainFrame.getInstance().activatePanel(PanelEnum.DEFAULT);
      }

    });
  }

  private void addBtnAction202021647() {
    addButton("202021647").addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        MainFrame.getInstance().activatePanel(PanelEnum.DEFAULT);
      }

    });
  }

  private void addBtnAction202310297() {
    addButton("202310297").addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        MainFrame.getInstance().activatePanel(PanelEnum.DEFAULT);
      }

    });
  }

  private void addBtnAction202312573() {
    addButton("202312573").addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        MainFrame.getInstance().activatePanel(PanelEnum.DEFAULT);
      }

    });
  }

  private void addBtnAction202320207() {
    addButton("202320207").addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        MainFrame.getInstance().activatePanel(PanelEnum.DEFAULT);
      }

    });
  }

  private void addBtnAction202128307() {
    addButton("202320207").addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        MainFrame.getInstance().activatePanel(PanelEnum.DEFAULT);
      }

    });
  }

  private void addBtnAction202310814() {
    addButton("202310814").addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        MainFrame.getInstance().activatePanel(PanelEnum.DEFAULT);
      }

    });
  }

  private void addBtnAction201923513() {
    addButton("201923513").addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        MainFrame.getInstance().activatePanel(PanelEnum.DEFAULT);
      }

    });
  }

  private void addBtnAction202010100() {
    addButton("202010100").addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        MainFrame.getInstance().activatePanel(PanelEnum.DEFAULT);
      }

    });
  }

  private void addBtnAction202321020() {
    addButton("202010100").addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        MainFrame.getInstance().activatePanel(PanelEnum.DEFAULT);
      }

    });
  }

  private void addBtnAction202212890() {
    addButton("202212890").addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        MainFrame.getInstance().activatePanel(PanelEnum.DEFAULT);
      }

    });
  }

  private void addBtnAction202214307() {
    addButton("202214307").addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        MainFrame.getInstance().activatePanel(PanelEnum.DEFAULT);
      }

    });
  }

  private void addBtnAction202310052() {
    addButton("202310052").addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        MainFrame.getInstance().activatePanel(PanelEnum.DEFAULT);
      }

    });
  }

  private void addBtnAction202322204() {
    addButton("202322204").addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        MainFrame.getInstance().activatePanel(PanelEnum.DEFAULT);
      }

    });
  }

  private void addBtnAction202320626() {
    addButton("202320626").addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        MainFrame.getInstance().activatePanel(PanelEnum.DEFAULT);
      }

    });
  }

  private void addBtnVehicleManager() {
    addButton("Administrar Vehiculos").addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        MainFrame.getInstance().activatePanel(PanelEnum.VEHICLE_MANAGER);
      }

    });
  }

  private void addBtnExit() {
    addButton("Salir").addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        System.exit(0);
      }

    });
  }

  private JToggleButtonCustom addButton(String text) {
    Dimension dimension = new Dimension(WIDTH - (HGAP * 2), HEIGHT_BTN);
    JToggleButtonCustom jButton = new JToggleButtonCustom();
    jButton.setText(text);
    jButton.setMaximumSize(dimension);
    jButton.setPreferredSize(dimension);
    jButton.setBackground(colorBackground);
    jButton.setForeground(colorForeground);
    jButton.setBackgroundSelected(colorBackgroundSelected);
    group.add(jButton);
    add(jButton);
    return jButton;
  }

  public void unselectedAll() {
    group.clearSelection();
  }

}
