
import controller.LoginManager;
import view.Menu;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Thao Chi
 */
public class Main {
     public static void main(String[] args) {
        String title = "-------Login Program-------";
        String[] s = new String[]{"Vietnamese", "English", "Exit"};
        Menu<String> menu = new LoginManager(title, s);
        menu.run();
    }
}
