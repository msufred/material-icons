package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class KeyboardOptionKeyIcon extends SVGIcon {

    public KeyboardOptionKeyIcon() {
        super(DEFAULT_SIZE, DEFAULT_SIZE * 0.75);
    }

    public KeyboardOptionKeyIcon(double size) {
        super(size, size * 0.75);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M597 856 320 356H120v-60h234l277 500h209v60H597Zm13-500v-60h230v60H610Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "keyboard-control-key-icon";
    }
}
