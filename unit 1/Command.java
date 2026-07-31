class Command
{
	public static void main(String bhargav[])
    {
        	int no1 = Integer.parseInt(bhargav[0]);
        	int no2 = Integer.parseInt(bhargav[1]);
	 int no3 = Integer.parseInt(bhargav[2]);


       	 System.out.println("0 position : " + no1);
        	System.out.println("1 position : " + no2);
	System.out.println("2 position : " + no3);


      	  if (no1>no2  && no1>no3 )
        {
           	 System.out.println("no1 is largest");
        }
       else if (no2>no1  && no2>no3 )
        {
         	 System.out.println("no2 is largest");
        }
        else if (no3>no1  && no3>no2 )
        {
                  System.out.println("no3 is largest");
        }
        else
        {
            System.out.println("all are same");
        }
    }