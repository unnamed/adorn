package team.unnamed.adorn.element;

import net.kyori.adventure.text.Component;
import org.jetbrains.annotations.NotNull;
import team.unnamed.adorn.asset.ImageAsset;

public record ImageElement(ImageAsset asset) implements Element {

    @Override
    public @NotNull Component asComponent() {
        return Component.text(asset.character()).style(builder -> builder.font(asset.font()));
    }
}
