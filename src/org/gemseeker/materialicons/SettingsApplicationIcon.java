package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class SettingsApplicationIcon extends SVGIcon {

    public SettingsApplicationIcon() {
        super();
    }

    public SettingsApplicationIcon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M452 770h56l10-54q20-6 34-15t26-21l62 19 26-54-47-30q4-21 4-39t-4-39l47-30-26-54-62 " +
                "19q-12-12-26-21t-34-15l-10-54h-56l-10 54q-20 6-34 15t-26 21l-62-19-26 54 47 30q-4 21-4 39t4 " +
                "39l-47 30 26 54 62-19q12 12 26 21t34 15l10 54Zm28-109q-36 0-60.5-24.5T395 576q0-36 24.5-60.5T480 " +
                "491q36 0 60.5 24.5T565 576q0 36-24.5 60.5T480 661ZM180 936q-24 0-42-18t-18-42V276q0-24 " +
                "18-42t42-18h600q24 0 42 18t18 42v600q0 24-18 42t-42 18H180Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "settings-application-icon";
    }
}
