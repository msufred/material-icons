package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class CalendarTodayIcon extends SVGIcon {

    public CalendarTodayIcon() {
        super(DEFAULT_SIZE * 0.9, DEFAULT_SIZE);
    }

    public CalendarTodayIcon(double size) {
        super(size * 0.9, size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M20 3h-1V1h-2v2H7V1H5v2H4c-1.1 0-2 .9-2 2v16c0 1.1.9 2 2 2h16c1.1 0 2-.9 2-2V5c0-1.1-.9-2-2-2m0 18H4V8h16z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "calendar-today-icon";
    }
}
