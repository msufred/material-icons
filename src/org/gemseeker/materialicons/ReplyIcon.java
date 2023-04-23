package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class ReplyIcon extends SVGIcon {

    public ReplyIcon() {
        super(DEFAULT_SIZE * 1.125, DEFAULT_SIZE * 0.825);
    }

    public ReplyIcon(double size) {
        super(size * 1.125, size * 0.825);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M780 856V682q0-54-38-92t-92-38H234l154 154-42 42-226-226 226-226 42 42-154 154h416q78 0 134 " +
                "55.5T840 682v174h-60Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "reply-icon";
    }
}
