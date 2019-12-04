package app;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

import javax.xml.crypto.dsig.keyinfo.KeyInfo;
public class App {
    public static void main(String[] args) {
        ArrayList<Hashtable<String, String>> myArrList = new ArrayList<Hashtable<String, String>>();
        Hashtable<String,String> table;
        /*Row1*/
        table=new Hashtable<String,String>();
        table.put("id","1");
        table.put("name","ratchanonth");
        table.put("balance", "99999");
        table.put("transactions","DWDD");
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
       for (int i = 0; i < myArrList.size(); i++) {
        outp.customerName(i);
       }
       Scanner myObj = new Scanner(System.in);
       int num=myObj.nextInt();
       switch (num) {
           case 1:
                Scanner new_obj = new Scanner(System.in);
                System.out.println("Arg 1= id");
                System.out.println("Arg 2= $");
                int index = new_obj.nextInt();
                int money = new_obj.nextInt();
               outp.deposit(index,money);
               break;
       
           default:
               break;
       }
        //outp.deposit(1,500);
        //outp.customerName(1);
        //outp.withdraw(3,500);
        //outp.customerName(1);
        outp.Longest(0);
        }
    }
