package studio.dreamys;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;

@Mod(modid = Her666.MODID, name = Her666.NAME, version = Her666.VERSION)
public class Her666 {

    public static final String MODID = "her666";
    public static final String NAME = "Her666";
    public static final String VERSION = "1.0";

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        System.out.println("Her666 has loaded!");
        System.out.println("DIRT BLOCK >> " + Blocks.dirt.getUnlocalizedName());
    }
}
