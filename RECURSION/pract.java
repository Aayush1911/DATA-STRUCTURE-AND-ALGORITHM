public class pract{


    public static void occurence(int n[] , int key ,int i){
        if(i==n.length){
            return;
        }
        if(n[i] == key){
            System.out.println(i + " ");
        }
        occurence(n,key,i+1);
    }
        public static void printnum(int n){
         String digit[] = {"zero" ,"one" , "two" , "three" , "four" , "five" , "six" , "seven"
         , "eight" , "nine"};
         if(n==0){
            return;
         }
         int lastdigit=n%10;
         printnum(n/10);
         System.out.print(digit[lastdigit] + " ");

        }
        public static int Stringlen(String name){
            int count = 0;
            if(name.length() == 0){
                return 0;
            }
            
            return Stringlen(name.substring(1)) + 1;
        }
       
    
        
    public static void main(String args[]){
       /*  int n[] = {3,2,4,5,6,2,7,2,2};
        int key =2;
        occurence(n, key , 0); */
       // printnum(201900);
       String name = "aayush";
      //System.out.println( Stringlen(name));
      



    }
}