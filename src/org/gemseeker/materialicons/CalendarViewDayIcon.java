package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class CalendarViewDayIcon extends SVGIcon {

    public CalendarViewDayIcon() {
        super(DEFAULT_SIZE, DEFAULT_SIZE * 0.75);
    }

    public CalendarViewDayIcon(double size) {
        super(size, size * 0.75);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M3 17h18v2H3zm0-7h18v5H3zm0-4h18v2H3z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "calendar-view-day-icon";
    }
}
