package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class PaidIcon extends SVGIcon {

    public PaidIcon() {
        super();
    }

    public PaidIcon(double size) {
        super(size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M12 2C6.48 2 2 6.48 2 12s4.48 10 10 10s10-4.48 10-10S17.52 2 " +
                "12 2m.88 15.76V19h-1.75v-1.29c-.74-.18-2.39-.77-3.02-2.96l1.65-.67c.0" +
                "6.22.58 2.09 2.4 2.09c.93 0 1.98-.48 1.98-1.61c0-.96-.7-1.46-2.28-2.0" +
                "3c-1.1-.39-3.35-1.03-3.35-3.31c0-.1.01-2.4 2.62-2.96V5h1.75v1.24c1.84" +
                ".32 2.51 1.79 2.66 2.23l-1.58.67c-.11-.35-.59-1.34-1.9-1.34c-.7 0-1.8" +
                "1.37-1.81 1.39c0 .95.86 1.31 2.64 1.9c2.4.83 3.01 2.05 3.01 3.45c0 2." +
                "63-2.5 3.13-3.02 3.22");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "paid-icon";
    }
}
