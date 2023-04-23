package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class ViewCompactAltIcon extends SVGIcon {

    public ViewCompactAltIcon() {
        super(DEFAULT_SIZE * 1.25, DEFAULT_SIZE);
    }

    public ViewCompactAltIcon(double size) {
        super(size * 1.25, size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M325 731h140V591H325v140Zm0-170h140V421H325v140Zm170 170h140V591H495v140Zm0-170h140V421H495v1" +
                "40ZM140 896q-24 0-42-18t-18-42V316q0-24 18-42t42-18h680q24 0 42 18t18 42v520q0 24-18 42t-42 18H140Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "view-compact-alt-icon";
    }
}
