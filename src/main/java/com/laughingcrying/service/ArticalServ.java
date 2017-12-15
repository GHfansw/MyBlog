package com.laughingcrying.service;

import com.laughingcrying.model.Artical;
import com.laughingcrying.model.BaseInfo;


public interface ArticalServ {
    BaseInfo getAllArtical();
    BaseInfo setArtical(Artical artical);
    BaseInfo setLikeByTitle(String title);
}
