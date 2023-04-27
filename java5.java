public class java5{
public static void main(String args[]){

int a = Integer.parseInt(args[0]);
int b = Integer.parseInt(args[1]);
int c = Integer.parseInt(args[2]);

if( a > b && a>c){
System.out.println(a+" is greatest");
}else
if( b> c && b>a){
System.out.println(b+ " is greatest");
}else
if( c > b && c>a){
System.out.println(c+ " is greatest");
}
}
}

