class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for(int i=low; i<=high;i++){

            String number = Integer.toString(i);

            if(number.length() %2 != 0)continue;

            int sum = 0;
            int sum1 = 0;
            for(int j=0;j<number.length()/2;j++){
                sum += number.charAt(j) - '0';
            }
            for(int k=number.length()/2;k<number.length();k++){
                    sum1 +=number.charAt(k)-'0';
            }

            if(sum == sum1)count++;
        }

        return count;
        
    }
}