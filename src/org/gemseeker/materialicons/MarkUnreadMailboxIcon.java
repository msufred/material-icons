package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class MarkUnreadMailboxIcon extends SVGIcon {

    public MarkUnreadMailboxIcon() {
        super(DEFAULT_SIZE * 0.85, DEFAULT_SIZE);
    }

    public MarkUnreadMailboxIcon(double size) {
        super(size * 0.85, size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M20 6H10v6H8V4h6V0H6v6H4c-1.1 0-2 .9-2 2v12c0 1.1.9 2 2 2h16c1.1 0 2-.9 2-2V8c0-1.1-.9-2-2-2");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "mark-unread-mailbox-icon";
    }
}
