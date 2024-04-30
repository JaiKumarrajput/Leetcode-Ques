class Solution {
    public String removeDigit(String number, char digit) {
            int n=number.length();
    ArrayList<String>al=new ArrayList<>();
    for(int i=0;i<number.length();i++){
        String ne="";
       if(number.charAt(i)==digit){
           ne+=number.substring(0,i)+number.substring(i+1,n);
        
      al.add(ne);
    }}
    Collections.sort(al);
    return al.get(al.size()-1);
    
    }
}