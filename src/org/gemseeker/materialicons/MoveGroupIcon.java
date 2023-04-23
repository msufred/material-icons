package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class MoveGroupIcon extends SVGIcon {

    public MoveGroupIcon() {
        super();
    }

    public MoveGroupIcon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M260 856q-24 0-42-18t-18-42V636h60v160h560V296H260v160h-60V236q0-24 18-42t42-18h560q24 0 42 " +
                "18t18 42v560q0 24-18 42t-42 18H260ZM140 976q-24 0-42-18t-18-42V296h60v620h620v60H140Zm360-264-42-42 " +
                "93-94H200v-60h351l-93-94 42-42 166 166-166 166Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "move-group-icon";
    }
}
