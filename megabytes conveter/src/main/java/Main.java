public class Main {
    abstract class Bank{
abstract int getRateInterest();
    }

    static class SBI extends Bank{
        int getRateInterest(){
            return 7;
        }
    }

    class PNB extends Bank{
        int getRateInterest(){
            return 8;
        }
    }
     static class TestBank{
        public static void main(String[] args){
            Bank b;
            b=new SBI();
            System.out.println("Rate of Interest is: " + b.getRateInterest() + "%");
        }
    }

}
