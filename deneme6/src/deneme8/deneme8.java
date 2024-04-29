package deneme8;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;

public class deneme8 {
	
	
	// POPUP MENU ÖRNEĞİ
	
	public static void  main (String[] args) {
		
		
		JFrame jf = new JFrame("Popup Menü örneği");
		
		jf.setSize(500,500);
		jf.setLocation(200,300);
		
		
		JPopupMenu ppm=  new JPopupMenu("Menü");
		
		JMenuItem cut= new JMenuItem("Kes");
		JMenuItem copy= new JMenuItem("Kopyala");
		JMenuItem paste=new JMenuItem("Yapıştır");
		
		
		ppm.add(cut);
		ppm.add(copy);
		ppm.add(paste);
		
		
		jf.addMouseListener(new MouseListener() {
			
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
				ppm.show(jf, e.getX(),e.getY());
				
				
				
			}
		});
		
		
		cut.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				JOptionPane.showMessageDialog(jf,"Kes butonuna tıkladınız");
				
			}
		});
		
		
		
		jf.setLayout(new FlowLayout());
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
