import java.util.concurrent.ForkJoinPool;

public class IntsCalculator implements Ints{

    private Calculator calc = new Calculator();

    public IntsCalculator() {

    }

    public int sum(int arg0, int arg1) {
        Calculator.Formula formula = calc.newFormula();
        formula.addOperand(arg0);
        formula.addOperand(arg1);
        formula.calculate(Calculator.Operation.SUM);

        return (int) formula.result();
    }

    public int mult(int arg0, int arg1) {
        Calculator.Formula formula = calc.newFormula();
        formula.addOperand(arg0);
        formula.addOperand(arg1);
        formula.calculate(Calculator.Operation.MULT);

        return (int) formula.result();
    }

    public int pow(int a, int b){
        Calculator.Formula formula = calc.newFormula();
        formula.addOperand(a);
        formula.addOperand(b);
        formula.calculate(Calculator.Operation.POW);

        return (int) formula.result();
    }
}
