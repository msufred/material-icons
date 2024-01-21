package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class StackIcon extends SVGIcon {

    public StackIcon() {
        super();
    }

    public StackIcon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M260 676v60H140q-24.75 0-42.375-17.625T80 676V236q0-24.75 17.625-42.375T140 176h440q24.75 " +
                "0 42.375 17.625T640 236v120h-60V236H140v440h120Zm120 300q-24.75 0-42.375-17.625T320 916V476q0-24.75 " +
                "17.625-42.375T380 416h440q24.75 0 42.375 17.625T880 476v440q0 24.75-17.625 42.375T820 976H380Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "stack-icon";
    }
}
