/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe1;

import java.awt.Button;
import javax.swing.JPanel;

/**
 *
 * @author dell
 */
public class GameBoard {
    
     JPanel[][] p;
     Button button[][][][];

    public GameBoard(JPanel[][] p, Button[][][][] button) {
        this.p = p;
        this.button = button;
    }

    public JPanel[][] getP() {
        return p;
    }

    public Button[][][][] getButton() {
        return button;
    }

    public void setP(JPanel[][] p) {
        this.p = p;
    }

    public void setButton(Button[][][][] button) {
        this.button = button;
    }
     


    
}
