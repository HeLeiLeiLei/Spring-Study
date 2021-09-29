import com.hl.pojo.Hello;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {

    public static void main(String[] args) {
        ApplicationContext application = new ClassPathXmlApplicationContext("Beans.xml");
        Hello hello = (Hello) application.getBean("hello");
        System.out.println(hello.toString());
    }
}
