package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class DescriptionIcon extends SVGIcon {

    public DescriptionIcon() {
        super(DEFAULT_SIZE * 0.8, DEFAULT_SIZE);
    }

    public DescriptionIcon(double size) {
        super(size * 0.8, size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M14 2H6c-1.1 0-1.99.9-1.99 2L4 20c0 1.1.89 2 1.99 2H18c1.1 0 2-.9 2-2V8zm2 " +
                "16H8v-2h8zm0-4H8v-2h8zm-3-5V3.5L18.5 9z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "description-icon";
    }
}
