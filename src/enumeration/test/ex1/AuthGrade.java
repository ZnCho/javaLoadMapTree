package enumeration.test.ex1;

public enum AuthGrade {
	GUEST(1, "손님"), LOGIN(2,"로그인 회원"), ADMIN(3, "관리자");

	private final int level;
	private final String desciption;

	AuthGrade(int level, String desciption) {
		this.level = level;
		this.desciption = desciption;
	}

	public int getLevel() {
		return level;
	}

	public String getDesciption() {
		return desciption;
	}
}
