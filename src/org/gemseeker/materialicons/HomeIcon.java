package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class HomeIcon extends SVGIcon {

    public HomeIcon() {
        super(DEFAULT_SIZE * 0.85, DEFAULT_SIZE);
    }

    public HomeIcon(double size) {
        super(size * 0.85, size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M160-120v-480l320-240 320 240v480H560v-280H400v280H160Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "home-icon";
    }

}
