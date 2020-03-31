
import java.awt.Button;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import tictactoe1.Opponent;
import java.io.File;  // Import the File class
import java.io.FileWriter;
import java.io.IOException;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author dell
 */
public class TicTacToe1 extends javax.swing.JFrame    {

   


    JPanel[][] p;
   ImageIcon O,X;
	Button buttons[][][][];
	int turn=0;
    int value=0;
       String human="X";
          String opponent="O";
          int opponentscore=0;
          int humanscore=0;
       
    /**
     * Creates new form TicTacToe1
     */
    public TicTacToe1() {
        
          String input=JOptionPane.showInputDialog("Enter O or X to select your player //By default X is human ");
        
        if(input.compareToIgnoreCase("X")==0){
        human="X";
        opponent="O";
        }
        
        else if(input.compareToIgnoreCase("O")==0){
        
       human="O";
        opponent="X";
        
        
        }
        
      
        
        
        
        
        initComponents();
       O =new ImageIcon(this.getClass().getResource("O.png"));
       X =new ImageIcon(this.getClass().getResource("X.png"));
     p=new JPanel[3][3];
	 buttons=new Button[3][3][][];
         for(int i=0;i<81;i++){
     
         //XObuttons[i]=new XOButton();
         }
    setSize(700,700);
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
           for(int i = 0; i < 3; i++){
            for(int j = 0; j<3; j++){

                p[i][j] = new JPanel(new GridLayout(3,3, 5, 5));
                int height = 650/3;
                int width = 650/3;
                p[i][j].setBounds(j * width, i * height , width, height);
                p[i][j].setBackground(Color.darkGray);
                p[i][j].setBorder(BorderFactory.createMatteBorder( 5, 5, 5, 5, Color.blue));
                
                /*
                	for(int a=0;a<9;a++){
			buttons[a]=new XOButton();
			p[i][j].add(buttons[a]);
                */
		
	
                buttons[i][j] = new Button[3][3];
                for(int k = 0; k<3; k++){
                    for(int l = 0; l <3; l++){
                        buttons[i][j][k][l] = new Button();                
                        int h1 = p[i][j].getHeight()/3;
                        int w1 = p[i][j].getWidth()/3;
              
                        buttons[i][j][k][l].setPreferredSize(new Dimension(w1-5, h1-5));
                        //p[i][j].add(buttons[i][j][k][l]);
                    
     class MouseHandler implements MouseListener{

                            int r;
                            int c;
                            int pR;
                            int pC;
                           
                            public MouseHandler(int parentRow , int parentCol, int row, int col){
                                
                                r = row;
                                c = col;
                                pR = parentRow;
                                pC = parentCol;
                                
                            }
                            
                            
                            
                            
                            @Override
                            public void mouseReleased(MouseEvent me) {
                                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                            }

                            @Override
                            public void mouseEntered(MouseEvent me) {
                                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                            }

                            @Override
                            public void mouseExited(MouseEvent me) {
                                //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                            }

                       
                            @Override
                            public void mouseClicked(MouseEvent me) {
                             //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                        
                            }

                            @Override
                            public void mousePressed(MouseEvent me) {
                                
        
                                Button pressed = buttons[pR][pC][r][c];
                                
                                pressed.setLabel(human);
                                pressed.setFont(new Font("Arial", Font.BOLD, 40));

                                
                                //b.set(X);
                                
                                pressed.setEnabled(false);
                                
                               
                                
                                GameWon();
                                for(int i  = 0; i<3; i++){
                                    for(int j = 0; j<3; j++){
                                               
                                        int count=0;
                                        if((i== r && j == c)){
                                            
                                            for(int x=0;x<3;x++){
                                            for(int y=0;y<3;y++){
                                            if(buttons[i][j][x][y].getLabel().isEmpty()==false){
                                            
                                            count++;
                                                System.out.println(count);
                                                            
                                                    
                                            }
                                            
                                            }
                                            
                                            }
                                            
                                            if(count==9){
                                            for(int n=0;n<3;n++){
                                            for(int m=0;m<3;m++){
                                            if(n!=i && m!=j){
                                            EnablingBoard(n, m);
                                            
                                            }
                                            
                                            }
                                            }
                                            
                                            
                                            }
                                            
                                            
                                            
                                            else{
                                            
                                            EnablingBoard(i, j);
                                            
                                            }
                                           
                                                    int row1=0,col1=0;
                                           boolean check=false; 
                                           for(int q=0;q<3;q++){
                                               if(check==true){
                                               break;
                                               }
                                               
                                               
                                           for(int w=0;w<3;w++){
                                           if(buttons[i][j][q][w].getLabel().isEmpty()==true){
                                           buttons[i][j][q][w].setLabel(opponent);
                                           buttons[i][j][q][w].setFont(new Font("Arial", Font.BOLD, 40));
                                           check=true;
                                           row1=q;
                                           col1=w;
                                           break;
                                           
                                           }
                                           
                                           }
                                           
                                           }
                                            
                                          GameWon();
                                           
                                           for(int i1  = 0; i1<3; i1++){
                                    for(int j1 = 0; j1<3; j1++){
                                    
                                        
                                        if((i1== row1 && j1 == col1)){
                                            int count1=0;
                                             for(int x=0;x<3;x++){
                                            for(int y=0;y<3;y++){
                                            if(buttons[i1][j1][x][y].getLabel().isEmpty()==false){
                                            
                                            count1++;
                                                System.out.println(count1);
                                            }
                                            
                                            }
                                            
                                            }
                                            
                                            if(count1==9){
                                            for(int n=0;n<3;n++){
                                            for(int m=0;m<3;m++){
                                            if(n!=i1 && m!=j1){
                                            EnablingBoard(n, m);
                                            
                                            }
                                            
                                            }
                                            }
                                           
                                            }
                                            
                                            
                                            else{
                                            EnablingBoard(i1, j1);
                                            
                                            }
                                            
                                            
                                        }
                                        else{
                                            DisablingBoard(i1, j1);
                                        
                                        }
                                    
                                    }
                                }
                                 
                                            
                                             
                                            
                                        }
                                        else{
                                            DisablingBoard(i, j);
                                        }
                                    
                                    }
                                }
                                
                            }
                            
                            
                            public void DisablingBoard(int a,int b){
                            
                            p[a][b].setBorder(BorderFactory.createMatteBorder( 5, 5, 5, 5, Color.MAGENTA));
                                            p[a][b].setEnabled(false);
                                            for(java.awt.Component c: p[a][b].getComponents()){
                                                c.setEnabled(false);
                                                c.setFocusable(false);
                                            }
                            
                            
                            }
                            
                            
                            public void EnablingBoard(int a,int b){
                            
                            p[a][b].setBorder(BorderFactory.createMatteBorder( 5, 5, 5, 5, Color.GREEN));
                                            p[a][b].setEnabled(true);
                                            for(int k = 0; k<3; k++){
                                                for(int l = 0; l<3; l++){
                                                    buttons[a][b][k][l].setFocusable(false);
                                                    if(buttons[a][b][k][l].getLabel().isEmpty()){
                                                        buttons[a][b][k][l].setEnabled(true);
                                                        
                                                        
                                                    }
                                                }
                                            }
                            
                            
                            
                            
                            }
                                                      
                            
                           
                        }
                        buttons[i][j][k][l].setFocusable(false);
                        buttons[i][j][k][l].addMouseListener(new MouseHandler(i, j, k, l));
                        p[i][j].add(buttons[i][j][k][l]);
                        
                        
                        
                        
                        
                    }
                }
                
                add(p[i][j]);
            }
           }}
   // void opponentmove(){
    
    //for(int i=0;i<9;i++){
   // if(buttons[i].)
    //if(buttons[i].isEnabled()){
   
    //}
    
    
    //}
    //}
    
    
    //}
    
    
void SaveGame(){

  try {
      File myObj = new File("Scores.txt");
      if (myObj.createNewFile()) {
        System.out.println("File created: " + myObj.getName());
      } else {
        System.out.println("File already exists.");
      }
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  
  
   try {
      FileWriter myWriter = new FileWriter("Scores.txt");
      myWriter.write("Human Score: "+ humanscore);
      myWriter.write("Opponent Score: "+ opponentscore);
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
  
  
  
  
  
  
  
  
  
  



int oneBoardWon(int a,int b){

String q1 = buttons[a][b][0][0].getLabel();
String q2 = buttons[a][b][0][1].getLabel();
String q3 = buttons[a][b][0][2].getLabel();
String q4 = buttons[a][b][1][0].getLabel();
String q5 = buttons[a][b][1][1].getLabel();
String q6 = buttons[a][b][1][2].getLabel();
String q7 = buttons[a][b][2][0].getLabel();
String q8 = buttons[a][b][2][1].getLabel();
String q9 = buttons[a][b][2][2].getLabel();


if(q1==human && q2==human && q3==human){

return 1;

}

if(q1==human && q4==human && q7==human){

return 1;
}

if(q1==human && q5==human && q9==human){

return 1;
}



if(q1==opponent && q2==opponent && q3==opponent){

return -1;
}

if(q1==opponent && q4==opponent && q7==opponent){

return -1;
}

if(q1==opponent && q5==opponent && q9==opponent){

return -1;
}


return 0;

}    
    


void GameWon(){
int score=0;

for(int i=0;i<3;i++){

for(int j=0;j<3;j++){

score+= oneBoardWon(i, j);

}


if(score==3){

    System.out.println("Human won");
}

else if(score==-3){

System.out.println("computer won");
}

else{

    System.out.println("Drawn");
}


}



}




// void opponentmove(){
    
    //for(int i=0;i<9;i++){
   // if(buttons[i].)
    //if(buttons[i].isEnabled()){
   
    //}
    
    
    //}
    //}
    
    
    //}
    
    
    
    
    
    
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TicTacToe1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TicTacToe1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TicTacToe1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TicTacToe1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
             TicTacToe1 a=   new TicTacToe1();
             a.setVisible(true);
             
            
              //a.opponentmove();
             
            }
        });
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}















