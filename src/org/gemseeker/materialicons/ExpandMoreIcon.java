package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class ExpandMoreIcon extends SVGIcon {

    public ExpandMoreIcon() {
        super(DEFAULT_SIZE * 0.85, DEFAULT_SIZE * 0.5);
    }

    public ExpandMoreIcon(double size) {
        super(size * 0.85, size * 0.5);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M480 711 240 471l43-43 197 198 197-197 43 43-240 239Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "expand-more-icon";
    }

}
