package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class HttpIcon extends SVGIcon {

    public HttpIcon() {
        super(DEFAULT_SIZE * 1.6, DEFAULT_SIZE * 0.45);
    }

    public HttpIcon(double size) {
        super(size * 1.6, size * 0.45);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M4.5 11h-2V9H1v6h1.5v-2.5h2V15H6V9H4.5zm2.5-.5h1.5V15H10v-4.5h1.5V9H7zm5.5 " +
                "0H14V15h1.5v-4.5H17V9h-4.5zm9-1.5H18v6h1.5v-2h2c.8 0 1.5-.7 1.5-1.5v-1c0-.8-.7-1.5-" +
                "1.5-1.5m0 2.5h-2v-1h2z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "http-icon";
    }
}
