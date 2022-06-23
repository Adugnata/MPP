package lesson6.lap6app;


import javax.swing.*;
import java.awt.*;

public class BookClub extends JFrame implements MessageableWindow {
    public static JTextArea statusBar = new JTextArea("Welcome to the Book Club!");
    String[] links;
    JList<ListItem> linkList;
    JPanel cards;
    LoginPanel lp;
    AllBookTitles abip;
    ListItem loginListItem = new ListItem("Login", true);
    ListItem addBookItem = new ListItem("Add Book", false);
    ListItem viewTitlesItem = new ListItem("View Titles", false);
    ListItem[] sellerItems;
    ListItem[] memberItems;

    public BookClub() {
        this.sellerItems = new ListItem[]{this.loginListItem, this.addBookItem};
        this.memberItems = new ListItem[]{this.loginListItem, this.viewTitlesItem};
        Util.adjustLabelFont(statusBar, Util.DARK_BLUE, true);
        this.setSize(600, 450);
        this.createLinkLabels();
        this.createMainPanels();
        CardLayout cl = (CardLayout) this.cards.getLayout();
        this.linkList.addListSelectionListener((event) -> {
            String value = this.linkList.getSelectedValue().getItemName();
            boolean allowed = this.linkList.getSelectedValue().highlight();
            System.out.println(value + " " + allowed);
            statusBar.setText("");
            if (!allowed) {
                value = this.loginListItem.getItemName();
                this.linkList.setSelectedIndex(0);
            }

            if (value.equals("View Titles")) {
                this.abip.updateData();
            }

            cl.show(this.cards, value);
        });
        JSplitPane innerPane = new JSplitPane(1, this.linkList, this.cards);
        innerPane.setDividerLocation(180);
        JSplitPane outerPane = new JSplitPane(0, innerPane, statusBar);
        outerPane.setDividerLocation(350);
        this.add(outerPane, "Center");
        this.lp.setBookClub(this);
    }

    public ListItem[] getSellerItems() {
        return this.sellerItems;
    }

    public ListItem[] getMemberItems() {
        return this.memberItems;
    }

    public JList<ListItem> getLinkList() {
        return this.linkList;
    }

    public JTextArea getStatusBar() {
        return statusBar;
    }

    public void createLinkLabels() {
        DefaultListModel<ListItem> model = new DefaultListModel();
        model.addElement(this.loginListItem);
        model.addElement(this.viewTitlesItem);
        model.addElement(this.addBookItem);
        this.linkList = new JList(model);
        this.linkList.setCellRenderer(new DefaultListCellRenderer() {
            public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
                Component c = super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
                if (value instanceof ListItem) {
                    ListItem nextItem = (ListItem) value;
                    this.setText(nextItem.getItemName());
                    if (nextItem.highlight()) {
                        this.setForeground(Util.LINK_AVAILABLE);
                    } else {
                        this.setForeground(Util.LINK_NOT_AVAILABLE);
                    }

                    if (isSelected) {
                        this.setForeground(Color.BLACK);
                        this.setBackground(new Color(236, 243, 245));
                    }
                }

                return c;
            }
        });
    }

    public void createMainPanels() {
        this.lp = new LoginPanel();
        JPanel loginPanel = this.lp.getMainPanel();
        AddBookPanel abp = new AddBookPanel();
        JPanel addBookPanel = abp.getMainPanel();
        this.abip = new AllBookTitles();
        JPanel allTitlesPanel = this.abip.getMainPanel();
        this.cards = new JPanel(new CardLayout());
        this.cards.add(loginPanel, this.loginListItem.getItemName());
        this.cards.add(allTitlesPanel, this.viewTitlesItem.getItemName());
        this.cards.add(addBookPanel, this.addBookItem.getItemName());
    }

    public void updateData() {
    }
}
