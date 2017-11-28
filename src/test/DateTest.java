import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

//@RunWith(SpringJUnit4ClassRunner.class)
public class DateTest {
    @Test
    public void main() throws ParseException {
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEE MMM d HH:mm:ss 'CST' yyyy", Locale.ENGLISH);
        String date = dateFormat.format(new Date());
        System.out.println(date);
    }
}
