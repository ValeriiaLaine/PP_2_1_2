import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());

        HelloWorld beanFirst = (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(beanFirst.getMessage());
        
        Cat beanCatFirst = (Cat) applicationContext.getBean("cat");
        System.out.println(beanCatFirst.getMessage());

        Cat beanCatSecond = (Cat) applicationContext.getBean("cat");
        System.out.println(beanCatSecond.getMessage());

        System.out.println("Are hello world beans equal each other? " + (bean == beanFirst));
        System.out.println("Are cat beans equal each other? " + (beanCatFirst == beanCatSecond));
    }
}