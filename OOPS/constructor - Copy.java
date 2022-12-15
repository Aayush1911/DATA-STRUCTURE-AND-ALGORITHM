import java.rmi.StubNotFoundException;

public class constructor{
    public static void main(String args[]){
/* student s1 = new student();
student s2 = new student("this is paramaterized constructor");
System.out.println(s2.name);
student s3 = new student(11);
System.out.println(s3.roll);    
 */
//copy constructor
student s1 = new student();
s1.name="aayush";
s1.roll=100;
s1.marks[0] = 100;
s1.marks[1] = 90;
s1.marks[2] = 80;
System.out.println("before copy constructor");
for(int i=0;i<3;i++){
    System.out.println("marks" + i + " "+ s1.marks[i]);
}


   System.out.println();
  System.out.println("after copy constructor and shallow constructor");
student s2 = new student(s1);
s1.marks[0]=50;
s1.marks[1]= 100;
s1.marks[2]=150;

for(int i=0;i<3;i++){
    System.out.println("marks" + i +" " + s2.marks[i]);
} 
   
/* 
  System.out.println("after deep constructor ");
student s3 = new student(s1);
s1.marks[0]=50;
s1.marks[1]= 100;
s1.marks[2]=150;

for(int i=0;i<3;i++){
    System.out.println("marks" + i +" " + s3.marks[i]);
}
  */ 
}
 }

 class student{
    String name;
    int roll;
    int marks[];
    //copy constructor and shallow constructor
       student(student s1){
         marks = new int[3];
        this.name=s1.name;
        this.roll=s1.roll;
        this.marks = s1.marks;
 
    }  
// deep constructor
      /* student(student s1){
        marks = new int[3];
        this.name = name;
        this.roll = roll;
        for(int i=0;i<3;i++){
            this.marks[i] = s1.marks[i];
        }
        } 
   */
   

    // non - paramaterized constructor
    student(){
        marks=new int[3]; // it is for copy constructor
        System.out.println("this is non paramaterized constructor");
        
    }
    //paramaterized constructor
    student(String name){
       // marks=new int[3]; //it is for copy constructor
        this.name = name;
    }
    student(int roll){
        //marks=new int[3]; //it is for copy constructor
        this.roll=roll;
    }
    
}