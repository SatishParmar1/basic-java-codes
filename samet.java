
class a extends Thread{
int available=1;
int wanted;

a(int a){
wanted =a ;
}
public void run(){
synchronized(this){
if(available>=wanted){
for(int i=1;i<=10;i++){
System.out.println(wanted+"  "+ i);
try{
Thread.sleep(3000);
available = available-wanted;
}
catch(Exception e){
System.out.println(e);
}
}
}else{
System.out.println("sorry! no seat available");
}
}
}
}
class samet{
public static void main(String args[]){
a obj = new a(1);
Thread t=new Thread(obj);
Thread t1=new Thread(obj);
t.SetName("first Person");
t1.SetName("Second Person");
t.start();
t1.start();

}
}
