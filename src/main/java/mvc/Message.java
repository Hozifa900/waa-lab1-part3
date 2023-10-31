package mvc;

public class Message {
    private String num1;
    private String num2;
    private String op;
    private double result;

    public Message(String num1, String num2, String op, double result) {
        this.num1 = num1;
        this.num2 = num2;
        this.op = op;
        this.result = result;
    }

    public String getNum1() {
        return num1;
    }

    public String getNum2() {
        return num2;
    }

    public String getOp() {
        return op;
    }

    public double getResult() {
        return result;
    }

}
