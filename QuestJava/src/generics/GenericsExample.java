package generics;



public class GenericsExample<operation> 
{
	private operation value1,value2,sum;
	
	
	public operation getValue1() {
		return value1;
	}


	public void setValue1(operation value1) {
		this.value1 = value1;
	}


	public operation getValue2() {
		return value2;
	}


	public void setValue2(operation value2) {
		this.value2 = value2;
	}

	public void setSum(operation sum)
	{
		this.sum=sum;
	}
	
	public static void main(String[] args) 
	{
		GenericsExample<Integer> intobj = new GenericsExample<>();
		intobj.setValue1(20);
		intobj.setValue2(30);
		
		GenericsExample<Integer> intobj2 = new GenericsExample<>();
		intobj2.setValue1(20);
		intobj2.setValue2(35);
		

		GenericsExample<Students> studobj = new GenericsExample<Students>();
		
		Students student = new Students("Shreya", 20, 90.8f);
		
		studobj.setValue1(student);
		System.out.println(studobj.getValue1());
		
	}

}
