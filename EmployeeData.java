package employeeData;

public class EmployeeData {
	
	private String name, designation;
	private int basicSalary;

	

	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getDesignation() {
		return designation;
	}


	public void setDesignation(String designation) {
		this.designation = designation;
	}


	public int getBasicSalary() {
		return basicSalary;
	}


	public void setBasicSalary(int basicSalary) {
		this.basicSalary = basicSalary;
	}


	


	

	@Override
	public String toString()
	{
		return "EmployeeData [Name => " + name +",Designation => " + designation +", BasicSalary => " +basicSalary+"]";
		
	}
	public static void main(String[] args)
	{
		EmployeeData emp = new EmployeeData();
		emp.setName("Rahul");
		emp.setDesignation("Manager");
		emp.setBasicSalary(50000);
	
		 System.out.println(emp);
	}

}
