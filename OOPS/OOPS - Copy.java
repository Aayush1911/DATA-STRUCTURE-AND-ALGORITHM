public class OOPS{
    public static void main(String args[]){
          pen p1 = new pen();
        p1.setcolor("blue");
        System.out.println(p1.getcolor());
        p1.settip(5);
        System.out.println(p1.gettip());
        p1.setcolor("yellow");
        System.out.println(p1.getcolor());
 /*   bankaccount myacc = new  bankaccount();
   myacc.username = "aayush";
   System.out.println(myacc.username);
   myacc.setpassword("aapp"); */
    }
}

class pen{
    private String color;
    private int tip;
     String getcolor(){
        return color;
    }
    int gettip(){
        return tip;
    }
     void setcolor(String newcolor){
        color = newcolor;
    }
    void settip(int newtip){
        tip = newtip;
    }
}
/* class bankaccount{
    public String username;
    private String password;
    public void setpassword(String pwd){
        password = pwd;
    }
}
 */