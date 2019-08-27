import java.text.DecimalFormat;

import javax.swing.text.NumberFormatter;

public class addStringAt {
	
	public static void main (String[] args) {
		
		long it = 100000000;
		
		Timer t = new Timer();
		
		//Meine Methode
		System.out.println("Hier meine Methode:");
		t.start();
		for (int i = 0; i < it; i++) {
			addPoints(i);
		}
		t.stop();
		t.ausgabe();


		//Der NumberFormatter
		System.out.println("\n\nHier der NumberFormatter:");
		t.start();
		DecimalFormat nd = new DecimalFormat();
		for (int i = 0; i < it; i++) {
			nd.format(i);
		}
		t.stop();
		t.ausgabe();
	}
	
	
	
	
	
	//Einfach nur folgende beiden Methoden nehmen und kopieren
	
	public static String addPoints (long a) {
		String temp = String.valueOf(a);
		if (a >= 1000) {
			int nullen = (int)((String.valueOf(a).length()-1) / 3);
			for (int i = 0; i < nullen; i++) {
				temp = insertString(temp, ".", (temp.length() - ((i + 1) * 3) - i));
			}
		}
		return temp;
	}
	public static String insertString (String zuBearb, String insert, int index) {	//Fügt einen String vor einer bestimmten Stelle des anderen Strings ein. 
		String teil1 = zuBearb.substring(index);
		String teil2 = zuBearb.substring(0, index);
		//		System.out.println(teil1 + " - " + teil2);
		return (teil2 + insert + teil1);
	}
	
}
