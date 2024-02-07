package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class EditCalendarIcon extends SVGIcon {

    public EditCalendarIcon() {
        super(DEFAULT_SIZE * 0.9, DEFAULT_SIZE);
    }

    public EditCalendarIcon(double size) {
        super(size * 0.9, size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M12 22H5a2 2 0 0 1-2-2l.01-14c0-1.1.88-2 1.99-2h1V2h2v2h8V2h2v2h1c1.1 0 2 .9 2 " +
                "2v6h-2v-2H5v10h7zm10.13-5.01l.71-.71a.996.996 0 0 0 0-1.41l-.71-.71a.996.996 0 0 0-1.41" +
                " 0l-.71.71zm-.71.71l-5.3 5.3H14v-2.12l5.3-5.3z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "edit-calendar-icon";
    }
}
