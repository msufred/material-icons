package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class CalendarMonthIcon extends SVGIcon {

    public CalendarMonthIcon() {
        super(DEFAULT_SIZE * 0.9, DEFAULT_SIZE);
    }

    public CalendarMonthIcon(double size) {
        super(size * 0.9, size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M19 4h-1V2h-2v2H8V2H6v2H5c-1.11 0-1.99.9-1.99 2L3 20a2 2 0 0 0 2 2h14c1.1 0 2-.9 " +
                "2-2V6c0-1.1-.9-2-2-2m0 16H5V10h14zM9 14H7v-2h2zm4 0h-2v-2h2zm4 0h-2v-2h2zm-8 4H7v-2h2zm4 " +
                "0h-2v-2h2zm4 0h-2v-2h2z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "calendar-month-icon";
    }
}
