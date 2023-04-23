package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;

public class CaptivePortalIcon extends SVGIcon {

    public CaptivePortalIcon() {
        super();
    }

    public CaptivePortalIcon(double size) {
        super(size);
    }

    @Override
    protected SVGPath createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M394 905q-26-40-43-82.5T323 726H172q35 70 91 115t131 64ZM152 666h160q-3-24-4-43.5t-1-44.5q0-21 " +
                ".5-42.5T311 487H152q-7 24-9.5 44.5T140 578q0 26 2.5 45t9.5 43Zm20-239h150q12-55 30-99t43-82q-85 29-135 " +
                "69.5T172 427Zm212 0h193q-15-64-38.5-110.5T480 234q-35 37-58.5 85T384 427Zm255 0h149q-35-65-92.5-111T566 " +
                "247q25 38 42.5 82t30.5 98ZM480 976q-84 0-157-30.5T196 861q-54-54-85-126.5T80 578q0-84 31-157.5T196 " +
                "293q54-54 127-85.5T480 176q84 0 157 31.5T764 293q54 54 85 127.5T880 578q0 17-1 34t-4 34h-62q4-17 " +
                "5.5-32.5T820 578q0-26-2.5-46.5T808 487H648q3 30 4.5 49.5T654 578q0 14-.5 28.5T651 646h-61q2-21 " +
                "3-36t1-32q0-21-1-40.5t-5-50.5H373q-4 31-5 50.5t-1 40.5q0 20 1 38.5t5 49.5h177v60H384q20 75 42 " +
                "119t54 71q21-22 38.5-49t31.5-56v159q-17 3-34.5 4.5T480 976Zm318-39L670 809v103h-60V706h206v60H712l128 " +
                "128-42 43Z");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "captive-portal-icon";
    }
}
