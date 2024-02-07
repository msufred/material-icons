package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class ManageAccountsIcon extends SVGIcon {

    public ManageAccountsIcon() {
        super(DEFAULT_SIZE, DEFAULT_SIZE * 0.85);
    }

    public ManageAccountsIcon(double size) {
        super(size, size * 0.85);
    }

    @Override
    protected Shape createShape() {
        SVGPath p1 = new SVGPath();
        p1.setContent("M6,8a4,4 0 1,0 8,0a4,4 0 1,0 -8,0");
        SVGPath p2 = new SVGPath();
        p2.setContent("M10.67 13.02c-.22-.01-.44-.02-.67-.02c-2.42 0-4.68.67-6.61 " +
                "1.82c-.88.52-1.39 1.5-1.39 2.53V20h9.26a6.963 6.963 0 0 1-.59-6.9" +
                "8M20.75 16c0-.22-.03-.42-.06-.63l1.14-1.01l-1-1.73l-1.45.49c-.32-" +
                ".27-.68-.48-1.08-.63L18 11h-2l-.3 1.49c-.4.15-.76.36-1.08.63l-1.4" +
                "5-.49l-1 1.73l1.14 1.01c-.03.21-.06.41-.06.63s.03.42.06.63l-1.14 " +
                "1.01l1 1.73l1.45-.49c.32.27.68.48 1.08.63L16 21h2l.3-1.49c.4-.15." +
                "76-.36 1.08-.63l1.45.49l1-1.73l-1.14-1.01c.03-.21.06-.41.06-.63M1" +
                "7 18c-1.1 0-2-.9-2-2s.9-2 2-2s2 .9 2 2s-.9 2-2 2");
        return Shape.union(p1, p2);
    }

    @Override
    protected String getIconStyleClass() {
        return "manage-accounts-icon";
    }
}
