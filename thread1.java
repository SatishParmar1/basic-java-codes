
class a extends Thread{
public void run(){
for(int i=1;i<=10;i++){
System.out.println(i);
try{
Thread.sleep(3000);
}
catch(Exception e){
System.out.println(e);
}
}
}
}

class Thread1{
public static  void main(String args[]){
a obj = new a();
Thread t=new Thread(obj);
t.start();
}
}
