package hmp.content;

import arc.graphics.*;
import arc.math.*;
import arc.struct.*;
import mindustry.*;
import mindustry.content.*;
import mindustry.game.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.consumer.*;
import mindustry.world.*;
import mindustry.world.blocks.production.*;
import mindustry.world.draw.*;
import mindustry.world.meta.*;
import static mindustry.type.ItemStack.*;

public class NewBlocks {
	public static Block xenonCollector; 

    public void load(){
        xenonCollector = new GenericCrafter("xenon-collector"){{
            requirements(Category.production, with(Items.copper, 750, Items.lead, 500, Items.silicon, 500, Items.phaseFabric, 100, Items.surgeAlloy, 50));
            size = 3;
            craftTime = 60.0f;
            hasPower = true;
            hasLiquids = true;
            consumePower(2f);
        }};
    }
}
