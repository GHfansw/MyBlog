package com.laughingcrying.mongoDao;

import com.laughingcrying.model.Artical;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface ArticalDao {
    List<Artical> findAll();
    void addArtical(Artical artical);
}
