
import com.laughingcrying.model.UserTest;
import com.laughingcrying.mongoDao.ArticalDao;
import com.laughingcrying.model.Artical;
import com.laughingcrying.model.Comment;
import com.laughingcrying.mongoDao.UserMongoDaoTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-context.xml","classpath:mongodb-context.xml"})
public class mongotest {
    @Autowired
    private UserMongoDaoTest userMongoDao;

    @Autowired
    private ArticalDao articalDao;

    @Test public void testMongoTemplate() {
        userMongoDao.insertUser(new UserTest("fsw","fsw123"));
        userMongoDao.insertUser(new UserTest("fsw2","fsw123"));
        userMongoDao.insertUser(new UserTest("fsw3","fsw123"));
        List l = userMongoDao.findForRequery("fsw");
        System.out.println(l.toString());
    }

    @Test public void testArtial(){
        List<String> tags = new ArrayList<>();
        tags.add("food");
        tags.add("tech");
        List<Comment> comments = new ArrayList<>();
//        ConcurrentHashMap hashMap = new ConcurrentHashMap();
//        hashMap.put("user","test user");
//        hashMap.put("message","i LIKE the test");
//        hashMap.put("date",new Date().toString());
//        hashMap.put("like","5");
        comments.add(new Comment("test","i LIKE the test",new Date().toString(),5));
        comments.add(new Comment("test","i hate the test",new Date().toString(),6));
        Artical artical = new Artical("test title","test desc","test by me",tags,4,comments,new Date(),1);
        articalDao.addArtical(artical);
        List l = articalDao.findAll();
        System.out.println(l.getClass().toString());
        System.out.println(l.get(0).getClass().toString());
    }

    @Test public void testArtialLikes(){
        articalDao.addLikeBytitle("title");
        articalDao.loseLikeBytitle("test title");

    }

    @Test public void testArtialComment(){
        articalDao.addCommentBytitle("title",new Comment("fsw","this is the first time a give a comment",new Date().toString(),0));
    }

}
