import java.util.*;
class Person{
	String name;
	String dob;
	Person(){
		this.name="Empty";
		this.dob="Empty";
	}
	Person(String name,String dob){
		this.name=name;
		this.dob=dob;
	}
	void setName(String n){
		name=n;
	}
	void setDOB(String d){
		dob=d;
	}
	String getName(){
		return name;
	}
	String getDOB(){
		return dob;
	}
	void hello(){
		System.out.println("Hello");
	}
	void hello(String n){
		System.out.println("Hello "+n);
	}
	void who(){
		System.out.println(" Parent ");
	}
}
class Student extends Person{
	String roll;
	Student(){
		super();
		this.roll="";
	}
	Student(String n,String d,String r){
		super(n,d);
		this.roll=r;
	}
	String  getRoll(){
		return roll;
	}
	void who(){
		super.who();
		System.out.println(" Child ");
	}
}
class InheritedStudent{
	public static void main(String args[]){
		String n,d,r;
		Student[] s=new Student[3];
		Student s1=new Student("Pramit","24/12/2005","AIML/24/016");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++){
			System.out.println("Enter name: ");
			n=sc.nextLine();
			System.out.println("Enter Date of birth: ");
			d=sc.nextLine();
			System.out.println("Enter the college roll number: ");
			r=sc.nextLine();
			s[i]=new Student(n,d,r);
		}
		for(int i=0;i<3;i++)
			System.out.println("Name: "+s[i].name+" DOB: "+s[i].dob+" Collge Roll: "+s[i].roll);
		
		//s1.who();

	}
}
