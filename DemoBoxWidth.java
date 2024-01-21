import javax.swing.text.BoxView;

class Box{
    double height,width,depth;
    Box(){
        height=1;
        width=1;
        depth=1;
    }
    Box (double len){
        height=width=depth=len;
    }
    Box(Box obj){
        width=obj.width;
        height=obj.height;
        depth=obj.depth;
    }
    Box(double w,double d,double h){
        width=w;
        height=h;
        depth=d;
    }
   void hello(){
    double vol = width*height*depth;
    System.out.println(vol);
   }
}

class DemoBoxWidth extends Box{
    BoxWeigth
    public static void main(String []args){
        Box mybox1 = new Box(10,30,49);
        mybox1.hello();
        

    }
}
