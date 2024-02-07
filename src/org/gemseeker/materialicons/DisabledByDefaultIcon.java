package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class DisabledByDefaultIcon extends SVGIcon {

    public DisabledByDefaultIcon() {
        super();
    }

    public DisabledByDefaultIcon(double size) {
        super(size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M3 3v18h18V3zm14 12.59L15.59 17L12 13.41L8.41 17L7 15.59L10.59 12L7 8.41L8.41 " +
                "7L12 10.59L15.59 7L17 8.41L13.41 12z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "disabled-by-default-icon";
    }
}
