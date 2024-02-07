package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class OfflinePinIcon extends SVGIcon {

    public OfflinePinIcon() {
        super();
    }

    public OfflinePinIcon(double size) {
        super(size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M12 2C6.5 2 2 6.5 2 12s4.5 10 10 10s10-4.5 10-10S17.5 2 12 " +
                "2m5 16H7v-2h10zm-6.7-4L7 10.7l1.4-1.4l1.9 1.9l5.3-5.3L17 7.3z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "offline-pin-icon";
    }
}
