import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws ArithmeticException{

        //grid layout 5x5;
        LayoutManager layOut = new GridLayout(5,5);

        Frame frame = new Frame("mini AWT calculator");

        //svi paneli
        Panel p1 = new Panel();
        Panel p2 = new Panel();
        Panel p3 = new Panel();
        Panel p4 = new Panel();
        Panel p5 = new Panel();

        //labele
        Label lbl1 = new Label("Enter first number");
        Label lbl2 = new Label("Choose operation");
        Label lbl3 = new Label("Enter second number");
        Label lbl4 = new Label("");
        Label lbl5 = new Label("Result is: ");
        Label lbl6 = new Label();

        //textfield-ovi
        TextField textField1 = new TextField(10);
        TextField textField2 = new TextField(10);
        TextField textField3 = new TextField(10);

        Choice choice = new Choice();

        choice.add("+");
        choice.add("-");
        choice.add("*");
        choice.add("/");

        Button calculate = new Button("Calculate");

        //exit dugme
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });

        p1.add(lbl1);
        p1.add(textField1);
        //dodavanje panel-a (1) u frame
        frame.add(p1);

        p2.add(lbl2);
        p2.add(choice);
        //dodavanje panel-a (2) u frame
        frame.add(p2);

        p3.add(lbl3);
        p3.add(textField2);
        //dodavanje panel-a (3) u frame
        frame.add(p3);

        p4.add(calculate);
        //dodavanje panel-a (4) u frame
        frame.add(p4);

        p5.add(lbl5);
        p5.add(textField3);
        //dodavanje panel-a (5) u frame
        frame.add(p5);

        //
        calculate.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                int n1 = Integer.parseInt(textField1.getText());
                int n2 = Integer.parseInt(textField2.getText());
                String s = choice.getSelectedItem();

                if(s.equals("+")) {
                    textField3.setText(String.valueOf(n1 + n2));
                }

                if(s.equals("-")) {
                    textField3.setText(String.valueOf(n1 - n2));
                }

                if(s.equals("*")) {
                    textField3.setText(String.valueOf(n1 * n2));
                }

                if(s.equals("/")) {
                    textField3.setText(String.valueOf(n1 / n2));
                }

            }
        });

        frame.setLayout(layOut);
        frame.setSize(300, 200);
        frame.setVisible(true);
    }
}