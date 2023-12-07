package team.unnamed.adorn.minestomce;

import net.minestom.server.entity.EntityCreature;
import net.minestom.server.entity.EntityType;
import team.unnamed.adorn.Adorn;
import team.unnamed.adorn.view.BaseAdornView;

public class AdornEntity extends EntityCreature implements BaseAdornView {

    private final Adorn adorn;

    public AdornEntity(Adorn adorn) {
        super(EntityType.TEXT_DISPLAY);
        this.adorn = adorn;
    }

    @Override
    public Adorn adorn() {
        return adorn;
    }
}
