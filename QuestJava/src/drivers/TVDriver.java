package drivers;
import oops_inheritance.LEDTv;
import oops_inheritance.HDTv;

public class TVDriver 
{

	public static void main(String[] args) 
	{
		
		LEDTv ledtv = new LEDTv("LG",48);
		ledtv.displayTV();
		
		HDTv hdtv = new HDTv("Onida",32);
		hdtv.displayTV();
		
		
	}

}
