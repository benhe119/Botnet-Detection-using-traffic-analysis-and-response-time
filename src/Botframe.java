import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import javax.swing.*;
import javax.swing.GroupLayout.Alignment;

public class Botframe extends javax.swing.JFrame implements ActionListener{
    /** Creates new form Botframe */
    public int flag;
    public Algorithm algo = new Algorithm();
    public JButton startButton = new JButton("Scan");
    public JButton statusButton = new JButton("Status");
    public JTextArea ChatLog = new JTextArea();

    public Botframe() {
        initComponents();
    }
    
    public void initComponents() {
       	setSize(600,600);//Size of JFrame
	setDefaultCloseOperation(EXIT_ON_CLOSE);
	setVisible(true);
	getContentPane().setLayout(null);
	setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        startButton.setBounds(33, 24, 89, 23);
 	getContentPane().add(startButton);
 	startButton.addActionListener(this);
    	statusButton.setBounds(155, 24, 89, 23);
	getContentPane().add(statusButton);
	statusButton.addActionListener(this);
	ChatLog.setBounds(33, 87, 1300, 600);
	getContentPane().add(ChatLog);
        ChatLog.setEditable(false);
        ChatLog.append("\n");
       
    }
 
    /**
    * Starts the GUI components of this bot
    */
    public void ShowComponents() {
   	 java.awt.EventQueue.invokeLater(new Runnable() {
         public void run() {
                new Botframe();
            }
        });
     }
	
    @Override
    public void actionPerformed(ActionEvent e) {
   	if (e.getSource() == statusButton) {
		String line = ChatLog.getText();
		String[] words = {"System", "infected","affected","properties","host","system"};  
	        String s = line;
	        int hop = 0;
	        String[] sentence = s.split("\\s+");
	        for (int i = 0; i < sentence.length; i++) {
	            sentence[i] = sentence[i].replaceAll("[^\\w]", "");
	        }
	        int loopbreak = 0, loopbreak1 = 0; 
		int i = 0;
	   	outerloop:
		   outerloop1:
	        	while (i < sentence.length && loopbreak == 0 && loopbreak1 == 0) {
	        		for (int j = 0; j < words.length; j++) {
	        		 	if (sentence[i].equals(words[j])) {
	        				for (int k = 0; k < algo.elapsed.size(); k++) {
	        					if (algo.elapsed.get(k) < 200) {
	        						hop = 2;
	        						loopbreak = 1;
	        						break outerloop;
							}
						}
       						hop=1;
	        				loopbreak1=1;
	        				break outerloop1;
	        		 	}
	        			else {
	        			hop=3;
				}
			}
	        	i++;
	   }
	    
	   switch(hop) {
	    
		   case 1 : msgbox("There is a probability for your system being attacked by bot");
	    		    break;
	    	   case 2 : msgbox("Your system is under risk. The system is being infected by bot");
	    		    break;
	    	   case 3 : msgbox("Your system is safe");
	    		    break;
	    }
     }
		
}
	private void msgbox(String s) {
        	JOptionPane.showMessageDialog(null, s);
	}
	 
}
