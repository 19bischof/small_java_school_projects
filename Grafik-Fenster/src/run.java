
import java.awt.event.*;

public class run {
	public static void main(String[] args) {
		Fenster_test fenster = new Fenster_test();
//    	fenster.repaint();
		fenster.addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent we){
				fenster.repaint();
			}
		});

	}
}
