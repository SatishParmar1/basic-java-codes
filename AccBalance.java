
class Balance{
    String name;
    double bal;
    Balance(String n, double b){
        name=n;
        bal=b;
    }
    void show(){
        if (bal<0)
        System.out.println(name+";$"+bal);
    }
}
public class AccBalance{
    public static void main(String[]args){ 
        Balance current[]=new Balance[3];

try{

        current[0]=new Balance("K.J.",123.23);
        
       System.out.println("hello1");
}
catch(Exception e){
    System.out.println("hello");
}
    }
}