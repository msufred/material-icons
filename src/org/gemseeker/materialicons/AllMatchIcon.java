package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class AllMatchIcon extends SVGIcon {

    public AllMatchIcon() {
        super(DEFAULT_SIZE, DEFAULT_SIZE * 0.9);
    }

    public AllMatchIcon(double size) {
        super(size, size * 0.9);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("m120 856 180-280-180-280h478q22 0 40 11.5t31 28.5l171 240-15 21q-26-11-46-14.5t-46-3.5q-104 " +
                "0-176 74t-72 174q0 7 .5 14t1.5 15H120Zm613 159q-78 0-133-55.5T545 828q0-78 55-133.5T733 639q77 0 " +
                "132.5 55.5T921 828q0 76-55.5 131.5T733 1015Zm-29-98 139-138-42-42-97 95-39-39-42 43 81 81Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "all-match-icon";
    }
}
