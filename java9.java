public class java9{
public static void main(String args[]){
int rem, rev = 0;
int a = Integer.parseInt(args[0]);

int temp = a;
for(int i = 0;i<3;i++){
int y = a % 10;
rem = y; 
a = a/10;
rev = (rev *10)+rem;
}
if (temp == rev){
System.out.println("value is palendrome");
}
else{
System.out.println("value is not palendrome");
}

}}