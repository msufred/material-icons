package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class OpenInNewOffIcon extends SVGIcon {

    public OpenInNewOffIcon() {
        super();
    }

    public OpenInNewOffIcon(double size) {
        super(size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M16.79 5.8L14 3h7v7l-2.79-2.8l-4.09 4.09l-1.41-1.41zM19 12v4.17l2 2V12zm.78 " +
                "10.61L18.17 21H5a2 2 0 0 1-2-2V5.83L1.39 4.22L2.8 2.81l18.38 18.38zM16.17 19l-4.88-4" +
                ".88l-1.59 1.59l-1.41-1.41l1.59-1.59L5 7.83V19zM7.83 5H12V3H5.83z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "open-in-new-off-icon";
    }
}
