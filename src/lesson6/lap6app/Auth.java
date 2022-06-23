package lesson6.lap6app;

import java.io.Serializable;

public enum Auth implements Serializable {
    MEMBER, SELLER, BOTH;

    private Auth() {
    }
}
