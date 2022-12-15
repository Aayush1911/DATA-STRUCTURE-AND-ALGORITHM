import java.util.*;
public class string{

public static void printletter(String str){
    for(int i=0;i<str.length();i++){
        System.out.print(str.charAt(i) + " ");
    }
}
public static boolean palindrome(String str){
    int n=str.length();
    for(int i=0;i<n/2;i++){
        if(str.charAt(i) != str.charAt(n-1-i)){
            return false;
        }
    }
    return true;
}
public static float getshortestdirections(String path){
    int x=0,y=0;
    for(int i=0;i<path.length();i++){
        int dir=path.charAt(i);
        if(dir == 'N'){
            y++;
        }
        else if(dir == 'S'){
            y--;
        }
        else if(dir == 'E'){
            x++;
        }
        else{
            x--;
        }
    }
    int x2=x*x;
    int y2=y*y;
    return (float)Math.sqrt(x2 + y2);
}
public static void substring(String str , int si , int ei){
    String  currstr = " ";
    for(int i=si;i<ei;i++){
        currstr+=str.charAt(i);
    }
System.out.println(currstr);
}
public static String upper(String str){
    StringBuilder sb = new StringBuilder(" ");
    char ch = Character.toUpperCase(str.charAt(0));
    sb.append(ch);
    for(int i=1;i<str.length();i++){
        if(str.charAt(i) == ' ' && i<str.length()-1){
            sb.append(str.charAt(i));
            i++;
            sb.append(Character.toUpperCase(str.charAt(i)));

        }
        else{
            sb.append(str.charAt(i));
        }
    }
    return sb.toString();
}
public static String compression(String str){
    StringBuilder sb = new StringBuilder(" ");
    for(int i=0;i<str.length();i++){
        Integer count =1;
        while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1)){
            count++;
            i++;
        }
sb.append(str.charAt(i));
if(count>1){
    sb.append(count.toString());
}
    }
    return sb.toString();
}


public static void main(String args[]){
Scanner sc = new Scanner(System.in);
// String str = "abcd";
// String str1 = new String("aayush");
// String name;
// name = sc.nextLine();
// System.out.println(name);
// System.out.println(name.length());
// String firstname = "aayush";
//String lastname = "patel";
//String fullname = firstname + " " + lastname;
//System.out.println(fullname); 
//System.out.println(fullname.charAt(7));
//printletter(fullname);

//palindrome
//String str = "racecar";
//System.out.println(palindrome(str));
//String path = "WNEENESENNN";
//System.out.println(getshortestdirections(path));

//string compare
// String name="Aayush";
// String n1=new String("Aayush");
// if(name.equals(n1)){
//     System.out.println("string are equal");
// }
// else{
//     System.out.println("string not equal");
// }

//SubString
//String str = "Hello world";
//substring(str, 0, 5);
//System.out.println(str.substring(0,5));

//largest string
// String fruit[] = {"apple" , "mango" , "grapes"};
// String largest = fruit[0];
// for(int i=1;i<fruit.length;i++){
//     if(largest.compareTo(fruit[i])<0){
//         largest=fruit[i];
//     }
// }
// System.out.println(largest);

//it treats small and capital as same
// String fruit[] = {"apple" , "Apple" , "grapes"};
//  String largest = fruit[0];
//  for(int i=1;i<fruit.length;i++){
//      if(largest.compareToIgnorecase(fruit[i])<0){
//          largest=fruit[i];
//      }
//  }
//  System.out.println(largest);

//StringBuilder
// StringBuilder sb = new StringBuilder(" ");
// for(char ch='a';ch<='z';ch++){
//     sb.append(ch);
// }
// System.out.print(sb + " ");

//intern method
// String str1= new String("aa");
// String str2= new String("aa");
// System.out.println(str1 == str2);//false
// str1 = str1.intern();
// str2=str2.intern();
// System.out.println(str1==str2);//true

//convert letter to uppercase
//String str = "hi i am aayush!";
//System.out.print(upper(str));

//number of vowels
// String str = "hi i am aayush!";
// int count =0;
// for(int i=0;i<str.length();i++){
//     char  letter = str.charAt(i);
//     if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'){
//         count++;
//     }
// }
// System.out.println(count);

//string compression
//String str = "aaaabbbccd";
//System.out.println(compression(str));


//anarog
// String str1 = "earth";
// String str2 = "heart";

// str1 = str1.toLowerCase();
// str2 = str2.toLowerCase();

// if(str1.length() == str2.length()){
// char[] str1charArray = str1.toCharArray();
// char[] str2charArray = str2.toCharArray();
// Arrays.sort(str1charArray);
// Arrays.sort(str2charArray);

// boolean result = Arrays.equals(str1charArray,  str2charArray);
// if(result){
//     System.out.println(str1 + " " +  str2 + " both are anaraog");
// }
// else{
//     System.out.println("not anarog");
// }
// }
// else{
//     System.out.println("both are not anarog");
// }








}
}