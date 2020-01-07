public class MyMoney {

    public static void main(String[] args) {
        int[] money = {7, 3, 1100, 49};
        doubleMyMoney(money);
        for (int x : money) {
            System.out.println(x);
        }
    }

    public static void doubleMyMoney(int[] m) {
        for (int i = 0; i < m.length; i++) {
            m[i] *= 2;
        }
    }

}
