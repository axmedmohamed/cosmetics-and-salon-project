import java.awt.event.ActionEvent;import
java.awt.event.ActionListener;
import java.sql.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import javax.swing.*;




public class example {

	public example() {}
		// TODO Auto-generated constructor stub

        public static int days=0;


	public static void main(String[] args) {


		login();
	}
		public static Connection connect()
		{
		Connection con;
		try {
		        Class.forName("com.mysql.cj.jdbc.Driver");
		        //System.out.println("Loaded driver");
		        Connection con1 = DriverManager.getConnection("jdbc:mysql://localhost/mysql?user=root&password=edureka");
		        //System.out.println("Connected to MySQL");
		        return con1;
		 }
		 catch (Exception ex) {
		        ex.printStackTrace();
		        return  con;
		 }

		{

		return  con;}


		}












		public static void login() {

		    JFrame f=new JFrame("Login");//creating instance of JFrame

		 JLabel l1,l2;


		  l1=new JLabel("Username");
		 l1.setBounds(30,15, 100,30);

		  l2=new JLabel("Password");  //Create label Password
		    l2.setBounds(30,50, 100,30);

		JTextField F_user = new JTextField();
		  F_user.setBounds(110, 15, 200, 30);

		 JPasswordField F_pass=new JPasswordField(); //Create text field for password
		    F_pass.setBounds(110, 50, 200, 30);

		  JButton login_but=new JButton("Login");//creating instance of JButton for Login Button
		 login_but.setBounds(130,90,80,25);//Dimensions for button
		 login_but.addActionListener(new ActionListener() {  //Perform action

		 public void actionPerformed(ActionEvent e){

		 String username = F_user.getText();
		 String password = F_pass.getText();
		if(username.equals(""))
		        {
		 JOptionPane.showMessageDialog("Please enter username");
		        }
		  else if(password.equals(""))
		        {
		JOptionPane.showMessageDialog(,"Please enter password");
		        }
		else { the user; exists already;
		 //System.out.println("Login connect");
		  Connection connection=connect();  //Connect to the database
		            try
		            {
		Statement stmt = connection.createStatement();
		stmt.executeUpdate("USE LIBRARY"); //Use the database with the name "Library"
		String st = ("SELECT * FROM USERS WHERE USERNAME='"+username+"' AND PASSWORD='"+password+"'");
		ResultSet rs = stmt.executeQuery(st); //Execute query
		if(rs.next()==false) { //Move pointer below
		System.out.print("No user");
		JOptionPane.showMessageDialog(,"Wrong Username/Password!");
		 f.dispose();rs.beforeFirst();  //Move the pointer a
		 while(rs.next())
		                {
		String admin = rs.getString("ADMIN");

		 String UID = rs.getString("UID");
		if(admin.equals("1")) {
		admin_menu();
		  } else{user_menu(UID);
		                  }
		              }





		    f.add(F_pass);
		    f.add(login_but);
		    f.add(F_user);
		    f.add(l1);
		    f.add(l2);

		    f.setSize(400,180);
		    f.setLayout();
		    f.setVisible(true);
		    f.setLocationRelativeTo();

		{
		}

		//public static Connection connect();
		{
		try {
		        Class.forName("com.mysql.cj.jdbc.Driver");
		        //System.out.println("Loaded driver");
		        Connection con = DriverManager.getConnection("jdbc:mysql://localhost/mysql?user=root&password=molid");
		        //System.out.println("Connected to MySQL");
		        return con;
		 }
		 catch (Exception ex) {
		        ex.printStackTrace();
		 }
		return ;
		}
		}







