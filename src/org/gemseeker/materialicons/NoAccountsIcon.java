package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class NoAccountsIcon extends SVGIcon {

    public NoAccountsIcon() {
        super();
    }

    public NoAccountsIcon(double size) {
        super(size);
    }

    @Override
    protected Shape createShape() {
        SVGPath p1 = new SVGPath();
        p1.setContent("M15.18 10.94c.2-.44.32-.92.32-1.44C15.5 7.57 13.93 6 12 6c-.52 0-1 .12-1.44.32z");
        SVGPath p2 = new SVGPath();
        p2.setContent("M12 2C6.48 2 2 6.48 2 12s4.48 10 10 10s10-4.48 10-10S17.52 2 12 2m0 13c-2.32 0-4" +
                ".45.8-6.14 2.12A7.957 7.957 0 0 1 4 12c0-1.85.63-3.55 1.69-4.9l2.86 2.86a3.47 3.47 0 0" +
                " 0 2.99 2.99l2.2 2.2c-.57-.1-1.15-.15-1.74-.15m6.31 1.9L7.1 5.69A7.902 7.902 0 0 1 12 " +
                "4c4.42 0 8 3.58 8 8c0 1.85-.63 3.54-1.69 4.9");
        return Shape.union(p1, p2);
    }

    @Override
    protected String getIconStyleClass() {
        return "no-accounts-icon";
    }
}
