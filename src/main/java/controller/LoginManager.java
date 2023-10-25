/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package controller;

import java.util.Locale;
import model.LoginList;
import view.Menu;
/**
 *
 * @author HP
 */
public class LoginManager extends Menu<String>{
    private LoginList list= new LoginList();
    Locale vietnamese = new Locale("vi");
    Locale english = Locale.ENGLISH;
    public LoginManager(String title, String[] s){
        super(title, s);
    }
    
    @Override
    public void execute(int n) {
        switch (n) {
           
            case 1:
               list.login(vietnamese);
                break;
            case 2: 
                list.login(english);
                break;

            case 3:
                System.exit(0);        
        }
    }
}

