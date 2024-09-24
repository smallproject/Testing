package nl.smallproject.www.librarysystembackend.mappers;

import nl.smallproject.www.librarysystembackend.models.Author;

public class AuthorMapper {
    public Author authorDTOtoEntity() {
        Author author = new Author();
        return author;
    }
}
