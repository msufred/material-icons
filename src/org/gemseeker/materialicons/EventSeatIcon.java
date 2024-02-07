package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class EventSeatIcon extends SVGIcon {

    public EventSeatIcon() {
        super(DEFAULT_SIZE, DEFAULT_SIZE * 0.9);
    }

    public EventSeatIcon(double size) {
        super(size, size * 0.9);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M4 18v3h3v-3h10v3h3v-6H4zm15-8h3v3h-3zM2 10h3v3H2zm15 3H7V5c0-1.1.9-2 2-2h6c1.1 0 2 .9 2 2z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "event-seat-icon";
    }
}
