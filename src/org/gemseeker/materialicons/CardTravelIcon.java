package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class CardTravelIcon extends SVGIcon {

    public CardTravelIcon() {
        super();
    }

    public CardTravelIcon(double size) {
        super(size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M20 6h-3V4c0-1.11-.89-2-2-2H9c-1.11 0-2 .89-2 2v2H4c-1.11 0-2 .89-2 2v11c0 " +
                "1.11.89 2 2 2h16c1.11 0 2-.89 2-2V8c0-1.11-.89-2-2-2M9 4h6v2H9zm11 15H4v-2h16zm0-5" +
                "H4V8h3v2h2V8h6v2h2V8h3z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "card-travel-icon";
    }
}
