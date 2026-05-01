package org.example.Demo;

import org.example.loose.NotificationService;

public class LifeCycleBean {

    private NotificationService notificationService;


//    constructor
    public LifeCycleBean(NotificationService notificationService) {
        System.out.println("Constructor Called: Dependency Injected");
        this.notificationService = notificationService;
    }

    public void init(){
        System.out.println("init called: Bean initialized");
        notificationService.send("Hello from init");
    }
    public static void performTasK(){
        System.out.println("Ready for Use");
    }
    public void cleanup(){
        System.out.println("CleanUp Called");
    }

}
