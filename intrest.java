import java.awt.*;
import java.applet.*;
import java.awt.event.*;
/*<applet code="intrest.class" height="400" width="350">
</applet>*/
public class intrest extends Applet implements ActionListener
{
	double p,t,am,si;
	double r;
	Label l=new Label("                                 Intrest Calculator                                       ");
	Label la=new Label("                                ------------------                                       ");
	Label lb=new Label("-                               					                                                           -");
	Label lc=new Label("                ");
	Label ld=new Label("                                   ");
	Button b1=new Button("Result");
	Button b2=new Button("Home");
	Button b3=new Button("Car");
	Button b4=new Button("Personal");
	TextField t1=new TextField(10);
	TextField t2=new TextField(10);
	Label l1=new Label("Amount :");
	Label l2=new Label("Time :");
	Label l3=new Label( "                                           Rate");
	Label t3=new Label( "             "); 
	Label l4=new Label( "                                           Intrest");
	Label t4=new Label( "             ");
	Label l5=new Label( "                                           Amount");
	Label t5=new Label( "             ");
	public void init()
	{
		add(l);
		add(la);
		add(lb);
		add(l1); 
		add(t1); 
		add(l2);
		add(t2);
		add(lc);
		add(b2);
		add(b3);
		add(b4);
		add(ld);
		add(b1);
		add(l3);
		add(t3);
		add(l4);
		add(t4);
		add(l5);
		add(t5);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		}
	public void actionPerformed(ActionEvent a)
	{
		if(a.getSource()==b2)
		{
			r=9.50;
					}
	   if(a.getSource()==b3)
		{
			r=7.9;
					}
		if(a.getSource()==b4)
		{
			r=11.20;
								}
		if(a.getSource()==b1)
		{
			float d=100;
			float p=Float.parseFloat(t1.getText());
			float t=Float.parseFloat(t2.getText());
			si=(p*r*t)/d;
			am=p+si;
			t3.setText(""+r);
			t4.setText(""+si);
			t5.setText(""+am);
					}
	}
}
