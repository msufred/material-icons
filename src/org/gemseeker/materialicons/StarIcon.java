package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class StarIcon extends SVGIcon {

    public StarIcon() {
        super();
    }

    public StarIcon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("m233 976 65-281L80 506l288-25 112-265 112 265 288 25-218 189 65 281-247-149-247 149Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "star-icon";
    }
}
