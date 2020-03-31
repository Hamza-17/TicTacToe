import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.ImageIcon;

public class XOButton extends JButton implements ActionListener {
	public ImageIcon X,O;
	byte value=0;
        boolean filled=false;
       static boolean b=true;
       int turn=2;
	
	public XOButton(){
		X=new ImageIcon(this.getClass().getResource("X.png"));
		O=new ImageIcon(this.getClass().getResource("O.png"));
		this.addActionListener(this);
	}
        
        
        public void set(ImageIcon X){
        
        setIcon(X);
        filled=true;
        }
        
        
        @Override
	public void actionPerformed(ActionEvent e){
		value++;
                if(turn%2==0){
                turn++;
                	setIcon(X);
                        filled=true;
                }
                
                else{
                  
                            turn++;
                	setIcon(O);
        
                    
                }
                
        }
  
	//	value%=3;
	/*	switch(value%2){
			case 0:
				setIcon(X);
                                
				break;
			case 1:
				setIcon(O);
                             break;
			
			case 2:
				setIcon(null);
				break;
		}

*/
	}

