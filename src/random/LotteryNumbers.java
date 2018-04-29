package random;

import java.util.Random;

import javax.swing.JOptionPane;

public class LotteryNumbers {
public static void main(String[] args) {

		Random r = new Random();
		JOptionPane.showMessageDialog(null, r.nextInt(5)+ "" +r.nextInt(5)+""+ r.nextInt(5)+"" +r.nextInt(5)+ ""+r.nextInt(5)); 	
System.out.println(r.nextInt(5));
		
}
}