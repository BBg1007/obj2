import java.util.Objects;

public class Author {
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
