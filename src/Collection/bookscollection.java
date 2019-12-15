package Collection;

public class bookscollection {
	
		public String title;
		public String author; 
		public String genre;
		
		public bookscollection (String title, String author, String genre) {
			this.title = title;
			this.author = author;
			this.genre = genre;
			
		}
		
		public String toString()   { 
	        return title + " " + author + " "; 
		}
		
	}
		