package team.unnamed.adorn;

import team.unnamed.adorn.asset.OverlayAsset;

import java.util.Collection;

public record Overlay(
        String name,
        Collection<Adorn> adorns,
        OverlayAsset asset
) {
}
