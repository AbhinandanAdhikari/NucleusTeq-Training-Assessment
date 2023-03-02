package Student;

public class Student {
	int rollNumber;
	String name;
	String course;
	int marks1,marks2,marks3;
	
	public Student(int roll, String name, String course, int m1, int m2, int m3)
	{
		this.rollNumber = roll;
		this.name = name;
		this.course = course;
		this.marks1=m1;
		this.marks2=m2;
		this.marks3=m3;
	}
	public int calculateTotal()
	{
		return this.marks1+this.marks2+this.marks3;
	}
	public double calculateAverage()
	{
		return (this.marks1+this.marks2+this.marks3)/3;
	}
	public char calculateGrade()
	{
		if(this.calculateTotal()>=80)
		{
			return 'A';
		}
		else if(this.calculateTotal()>=60 && this.calculateTotal()<80)
		{
			return 'B';
		}
		return 'C';
	}
	public String toString()
	{
		return this.rollNumber+" "+this.name+" "+this.course+" "+this.marks1+" "+this.marks2+" "+this.marks3+" Total = "+this.calculateTotal()+" Average = "+this.calculateAverage()+" Grade = "+this.calculateGrade();
	}
	public void setRollNumber(int roll)
	{
		this.rollNumber = roll;
	}
	public int getRollNumber()
	{
		return this.rollNumber;
	}
	public void  setName(String name)
	{
		this.name = name;
	}
	public String getName()
	{
		return this.name;
	}
	public void setCourse(String course)
	{
		this.course=course;
	}
	public String getCourse()
	{
		return this.course;
	}
	public void setMarks1(int m1)
	{
		this.marks1 = m1;
	}
	public int getMarks1()
	{
		return this.marks1;
	}
	public void setMarks2(int m2)
	{
		this.marks2 = m2;
	}
	public int getMarks2()
	{
		return this.marks2;
	}
	public void setMarks3(int m3)
	{
		this.marks3 = m3;
	}
	public int getMarks3()
	{
		return this.marks3;
	}
}
