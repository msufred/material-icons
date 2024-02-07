package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class FaceIcon extends SVGIcon {

    public FaceIcon() {
        super();
    }

    public FaceIcon(double size) {
        super(size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M9 11.75a1.25 1.25 0 1 0 0 2.5a1.25 1.25 0 0 0 0-2.5m6 0a1.25 1.25 0 1 0 0 " +
                "2.5a1.25 1.25 0 0 0 0-2.5M12 2C6.48 2 2 6.48 2 12s4.48 10 10 10s10-4.48 10-10S17.52" +
                " 2 12 2m0 18c-4.41 0-8-3.59-8-8c0-.29.02-.58.05-.86c2.36-1.05 4.23-2.98 5.21-5.37a9" +
                ".974 9.974 0 0 0 10.41 3.97c.21.71.33 1.47.33 2.26c0 4.41-3.59 8-8 8");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "face-icon";
    }
}
