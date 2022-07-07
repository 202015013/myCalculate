import java.util.*;
class Input extends ChangeFormulaToArray {
    ChangeFormulaToArray ChangedArray = new ChangeFormulaToArray();
    public String[] run() {
        System.out.print("input >>> ");
        Scanner scan = new Scanner(System.in);

        String formula = scan.next();

        return ChangedArray.StrToArrayChange(formula);
    }
}
