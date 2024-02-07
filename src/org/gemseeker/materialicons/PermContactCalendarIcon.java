package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class PermContactCalendarIcon extends SVGIcon {

    public PermContactCalendarIcon() {
        super(DEFAULT_SIZE * 0.9, DEFAULT_SIZE);
    }

    public PermContactCalendarIcon(double size) {
        super(size * 0.9, size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M19 3h-1V1h-2v2H8V1H6v2H5a2 2 0 0 0-2 2v14a2 2 0 0 0 2 2h14c1.1 0 " +
                "2-.9 2-2V5c0-1.1-.9-2-2-2m-7 3c1.66 0 3 1.34 3 3s-1.34 3-3 3s-3-1.34-3-3s1" +
                ".34-3 3-3m6 12H6v-1c0-2 4-3.1 6-3.1s6 1.1 6 3.1z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "perm-contact-calendar-icon";
    }
}
