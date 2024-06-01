class Solution {
    public int scoreOfString(String s) {
        char a,b;
        int sum=0;
        for(int i=0;i<s.length()-1;i++){
            a=s.charAt(i);
            b=s.charAt(i+1);
            sum=sum+Math.abs(a-b);
        }
        return sum;
    }
}//self