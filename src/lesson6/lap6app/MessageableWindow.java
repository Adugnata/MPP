package lesson6.lap6app;

public interface MessageableWindow {
    default void displayError(String msg) {
        BookClub.statusBar.setForeground(Util.ERROR_MESSAGE_COLOR);
        BookClub.statusBar.setText(msg);
    }

    default void displayInfo(String msg) {
        BookClub.statusBar.setForeground(Util.INFO_MESSAGE_COLOR);
        BookClub.statusBar.setText(msg);
    }

    void updateData();
}
