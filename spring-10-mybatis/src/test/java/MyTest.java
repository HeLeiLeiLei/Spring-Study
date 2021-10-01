import com.hl.mapper.UserMapper;
import com.hl.pojo.User;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import java.io.IOException;
import java.util.List;

public class MyTest {

    @Test
    public void Test() throws IOException {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        UserMapper userMapper = (UserMapper) context.getBean("userMapperImpl");
        List<User> userList = userMapper.queryUsers();
        for (User user : userList) {
            System.out.println(user);
        }
    }

}
