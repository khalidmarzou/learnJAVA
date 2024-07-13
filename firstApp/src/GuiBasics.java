import javax.swing.JOptionPane;

public class GuiBasics {
    
    public static void main (String[] args) {
        String name = JOptionPane.showInputDialog("Enter Your name pls : ");
        JOptionPane.showMessageDialog(null, "Hello : " + name);

        int age = Integer.parseInt(JOptionPane.showInputDialog("Enter Ur age : "));
        JOptionPane.showMessageDialog(null,name + " Ur re : " + age + " years old");
    }
}
