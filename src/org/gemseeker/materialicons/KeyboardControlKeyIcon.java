package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class KeyboardControlKeyIcon extends SVGIcon {

    public KeyboardControlKeyIcon() {
        super(DEFAULT_SIZE, DEFAULT_SIZE * 0.55);
    }

    public KeyboardControlKeyIcon(double size) {
        super(size, size * 0.55);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("m242 618-42-42 280-280 280 280-42 42-238-237-238 237Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "keyboard-control-key-icon";
    }
}
