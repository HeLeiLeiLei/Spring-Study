import com.hl.service.Hose;
import com.hl.service.Proxy;

public class MyTes {
    public static void main(String[] args) {
        //中介
        Proxy proxy = new Proxy();
        //房东把房子交给了中介
        proxy.setHose(new Hose());
        //中介全权代理 你直接找中介就可以租到房子
        proxy.rent();

    }
}
