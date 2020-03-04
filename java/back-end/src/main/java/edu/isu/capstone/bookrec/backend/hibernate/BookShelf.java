package edu.isu.capstone.bookrec.backend.hibernate;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
public class BookShelf extends BaseEntity implements Serializable {
    @OneToOne(mappedBy = "bookShelf")
    private User user;
    @ManyToMany
    @JoinTable(
            name = "Bookshelf_Books",
            joinColumns = {@JoinColumn(name = "bookshelf_id")},
            inverseJoinColumns = {@JoinColumn(name = "book_id")}
    )
    private Set<Book> books = new HashSet<>();
}
