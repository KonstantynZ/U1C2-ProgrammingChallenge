public class Solution {
    
    
    /**
     * DO NOT MODIFY THE METHOD NAME OR THE PARAMETERS
     * 
     * Problem 1: Exam Average
     */

    public double average(double t1, double t2, double t3, double t4) {
        double avg = (t1+t2+t3+t4) / 4;
        return avg;
    }

    public int roundAverage(double average) {
        int x = (int) Math.round(average);
        return x;
    }

    public boolean isPassing(int roundedAverage) {
        if (roundedAverage >= 65) {
            return true;
        } else {
            return false;
        }
    }

    /*
    Problem 2: Stock Price 
    */

    public double totalStock(int shares, double price) {
        return (shares*price);
    }


    public int roundValueChange(double totalStock) {

        return (int) Math.round(totalStock);
    }

    /*
    Problem 3: Digit Incrementer 
    */
   
    public double adjustDigits(double userDouble) {
        int usrDbl = (int)(userDouble*100);

        int firstDigit = (usrDbl / 10000);
        int secondDigit = (usrDbl % 10000) / 1000;
        int thirdDigit = (usrDbl % 1000) / 100;
        int fourthDigit = (usrDbl % 100) / 10;
        int fifthDigit = (usrDbl % 10);

        firstDigit = (firstDigit + 1) % 10;
        secondDigit = (secondDigit + 1) % 10;
        thirdDigit = (thirdDigit + 1) % 10;
        fourthDigit = (fourthDigit +1) % 10;
        fifthDigit = (fifthDigit + 1) % 10;

    int finalValue = (firstDigit * 10000) + (secondDigit * 1000) + (thirdDigit * 100) + (fourthDigit * 10) + (fifthDigit);

        return finalValue / 100.0;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        System.out.println(s.adjustDigits(120.90));
        //231.01
    }

}
