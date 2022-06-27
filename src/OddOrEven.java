public class OddOrEven {
    public static void checkOddOrEven(int number){
        if(number % 2==0){
            System.out.println(number+" is even");
        }else{
            System.out.println(number+" is odd");
        }
    }

    public static void main(String[] args) {
        checkOddOrEven(5);
    }
}
