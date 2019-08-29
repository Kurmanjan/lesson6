package com.company;

public class Main {

    public static void main(String[] args) {
        String[] name =  new String[3];
        name[0] = "Kuma";
        System.out.println(name[0]);
        name[1] = "Aika";
        System.out.println(name[1]);
        name[2] = "Aiza";
        System.out.println(name[2]);

        for (int i =1; i <=3; i++)

            switch (i)  {

                case 1:
                    System.out.println("Good moring" +" "+name[0]);
                    break;

                case 2:
                    System.out.println("Good day" +" "+name[1]);

                case 3:
                    System.out.println("Good evening" +" "+name[2]);
                    break;

                default:
                    System.out.println("no name");
                    break;

            }
    }
}
