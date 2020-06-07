package daydaychange.p00657;

public class RobotReturnToOrigin_ZJK {
    public boolean judgeCircle(String moves) {
        int x=0;
        int y=0;
        for(char xx: moves.toCharArray()){
            if(xx=='L'){
                x++;
            }
            else if(xx=='R'){
                x--;
            }
            else if(xx=='U'){
                y++;
            }
            else {
                y--;
            }
        }
        return x==0 && y==0;
    }

    // nice solution
    public boolean judgeCircle1(String moves) {
        int[] map = new int[26];
        for(char c : moves.toCharArray()){
            map[c - 'A']++;
        }
        if(map['R'-'A'] == map['L'-'A'] && map['U'-'A'] == map['D'-'A']){return true;}
        return false;
    }


}
