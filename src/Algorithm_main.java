import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

import org.jibble.pircbot.IrcException;
import org.jibble.pircbot.NickAlreadyInUseException;


public class Algorithm_main {

	public static void main(String[] args) throws NickAlreadyInUseException, IOException, IrcException {
		// TODO Auto-generated method stub
Algorithm algo=new Algorithm();
// Connect to the IRC server.
algo.connect("irc.freenode.net");
// Join the #pircbot1 channel.
algo.joinChannel("#pircbot");
}}