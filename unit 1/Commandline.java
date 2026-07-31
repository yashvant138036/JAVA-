class Commandline
{
    public static void main(String bhargav[])
    {
        int no1 = Integer.parseInt(bhargav[0]);
        int no2 = Integer.parseInt(bhargav[1]);

        System.out.println("0 position : " + no1);
        System.out.println("1 position : " + no2);

        if (no1 % 2 == 0 && no2 % 2 != 0)
        {
            System.out.println("NO1 IS EVEN AND NO2 IS ODD");
        }
        else if (no1 % 2 != 0 && no2 % 2 == 0)
        {
            System.out.println("NO1 IS ODD AND NO2 IS EVEN");
        }
        else if (no1 % 2 == 0 && no2 % 2 == 0)
        {
            System.out.println("BOTH ARE EVEN");
        }
        else
        {
            System.out.println("BOTH ARE ODD");
        }
    }
}