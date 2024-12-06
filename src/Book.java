import java.util.Objects;

public class Book {
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
            return author.toString();
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
