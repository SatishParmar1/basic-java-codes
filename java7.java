import java.util.Scanner;
class java7{
public static void main(String args[]){
System.out.println("Enter your number");
Scanner sc = new Scanner(System.in);
int a = sc.nextInt();
for(int i=1;i<=10;i++){
int multi = a*i;
System.out.println(a+"*"+i+" =  " +multi);
}
}
}