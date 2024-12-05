import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Joanne", "Rowling");
        Author author2 = new Author("Andrzej","Sapkowski");
        Book harryPotter = new Book("Harry Potter",author1,1997);
        Book theWitcher = new Book("The Witcher",author2,1986);

        Book harryPotter2 = new Book("Harry Potter",author1,1999);
        Author author3 = new Author("Andrzej","Sapkowski");

        System.out.println();
        System.out.println(harryPotter);
        System.out.println(harryPotter.equals(theWitcher));
        System.out.println(harryPotter.equals(harryPotter2));
        System.out.println(author2);
        System.out.println(author2.equals(author1));
        System.out.println(author3.equals(author2));
        System.out.println(author3.hashCode()+" "+author2.hashCode());
        System.out.println(harryPotter2.hashCode()+" "+harryPotter.hashCode());



    }
    public static class Author {
        private final String authorName;
        private final String authorSName;

        public Author(String authorName, String authorSName) {
            this.authorName = authorName;
            this.authorSName = authorSName;
        }

        public String getAuthorName() {
            return authorName;
        }

        public String getAuthorSName() {
            return authorSName;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Author author = (Author) o;
            return Objects.equals(authorName, author.authorName) && Objects.equals(authorSName, author.authorSName);
        }

        @Override
        public int hashCode() {
            return Objects.hash(authorName, authorSName);
        }

        @Override
        public String toString() {
            return "Имя автора: "+ authorName+" "+authorSName;
        }

    }

    public static class Book {
        private final String bookName;
        private final Author author;
        private int publishingYear;

        public Book(String bookName, Author author, int publishingYear) {
            this.bookName = bookName;
            this.author = author;
            this.publishingYear = publishingYear;
        }

        public String getBookName() {
            return bookName;
        }

        public int getPublishingYear() {
            return publishingYear;
        }

        public String getAuthor() {
            return author.authorName+" "+author.authorSName;
        }

        public void setPublishingYear(int publishingYear) {
            this.publishingYear = publishingYear;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Book book = (Book) o;
            return Objects.equals(bookName, book.bookName) && Objects.equals(author, book.author);
        }

        @Override
        public int hashCode() {
            return Objects.hash(bookName, author);
        }

        @Override
        public String toString() {
            return "Название книги: "+bookName+". Год издания: "+publishingYear+". "+author;
        }


    }


}
