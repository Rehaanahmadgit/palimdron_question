public class palindrom {
    public static void main(String[] args) throws Exception {
      
        int value = 1251;
        if(value<0){
            System.out.println(" less value");
        }
       int temp=value;
       int rev=0,rem;
       while (temp!=0){
           rem=temp%10;
       rev=rev*10+rem;
       temp=temp/10;
        }
       if (rev==value){
           System.out.println(" yes");
       }
    }
}
