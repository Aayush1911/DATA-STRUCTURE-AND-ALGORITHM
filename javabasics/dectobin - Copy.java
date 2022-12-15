public class dectobin{
public static void dec(int dec){
    
int pow = 0;
int l = 0;
while(dec>0){

int rem = dec % 2;

l = l + (rem * (int)Math.pow(10, pow));
pow++;
dec = dec/2;
}
System.out.println(l);
}

public static void main(String[] args){
dec(15);





}
}
