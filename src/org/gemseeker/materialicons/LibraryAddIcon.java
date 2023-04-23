package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class LibraryAddIcon extends SVGIcon {

    public LibraryAddIcon() {
        super();
    }

    public LibraryAddIcon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M510 678h60V546h132v-60H570V354h-60v132H378v60h132v132ZM260 856q-24 0-42-18t-18-42V236q0-24 " +
                "18-42t42-18h560q24 0 42 18t18 42v560q0 24-18 42t-42 18H260ZM140 976q-24 0-42-18t-18-42V296h60v620h620v60H140Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "library-add-icon";
    }
}
