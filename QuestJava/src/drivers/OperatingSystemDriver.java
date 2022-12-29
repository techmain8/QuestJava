package drivers;

import oops_inheritance.PersonalComputer;

public class OperatingSystemDriver 
{

	public static void main(String[] args) 
	{
		PersonalComputer pc = new PersonalComputer("dell",27000,"20in","Usb_port",true);
		pc.display();
		pc.display1();
		pc.display2();
		
	}

}
