package org.gemseeker.materialicons;

import javafx.scene.shape.SVGPath;
import javafx.scene.shape.Shape;

public class DnsIcon extends SVGIcon {

    public DnsIcon() {
        super();
    }

    public DnsIcon(double size) {
        super(size);
    }

    @Override
    protected Shape createShape() {
        SVGPath path = new SVGPath();
        path.setContent("M20 13H4c-.55 0-1 .45-1 1v6c0 .55.45 1 1 1h16c.55 0 1-.45 1-1v-6c0-.55-.45-1" +
                "-1-1M7 19c-1.1 0-2-.9-2-2s.9-2 2-2s2 .9 2 2s-.9 2-2 2M20 3H4c-.55 0-1 .45-1 1v6c0 .5" +
                "5.45 1 1 1h16c.55 0 1-.45 1-1V4c0-.55-.45-1-1-1M7 9c-1.1 0-2-.9-2-2s.9-2 2-2s2 .9 2 " +
                "2s-.9 2-2 2");
        return path;
    }

    @Override
    protected String getIconStyleClass() {
        return "dns-icon";
    }
}
