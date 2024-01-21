
class a extends Thread{
public void run(){
for(int i=1;i<=10;i++){
System.out.println(i);
}
}
}
class runthread{
public static  void main(String args[]){
a obj = new a();
Thread t=new Thread(obj);
t.start();
}
}
