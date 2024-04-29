package deneme7;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

// We are going to try that create a menu


public class deneme7 {

	public static void main(String[]  args ) {
		
		
		
		JFrame jf=new JFrame("Menü örneği");
		
		jf.setSize(500,500);
		
		jf.setLocation(200,300);
		
		
		JMenuBar mbar= new JMenuBar();
		
		JMenu main_menu=new JMenu("File");
		JMenu sub_menu=new JMenu("New");
		
		JMenuItem item_open=new JMenuItem("Open File");
		JMenuItem item_recent=new JMenuItem("Recent Fıle");
		JMenuItem item_clsEd=new JMenuItem("Close Editor");
		JMenuItem item_save=new JMenuItem("Save");
		JMenuItem item_new=new JMenuItem("New 2");
		
		
		JMenuItem it_project=new JMenuItem("project");
		JMenuItem İt_package=new JMenuItem("Package");
		
		sub_menu.add(it_project);
		sub_menu.add(İt_package);
		
		
		main_menu.add(item_open);
		main_menu.add(item_recent);
		main_menu.add(item_clsEd);
		main_menu.add(item_save);
		main_menu.add(item_new);
		
		
		
		
		main_menu.add(sub_menu);
		
		mbar.add(main_menu);
		
		
		jf.setJMenuBar(mbar);
		
		
		
		jf.setLayout(new FlowLayout());
		
		jf.setVisible(true);
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
	}
	
}
