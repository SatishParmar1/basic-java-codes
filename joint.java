class A extends Thread{
String name;
A(String s){
name=s;
}
public void run(){
for(int i=1;i<=10;i++){
System.out.println(name+"  "+ i);
}
}
}
public class Joint{
public static void main(String []args ){
A obj = new A("cut the ticket");
A obj1 = new A("show the seat");
Thread t =new Thread(obj);
Thread t1 =new Thread(obj1);
try{
t1.join();
}
catch(Exception e){
System.out.println(e);
}
System.out.println(t.isAlive());
System.out.println(t1.isAlive());
t.start();
t1.start();
System.out.println(t1.isAlive());
}
}
