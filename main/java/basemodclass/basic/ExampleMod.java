package basemodclass.basic;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Blocks;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;

import java.util.ArrayList;

@Mod(modid = ExampleMod.MODID, version = ExampleMod.VERSION)
public class ExampleMod
{
    public static final String MODID = "examplemod";
    public static final String VERSION = "1.0";
    
    @EventHandler
    public void init(FMLInitializationEvent event)
    {
		// some example code
<<<<<<< HEAD:main/java/com/example/examplemod/ExampleMod.java
        //System.out.println("DIRT BLOCK >> "+Blocks.dirt.func_149730_j());
        System.out.println("Bacon");

        int args[] = {1,2,3,4,5};
        for (int i = 0; i < args.length; i++) {
            switch (args[i]){
                case 1:
                    test(Integer.toString(args[i]));
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    break;
                default:
                    break;
            }
        }
    }

    public void test(final String args) {

    }


    public void knight(String knight) {
=======
        System.out.println("DIRT BLOCK >> "+Blocks.dirt.func_149730_j());
        
       
>>>>>>> 37eb58360e1b3a559baefbb4146dd36b7d875acd:main/java/basemodclass/basic/ExampleMod.java

    }

    public void spy(String spy) {

    }

    public void wizard(String wizard) {

    }


}


