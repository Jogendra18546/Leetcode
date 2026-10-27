class Solution {
    public String generateTag(String caption) {
        caption.trim();
        StringBuilder res= new StringBuilder();
        res.append('#');
         boolean cap= false;
        for(int i=0;i<caption.length();i++){
            char ch=caption.charAt(i);
            if(ch==' '){
                cap=res.length()>1;
                continue;
            }
            if(ch>='A'&&ch<='Z'){
                ch+=32;
            }
            if(cap){
                ch-=32;
                cap=false;
            }
                res.append(ch);
                            if(res.length()==100) break;

            
        }
        return res.toString();
    }
}