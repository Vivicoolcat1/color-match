package colorProject;

import javax.swing.JFrame;

public class colorMatch {
	JFrame frame;
	static final int WIDTH= 800;
	static final int HEIGHT= 800;
	GamePanel b;
public static void main(String[] args) {
	colorMatch a = new colorMatch();
	a.setup();
}
public colorMatch(){
	frame = new JFrame();
	b = new GamePanel();
}
void setup(){
	frame.setSize(WIDTH,HEIGHT);
	frame.setVisible(true);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
frame.pack();

	
	
}
}
