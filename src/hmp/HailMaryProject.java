package hmp;

import hmp.content.*;
import mindustry.ctype.*;
import mindustry.mod.*;
import static mindustry.Vars.*;

public class HailMaryProject extends Mod{
    public static NewBlocks newblocks = new NewBlocks();
    @Override
    public void init(){
    }

    @Override
    public void loadContent(){
        newblocks.load();
    }
}
