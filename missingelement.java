import java.util.Scanner;
class Main
{
    public static int findMissing(int[] arr)
    {
        int n = arr.length;
        int total = (n * (n + 1))/ 2;
        int sum = 0;
        for(int i = 0; i < n; i ++)
        {
            sum += arr[i];
        }
        return total - sum;
    }
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = s.nextInt();
        }
        int missing = findMissing(arr);
        System.out.println(missing);
    }
}
