package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class AlarmOnIcon extends SVGIcon {

    public AlarmOnIcon() {
        super();
    }

    public AlarmOnIcon(double size) {
        super(size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("m22 5.72l-4.6-3.86l-1.29 1.53l4.6 3.86zM7.88 3.39L6.6 1.86L2 5.71l1.29 " +
                "1.53zM12 4c-4.97 0-9 4.03-9 9s4.02 9 9 9a9 9 0 0 0 0-18m0 16c-3.87 0-7-3.13-7-7" +
                "s3.13-7 7-7s7 3.13 7 7s-3.13 7-7 7m-1.46-5.47L8.41 12.4l-1.06 1.06l3.18 3.18l6-" +
                "6l-1.06-1.06z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "alarm-on-icon";
    }
}
