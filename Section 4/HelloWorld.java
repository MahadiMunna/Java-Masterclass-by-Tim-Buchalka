public class HelloWorld { //public is access modifier, class is for define its a class name HelloWorld
    public static void main(String[] args) { //public static void main is a method, main method
        System.out.println("Hello world!");

        boolean isAlien = false;
        if (isAlien == false){
            System.out.println("It is not alien");
        }
        int age = 26;
        String result=age>=26?"Same age":"Junior";//Ternary operator
        System.out.println(result);
    }
}
//project and class name should be UpperCamelCase
//variable and method name should be lowerCamelCase