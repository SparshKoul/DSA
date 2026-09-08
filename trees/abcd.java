class Codechef {

    public static int evenDigits(int n) {

        if(n < 0)
            n = -evenDigits(n);

        int rev = 0;

        while(n > 0) {

            int digit = n % 10;

            if(digit % 2 == 0) {
                rev = rev * 10 + digit;
            }

            n = n / 10;
        }
            int num=rev;
            int x=0;
            
            while(num>0){
                int last=num%10;
                x=x *10+last ;
                num/=10;
            
        }

        return x;
    }

    public static void main(String[] args) {

        System.out.println(evenDigits(1248));

    }
}