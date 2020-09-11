import java.awt.*;
import java.awt.event.*;

import java.applet.Applet;


public class Fenster_test extends Frame {
	String sometext = "Hallo?";
	int tries = 0;
	public Fenster_test() {
		super("Einen wunderschönen Morgen Herr Bischof");
		this.setSize(1000, 1000);
		this.setLocation(1000, 0);

		this.addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent we) {
				tries ++;
//				System.exit(0);
				if (sometext == "Hallo?") {
					sometext = "Wollen Sie etwa das Window schließen ?";
				} else {
					if (sometext == "Wollen Sie etwa das Window schließen ?") {
						sometext = "Versuchen Sie es noch einmal (•̀ᴗ•́)و ̑̑ ";
					} else {
						if (sometext == "Versuchen Sie es noch einmal (•̀ᴗ•́)و ̑̑ " && tries == 6) {
							System.exit(0);
						}
					}

				}
			}

//			this.repaint();
			
		});

		this.setVisible(true);
//		

	}

	public void paint(Graphics g) {
		g.drawString(sometext, 200, 100);
	}
}
