package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class IosShareIcon extends SVGIcon {

    public IosShareIcon() {
        super(DEFAULT_SIZE, DEFAULT_SIZE * 1.4);
    }

    public IosShareIcon(double size) {
        super(size, size * 1.4);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M220 1016q-24 0-42-18t-18-42V447q0-24 18-42t42-18h169v60H220v509h520V447H569v-60h171q24 0 42 " +
                "18t18 42v509q0 24-18 42t-42 18H220Zm229-307V252l-88 88-43-43 161-161 161 161-43 43-88-88v457h-60Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "ios-share-icon";
    }
}
