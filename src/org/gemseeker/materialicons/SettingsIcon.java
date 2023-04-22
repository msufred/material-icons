package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class SettingsIcon extends SVGIcon {

    public SettingsIcon() {
        super();
    }

    public SettingsIcon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("m388 976-20-126q-19-7-40-19t-37-25l-118 54-93-164 108-79q-2-9-2.5-20.5T185 " +
                "576q0-9 .5-20.5T188 535L80 456l93-164 118 54q16-13 37-25t40-18l20-127h184l20 126q19 " +
                "7 40.5 18.5T669 346l118-54 93 164-108 77q2 10 2.5 21.5t.5 21.5q0 10-.5 21t-2.5 21l108 " +
                "78-93 164-118-54q-16 13-36.5 25.5T592 850l-20 126H388Zm92-270q54 0 92-38t38-92q0-54-38-" +
                "92t-92-38q-54 0-92 38t-38 92q0 54 38 92t92 38Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "settings-icon";
    }

}
