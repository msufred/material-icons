package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class IframeIcon extends SVGIcon {

    public IframeIcon() {
        super(DEFAULT_SIZE * 1.25, DEFAULT_SIZE);
    }

    public IframeIcon(double size) {
        super(size * 1.25, size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M400 696V496h320v200H400ZM140 896q-24 0-42-18t-18-42V316q0-24 18-42t42-18h680q24 0 42 18t18 " +
                "42v520q0 24-18 42t-42 18H140Zm0-60h680V400H140v436Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "iframe-icon";
    }
}
