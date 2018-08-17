public class FizzBuzz {
    public static void main(String arg[]){
        for(int i = 1; i <= 100; i++){
            System.out.print(getFizzBuzz(i) + " ");
        }
    }

    public static String getFizzBuzz(int number) {
        if(number%3 == 0 && number%5 == 0){
            return "FizzBuzz";
        } else if(number%3 == 0){
            return "Fizz";
        } else if(number%5 == 0){
            return "Buzz";
        }
        return String.valueOf(number);
    }
}
