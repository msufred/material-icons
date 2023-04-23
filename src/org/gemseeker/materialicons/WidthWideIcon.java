package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class WidthWideIcon extends SVGIcon {

    public WidthWideIcon() {
        super(DEFAULT_SIZE, DEFAULT_SIZE * 0.75);
    }

    public WidthWideIcon(double size) {
        super(size, size * 0.75);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M140 896q-24.75 0-42.375-17.625T80 836V316q0-24.75 17.625-42.375T140 256h680q24.75 0 42.375 " +
                "17.625T880 316v520q0 24.75-17.625 42.375T820 896H140Zm0-60h110V316H140v520Zm570 0h110V316H710v520Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "width-wide-icon";
    }
}
