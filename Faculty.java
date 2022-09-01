package test;

public class Faculty {
   public  String name;
    private int basic;
    public int salary;
    
    public Faculty(String n, int b) {
    	this.name=n;
    	this.basic=b;
    }
    
	public int getSalary() {
		salary =basic;
		return salary;
	}

	public String getDetails(){
		return name +" "+getSalary();
	}
}

	  class AssistantProfessor extends Faculty{
		int DA;
		public AssistantProfessor(String n, int b, int DA){
	    super(n,b);	
		this.DA= DA;
	}
		public int getSalary() {
			return super.getSalary()+((super.getSalary()*DA/100));
		}
		public String getDetails() {
		 return"Professor: "+name+""+this.getSalary();	
		}
	}
    class AssociateProfessor extends AssistantProfessor{
		public int medAllowance;
		public AssociateProfessor(String n,int b,int DA, int medAllowance) {
			super(n,b,DA);
			this.medAllowance=medAllowance;
		}
		public int getSalary() {
			return super.getSalary()+medAllowance;
		
		}
		public String getDetails() {
			return "AssociateProfessor" +name+ " "+getSalary();
		}
	}
   class Professor  extends AssociateProfessor  {
   int OtherAllowance ;
	public Professor(String name, int b, int DA, int medAllowance, int otherAllowance) { 
		super(name, b, DA, medAllowance);
		this.OtherAllowance = otherAllowance;
	}
	public int getsalary()
	{
		return super.getSalary() + ((OtherAllowance*super.getSalary())/100);
	}
	public String getdetails()
	{
		return "OtherAllowance"+ " " + name+ " " + getsalary();
				
	}
   

	public static void main(String[] args) {
		Professor p = new Professor("ALTAF",20000,5000,2000,3000);
		System.out.println(p.getdetails());
		AssociateProfessor a1 = new AssociateProfessor("SAIF",10000,2500,100);
		System.out.println(a1.getDetails());
		AssistantProfessor a =  new AssistantProfessor("PANDEY",5000,2500);
		System.out.println(a.getDetails());
		
		

	}

}

  

