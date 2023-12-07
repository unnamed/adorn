package team.unnamed.adorn.writer;

import team.unnamed.adorn.Overlay;
import team.unnamed.creative.ResourcePack;

import java.util.Collection;

@FunctionalInterface
public interface OverlayWriter<T> {

    void write(T target, Collection<Overlay> overlays);

    static OverlayWriter<ResourcePack> creative() {
        return new CreativeOverlayWriter();
    }

}
