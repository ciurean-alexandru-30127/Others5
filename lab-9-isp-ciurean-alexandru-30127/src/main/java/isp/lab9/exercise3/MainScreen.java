package isp.lab9.exercise3;

import isp.lab9.exercise3.exceptions.InvalidPinException;
import isp.lab9.exercise3.exceptions.TooManyAttemptsException;

import java.awt.*;
import javax.swing.*;

public class MainScreen extends JFrame {
    private DoorLockController doorLockController;

    private JButton pinButton;
    private JTextField statusField;
    private JTextField pintField;
    private JTextField err;

    public MainScreen(DoorLockController doorLockController) {
        this.doorLockController = doorLockController;
        initFrame();
        components();
        handlers();
    }

    private void initFrame() {
        setTitle("Screen");
        setSize(450, 200);
        setBackground(Color.gray);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    private void components() {

        JLabel label1 = new JLabel("Access pin:");
        label1.setBounds(100, 35, 150, 20);

        pintField = new JTextField();
        pintField.setBounds(175, 35, 75, 20);

        this.pinButton = new JButton("OK");
        this.pinButton.setBounds(270, 35, 75, 75);

        JLabel label2 = new JLabel("Door status:");
        label2.setBounds(100, 60, 100, 20);

        statusField = new JTextField("Locked");
        statusField.setBounds(175, 60, 75, 20);

        this.err = new JTextField();
        this.err.setBounds(100, 90, 150, 20);
        this.err.setVisible(false);

        add(label1);
        add(label2);
        add(statusField);
        add(pinButton);
        add(pintField);
        add(err);
    }

    private void handlers() {
        this.pinButton.addActionListener(e -> {
            try {
                DoorStatus status = doorLockController.enterPin(pintField.getText());

                if (status.equals(DoorStatus.OPEN)) {
                    statusField.setText("Unlocked");
                } else if (status.equals(DoorStatus.CLOSE)) {
                    statusField.setText("Locked");
                }
                err.setVisible(false);
            } catch (InvalidPinException ex) {
                setErr("Wrong pin entered!");
            } catch (TooManyAttemptsException ex) {
                setErr("Door locked permanently");
            }
        });
    }

    private void setErr(String messageText) {
        err.setText(messageText);
        err.setVisible(true);
    }

}