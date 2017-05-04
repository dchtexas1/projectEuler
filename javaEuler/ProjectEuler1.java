public class ProjectEuler1
{
    public static void main(String[] args)
    {
        int sum1 = 0;
        for (int i=0; i<1000; i++)
        {
            if (i % 3 == 0 || i % 5 == 0)
            {
                sum1 += i;
            }
        }
        System.out.println(sum1);
    }
}
