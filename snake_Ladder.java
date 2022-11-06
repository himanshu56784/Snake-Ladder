import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
class Demo extends JFrame
{
	FDemo fa;
	Demo()
	{
		fa=new FDemo();
		add(fa);
		setTitle("SNAKE AND LADDER");
	}
}
class FDemo extends JPanel implements ActionListener
{
	String s1,s2;
	JButton b1,b2,b3,b4;
	int px1=50,px2=620;
	int px3=125,px4=620;
	int i=1;
	
		int count=0;
		int count2=0;
		
	
	ImageIcon img1,img2,img3,img4,img5,img6,img7,img8,img9,img10;;
	ImageIcon gif1,gif2;
	Image boad,name,about,rest,start,start1,player1,player2,dice,dice1,player3,player4;
	
	JTextField tx1,tx2,tx3;
	JLabel l1,l2;
	FDemo()
	{
		setBackground(Color.black);
		//-------------IMAGE--------------
		
		
        img1=new ImageIcon("board.jpg");
		boad=img1.getImage();
		
		img2=new ImageIcon("s1.png");
		name=img2.getImage();
		
		img3=new ImageIcon("about.gif");
		about=img3.getImage();
		
		img4=new ImageIcon("reset.jpg");
		rest=img4.getImage();

		img5=new ImageIcon("start.jpg");
		start=img5.getImage();

		img6=new ImageIcon("start.gif");
		start1=img6.getImage();
		
		img7=new ImageIcon("player1.png");
		player1=img7.getImage();

		player3=img7.getImage();
		
		
		img8=new ImageIcon("player2.png");
		player2=img8.getImage();
		player4=img8.getImage();
		
		
		img9=new ImageIcon("dice.gif");
		dice=img9.getImage();
		
		img10=new ImageIcon("dice1.png");
		dice1=img10.getImage();
		
		
		//--------------BUTTON--------------
		
		setLayout(null);
		b1=new JButton(img3);
		b1.setBounds(50,40,100,30);
		add(b1);
		b1.setBackground(new Color(21,72,247));
		
		b2=new JButton(img4);
		b2.setBounds(50,110,100,30);
		add(b2);
		b2.setBackground(new Color(21,72,247));
		b2.addActionListener(this);
		
		b3=new JButton("ROLL");
		b3.setBounds(70,490,80,30);
		add(b3);
		b3.setBackground(Color.red);
		b3.addActionListener(this);
		
		b4=new JButton(img6);
		b4.setBounds(34,561,140,50);
		add(b4);
		b4.addActionListener(this);
		
		//----------------------TEXTFIELD---------------------
		
		Font fo=new Font("",Font.ITALIC,20);
		
		tx1=new JTextField("Enter playes Name");
		tx1.setBounds(30,160,180,35);
		tx1.setBackground(Color.black);
		tx1.setForeground(Color.green);
		tx1.setFont(fo);
		add(tx1);
		
		tx2=new JTextField("");
		tx2.setBounds(50,250,150,35);
		tx2.setBackground(Color.black);
		tx2.setForeground(Color.green);
		tx2.setFont(fo);
		add(tx2);
		
		tx3=new JTextField("");
		tx3.setBounds(50,330,150,35);
		tx3.setBackground(Color.black);
		tx3.setForeground(Color.green);
		tx3.setFont(fo);
		add(tx3);
		
		l1=new JLabel("Player 2 name");
		l1.setBounds(50,300,150,35);
		l1.setForeground(Color.black);
		l1.setFont(fo);
		add(l1);
		
		l2=new JLabel("Player 1 name");
		l2.setBounds(50,220,150,35);
		l2.setForeground(Color.black);
		l2.setFont(fo);
		add(l2);
		
		
	}
	public void paintComponent(Graphics g)
	{
	super.paintComponent(g );
	g.setColor(new Color(21,72,247));
	g.fillRect(0,0,210,730);
	
	g.drawImage(boad,210,0,this);
	g.drawImage(name,919,0,this);
	g.drawImage(start,20,550,this);
	g.drawImage(player1,px1,px2,this);
	g.drawImage(player2,px3,px4,this);
	g.drawImage(player3,20,310,this);
	g.drawImage(player4,20,240,this);
	
	g.drawImage(dice,30,400,this);
	g.drawImage(dice1,120,408,this);
	}
	
	public void actionPerformed(ActionEvent e)
	{
	
		if(e.getSource()==b3)
		{			
			int random=(int)Math.round(Math.random()*5+1);
	        i++;
			int k=1;
	        int count1=0;
		if(count<100||count2<100)
		{
		//---------------PLAYER 1--------------------
		if(i%2==0)
		{
		tx1.setText(s1+" chance");
		if(count+random<=100)
		{
		count=count+random;
		px1=140;
		px2=620;
		if(count==4)count=25;
		if(count==13)count=46;
		if(count==33)count=49;
		if(count==50)count=69;
		if(count==42)count=63;
		if(count==62)count=81;
		if(count==74)count=92;
		if(count==27)count=5;
		if(count==40)count=3;
		if(count==43)count=18;
		if(count==54)count=31;
		if(count==66)count=45;
		if(count==76)count=58;
		if(count==99)count=41;
		if(count==89)count=53;
		M:
		for(int i=1;i<=10;i++)
		{	
			if(i%2==0)
			{
				px1-=70;
			}
			else
			{
				px1+=70;
			}
			
			for(int j=1;j<=10;j++)
			{
				count1++;
				
				if(count==count1)break M;
				if(i%2==1)
				{
					px1+=70;
					k++;
				}
				else
				{
					px1-=70;
					k++;
				}
				
			repaint();
			}
			
			px2-=70;
			
		}
		 }
	 }
	 //----------------------PLAYER 2--------------------
	else
	 {
		 
		if(count2+random<=100)
		{
		tx1.setText(s2+" chance");
		count2=count2+random;
		   px3=150;
	       px4=620;
		   
		   //--------------LADDER CONDITION----------------
		   if(count2==4)
		{
			count2=25;
		
			
		}
		if(count2==13)
		{
			count2=46;
		
		}
		if(count2==33)
		count2=49;
		
		if(count2==50)
			count2=69;
		
		if(count2==42)
			count2=63;
		
		if(count2==62)
		
			count2=81;
		
		if(count2==74)
		
			count2=92;
		
		//-----------SNAKE CONDECTION------------
		if(count2==27)
		
			count2=5;
		
		if(count2==40)
		
			count2=3;
		
		if(count2==43)
		
			count2=18;
		
		if(count2==54)
			count2=31;
	
		if(count2==66)
			count2=45;

		if(count2==76)
			count2=58;
		
		if(count2==99)
			count2=41;
		
		if(count2==89)
		count2=53;
		
		M:
		for(int i=1;i<=10;i++)
		{	
			if(i%2==0)
			{
				px3-=70;
			}
			else
			{
				px3+=70;
			}
			
			for(int j=1;j<=10;j++)
			{
				count1++;
				if(count2==count1)break M;
				if(i%2==1)
				{
					px3+=70;
					k++;
				}
				else
				{
					px3-=70;
					k++;
				}
			}
			
			px4-=70;
		}
	 }
	 }	
		
			//-------------RANDOM DIES-----------------
			switch(random)
			{
				case 1:
				img10=new ImageIcon("dice1.png");
				break;
				case 2:
				img10=new ImageIcon("dice2.png");
				break;
				case 3:
				img10=new ImageIcon("dice3.png");
				break;
				case 4:
				img10=new ImageIcon("dice4.png");
				break;
				case 5:
				img10=new ImageIcon("dice5.png");
				break;
				case 6:
				img10=new ImageIcon("dice6.png");
				break;
			}
			dice1=img10.getImage();
			repaint();
		}
			if(count==100)
			{
				tx1.setText(s1+"  win");
				b3.removeActionListener(this);
			}
			if(count2==100)
			{
				tx1.setText(s2+"  win");
				b3.removeActionListener(this);
			}
		}	
		//-------------RESET BUTTON----------------
		if(e.getSource()==b2)
		{
			count=0;
			count2=0;
			px1=50;
			px2=620;
			px3=125;
			px4=620;
			tx2.setText("");
			tx3.setText("");
			tx1.setText("Start Game");
		}
		
		//----------------START BUTTON--------------
		if(e.getSource()==b4)
		{
			s1=tx2.getText();
			s2=tx3.getText();
			tx1.setText("Let's Play");
			
		}
	}
	
}
class snake_Ladder
{
	
	public static void main(String ar[])
	{
		Demo f=new Demo();
		f.setVisible(true);
		f.setBounds(200,0,990,735);
		f.setResizable(false);
		f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
	}
}