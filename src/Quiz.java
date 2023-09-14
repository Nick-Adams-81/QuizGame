import javax.swing.*;
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
