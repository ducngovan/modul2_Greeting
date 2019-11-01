package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        GreetingUser gree = new GreetingUser();
        gree.inpput();
        System.out.print(gree.getResult());
    }
}

class GreetingUser{
    String user;
    public void inpput(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("nhap ten user: ");
        user = scanner.nextLine();
    }
    public String getResult(){
        return ("hello "+ user);
    }
}