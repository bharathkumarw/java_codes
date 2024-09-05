package numberguessing;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class NumberGuessingGameGUI extends JFrame {
    private static final int MAX_ATTEMPTS = 10;
    private static final int RANGE_START = 1;
    private static final int RANGE_END = 100;

    private int numberToGuess;
    private int attempts;
    private Random random;

    private JLabel instructionLabel;
    private JTextField guessField;
    private JButton guessButton;
    private JLabel feedbackLabel;
    private JLabel attemptsLabel;

    public NumberGuessingGameGUI() {
        random = new Random();
        numberToGuess = random.nextInt(RANGE_END - RANGE_START + 1) + RANGE_START;
        attempts = 0;

        setTitle("Number Guessing Game");
        setSize(400, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new GridLayout(5, 1));

        instructionLabel = new JLabel("Guess the number between " + RANGE_START + " and " + RANGE_END + ":");
        guessField = new JTextField();
        guessButton = new JButton("Guess");
        feedbackLabel = new JLabel("");
        attemptsLabel = new JLabel("Attempts left: " + (MAX_ATTEMPTS - attempts));

        guessButton.addActionListener(new GuessButtonListener());

        add(instructionLabel);
        add(guessField);
        add(guessButton);
        add(feedbackLabel);
        add(attemptsLabel);
    }

    private class GuessButtonListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String guessText = guessField.getText();
            if (guessText.isEmpty()) {
                feedbackLabel.setText("Please enter a number.");
                return;
            }

            try {
                int guess = Integer.parseInt(guessText);
                attempts++;

                if (guess == numberToGuess) {
                    feedbackLabel.setText("Congratulations! You guessed the right number.");
                    guessButton.setEnabled(false);
                } else if (guess < numberToGuess) {
                    feedbackLabel.setText("Too Low!");
                } else {
                    feedbackLabel.setText("Too High!");
                }

                attemptsLabel.setText("Attempts left: " + (MAX_ATTEMPTS - attempts));

                if (attempts >= MAX_ATTEMPTS && guess != numberToGuess) {
                    feedbackLabel.setText("Sorry, you've used all your attempts. The correct number was " + numberToGuess + ".");
                    guessButton.setEnabled(false);
                }
            } catch (NumberFormatException ex) {
                feedbackLabel.setText("Invalid input. Please enter a number.");
            }
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            NumberGuessingGameGUI game = new NumberGuessingGameGUI();
            game.setVisible(true);
        });
    }
}

