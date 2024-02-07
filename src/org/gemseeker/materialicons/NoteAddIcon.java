package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class NoteAddIcon extends SVGIcon {

    public NoteAddIcon() {
        super(DEFAULT_SIZE * 0.8, DEFAULT_SIZE);
    }

    public NoteAddIcon(double size) {
        super(size * 0.8, size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M14 2H6c-1.1 0-1.99.9-1.99 2L4 20c0 1.1.89 2 1.99 2H18c1.1 0 2-.9 " +
                "2-2V8zm2 14h-3v3h-2v-3H8v-2h3v-3h2v3h3zm-3-7V3.5L18.5 9z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "note-add-icon";
    }
}
