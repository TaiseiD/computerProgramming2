import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class LabActivity6SwingToDoList 
{
    public static void main(String[] args) 
    {
        SwingUtilities.invokeLater(() -> new ToDoListViewer());
    }
}

class ToDoListViewer extends JFrame 
{
    private DefaultTableModel tableModel;
    private JTable table;
    private JButton addTaskButton;
    private ToDoForm toDoForm;

    public ToDoListViewer() 
    {
        setTitle("To-Do List Viewer");
        setSize(600, 400);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        JPanel topPanel = new JPanel();
        addTaskButton = new JButton("Add Task");
        topPanel.add(addTaskButton);

        tableModel = new DefaultTableModel(new Object[]{"Task Name", "Task Description", "Status"}, 0);
        table = new JTable(tableModel);
        JScrollPane tableScrollPane = new JScrollPane(table);

        add(topPanel, BorderLayout.NORTH);
        add(tableScrollPane, BorderLayout.CENTER);

        addTaskButton.addActionListener(e -> 
        {
            if (toDoForm == null || !toDoForm.isDisplayable()) 
            {
                toDoForm = new ToDoForm(this);
            } 
            else 
            {
                toDoForm.toFront();
                toDoForm.requestFocus();
            }
        });

        setVisible(true);
    }

    public void addTask(String name, String description, String status) 
    {
        tableModel.addRow(new Object[]{name, description, status});
    }

    class ToDoForm extends JFrame 
    {
        private JTextField taskNameField;
        private JTextArea taskDescriptionArea;
        private JComboBox<String> statusComboBox;
        private JButton saveTaskButton;

        public ToDoForm(ToDoListViewer parent) 
        {
            setTitle("Add New Task");
            setSize(400, 300);
            setResizable(false);
            setLocationRelativeTo(parent);
            setLayout(null);

            JLabel nameLabel = new JLabel("Task Name:");
            nameLabel.setBounds(20, 20, 100, 25);
            add(nameLabel);

            taskNameField = new JTextField();
            taskNameField.setBounds(120, 20, 240, 25);
            add(taskNameField);

            JLabel descLabel = new JLabel("Task Description:");
            descLabel.setBounds(20, 60, 120, 25);
            add(descLabel);

            taskDescriptionArea = new JTextArea();
            JScrollPane descScrollPane = new JScrollPane(taskDescriptionArea);
            descScrollPane.setBounds(120, 60, 240, 60);
            add(descScrollPane);

            JLabel statusLabel = new JLabel("Status:");
            statusLabel.setBounds(20, 135, 100, 25);
            add(statusLabel);

            String[] statusOptions = {"Not Started", "Ongoing", "Completed"};
            statusComboBox = new JComboBox<>(statusOptions);
            statusComboBox.setBounds(120, 135, 240, 25);
            statusComboBox.setSelectedIndex(0);
            add(statusComboBox);

            saveTaskButton = new JButton("Save Task");
            saveTaskButton.setBounds(140, 200, 120, 30);
            add(saveTaskButton);

            saveTaskButton.addActionListener(e -> 
            {
                String name = taskNameField.getText().trim();
                String desc = taskDescriptionArea.getText().trim();
                String status = (String) statusComboBox.getSelectedItem();

                if (name.isEmpty() || status.isEmpty()) 
                {
                    JOptionPane.showMessageDialog(this,
                            "Please fill in Task Name and Status.",
                            "Input Error",
                            JOptionPane.ERROR_MESSAGE);
                    return;
                }

                parent.addTask(name, desc, status);
                dispose();
            });

            setVisible(true);
        }
    }
}
