package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class OutboxIcon extends SVGIcon {

    public OutboxIcon() {
        super();
    }

    public OutboxIcon(double size) {
        super(size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M19 3H4.99c-1.11 0-1.98.9-1.98 2L3 19c0 1.1.88 2 1.99 2H19c1.1 0 2-.9 " +
                "2-2V5c0-1.1-.9-2-2-2m0 12h-4c0 1.66-1.35 3-3 3s-3-1.34-3-3H4.99V5H19zM8 11h2v3" +
                "h4v-3h2l-4-4z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "outbox-icon";
    }
}
