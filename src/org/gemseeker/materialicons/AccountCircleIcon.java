package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class AccountCircleIcon extends SVGIcon {

    public AccountCircleIcon() {
        super();
    }

    public AccountCircleIcon(double size) {
        super(size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M12 2C6.48 2 2 6.48 2 12s4.48 10 10 10s10-4.48 10-10S17.52 2 12 2m0 4c1.93 0 3.5 1.57 3.5 " +
                "3.5S13.93 13 12 13s-3.5-1.57-3.5-3.5S10.07 6 12 6m0 14c-2.03 0-4.43-.82-6.14-2.88a9.947 9.947 0 0 " +
                "1 12.28 0C16.43 19.18 14.03 20 12 20");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "account-circle-icon";
    }
}
