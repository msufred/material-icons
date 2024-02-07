package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class DoneIcon extends SVGIcon {

    public DoneIcon() {
        super(DEFAULT_SIZE, DEFAULT_SIZE * 0.75);
    }

    public DoneIcon(double size) {
        super(size, size * 0.75);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M9 16.2L4.8 12l-1.4 1.4L9 19L21 7l-1.4-1.4z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "done-icon";
    }
}
