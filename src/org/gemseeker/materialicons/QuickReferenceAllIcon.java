package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class QuickReferenceAllIcon extends SVGIcon {

    public QuickReferenceAllIcon() {
        super(DEFAULT_SIZE, DEFAULT_SIZE * 1.125);
    }

    public QuickReferenceAllIcon(double size) {
        super(size, size * 1.125);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M660 866q46 0 78-31.5t32-78.5q0-46-32-78t-78-32q-47 0-78.5 32T550 756q0 47 31.5 78.5T660 " +
                "866Zm204 136L757 896q-21 14-45.5 22t-51.5 8q-71 0-120.5-49.5T490 756q0-70 49.5-120T660 586q70 0 120 " +
                "50t50 120q0 28-8.5 52.5T799 854l106 106-41 42Zm-684-26q-24 0-42-18t-18-42V236q0-24 18-42t42-18h361l219 " +
                "219v154q-24-11-49-17t-51-6q-42 0-78.5 13T516 576H279v60h185q-15 24-23.5 52T430 746H279v60h156q14 60 " +
                "55.5 106T592 976H180Zm331-554h189L511 236l189 186-189-186v186Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "quick-reference-all-icon";
    }
}
