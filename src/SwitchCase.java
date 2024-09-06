public class SwitchCase {
    public static void main(String[] args) {
        int dayOfWeek = 10;

        switch (dayOfWeek) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            // can add cases for other days
            default:
                System.out.println("Invalid day");
        }
    }
}

//fall through
