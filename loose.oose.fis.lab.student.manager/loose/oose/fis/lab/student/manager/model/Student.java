package loose.oose.fis.lab.student.manager.model;

public class Student {
   private String firstName;
   private String lastName;
   private int age;
   private double meanGrade;
public String getFirstName() {
	return firstName;
}
public void setFirstName(String firstName) {
	this.firstName = firstName;
}
public String getLastName() {
	return lastName;
}
public void setLastName(String lastName) {
	this.lastName = lastName;
}
public int getAge() {
	return age;
}
public void setAge(int age) {
	this.age = age;
}
public double getMeanGrade() {
	return meanGrade;
}
public void setMeanGrade(double meanGrade) {
	this.meanGrade = meanGrade;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + age;
	result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
	result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
	long temp;
	temp = Double.doubleToLongBits(meanGrade);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Student other = (Student) obj;
	if (age != other.age)
		return false;
	if (firstName == null) {
		if (other.firstName != null)
			return false;
	} else if (!firstName.equals(other.firstName))
		return false;
	if (lastName == null) {
		if (other.lastName != null)
			return false;
	} else if (!lastName.equals(other.lastName))
		return false;
	if (Double.doubleToLongBits(meanGrade) != Double.doubleToLongBits(other.meanGrade))
		return false;
	return true;
}
@Override
public String toString() {
	return "Student [firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", meanGrade=" + meanGrade
			+ "]";
}
}

