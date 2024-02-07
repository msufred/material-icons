package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class AutoRenewIcon extends SVGIcon {

    public AutoRenewIcon() {
        super(DEFAULT_SIZE * 0.95, DEFAULT_SIZE * 1.25);
    }

    public AutoRenewIcon(double size) {
        super(size * 0.95, size * 1.25);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M12 6v3l4-4l-4-4v3c-4.42 0-8 3.58-8 8c0 1.57.46 3.03 1.24 4.26L6.7 14.8A5.87 5.87 0 0 1 6 " +
                "12c0-3.31 2.69-6 6-6m6.76 1.74L17.3 9.2c.44.84.7 1.79.7 2.8c0 3.31-2.69 6-6 6v-3l-4 4l4 4v-3c4.42 " +
                "0 8-3.58 8-8c0-1.57-.46-3.03-1.24-4.26");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "auto-renew-icon";
    }
}
