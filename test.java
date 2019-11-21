public class test{
    int num=0;
    test(int i){
        num=i;
    }
    public static void main(String[] args) {
        String[] f={"banan","apple","melon"};
        String tel="053-211-122";
        String[] sp =tel.split("-");
        System.out.println(sp[0]);
        test name=new test(10);
        name.v1(f);
        
    }
    public void v1(String [] fruits) {
        for(int i =0 ;i<=fruits.length-1;i++)
        {
            System.out.println(fruits[i]);
        }
        for (String t : fruits) {
            System.out.println(t);
        }
        
    }
    
}