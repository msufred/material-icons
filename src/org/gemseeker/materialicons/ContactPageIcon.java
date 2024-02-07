package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class ContactPageIcon extends SVGIcon {

    public ContactPageIcon() {
        super(DEFAULT_SIZE * 0.8, DEFAULT_SIZE);
    }

    public ContactPageIcon(double size) {
        super(size * 0.8, size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M14 2H6c-1.1 0-2 .9-2 2v16c0 1.1.9 2 2 2h12c1.1 0 2-.9 2-2V8zm-2 8c1.1 0 2 .9 2 2s-.9 2-2 " +
                "2s-2-.9-2-2s.9-2 2-2m4 8H8v-.57c0-.81.48-1.53 1.22-1.85a6.95 6.95 0 0 1 5.56 0A2.01 2.01 0 0 1 16 17.43z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "contact-page-icon";
    }
}
