package factory.simpleFactory;

public abstract class Operation {
    private double num1 = 0;
    private double num2 = 0;
    private double res;

    public Operation() {
    }

    public Operation(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public String toString() {
        return "Operation{" +
                "num1=" + num1 +
                ", num2=" + num2 +
                ", res=" + res +
                '}';
    }

    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    public abstract double getRes();
}
