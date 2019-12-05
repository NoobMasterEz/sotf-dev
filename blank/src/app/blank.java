package app;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Hashtable;;

/**
 * blank
 */

public class blank {

    private ArrayList<Hashtable<String, String>> Arryclass = new ArrayList<Hashtable<String, String>>();
    private ArrayList<Double> al = new ArrayList<Double>();
    private ArrayList<Double> ah = new ArrayList<Double>();

    blank(final ArrayList<Hashtable<String, String>> myArrayList) {
        this.Arryclass = myArrayList;
        addInterest(myArrayList);
    }

    public void showBalance(final int index) {
        /**
         * show disk play
         */
        System.out.println("[ID]: " + Arryclass.get(index).get("id").toString());
        System.out.println("[User]: " + Arryclass.get(index).get("name").toString());
        System.out.println("[Balance]: " + Arryclass.get(index).get("balance").toString());
        System.out.println("[transactions]: " + Arryclass.get(index).get("transactions").toString());
        System.out.println("---------------------------------");

    }

    public void deposit(final int index, final int money) {
        /**
         * deposit
         */
        try {
            int result = Integer.parseInt(this.Arryclass.get(index - 1).get("balance"));
            final String tran = this.Arryclass.get(index - 1).get("transactions");
            result = result + money;
            this.Arryclass.get(index - 1).put("balance", Integer.toString(result));
            this.Arryclass.get(index - 1).put("transactions", tran + "D");

        } catch (final IndexOutOfBoundsException e) {
            // TODO: handle exception
            System.out.println("Someting wrong index out of rang. ");
        }
        // System.out.println("transactions:"+this.Arryclass.get(index).get("transactions").toString());
    }

    public void withdraw(final int index, final int money) {
        /*
         * withdraw from acc ; check resutl < 0 them pass else them put data in data
         * dict
         */
        try {
            int result = Integer.parseInt(this.Arryclass.get(index - 1).get("balance"));
            final String tran = this.Arryclass.get(index - 1).get("transactions");
            result = result - money;
            if (result <= 0) {
                System.out.println("Not enough money in the account ");
            } else {
                this.Arryclass.get(index - 1).put("balance", Integer.toString(result));
                this.Arryclass.get(index - 1).put("transactions", tran + "W");
            }

        } catch (final IndexOutOfBoundsException e) {
            System.out.println(e);

        }
    }

    public void sort() throws IOException {
        /**
         * sorted hashtable value balance. that from Array list
         */
        for (final Hashtable<String, String> hashtable : this.Arryclass) {
            this.al.add(Double.parseDouble(hashtable.get("balance")));
        }
        Collections.sort(al);
        System.out.println("The person with highest account balance is:$" + String.valueOf(al.get(al.size() - 1)));
        System.out.println("The person with lowest account balance is:$" + String.valueOf(al.get(al.size() - al.size())));
        System.in.read();
    }
    
    public void addInterest( ArrayList<Hashtable<String, String>> new_Arryclass){
        /**
         * calcuat balanace + interest = per/year
         */
        for (int i = 0; i < new_Arryclass.size(); i++) {
            String balance=new_Arryclass.get(i).get("balance").toString();
            double br=(Double.parseDouble(balance));
            double new_balance=(br*0.07);
            this.Arryclass.get(i).put("balance", String.valueOf(br+new_balance));
            
        }
    }

    public void Longest(final int index) throws IOException {
        /**
         * ah Someting else . i'm not think for algo
         */
        int d = 0;
        int w = 0;
        int tmp_d = 0;
        int tmp_w = 0;

        final String str = this.Arryclass.get(index).get("transactions");
        final char New_str[] = str.toCharArray();

        for (int i = 0; i < New_str.length; i++) {
            if (i < New_str.length-1 ) {
                if (New_str[i] == New_str[i + 1]) {
                    if (New_str[i] == 'D') {
                        d++;
                    } else {
                        w++;
                    }
                }else{
                    if(New_str[i] == 'D'){
                        if(tmp_d<d){
                            tmp_d = d;
                            //System.out.println(tmp_d);
                            d=0;
                        }
                    }
                    if(New_str[i] == 'W'){
                        if(tmp_w<w){
                            tmp_w = w;
                            //System.out.println(tmp_w);
                            w=0;
                        }
                    }

                }
            }else{
                if(New_str[i] == 'D'){
                    if(tmp_d<d){
                        tmp_d = d;
                        //System.out.println(tmp_d);
                        d=0;
                    }
                }
                if(New_str[i] == 'W'){
                    if(tmp_w<w){
                        tmp_w = w;
                        //System.out.println(tmp_w);
                        w=0;
                    }
                }
            }
         
        }
        if(tmp_d <tmp_w){
            System.out.print("Longest repeating activity:Withdraw");
            System.out.println(tmp_w+1);
            System.in.read();
        }else{
            System.out.print("Longest repeating activity:Deposit ");
            System.out.println(tmp_d+1);
            System.in.read();
        }


        
    }

}