package com.laughingcrying.mongoDao;

import com.laughingcrying.model.Artical;
import com.laughingcrying.model.Comment;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface ArticalDao {
    List<Artical> findAll();
    void addArtical(Artical artical);
    boolean addLikeBytitle(String title);
    boolean loseLikeBytitle(String title);
    boolean addCommentBytitle(String title, Comment comment);
    boolean addLikeToComment();
}
