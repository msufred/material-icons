package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class PinchIcon extends SVGIcon {

    public PinchIcon() {
        super(DEFAULT_SIZE * 1.125);
    }

    public PinchIcon(double size) {
        super(size * 1.125);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M40 526V336h50v105l255-255H240v-50h190v190h-50V221L125 476h105v50H40Zm524 490q-17 " +
                "0-32-6.5T506 992L324 799l32-33q11-11 25-13.5t29 .5l114 25V356q0-26 17-43t43-17q26 0 43 17t17 " +
                "43v240h36q11 0 19 1.5t17 6.5l163 82q24 12 36 35t8 49l-26 180q-5 29-28 47.5t-52 18.5H564Zm-26-" +
                "60h281l43-249-183-91h-55V396q0-18-11-29t-29-11q-18 0-29 11t-11 29v399l-154-33-23 23 171 171Zm0 " +
                "0L367 785l23-23 154 33V396q0-18 11-29t29-11q18 0 29 11t11 29v220h55l183 91-43 249H538Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "pinch-icon";
    }
}
