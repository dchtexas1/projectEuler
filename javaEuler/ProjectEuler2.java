public class ProjectEuler2
{
    public static void main(String[] args)
    {
        int n = 1;
        int m = 0;
        int tmp = 0;
        int sum2 = 0;
        while (n < 4000000)
        {
            tmp = n;
            n += m;
            m = tmp;
            if (n % 2 == 0)
            {
                sum2 += n;
            }
        }
        System.out.println(sum2);
    }
}
