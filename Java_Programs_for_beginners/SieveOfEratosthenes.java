//You will have to enter the endpoint of range to get all prime numbers of range.
//Example- Input: 5 ,Output: 2 3 5
public class SieveOfEratosthenes {
    static void primeSieve(int n){
        int[] prime=new int[n+1];
        for(int i=2;i<=n;i++){
            if(prime[i]==0){
             for(int j=i*i;j<=n;j+=i){
               prime[j]=1;
             }
            }
        }
        for(int i=2;i<=n;i++){
            if(prime[i]==0){
            System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args){

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Endpoint Number of Range: ");
        int n=sc.nextInt();
        System.out.print("Prime Numbers: ");
        primeSieve(n);
        }
}
