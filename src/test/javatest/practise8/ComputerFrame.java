package test.javatest.practise8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ComputerFrame extends Frame implements ActionListener {
    TextField textOne, textTwo, textResult;
    Button getProblem, giveAnswer;
    Label operatorLabel, message;
    Teacher teacher;

    ComputerFrame(String s) {
        super(s);
        teacher = new Teacher();
        setLayout(new FlowLayout());
        textOne = new TextField(10);
        textTwo = new TextField(10);
        textResult = new TextField(10);
        operatorLabel = new Label("+");
        message = new Label("你还没有回答呢");
        getProblem = new Button("获取题目");
        giveAnswer = new Button("确认答案");
        add(getProblem);
        add(textOne);
        add(operatorLabel);
        add(textTwo);
        add(new Label("="));
        add(textResult);
        add(giveAnswer);
        add(message);
        textResult.requestFocus();
        textOne.setEditable(false);//该方法设置文本框的可编辑性
        textTwo.setEditable(false);
        getProblem.addActionListener(this);//创建监视器
        giveAnswer.addActionListener(this);
        textResult.addActionListener(this);
        setBounds(100, 100, 450, 100);//设置出现屏幕上时的初始位置
        setLocationRelativeTo(null);//居中
        setVisible(true);//窗口的可见性
        validate();
        addWindowFocusListener(new WindowAdapter() {
                                   public void windowClosing(WindowEvent e) {
                                       System.exit(0);
                                   }
                               }
        );
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == getProblem) {
            int number1 = teacher.giveNumberOne(100);
            int number2 = teacher.giveNumberTwo(100);
            String operator = teacher.giveOperator();
            textOne.setText("" + number1);//设置文本框中为参数字符串指定的文本
            textTwo.setText("" + number2);
            operatorLabel.setText(operator);
            message.setText("请回答");
            textResult.setText(null);
        }
        if (e.getSource() == giveAnswer) {
            String answer = textResult.getText();
            try {
                int result = Integer.parseInt(answer);
                if (teacher.getRight(result) == true) {
                    message.setText("你回答正确");
                } else {
                    message.setText("你回答错误");
                }
            } catch (NumberFormatException ex) {
                message.setText("请输入数字字符");
            }
        }
        textResult.requestFocus();
        validate();
    }
}