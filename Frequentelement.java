import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int arr[] = new int[n];
        for(int i = 0; i < n; i ++)
        {
            arr[i] = s.nextInt();
        }
        int maxCount = 0;
        int element = arr[0];
        for(int i = 0; i < n; i++)
        {
            int count = 0;
            for(int j = 0; j < n; j++)
            {
                if(arr[i] == arr[j])
                  count ++;
            }
            if(arr[i] > maxCount)
            {
                maxCount = count;
                element = arr[i];
            }
        }
        System.out.println(maxCount);
        System.out.println(element);
        s.close();
    }
}
