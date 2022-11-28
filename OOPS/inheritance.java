import javax.sql.rowset.spi.SyncResolver;

public  class inheritance{
    public static void main(String args[]){
//single inheritance
/* fish shark = new fish();
    shark.eat();
 */
//multilevel inheritance
/* mammal dog = new mammal();
dog.breed();
dog.breathe();
 */ 
//hierarchial inheritance
/* fish shark = new fish();
shark.swim();
shark.eat();
shark.breathe();
 */
//hybrid inheritance
cat cat = new cat();
cat.drink();
cat.eat();
cat.breathe();
dog dog = new dog();
    dog.breed();



}
}
//single inheritance
/* class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
     System.out.println("breaths");
    }
}
class fish extends Animal{
    int tins;
} */
//multilevel inheritance
/* class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
     System.out.println("breaths");
    }
}
class fish extends Animal{
    int tins;
} 
class mammal extends fish{
    void breed(){
        System.out.println("lab");
    }
}
 */
//hierarchial inheritance
/* class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
     System.out.println("breaths");
    }
}
class fish extends Animal{
    void swim(){
    System.out.println("swims");
    }
} 
class mammal extends Animal{
    void breed(){
        System.out.println("lab");
    }
} */
//hybrid inheritance
class Animal{
    String color;
    void eat(){
        System.out.println("eats");
    }
    void breathe(){
     System.out.println("breaths");
    }
}
class fish extends Animal{
    void swim(){
    System.out.println("swims");
    }
} 
class shark extends fish{
    void name(){
        System.out.println("shark");
    }
}
class bird extends Animal{
    void name(){
        System.out.println("peacock");
    }
}
class mammal extends Animal{
    void type(){
        System.out.println("mammal");
    }
}
class dog extends mammal{
    void breed(){
    System.out.println("lab");
    }
}
class cat extends mammal{
    void drink(){
        System.out.println("milk");
    }
}