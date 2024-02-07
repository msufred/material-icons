package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class PinInvokeIcon extends SVGIcon {

    public PinInvokeIcon() {
        super(DEFAULT_SIZE, DEFAULT_SIZE * 0.825);
    }

    public PinInvokeIcon(double size) {
        super(size, size * 0.825);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M22 12v6c0 1.1-.9 2-2 2H4c-1.1 0-2-.9-2-2V6c0-1.1.9-2 " +
                "2-2h10v2H4v12h16v-6zm0-5c0-1.66-1.34-3-3-3s-3 1.34-3 3s1.34 3 " +
                "3 3s3-1.34 3-3m-10.53 5.12l-2.83 2.83l1.41 1.41l2.83-2.83L15 1" +
                "5.66V10H9.34z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "pin-invoke-icon";
    }
}
