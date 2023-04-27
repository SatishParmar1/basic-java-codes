public class java8{
public static void main(String args[]){
int rem;
int a = Integer.parseInt(args[0]);

int temp = a;
for(int i = 0;i<3;i++){

int y = a % 10;

if ( y%2==0){
rem = y;
System.out.print("all even number is "+ rem);
}
else{
int rev = y;
System.out.println("delete number is " +rev);
}
a = a/10;
}


}
}
