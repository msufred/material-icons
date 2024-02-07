package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class CreditCardOffIcon extends SVGIcon {

    public CreditCardOffIcon() {
        super();
    }

    public CreditCardOffIcon(double size) {
        super(size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M21.9 21.9L2.1 2.1L.69 3.51l1.55 1.55c-.15.28-.23.6-.23.94L2 18c0 1.11.89 2 2 " +
                "2h13.17l3.31 3.31zM4 12V8h1.17l4 4zm2.83-8H20c1.11 0 2 .89 2 2v12c0 .34-.08.66-.23.94L" +
                "14.83 12H20V8h-9.17z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "credit-card-off-icon";
    }
}
