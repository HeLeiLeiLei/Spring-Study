import com.hl.dao.UserDaoSQServerImpl;
import com.hl.dao.UserMysqlDaoImpl;
import com.hl.service.UserService;
import com.hl.service.UserServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {


    public static void main(String[] args) {
        ApplicationContext context
                = new ClassPathXmlApplicationContext("Beans.xml");

        UserService userServiceImpl = (UserService) context.getBean("UserServiceImpl");
        userServiceImpl.getUser();
    }



//    public static void main(String[] args) {
////        UserServiceImpl userService = new UserServiceImpl();
////        userService.getUser();
//
//        UserServiceImpl userService = new UserServiceImpl();
//        //userService.setUserDao(new UserDaoSQServerImpl());
//        userService.setUserDao(new UserMysqlDaoImpl());
//
//        userService.getUser();
//    }

}
