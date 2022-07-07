class Run extends Input {
    public static void main(String[] args) {
        Run i = new Run();
        AO arithmeticOperations = new AO();

        String[] fort = i.run();

        arithmeticOperations.mul(fort);
        arithmeticOperations.dis(fort);
        arithmeticOperations.add(fort);
        arithmeticOperations.sub(fort);

        System.out.print(">>> "+i.getResult(fort));
    }
    private double getResult(String[] fortArray) {

        int index=0;
        double result=0;

        while (index<fortArray.length-1) {
            if (fortArray[index]!=null) {
                result = Double.parseDouble(fortArray[index]);
                break;
            } else {
                index++;
            }
        }
        return result;
        }
    }

