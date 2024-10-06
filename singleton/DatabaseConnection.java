package com.example.lldbasics.DesignPatterns.singleton;


public class DatabaseConnection {
    //double check locking
//    private static DatabaseConnection ins = null;

    //Eager Implementation
//    private static  DatabaseConnection ins = new DatabaseConnection();

    //Method synchronized
    private static DatabaseConnection ins = null;

    public DatabaseConnection(){}

    //double check locking
//    public static DatabaseConnection getInstance(){
//        if(ins == null){
//            synchronized (DatabaseConnection.class){
//                if(ins == null){
//                    ins = new DatabaseConnection();
//                }
//            }
//        }
//        return ins;
//    }

    //Eager Implementation
//    public static synchronized DatabaseConnection getInstance(){
//        return ins;
//    }

    //Method synchronized
    public static synchronized DatabaseConnection getInstance(){
        if(ins == null){
            ins = new DatabaseConnection();
        }
        return ins;
    }
}
