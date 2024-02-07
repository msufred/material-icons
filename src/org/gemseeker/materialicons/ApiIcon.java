package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class ApiIcon extends SVGIcon {

    public ApiIcon() {
        super();
    }

    public ApiIcon(double size) {
        super(size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("m14 12l-2 2l-2-2l2-2zm-2-6l2.12 2.12l2.5-2.5L12 1L7.38 5.62l2.5 2.5zm-6 " +
                "6l2.12-2.12l-2.5-2.5L1 12l4.62 4.62l2.5-2.5zm12 0l-2.12 2.12l2.5 2.5L23 12l-4.62" +
                "-4.62l-2.5 2.5zm-6 6l-2.12-2.12l-2.5 2.5L12 23l4.62-4.62l-2.5-2.5z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "api-icon";
    }
}
