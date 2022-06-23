package lesson6.lap6app;


import javax.swing.*;
import java.awt.*;
import java.util.Comparator;
import java.util.List;

public class Util {
    public static final Color DARK_BLUE;
    public static final Color ERROR_MESSAGE_COLOR;
    public static final Color INFO_MESSAGE_COLOR;
    public static final Color LINK_AVAILABLE;
    public static final Color LINK_NOT_AVAILABLE;

    static {
        DARK_BLUE = Color.BLUE.darker();
        ERROR_MESSAGE_COLOR = Color.RED.darker();
        INFO_MESSAGE_COLOR = new Color(24, 98, 19);
        LINK_AVAILABLE = DARK_BLUE;
        LINK_NOT_AVAILABLE = Color.gray;
    }

    public Util() {
    }

    public static Font makeSmallFont(Font f) {
        return new Font(f.getName(), f.getStyle(), f.getSize() - 2);
    }

    public static void adjustLabelFont(JComponent label, Color color, boolean bigger) {
        Font f;
        if (bigger) {
            f = new Font(label.getFont().getName(), label.getFont().getStyle(), label.getFont().getSize() + 2);
            label.setFont(f);
        } else {
            f = new Font(label.getFont().getName(), label.getFont().getStyle(), label.getFont().getSize() - 2);
            label.setFont(f);
        }

        label.setForeground(color);
    }

    public static List<String> numericSort(List<String> list) {
        list.sort(new NumericSortComparator());
        return list;
    }

    public static boolean isNumeric(String s) {
        if (s == null) {
            return false;
        } else {
            try {
                Integer.parseInt(s);
                return true;
            } catch (Exception var2) {
                return false;
            }
        }
    }

    public static User findUser(List<User> list, User user) {

        for (User u : list) {
            if (u.equals(user)) {
                return u;
            }
        }

        return null;
    }

    static class NumericSortComparator implements Comparator<String> {
        NumericSortComparator() {
        }

        public int compare(String s, String t) {
            if (Util.isNumeric(s) && Util.isNumeric(t)) {
                int sInt = Integer.parseInt(s);
                int tInt = Integer.parseInt(t);
                if (sInt < tInt) {
                    return -1;
                } else {
                    return sInt == tInt ? 0 : 1;
                }
            } else {
                throw new IllegalArgumentException("Input list has non-numeric characters");
            }
        }
    }
}
