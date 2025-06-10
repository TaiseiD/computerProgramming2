import java.awt.*;
import java.awt.event.*;

public class LabActivity5QuizAppAWT extends Frame implements ActionListener 
{

    Label questionLabel;
    Label errorLabel;
    CheckboxGroup choiceGroup;
    Checkbox[] options = new Checkbox[4];
    Button nextButton;
    Panel choicesPanel;

    int current = 0;
    int score = 0;

    String[] questions = 
    {
        "What is the capital of France?",
        "Which language is used for Android development?",
        "What is the result of 2 + 2 * 2?"
    };

    String[][] answers = 
    {
        {"A. Paris", "B. Rome", "C. Berlin", "D. Madrid"},
        {"A. Swift", "B. Java", "C. Python", "D. Kotlin"},
        {"A. 6", "B. 8", "C. 4", "D. 10"}
    };

    String[] correctAnswers = 
    {
        "A. Paris",
        "B. Java",
        "A. 6"
    };

    public LabActivity5QuizAppAWT() 
    {
        setTitle("Quiz App");
        setSize(500, 300);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);
        setResizable(false);

        addWindowListener(new WindowAdapter() 
        {
            public void windowClosing(WindowEvent we) 
            {
                System.exit(0);
            }
        });

        questionLabel = new Label("", Label.CENTER);
        questionLabel.setFont(new Font("Arial", Font.BOLD, 16));
        add(questionLabel, BorderLayout.NORTH);

        choicesPanel = new Panel(new GridLayout(2, 2, 10, 10));
        choiceGroup = new CheckboxGroup();

        for (int i = 0; i < 4; i++) 
        {
            options[i] = new Checkbox("", choiceGroup, false);
            options[i].setForeground(Color.BLUE); 
            choicesPanel.add(options[i]);
        }
        add(choicesPanel, BorderLayout.CENTER);

        Panel bottomPanel = new Panel(new BorderLayout());

        errorLabel = new Label(" ", Label.CENTER);
        errorLabel.setForeground(Color.RED);
        bottomPanel.add(errorLabel, BorderLayout.NORTH);

        nextButton = new Button("Next");
        nextButton.setFont(new Font("Arial", Font.BOLD, 14));
        nextButton.addActionListener(this);
        bottomPanel.add(nextButton, BorderLayout.SOUTH);

        add(bottomPanel, BorderLayout.SOUTH);

        displayQuestion();
        setVisible(true);
    }

    public void displayQuestion() {
        questionLabel.setText(questions[current]);
        for (int i = 0; i < 4; i++) {
            options[i].setLabel(answers[current][i]);
            options[i].setEnabled(true);
            choiceGroup.setSelectedCheckbox(null);
        }
        errorLabel.setText(" ");
    }

    @Override
    public void actionPerformed(ActionEvent e) 
    {
        Checkbox selectedCheckbox = choiceGroup.getSelectedCheckbox();

        if (selectedCheckbox == null) 
        {
            errorLabel.setText("Please select an answer.");
            return;
        }

        String selected = selectedCheckbox.getLabel();
        if (selected.equals(correctAnswers[current])) 
        {
            score++;
        }
        current++;

        if (current < questions.length) 
        {
            displayQuestion();
        } 
        else 
        {
            endQuiz();
        }
    }

    public void endQuiz() 
    {
        questionLabel.setText("Quiz Completed! Your Score: " + score + " out of " + questions.length);
        for (Checkbox cb : options) 
        {
            cb.setEnabled(false);
        }
        nextButton.setEnabled(false);
        errorLabel.setText(" ");
    }

    public static void main(String[] args) 
    {
        new LabActivity5QuizAppAWT();
    }
}
