package baekjoon;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student studentLee = new Student();
		
		studentLee.studentName = "jungjihoon";
		studentLee.address = "Seoul";
		
		studentLee.showStudentInfo();
		
		int n1 = 10;
		int n2 = 20;
		
		int total = addNum(n1, n2);
		
		sayHello("æ»≥Á«œººø‰");
		
		int num = calcSum();
		
		System.out.println(total);
		System.out.println(num);
		
		Student studentJung = new Student();
		
		studentJung.studentName = "¡§¡ˆ»∆";
		studentJung.address = "Incheon";
		
		studentJung.showStudentInfo();
		
		System.out.println(studentLee);
		System.out.println(studentJung);
		
	}

	public static int addNum(int num1, int num2) {
		int result;
		
		result = num1 + num2;
		return result;
	}
	
	public static void sayHello(String greeting) {
		System.out.println(greeting);
	}
	
	public static int calcSum() {
		int sum = 0;
		
		for (int i = 0; i <= 100; i++) {
			sum += i;
		}
		
		return sum;
	}
}
