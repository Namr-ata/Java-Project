import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class StringManipulation extends JFrame {

    private JTextField inputTextField;
    private JLabel messageLabel;
    private JButton checkPalindromeButton, reverseButton, findVowelsButton;

    public StringManipulation() {
        // Set up the JFrame
        setTitle("String Manipulation GUI");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 200);
        setLayout(new GridLayout(4, 1));

        // Create and add components
        messageLabel = new JLabel("Input any String");
        inputTextField = new JTextField();

        checkPalindromeButton = new JButton("Check Palindrome");
        reverseButton = new JButton("Reverse");
        findVowelsButton = new JButton("Find Vowels");

        // Add components to the JFrame
        add(messageLabel);
        add(inputTextField);
        add(checkPalindromeButton);
        add(reverseButton);
        add(findVowelsButton);

        // Add action listeners to the buttons
        checkPalindromeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                checkPalindrome();
            }
        });

        reverseButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                reverseString();
            }
        });

        findVowelsButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                findVowels();
            }
        });
    }

    private void checkPalindrome() {
        String input = inputTextField.getText().toLowerCase();
        String reversed = new StringBuilder(input).reverse().toString();

        if (input.equals(reversed)) {
            messageLabel.setText("Palindrome: Yes");
        } else {
            messageLabel.setText("Palindrome: No");
        }
    }

    private void reverseString() {
        String input = inputTextField.getText();
        String reversed = new StringBuilder(input).reverse().toString();
        messageLabel.setText("Reversed String: " + reversed);
    }

    private void findVowels() {
        String input = inputTextField.getText().toLowerCase();
        StringBuilder vowels = new StringBuilder();

        for (char c : input.toCharArray()) {
            if ("aeiou".indexOf(c) != -1) {
                vowels.append(c);
            }
        }

        messageLabel.setText("Vowels: " + vowels.toString());
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            StringManipulation gui = new StringManipulation();
            gui.setVisible(true);
        });
    }
}
