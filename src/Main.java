package src;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {


    public static void main(String[] args) {

        Menu menu = new Menu();
        Series series = new Series();
        menu.startMenu();

        DBConnector dbConnector=new DBConnector();

        dbConnector.readData();


    }
}













