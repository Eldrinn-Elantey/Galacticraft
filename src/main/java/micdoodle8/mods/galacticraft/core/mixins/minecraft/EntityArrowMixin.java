package micdoodle8.mods.galacticraft.core.mixins.minecraft;

import micdoodle8.mods.galacticraft.core.util.WorldUtil;
import net.minecraft.entity.projectile.EntityArrow;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.injection.Constant;
import org.spongepowered.asm.mixin.injection.ModifyConstant;

@Mixin(EntityArrow.class)
public abstract class EntityArrowMixin {

    @ModifyConstant(method = "onUpdate", constant = @Constant(floatValue = 0.05F), require = 1)
    private float onOnUpdate(float value) {
        return WorldUtil.getArrowGravity((EntityArrow) (Object) this);
    }
}
