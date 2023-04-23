package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class CompressIcon extends SVGIcon {

    public CompressIcon() {
        super(DEFAULT_SIZE, DEFAULT_SIZE * 1.25);
    }

    public CompressIcon(double size) {
        super(size, size * 1.25);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M449 976V818l-77 76-42-42 149-148 147 148-42 42-75-76v158h-60ZM161 " +
                "646v-60h639v60H161Zm0-121v-60h639v60H161Zm318-117L331 260l42-42 75 " +
                "76V136h60v158l77-76 42 42-148 148Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "compress-icon";
    }
}
