package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class CardGiftCardIcon extends SVGIcon {

    public CardGiftCardIcon() {
        super(DEFAULT_SIZE, DEFAULT_SIZE * 0.95);
    }

    public CardGiftCardIcon(double size) {
        super(size, size * 0.95);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M20 6h-2.18c.11-.31.18-.65.18-1a2.996 2.996 0 0 0-5.5-1.65l-.5.67l-.5-" +
                ".68C10.96 2.54 10.05 2 9 2C7.34 2 6 3.34 6 5c0 .35.07.69.18 1H4c-1.11 0-1.99" +
                ".89-1.99 2L2 19c0 1.11.89 2 2 2h16c1.11 0 2-.89 2-2V8c0-1.11-.89-2-2-2m-5-2c" +
                ".55 0 1 .45 1 1s-.45 1-1 1s-1-.45-1-1s.45-1 1-1M9 4c.55 0 1 .45 1 1s-.45 1-1" +
                " 1s-1-.45-1-1s.45-1 1-1m11 15H4v-2h16zm0-5H4V8h5.08L7 10.83L8.62 12L11 8.76l" +
                "1-1.36l1 1.36L15.38 12L17 10.83L14.92 8H20z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "card-gift-card-icon";
    }
}
