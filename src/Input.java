import java.util.*;
class Input extends ChangeFortToArray {
    ChangeFortToArray ChangedArray = new ChangeFortToArray();
    public String[] run() {
        System.out.print("input >>> ");
        Scanner scan = new Scanner(System.in);

        String fort = scan.next();

        return ChangedArray.StrToArrayChange(fort);
    }
}
