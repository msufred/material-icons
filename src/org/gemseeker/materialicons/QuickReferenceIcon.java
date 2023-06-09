package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class QuickReferenceIcon extends SVGIcon {

    public QuickReferenceIcon() {
        super(DEFAULT_SIZE, DEFAULT_SIZE * 1.125);
    }

    public QuickReferenceIcon(double size) {
        super(size, size * 1.125);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M610 906h40V756h-40v150Zm20-189q8 0 14-6.15t6-14.35q0-8.2-6-14.35T630 676q-9 0-14.5 6t-5.5 " +
                "14.286q0 8.285 5.5 14.5Q621 717 630 717Zm25 258q-80.51 0-137.255-56.745Q461 861.51 461 781q0-80.51 " +
                "56.745-137.255Q574.49 587 655 587q80.51 0 137.255 56.745Q849 700.49 849 781q0 80.51-56.745 " +
                "137.255Q735.51 975 655 975ZM511 422h189L511 236l189 186-189-186v186ZM180 976q-24.75 " +
                "0-42.375-17.625T120 916V236q0-24.75 17.625-42.375T180 176h361l219 219v155q-25-11-51.667-17-26." +
                "666-6-53.333-6-42 0-80 13t-70 36H279v60h167q-17 24-27.4 52.197Q408.2 716.393 403 746H279v60h123q5 " +
                "50 28.5 94t61.5 76H180Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "quick-reference-icon";
    }
}
