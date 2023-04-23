package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class FileOpenIcon extends SVGIcon {

    public FileOpenIcon() {
        super();
    }

    public FileOpenIcon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M878 977 750 849v125h-60V746h228v60H792l128 128-42 43ZM520 456h220L520 236v220ZM220 " +
                "976q-24 0-42-18t-18-42V236q0-24 18-42t42-18h340l240 240v270H630v290H220Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "file-open-icon";
    }
}
