package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class GradingIcon extends SVGIcon {

    public GradingIcon() {
        super(DEFAULT_SIZE * 0.9, DEFAULT_SIZE);
    }

    public GradingIcon(double size) {
        super(size * 0.9, size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M4 7h16v2H4zm0 6h16v-2H4zm0 4h7v-2H4zm0 4h7v-2H4zm11.41-2.83L14 " +
                "16.75l-1.41 1.41L15.41 21L20 16.42L18.58 15zM4 3v2h16V3z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "grading-icon";
    }
}
