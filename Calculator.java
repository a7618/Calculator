import java.awt.*;
import java.awt.event.*;

class calculator extends Frame implements ActionListener
{
	MenuBar mb;
	Menu m1;
	Label la;
	TextField t1;
	MenuItem mi1,mi2,mi3,mi4,mi5,mi6,mi7,mi8,mi9,mi10,mi11;
	Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20,b21,b22,b23,b24;
	int a=0,b=0,c=0,d=0,e=0,f=0,g=0,h=0,i=0,j=0,count=0;
	calculator()
	{
		setTitle("Calculator");
		mb=new MenuBar();
		setMenuBar(mb);
		
		m1=new Menu("=");
		
		mb.add(m1);
		
		mi1=new MenuItem("Currency");
		mi2=new MenuItem("Volume");
		mi3=new MenuItem("Length");
		mi4=new MenuItem("Weight and mass");
		mi5=new MenuItem("Temperature");
		mi6=new MenuItem("Energy");
		mi7=new MenuItem("Area");
		mi8=new MenuItem("Speed");
		mi9=new MenuItem("Time");
		mi10=new MenuItem("Power");
		
		m1.add(mi1);
		m1.add(mi2);
		m1.add(mi3);
		m1.add(mi4);
		m1.add(mi5);
		m1.add(mi6);
		m1.add(mi7);
		m1.add(mi8);
		m1.add(mi9);
		m1.add(mi10);
		
		t1=new TextField(30);
		t1.setBounds(20,95,404,50);
		
		b1=new Button("%");
		b1.addActionListener(this);
		b1.setBounds(20,155,95,60);
		
		b2=new Button("CE");
		b2.addActionListener(this);
		b2.setBounds(117,155,95,60);
		
		b3=new Button("C");
		b3.addActionListener(this);
		b3.setBounds(215,155,95,60);
		
		b4=new Button("X");
		b4.addActionListener(this);
		b4.setBounds(313,155,95,60);
		
		b5=new Button("1/x");
		b5.addActionListener(this);
		b5.setBounds(20,217,95,60);
		
		b6=new Button("x2");
		b6.addActionListener(this);
		b6.setBounds(117,217,95,60);
		
		b7=new Button("2x");
		b7.addActionListener(this);
		b7.setBounds(215,217,95,60);
		
		b8=new Button("/");
		b8.addActionListener(this);
		b8.setBounds(313,217,95,60);
		
		b9=new Button("7");
		b9.addActionListener(this);
		b9.setBounds(20,279,95,60);
		
		b10=new Button("8");
		b10.addActionListener(this);
		b10.setBounds(117,279,95,60);
		
		b11=new Button("9");
		b11.addActionListener(this);
		b11.setBounds(215,279,95,60);
		
		b12=new Button("*");
		b12.addActionListener(this);
		b12.setBounds(313,279,95,60);
		
		b13=new Button("4");
		b13.addActionListener(this);
		b13.setBounds(20,342,95,60);
		
		b14=new Button("5");
		b14.addActionListener(this);
		b14.setBounds(117,342,95,60);
		
		b15=new Button("6");
		b15.addActionListener(this);
		b15.setBounds(215,342,95,60);
		
		b16=new Button("-");
		b16.addActionListener(this);
		b16.setBounds(313,342,95,60);
		
		b17=new Button("1");
		b17.addActionListener(this);
		b17.setBounds(20,404,95,60);
		
		b18=new Button("2");
		b18.addActionListener(this);
		b18.setBounds(117,404,95,60);
		
		b19=new Button("3");
		b19.addActionListener(this);
		b19.setBounds(215,404,95,60);
		
		b20=new Button("+");
		b20.addActionListener(this);
		b20.setBounds(313,404,95,60);
		
		b21=new Button("+/-");
		b21.addActionListener(this);
		b21.setBounds(20,466,95,60);
		
		b22=new Button("0");
		b22.addActionListener(this);
		b22.setBounds(117,466,95,60);
		
		b23=new Button(".");
		b23.addActionListener(this);
		b23.setBounds(215,466,95,60);
		
		b24=new Button("=");
		b24.addActionListener(this);
		b24.setBounds(313,466,95,60);
		
		add(t1);
		add(b1);
		add(b2);
		add(b3);
		add(b4);
		add(b5);
		add(b6);
		add(b7);
		add(b8);
		add(b9);
		add(b10);
		add(b11);
		add(b12);
		add(b13);
		add(b14);
		add(b15);
		add(b16);
		add(b17);
		add(b18);
		add(b19);
		add(b20);
		add(b21);
		add(b22);
		add(b23);
		add(b24);
		
		setSize(450,600);
		setLayout(null);
		setVisible(true);
	}
	public void actionPerformed(ActionEvent ae)
	{		
		if(ae.getSource()==b9)
		{
			a=Integer.parseInt(b9.getLabel());
			t1.setText(t1.getText()+String.valueOf(a));
		}
		if(ae.getSource()==b10)
		{
			a=Integer.parseInt(b10.getLabel());
			t1.setText(t1.getText()+String.valueOf(a));
		}
		
		if(ae.getSource()==b11)
		{
			a=Integer.parseInt(b11.getLabel());
			t1.setText(t1.getText()+String.valueOf(a));
		}
		
		if(ae.getSource()==b13)
		{
			a=Integer.parseInt(b13.getLabel());
			t1.setText(t1.getText()+String.valueOf(a));
		}	
		
		if(ae.getSource()==b14)
		{
			a=Integer.parseInt(b14.getLabel());
			t1.setText(t1.getText()+String.valueOf(a));
		}
		
		if(ae.getSource()==b15)
		{
			a=Integer.parseInt(b15.getLabel());
			t1.setText(t1.getText()+String.valueOf(a));
		}
		
		if(ae.getSource()==b17)
		{
			a=Integer.parseInt(b17.getLabel());
			t1.setText(t1.getText()+String.valueOf(a));
		}
		
		if(ae.getSource()==b18)
		{
			a=Integer.parseInt(b18.getLabel());
			t1.setText(t1.getText()+String.valueOf(a));
		}
		
		if(ae.getSource()==b19)
		{
			a=Integer.parseInt(b19.getLabel());
			t1.setText(t1.getText()+String.valueOf(a));
		}	
		if(ae.getSource()==b20)
		{
			b=Integer.parseInt(t1.getText());
			t1.setText(" ");
			count=1;
		}
		if(ae.getSource()==b24)
		{
			if(count==1)
			{
				c=a+b;
				t1.setText(String.valueOf(c));
			}
		}
		if(ae.getSource()==b16)
		{
			b=Integer.parseInt(t1.getText());
			t1.setText(" ");
			count=2;
		}
		if(ae.getSource()==b24)
		{
			if(count==2)
			{
				c=a-b;
				t1.setText(String.valueOf(c));
			}
		}
		if(ae.getSource()==b12)
		{
			b=Integer.parseInt(t1.getText());
			t1.setText(" ");
			count=3;
		}
		if(ae.getSource()==b24)
		{
			if(count==3)
			{
				c=a*b;
				t1.setText(String.valueOf(c));
			}
		}
		
		// percentage
		
		if(ae.getSource()==b1)
		{
			b=Integer.parseInt(t1.getText());
			t1.setText(" ");
			count=4;
		}
		if(ae.getSource()==b24)
		{
			if(count==4)
			{
				c=a%b;
				t1.setText(String.valueOf(c));
			}
		}
		if(ae.getSource()==b8)
		{
			b=Integer.parseInt(t1.getText());
			t1.setText(" ");
			count=5;
		}
		if(ae.getSource()==b24)
		{
			if(count==5)
			{
				c=b/a;
				t1.setText(String.valueOf(c));
			}
		}
		if(ae.getSource()==b6)
		{
			c=a*a;
			t1.setText(String.valueOf(c));
		}
		if(ae.getSource()==b5)
		{
			c=1/a;
			t1.setText(String.valueOf(c));
		}
		if(ae.getSource()==b2)
		{
			{
				c=a*0;
				t1.setText(String.valueOf(c));
			}
		}
		if(ae.getSource()==b3)
		{
			{
				c=a*0;
				t1.setText(String.valueOf(c));
			}
		}
		if(ae.getSource()==mi1)
		{
			currency();
		}
	}	
	void currency()
	{
		System.out.println("YO YO");
	}
	
	public static void main(String [] args)
	{
		new calculator();
	}
}