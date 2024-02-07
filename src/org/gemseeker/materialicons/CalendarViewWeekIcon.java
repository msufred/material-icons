package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class CalendarViewWeekIcon extends SVGIcon {

    public CalendarViewWeekIcon() {
        super(DEFAULT_SIZE, DEFAULT_SIZE * 0.8);
    }

    public CalendarViewWeekIcon(double size) {
        super(size, size * 0.8);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M20 4H4c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h16c1.1 0 2-.9 2-2V6c0-1.1-.9-2-2-2m-7 " +
                "2h2.5v12H13zm-2 12H8.5V6H11zM4 6h2.5v12H4zm16 12h-2.5V6H20z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "calendar-view-week-icon";
    }
}
