package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class OpenInFullIcon extends SVGIcon {

    public OpenInFullIcon() {
        super();
    }

    public OpenInFullIcon(double size) {
        super(size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M21 11V3h-8l3.29 3.29l-10 10L3 13v8h8l-3.29-3.29l10-10z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "open-in-full-icon";
    }
}
