package team.unnamed.adorn;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.ComponentLike;
import org.jetbrains.annotations.NotNull;
import team.unnamed.adorn.element.Element;
import team.unnamed.adorn.struct.Vec2;

import java.util.List;

public record Adorn(
        List<Element> elements,
        Alignment horizontalAlignment,
        Vec2 position,
        Vec2 scale
) implements ComponentLike {

    @Override
    public @NotNull Component asComponent() {
        Component joined = Component.empty();
        for (Element element : elements) {
            joined = joined.append(element.asComponent());
        }

        switch (horizontalAlignment) {
            case LEFT -> joined = joined.append(joined.color(Minecraft.HIDDEN_COLOR));
            case RIGHT -> joined = joined.color(Minecraft.HIDDEN_COLOR).append(joined);
        }

        return joined;
    }

    public enum Alignment {
        LEFT,
        CENTER,
        RIGHT
    }
}
