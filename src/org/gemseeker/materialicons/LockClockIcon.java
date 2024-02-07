package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class LockClockIcon extends SVGIcon {

    public LockClockIcon() {
        super();
    }

    public LockClockIcon(double size) {
        super(size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("m14.5 14.2l2.9 1.7l-.8 1.3L13 15v-5h1.5zM22 14c0 4.41-3.59 8-8 " +
                "8c-2.02 0-3.86-.76-5.27-2H4c-1.15 0-2-.85-2-2V9c0-1.12.89-1.96 2-2v-.5C" +
                "4 4.01 6.01 2 8.5 2c2.34 0 4.24 1.79 4.46 4.08c.34-.05.69-.08 1.04-.08c" +
                "4.41 0 8 3.59 8 8M6 7h5v-.74A2.509 2.509 0 0 0 8.5 4A2.5 2.5 0 0 0 6 6." +
                "5zm14 7c0-3.31-2.69-6-6-6s-6 2.69-6 6s2.69 6 6 6s6-2.69 6-6");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "lock-clock-icon";
    }
}
