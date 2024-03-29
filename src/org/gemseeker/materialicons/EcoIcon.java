package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class EcoIcon extends SVGIcon {

    public EcoIcon() {
        super();
    }

    public EcoIcon(double size) {
        super(size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M6.05 8.05a7.001 7.001 0 0 0-.02 9.88c1.47-3.4 4.09-6.24 7.36-7.93A15.952 15.952 " +
                "0 0 0 8 19.32c2.6 1.23 5.8.78 7.95-1.37C19.43 14.47 20 4 20 4S9.53 4.57 6.05 8.05");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "eco-icon";
    }
}
