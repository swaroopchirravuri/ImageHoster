package com.upgrad.ImageHoster.service;

import com.upgrad.ImageHoster.model.Comment;
import com.upgrad.ImageHoster.model.Image;

import java.util.List;

public interface ImageService{
    List<Image> getAll();
    List<Image> getByTag(String tagName);
    Image getByTitle(String title);
    Image getByTitleWithJoin(String title);
    Image getByIdWithJoin(int id);
    void deleteByTitle(Image image);
    void save(Image image);
    void update(Image image);
    void updateComments(Comment comment);
    List<Comment> getCommentsById(int id);
}