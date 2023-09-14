import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Quiz implements ActionListener {

    String[] questions = {
            "Which company created Java?",
            "Which year was Java created?",
            "What was Java originally called?"
    };

    String[][] options = {
            {"Microsoft", "Sun Microsystems", "Starbucks", "Alphabet"},
            {"1989", "1972", "1999", "1996"},
            {"Mocha", "Apple", "Latte", "Oak"}
    };



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
