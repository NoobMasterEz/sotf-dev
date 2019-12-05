package app;

import java.io.IOException;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;



public class App {
    static void clearScreen() throws IOException {
        System.out.print("\033[H\033[2J");  
    System.out.flush(); 
}
    
    public static void main(String[] args) throws IOException {
        ArrayList<Hashtable<String, String>> myArrList = new ArrayList<Hashtable<String, String>>();
        Hashtable<String,String> table;
        /*Row1*/
        table=new Hashtable<String,String>();
        table.put("id","1");
        table.put("name","ratchanonth");
        table.put("balance", "99999");
        table.put("transactions","WWDDWDDDDDDDWWWWW");
        myArrList.add(table);
        /*Row2*/
        table=new Hashtable<String,String>();
        table.put("id","2");
        table.put("name","atchanonth");
        table.put("balance", "9999");
        table.put("transactions","DD");
        myArrList.add(table);
        /*Row3*/       
        table=new Hashtable<String,String>();
        table.put("id","3");
        table.put("name","tchanonth");
        table.put("balance", "1");
        table.put("transactions","DD");
        myArrList.add(table);
        blank outp=new blank(myArrList);
        Scanner myObj = new Scanner(System.in);
        boolean num=false;
        while(num!=true)
        {
            clearScreen();
            for (int i = 0; i < myArrList.size(); i++) {
                outp.showBalance(i);
               }
               System.out.println("\tMenu");
               System.out.println("(1).Deposit");
               System.out.println("(2).Withdraw");
               System.out.println("(3).Sort");
               System.out.println("(4).Ask longest");
               int num_ob=myObj.nextInt();
               switch (num_ob) {
                   case 1:
                        clearScreen();
                        Scanner new_obj = new Scanner(System.in);
                        System.out.print("Arg 1[id]= ");
                        int index = new_obj.nextInt();
                        System.out.print("Arg 2[$]= ");
                        int money = new_obj.nextInt();
                       outp.deposit(index,money);
                       break;
                    case 2:
                        clearScreen();
                        Scanner new_obj_1 = new Scanner(System.in);
                        System.out.print("Arg 1[id]= ");
                        int index_1= new_obj_1.nextInt();
                        System.out.print("Arg 2[$]= ");
                        int money_1 = new_obj_1.nextInt();
                        outp.withdraw(index_1,money_1);
                        break;

                    case 3:
                        clearScreen();
                        System.out.print("The person with highest or low account balance !!1\n");
                        outp.sort();
                        break;

                    case 4:
                        clearScreen();
                        Scanner new_obj_3 = new Scanner(System.in);
                        System.out.print("Arg 1[id]= ");
                        int index_3= new_obj_3.nextInt();
                        outp.Longest(index_3);
                        break;

                    case 0:
                        System.exit(1);

                   default:
                        System.out.println("plz select from menu !! \n");
                       break;
               }
        }
       
        //outp.deposit(1,500);
        //outp.customerName(1);
        //outp.withdraw(3,500);
        //outp.customerName(1);
        
        //outp.Longest(0);
        
    }
}
