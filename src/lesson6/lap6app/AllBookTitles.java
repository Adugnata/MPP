package lesson6.lap6app;

import javax.swing.*;
import java.awt.*;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class AllBookTitles implements MessageableWindow {
    private JPanel mainPanel = new JPanel();
    private JPanel topPanel;
    private JPanel middlePanel;
    private TextArea textArea;

    public AllBookTitles() {
        this.mainPanel.setLayout(new BorderLayout());
        this.defineTopPanel();
        this.defineMiddlePanel();
        this.mainPanel.add(this.topPanel, "North");
        this.mainPanel.add(this.middlePanel, "Center");
    }

    public JPanel getMainPanel() {
        return this.mainPanel;
    }

    public void defineTopPanel() {
        this.topPanel = new JPanel();
        JLabel titlesLabel = new JLabel("View Titles");
        Util.adjustLabelFont(titlesLabel, Util.DARK_BLUE, true);
        this.topPanel.setLayout(new FlowLayout(0));
        this.topPanel.add(titlesLabel);
    }

    public void defineMiddlePanel() {
        this.middlePanel = new JPanel();
        FlowLayout fl = new FlowLayout(1, 25, 25);
        this.middlePanel.setLayout(fl);
        this.textArea = new TextArea(8, 20);
        this.updateData();
        this.middlePanel.add(this.textArea);
    }

    public void updateData() {
        List<String> titles = Data.bookTitles;
        Collections.sort(titles);
        StringBuilder sb = new StringBuilder();
        Iterator<String> var4 = titles.iterator();

        while (var4.hasNext()) {
            String s = var4.next();
            sb.append(s).append("\n");
        }

        this.textArea.setText(sb.toString());
        this.mainPanel.repaint();
    }
}
