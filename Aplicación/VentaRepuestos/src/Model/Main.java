
package Model;

import Controller.MainMenuController;
import View.MainMenuDisplay;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    
    public static void main(String[] args){
        try {
            //ConnectionManager.logIn("192.168.1.10", "sa", "2019064588");
            ConnectionManager.logIn("192.168.100.45", "sa", "12345");
            ConnectionManager.connect();
            MainMenuController controller = new MainMenuController(new MainMenuDisplay()); 
            
            //EJEMPLO INSERTAR CLIENTE
//            ArrayList<String> info = new ArrayList<>(){
//                {
//                    add("1234567890");
//                    add("Estructuras S.A.");
//                    add("Colindando Recope");
//                    add("Ochomogo");
//                    add("Javier Munoz");
//                    add("Gerente");
//                }
//            };
//            ArrayList<String> phones = new ArrayList<>(){
//                {
//                    add("83215553");
//                }
//            };
//            ClientQuery.insertClient("ACTIVO", info, phones, true);
            
        } catch (SQLException ex) {
            System.out.println("FAILED TO CONNECT TO DATABASE");
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    } 
}
