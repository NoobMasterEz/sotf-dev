package app;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Set;
/**
 * blank
 */

public class blank {

    ArrayList<Hashtable<String, String>> Arryclass = new ArrayList<Hashtable<String, String>>();
    blank(final ArrayList<Hashtable<String, String>> myArrayList) {
        this.Arryclass = myArrayList;
    }

    public void customerName(final int index) {
        System.out.println("ID:" + Arryclass.get(index).get("id").toString());
        System.out.println("User:" + Arryclass.get(index).get("name").toString());
        System.out.println("Balance:" + Arryclass.get(index).get("balance").toString());
        System.out.println("transactions:" + Arryclass.get(index).get("transactions").toString());
    }

    public void deposit(final int index,final int money) {
        int result =Integer.parseInt( this.Arryclass.get(index).get("balance"));
        String tran=this.Arryclass.get(index).get("transactions");
        result=result+money;
        this.Arryclass.get(index).put("balance",Integer.toString( result));
        this.Arryclass.get(index).put("transactions",tran+"D");
        //System.out.println("transactions:"+this.Arryclass.get(index).get("transactions").toString());
    }
    public void withdraw(int index, int money) {
        /*
            withdraw from acc ;
            check resutl < 0 
                them pass
            else 
                them put data in data dict 
        */
        int result =Integer.parseInt( this.Arryclass.get(index).get("balance"));
        String tran=this.Arryclass.get(index).get("transactions");
        result=result-money;
        if (result <= 0) {
            System.out.println("Not enough money in the account ");
        }
        else{
            this.Arryclass.get(index).put("balance",Integer.toString( result));
            this.Arryclass.get(index).put("transactions",tran+"W");
        }
        
    }
    /*
    public  void name(int index) {
        System.out.println("User:"+Arryclass.get(index).get("name").toString());
    }
     */
    

}