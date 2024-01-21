class Main {

  public static void main(String[] args) {
    
 double num[] = {10.1,11.2,12.3,14.5,14.6};
 double result = 0;
 int i;
 for(i=0;i<5;i++){
  result = result + num[i];
  System.out.println("Average is"+ result/5 );
 }
  }
}