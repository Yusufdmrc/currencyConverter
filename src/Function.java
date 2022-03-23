import javax.swing.*;

public class Function {

    public boolean check(String input){
        try {
            double x=Double.parseDouble(input);
            if (x>=0 || x<0)
                return true;
        }catch (NumberFormatException e){
            return false;
        }
        return false;
    }
    public void dollarToTl(double value){
        double TL=value*14.83;
        JOptionPane.showMessageDialog(null,"Amount of TL:"+TL+"TL");
    }

    public void  dollarToJPY(double value){
        double JPY=value*120.95;
        JOptionPane.showMessageDialog(null,"Amount of JPY:"+JPY+"YEN");
    }

    public void dolarToNok(double value){
        double NOK=value*8.75;
        JOptionPane.showMessageDialog(null,"Amount of NOK:"+NOK+"NOK");
    }

}
