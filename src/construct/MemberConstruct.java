package construct;

public class MemberConstruct {
	String name;
	int age;
	int grade;

	//추가
	MemberConstruct(String name, int age){
//		System.out.println("test");
		this(name,age,50); //변경 - 생성자 안에서 다른 생성자 호출 > 생성자에서, 첫줄에만 사용 가능
	}
	MemberConstruct(String name, int age, int grade) {
		System.out.println("생성자 호출 name= " + name + ", age= " + age + ", grade= " + grade);
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
}
