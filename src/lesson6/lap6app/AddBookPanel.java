package lesson6.lap6app;

import javax.swing.*;
import java.awt.*;

public class AddBookPanel implements MessageableWindow {
    private JPanel mainPanel = new JPanel();
    private JPanel topPanel;
    private JPanel outerMiddle;
    private JTextField authFirstNameField;
    private JTextField authLastNameField;
    private JTextField titleField;

    public AddBookPanel() {
        this.mainPanel.setLayout(new BorderLayout());
        this.defineTopPanel();
        this.defineOuterMiddle();
        this.mainPanel.add(this.topPanel, "North");
        this.mainPanel.add(this.outerMiddle, "Center");
    }

    public JPanel getMainPanel() {
        return this.mainPanel;
    }

    public void clearData() {
        this.authFirstNameField.setText("");
        this.authLastNameField.setText("");
        this.titleField.setText("");
    }

    public void defineTopPanel() {
        this.topPanel = new JPanel();
        JLabel AddBookLabel = new JLabel("Add Book Title");
        Util.adjustLabelFont(AddBookLabel, Util.DARK_BLUE, true);
        this.topPanel.setLayout(new FlowLayout(0));
        this.topPanel.add(AddBookLabel);
    }

    public void defineOuterMiddle() {
        this.outerMiddle = new JPanel();
        this.outerMiddle.setLayout(new BorderLayout());
        JPanel middlePanel = new JPanel();
        FlowLayout fl = new FlowLayout(1, 25, 25);
        middlePanel.setLayout(fl);
        JPanel leftPanel = new JPanel();
        JPanel rightPanel = new JPanel();
        leftPanel.setLayout(new BoxLayout(leftPanel, 1));
        rightPanel.setLayout(new BoxLayout(rightPanel, 1));
        JLabel authFirstNameLabel = new JLabel("Author First Name");
        JLabel authLastNameLabel = new JLabel("Author Last Name");
        JLabel titleLabel = new JLabel("Book Title");
        this.authFirstNameField = new JTextField(10);
        this.authLastNameField = new JTextField(10);
        this.titleField = new JTextField(10);
        leftPanel.add(authFirstNameLabel);
        leftPanel.add(Box.createRigidArea(new Dimension(0, 12)));
        leftPanel.add(authLastNameLabel);
        leftPanel.add(Box.createRigidArea(new Dimension(0, 12)));
        leftPanel.add(titleLabel);
        rightPanel.add(this.authFirstNameField);
        rightPanel.add(Box.createRigidArea(new Dimension(0, 8)));
        rightPanel.add(this.authLastNameField);
        rightPanel.add(Box.createRigidArea(new Dimension(0, 8)));
        rightPanel.add(this.titleField);
        middlePanel.add(leftPanel);
        middlePanel.add(rightPanel);
        this.outerMiddle.add(middlePanel, "North");
        JButton addBookButton = new JButton("Add Book");
        addBookButton.addActionListener((event) -> {
            String fname = this.authFirstNameField.getText();
            String lname = this.authLastNameField.getText();
            Data.addAuthor(new Author(fname, lname));
            String title = this.titleField.getText();
            Data.addBookTitle(title);
            this.displayInfo("The book " + title + " has been added " + "to the collection!");
        });
        JPanel addBookButtonPanel = new JPanel();
        addBookButtonPanel.setLayout(new FlowLayout(1));
        addBookButtonPanel.add(addBookButton);
        this.outerMiddle.add(addBookButtonPanel, "Center");
    }

    public void updateData() {
    }
}