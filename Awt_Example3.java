/*this is a simple java program by which you can find ip address of any internet website*/

import java.awt.*;
import java.awt.event.*;
public class Awt_Example3 extends Frame implements ActionListener{
	public Label l1,l2;
	public TextField t;
	Awt_Example3()
	{
		l1=new Label("Enter the name of your website :");
		l1.setBounds(20, 50, 190, 35);
		add(l1);
		t=new TextField();
		t.setBounds(20,90,200,60);
		add(t);
		Button b=new Button("Find IP");
		b.setBounds(50, 240, 70, 35);
		b.addActionListener(this);
		add(b);
		l2=new Label();
		l2.setBounds(20, 200, 280, 35);
		add(l2);
		
				
	}
	 public void actionPerformed(ActionEvent e) {  
	        try{  
	        String website=t.getText();  
	        String ip=java.net.InetAddress.getByName(website).getHostAddress();  
	        l2.setText("IP of "+website+" is: "+ip);  
	        }catch(Exception ex){System.out.println(ex);}  
	    }  
	public static void main(String ARRAY[])
	{
		Frame f=new Awt_Example3();
		f.setSize(260, 300);
		f.setLayout(null);
		f.setVisible(true);
	}
}
