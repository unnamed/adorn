package team.unnamed.adorn.element;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.format.TextColor;
import org.jetbrains.annotations.NotNull;

import java.awt.*;

public record TextElement(
        String text,
        Color color
) implements Element {

    @Override
    public @NotNull Component asComponent() {
        return Component.text(text).color(TextColor.color(color.getRGB()));
    }
}
