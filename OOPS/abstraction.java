public class abstraction {
    public static void main(String args[]){
       // hen h = new hen();
        //System.out.println(h.color);
       // mustang h = new mustang();
    int x=3;
    System.out.print(x+1+(-~x));
    }
} 
class animal{
    String color;
     animal(){
    //    color = "brown";
System.out.println("animal called");    
}
    
}
class horse extends animal{
  /*   void changecolor(){
        //color = "darkbrown";
    }
   */ 
  horse(){
   System.out.println("horse called");
  }
}
class mustang extends horse{
    mustang(){
        System.out.println("mustang called");
    }
}
class hen extends animal{
    void changecolor(){
        color = "yellow";
    }
}