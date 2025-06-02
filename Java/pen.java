class Pen
{
	String color;
	String name;
}
class penApp
{
	public static void main(String[] argStrings)
	{
		Pen p=new Pen();
		p.name="elkos";
		p.color="blue";
		System.out.println("This pen name is:" + p.name);
		System.out.println("This pen color is:"+p.color);
	}
}