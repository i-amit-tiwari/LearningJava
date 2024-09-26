import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingFormExample {
    public static void main(String[] args) {
        // Create a new JFrame
        JFrame frame = new JFrame("User Registration Form");

        // Set the size of the frame
        frame.setSize(350, 250);

        // Close the application when the user clicks the close button
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create a panel to hold the form components
        JPanel panel = new JPanel();
        frame.add(panel);
        placeComponents(panel);

        // Set the frame to be visible
        frame.setVisible(true);
    }

    private static void placeComponents(JPanel panel) {
        // Set the layout manager to null
        panel.setLayout(null);

        // Create and place the "Name" label
        JLabel userLabel = new JLabel("Name:");
        userLabel.setBounds(10, 20, 80, 25);
        panel.add(userLabel);

        // Create and place the text field for the "Name"
        JTextField userText = new JTextField(20);
        userText.setBounds(100, 20, 165, 25);
        panel.add(userText);

        // Create and place the "Email" label
        JLabel emailLabel = new JLabel("Email:");
        emailLabel.setBounds(10, 50, 80, 25);
        panel.add(emailLabel);

        // Create and place the text field for the "Email"
        JTextField emailText = new JTextField(20);
        emailText.setBounds(100, 50, 165, 25);
        panel.add(emailText);

        // Create and place the "Password" label
        JLabel passwordLabel = new JLabel("Password:");
        passwordLabel.setBounds(10, 80, 80, 25);
        panel.add(passwordLabel);

        // Create and place the password field
        JPasswordField passwordText = new JPasswordField(20);
        passwordText.setBounds(100, 80, 165, 25);
        panel.add(passwordText);

        // Create and place the "Submit" button
        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(100, 120, 80, 25);
        panel.add(submitButton);

        // Action listener for the submit button
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Get the values from the form fields
                String name = userText.getText();
                String email = emailText.getText();
                String password = new String(passwordText.getPassword());

                // Display the entered data in a dialog box
                JOptionPane.showMessageDialog(panel, 
                    "Name: " + name + "\nEmail: " + email + "\nPassword: " + password, 
                    "Form Data", 
                    JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }
}
