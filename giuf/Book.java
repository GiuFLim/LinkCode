package giuf;
import java.sql.Date;

import java.util.HashMap;
import java.util.Map;

public class Book {
		private
		String ISBN;
		String title;
		String author;
		Date pubDate;
		Double price;
		public Book(String ISBN,String title,String author,Date pubDate,Double price) {
			this.ISBN = ISBN;
			this.title = title;
			this.author = author;
			this.pubDate = pubDate;
			this.price = price;
		}
		public String getISBN() {
			return ISBN;
		}

		public void setISBN(String iSBN) {
			ISBN = iSBN;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getAuthor() {
			return author;
		}

		public void setAuthor(String author) {
			this.author = author;
		}

		public Date getPubDate() {
			return pubDate;
		}

		public void setPubDate(Date pubDate) {
			this.pubDate = pubDate;
		}

		public Double getPrice() {
			return price;
		}

		public void setPrice(Double price) {
			this.price = price;
		}



		public static void main(String[] args) {
			char c ;
			String code;
			Date d = new Date(1999,10,12);

			Map<String,Book> map = new HashMap<String,Book>();
			for(int i=1; i<=5; i++) {
				c = (char)(96+i);
				Book book = new Book("00011"+c,"soft"+c,"hehe"+c,d,78.0+i);
				if(i<5) {
					code="SA0"+i;
				} else {
					code = "SA"+i;
				}
				map.put(code,book);
			}	
			Book book = map.get("SA08");
			System.out.println(book.getTitle());
			System.out.println(book.getPubDate());
			System.out.println(book.getAuthor());
			System.out.println(book.getPrice());				
		}
}
