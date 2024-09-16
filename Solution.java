import java.util.*;

class Solution {
    public int solution(int N) {
        String binaryN = Integer.toBinaryString(N);

        int maxGap = 0;
        int currentGap = 0;
        boolean gapStarted = false;

        for (int i = 0; i < binaryN.length(); i++) {
            char current = binaryN.charAt(i);

            if (current == '1') {
           
                if (gapStarted) {
                    maxGap = Math.max(maxGap, currentGap);
                    currentGap = 0; 
                }
                gapStarted = true; 
            } else if (gapStarted) {
                currentGap++;
            }
        }

        return maxGap; 
    }


    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("enter integer");
        int number = scanner.nextInt();
        Solution solution = new Solution();
        int binaryGap = solution.solution(number);
         System.out.println("the longest binary gap is : " + binaryGap);

    }


}