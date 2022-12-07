import java.util.Scanner;

class PasswordGenerator {
    public static void main(String[] args) {

        //Create Scanner and ask how many passwords they would like generated
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many passwords would you like generated? ");
        int total = scanner.nextInt();

        //Ask how long they would like passwords
        System.out.print("How long would you like your passwords to be? ");
        int length = scanner.nextInt();

        //Array for random passwords
        String[] randomPasswords = new String[total];

        for(int i = 0; i < total; i++) {
            String randomPassword = "";

            for(int j = 0; j < length; j++) {
                randomPassword += randomCharacters();
            }

            randomPasswords[i] = randomPassword;
        }

        printArray(randomPasswords);
    }

    public static void printArray(String[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    /*Randomly generate letter (lowercase or uppercase) or number (0-9) using ASCII
    *Symbols => 33 - 47
    *0 - 9 => 48 - 57
    *A - Z => 65 - 90
    * a - z => 97 - 122
     */
    public static char randomCharacters() {
        int rand = (int)(Math.random()*62);

        if(rand <= 14) {
            //Convert from 0-14 to 33-47 by adding 33 to rand, 33-0=48
            int symbol = rand + 33;

            return (char)(symbol);

        } else if(rand <= 23) {
            //Convert from 15-23 to 48-57 by adding 33 to rand, 48-15=33
            int number = rand + 33;

            return (char)(number);

        } else if(rand <= 49) {
            //Convert from 24-49 to 65-90 by adding 41 to rand, 65-24=41
            int uppercase = rand + 41;

            return (char) (uppercase);
        } else {
            //Convert from 50-75 to 97-122 by adding 47 to rand, 97-50=47
            int lowercase = rand + 47;

            return (char) (lowercase);
        }
    }
}
