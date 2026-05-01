package org.example.Demo;

import org.example.loose.UserService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
//                ApplicationContext context=
//                new AnnotationConfigApplicationContext(AppConfig.class);
//
//           Greeting greeting= (Greeting) context.getBean("myBean");
//        Greeting greeting=  context.getBean(Greeting.class);

//        greeting.sayhello();


//          -------- this is with the help of xml file--------

//      ApplicationContext context=new ClassPathXmlApplicationContext("ApplicationBeenContext.xml")

//        UserService userService= (UserService) context.getBean("UserServiceSMS");
//        UserService userService= (UserService) context.getBean(UserService.class);

//        userService.notifyUser("kya hua hai! ");
//

//        UserService userServiceEmail= (UserService) context.getBean("UserServiceEmail");
//        userServiceEmail.notifyUser("kya hua hai! ");

        System.out.println("Starting spring application context");
        ApplicationContext context= new AnnotationConfigApplicationContext(AppConfig.class);

        System.out.println("Retrieving Lifecycle Bean ");
        LifeCycleBean lifeCycleBean=context.getBean(LifeCycleBean.class);

        LifeCycleBean.performTasK();

        System.out.println("Closing the application");



    }
}
