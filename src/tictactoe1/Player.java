/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe1;

import java.util.logging.Logger;

/**
 *
 * @author dell
 */
public class Player {
      int score;
    String symbol;

    public Player(int score, String symbol) {
        this.score = score;
        this.symbol = symbol;
    }
    private static final Logger LOG = Logger.getLogger(Player.class.getName());

    public int getScore() {
        return score;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

    
    
    
    
}
