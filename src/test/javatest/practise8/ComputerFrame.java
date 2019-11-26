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
        message = new Label("�㻹û�лش���");
        getProblem = new Button("��ȡ��Ŀ");
        giveAnswer = new Button("ȷ�ϴ�");
        add(getProblem);
        add(textOne);
        add(operatorLabel);
        add(textTwo);
        add(new Label("="));
        add(textResult);
        add(giveAnswer);
        add(message);
        textResult.requestFocus();
        textOne.setEditable(false);//�÷��������ı���Ŀɱ༭��
        textTwo.setEditable(false);
        getProblem.addActionListener(this);//����������
        giveAnswer.addActionListener(this);
        textResult.addActionListener(this);
        setBounds(100, 100, 450, 100);//���ó�����Ļ��ʱ�ĳ�ʼλ��
        setLocationRelativeTo(null);//����
        setVisible(true);//���ڵĿɼ���
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
            textOne.setText("" + number1);//�����ı�����Ϊ�����ַ���ָ�����ı�
            textTwo.setText("" + number2);
            operatorLabel.setText(operator);
            message.setText("��ش�");
            textResult.setText(null);
        }
        if (e.getSource() == giveAnswer) {
            String answer = textResult.getText();
            try {
                int result = Integer.parseInt(answer);
                if (teacher.getRight(result) == true) {
                    message.setText("��ش���ȷ");
                } else {
                    message.setText("��ش����");
                }
            } catch (NumberFormatException ex) {
                message.setText("�����������ַ�");
            }
        }
        textResult.requestFocus();
        validate();
    }
}