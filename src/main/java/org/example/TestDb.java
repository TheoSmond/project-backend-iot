package org.example;

public class TestDb {
    public static void main (String[] args){
        Database db = Database.getInstance();
        db.open();

        Database db2 = Database.getInstance();
        db2.open();
    }
}
