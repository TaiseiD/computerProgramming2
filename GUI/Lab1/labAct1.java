// All the imports that is needed in this program
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class labAct1{
    public static void main(String[] args) {
        //Setting up the frame and panels.
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();

        //Tweeks for the frame.
        frame.setSize(390,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Panel is where the things are placed.
        frame.add(panel);
        panel.setLayout(null);

        frame.setTitle("Employee Information");

        //JLabels are for text and JTextField are for input.
        JLabel firstNameLabel = new JLabel("Enter your first name : ");
        firstNameLabel.setBounds(10, 20, 200, 25);
        panel.add(firstNameLabel);

        JTextField firstNameText = new JTextField();
        firstNameText.setBounds(150, 20, 165, 25);
        panel.add(firstNameText);

        JLabel lastNameLabel = new JLabel("Enter your last name : ");
        lastNameLabel.setBounds(10, 60, 200, 25);
        panel.add(lastNameLabel);

        JTextField lastNameText = new JTextField();
        lastNameText.setBounds(150, 60, 165, 25);
        panel.add(lastNameText);

        JLabel ageLabel = new JLabel("Enter your age : ");
        ageLabel.setBounds(10, 100, 200, 25);
        panel.add(ageLabel);

        JTextField ageText = new JTextField();
        ageText.setBounds(150, 100, 165, 25);
        panel.add(ageText);

        JLabel hoursWorkedLabel = new JLabel("Enter hours worked : ");
        hoursWorkedLabel.setBounds(10, 140, 200, 25);
        panel.add(hoursWorkedLabel);

        JTextField hoursWorkedText = new JTextField();
        hoursWorkedText.setBounds(150, 140, 165, 25);
        panel.add(hoursWorkedText);

        JLabel hourlyWageLabel = new JLabel("Enter hourly wage : ");
        hourlyWageLabel.setBounds(10, 180, 200, 25);
        panel.add(hourlyWageLabel);

        JTextField hourlyWageText = new JTextField();
        hourlyWageText.setBounds(150,180, 165, 25);
        panel.add(hourlyWageText);

        //The button where the ActionListener is placed.
        JButton submit = new JButton("Enter Information");
        submit.setBounds(120, 220, 150, 25);
        panel.add(submit);

        //This is the program that will run after the button is clicked.
        submit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                
                //Setting up the variables.
                String firstName = firstNameText.getText();
                String lastName = lastNameText.getText();
                int age = Integer.parseInt(ageText.getText());
                float hoursWorked = Float.parseFloat(hoursWorkedText.getText());
                float hourlyWage = Float.parseFloat(hourlyWageText.getText());
                float result = hoursWorked * hourlyWage;
                double roundUpResult = Math.round(result * 100.00) / 100.00;

                //So that all of the JLabels and JTextFields are cleared before printing the newer ones.
                panel.removeAll();

                //Another JLabels for the new information.
                JLabel employeeInfo = new JLabel("Employee Information", SwingConstants.CENTER);
                employeeInfo.setBounds(10, 20, 360, 25);
                panel.add(employeeInfo);

                JLabel employeeName = new JLabel("Employee Name:  " + firstName + " " + lastName);
                employeeName.setBounds(10, 70, 200, 25);
                panel.add(employeeName);

                JLabel employeeAge = new JLabel("Age:  " + age + " years old");
                employeeAge.setBounds(10, 110, 200, 25);
                panel.add(employeeAge);

                JLabel dailySalaryLabel = new JLabel("Daily Salary (PHP):  " + roundUpResult);
                dailySalaryLabel.setBounds(10, 150, 200, 25);
                panel.add(dailySalaryLabel);

                //Function to update the panel.
                panel.revalidate();
                panel.repaint();
            }
        });

        //This are placed at the end of the program, so everything that we add will be shown.
        frame.setVisible(true);}
}
