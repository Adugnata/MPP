package lesson6.lap6app;

public class ListItem {
    private String itemName;
    private boolean highlight = false;

    public ListItem(String item, boolean visible) {
        this.itemName = item;
        this.highlight = visible;
    }

    public String getItemName() {
        return this.itemName;
    }

    public boolean highlight() {
        return this.highlight;
    }

    public void setHighlight(boolean highlight) {
        this.highlight = highlight;
    }

    public boolean equals(Object ob) {
        if (ob.getClass() != ListItem.class)
            return false;
        else {
            ListItem item = (ListItem) ob;
            return this.itemName.equals(item.itemName);
        }
    }
}

