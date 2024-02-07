package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class InputIcon extends SVGIcon {

    public InputIcon() {
        super(DEFAULT_SIZE, DEFAULT_SIZE * 0.8);
    }

    public InputIcon(double size) {
        super(size, size * 0.8);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M21 3.01H3c-1.1 0-2 .9-2 2V9h2V4.99h18v14.03H3V15H1v4.01c0 1.1.9 1.98 2 1.98h18c1.1 0 " +
                "2-.88 2-1.98v-14a2 2 0 0 0-2-2M11 16l4-4l-4-4v3H1v2h10z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "input-icon";
    }
}
