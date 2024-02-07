package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class LabelOffIcon extends SVGIcon {

    public LabelOffIcon() {
        super(DEFAULT_SIZE, DEFAULT_SIZE * 0.9);
    }

    public LabelOffIcon(double size) {
        super(size, size * 0.9);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("m3.25 2.75l17 17L19 21l-2-2H5c-1.1 0-2-.9-2-2V7c0-.55.23-1.05.59-1.41L2 4zM22 " +
                "12l-4.37-6.16C17.27 5.33 16.67 5 16 5H8l11 11z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "label-off-icon";
    }
}
