import com.laughingcrying.dao.UserDao;
import com.laughingcrying.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({"classpath:spring-context.xml","classpath:mongodb-context.xml"})
@EnableMongoRepositories(basePackages = {"com.laughingcrying.dao"})
//如果使用MongoRepositories则必须添加上面一行注释，并在mongodb-context中加入扫描的repositories的location
public class JPAmongo {
    @Autowired
    private UserDao userDao;

    @Test
    public void testMongo() {
        User u = new User("fsw45","fsw123");
        userDao.save(u);
    }

    @Test
    public void findMongo() {
        System.out.println(userDao.findOneByUsername("fsw").getUsername());
    }
}

