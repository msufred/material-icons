package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class TerminalIcon extends SVGIcon {

    public TerminalIcon() {
        super(DEFAULT_SIZE, DEFAULT_SIZE * 0.8);
    }

    public TerminalIcon(double size) {
        super(size, size * 0.8);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M140 896q-24 0-42-18t-18-42V316q0-24 18-42t42-18h680q24 0 42 18t18 42v520q0 24-18 42t-42 " +
                "18H140Zm0-60h680V400H140v436Zm160-72-42-42 103-104-104-104 43-42 146 146-146 146Zm190 4v-60h220v60H490Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "terminal-icon";
    }
}
