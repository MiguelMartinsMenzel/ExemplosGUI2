package exemplosgui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;

public class MenusExemplo extends JFrame {
    public MenusExemplo() {
        super("Menus - JMenuBar/JMenu/JMenuItem");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(520, 300);
        setLocationRelativeTo(null);
        JMenuBar barra = new JMenuBar();
        JMenu arquivo = new JMenu("Arquivo");
        arquivo.setMnemonic(KeyEvent.VK_A);
        JMenuItem novo = new JMenuItem("Novo");
        novo.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, Toolkit.getDefaultToolkit().getMenuShortcutKeyMaskEx()));
        JMenuItem sair = new JMenuItem("Sair");
        sair.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, Toolkit.getDefaultToolkit().getMenuShortcutKeyMaskEx()));
        sair.addActionListener(e -> System.exit(0));
    }
}