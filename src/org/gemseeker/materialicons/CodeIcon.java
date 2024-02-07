package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class CodeIcon extends SVGIcon {

    public CodeIcon() {
        super(DEFAULT_SIZE, DEFAULT_SIZE * 0.625);
    }

    public CodeIcon(double size) {
        super(size, size * 0.625);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M9.4 16.6L4.8 12l4.6-4.6L8 6l-6 6l6 6zm5.2 0l4.6-4.6l-4.6-4.6L16 6l6 6l-6 6z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "code-icon";
    }
}
