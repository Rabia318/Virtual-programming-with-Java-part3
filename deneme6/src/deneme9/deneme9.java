package deneme9;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class deneme9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		JFrame jf= new JFrame();
		
		
		jf.setSize(500,500);
		jf.setLocation(200,300);
		
		
		JProgressBar prgrsbr=new JProgressBar(0,2000);
		
		prgrsbr.setBounds(20, 50, 160, 40);
		
		prgrsbr.setValue(0);
		
		prgrsbr.setStringPainted(true);
		
		jf.add(prgrsbr);
		
		jf.setLayout(new FlowLayout()); // eklenmiyice tüm pencereyi progress bar olarak algılıyor.
		jf.setResizable(false);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		int i=0;
		
		while(i<=2000) {
			
			
			prgrsbr.setValue(i);
			
			i=i+20;
			
			try {
				
				Thread.sleep(100);
				
				
			} catch (InterruptedException e) {
				
				e.printStackTrace();
				
				// TODO: handle exception
			}
			

			
		}
		
		
		
		
	}

}
