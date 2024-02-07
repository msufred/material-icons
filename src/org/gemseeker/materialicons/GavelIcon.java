package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class GavelIcon extends SVGIcon {

    public GavelIcon() {
        super();
    }

    public GavelIcon(double size) {
        super(size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("m5.25 8.069l2.83-2.827l14.134 14.15l-2.83 2.827zm4.236-4.242L12.314.998l5.657 5.656l-2.828 " +
                "2.83zM.999 12.315l2.828-2.829l5.657 5.657l-2.828 2.828zM1 21h12v2H1z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "gavel-icon";
    }
}
