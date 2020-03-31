/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe1;

/**
 *
 * @author dell
 */
public class Opponent {
    int score;
    String symbol;

    public Opponent(int score, String symbol) {
        this.score = score;
        this.symbol = symbol;
    }

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
