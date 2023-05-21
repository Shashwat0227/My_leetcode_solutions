public class q2696 {
    public int minLength(String s) {
        StringBuilder sb = new StringBuilder(s);
        while(s.contains("AB") || s.contains("CD")){
            if(s.contains("AB"))  {s = s.substring(0,s.indexOf("AB"))+s.substring(s.indexOf("AB")+2);
            }
            if(s.contains("CD")) {   s = s.substring(0,s.indexOf("CD"))+s.substring(s.indexOf("CD")+2);
            }
        }
        return s.length();
    }
}
