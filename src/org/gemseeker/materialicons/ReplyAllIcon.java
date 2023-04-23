package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class ReplyAllIcon extends SVGIcon {

    public ReplyAllIcon() {
        super(DEFAULT_SIZE * 1.125, DEFAULT_SIZE * 0.825);
    }

    public ReplyAllIcon(double size) {
        super(size * 1.125, size * 0.825);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M316 768 80 532l236-236 43 43-193 193 193 193-43 43Zm503 88V700q0-60-39-99t-99-39H376l163 " +
                "163-43 43-236-236 236-236 43 43-163 163h305q85 0 141.5 56.5T879 700v156h-60Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "reply-all-icon";
    }
}
