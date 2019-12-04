package app;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;


/**
 * blank
 */

public class blank {

    ArrayList<Hashtable<String, String>> Arryclass = new ArrayList<Hashtable<String, String>>();
    ArrayList<Double> al = new ArrayList<Double>();
    ArrayList<Double> ah = new ArrayList<Double>();
    blank(final ArrayList<Hashtable<String, String>> myArrayList) {
        this.Arryclass = myArrayList;
    }

    public void customerName(final int index) {
        System.out.println("[ID]: " + Arryclass.get(index).get("id").toString());
        System.out.println("[User]: " + Arryclass.get(index).get("name").toString());
        System.out.println("[Balance]: " + Arryclass.get(index).get("balance").toString());
        System.out.println("[transactions]: " + Arryclass.get(index).get("transactions").toString());
        System.out.println("---------------------------------");
    }

    public void deposit(final int index,final int money) {
        int result =Integer.parseInt( this.Arryclass.get(index-1).get("balance"));
        final String tran=this.Arryclass.get(index-1).get("transactions");
        result=result+money;
        this.Arryclass.get(index-1).put("balance",Integer.toString( result));
        this.Arryclass.get(index-1).put("transactions",tran+"D");
        //System.out.println("transactions:"+this.Arryclass.get(index).get("transactions").toString());
    }
    public void withdraw(final int index, final int money) {
        /*
            withdraw from acc ;
            check resutl < 0 
                them pass
            else 
                them put data in data dict 
        */
        int result =Integer.parseInt( this.Arryclass.get(index-1).get("balance"));
        final String tran=this.Arryclass.get(index-1).get("transactions");
        result=result-money;
        if (result <= 0) {
            System.out.println("Not enough money in the account ");
        }
        else{
            this.Arryclass.get(index-1).put("balance",Integer.toString( result));
            this.Arryclass.get(index-1).put("transactions",tran+"W");
        }
        
    }

    public void sort() {
        for (final Hashtable<String,String> hashtable : this.Arryclass) {
            this.al.add(Double.parseDouble(hashtable.get("balance"))); 
        }
        Collections.sort(al); 
        System.out.println("The person with highest account balance is:$"+String.valueOf(al.get(al.size()-1)));
        System.out.println("The person with lowest account balance is:$"+String.valueOf(al.get(al.size()-al.size())));
    }

    public void Longest(final int index) {
        /**
         *  ah
         */
        int d=0;
        int w=0;
        final String str=this.Arryclass.get(index).get("transactions");
        char New_str[]=str.toCharArray();
        for (char c : New_str) {
            if (c == 'D') {
                d++;
            } else {
                w++;
            }
        
        }
        System.out.println(d);
    }

}