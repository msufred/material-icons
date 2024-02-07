package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class CalendarViewMonthIcon extends SVGIcon {

    public CalendarViewMonthIcon() {
        super(DEFAULT_SIZE, DEFAULT_SIZE * 0.8);
    }

    public CalendarViewMonthIcon(double size) {
        super(size, size * 0.8);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M20 4H4c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h16c1.1 0 2-.9 2-2V6c0-1.1-.9-2-2-2M8 " +
                "11H4V6h4zm6 0h-4V6h4zm6 0h-4V6h4zM8 18H4v-5h4zm6 0h-4v-5h4zm6 0h-4v-5h4z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "calendar-view-month-icon";
    }
}
