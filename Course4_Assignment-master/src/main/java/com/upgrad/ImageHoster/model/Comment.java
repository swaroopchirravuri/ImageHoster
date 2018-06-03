package com.upgrad.ImageHoster.model;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Entity
@Table(name="Comment")
public class Comment implements Serializable {

    @Id
    @Column(columnDefinition = "serial")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column
    private String text;

    @Column
    private int image_id;

    public Comment() {}
    public Comment(String text,int image_id) {
        this.text = text;
        this.image_id=image_id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


}
