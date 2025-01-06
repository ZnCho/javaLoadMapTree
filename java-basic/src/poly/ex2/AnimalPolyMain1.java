package poly.ex2;

public class AnimalPolyMain1 {
	public static void main(String[] args) {
		Dog dog = new Dog();
		Cat cat = new Cat();
		Caw caw = new Caw();

		soundAnimal(dog);
		soundAnimal(cat);
		soundAnimal(caw);
	}

	//다형적 참조 > animal이 매개변수인 dog, cat, caw의 인스턴스를 참조
	private static void soundAnimal(Animal animal){ //부모는 자식을 담을 수 있다. Animal animal = dog(cat, caw)가 된다.
		System.out.println("동물 소리 테스트 시작");
		animal.sound(); //하위 클래스에서 오버라이딩 되어있어서, 오버라이딩한 메서드가 우선권을 가짐.
		System.out.println("동물 소리 테스트 종료");
	}
}
