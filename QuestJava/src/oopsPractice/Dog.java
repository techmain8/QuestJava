package oopsPractice;

public class Dog {


		private String dogname;
		private int dogage;
		private String dogbreed;
		private String dogcolour;
		
		public void setDogname(String name)
		{
			dogname = name;
		}
		public void setDogage(int age)
		{
			dogage = age;
		}
		public void setDogbreed(String breed)
		{
			dogbreed = breed;
		}
		public void setDogcolour(String colour)
		{
			dogcolour = colour;
		}
		
		//getter methods
		
		public String getDogname()
		{
			return dogname;
		}
		public int getDogage()
		{
			return dogage;
		}
		public String getDogbreed()
		{
			return dogbreed;
		}
		public String getDogcolour()
		{
			return dogcolour;
		}
		
	}