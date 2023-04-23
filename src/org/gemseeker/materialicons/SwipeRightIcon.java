package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class SwipeRightIcon extends SVGIcon {

    public SwipeRightIcon() {
        super(DEFAULT_SIZE, DEFAULT_SIZE * 1.125);
    }

    public SwipeRightIcon(double size) {
        super(size, size * 1.125);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M80 366q24-85 131-157.5T479 136q97 0 187 36t163 96v-87h50v190H689v-50h125q-69-60-156-97.5T479 " +
                "186q-143 0-232 60T133 366H80Zm360 650q-17 0-32-6.5T382 992L200 799l32-33q11-11 25-13.5t29 .5l114 " +
                "25V356q0-26 17-43t43-17q26 0 43 17t17 43v240h36q11 0 19 1.5t17 6.5l163 82q24 12 36 35t8 49l-26 " +
                "180q-5 29-28 47.5t-52 18.5H440Zm-26-60h281l43-249-183-91h-55V396q0-18-11-29t-29-11q-18 0-29 " +
                "11t-11 29v399l-154-33-23 23 171 171Zm0 0L243 785l23-23 154 33V396q0-18 11-29t29-11q18 0 29 " +
                "11t11 29v220h55l183 91-43 249H414Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "swipe-right-icon";
    }
}
