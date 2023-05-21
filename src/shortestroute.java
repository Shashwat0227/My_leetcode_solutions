public class shortestroute {

    // time complexity is O(N)- As only one for loop is runned
    public static float Shortestroute (String str ){
        int x =0;
        int y= 0;
        for (int i = 0; i <str.length() ; i++) {
            char dir = str.charAt(i);
            //South
            if (dir == 'S'){
                y--;
                //North
            }else if (dir =='N'){
                y++;
                //EAST
            }else if(dir=='E'){
                x++;
                //West
            }else {
                x--;
            }
        }
        int x2 = x*x;
        int y2 =y*y;
        return (float)Math.sqrt(x2+y2);
    }
    public static void main(String[] args) {
 String path = "WNEENESENNN";
        System.out.println(Shortestroute(path));
    }
}
