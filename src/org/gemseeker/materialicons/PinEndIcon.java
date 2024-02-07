package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class PinEndIcon extends SVGIcon {

    public PinEndIcon() {
        super(DEFAULT_SIZE, DEFAULT_SIZE * 0.825);
    }

    public PinEndIcon(double size) {
        super(size, size * 0.825);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M20 12V6H4v12h10v2H4c-1.1 0-2-.9-2-2V6c0-1.1.9-2 2-2h16c1.1 0 " +
                "2 .9 2 2v6zm-1 2c-1.66 0-3 1.34-3 3s1.34 3 3 3s3-1.34 3-3s-1.34-3-3-3m" +
                "-4.34-6H9v5.66l2.12-2.12l2.83 2.83l1.41-1.41l-2.83-2.83z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "pin-end-icon";
    }
}
