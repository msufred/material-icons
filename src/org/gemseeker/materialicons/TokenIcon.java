package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class TokenIcon extends SVGIcon {

    public TokenIcon() {
        super(DEFAULT_SIZE, DEFAULT_SIZE * 1.125);
    }

    public TokenIcon(double size) {
        super(size, size * 1.125);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M366 478 153 353l327-177 327 177-213 125q-23-23-52.5-37.5T480 426q-32 0-61.5 14.5T366 478Zm84 " +
                "481L120 770V402l217 129q-4 11-5.5 22.5T330 576q0 53 34 93t86 54v236Zm30-293q-38 0-64-26t-26-64q0-38 " +
                "26-64t64-26q38 0 64 26t26 64q0 38-26 64t-64 26Zm30 293V723q52-14 86-54t34-93q0-11-1.5-22.5T623 " +
                "531l217-129v368L510 959Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "token-icon";
    }
}
