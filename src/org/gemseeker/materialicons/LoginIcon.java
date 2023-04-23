package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class LoginIcon extends SVGIcon {

    public LoginIcon() {
        super();
    }

    public LoginIcon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M489 936v-60h291V276H489v-60h291q24 0 42 18t18 42v600q0 24-18 42t-42 18H489Zm-78-185-43-43 " +
                "102-102H120v-60h348L366 444l43-43 176 176-174 174Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "login-icon";
    }
}
