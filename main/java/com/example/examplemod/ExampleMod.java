package com.example.examplemod;


import net.minecraft.world.biome.BiomeGenBase;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;
import cpw.mods.fml.common.registry.GameRegistry;


@Mod(modid = ExampleMod.MODID, version = ExampleMod.VERSION)
public class ExampleMod
{

    public static final String MODID = "examplemod";
    public static final String VERSION = "1.0";
    
    
    
    public static final BiomeGenBase hsminecraft = (new BiomeGenHsminecraft(21, false)).setColor(5470985).setBiomeName("hsminceaft").func_76733_a(5470985).setTemperatureRainfall(0.95F, 0.9F);
    
    
    TreeManager treeManger = new TreeManager();
    
   
    @EventHandler
    public void init(FMLInitializationEvent event){
    	GameRegistry.registerWorldGenerator(treeManger, 0);
    	
    	
		
    }
    
    
    @EventHandler
    public void preinit(FMLPreInitializationEvent event){
    	
    	
    	
   
    }
    
    
}

  