class Run extends Input {
    public static void main(String[] args) {
        Run i = new Run();
        AO arithmeticOperations = new AO();

        String[] formula = i.run();

        arithmeticOperations.mul(formula);
        arithmeticOperations.dis(formula);
        arithmeticOperations.add(formula);
        arithmeticOperations.sub(formula);
        try {
            System.out.print(">>> " + i.getResult(formula));
        }catch (IllegalArgumentException e){
            System.out.println("you input wrong formula");
        }
    }
    private double getResult(String[] formulaArray) throws IllegalArgumentException{
        int index=0;
        double result=0;

        while (index<formulaArray.length-1) {
            if (formulaArray[index]!=null) {
                result = Double.parseDouble(formulaArray[index]);
                break;
            } else {
                index++;
            }
        }
        return result;
        }
    }

