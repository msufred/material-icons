package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class ShelfPositionIcon extends SVGIcon {

    public ShelfPositionIcon() {
        super(DEFAULT_SIZE, DEFAULT_SIZE * 0.95);
    }

    public ShelfPositionIcon(double size) {
        super(size, size * 0.95);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M120 734v141q0 24.75 17.625 42.375T180 935h640q24.75 0 42.375-17.625T880 " +
                "875V734H120Zm550-60h210V276q0-24.75-17.625-42.375T820 216H670v458Zm-550 " +
                "0h210V216H180q-24.75 0-42.375 17.625T120 276v398Zm270 0h220V216H390v458Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "shelf-position-icon";
    }
}
