package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class SwitchRightIcon extends SVGIcon {

    public SwitchRightIcon() {
        super(DEFAULT_SIZE * 1.25, DEFAULT_SIZE);
    }

    public SwitchRightIcon(double size) {
        super(size * 1.25, size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M400 856 120 576l280-280v560Zm160 0V296l280 280-280 280Zm55-133 147-147-147-147v294Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "switch-right-icon";
    }
}
