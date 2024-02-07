package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class OpenWithIcon extends SVGIcon {

    public OpenWithIcon() {
        super();
    }

    public OpenWithIcon(double size) {
        super(size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M10 9h4V6h3l-5-5l-5 5h3zm-1 1H6V7l-5 5l5 5v-3h3zm14 2l-5-5v3h-3v4h3v3zm-9 3h-4v3H7l5 5l5-5h-3z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "open-with-icon";
    }
}
