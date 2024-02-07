package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class LogoutIcon extends SVGIcon {

    public LogoutIcon() {
        super();
    }

    public LogoutIcon(double size) {
        super(size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("m17 7l-1.41 1.41L18.17 11H8v2h10.17l-2.58 2.58L17 17l5-5zM4 " +
                "5h8V3H4c-1.1 0-2 .9-2 2v14c0 1.1.9 2 2 2h8v-2H4z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "logout-icon";
    }
}
