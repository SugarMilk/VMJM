package mr.huangjian;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath:spring-config.xml");
        Server server = (Server)context.getBean("example_one");
        server.printName();
    }
}
