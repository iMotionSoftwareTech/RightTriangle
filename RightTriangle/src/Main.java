//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = Integer.parseInt(args[2]);

        boolean isRightTriangle = (Math.pow(a, 2) + Math.pow(b, 2)) == Math.pow(c, 2);
        System.out.println(isRightTriangle);
    }
}