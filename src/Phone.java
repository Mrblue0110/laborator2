import javax.swing.*;

public class Phone {
    private String brand;
    private int year;
    private double processorspeed;



    public void getBrand() {
        JOptionPane.showMessageDialog(null, "Brand:" + brand);
    }

    public void setBrand() {
        this.brand = JOptionPane.showInputDialog("Insert the brand of phone:");
    }

    public void getYear() {
        JOptionPane.showMessageDialog(null, "Year" + year);
    }

    public void setYear() {
     this.year = Integer.parseInt(JOptionPane.showInputDialog("Insert the phones launch year:"));
    }

    public void getProcessorspeed() {
        JOptionPane.showMessageDialog(null, "Processor speed" + processorspeed);
    }

    public void setProcesorspeed() {
        this.processorspeed = Double.parseDouble(JOptionPane.showInputDialog("Insert phones processor speed:"));
    }

    @Override
    public String toString() {
        return "Phone{" +
                "brand='" + brand + '\'' +
                ", year=" + year +
                ", processorspeed=" + processorspeed +
                '}';
    }
}





