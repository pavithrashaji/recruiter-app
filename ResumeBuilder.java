import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.text.*;
import java.util.*;
import java.sql.*;
import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.ImageIcon;
import java.io.*;
import javax.imageio.*;
import java.awt.image.BufferedImage;
import javax.swing.event.*;


class RBLogin										//LOG IN SIGN UP PAGE
{
	JLabel jl, jlab1, username1, pswrd1, cpswrd1, username2, pswrd2, cpswrd2;
	JFrame f;
	JPanel card;
	JTextField ufield1, pfield1, ufield2, pfield2, cpfield2;

	RBLogin()
	{
		f = new JFrame("RESUME BUILDER LOG IN");
		f.setLayout(new FlowLayout());
		f.setSize(1300,700);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		card = new JPanel();
		card.setLayout(new CardLayout());					//CARD LAYOUT

		JPanel jpan1 = new JPanel();
		jpan1.setPreferredSize(new Dimension(1300,100));
		jpan1.setBackground(Color.BLACK);
		jpan1.setLayout(new GridLayout(1,1));
		jlab1 = new JLabel("Resume Builder Project",SwingConstants.CENTER);
		jlab1.setForeground(Color.WHITE);
		jlab1.setFont(new Font("Montserrat", Font.BOLD, 44));   
		jpan1.add(jlab1,BorderLayout.CENTER);
		f.add(jpan1,BorderLayout.NORTH);

		JButton l = new JButton("LOG IN");
		JButton s = new JButton("SIGN UP");
		JButton sbmt1 = new JButton("SUBMIT");
		JButton sbmt2 = new JButton("SUBMIT");

		sbmt1.setPreferredSize(new Dimension(150,50));
		sbmt1.setFont(new Font("Montserrat", Font.BOLD, 15));
		sbmt1.setBackground(Color.BLACK);
		sbmt1.setForeground(Color.WHITE);
		sbmt1.setFocusPainted(false);

		sbmt2.setPreferredSize(new Dimension(150,50));
		sbmt2.setFont(new Font("Montserrat", Font.BOLD, 15));
		sbmt2.setBackground(Color.BLACK);
		sbmt2.setForeground(Color.WHITE);
		sbmt2.setFocusPainted(false);

		JPanel mainp1 = new JPanel();
		mainp1.setLayout(new BoxLayout(mainp1, BoxLayout.Y_AXIS));

		JPanel mainp2 = new JPanel();
		mainp2.setLayout(new BoxLayout(mainp2, BoxLayout.Y_AXIS));

		JPanel jpan2 = new JPanel();
		jpan2.setPreferredSize(new Dimension(1300,100));
		f.add(jpan2);

		JPanel jpan3 = new JPanel();
		jpan3.setPreferredSize(new Dimension(1300,20));

		JPanel jpan4 = new JPanel();
		jpan4.setPreferredSize(new Dimension(1300,20));

		JPanel jpan5 = new JPanel();
		jpan5.setPreferredSize(new Dimension(1300,20));

		JPanel jpan6 = new JPanel();
		jpan6.setPreferredSize(new Dimension(1300,20));

		JPanel jpan7 = new JPanel();
		jpan7.setPreferredSize(new Dimension(1300,20));

		JPanel jpan8 = new JPanel();
		jpan8.setPreferredSize(new Dimension(1300,30));

		mainp1.setPreferredSize(new Dimension(1300,50));
		username1= new JLabel("Enter Username : ",SwingConstants.LEFT);
		username1.setFont(new Font("Montserrat",Font.PLAIN, 20));
		pswrd1= new JLabel("Enter Password  : ",SwingConstants.LEFT);
		pswrd1.setFont(new Font("Montserrat",Font.PLAIN, 20));

		ufield1 = new JTextField(20);
		pfield1 = new JPasswordField(20);			//PASSWORD

		jpan3.add(username1);
		jpan3.add(ufield1);
		jpan4.add(pswrd1);
		jpan4.add(pfield1);

		mainp1.add(jpan3);
		mainp1.add(jpan4);

		JPanel btn1=new JPanel();
		btn1.setPreferredSize(new Dimension(150,50));
		btn1.add(sbmt1,BorderLayout.CENTER);
		mainp1.add(btn1, BorderLayout.CENTER);

		mainp2.setPreferredSize(new Dimension(1300,160));
		username2= new JLabel("Enter Username : ",SwingConstants.LEFT);
		username2.setFont(new Font("Montserrat",Font.PLAIN, 20));
		pswrd2= new JLabel("Enter Password  : ",SwingConstants.LEFT);
		pswrd2.setFont(new Font("Montserrat",Font.PLAIN, 20));
		cpswrd2= new JLabel("Confirm Password  : ",SwingConstants.LEFT);
		cpswrd2.setFont(new Font("Montserrat",Font.PLAIN, 20));

		ufield2 = new JTextField(20);
		pfield2 = new JPasswordField(20);			//PASSWORD
		cpfield2 = new JPasswordField(20);

		jpan5.add(username2);
		jpan5.add(ufield2);
		jpan6.add(pswrd2);
		jpan6.add(pfield2);
		jpan7.add(cpswrd2);
		jpan7.add(cpfield2);

		mainp2.add(jpan5);
		mainp2.add(jpan6);
		mainp2.add(jpan7);

		JPanel btn2=new JPanel();
		btn2.setPreferredSize(new Dimension(150,50));
		btn2.add(sbmt2,BorderLayout.CENTER);
		mainp2.add(btn2, BorderLayout.CENTER);

		JPanel p= new JPanel();
		GridBagLayout gbl=new GridBagLayout();
		p.setLayout(new GridLayout(1,3));
		GridBagConstraints gbc = new GridBagConstraints();
		p.setPreferredSize(new Dimension(600,100));

		l.setPreferredSize(new Dimension(200,100));
		l.setFont(new Font("Montserrat", Font.BOLD, 30));
		l.setBackground(Color.BLACK);
		l.setForeground(Color.WHITE);
		l.setFocusPainted(false);

		s.setPreferredSize(new Dimension(200,100));
		s.setFont(new Font("Montserrat", Font.BOLD, 30));
		s.setBackground(Color.BLACK);
		s.setForeground(Color.WHITE);
		s.setFocusPainted(false);

		gbc.gridx = 0;
		gbc.gridy = 0;
		p.add(s,gbc);

		gbc.gridx = 1;
		gbc.gridy = 0;
		p.add(l,gbc);
		
		jl = new JLabel("");
		f.add(p,BorderLayout.CENTER);
		f.setVisible(true);

		card.add(mainp2, "SIGN UP");			//ADDING THE PANELS TO CARD LAYOUT
		card.add(mainp1, "LOG IN");


		//LOG IN BUTTON
		l.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				f.add(jpan8);
				((CardLayout) card.getLayout()).show(card, "LOG IN");
			}
		});


		//SIGN UP BUTTON
		s.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				f.add(jpan8);		
				((CardLayout) card.getLayout()).show(card, "SIGN UP");
			}
		});

		f.add(card);


		//SUBMIT BUTTON FOR LOG IN PAGE
		sbmt1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				String u1 = ufield1.getText();
				String p1 = pfield1.getText();
				String query1="SELECT username,password,name FROM resume where username='"+u1+"'";
				try										//JDBC CONNECTION
				{
					Class.forName("com.mysql.cj.jdbc.Driver");  
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/resumebuilder","root","password");
					Statement stmt=con.createStatement(); 
					ResultSet rs=stmt.executeQuery(query1);

					if(!rs.next())
						JOptionPane.showMessageDialog(null, "Username does not exist");
					
					else
					{
						if(!p1.equals(rs.getString("password")))
							JOptionPane.showMessageDialog(null, "Invalid password");

						else
						{
							f.setVisible(false);
							new ResumeJob(u1);				//SHIFTS TO NEXT PAGE

						}
					}

					con.close();
				}
				catch(Exception ex)
				{
					System.out.println(ex);
				}
			}
		});

		//SUBMIT BUTTON FOR SIGN UP PAGE
		sbmt2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent ae)
			{
				String u2 = ufield2.getText();
				String p2 = pfield2.getText();
				String cp2 = cpfield2.getText();
				String query2="SELECT username,password FROM resume where username='"+u2+"'";
				String insert2="INSERT INTO resume (username,password) VALUES ('"+u2+"','"+p2+"')";

				try									//JDBC CONNECTION
				{
					Class.forName("com.mysql.cj.jdbc.Driver");  
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/resumebuilder","root","password");
					Statement stmt=con.createStatement(); 
					ResultSet rs=stmt.executeQuery(query2); 

					if(!rs.next())
					{
				
						if(!p2.equals(cp2))
						{
							String st = "Passwords don't match!";
							JOptionPane.showMessageDialog(null, st);	
						}
						else
						{
							stmt.executeUpdate(insert2);
							f.setVisible(false);
							new ResumeJob(u2);				//SHIFTS TO NEXT PAGE
						}
					}
					else
						JOptionPane.showMessageDialog(null, "Username already exists");

					con.close();
				}
				catch(Exception ex)
				{
					System.out.println(ex);
				}
			}
		});

		f.setVisible(true);		
	}
}



class ResumeJob							//WELCOME PAGE THAT DIRECTS TO RESUME OR JOB SEARCHER PAGE
{

	ResumeJob(String username)
	{
		JFrame jf=new JFrame();

		GridBagConstraints c = new GridBagConstraints();

		JPanel p=new JPanel();
		p.setPreferredSize(new Dimension(800,350));
		p.setLayout(new GridBagLayout());
		p.setBackground(Color.BLACK);

		JPanel p1=new JPanel();
		p1.setPreferredSize(new Dimension(800,200));
		p1.setLayout(new GridLayout(1,1));
		p1.setBackground(Color.BLACK);
		p1.setBorder(BorderFactory.createMatteBorder(3, 3, 0, 3, Color.WHITE));

		JPanel p2=new JPanel();
		p2.setPreferredSize(new Dimension(800,50));
		p2.setBackground(Color.BLACK);
		p2.setBorder(BorderFactory.createMatteBorder(0, 3, 0, 3, Color.WHITE));

		JPanel p3=new JPanel();
		p3.setPreferredSize(new Dimension(800,100));
		p3.setLayout(new FlowLayout(FlowLayout.CENTER,100,10));
		p3.setBackground(Color.BLACK);
		p3.setBorder(BorderFactory.createMatteBorder(0, 3, 3, 3, Color.WHITE));

		String str="Welcome "+username;
		JLabel wel=new JLabel(str,SwingConstants.CENTER);
		wel.setFont(new Font("Montserrat",Font.BOLD,48));
		wel.setForeground(Color.WHITE);

		p1.add(wel,BorderLayout.CENTER);

		JLabel opt=new JLabel("Choose your option:",SwingConstants.CENTER);
		opt.setFont(new Font("Montserrat",Font.BOLD,24));
		opt.setForeground(Color.WHITE);

		p2.add(opt,BorderLayout.CENTER);

		JButton resume=new JButton("Resume Builder");
		resume.setBackground(Color.WHITE);
		JButton job=new JButton("Job Searcher");
		job.setBackground(Color.WHITE);

		resume.setPreferredSize(new Dimension(210,50));
		job.setPreferredSize(new Dimension(210,50));

		resume.setFont(new Font("Montserrat",Font.BOLD,18));
		job.setFont(new Font("Montserrat",Font.BOLD,18));

		resume.setFocusPainted(false);
		job.setFocusPainted(false);

		p3.add(resume);
		p3.add(job);

		c.gridx=0;
		c.gridy=0;
		p.add(p1,c);

		c.gridx=0;
		c.gridy=1;
		p.add(p2,c);

		c.gridx=0;
		c.gridy=2;
		p.add(p3,c);

		jf.add(p,BorderLayout.CENTER);


		//RESUME BUTTON
		resume.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String query="SELECT name FROM resume where username='"+username+"'";

				try								//JDBC CONNECTION
				{
					Class.forName("com.mysql.cj.jdbc.Driver");  
					Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/resumebuilder","root","password");
					Statement stmt=con.createStatement(); 
					ResultSet rs=stmt.executeQuery(query); 
					rs.next();

					if(rs.getString("name")==null)
					{
			
						jf.setVisible(false);
						new A(username);				//SHIFTS TO NEXT PAGE

					}
					else
					{
						jf.setVisible(false);
						new choose_template(username);			//SHIFTS TO NEXT PAGE
					}

					con.close();
				}
				catch(Exception ex)
				{
					System.out.println(ex);
				}
				
			}
		});


		//JOB SEARCHER BUTTON
		job.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				jf.setVisible(false);
				new Select(username);				//SHIFTS TO NEXT PAGE
			}
		});

		jf.setSize(1300,700);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}



class A implements ActionListener						//RESUME FORM
{
	
	
	JButton button;
	JLabel PerInfo_H,label1a,label1b,DOB,phone, email,district, skills,exp,gender,edu,tenth,plustwo,markt,boardt,boardp,markp,higherEdu,course,remark,fieldOfSpec;/*label1*/
	JTextField field1a,field1b,DOBf,phonef, emailf,marktf,markpf;
	JTextArea skillsA,expA,remarkA;
	JFrame jf;
	JRadioButton maleRB,femaleRB,nilRB;
	JComboBox<String> Dsrt,board1CB,board2CB,course1,FOS1;
	String usname;

	A(String username)
	{
		usname=username;

		jf = new JFrame("RESUME FORM");
		jf.setSize(1300,700);
                jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



      		//heading panel
      		JPanel jpan1 = new JPanel();
      		jpan1.setBackground(Color.BLACK);

      		//heading
     		JLabel jlab1 = new JLabel("Resume Form",JLabel.CENTER);
      		jlab1.setForeground(Color.WHITE);
      		jlab1.setFont(new Font("Montserrat", Font.BOLD, 36));
            
                jpan1.add(jlab1);
                jf.add(jpan1,BorderLayout.NORTH);
		
		JPanel p= new JPanel();
		GridBagLayout g=new GridBagLayout();
		GridBagConstraints c = new GridBagConstraints();
		c.anchor = GridBagConstraints. NORTHWEST;
		c.fill = GridBagConstraints.VERTICAL;
		p.setLayout(new BoxLayout(p,BoxLayout.Y_AXIS));

                JPanel p0=new JPanel();
                p0.setLayout(g);
		GridBagConstraints c0 = new GridBagConstraints();
		c0.insets = new Insets(5,5,5,5);
		c0.anchor = GridBagConstraints. NORTHWEST;
		c0.fill = GridBagConstraints.BOTH;
		
		JPanel p1= new JPanel();
		p1.setLayout(g);
		GridBagConstraints c1 = new GridBagConstraints();
		c1.insets = new Insets(5,0,0,0);
		c1.anchor = GridBagConstraints.NORTHWEST;
		c1.fill = GridBagConstraints.HORIZONTAL;
		c1.weighty = 0.5;
		
		JPanel p2= new JPanel();
		p2.setLayout(g);
		GridBagConstraints c2 = new GridBagConstraints();
		c2.insets = new Insets(5,5,5,5);
		c2.anchor = GridBagConstraints.NORTHWEST;
		c2.fill = GridBagConstraints.HORIZONTAL;
		c2.weighty = 0.3;
	
		JPanel p3= new JPanel();
		p3.setLayout(new BoxLayout(p3,BoxLayout.Y_AXIS));


		JPanel p4= new JPanel();
                p4.setPreferredSize(new Dimension(1300, 80));

		JPanel genderp= new JPanel();
		genderp.setLayout(new FlowLayout());
		
		String[] boardT=new String[] {"--nil--","CBSE","ICSE","STATE"};
		String[] boardP=new String[] {"--nil--","CBSE","ICSE","STATE","NIOS"};
		String[] Courses=new String[] {"--nil--","Btech","Mtech","Degree","Btech with honours","Btech with minor","PhD"};
		String[] FOS=new String[] {"--nil--","Computer Science Engineering","Civil Engineering","Electonics and Communications Engineering","Electrical and Electronics Engineering","Mechanical Engineering","Chemical Engineering"};
		String[] District=new String[] {"--nil--","Thiruvananthapuram","Kollam","Alappuzha","Pathanamthitta","Kottayam","Idukki","Ernakulam","Thrissur","Palakkad","Malappuram","Kozhikode", "Wayanadu","Kannur","Kasaragod"};
		
		PerInfo_H=new JLabel("PERSONAL INFORMATION",SwingConstants.CENTER);
		PerInfo_H.setFont(new Font("Montserrat",Font.BOLD, 16));
		label1a= new JLabel("First Name : ",SwingConstants.LEFT);
		label1a.setFont(new Font("Montserrat",Font.PLAIN, 14));
		label1b= new JLabel("Last Name : ",SwingConstants.LEFT);
		label1b.setFont(new Font("Montserrat",Font.PLAIN, 14));
		DOB= new JLabel("DOB (DD/MM/YYYY) : ",SwingConstants.LEFT);
		DOB.setFont(new Font("Montserrat",Font.PLAIN, 14));
		gender= new JLabel("Gender : ",SwingConstants.LEFT);
		gender.setFont(new Font("Montserrat",Font.PLAIN, 14));
		phone=new JLabel("Contact Number : ",SwingConstants.LEFT);
		phone.setFont(new Font("Montserrat",Font.PLAIN, 14));
		email= new JLabel("Email ID : ",SwingConstants.LEFT);
		email.setFont(new Font("Montserrat",Font.PLAIN, 14));
		district= new JLabel("District : ",SwingConstants.LEFT);
		district.setFont(new Font("Montserrat",Font.PLAIN, 14));
		edu=new JLabel("EDUCATION",SwingConstants.LEFT);
		edu.setFont(new Font("Montserrat",Font.BOLD, 16));
		tenth=new JLabel("10th",SwingConstants.LEFT);
		tenth.setFont(new Font("Montserrat",Font.BOLD, 14));
		markt=new JLabel("Mark (%) : ",SwingConstants.LEFT);
		markt.setFont(new Font("Montserrat",Font.PLAIN, 14));
		boardt= new JLabel("Board : ",SwingConstants.LEFT);
		boardt.setFont(new Font("Montserrat",Font.PLAIN, 14));
		plustwo=new JLabel("12th",SwingConstants.LEFT);
		plustwo.setFont(new Font("Montserrat",Font.BOLD, 14));
		markp=new JLabel("Mark (%) : ",SwingConstants.LEFT);
		markp.setFont(new Font("Montserrat",Font.PLAIN, 14));
		boardp= new JLabel("Board : ",SwingConstants.LEFT);
		boardp.setFont(new Font("Montserrat",Font.PLAIN, 14));
		higherEdu=new JLabel("Higher Education",SwingConstants.LEFT);
		higherEdu.setFont(new Font("Montserrat",Font.BOLD, 14));
		course=new JLabel("Course : ",SwingConstants.LEFT);
		course.setFont(new Font("Montserrat",Font.PLAIN, 14));
		remark= new JLabel("Higher Education Details : ",SwingConstants.LEFT);
		remark.setFont(new Font("Montserrat",Font.PLAIN, 14));
		fieldOfSpec=new JLabel("Field of Specialisation : ",SwingConstants.LEFT);
		fieldOfSpec.setFont(new Font("Montserrat",Font.PLAIN, 14));
		skills= new JLabel("SKILLS/INTERESTS",SwingConstants.LEFT);
		skills.setFont(new Font("Montserrat",Font.BOLD, 16));
		exp=new JLabel("WORK EXPERIENCE",SwingConstants.LEFT);
		exp.setFont(new Font("Montserrat",Font.BOLD, 16));

		field1a = new JTextField(SwingConstants.LEFT);
		field1b = new JTextField(SwingConstants.LEFT);
		DOBf = new JTextField(6);
		phonef=new JTextField(SwingConstants.LEFT);
		emailf = new JTextField(SwingConstants.LEFT);
		marktf=new JTextField(SwingConstants.LEFT);
		markpf=new JTextField(SwingConstants.LEFT);
		
		remarkA = new JTextArea();
		remarkA.setPreferredSize(new Dimension(120,60));
		skillsA = new JTextArea();
		skillsA.setPreferredSize(new Dimension(110,90));
		expA=new JTextArea();
		expA.setPreferredSize(new Dimension(110,90));

		Dsrt=new JComboBox<>(District);   
		Dsrt.setBounds(20,50,90,20); 
		board1CB=new JComboBox<>(boardT);   
		board1CB.setBounds(20, 50,90,20); 
		board2CB=new JComboBox<>(boardP);   
		board2CB.setBounds(20, 50,90,20); 
		course1=new JComboBox<>(Courses);   
		course1.setBounds(0,70,90,20); 
		FOS1=new JComboBox<>(FOS);   
		FOS1.setBounds(0,50,90,20); 
		
		maleRB=new JRadioButton("Male");
		maleRB.setFont(new Font("Montserrat",Font.PLAIN, 12));
		femaleRB=new JRadioButton("Female");
		femaleRB.setFont(new Font("Montserrat",Font.PLAIN, 12));
		nilRB=new JRadioButton("Don't specify");
		nilRB.setFont(new Font("Montserrat",Font.PLAIN, 12));
		button = new JButton("Submit");
		button.setBounds(50,50,30,20); 
		
		ButtonGroup group = new ButtonGroup();
		
		c1.gridx = 0;
		c1.gridy = 0;
		p1.add(PerInfo_H,c1);	
	
		c1.gridx = 0;
		c1.gridy = 1;
		p1.add(label1a,c1);

		c1.gridx = 1;
		c1.gridy = 1;
		c1.gridwidth = 2;
		p1.add(field1a,c1);

		c1.gridx = 0;
		c1.gridy = 2;
		p1.add(label1b,c1);

		c1.gridx = 1;
		c1.gridy = 2;
		c1.gridwidth = 2;
		p1.add(field1b,c1);

		c1.gridx = 0;
		c1.gridy = 3;
		p1.add(DOB,c1);

		c1.gridx = 1;
		c1.gridy = 3;
		c1.gridwidth = 2;
		p1.add(DOBf,c1);

		c1.gridx = 0;
		c1.gridy = 4;
		p1.add(gender,c1);
                genderp.add(maleRB);
                genderp.add(femaleRB);
                genderp.add(nilRB);

		c1.gridx = 1;
		c1.gridy = 4;
		c1.gridwidth = 2;
		p1.add(genderp,c1);
		group.add(maleRB);
		group.add(femaleRB);;
		group.add(nilRB);

		c1.insets = new Insets(5,0,0,0);
		c1.gridx = 0;
		c1.gridy = 5;
		p1.add(phone,c1);

		c1.gridx = 1;
		c1.gridy = 5;
		p1.add(phonef,c1);

		c1.gridx = 0;
		c1.gridy = 6;
		p1.add(email,c1);

		c1.gridx = 1;
		c1.gridy = 6;
		p1.add(emailf,c1);

		c1.gridx = 0;
		c1.gridy = 7;
		p1.add(district,c1);

		c1.gridx = 1;
		c1.gridy = 7;
		p1.add(Dsrt,c1);

		c1.gridx = 0;
		c1.gridy = 9;
		p1.add(skills,c1);

		c1.gridx = 0;
		c1.gridy = 10;
		c1.gridwidth =3;
		p1.add(skillsA,c1);

		c0.gridx = 0;
		c0.gridy = 0;
		p0.add(p1,c0);

		c2.gridx = 0;
		c2.gridy = 0;
		p2.add(edu,c2);

		c2.gridx = 0;
		c2.gridy = 1;
		p2.add(tenth,c2);

		c2.gridx = 0;
		c2.gridy = 2;
		p2.add(markt,c2);

		c2.gridx = 1;
		c2.gridy = 2;
		p2.add(marktf,c2);

		c2.gridx = 2;
		c2.gridy = 2;
		p2.add(boardt,c2);

		c2.gridx = 3;
		c2.gridy = 2;
		p2.add(board1CB,c2);

		c2.gridx = 0;
		c2.gridy = 3;
		p2.add(plustwo,c2);

		c2.gridx = 0;
		c2.gridy = 4;
		p2.add(markp,c2);

		c2.gridx = 1;
		c2.gridy = 4;
		p2.add(markpf,c2);

		c2.gridx = 2;
		c2.gridy = 4;
		p2.add(boardp,c2);

		c2.gridx = 3;
		c2.gridy = 4;
		p2.add(board2CB,c2);

		c2.gridx = 0;
		c2.gridy = 5;
		p2.add(higherEdu,c2);

		c2.gridx = 0;
		c2.gridy = 6;
		p2.add(course,c2);

		c2.gridx = 1;
		c2.gridy = 6;
		p2.add(course1,c2);

		c2.gridx = 0;
		c2.gridy = 7;
		p2.add(fieldOfSpec,c2);

		c2.gridx = 1;
		c2.gridy = 7;
		p2.add(FOS1,c2);

		c2.gridx=0;
		c2.gridy=8;
		p2.add(remark,c2);

		c2.gridx = 1;
		c2.gridy = 8;
		c2.gridwidth =1;
		p2.add(remarkA,c2);

		c2.gridx=0;
		c2.gridy=9;
		p2.add(exp,c2);

		c2.gridx = 0;
		c2.gridy = 10;
		c2.gridwidth =2;
		p2.add(expA,c2);

		c0.gridx = 1;
		c0.gridy = 0;
		p0.add(p2,c0);

                p3.add(p0,BorderLayout.CENTER);
                button.setPreferredSize(new Dimension(100, 40));
		button.setBackground(Color.BLACK);
		button.setFocusPainted(false);
		button.setForeground(Color.WHITE);
		button.setFont(new Font("Montserrat",Font.BOLD, 16));

                p4.add(button,BorderLayout.CENTER);

		p.add(p3,BorderLayout.CENTER);

                p.add(p4,BorderLayout.CENTER);
		
                jf.add(p,BorderLayout.CENTER);
		
		button.addActionListener(this); //As soon as button is clicked, data from all the textfields is read
		Dsrt.addActionListener(this);
		board1CB.addActionListener(this);
		board2CB.addActionListener(this);
		course1.addActionListener(this);
		FOS1.addActionListener(this);
		jf.setVisible(true);
           	
	}
	
    	public void actionPerformed(ActionEvent ae)			//EVENT HANDLING IN RESUME FORM
	{
		int count=0;
		int c1=1,c2=1,c3=1,c4=1,c5=1,c6=1;	
		String s1,s2,s4,s5,s6,s7;
		String fname="",lname="",dob,no="",eml="",skl,rmk,wexp,dsrt,board10,board12,fosp,Course,gen="";
		float mark10=0,mark12=0;
		
		s1=field1a.getText();
		if(s1 != null && !s1.isEmpty())	
		{
        		count++;
			fname=s1.substring(0, 1).toUpperCase()+s1.substring(1).toLowerCase();
		}
		
		s2=field1b.getText();
		if(s2 != null && !s2.isEmpty())
		{
        		count++;
			lname=s2.substring(0, 1).toUpperCase()+s2.substring(1).toLowerCase();
		}
		
		dob=DOBf.getText();
		if(dob != null && !dob.isEmpty())
		{	
			DateFormat format = new SimpleDateFormat("dd/MM/yyyy");
			format.setLenient(false);

			try {
			    format.parse(dob);
			    count++;
			}
			catch (ParseException e)
			{
				String st = "Invalid Date of Birth";
				JOptionPane.showMessageDialog(null, st);
			}	
			
		}
		
		s4=phonef.getText();
		if(s4!= null && !s4.isEmpty())
		{
			no = s4.replace(" ", ""); 
			boolean valid = no.matches("[0-9]{6,10}"); 
			if(!valid)
			{
				String st = "Invalid Number";
				JOptionPane.showMessageDialog(null, st);
			}
			else
				count++;


		}
		
		s5=emailf.getText();
		if(s5!= null && !s5.isEmpty())
		{
			eml = s5.replace(" ", ""); 
			boolean validE = eml.matches("^.+@.+\\..+$"); 
			if(!validE)
			{
				String st = "Invalid Email ID";
				JOptionPane.showMessageDialog(null, st);	
			}
			else
				count++;
		}
		
		s6=marktf.getText();
		if(s6!= null && !s6.isEmpty())
		{
			count++;
			mark10=Float.parseFloat(s6);
		}

		s7=markpf.getText();
		if(s7!= null && !s7.isEmpty())
		{
			count++;
			mark12=Float.parseFloat(s7);
		}
		
		rmk=remarkA.getText();
		if(rmk!= null && !rmk.isEmpty())
			count++;
			
		skl=skillsA.getText();
		if(skl!= null && !skl.isEmpty())
			count++;

		wexp=expA.getText();
		if(wexp!= null && !wexp.isEmpty())
			count++;

		dsrt=(String) Dsrt.getSelectedItem();
		if(c1==1)
		{
			c1=0;
			count++;
		}
		if(dsrt.equals("--nil--"))
		{
			c1=1;
			count--;
			
		}

		board10=(String) board1CB.getSelectedItem();
		if(c2==1)
		{
			c2=0;
			count++;
		}
		if(board10.equals("--nil--"))
		{
			c2=1;
			count--;
			
		}


		board12=(String) board2CB.getSelectedItem();
		if(c3==1)
		{
			c3=0;
			count++;
		}
		if(board12.equals("--nil--"))
		{
			c3=1;
			count--;
			
		}


		Course=(String) course1.getSelectedItem();
		if(c4==1)
		{
			c4=0;
			count++;
		}
		if(Course.equals("--nil--"))
		{
			c4=1;
			count--;
			
		}

		fosp=(String) FOS1.getSelectedItem();
		if(c5==1)
		{
			c5=0;
			count++;
		}
		if(fosp.equals("--nil--"))
		{
			c5=1;
			count--;
			
		}
		
		if(maleRB.isSelected())
		{
			gen="Male";
			if(c6==1)
			{
				c6=0;
				count++;
			}
		}

		if(femaleRB.isSelected())
		{
			gen="Female";
			if(c6==1)
			{
				c6=0;
				count++;
			}
		}

		if(nilRB.isSelected())		
		{
			gen="Don't specify";
			if(c6==1)
			{
				c6=0;
				count++;
			}
		}

		if(ae.getActionCommand().equals("Submit"))
		{	if(count!=16)			
			{
				String st = "Please enter all the values";
				JOptionPane.showMessageDialog(null, st);
				
			}
			else
			{
				String insert="UPDATE resume SET name=?, dob=?, gender=?, contact=?, email=?, district=?, mark10=?, mark12=?, board10=?, board12=?, course=?, remark=?, workexp=?, skills=?, fos=? where username=?";

				try							//JDBC CONNECTION
          			{
          				Class.forName("com.mysql.cj.jdbc.Driver");  
          				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/resumebuilder","root","password");
          				PreparedStatement stmt=con.prepareStatement(insert);
					stmt.setString(1,fname+" "+lname); 
					stmt.setString(2,dob); 
					stmt.setString(3,gen); 
					stmt.setString(4,no); 
					stmt.setString(5,eml); 
					stmt.setString(6,dsrt); 
					stmt.setString(7,s6); 
					stmt.setString(8,s7); 
					stmt.setString(9,board10); 
					stmt.setString(10,board12); 
					stmt.setString(11,Course); 
					stmt.setString(12,rmk); 
					stmt.setString(13,wexp); 
					stmt.setString(14,skl); 
					stmt.setString(15,fosp); 
					stmt.setString(16,usname); 

          				stmt.execute();
          				con.close();

          			}
          			catch(Exception ex)
          			{
            				System.out.println(ex);
          			}

                                jf.setVisible(false);
				new choose_template(usname);
				AbstractButton aButton = (AbstractButton) ae.getSource();

				System.out.println(fname+" "+lname+" "+dob+" "+no+" "+eml+" "+mark10+" "+mark12+" "+dsrt);
				System.out.println(dsrt+" "+board10+" "+board12+" "+Course+" "+fosp+" "+gen);
				System.out.println(rmk);
				System.out.println(wexp);
				System.out.println(skl);
				System.out.println(count);

			}		
		} 
	}
}



class choose_template 									//CHOOSE A TEMPLATE PAGE
{
	choose_template(String username) 
	{
		JPanel heading_panel = new JPanel();
        	JPanel panel1 = new JPanel();
        	JPanel panel2 = new JPanel();
        	JPanel main_panel = new JPanel();

        	JFrame frame = new JFrame();
		frame.setSize(1300,700);

        	JLabel label = new JLabel("CHOOSE YOUR TEMPLATE",JLabel.CENTER);
        	JLabel label1 = new JLabel();
        	JLabel label2 = new JLabel();
        	JLabel label3 = new JLabel();

        	JButton temp1 = new JButton("Template 1");
        	temp1.setPreferredSize(new Dimension(120,35));
		temp1.setBackground(Color.WHITE);
		temp1.setFont(new Font("Montserrat", Font.BOLD, 14));
		temp1.setFocusPainted(false);

        	JButton temp2 = new JButton("Template 2");
        	temp2.setPreferredSize(new Dimension(120,35));
		temp2.setBackground(Color.WHITE);
		temp2.setFont(new Font("Montserrat", Font.BOLD, 14));
		temp1.setFocusPainted(false);

        	JButton temp3 = new JButton("Template 3");
        	temp3.setPreferredSize(new Dimension(120,35));
		temp3.setBackground(Color.WHITE);
		temp3.setFont(new Font("Montserrat", Font.BOLD, 14));
		temp1.setFocusPainted(false);

        	ImageIcon icon1 = new ImageIcon("C:\\REETHU\\Java Project\\temp1.jpg");		//INSERTING IMAGE
        	ImageIcon icon2 = new ImageIcon("C:\\REETHU\\Java Project\\temp2.jpg");
        	ImageIcon icon3 = new ImageIcon("C:\\REETHU\\Java Project\\temp3.jpg");

        	label1.setIcon(icon1);
        	label2.setIcon(icon2);
        	label3.setIcon(icon3);

        	label.setForeground(Color.WHITE);
        	label.setFont(new Font("Montserrat", Font.BOLD, 36));
        	heading_panel.setBackground(Color.BLACK);
        	main_panel.setBackground(Color.BLACK);
        	panel1.setBackground(Color.BLACK);
        	panel2.setBackground(Color.BLACK);
    
        	heading_panel.add(label);
        	panel1.add(label1);
        	panel1.add(label2);
        	panel1.add(label3);
        	panel2.add(temp1);
        	panel2.add(temp2);
        	panel2.add(temp3);
        	main_panel.add(panel1);
        	main_panel.add(panel2);


		//TEMPLATE 1 BUTTON
		temp1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String query="SELECT * FROM resume where username='"+username+"'";
				String NAME="",Gender="",DOB="",PhoneNo="",Email="",District="",skills="",field="",experience="", education="";
          			try								//JDBC CONNECTION
          			{
          				Class.forName("com.mysql.cj.jdbc.Driver");  
          				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/resumebuilder","root","password");
          				Statement stmt=con.createStatement(); 
          				ResultSet rs=stmt.executeQuery(query);

					rs.next();
					NAME=rs.getString("name");
					Gender="Gender: "+rs.getString("gender");
					DOB="DOB: "+rs.getString("dob");
					PhoneNo="PhoneNo: "+ rs.getString("contact");
					Email="Email ID: "+ rs.getString("email");
					District="District: "+ rs.getString("district");
					skills="<html>"+(rs.getString("skills")).replaceAll("\n","<br>")+"</html>";
					field=rs.getString("fos");
					experience="<html>"+(rs.getString("workexp")).replaceAll("\n","<br>")+"</html>";
					education="<html>Grade 10: "+rs.getString("mark10")+"% ("+rs.getString("board10")+")<br>Grade 12: " +rs.getString("mark12")+"% ("+rs.getString("board12")+")<br>Course: "+rs.getString("course")+"<br>Higher Education: "+(rs.getString("remark")).replaceAll("\n","<br>")+"</html>";
				

					con.close();
       				}
       				catch(Exception ex)
       				{
       					System.out.println(ex);
       				}
				frame.setVisible(false);
				new Template1(username,NAME,Gender,DOB,Email,PhoneNo,District,skills,field,experience,education);
			}
		});



		//TEMPLATE 2 BUTTON        
		temp2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String query="SELECT * FROM resume where username='"+username+"'";
				String NAME="",Gender="",DOB="",PhoneNo="",Email="",District="",skills="",field="",experience="", education="";
          			try								//JDBC CONNECTION
          			{
          				Class.forName("com.mysql.cj.jdbc.Driver");  
          				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/resumebuilder","root","password");
          				Statement stmt=con.createStatement(); 
          				ResultSet rs=stmt.executeQuery(query);

					rs.next();
					NAME=rs.getString("name");
					Gender="Gender: "+rs.getString("gender");
					DOB="DOB: "+rs.getString("dob");
					PhoneNo="PhoneNo: "+ rs.getString("contact");
					Email="Email ID: "+ rs.getString("email");
					District="District: "+ rs.getString("district");
					skills="<html>"+(rs.getString("skills")).replaceAll("\n","<br>")+"</html>";
					field=rs.getString("fos");
					experience="<html>"+(rs.getString("workexp")).replaceAll("\n","<br>")+"</html>";
					education="<html>Grade 10: "+rs.getString("mark10")+"% ("+rs.getString("board10")+")<br>Grade 12: " +rs.getString("mark12")+"% ("+rs.getString("board12")+")<br>Course: "+rs.getString("course")+"<br>Higher Education: "+(rs.getString("remark")).replaceAll("\n","<br>")+"</html>";
				

					con.close();
       				}
       				catch(Exception ex)
       				{
       					System.out.println(ex);
       				}
				frame.setVisible(false);
				new Template2(username,NAME,Gender,DOB,Email,PhoneNo,District,skills,field,experience,education);
			}
		});


		//TEMPLATE 3 BUTTON
		temp3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				String query="SELECT * FROM resume where username='"+username+"'";
				String NAME="",Gender="",DOB="",PhoneNo="",Email="",District="",skills="",field="",experience="", education="";
          			try								//JDBC CONNECTION
          			{
          				Class.forName("com.mysql.cj.jdbc.Driver");  
          				Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/resumebuilder","root","password");
          				Statement stmt=con.createStatement(); 
          				ResultSet rs=stmt.executeQuery(query);

					rs.next();
					NAME=rs.getString("name");
					Gender="Gender: "+rs.getString("gender");
					DOB="DOB: "+rs.getString("dob");
					PhoneNo="PhoneNo: "+ rs.getString("contact");
					Email="Email ID: "+ rs.getString("email");
					District="District: "+ rs.getString("district");
					skills="<html>"+(rs.getString("skills")).replaceAll("\n","<br>")+"</html>";
					field=rs.getString("fos");
					experience="<html>"+(rs.getString("workexp")).replaceAll("\n","<br>")+"</html>";
					education="<html>Grade 10: "+rs.getString("mark10")+"% ("+rs.getString("board10")+")<br>Grade 12: " +rs.getString("mark12")+"% ("+rs.getString("board12")+")<br>Course: "+rs.getString("course")+"<br>Higher Education: "+(rs.getString("remark")).replaceAll("\n","<br>")+"</html>";
				

					con.close();
       				}
       				catch(Exception ex)
       				{
       					System.out.println(ex);
       				}
				frame.setVisible(false);
				new Template3(username,NAME,Gender,DOB,Email,PhoneNo,District,skills,field,experience,education);
			}
		});

        	panel1.setLayout(new FlowLayout(FlowLayout.CENTER, 100,75));
        	panel2.setLayout(new FlowLayout(FlowLayout.CENTER, 300,20));
        	frame.add(heading_panel,BorderLayout.NORTH);
        	frame.add(main_panel);
        	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        	frame.setVisible(true);
    	}
}



class Template1 extends JFrame 								//TEMPLATE 1
{
	public String Name,Gender,DOB,Email,PhoneNo,District,skill,field,experience,education;
	public JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l14,l18,l19,l110;
	public Font f,f1,f2,f3,f0;
	public JButton x1,x2,x3;

	public Template1(String username, String Name,String Gender,String DOB,String Email,String PhoneNo,String District,String skill,String field,String experience,String education) 
	{

		GridBagConstraints c = new GridBagConstraints();

		JPanel p=new JPanel();
		p.setPreferredSize(new Dimension(900,700));
		p.setOpaque(true);

		JPanel bx1=new JPanel();
		bx1.setPreferredSize(new Dimension(300,110));
		bx1.setLayout(new FlowLayout());
		bx1.setOpaque(true);

		JPanel bx2=new JPanel();
		bx2.setPreferredSize(new Dimension(300,110));
		bx2.setLayout(new FlowLayout());
		bx2.setOpaque(true);

		JPanel bx3=new JPanel();
		bx3.setPreferredSize(new Dimension(300,110));
		bx3.setLayout(new FlowLayout());
		bx3.setOpaque(true);

		JPanel p0=new JPanel();
		p0.setPreferredSize(new Dimension(900,20));
		p0.setOpaque(true);

		JPanel pt=new JPanel();
		pt.setPreferredSize(new Dimension(900,570));
		pt.setLayout(new GridBagLayout());
		pt.setOpaque(true);

		JPanel btn=new JPanel();
		btn.setPreferredSize(new Dimension(900,110));
		btn.setLayout(new GridLayout(1,3));
		btn.setOpaque(true);

		JPanel pfos=new JPanel();
		pfos.setPreferredSize(new Dimension(580,20));

		p.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		JPanel p1=new JPanel();
		p1.setPreferredSize(new Dimension(320,570));
		p1.setBackground(new Color(247,198,153));
		p1.setOpaque(true);
		p1.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
		p1.setLayout(new GridLayout(3,1));

		JPanel p2=new JPanel();
		p2.setPreferredSize(new Dimension(580,570));
		p2.setLayout(new BoxLayout(p2,BoxLayout.PAGE_AXIS));
		p2.setOpaque(true);
		p2.setBorder(BorderFactory.createMatteBorder(1, 0, 1, 1, Color.BLACK));

		JPanel p1a=new JPanel();
		p1a.setBackground(new Color(247,198,153));
		p1a.setLayout(new GridLayout(5,1));
		p1a.setOpaque(true);

		JPanel p1b=new JPanel();
		p1b.setBackground(new Color(247,198,153));
		p1b.setOpaque(true);

		JPanel p1c=new JPanel();
		p1c.setBackground(new Color(247,198,153));
		p1c.setLayout(new BoxLayout(p1c, BoxLayout.PAGE_AXIS));
		p1c.setOpaque(true);


		JPanel p2a=new JPanel();
		p2a.setBackground(new Color(251,228,209));
		p2a.setPreferredSize(new Dimension(580,150));
		p2a.setLayout(new GridLayout(1,1));
		p2a.setOpaque(true);
		p2a.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));

		JPanel p2b=new JPanel();
		p2b.setOpaque(true);
		p2b.setPreferredSize(new Dimension(580,420));

		JPanel p2ba=new JPanel();
		p2ba.setPreferredSize(new Dimension(580,70));
		p2ba.setLayout(new BoxLayout(p2ba, BoxLayout.PAGE_AXIS));
		p2ba.setOpaque(true);

		JPanel p2bb=new JPanel();
		p2bb.setPreferredSize(new Dimension(580,165));
		p2bb.setLayout(new BoxLayout(p2bb, BoxLayout.PAGE_AXIS));
		p2bb.setOpaque(true);

		JPanel p2bc=new JPanel();
		p2bc.setPreferredSize(new Dimension(580,165));
		p2bc.setLayout(new BoxLayout(p2bc, BoxLayout.PAGE_AXIS));
		p2bc.setOpaque(true);


		f2 = new Font("Georgia",Font.ITALIC,15);
		f1 = new Font("Georgia", Font.BOLD, 15);
		f = new Font("Georgia", Font.BOLD,16);
		f0 = new Font("Georgia", Font.BOLD,24);
		f3 = new Font("Georgia",Font.ITALIC,16);
		this.Name = Name;
		this.Gender = Gender;
		this.DOB = DOB;
		this.Email = Email;
		this.PhoneNo = PhoneNo;
		this.District=District;
		this.skill =skill;
		this.field = field;
		this.experience = experience;
		this.education = education;

		l1 = new JLabel(this.Name,SwingConstants.CENTER);
		l2 = new JLabel(this.Gender,SwingConstants.CENTER);
		l3 = new JLabel(this.DOB,SwingConstants.CENTER);
		l4 = new JLabel("FIELD OF SPECIALIZATION",SwingConstants.CENTER);
		l4.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		l5 = new JLabel(this.District,SwingConstants.CENTER);
		l6 = new JLabel(this.Email,SwingConstants.CENTER);
		l7 = new JLabel("SKILLS/INTERESTS",SwingConstants.CENTER);
		l7.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		l8 = new JLabel(this.PhoneNo,SwingConstants.CENTER);
		l9 = new JLabel("EDUCATIONAL QUALIFICATION",SwingConstants.CENTER);
		l9.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		l10 = new JLabel("WORK EXPERIENCE",SwingConstants.CENTER);
		l10.setAlignmentX(JLabel.CENTER_ALIGNMENT);

		x1=new JButton("EXIT");
		x2=new JButton("JOB SEARCHER");
		x3=new JButton("DOWNLOAD RESUME");
		x1.setPreferredSize(new Dimension(200,30));
		x2.setPreferredSize(new Dimension(200,30));
		x3.setPreferredSize(new Dimension(200,30));

		x1.setFont(new Font("Montserrat", Font.BOLD, 14));
		x1.setBackground(Color.BLACK);
		x1.setForeground(Color.WHITE);
		x1.setFocusPainted(false);

		x2.setFont(new Font("Montserrat", Font.BOLD, 14));
		x2.setBackground(Color.BLACK);
		x2.setForeground(Color.WHITE);
		x2.setFocusPainted(false);
	
		x3.setFont(new Font("Montserrat", Font.BOLD, 14));
		x3.setBackground(Color.BLACK);
		x3.setForeground(Color.WHITE);
		x3.setFocusPainted(false);

		l14 = new JLabel(this.experience,SwingConstants.CENTER);
		l14.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		l18 = new JLabel(this.skill,SwingConstants.CENTER);
		l18.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		l19 = new JLabel(this.field,SwingConstants.CENTER);
		l19.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		l110 = new JLabel(this.education,SwingConstants.CENTER);
		l110.setAlignmentX(JLabel.CENTER_ALIGNMENT);

		l1.setFont(f0);
		l2.setFont(f1);
		l3.setFont(f1);
		l4.setFont(f);
		l5.setFont(f1);
		l6.setFont(f1);
		l7.setFont(f);
		l8.setFont(f);
		l9.setFont(f);
		l10.setFont(f);
		l14.setFont(f3);
		l18.setFont(f3);
		l19.setFont(f3);
		l110.setFont(f3);


		p1a.add(l2,BorderLayout.CENTER);
		p1a.add(l3,BorderLayout.CENTER);
		p1a.add(l8,BorderLayout.CENTER);
		p1a.add(l6,BorderLayout.CENTER);
		p1a.add(l5,BorderLayout.CENTER);
		p1c.add(l7,BorderLayout.CENTER);
		p1c.add(l18,BorderLayout.CENTER);

		p2a.add(l1,BorderLayout.CENTER);

		p2ba.add(l4,BorderLayout.CENTER);
		p2ba.add(l19,BorderLayout.CENTER);

		p2bb.add(l9,BorderLayout.CENTER);
		p2bb.add(l110,BorderLayout.CENTER);

		p2bc.add(l10,BorderLayout.CENTER);
		p2bc.add(l14,BorderLayout.CENTER);

		p1.add(p1a);
		p1.add(p1b);
		p1.add(p1c);

		p2b.add(pfos);
		p2b.add(p2ba);
		p2b.add(p2bb);
		p2b.add(p2bc);


		p2.add(p2a);
		p2.add(p2b);

		c.gridx=0;
		c.gridy=0;
		pt.add(p1,c);

		c.gridx=1;
		c.gridy=0;
		pt.add(p2,c);

		bx1.add(x1,BorderLayout.CENTER);
		bx2.add(x2,BorderLayout.CENTER);
		bx3.add(x3,BorderLayout.CENTER);

		btn.add(bx1);
		btn.add(bx3);
		btn.add(bx2);

		p.add(p0);

		p.add(pt);
		p.add(btn);

		add(p,BorderLayout.CENTER);


		//EXIT BUTTON
		x1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				setVisible(false);
				System.exit(0);				
			}
		});


		//JOB SEARCHER
		x2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				setVisible(false);
				new Select(username);
			}
		});


		//DOWNLOAD RESUME PAGE
		x3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				//DOWNLOAD IMAGE

				BufferedImage bufImage = new BufferedImage(pt.getSize().width,pt.getSize().height,BufferedImage.TYPE_INT_RGB);
				pt.paint(bufImage.createGraphics());
				File imageFile = new File("Resume1.jpeg");

				try
				{
					imageFile.createNewFile();
					ImageIO.write(bufImage, "jpeg", imageFile);
				}
				catch(Exception ae)
				{
					System.out.println(ae);
				}

				JOptionPane.showMessageDialog(null,"Resume Downloaded!");
			}
		});


		setSize(1300,700);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}



class Template2 extends JFrame							//TEMPLATE 2
{
	public String Name,Gender,DOB,Email,PhoneNo,District,skill,field,experience,education;
	public JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l14,l18,l19,l110;
	public Font f,f1,f2,f3,f0;
	public JButton x1,x2,x3;

	public Template2(String username,String Name,String Gender,String DOB,String Email,String PhoneNo,String District,String skill,String field,String experience,String education) 
	{

		GridBagConstraints c = new GridBagConstraints();

		JPanel p=new JPanel();
		p.setPreferredSize(new Dimension(900,700));
		p.setOpaque(true);

		JPanel bx1=new JPanel();
		bx1.setPreferredSize(new Dimension(300,110));
		bx1.setLayout(new FlowLayout());
		bx1.setOpaque(true);

		JPanel bx2=new JPanel();
		bx2.setPreferredSize(new Dimension(300,110));
		bx2.setLayout(new FlowLayout());
		bx2.setOpaque(true);

		JPanel bx3=new JPanel();
		bx3.setPreferredSize(new Dimension(300,110));
		bx3.setLayout(new FlowLayout());
		bx3.setOpaque(true);

		JPanel p0=new JPanel();
		p0.setPreferredSize(new Dimension(900,20));
		p0.setOpaque(true);

		JPanel pt=new JPanel();
		pt.setPreferredSize(new Dimension(900,570));
		pt.setLayout(new GridBagLayout());
		pt.setOpaque(true);

		JPanel btn=new JPanel();
		btn.setPreferredSize(new Dimension(900,110));
		btn.setLayout(new GridLayout(1,3));
		btn.setOpaque(true);

		p.setBorder(BorderFactory.createLineBorder(Color.BLACK));

		JPanel pfos=new JPanel();
		pfos.setPreferredSize(new Dimension(580,20));
		pfos.setOpaque(true);
		pfos.setBackground(new Color(237,209,230));

		JPanel p1=new JPanel();
		p1.setPreferredSize(new Dimension(320,570));
		p1.setBackground(new Color(219,162,206));
		p1.setOpaque(true);
		p1.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));
		p1.setLayout(new GridLayout(3,1));

		JPanel p2=new JPanel();
		p2.setPreferredSize(new Dimension(580,570));
		p2.setBackground(new Color(237,209,230));
		p2.setLayout(new BoxLayout(p2, BoxLayout.PAGE_AXIS));
		p2.setOpaque(true);
		p2.setBorder(BorderFactory.createMatteBorder(1, 0, 1, 1, Color.BLACK));

		JPanel p1a=new JPanel();
		p1a.setBackground(new Color(219,162,206));
		p1a.setLayout(new GridLayout(3,1));
		p1a.setOpaque(true);

		JPanel p1b=new JPanel();
		p1b.setBackground(new Color(219,162,206));
		p1b.setOpaque(true);

		JPanel p1c=new JPanel();
		p1c.setBackground(new Color(219,162,206));
		p1c.setLayout(new GridLayout(3,1));
		p1c.setOpaque(true);


		JPanel p2a=new JPanel();
		p2a.setPreferredSize(new Dimension(580,70));
		p2a.setBackground(new Color(237,209,230));
		p2a.setLayout(new BoxLayout(p2a, BoxLayout.PAGE_AXIS));
		p2a.setOpaque(true);

		JPanel p2b=new JPanel();
		p2b.setPreferredSize(new Dimension(580,200));
		p2b.setOpaque(true);
		p2b.setBackground(new Color(237,209,230));
		p2b.setLayout(new BoxLayout(p2b, BoxLayout.PAGE_AXIS));

		JPanel p2c=new JPanel();
		p2c.setPreferredSize(new Dimension(580,140));
		p2c.setLayout(new BoxLayout(p2c, BoxLayout.PAGE_AXIS));
		p2c.setBackground(new Color(237,209,230));
		p2c.setOpaque(true);

		JPanel p2d=new JPanel();
		p2d.setPreferredSize(new Dimension(580,140));
		p2d.setLayout(new BoxLayout(p2d, BoxLayout.PAGE_AXIS));
		p2d.setBackground(new Color(237,209,230));
		p2d.setOpaque(true);


		f0 = new Font("Georgia",Font.BOLD,22);
		f2 = new Font("Georgia",Font.ITALIC,15);
		f1 = new Font("Georgia", Font.BOLD, 15);
		f = new Font("Georgia", Font.BOLD,16);
		f3 = new Font("Georgia",Font.ITALIC,16);
		this.Name = Name;
		this.Gender = Gender;
		this.DOB = DOB;
		this.Email = Email;
		this.PhoneNo = PhoneNo;
		this.District=District;
		this.skill =skill;
		this.field = field;
		this.experience = experience;
		this.education = education;

		l1 = new JLabel(this.Name,SwingConstants.CENTER);
		l2 = new JLabel(this.Gender,SwingConstants.CENTER);
		l3 = new JLabel(this.DOB,SwingConstants.CENTER);
		l4 = new JLabel("FIELD OF SPECIALIZATION",SwingConstants.CENTER);
		l4.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		l5 = new JLabel(this.District,SwingConstants.CENTER);
		l6 = new JLabel(this.Email,SwingConstants.CENTER);
		l7 = new JLabel("SKILLS/INTERESTS",SwingConstants.CENTER);
		l7.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		l8 = new JLabel(this.PhoneNo,SwingConstants.CENTER);
		l9 = new JLabel("EDUCATIONAL QUALIFICATION",SwingConstants.CENTER);
		l9.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		l10 = new JLabel("WORK EXPERIENCE",SwingConstants.CENTER);
		l10.setAlignmentX(JLabel.CENTER_ALIGNMENT);

		x1=new JButton("EXIT");
		x2=new JButton("JOB SEARCHER");
		x3=new JButton("DOWNLOAD RESUME");
		x1.setPreferredSize(new Dimension(200,30));
		x2.setPreferredSize(new Dimension(200,30));
		x3.setPreferredSize(new Dimension(200,30));

		x1.setFont(new Font("Montserrat", Font.BOLD, 14));
		x1.setBackground(Color.BLACK);
		x1.setForeground(Color.WHITE);
		x1.setFocusPainted(false);

		x2.setFont(new Font("Montserrat", Font.BOLD, 14));
		x2.setBackground(Color.BLACK);
		x2.setForeground(Color.WHITE);
		x2.setFocusPainted(false);

		x3.setFont(new Font("Montserrat", Font.BOLD, 14));
		x3.setBackground(Color.BLACK);
		x3.setForeground(Color.WHITE);
		x3.setFocusPainted(false);

		l14 = new JLabel(this.experience,SwingConstants.CENTER);
		l14.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		l18 = new JLabel(this.skill,SwingConstants.CENTER);
		l18.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		l19 = new JLabel(this.field,SwingConstants.CENTER);
		l19.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		l110 = new JLabel(this.education,SwingConstants.CENTER);
		l110.setAlignmentX(JLabel.CENTER_ALIGNMENT);

		l1.setFont(f0);
		l2.setFont(f1);
		l3.setFont(f1);
		l4.setFont(f);
		l5.setFont(f1);
		l6.setFont(f1);
		l7.setFont(f);
		l8.setFont(f);
		l9.setFont(f);
		l10.setFont(f);
		l14.setFont(f3);
		l18.setFont(f3);
		l19.setFont(f3);
		l110.setFont(f3);


		p1a.add(l1,BorderLayout.CENTER);
		p1a.add(l2,BorderLayout.CENTER);
		p1a.add(l3,BorderLayout.CENTER);
		p1c.add(l6,BorderLayout.CENTER);
		p1c.add(l8,BorderLayout.CENTER);
		p1c.add(l5,BorderLayout.CENTER);


		p2a.add(l4,BorderLayout.CENTER);
		p2a.add(l19,BorderLayout.CENTER);

		p2b.add(l9,BorderLayout.CENTER);
		p2b.add(l110,BorderLayout.CENTER);

		p2c.add(l10,BorderLayout.CENTER);
		p2c.add(l14,BorderLayout.CENTER);

		p2d.add(l7,BorderLayout.CENTER);
		p2d.add(l18,BorderLayout.CENTER);

		p1.add(p1a);
		p1.add(p1b);
		p1.add(p1c);

		p2.add(pfos);
		p2.add(p2a);
		p2.add(p2b);
		p2.add(p2c);
		p2.add(p2d);

		c.gridx=0;
		c.gridy=0;
		pt.add(p1,c);

		c.gridx=1;
		c.gridy=0;
		pt.add(p2,c);

		bx1.add(x1,BorderLayout.CENTER);
		bx2.add(x2,BorderLayout.CENTER);
		bx3.add(x3,BorderLayout.CENTER);

		btn.add(bx1);
		btn.add(bx3);
		btn.add(bx2);

		p.add(p0);

		p.add(pt);
		p.add(btn);

		add(p,BorderLayout.CENTER);


		//EXIT BUTTON
		x1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				setVisible(false);
				System.exit(0);
			}
		});


		//JOB SEARCHER
		x2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				setVisible(false);
				new Select(username);
			}
		});


		//DOWNLOAD RESUME BUTTON
		x3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				//DOWNLOAD IMAGE

				BufferedImage bufImage = new BufferedImage(pt.getSize().width, pt.getSize().height,BufferedImage.TYPE_INT_RGB);
				pt.paint(bufImage.createGraphics());
				File imageFile = new File("Resume2.jpeg");

				try
				{
					imageFile.createNewFile();
					ImageIO.write(bufImage, "jpeg", imageFile);
				}
				catch(Exception ae)
				{
					System.out.println(ae);
				}

				JOptionPane.showMessageDialog(null,"Resume Downloaded!");

			}
		});

		setSize(1300,700);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}



class Template3 extends JFrame 							//TEMPLATE 3
{
		public String Name,Gender,DOB,Email,PhoneNo,District,skill,field,experience,education;
		public JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l14,l18,l19,l110;
		public Font f,f1,f2,f3,f0;
		public JButton x1,x2,x3;

		public Template3(String username,String Name,String Gender,String DOB,String Email,String PhoneNo,String District,String skill,String field,String experience,String education) 
		{

			GridBagConstraints c = new GridBagConstraints();

			JPanel p=new JPanel();
			p.setPreferredSize(new Dimension(900,700));
			p.setOpaque(true);

			JPanel bx1=new JPanel();
			bx1.setPreferredSize(new Dimension(300,110));
			bx1.setLayout(new FlowLayout());
			bx1.setOpaque(true);

			JPanel bx2=new JPanel();
			bx2.setPreferredSize(new Dimension(300,110));
			bx2.setLayout(new FlowLayout());
			bx2.setOpaque(true);

			JPanel bx3=new JPanel();
			bx3.setPreferredSize(new Dimension(300,110));
			bx3.setLayout(new FlowLayout());
			bx3.setOpaque(true);

			JPanel p0=new JPanel();
			p0.setPreferredSize(new Dimension(900,20));
			p0.setOpaque(true);

			JPanel pt=new JPanel();
			pt.setPreferredSize(new Dimension(900,570));
			pt.setLayout(new GridBagLayout());
			pt.setOpaque(true);

			JPanel btn=new JPanel();
			btn.setPreferredSize(new Dimension(900,110));
			btn.setLayout(new GridLayout(1,3));
			btn.setOpaque(true);

			JPanel pb1=new JPanel();
			pb1.setPreferredSize(new Dimension(580,20));

			JPanel pc1=new JPanel();
			pc1.setPreferredSize(new Dimension(580,20));
			pc1.setOpaque(true);
			pc1.setBackground(new Color(131,255,234));

			JPanel p1=new JPanel();
			p1.setPreferredSize(new Dimension(320,570));
			p1.setLayout(new BoxLayout(p1, BoxLayout.PAGE_AXIS));
			p1.setOpaque(true);
			p1.setBorder(BorderFactory.createMatteBorder(1, 1, 1, 1, Color.BLACK));

			JPanel p2=new JPanel();
			p2.setPreferredSize(new Dimension(580,570));
			p2.setLayout(new BoxLayout(p2, BoxLayout.PAGE_AXIS));
			p2.setOpaque(true);
			p2.setBorder(BorderFactory.createMatteBorder(1, 0, 1, 1, Color.BLACK));

			JPanel p1a=new JPanel();
			p1a.setBackground(new Color(0,236,197));
			p1a.setPreferredSize(new Dimension(320,100));
			p1a.setLayout(new GridLayout(1,1));
			p1a.setOpaque(true);
			p1a.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));

			JPanel p1b=new JPanel();
			p1b.setPreferredSize(new Dimension(320,235));
			p1b.setLayout(new GridLayout(5,1));
			p1b.setOpaque(true);

			JPanel p1c=new JPanel();
			p1c.setPreferredSize(new Dimension(320,235));
			p1c.setBackground(new Color(0,236,197));
			p1c.setLayout(new GridBagLayout());
			p1c.setBorder(BorderFactory.createMatteBorder(1, 0, 0, 0, Color.BLACK));
			p1c.setOpaque(true);


			JPanel p2a=new JPanel();
			p2a.setPreferredSize(new Dimension(580,100));
			p2a.setBackground(new Color(131,255,234));
			p2a.setLayout(new GridBagLayout());
			p2a.setOpaque(true);
			p2a.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 0, Color.BLACK));

		JPanel p2b=new JPanel();
		p2b.setPreferredSize(new Dimension(580,235));
		p2b.setOpaque(true);
		p2b.setLayout(new GridBagLayout());

		JPanel p2c=new JPanel();
		p2c.setPreferredSize(new Dimension(580,235));
		p2c.setBackground(new Color(131,255,234));
		p2c.setLayout(new GridBagLayout());
		p2c.setOpaque(true);
		p2c.setBorder(BorderFactory.createMatteBorder(1, 0, 0, 0, Color.BLACK));

		f0= new Font("Georgia", Font.BOLD,22);
		f2 = new Font("Georgia",Font.ITALIC,15);
		f1 = new Font("Georgia", Font.BOLD, 15);
		f = new Font("Georgia", Font.BOLD,16);
		f3 = new Font("Georgia",Font.ITALIC,16);
		this.Name = Name;
		this.Gender = Gender;
		this.DOB = DOB;
		this.Email = Email;
		this.PhoneNo = PhoneNo;
		this.District=District;
		this.skill =skill;
		this.field = field;
		this.experience = experience;
		this.education = education;

		l1 = new JLabel(this.Name,SwingConstants.CENTER);
		l2 = new JLabel(this.Gender,SwingConstants.CENTER);
		l3 = new JLabel(this.DOB,SwingConstants.CENTER);
		l4 = new JLabel("FIELD OF SPECIALIZATION",SwingConstants.CENTER);
		l5 = new JLabel(this.District,SwingConstants.CENTER);
		l6 = new JLabel(this.Email,SwingConstants.CENTER);
		l7 = new JLabel("SKILLS/INTERESTS",SwingConstants.CENTER);
		l7.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		l8 = new JLabel(this.PhoneNo,SwingConstants.CENTER);
		l9 = new JLabel("EDUCATIONAL QUALIFICATION",SwingConstants.CENTER);
		l9.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		l10 = new JLabel("WORK EXPERIENCE",SwingConstants.CENTER);
		l10.setAlignmentX(JLabel.CENTER_ALIGNMENT);

		x1=new JButton("EXIT");
		x2=new JButton("JOB SEARCHER");
		x3=new JButton("DOWNLOAD RESUME");
		x1.setPreferredSize(new Dimension(200,30));
		x2.setPreferredSize(new Dimension(200,30));
		x3.setPreferredSize(new Dimension(200,30));

		x1.setFont(new Font("Montserrat", Font.BOLD, 14));
		x1.setBackground(Color.BLACK);
		x1.setForeground(Color.WHITE);
		x1.setFocusPainted(false);

		x2.setFont(new Font("Montserrat", Font.BOLD, 14));
		x2.setBackground(Color.BLACK);
		x2.setForeground(Color.WHITE);
		x2.setFocusPainted(false);

		x3.setFont(new Font("Montserrat", Font.BOLD, 14));
		x3.setBackground(Color.BLACK);
		x3.setForeground(Color.WHITE);
		x3.setFocusPainted(false);

		l14 = new JLabel(this.experience,SwingConstants.CENTER);
		l14.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		l18 = new JLabel(this.skill,SwingConstants.CENTER);
		l14.setAlignmentX(JLabel.CENTER_ALIGNMENT);
		l19 = new JLabel(this.field,SwingConstants.CENTER);
		l110 = new JLabel(this.education,SwingConstants.CENTER);
		l110.setAlignmentX(JLabel.CENTER_ALIGNMENT);

		l1.setFont(f0);
		l2.setFont(f1);
		l3.setFont(f1);
		l4.setFont(f);
		l5.setFont(f1);
		l6.setFont(f1);
		l7.setFont(f);
		l8.setFont(f);
		l9.setFont(f);
		l10.setFont(f);
		l14.setFont(f3);
		l18.setFont(f3);
		l19.setFont(f3);
		l110.setFont(f3);


		p1a.add(l1,BorderLayout.CENTER);
	
		p1b.add(l2,BorderLayout.CENTER);
		p1b.add(l3,BorderLayout.CENTER);
		p1b.add(l8,BorderLayout.CENTER);
		p1b.add(l5,BorderLayout.CENTER);
		p1b.add(l6,BorderLayout.CENTER);

		c.gridx=0;
		c.gridy=0;
		p1c.add(l7,c);
		c.gridx=0;
		c.gridy=1;
		p1c.add(l18,c);

		c.gridx=0;
		c.gridy=0;
		p2a.add(l4,c);
		c.gridx=0;
		c.gridy=1;
		p2a.add(l19,c);
	
		c.gridx=0;
		c.gridy=0;
		p2b.add(l9,c);
		c.gridx=0;
		c.gridy=1;
		p2b.add(l110,c);

		c.gridx=0;
		c.gridy=0;
		p2c.add(l10,c);
		c.gridx=0;
		c.gridy=1;
		p2c.add(l14,c);
		

		p1.add(p1a);
		p1.add(p1b);
		p1.add(p1c);


		p2.add(p2a);
		p2.add(p2b);
		p2.add(p2c);

		c.gridx=0;
		c.gridy=0;
		pt.add(p1,c);

		c.gridx=1;
		c.gridy=0;
		pt.add(p2,c);

		bx1.add(x1,BorderLayout.CENTER);
		bx2.add(x2,BorderLayout.CENTER);
		bx3.add(x3,BorderLayout.CENTER);

		btn.add(bx1);
		btn.add(bx3);
		btn.add(bx2);

		p.add(p0);

		p.add(pt);
		p.add(btn);

		add(p,BorderLayout.CENTER);


		//EXIT BUTTON
		x1.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				setVisible(false);
				System.exit(0);
			}
		});


		//JOB SEARCHER BUTTON
		x2.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				setVisible(false);
				new Select(username);
			}
		});


		//DOWNLOAD RESUME BUTTON
		x3.addActionListener(new ActionListener()
		{
			public void actionPerformed(ActionEvent e)
			{
				//DOWNLOAD IMAGE	
		
				BufferedImage bufImage = new BufferedImage(pt.getSize().width, pt.getSize().height,BufferedImage.TYPE_INT_RGB);
				pt.paint(bufImage.createGraphics());
				File imageFile = new File("Resume3.jpeg");

				try
				{
					imageFile.createNewFile();
					ImageIO.write(bufImage, "jpeg", imageFile);
				}
				catch(Exception ae)
				{
					System.out.println(ae);
				}
				JOptionPane.showMessageDialog(null,"Resume Downloaded!");
			}
		});

		setSize(1300,700);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}



class Select								//JOB SEARCHER PAGE
{
  JFrame jfrm;
  Select(String username)
  {
      jfrm = new JFrame("Job Search");
      jfrm.setSize(1300,700);
      jfrm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


      //background panel
      JLabel jlab0 = new JLabel();
      jlab0.setSize(1300,700);
      jlab0.setBackground(new Color(87,83,83));
      jlab0.setOpaque(true);

      //heading panel
      JPanel jpan1 = new JPanel();
      jpan1.setBackground(Color.BLACK);

      //heading
      JLabel jlab1 = new JLabel("Job Searcher",JLabel.CENTER);
      jlab1.setForeground(Color.WHITE);
      jlab1.setFont(new Font("Montserrat", Font.BOLD, 36));

      //drop down menu
      String[] jobs = {"--nil--","CSE", "Civil Engg", "ECE", "EEE", "Mechanical Engg", "Chemical Engg"};
      JComboBox<String> jcbb = new JComboBox<String>(jobs);
      jcbb.setBounds(750,75,350,20);

      JLabel jlab2 = new JLabel("Choose your area of specilaization ");
      jlab2.setBounds(250,75,450,20);
      jlab2.setForeground(Color.WHITE);
      jlab2.setFont(new Font("Montserrat",Font.PLAIN, 18));

      //content panel
      JPanel jpan2 = new JPanel();
      jpan2.setBackground(new Color(87,83,83));

      jpan2.setBounds(200,110,1100-150,700-200);


      //Content
      JPanel jpan3 = new JPanel();
      JPanel jpan4 = new JPanel();
      JPanel jpan5 = new JPanel();

      JLabel[][][] jlab = new JLabel[3][5][2];


      String s[] = {"  Job  ", "  Salary  ", "  Company Name  ", "  Address  ", "  Contact info  "};

      //JLabel initialisation
      for(int k=0;k<3;k++)
      {
        for(int i=0;i<5;i++)
        {
          for(int j=0;j<2;j++)
          {
            jlab[k][i][j] = new JLabel();
            jlab[k][i][j].setBackground(Color.BLACK);
            jlab[k][i][j].setForeground(Color.WHITE);
            jlab[k][i][j].setOpaque(true);
          }
          jlab[k][i][0].setText(s[i]);
        }
      }


      //Drop down action
      jcbb.addActionListener(new ActionListener(){
      public void actionPerformed(ActionEvent e)
      {
          String item = (String) jcbb.getSelectedItem();
          String query="SELECT * FROM jobs WHERE specialisation='" + item + "' ORDER BY salary DESC";

          String[] Job_Name = new String[3];
          String[] Salary = new String[3];
          String[] Company_name = new String[3];
          String[] place = new String[3];
          String[] Contact_info = new String[3];
          
          try							//JDBC CONNECTION
          {
          Class.forName("com.mysql.cj.jdbc.Driver");  
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/jobseeker","root","password");
          Statement stmt=con.createStatement(); 
          ResultSet rs=stmt.executeQuery(query); 

          rs.next();
 
          Job_Name[0] = rs.getString("job");
          Salary[0] = String.valueOf(rs.getInt("salary"));
          Company_name[0] = rs.getString("company");
          place[0] = rs.getString("place");
          Contact_info[0] = String.valueOf(rs.getInt("contact_info"));
          rs.next();

          Job_Name[1] = rs.getString("job");
          Salary[1] =  String.valueOf(rs.getInt("salary"));
          Company_name[1] = rs.getString("company");
          place[1] = rs.getString("place");
          Contact_info[1] = String.valueOf(rs.getInt("contact_info"));

          rs.next();
          Job_Name[2] = rs.getString("job");
          Salary[2] =String.valueOf(rs.getInt("salary"));
          Company_name[2] =rs.getString("company");
          place[2] = rs.getString("place");
          Contact_info[2] =String.valueOf(rs.getInt("contact_info"));

          con.close();
          }
          catch(Exception ex)
          {
             System.out.println(ex);
          }

          for(int i=0;i<3;i++)
          {
              jlab[i][0][1].setText(Job_Name[i]);
              jlab[i][1][1].setText(Salary[i]);
              jlab[i][2][1].setText(Company_name[i]);
              jlab[i][3][1].setText(place[i]);
              jlab[i][4][1].setText(Contact_info[i]);
          }
      }
    });

      jpan2.setLayout(new GridLayout(3,2,10,25));     //table holding panel

      jpan3.setLayout(new GridLayout(5,2,5,2));       //table job 1
      jpan4.setLayout(new GridLayout(5,2,5,2));       //table job 2
      jpan5.setLayout(new GridLayout(5,2,5,2));       //table job 3

      for(int i=0;i<5;i++)
      {
        jpan3.add(jlab[0][i][0]); jpan3.add(jlab[0][i][1]);
      }

      for(int i=0;i<5;i++)
      {
        jpan4.add(jlab[1][i][0]); jpan4.add(jlab[1][i][1]);
      }

      for(int i=0;i<5;i++)
      {
        jpan5.add(jlab[2][i][0]); jpan5.add(jlab[2][i][1]);
      }

      JButton jbt2 = new JButton("EXIT");            //LOG OUT button
      jbt2.setPreferredSize(new Dimension(150,40));
      jbt2.setFont(new Font("Montserrat",Font.BOLD, 16));
      jbt2.setBackground(Color.BLACK);
      jbt2.setForeground(Color.WHITE);


      //EXIT BUTTON
      jbt2.addActionListener(new ActionListener()
      {
        public void actionPerformed(ActionEvent e)
        {
          jfrm.setVisible(false);
          System.exit(0);
        }
      });

      JButton jbt1 = new JButton("HOME");
      jbt1.setPreferredSize(new Dimension(150,40));
      jbt1.setFont(new Font("Montserrat",Font.BOLD, 16));
      jbt1.setBackground(Color.BLACK);
      jbt1.setForeground(Color.WHITE);

      //HOME BUTTON
      jbt1.addActionListener(new ActionListener()
      {
        public void actionPerformed(ActionEvent e)
        {
          jfrm.setVisible(false);
          new ResumeJob(username);				//SHIFTS TO WELCOME PAGE
        }
      });

      JLabel jlab_null = new JLabel("  ");
      jlab_null.setPreferredSize(new Dimension(400,40));

      JPanel jpan_bottom = new JPanel();
      jpan_bottom.add(jbt1,BorderLayout.CENTER);
      jpan_bottom.add(jlab_null,BorderLayout.CENTER);
      jpan_bottom.add(jbt2,BorderLayout.CENTER);
      jpan_bottom.setBackground(new Color(87,83,83));

      jpan2.add(jpan3);                            //Job 1
      jpan2.add(jpan4);                           //job 2
      jpan2.add(jpan5);                          //job 3


      jpan1.add(jlab1);                           //heading

      jfrm.add(jlab2);                            //drop down label
      jfrm.add(jcbb);                             //drop down
      jfrm.add(jpan1,BorderLayout.NORTH);         //drop down
      jfrm.add(jpan2,BorderLayout.CENTER);        //table
      jfrm.add(jlab0);                            //background

      jfrm.add(jpan_bottom,BorderLayout.SOUTH);

      jfrm.setVisible(true);
  }
}

public class ResumeBuilder
{
	public static void main(String args[])
	{
		new RBLogin();
	}
}

