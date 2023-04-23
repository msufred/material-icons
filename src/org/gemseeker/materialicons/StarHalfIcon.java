package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class StarHalfIcon extends SVGIcon {

    public StarHalfIcon() {
        super();
    }

    public StarHalfIcon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M480 370v387l157 95-42-178 138-120-182-16-71-168ZM233 976l65-281L80 506l288-25 112-265 112 " +
                "265 288 25-218 189 65 281-247-149-247 149Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "star-half-icon";
    }
}
