package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class LastPageIcon extends SVGIcon {

    public LastPageIcon() {
        super();
    }

    public LastPageIcon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("m272 811-43-43 192-192-192-192 43-43 235 235-235 235Zm388 5V336h60v480h-60Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "last-page-icon";
    }
}
