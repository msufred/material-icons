package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class EventIcon extends SVGIcon {

    public EventIcon() {
        super(DEFAULT_SIZE * 0.9, DEFAULT_SIZE);
    }

    public EventIcon(double size) {
        super(size * 0.9, size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M17 12h-5v5h5zM16 1v2H8V1H6v2H5c-1.11 0-1.99.9-1.99 2L3 19a2 2 0 0 0 2 2h14c1.1 0 " +
                "2-.9 2-2V5c0-1.1-.9-2-2-2h-1V1zm3 18H5V8h14z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "event-icon";
    }
}
