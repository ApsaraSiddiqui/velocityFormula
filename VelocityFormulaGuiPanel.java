package velocityformulagui;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class VelocityFormulaGuiPanel extends JPanel {

	private JLabel uLabel, aLabel, tLabel;
    private JTextField uText, aText, tText;
    private JButton calculate;
    private int uValue, aValue, tValue,multiat,squaret,multiut;
    double divideat,sum;
    public VelocityFormulaGuiPanel()
    {    
        uLabel = new JLabel("U value:");
        uLabel.setForeground(Color.WHITE);
        aLabel = new JLabel("A value:");
        aLabel.setForeground(Color.WHITE);
        tLabel = new JLabel("T value:");
        tLabel.setForeground(Color.WHITE);
        
        uText = new JTextField(2);
        aText = new JTextField(2);
        tText = new JTextField(2);
        
        calculate = new JButton("Show the steps");
        calculate.addActionListener(new ButtonListner());
        
        add(uLabel);
        add(uText);
        add(aLabel);
        add(aText);
        add(tLabel);     
        add(tText);
        
        add(calculate);

        setBackground(Color.BLACK);
        setPreferredSize(new Dimension(250, 450));
}
    




public class ButtonListner implements ActionListener {

	public void actionPerformed (ActionEvent e)
    {            
        uValue = Integer.parseInt(uText.getText());
        aValue = Integer.parseInt(aText.getText());
        tValue = Integer.parseInt(tText.getText());
        
        squaret=tValue*tValue;
        multiat= aValue*squaret;
        divideat=multiat/2;
        multiut=uValue*tValue;
        sum=multiut+divideat;
    }
}


@Override
public void paintComponent(Graphics g)
{
    super.paintComponent(g);
    
    g.setFont(new Font("Serif", Font.PLAIN, 18));
    
    g.setColor(Color.WHITE);
  
  
    g.drawString("     2", 175,84);
    g.drawString("(u)(t)   + (1/2) (a) (t)", 57, 100);
    g.drawString("( 1 )", 220, 100);
    
    g.drawString("     2", 175, 174);
    g.drawString("(" + uValue + ")"+"(" + tValue + ")   + 1/2 (" + aValue + ")" + " (" + tValue + ")", 57, 190);
    g.drawString("( 2 )", 220, 190);
    
    
     
    g.drawString("" + multiut + " + 1/2 (" + aValue+")" +"("+ squaret +")", 57, 250);
    g.drawString("( 3 )", 220, 250);
    
    
    g.drawString("" + multiut + "+ 1/2 ("  + (multiat) +")" , 57, 300);
    g.drawString("( 4 )", 220, 300);
    
    g.drawString("" + multiut +"+" +divideat , 57, 350);
    g.drawString("( 5 )", 220, 350);
    
    g.drawString("" +sum  , 57, 380);
    g.drawString("( 6 )", 220, 380);
    
    
    g.drawString("Equation Solved . . . ", 10, 430);

    repaint();
}

	

}