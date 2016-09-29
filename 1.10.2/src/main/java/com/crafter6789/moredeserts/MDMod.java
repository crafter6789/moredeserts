package com.crafter6789.moredeserts;

import org.apache.logging.log4j.Level;

import com.crafter6789.moredeserts.blocks.MDBlocks;

import net.minecraft.init.Blocks;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = RefStrings.MODID, version = RefStrings.VERSION, name = RefStrings.NAME, acceptedMinecraftVersions = RefStrings.REQMC)
public class MDMod {    
	@EventHandler
    public void PreInit(FMLPreInitializationEvent event){
		MDBlocks.register();
		
		
		net.minecraftforge.fml.relauncher.FMLRelaunchLog.log(Level.INFO, "%s Finished %s.", "[com.crafter6789.moredeserts.MDMod]", "PreInit");
	}
	
	@EventHandler
    public void init(FMLInitializationEvent event){
		
		
		net.minecraftforge.fml.relauncher.FMLRelaunchLog.log(Level.INFO, "%s Finished %s.", "[com.crafter6789.moredeserts.MDMod]", "Init");
	}
	
	@EventHandler
    public void PostInit(FMLPostInitializationEvent event){
		
		
		net.minecraftforge.fml.relauncher.FMLRelaunchLog.log(Level.INFO, "%s Finished %s.", "[com.crafter6789.moredeserts.MDMod]", "PostInit");
		net.minecraftforge.fml.relauncher.FMLRelaunchLog.log(Level.INFO, "%s However, there may still be %s.", "[com.crafter6789.moredeserts.MDMod]", "fatal errors");
	}
}
