package com.dn.corejava;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.io.*;

public class SerializationDemo {

    public static void main(String[] args) throws IOException, ClassNotFoundException, NamingException {

        User user = new User(1L,"Dipali");

        FileOutputStream fileOutputStream = new FileOutputStream("/Users/dipalidhinoja/Desktop/DND.txt");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

        objectOutputStream.writeObject(user);
        objectOutputStream.flush();
        objectOutputStream.close();

        Context context = new InitialContext();
        String name = "Diippaalii";
        context.bind(name,user);

        System.out.println("Object successfully written to this file");

        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("/Users/dipalidhinoja/Desktop/DND.txt"));
        User u = (User)objectInputStream.readObject();

        System.out.println("User id : "+u.getId() + "User Name : "+u.getName());

        objectInputStream.close();

    }
}
