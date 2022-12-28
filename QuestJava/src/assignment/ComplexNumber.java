package assignment;

public class ComplexNumber 
{
	float real ;
	float imaginary; 
	
	public ComplexNumber(float real, float imaginary) 
	{
		this.real=real;
		this.imaginary=imaginary;
	}
	
	public ComplexNumber() 
	{

	}

	public ComplexNumber addComplexNumber(ComplexNumber obj2,ComplexNumber obj3) 
	{
		ComplexNumber result = new ComplexNumber();
		result.real = real + obj3.real+ obj2 .real;
		result.imaginary = this.imaginary + obj2.imaginary+ obj3.imaginary;
		
		return result;
	}
	

	public float getReal() 
	{
		return real;
	}

	public float getImaginary() 
	{
		return imaginary;
	}

	

}
