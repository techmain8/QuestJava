package generics;

public class Repositry<Entities> 
{
	private Entities array[];
	
	public Repositry(Entities array[])
	{
		this.array = array;
	}
	
	public Entities[] getAll()
	{
		return this.array;
	}
	
	public void add(int index,Entities item)
	{
		this.array[index]=item;
	}
	
}
