package Java8_features;

interface Sayable{  
    void say();  
}  

public class ReferenceMethod {  
    public static void saySomething(){  
        System.out.println("Hello, this is static method.");  
    }  
    public static void main(String[] args) {  
        // Referring static method  
        Sayable sayable = ReferenceMethod::saySomething;  
        // Calling interface method  
        sayable.say();  
    }  
}  