import javax.management.ObjectName;
import javax.swing.*;
public class Main {

    public static void main(String[] args) {

        Function f=new Function();
        Object[] option1={"TL","YEN","NOK","Quit"};
        Object[] option2={"Try Again","Quit"};


        while (true){
            String input=(JOptionPane.showInputDialog(null,"Enter Value"));
            System.out.println(input);

            if (f.check(input)==true){

                double value=Double.parseDouble(input);

                int choise1=JOptionPane.showOptionDialog(null,"Select the currency you want  to convert",
                        "Currency Conventor",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,option1,option1[2]);
                if (choise1==0){
                    f.dollarToTl(value);

                    int choise2=JOptionPane.showOptionDialog(null,"What you wanna do? ","Currency Conventor",
                            JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,option2,option2[1]);

                    if (choise2==0){

                    }else {break;}

                }else if(choise1 ==1){
                    f.dollarToJPY(value);

                    int choise2=JOptionPane.showOptionDialog(null,"What you wanna do? ","Currency Conventor",
                            JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,option2,option2[1]);

                    if (choise2==0){

                    }else {break;}

                }else if (choise1==2){
                    f.dolarToNok(value);



                    int choise2=JOptionPane.showOptionDialog(null,"What you wanna do? ","Currency Conventor",
                            JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,option2,option2[1]);

                    if (choise2==0){

                    }else {break;}
                }

                else {break;}


            }
            else {
                JOptionPane.showMessageDialog(null,"Invalid Value");



                int choise2=JOptionPane.showOptionDialog(null,"What you wanna do? ","Currency Conventor",
                        JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.QUESTION_MESSAGE,null,option2,option2[1]);

                if (choise2==0){

                }else {break;}
            }
        }


        }
    }

