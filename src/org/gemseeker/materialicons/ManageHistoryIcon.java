package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class ManageHistoryIcon extends SVGIcon {

    public ManageHistoryIcon() {
        super();
    }

    public ManageHistoryIcon(double size) {
        super(size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("m22.69 18.37l1.14-1l-1-1.73l-1.45.49c-.32-.27-.68-.48-1.08-.63L20 " +
                "14h-2l-.3 1.49c-.4.15-.76.36-1.08.63l-1.45-.49l-1 1.73l1.14 1c-.08.5-.08" +
                ".76 0 1.26l-1.14 1l1 1.73l1.45-.49c.32.27.68.48 1.08.63L18 24h2l.3-1.49c" +
                ".4-.15.76-.36 1.08-.63l1.45.49l1-1.73l-1.14-1c.08-.51.08-.77 0-1.27M19 2" +
                "1c-1.1 0-2-.9-2-2s.9-2 2-2s2 .9 2 2s-.9 2-2 2M11 7v5.41l2.36 2.36l1.04-1" +
                ".79l-1.4-1.39V7zm10 5a9 9 0 0 0-9-9C9.17 3 6.65 4.32 5 6.36V4H3v6h6V8H6." +
                "26A7.01 7.01 0 0 1 12 5c3.86 0 7 3.14 7 7zm-10.14 6.91c-2.99-.49-5.35-2." +
                "9-5.78-5.91H3.06c.5 4.5 4.31 8 8.94 8h.07z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "manage-history-icon";
    }
}
