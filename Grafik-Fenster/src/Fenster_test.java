import java.awt.*;
import java.awt.event.*;




public class Fenster_test extends Frame {
	String sometext = "Hallo?";
	int tries = 0;
	public Fenster_test() {
		super("Einen wunderschönen Morgen Herr Bischof");
		this.setSize(500, 300);
		this.setLocation(1000, 0);

		this.addWindowListener(new WindowAdapter() {

			public void windowClosing(WindowEvent we) {
				tries ++;
				if (sometext.equals("Hallo?")) {
					sometext = "Wollen Sie etwa das Window schließen ?";
				} else {
					if (sometext.equals("Wollen Sie etwa das Window schließen ?")) {
						sometext = "Versuchen Sie es noch einmal (•̀ᴗ•́)و ̑̑ ";
					} else {
						if (sometext.equals("Versuchen Sie es noch einmal (•̀ᴗ•́)و ̑̑ ") && tries == 6) {
							System.exit(0);
						}
					}

				}

				Fenster_test.this.repaint();
				//this is so nice
			}




		});

		this.setVisible(true);


	}

	public void paint(Graphics g) {
		g.drawString(sometext, 200, 100);
	}



}

