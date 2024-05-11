import java.lang.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ContributorsFrame extends JFrame
{
	JPanel panelContributors;
	JLabel ContributorsImglabel;
	ImageIcon imgContributors;
	

	public ContributorsFrame()
	{
		super("Contributors");
		this.setSize(500,670);
		this.setLocation(550,100);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

		panelContributors = new JPanel();
		panelContributors.setLayout(null);
		panelContributors.setBackground(new Color(34,57,75));
		panelContributors.setBounds(0,0,500,700);
 
		imgContributors = new ImageIcon("Contributors.png");
		ContributorsImglabel = new JLabel(imgContributors);
		ContributorsImglabel.setBounds(0,-30,500,700);
		panelContributors.add(ContributorsImglabel);

		this.add(panelContributors);

	}
	
}
