package velocityformulagui;

import javax.swing.JFrame;

public class VelocityFormulaGui {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame("Velocity formula");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new VelocityFormulaGuiPanel());
        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);
		
	}

}
