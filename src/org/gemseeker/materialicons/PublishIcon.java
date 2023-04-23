package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class PublishIcon extends SVGIcon {

    public PublishIcon() {
        super();
    }

    public PublishIcon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M450 896V525L330 645l-43-43 193-193 193 193-43 43-120-120v371h-60ZM160 459V316q0-24 " +
                "18-42t42-18h520q24 0 42 18t18 42v143h-60V316H220v143h-60Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "publish-icon";
    }
}
