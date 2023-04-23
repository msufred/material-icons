package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class RestartAltIcon extends SVGIcon {

    public RestartAltIcon() {
        super(DEFAULT_SIZE, DEFAULT_SIZE * 1.125);
    }

    public RestartAltIcon(double size) {
        super(size, size * 1.125);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M451 934q-123-10-207-101t-84-216q0-77 35.5-145T295 361l43 43q-56 33-87 90.5T220 617q0 100 66 " +
                "173t165 84v60Zm60 0v-60q100-12 165-84.5T741 617q0-109-75.5-184.5T481 357h-20l60 60-43 43-133-133 " +
                "133-133 43 43-60 60h20q134 0 227 93.5T801 617q0 125-83.5 216T511 934Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "restart-alt-icon";
    }
}
