package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class PlagiarismIcon extends SVGIcon {

    public PlagiarismIcon() {
        super(DEFAULT_SIZE * 0.8, DEFAULT_SIZE);
    }

    public PlagiarismIcon(double size) {
        super(size * 0.8, size);
    }

    @Override
    protected Shape createShape() {
        SVGPath p1 = new SVGPath();
        p1.setContent("M14 2H6c-1.1 0-2 .9-2 2v16c0 1.1.89 2 1.99 2H18c1.1 0 2-.9 " +
                "2-2V8zm1.04 17.45l-1.88-1.88c-1.33.71-3.01.53-4.13-.59a3.495 3.495 " +
                "0 0 1 0-4.95a3.495 3.495 0 0 1 4.95 0a3.48 3.48 0 0 1 .59 4.13l1.88" +
                " 1.88zM13 9V3.5L18.5 9z");
        SVGPath p2 = new SVGPath();
        p2.setContent("M10,14.5a1.5,1.5 0 1,0 3,0a1.5,1.5 0 1,0 -3,0");
        return Shape.union(p1, p2);
    }

    @Override
    protected String getIconStyleClass() {
        return "plagiarism-icon";
    }
}
