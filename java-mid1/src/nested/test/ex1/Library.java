package nested.test.ex1;

public class Library {

	private Book[] books;
	private int bookCnt;

	public Library(int cnt) {
		books = new Book[cnt];
		bookCnt = 0;
	}

	public void addBook(String title, String author) {
		/*
		//검증 로직이 많으면, 해당로직을 다 처리하고
		if(bookCnt > books.length){
			System.out.println("도서관 저장 공간이 부족합니다.");
			return;
		}
		//정상 로직 처리
		books[bookCnt++] = new Book(title, author);
		*/
		if (bookCnt < books.length) {
			books[bookCnt++] = new Book(title, author);
		} else {
			System.out.println("도서관 저장 공간이 부족합니다.");
		}
	}

	public void showBooks(){
		System.out.println("== 책 목록 출력 ==");
		for (Book book : books) {
			System.out.println("도서 제목: " + book.title + ", 저자: " + book.author);
		}
	}

	private static class Book {
		private String title;
		private String author;

		public Book(String title, String author) {
			this.title = title;
			this.author = author;
		}
	}

}
