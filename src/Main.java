import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        int x = Integer.parseInt(JOptionPane.showInputDialog("how many phones would you like to insert?"));
        for (int i = 1; i <= x; i++) {
            newPhone(i);
        }
    }

    private static void newPhone(int i) {
        Phone phone = new Phone();
        phone.setBrand();
        phone.setYear();
        phone.setProcesorspeed();
        JOptionPane.showMessageDialog(null, phone.toString());

    }
}
