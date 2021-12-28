public class Calculator
{
public static void main(String[] args)
{
Calculator calc = new Calculator();
int output = calc.add();
System.out.println(output);
}
public int add()
{
	int no1=10, no2=20;
	int result = no1+no2;
	//System.out.println(result);
	return result;
}
}