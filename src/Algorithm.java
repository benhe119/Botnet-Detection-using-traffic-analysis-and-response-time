import org.jibble.pircbot.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
public class Algorithm extends PircBot {
    static String mess,s;
    int flag1=0,flag;
    long startTime,end;
    int error;
    public ArrayList<Long> elapsed=new ArrayList<Long>();
    ArrayList<String> sent = new ArrayList<String>();
    ArrayList<Long> timeframe = new ArrayList<Long>();
    static Botframe currentGUI = new Botframe();
    public Algorithm() {
    
    }
    @Override
    public void onMessage (String channel, String sender, String login, String hostname, String message)throws ArrayIndexOutOfBoundsException {
    	timeframe.add(System.currentTimeMillis());
    	sent.add(sender);
    	int pos=sent.lastIndexOf(sender);
    	if(sent.get(pos-1).equals(sent.get(pos)))
    	{flag=1;}
    	else
    	{
    		long elapsedTime=timeframe.get(timeframe.size()-1)-timeframe.get(timeframe.size()-2);
    		if(elapsedTime<10)
    			elapsedTime=timeframe.get(timeframe.size()-1)-timeframe.get(timeframe.size()-3);
    		System.out.println(sender+"Total elapsed/response time in milliseconds: " + elapsedTime);
  			elapsed.add(elapsedTime);
  			flag=0;
    	}    	              
    	log(message);                }
    public void log(String line) {
    	String s1="PRIVMSG";    
    	mess=line;
    	if(line.contains(s1)){
    	  	     
        currentGUI.ChatLog.append(line + "\n");
        currentGUI.ChatLog.setCaretPosition(currentGUI.ChatLog.getText().length());
       
          
        }
    	}
    
}
