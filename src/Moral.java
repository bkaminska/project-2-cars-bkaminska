import java.util.Scanner;

public class Moral {
    public static void main(String[] args) {


        int x = 1;
        String A = " ";
        String B = " ";

        ///public static void decideSwerve(int x, String A, String B);{


        /// scenario option
        Scanner getScenarioScan = new Scanner(System.in);
        Generator.getScenario();{ }
        int scenario = Generator.getScenario();
        System.out.println(Generator.getScenario());


        /// group of people getting hit in lane A
        Scanner getGroupScan = new Scanner(System.in);
        Generator.getGroup();{ }
        String groupA = Generator.getGroup();
        System.out.println(groupA);
        int groupLengthA = groupA.length();
        System.out.println(groupLengthA);


        /// group of people getting hit in lane B
        Scanner getGroupScanB = new Scanner(System.in);
        Generator.getGroup();{ }
        String groupB = Generator.getGroup();
        System.out.println(groupB);
        int groupLengthB = groupB.length();
        System.out.println(groupLengthB);

        /// telling to swerve to B since there are less people
        if (groupLengthA > groupLengthB) {
            System.out.println("Swerve to hit group B");
        }
        else if (groupLengthB > groupLengthA) {
            System.out.println("Swerve to hit group A");
        }

        ///else if (groupLengthA == groupLengthB) ;

/*
            ///public static Character getMemberName ( char member){
            Scanner memName = new Scanner(System.in);
            Generator.getMemberName();
            {
            }
            Character finalName = Generator.getMemberName();
            System.out.println(finalName); }*/

    }
}



       /// public static void decideSwerve(int x, String a, String b){







       /*STRING TWO-- stay in lane

        System.out.println();
        System.out.println("Please type in a number from, 1-5: ");

        Scanner stayLane = new Scanner(System.in);

        int stay = 1;

        stay = stayLane.nextInt();

        if (stay == 1) {
            System.out.println("After swerving your car, you will hit " + Generator.CRIMINAL + Generator.BABY);
        } else if (stay == 2) {
            System.out.println("After swerving your car, you will hit " + Generator.MALE_JOGGER + Generator.FEMALE_JOGGER+ Generator.DOG);
        } else if (stay == 3) {
            System.out.println("After swerving your car, you will hit " + Generator.MALE_JOGGER + Generator.OBESE_MAN);
        } else if (stay == 4) {
            System.out.println("After swerving your car, you will hit " + Generator.FEMALE_EXECUTIVE +Generator.GIRL +Generator.HOMELESS_PERSON);
        } else if (stay == 5) {
            System.out.println("After swerving your car, you will hit " + Generator.ELDERLY_MAN +Generator.PREGNANT_WOMAN);
        }
*/


/* string two--- serve car`

        System.out.println("Please type in a number from, 1-5: ");

        Scanner moveCar = new Scanner(System.in);

        int swerve = 1;

        swerve = moveCar.nextInt();

        if (swerve == 1) {
            System.out.println("After swerving your car, you will hit " + Generator.FEMALE_DOCTOR + Generator.BABY);
        } else if (swerve == 2) {
            System.out.println("After swerving your car, you will hit " + Generator.CRIMINAL +Generator.DOG);
        } else if (swerve == 3) {
            System.out.println("After swerving your car, you will hit " + Generator.MALE_JOGGER + Generator.OBESE_MAN);
        } else if (swerve == 4) {
        } else if (swerve == 5) {
            System.out.println("After swerving your car, you will hit " + Generator.ELDERLY_MAN +Generator.PREGNANT_WOMAN);
        }
*/

            ///  public static void main(String[] args) {







/*if (fhsdjhfkds){}
"Code here"
        Return true;
        }*/
