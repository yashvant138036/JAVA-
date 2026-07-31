import java.util.Scanner;

class Switch
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Day (Monday-Friday): ");
        String day = sc.next();

        System.out.print("Enter Lecture Time (1-5): ");
        int time = sc.nextInt();

        switch(day)
        {
            case "Monday":
                switch(time)
                {
                    case 1:
                        System.out.println("Java");
                        break;
                    case 2:
                        System.out.println("DBMS");
                        break;
                    case 3:
                        System.out.println("Mathematics");
                        break;
                    case 4:
                        System.out.println("Python");
                        break;
                    case 5:
                        System.out.println("English");
                        break;
                    default:
                        System.out.println("Invalid Lecture Time");
                }
                break;

            case "Tuesday":
                switch(time)
                {
                    case 1:
                        System.out.println("C Programming");
                        break;
                    case 2:
                        System.out.println("Java");
                        break;
                    case 3:
                        System.out.println("OS");
                        break;
                    case 4:
                        System.out.println("DBMS");
                        break;
                    case 5:
                        System.out.println("Sports");
                        break;
                    default:
                        System.out.println("Invalid Lecture Time");
                }
                break;

            case "Wednesday":
                System.out.println("Holiday");
                break;

            case "Thursday":
                System.out.println("Project Lab");
                break;

            case "Friday":
                System.out.println("Seminar");
                break;

            default:
                System.out.println("Invalid Day");
        }

        sc.close();
    }
}