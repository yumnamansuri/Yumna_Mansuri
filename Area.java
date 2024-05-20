package employeeData;

public class Area {

	private int length,breadth;
	Area(int l,int b)
	{
		length=l;
		breadth=b;
	}
	
	public int setDim()
	{
		
		int result=length*breadth;
		return result;
	}

	public void getArea()
	{
		System.out.println("Area of Rectangle => " +setDim());
	}


	public static void main(String[] args) {
		Area x = new Area(10,20);
		x.getArea();

	}

}
