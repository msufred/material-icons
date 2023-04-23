package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class WidthFullIcon extends SVGIcon {

    public WidthFullIcon() {
        super(DEFAULT_SIZE, DEFAULT_SIZE * 0.75);
    }

    public WidthFullIcon(double size) {
        super(size, size * 0.75);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M140 896q-24.75 0-42.375-17.625T80 836V316q0-24.75 17.625-42.375T140 256h680q24.75 0 42.375 " +
                "17.625T880 316v520q0 24.75-17.625 42.375T820 896H140Zm0-60h70V316h-70v520Zm610 0h70V316h-70v520Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "width-full-icon";
    }
}
