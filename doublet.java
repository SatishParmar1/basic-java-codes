
class a extends Thread{
String s;
a(String s){
this.s=s;
}
public void run(){
for(int i=1;i<=10;i++){
System.out.println(s+"  "+ i);
try{
Thread.sleep(3000);
}
catch(Exception e){
System.out.println(e);
}
}
}
}
class thread1{
public static void main(String []args ){
a obj = new a("cut the ticket");
a obj1 = new a("show the seat");
Thread t=new Thread(obj);
Thread t1=new Thread(obj1);
t.start();
t1.start();

}
}
