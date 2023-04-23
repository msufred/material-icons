package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class SwitchLeftIcon extends SVGIcon {

    public SwitchLeftIcon() {
        super(DEFAULT_SIZE * 1.25, DEFAULT_SIZE);
    }

    public SwitchLeftIcon(double size) {
        super(size * 1.25, size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M400 856 120 576l280-280v560Zm-55-133V429L198 576l147 147Zm215 133V296l280 280-280 280Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "switch-left-icon";
    }
}
