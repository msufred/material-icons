package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class ForwardIcon extends SVGIcon {

    public ForwardIcon() {
        super(DEFAULT_SIZE * 1.125, DEFAULT_SIZE * 0.825);
    }

    public ForwardIcon(double size) {
        super(size * 1.125, size * 0.825);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M120 856V682q0-79 56-134.5T310 492h416L572 338l42-42 226 226-226 226-42-42 154-154H310q-54 " +
                "0-92 38t-38 92v174h-60Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "forward-icon";
    }
}
