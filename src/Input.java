import java.util.*;
class Input {
    ChangeFormulaToArray ChangedArray = new ChangeFormulaToArray();
    public String[] run() {
        System.out.print("input >>> ");
        Scanner scan = new Scanner(System.in);

        String formula = scan.next();

        return ChangedArray.changeStrToArray(formula);
    }
}
