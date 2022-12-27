package com.example.librarysystem.Repository;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "card")
public class LibCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    int id;
    private int fine;

    @CreatedDate
    private Date creationDate;


    public LibCard() {
    }

    public LibCard(int id, int fine) {
        this.id = id;
        this.fine = fine;
    }

    public int getId() {
        return id;
    }

    public int getFine() {
        return fine;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFine(int fine) {
        this.fine = fine;
    }
}
