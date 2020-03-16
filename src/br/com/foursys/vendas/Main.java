package br.com.foursys.vendas;

import br.com.foursys.vendas.view.EstoquePrincipal;
import javax.swing.UIManager;

/**
 *
 * @author pbido
 */
public class Main {

    public static void main(String[] args) {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
        } catch (Exception ignored) {
        }
//        new LoginPrincipal();
        new EstoquePrincipal();
    }
}
