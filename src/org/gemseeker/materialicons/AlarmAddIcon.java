package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class AlarmAddIcon extends SVGIcon {

    public AlarmAddIcon() {
        super();
    }

    public AlarmAddIcon(double size) {
        super(size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M7.88 3.39L6.6 1.86L2 5.71l1.29 1.53zM22 5.72l-4.6-3.86l-1.29 1.53l4.6 " +
                "3.86zM12 4c-4.97 0-9 4.03-9 9s4.02 9 9 9a9 9 0 0 0 0-18m0 16c-3.87 0-7-3.13-7-7" +
                "s3.13-7 7-7s7 3.13 7 7s-3.13 7-7 7m1-11h-2v3H8v2h3v3h2v-3h3v-2h-3z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "alarm-add-icon";
    }
}
