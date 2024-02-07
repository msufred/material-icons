package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class MarkAsUnreadIcon extends SVGIcon {

    public MarkAsUnreadIcon() {
        super(DEFAULT_SIZE, DEFAULT_SIZE * 0.95);
    }

    public MarkAsUnreadIcon(double size) {
        super(size, size * 0.95);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M18.83 7h-2.6L10.5 4L4 7.4V17c-1.1 0-2-.9-2-2V7.17c0-.53.32-1.09." +
                "8-1.34L10.5 2l7.54 3.83c.43.23.73.7.79 1.17M20 8H7c-1.1 0-2 .9-2 2v9c0 1." +
                "1.9 2 2 2h13c1.1 0 2-.9 2-2v-9c0-1.1-.9-2-2-2m0 3.67L13.5 15L7 11.67V10l6" +
                ".5 3.33L20 10z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "mark-as-unread-icon";
    }
}
