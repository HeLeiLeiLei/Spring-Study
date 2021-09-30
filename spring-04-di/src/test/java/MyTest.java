import com.hl.pojo.Address;
import com.hl.pojo.Student;
import com.hl.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        Student student = (Student) context.getBean("student");
        System.out.println(student.toString());

        /*
        *
        * Student{
        * name='小l',
        * address=Address(address=成都),
        * books=[西游记, 红楼梦, 水浒传, 三国演义],
        * hobbies=[玩游戏, 唱歌, 敲代码],
        * card={
        *   身份证=513723199900008888,
        *   电话=182827767750
        * },
        * games=[LOL, COC, BOB],
        * wife='null',
        * info={
        *   password=123456,
        *   url=localhost:3306,
        *   Driver=com.mysql.Driver.jdbc,
        *   username=root}
        * }
        *
        * */
    }

    @Test
    public void Test2(){
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        User user = context.getBean("user", User.class);
        User user2 = context.getBean("user", User.class);
        System.out.println(user==user2);
    }
}
