package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class SendTimeExtensionIcon extends SVGIcon {

    public SendTimeExtensionIcon() {
        super(DEFAULT_SIZE, DEFAULT_SIZE);
    }

    public SendTimeExtensionIcon(double size) {
        super(size, size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M536 975V827l158-44-158-44V591l384 192-384 192Zm-356-39q-24 0-42-18t-18-42V700q44-5 " +
                "75.5-34.5T227 593q0-43-31.5-72.5T120 486V310q0-24 18-42t42-18h177q11-40 39.5-67t68.5-27q40 0 " +
                "68.5 27t39.5 67h173q24 0 42 18t18 42v349L476 494v336q-49-5-82 26.5T356 936H180Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "send-time-extension-icon";
    }
}
