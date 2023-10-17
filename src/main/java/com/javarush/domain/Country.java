package com.javarush.domain;

import jakarta.persistence.*;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;
@Entity
@Table(schema = "movie", name = "country")
public class Country {
    @Id
    @Column(name = "country_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Short id;
    @Column(name = "country")
    private String title;
    @Column(name = "last_update")
    @UpdateTimestamp
    private LocalDateTime lastUpDate;

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public LocalDateTime getLastUpDate() {
        return lastUpDate;
    }

    public void setLastUpDate(LocalDateTime lastUpDate) {
        this.lastUpDate = lastUpDate;
    }
}