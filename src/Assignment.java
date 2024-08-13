public class Assignment {

    public static void main(String[] args) {

        int numberOne = 5;
        int numberTwo = -12;
        int numberThree = 0;

        checkNumber(numberOne);
        checkNumber(numberTwo);
        checkNumber(numberThree);
    }


public static void checkNumber(int number){
        if (number > 0){
            System.out.println("The number is greater than 0");
        } else if (number == 0) {
            System.out.println("The number is equal to 0");
        } else{
            System.out.println("The number is less than 0");
        }

}
}