package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class ExpandIcon extends SVGIcon {

    public ExpandIcon() {
        super(DEFAULT_SIZE, DEFAULT_SIZE * 1.25);
    }

    public ExpandIcon(double size) {
        super(size, size * 1.25);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M4 20h16v2H4zM4 2h16v2H4zm9 7h3l-4-4l-4 4h3v6H8l4 4l4-4h-3z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "expand-icon";
    }
}
