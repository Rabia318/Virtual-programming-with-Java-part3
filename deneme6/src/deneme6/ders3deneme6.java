package deneme6;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;

// We are going to learn how to create table  TABLO  with Java 


public class ders3deneme6 {

	public static void main(String[] args) {

		JFrame jf =new JFrame("Tablo Örneği");
		
		jf.setSize(500,500);
		
		jf.setLocation(200,300);
		
		
		
		
		String [][] data= { {"1","Xate","Midyat"},{"2","Fehime","Urfa"},{"3","Faruk","Midyat"}
				
		};
		
		String Title[]= {"Numara","İsim","Memleket"};
		
		
		JTable tablo=new JTable(data,Title);
		
		JScrollPane sp= new JScrollPane(tablo);
		
		
		jf.add(sp);
		
	    jf.setLayout(new FlowLayout());	
		
		
		
		jf.setVisible(true);
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

	}

}
