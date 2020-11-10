package org.example;

public class Database {

    private static Database instance;

    public static Database getInstance(){
        if(instance == null){
            instance = new Database();
        }
        return instance;
    }
    private Database(){
        System.out.println("CONSTRUCTEUR DATABASE");
    }

    private boolean oppened = false;

    public void open(){
        if (oppened){
            System.out.println("Already open");
            return;
        }
        System.out.println("Open Database");
        oppened = true;
    }
    public static void main(String[] args){
        Database db = new Database();
        db.open();

        db = new Database();
        db.open();
    }
}
