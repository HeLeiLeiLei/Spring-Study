
import com.hl.mapper.UserMapper;
import com.hl.pojo.User;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class MyTest {

//    @Test
//    public void Test(){
//       ApplicationContext context =
//               new ClassPathXmlApplicationContext("applicationContext.xml");
//
//       UserMapper userMapper = (UserMapper) context.getBean("userMapper");
//       System.out.println(userMapper.queryUsers());
//   }

    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        UserMapper userMapper = (UserMapper) context.getBean("userMapper");
        System.out.println(userMapper.queryUsers());
    }

}
