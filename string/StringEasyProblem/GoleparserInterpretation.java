package string.StringEasyProblem;

public class GoleparserInterpretation {
    public static void main(String[] args) {
        String command = "G()(al)" ;
        System.out.println(interpret(command));
    }
    public static String interpret(String command) {

        // String bulilder
        StringBuilder str = new StringBuilder() ;
        int n = command.length() ;
        for (int i = 0; i < n; i++) {

            if (command.charAt(i) == 'G'){
                str.append('G') ;
            }
            else if (command.charAt(i) == '(') {
                // check for the closer one
                if (command.charAt(i+1) == ')'){
                    str.append('o');
                    i = i+ 1 ;
                }
                else {
                    str.append("al");
                    i = i + 3 ;
                }

            }

        }
        return str.toString() ;

    }

}
