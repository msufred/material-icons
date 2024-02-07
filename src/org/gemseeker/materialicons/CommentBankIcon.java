package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class CommentBankIcon extends SVGIcon {

    public CommentBankIcon() {
        super();
    }

    public CommentBankIcon(double size) {
        super(size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M20 2H4c-1.1 0-2 .9-2 2v18l4-4h14c1.1 0 2-.9 2-2V4c0-1.1-.9-2-2-2m-1 11l-2.5-1.5L14 13V5h5z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "comment-bank-icon";
    }
}
