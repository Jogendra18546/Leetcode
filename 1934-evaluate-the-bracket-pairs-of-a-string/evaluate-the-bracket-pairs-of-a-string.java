class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        Map<String,String> hm=new HashMap<>();
        for(List d:knowledge){
            hm.put((String)d.get(0),(String)d.get(1));
        }
        StringBuilder res=new StringBuilder();
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c=='('){
                int j=s.indexOf(')',i+1);
                res.append(hm.getOrDefault(s.substring(i+1,j),"?"));
                i=j;
            }
            else{
                res.append(c);
            }
        }
        return res.toString();
    }
}