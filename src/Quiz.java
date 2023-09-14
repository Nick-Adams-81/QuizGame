import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Quiz implements ActionListener {

    String[] questions = {
            "Which company created Java?",
            "Which year was Java created?",
            "What was Java originally called?",
            "Who is credited with creating Java?"
    };

    String[][] options = {
            {"Microsoft", "Sun Microsystems", "Starbucks", "Alphabet"},
            {"1989", "1972", "1996", "1999"},
            {"Mocha", "Apple", "Latte", "Oak"},
            {"Steve Jobs", "Bill Gates", "James Gosling", "Mark Zuccerberg"}
    };

    char[] answers = {
            'B',
            'C',
            'D',
            'C'
    };

    char guess;
    char answer;
    int index;
    int correct_guesses = 0;
    int total_questions = questions.length;
    int result;
    int seconds = 10;

    JFrame frame = new JFrame();
    JTextField textField = new JTextField();
    JTextArea textArea = new JTextArea();
    JButton button_a = new JButton();
    JButton button_b = new JButton();
    JButton button_c = new JButton();
    JButton button_d = new JButton();
    JLabel answer_label_a = new JLabel();
    JLabel answer_label_b = new JLabel();
    JLabel answer_label_c = new JLabel();
    JLabel answer_label_d = new JLabel();

    JLabel time_label = new JLabel();
    JLabel seconds_left = new JLabel();

    JTextField number_right = new JTextField();
    JTextField percentage = new JTextField();


    public Quiz() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(650, 650);
        frame.getContentPane().setBackground(new Color(50, 50, 50));
        frame.setTitle("Quiz Game");
        frame.setLayout(null);
        frame.setResizable(false);

        textField.setBounds(0, 0, 650, 50);
        textField.setBackground(new Color(25, 25, 25));
        textField.setForeground(new Color(25, 255, 0));
        textField.setFont(new Font("Ink Free", Font.PLAIN, 30));
        textField.setBorder(BorderFactory.createBevelBorder(1));
        textField.setHorizontalAlignment(JTextField.CENTER);
        textField.setEditable(false);

        textArea.setBounds(0, 50, 650, 50);
        textArea.setLineWrap(true);
        textArea.setWrapStyleWord(true);
        textArea.setBackground(new Color(25, 25, 25));
        textArea.setForeground(new Color(25, 255, 0));
        textArea.setFont(new Font("MV Boli", Font.PLAIN, 25));
        textArea.setBorder(BorderFactory.createBevelBorder(1));
        textArea.setEditable(false);

        button_a.setBounds(0, 100, 100, 100);
        button_a.setFont(new Font("MV Boli", Font.PLAIN, 35));
        button_a.setFocusable(false);
        button_a.addActionListener(this);
        button_a.setText("A");

        button_b.setBounds(0, 200, 100, 100);
        button_b.setFont(new Font("MV Boli", Font.PLAIN, 35));
        button_b.setFocusable(false);
        button_b.addActionListener(this);
        button_b.setText("B");

        button_c.setBounds(0, 300, 100, 100);
        button_c.setFont(new Font("MV Boli", Font.PLAIN, 35));
        button_c.setFocusable(false);
        button_c.addActionListener(this);
        button_c.setText("C");

        button_d.setBounds(0, 400, 100, 100);
        button_d.setFont(new Font("MV Boli", Font.PLAIN, 35));
        button_d.setFocusable(false);
        button_d.addActionListener(this);
        button_d.setText("D");

        answer_label_a.setBounds(125, 100, 500, 100);
        answer_label_a.setBackground(new Color(50, 50, 50));
        answer_label_a.setForeground(new Color(25, 255, 0));
        answer_label_a.setFont(new Font("MV Boli", Font.PLAIN, 35));
        answer_label_a.setText("A test");

        answer_label_b.setBounds(125, 200, 500, 100);
        answer_label_b.setBackground(new Color(50, 50, 50));
        answer_label_b.setForeground(new Color(25, 255, 0));
        answer_label_b.setFont(new Font("MV Boli", Font.PLAIN, 35));
        answer_label_b.setText("B test");

        answer_label_c.setBounds(125, 300, 500, 100);
        answer_label_c.setBackground(new Color(50, 50, 50));
        answer_label_c.setForeground(new Color(25, 255, 0));
        answer_label_c.setFont(new Font("MV Boli", Font.PLAIN, 35));
        answer_label_c.setText("C test");

        answer_label_d.setBounds(125, 400, 500, 100);
        answer_label_d.setBackground(new Color(50, 50, 50));
        answer_label_d.setForeground(new Color(25, 255, 0));
        answer_label_d.setFont(new Font("MV Boli", Font.PLAIN, 35));
        answer_label_d.setText("D test");

        seconds_left.setBounds(535, 510, 100, 100);
        seconds_left.setBackground(new Color(25, 25, 25));
        seconds_left.setForeground(new Color(255, 0, 0));
        seconds_left.setFont(new Font("Ink Free", Font.PLAIN, 60));
        seconds_left.setBorder(BorderFactory.createBevelBorder(1));
        seconds_left.setOpaque(true);
        seconds_left.setHorizontalAlignment(JTextField.CENTER);
        seconds_left.setText(String.valueOf(seconds));

        frame.add(seconds_left);
        frame.add(answer_label_a);
        frame.add(answer_label_b);
        frame.add(answer_label_c);
        frame.add(answer_label_d);
        frame.add(button_a);
        frame.add(button_b);
        frame.add(button_c);
        frame.add(button_d);
        frame.add(textField);
        frame.add(textArea);
        frame.setVisible(true);
    }

    public void nextQuestion() {

    }


    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public void displayAnswer() {

    }

    public void results() {

    }
}
