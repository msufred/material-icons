package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class FitScreenIcon extends SVGIcon {

    public FitScreenIcon() {
        super(DEFAULT_SIZE * 1.125, DEFAULT_SIZE * 0.85);
    }

    public FitScreenIcon(double size) {
        super(size * 1.125, size * 0.85);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M820 446V316H690v-60h130q24 0 42 18t18 42v130h-60Zm-740 0V316q0-24 " +
                "18-42t42-18h130v60H140v130H80Zm610 450v-60h130V706h60v130q0 24-18 42t-42 " +
                "18H690Zm-550 0q-24 0-42-18t-18-42V706h60v130h130v60H140Zm60-120V376h560v400H200Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "fit-screen-icon";
    }
}
