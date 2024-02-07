package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class HotelClassIcon extends SVGIcon {

    public HotelClassIcon() {
        super(DEFAULT_SIZE, DEFAULT_SIZE * 0.85);
    }

    public HotelClassIcon(double size) {
        super(size, size * 0.85);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M8.58 10H1l6.17 4.41L4.83 22L11 17.31L17.18 22l-2.35-7.59L21 10h-7.58L11 2zm12.78 12l-1." +
                "86-6.01L23.68 13h-3.44l-3.08 2.2l1.46 4.72zM17 8l-1.82-6l-1.04 3.45l.77 2.55z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "hotel-class-icon";
    }

}
