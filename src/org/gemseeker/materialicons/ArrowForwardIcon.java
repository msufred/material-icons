package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class ArrowForwardIcon extends SVGIcon {

    public ArrowForwardIcon() {
        super();
    }

    public ArrowForwardIcon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("m480 896-42-43 247-247H160v-60h525L438 299l42-43 320 320-320 320Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "arrow-forward-icon";
    }
}
