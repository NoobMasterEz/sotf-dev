package app;
import java.util.ArrayList;
import java.util.Hashtable;
public class App {
    public static void main(String[] args) {
        ArrayList<Hashtable<String, String>> myArrList = new ArrayList<Hashtable<String, String>>();
        Hashtable<String,String> table;
        /*Row1*/
        table=new Hashtable<String,String>();
        table.put("id","1");
        table.put("name","ratchanonth");
        table.put("balance", "99999");
        table.put("transactions","DDDDD");
        myArrList.add(table);
        /*Row2*/
        table=new Hashtable<String,String>();
        table.put("id","2");
        table.put("name","atchanonth");
        table.put("balance", "9999");
        table.put("transactions","DDD");
        myArrList.add(table);
        /*Row3*/       
        table=new Hashtable<String,String>();
        table.put("id","3");
        table.put("name","tchanonth");
        table.put("balance", "9999");
        table.put("transactions","D");
        myArrList.add(table);
        blank outp=new blank(myArrList);
       
        outp.customerName(1);
        outp.deposit(1,500);
        outp.customerName(1);
        outp.withdraw(1,500);
        outp.customerName(1);
        }
    }
