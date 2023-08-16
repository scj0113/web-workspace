package controller;

import controller.Controller;



public class HandlerMapping {
    private static HandlerMapping handler = new HandlerMapping();
    
    private HandlerMapping() {}
    
    public static HandlerMapping getInstance() {
        return handler;
    }
    
    public Controller createController(String command) {
        Controller controller = null;
        
        if (command.equals("idCheck.do")) {
            controller = new ItemListController();
        } else if(command.equals("idCheck.do")) {
            controller = new ItemViewController();
       
        }
        return controller;
    }
}
