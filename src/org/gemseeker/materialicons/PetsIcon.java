package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class PetsIcon extends SVGIcon {

    public PetsIcon() {
        super(DEFAULT_SIZE, DEFAULT_SIZE * 0.95);
    }

    public PetsIcon(double size) {
        super(size, size * 0.95);
    }

    @Override
    protected Shape createShape() {
        SVGPath p1 = new SVGPath();
        p1.setContent("M2,9.5a2.5,2.5 0 1,0 5,0a2.5,2.5 0 1,0 -5,0");
        SVGPath p2 = new SVGPath();
        p2.setContent("M6.5,5.5a2.5,2.5 0 1,0 5,0a2.5,2.5 0 1,0 -5,0");
        SVGPath p3 = new SVGPath();
        p3.setContent("M12.5,5.5a2.5,2.5 0 1,0 5,0a2.5,2.5 0 1,0 -5,0");
        SVGPath p4 = new SVGPath();
        p4.setContent("M17,9.5a2.5,2.5 0 1,0 5,0a2.5,2.5 0 1,0 -5,0");
        SVGPath p5 = new SVGPath();
        p5.setContent("M17.34 14.86c-.87-1.02-1.6-1.89-2.48-2.91c-.46-.54-1.05-1." +
                "08-1.75-1.32c-.11-.04-.22-.07-.33-.09c-.25-.04-.52-.04-.78-.04s-" +
                ".53 0-.79.05c-.11.02-.22.05-.33.09c-.7.24-1.28.78-1.75 1.32c-.87" +
                " 1.02-1.6 1.89-2.48 2.91c-1.31 1.31-2.92 2.76-2.62 4.79c.29 1.02" +
                " 1.02 2.03 2.33 2.32c.73.15 3.06-.44 5.54-.44h.18c2.48 0 4.81.58" +
                " 5.54.44c1.31-.29 2.04-1.31 2.33-2.32c.31-2.04-1.3-3.49-2.61-4.8");
        return Shape.union(Shape.union(Shape.union(p1, p2), Shape.union(p3, p4)), p5);
    }

    @Override
    protected String getIconStyleClass() {
        return "pets-icon";
    }
}
