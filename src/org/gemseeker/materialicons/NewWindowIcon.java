package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class NewWindowIcon extends SVGIcon {

    public NewWindowIcon() {
        super();
    }

    public NewWindowIcon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M180 936q-24 0-42-18t-18-42V276q0-24 18-42t42-18h300v60H180v600h600V576h60v300q0 24-18 42t-42 " +
                "18H180Zm480-420V396H540v-60h120V216h60v120h120v60H720v120h-60Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "new-window-icon";
    }
}
