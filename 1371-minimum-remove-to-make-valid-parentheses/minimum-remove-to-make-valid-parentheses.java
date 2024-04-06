class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Integer> stack=new Stack<>();
        String ans="";
        StringBuilder sb=new StringBuilder(s);
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='(')
                stack.push(i);
            else if(s.charAt(i)==')')
            {
                if(!stack.isEmpty())
                {
                    stack.pop();
                }
                else
                {
                    sb.setCharAt(i,'*');
                }
            }
        }
        while(!stack.isEmpty())
        {
            sb.setCharAt(stack.pop(),'*');
        }
        for(int i=0;i<sb.length();i++)
        {
            if(sb.charAt(i)!='*')
                ans+=sb.charAt(i);
        }
        return ans;
    }
}