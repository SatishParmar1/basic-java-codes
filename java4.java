class hello{
    void mast(int x){
        int a =x;
       // System.out.println("args[0]");
     
        int b = Integer.parseInt(args[0]);
        double c = a/b;
        System.out.println(c);
 
    }
}
class Main{
    public static void main(String[] args){
        hello obj = new hello();
        obj.mast(3);
    }
}