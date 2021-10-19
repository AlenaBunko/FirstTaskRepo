import MyAnnotations.MyConfiguration;
import org.springframework.context.annotation.Bean;

@MyConfiguration
public class MyConfig {

    @Bean
    SaySomething saySomething() {
        return new SaySomethingImpl();
    }


}
