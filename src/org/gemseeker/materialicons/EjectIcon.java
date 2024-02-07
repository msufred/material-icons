package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class EjectIcon extends SVGIcon {

    public EjectIcon() {
        super();
    }

    public EjectIcon(double size) {
        super(size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M5 17h14v2H5zm7-12L5.33 15h13.34z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "eject-icon";
    }
}
