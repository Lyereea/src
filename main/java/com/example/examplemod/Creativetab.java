package com.example.examplemod;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class Creativetab
{
    public static final CreativeTabs HSM_TAB = new CreativeTabs(14, Reference.MOD_ID)
    {
        @Override
        public Item getTabIconItem()
        {
             return Items.stick;
        }

        @Override
        @SideOnly(Side.CLIENT)
        public String getTranslatedTabLabel()
        {
            return "Hsminecraft";
        }
    };
}
