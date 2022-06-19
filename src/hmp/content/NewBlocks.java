package hmp.content;

import arc.graphics.*;
import arc.math.*;
import arc.struct.*;
import mindustry.*;
import mindustry.entities.*;
import mindustry.entities.bullet.*;
import mindustry.entities.effect.*;
import mindustry.entities.part.*;
import mindustry.entities.pattern.*;
import mindustry.gen.*;
import mindustry.graphics.*;
import mindustry.type.*;
import mindustry.world.*;
import mindustry.world.blocks.*;
import mindustry.world.blocks.campaign.*;
import mindustry.world.blocks.defense.*;
import mindustry.world.blocks.defense.turrets.*;
import mindustry.world.blocks.distribution.*;
import mindustry.world.blocks.environment.*;
import mindustry.world.blocks.heat.*;
import mindustry.world.blocks.legacy.*;
import mindustry.world.blocks.liquid.*;
import mindustry.world.blocks.logic.*;
import mindustry.world.blocks.payloads.*;
import mindustry.world.blocks.power.*;
import mindustry.world.blocks.production.*;
import mindustry.world.blocks.sandbox.*;
import mindustry.world.blocks.storage.*;
import mindustry.world.blocks.units.*;
import mindustry.world.consumers.*;
import mindustry.world.draw.*;
import mindustry.world.meta.*;
import static mindustry.content.Liquids.*;
import static mindustry.type.ItemStack.*;

public class NewBlocks implements ContentList{
	public static Block 
    xenonCollector; 

	@Override
    public void load(){
        xenonCollector = new GenericCrafter("xenon-collector"){{
            requirements(Category.production, with(Items.copper,750,Items.lead,500,Items.silicon,500,Items.phaseFabric,100,Items.surgeAlloy,50));
            size = 3;
            craftTime = 60f;
            hasPower = true;
            hasLiquids = true;
            consumePower(2f);
        }};
    }
}
