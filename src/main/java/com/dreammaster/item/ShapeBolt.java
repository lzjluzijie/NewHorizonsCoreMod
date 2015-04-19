package com.dreammaster.item;

import com.dreammaster.lib.Refstrings;

import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class ShapeBolt {

    public static void mainRegistry() {
        inizializedItem();
        registerItem();
    }

    public static Item ShapeBolt;

    public static void inizializedItem(){
        ShapeBolt = new Item().setUnlocalizedName("ShapeBolt")
                .setCreativeTab(CreativeTabs.tabMisc)
                .setTextureName(Refstrings.MODID + ":itemShapeBolt");

    }

    public static void registerItem(){
        GameRegistry.registerItem(ShapeBolt, ShapeBolt.getUnlocalizedName());

    }

}