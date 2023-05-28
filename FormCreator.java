import javax.swing.*;
import java.awt.event.*;
import java.io.*;

public class FormCreator extends JFrame {
    private JLabel nameLabel;
    private JTextField nameField;
    private JLabel ageLabel;
    private JTextField ageField;
    private JButton submitButton;

    public FormCreator() {
        

        // Create the form components
        nameLabel = new JLabel("Name:");
        nameField = new JTextField(20);
        ageLabel = new JLabel("Age:");
        ageField = new JTextField(3);
        submitButton = new JButton("Submit");

        // Add the components to the form
        JPanel panel = new JPanel();
        panel.add(nameLabel);
        panel.add(nameField);
        panel.add(ageLabel);
        panel.add(ageField);
        panel.add(submitButton);
        add(panel);

        // Add a listener to the submit button
        submitButton.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                // Get the data from the form
                String name = nameField.getText();
                int age = Integer.parseInt(ageField.getText());

                // Write the data to a file
                try {
                    FileWriter writer = new FileWriter("form_data.txt");
                    writer.write("Name: " + name + "\n");
                    writer.write("Age: " + age + "\n");
                    writer.close();
                    JOptionPane.showMessageDialog(FormCreator.this, "Form data saved successfully!");
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(FormCreator.this, "Error writing to file: " + ex.getMessage());
                }
            }
        });

        // Set the window size and make it visible
        setSize(300, 150);
        setVisible(true);
    }

    public static void main(String[] args) {
        FormCreator fc=new FormCreator();
    }
}
