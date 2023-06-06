package calculator;

public class CalculatorLogger implements Calculable{

    private Logger log;
    private Calculable calc;

    public CalculatorLogger(Logger log, Calculable calc) {
        this.log = log;
        this.calc = calc;
        log.log("Первый аргумент равен: " + calc.getResult());
    }

    @Override
    public Calculable sum(int arg) {
        log.log("Суммируем: " + arg);
        return calc.sum(arg);
    }

    @Override
    public Calculable multi(int arg) {
        log.log("Умножаем: " + arg);
        return null;
    }

    @Override
    public int getResult() {
        int temp = calc.getResult();
        log.log("Полученный результат: " + temp);
        return temp;
    }
    
}
