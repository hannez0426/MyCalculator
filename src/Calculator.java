import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {

    private double total1 = 0.0;
    private double total2 = 0.0;
    private char math_operator;
    private JPanel mainCalc;
    private JTextField txtDisplay;
    private JButton btn1;
    private JButton btnBack;
    private JButton btn7;
    private JButton btn4;
    private JButton btnCE;
    private JButton btn8;
    private JButton btn5;
    private JButton btn2;
    private JButton btnC;
    private JButton btn9;
    private JButton btn6;
    private JButton btn3;
    private JButton btnDot;
    private JButton btnDivide;
    private JButton btnMultiply;
    private JButton btnSub;
    private JButton btnSum;
    private JButton btnEquals;
    private JButton btn0;

    private void getMath_Operator (String btnText){
        math_operator = btnText.charAt(0);
        total1 = total1 + Double.parseDouble(txtDisplay.getText());
        txtDisplay.setText("");
    }

    public Calculator() {
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnOneText = txtDisplay.getText() + btn1.getText();
                txtDisplay.setText(btnOneText);
            }
        });


        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnTwoText = txtDisplay.getText() + btn2.getText();
                txtDisplay.setText(btnTwoText);
            }
        });


        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnThreeText = txtDisplay.getText() + btn3.getText();
                txtDisplay.setText(btnThreeText);
            }
        });


        btn4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnFourText = txtDisplay.getText() + btn4.getText();
                txtDisplay.setText(btnFourText);
            }
        });


        btn5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnFiveText = txtDisplay.getText() + btn5.getText();
                txtDisplay.setText(btnFiveText);
            }
        });


        btn6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSixText = txtDisplay.getText() + btn6.getText();
                txtDisplay.setText(btnSixText);
            }
        });


        btn7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnSevenText = txtDisplay.getText() + btn7.getText();
                txtDisplay.setText(btnSevenText);
            }
        });


        btn8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnEightText = txtDisplay.getText() + btn8.getText();
                txtDisplay.setText(btnEightText);
            }
        });


        btn9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnNineText = txtDisplay.getText() + btn9.getText();
                txtDisplay.setText(btnNineText);
            }
        });


        btn0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String btnZeroText = txtDisplay.getText() + btn0.getText();
                txtDisplay.setText(btnZeroText);
            }
        });
        btnSum.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_txt = btnSum.getText();
                getMath_Operator(button_txt);
            }
        });

        btnSub.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_txt = btnSub.getText();
                getMath_Operator(button_txt);
            }
        });


        btnMultiply.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_txt = btnMultiply.getText();
                getMath_Operator(button_txt);
            }
        });


        btnDivide.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String button_txt = btnDivide.getText();
                getMath_Operator(button_txt);
            }
        });
        btnEquals.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                switch (math_operator){
                    case '+':
                        total2 = total1 + Double.parseDouble(txtDisplay.getText());
                        break;
                    case '-':
                        total2 = total1 - Double.parseDouble(txtDisplay.getText());
                        break;
                    case '*':
                        total2 = total1 * Double.parseDouble(txtDisplay.getText());
                        break;
                    case '/':
                        total2 = total1 / Double.parseDouble(txtDisplay.getText());
                        break;
                }
                txtDisplay.setText(Double.toString(total2));
                total1 = 0;
            }
        });
        btnC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                total2 = 0;
                txtDisplay.setText("");
            }
        });


        btnDot.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(txtDisplay.getText().equals("")){
                    txtDisplay.setText("0.");
                } else if (txtDisplay.getText().contains(".")){
                    btnDot.setEnabled(false);
                } else{
                    String btnDotText = txtDisplay.getText() + btnDot.getText();
                    txtDisplay.setText(btnDotText);
                }
                btnDot.setEnabled(true);
            }
        });


        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText(txtDisplay.getText().substring(0, txtDisplay.getText().length() - 1));
            }
        });
        btnCE.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtDisplay.setText("Calculating...");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculator");
        frame.setContentPane(new Calculator().mainCalc);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
