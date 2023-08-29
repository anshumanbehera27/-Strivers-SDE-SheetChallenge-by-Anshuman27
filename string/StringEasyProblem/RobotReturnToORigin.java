package string.StringEasyProblem;

public class RobotReturnToORigin {
    public boolean judgeCircle(String moves) {
        // we have to move the two driction
        int UD  = 0  ;
        int RL = 0 ;
        // itrate one time
        for (int i = 0; i < moves.length(); i++) {
            char ch = moves.charAt(i) ;
            if (ch == 'U') UD++ ;
            else if (ch == 'D') UD-- ;
            else if (ch == 'R') RL++ ;
            else  RL-- ;
        }

        if (UD == 0 && RL == 0) return  true  ;
        return  false ;

    }

}
