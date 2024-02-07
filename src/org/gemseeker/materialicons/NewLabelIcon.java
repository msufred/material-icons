package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class NewLabelIcon extends SVGIcon {

    public NewLabelIcon() {
        super(DEFAULT_SIZE, DEFAULT_SIZE * 0.8);
    }

    public NewLabelIcon(double size) {
        super(size, size * 0.8);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("m21 12l-4.37 6.16c-.37.52-.98.84-1.63.84h-3v-6H9v-3H3V7c0-1.1.9-2 " +
                "2-2h10c.65 0 1.26.31 1.63.84zm-11 3H7v-3H5v3H2v2h3v3h2v-3h3z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "new-label-icon";
    }
}
