package JUNIT;

public class calculator {

    public int add(int a, int b){
        return a+b;
    }

    public int sub(int a,int b){
        return a-b;
    }


    public int mul(int a,int b){
        return a * b;
    }

    public int div(int a,int b){
        return a/b;
    }

    public void avg(){
    System.out.println("Avg is Null");
    }

    public static void main(String[] args){
        int a = 20;
        int b= 4;
        calculator cal = new calculator();


    }
}

