package org.example.loose;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;



@Component("UserServiceSMS")
public class UserService {
//    instance
    public NotificationService notificationService;

//    default constructor
    public UserService(){

    }
//    @Autowired
//   constructor
//    public UserService( @Qualifier("emailNotificationService") NotificationService notificationService){
//
//        this.notificationService    = notificationService;
//    }

    @Autowired
//    constructor
    public UserService(  NotificationService notificationService){

        this.notificationService    = notificationService;
    }


    public void notifyUser(String message){

        notificationService.send("notification hello");
    }
    public void setNotificationService(NotificationService notificationService){
        this.notificationService=notificationService;
    }


}
