package servlet.controller;

import servlet.controller.Controller;
import servlet.controller.component.IdCheckController;


public class HandlerMapping {
    private static HandlerMapping handler = new HandlerMapping();
    
    private HandlerMapping() {}
    
    public static HandlerMapping getInstance() {
        return handler;
    }
    
    public Controller createController(String command) {
        Controller controller = null;
        
        if (command.equals("idCheck.do")) {
            controller = (Controller) new IdCheckController(); 
        }
       
        
        return controller;
    }
}
