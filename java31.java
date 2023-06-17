interface hello{
 void hy(int x, int y);
}

class mast implements hello{

 public void hy(int x,int y){
        int a=x;
        int b=y;
        System.out.println(a+b);
    }
}
public interface java31{
public static void main(String [] agrs){
    mast obj = new mast();
    obj.hy(10,20);
}
    
}


