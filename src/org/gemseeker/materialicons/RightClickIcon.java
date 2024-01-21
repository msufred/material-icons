package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class RightClickIcon extends SVGIcon {

    public RightClickIcon() {
        super();
    }

    public RightClickIcon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("m492 816 19-63q64-11 106.5-60.5T660 576q0-75-52.5-127.5T480 396q-68 0-117 42.5T303 545l-63 " +
                "20q5-97 74-163t166-66q100 0 170 70t70 170q0 97-66 166t-162 74ZM139 996l-79-79 171-171-151-50 " +
                "400-120-120 400-50-151-171 171Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "right-click-icon";
    }
}
