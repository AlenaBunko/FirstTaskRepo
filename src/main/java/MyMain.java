import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MyMain {

    public static void main(String[] args) {

        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(MyConfig.class);

        SaySomething saySomething = ac.getBean(SaySomething.class);

        saySomething.message();

    }
}
