package de.darth_griefer_.chemistry.core.init;

import de.darth_griefer_.chemistry.Chemistry;
import de.darth_griefer_.chemistry.common.material.CustomToolMaterial;
import de.darth_griefer_.chemistry.core.itemgroup.*;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Chemistry.MOD_ID);

    public static final RegistryObject<Item> WASSERSTOFF_GAS = ITEMS.register("wasserstoff_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> HELIUM_GAS = ITEMS.register("helium_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> BORON_GAS = ITEMS.register("boron_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> BERYLLIUM_GAS = ITEMS.register("beryllium_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> CARBON_GAS = ITEMS.register("carbon_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> LITHIUM_GAS = ITEMS.register("lithium_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> FLUESSIG_WASSERSTOFF = ITEMS.register("fluessig_wasserstoff",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> LITHIUM_INGOT = ITEMS.register("lithium_ingot",
            ()->new Item(new Item.Properties().group(IngotGroup.INGOTS)));

    public static final RegistryObject<Item> FLUESSIGKEITEN_BEHAELTER = ITEMS.register("fluessigkeiten_behaelter",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> GAS_BEHAELTER = ITEMS.register("gas_behaelter",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> RAW_LITHIUM = ITEMS.register("raw_lithium",
            ()->new Item(new Item.Properties().group(RandomGroup.STUFF)));

    public static final RegistryObject<Item> RAW_CARBON = ITEMS.register("raw_carbon",
            ()->new Item(new Item.Properties().group(RandomGroup.STUFF)));

    public static final RegistryObject<Item> CARBON_STRING = ITEMS.register("carbon_string",
            ()->new Item(new Item.Properties().group(RandomGroup.STUFF)));

    public static final RegistryObject<Item> ION_LINSE = ITEMS.register("ion_linse",
            ()->new Item(new Item.Properties().group(RandomGroup.STUFF)));

    public static final RegistryObject<Item> NETHER_CARBON_FASER = ITEMS.register("nether_carbon_faser",
            ()->new Item(new Item.Properties().group(RandomGroup.STUFF)));

    public static final RegistryObject<Item> CARBON_FASER = ITEMS.register("carbon_faser",
            ()->new Item(new Item.Properties().group(RandomGroup.STUFF)));

    public static final RegistryObject<Item> CARBON_NET = ITEMS.register("carbon_net",
            ()->new Item(new Item.Properties().group(RandomGroup.STUFF)));

    public static final RegistryObject<Item> CARBON_PICKAXE = ITEMS.register("carbon_pickaxe",
            ()->new PickaxeItem(CustomToolMaterial.CARBON_PICKAXE, 3, -1f,
                    new Item.Properties().group(ToolGroup.TOOLS)));

    public static final RegistryObject<Item> HEATING_BAR = ITEMS.register("heating_bar",
            ()->new Item(new Item.Properties().group(RandomGroup.STUFF)));

    public static final RegistryObject<Item> COOLING_BAR = ITEMS.register("cooling_bar",
            ()->new Item(new Item.Properties().group(RandomGroup.STUFF)));

    public static final RegistryObject<Item> LED_LAMPE = ITEMS.register("led_lampe",
            ()->new Item(new Item.Properties().group(RandomGroup.STUFF)));

    public static final RegistryObject<Item> COOLING_RING = ITEMS.register("cooling_ring",
            ()->new Item(new Item.Properties().group(RandomGroup.STUFF)));

    public static final RegistryObject<Item> HEATING_RING = ITEMS.register("heating_ring",
            ()->new Item(new Item.Properties().group(RandomGroup.STUFF)));

    public static final RegistryObject<Item> BOOK_OF_PHYSIKS = ITEMS.register("book_of_physiks",
            ()->new Item(new Item.Properties().group(RandomGroup.STUFF)));

    public static final RegistryObject<Item> BOOK_OF_CHEMISTRY = ITEMS.register("book_of_chemistry",
            ()->new Item(new Item.Properties().group(RandomGroup.STUFF)));

    public static final RegistryObject<Item> BOOK_OF_BIOLOGIE = ITEMS.register("book_of_biologie",
            ()->new Item(new Item.Properties().group(RandomGroup.STUFF)));

    public static final RegistryObject<Item> RGB_LAMPE = ITEMS.register("rgb_lampe",
            ()->new Item(new Item.Properties().group(RandomGroup.STUFF)));

    public static final RegistryObject<Item> PROZESSOR = ITEMS.register("prozessor",
            ()->new Item(new Item.Properties().group(RandomGroup.STUFF)));

    public static final RegistryObject<Item> GRAFIKKARTE = ITEMS.register("grafikkarte",
            ()->new Item(new Item.Properties().group(RandomGroup.STUFF)));

    public static final RegistryObject<Item> MAGNET = ITEMS.register("magnet",
            ()->new Item(new Item.Properties().group(RandomGroup.STUFF)));

    public static final RegistryObject<Item> FLUESSIG_HELIUM = ITEMS.register("fluessig_helium",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_LITHIUM = ITEMS.register("fluessig_lithium",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_BERYLLIUM = ITEMS.register("fluessig_beryllium",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_BORON = ITEMS.register("fluessig_boron",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_CARBON = ITEMS.register("fluessig_carbon",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_STICKSTOFF = ITEMS.register("fluessig_stickstoff",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_SAUERSTOFF = ITEMS.register("fluessig_sauerstoff",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_FLUORINE = ITEMS.register("fluessig_fluorine",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_NEON = ITEMS.register("fluessig_neon",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> BORON_SMARAGD = ITEMS.register("boron_smaragd",
            ()->new Item(new Item.Properties().group(RandomGroup.STUFF)));

    public static final RegistryObject<Item> CARBON_FASER_INGOT = ITEMS.register("carbon_faser_ingot",
            ()->new Item(new Item.Properties().group(RandomGroup.STUFF)));

    public static final RegistryObject<Item> NEON_CRISTALL = ITEMS.register("neon_cristall",
            ()->new Item(new Item.Properties().group(RandomGroup.STUFF)));

    public static final RegistryObject<Item> BIOLOGIE_PROZESSOR = ITEMS.register("biologie_prozessor",
            ()->new Item(new Item.Properties().group(RandomGroup.STUFF)));

    public static final RegistryObject<Item> PHYSIK_PROZESSOR = ITEMS.register("physik_prozessor",
            ()->new Item(new Item.Properties().group(RandomGroup.STUFF)));

    public static final RegistryObject<Item> CHEMIE_PROZESSOR = ITEMS.register("chemie_prozessor",
            ()->new Item(new Item.Properties().group(RandomGroup.STUFF)));

    public static final RegistryObject<Item> BORON_SHARD = ITEMS.register("boron_shard",
            ()->new Item(new Item.Properties().group(RandomGroup.STUFF)));

    public static final RegistryObject<Item> RAW_BORON = ITEMS.register("raw_boron",
            ()->new Item(new Item.Properties().group(RandomGroup.STUFF)));

    public static final RegistryObject<Item> RAW_BERYLLIUM = ITEMS.register("raw_beryllium",
            ()->new Item(new Item.Properties().group(RandomGroup.STUFF)));

    public static final RegistryObject<Item> BERYLLIUM_ROCK = ITEMS.register("beryllium_rock",
            ()->new Item(new Item.Properties().group(RandomGroup.STUFF)));

    public static final RegistryObject<Item> STICKSTOFF_CRISTALL = ITEMS.register("stickstoff_cristall",
            ()->new Item(new Item.Properties().group(RandomGroup.STUFF)));

    public static final RegistryObject<Item> URAN_CRISTALL = ITEMS.register("uran_cristall",
            ()->new Item(new Item.Properties().group(RandomGroup.STUFF)));

    public static final RegistryObject<Item> FLUESSIG_ARGON = ITEMS.register("fluessig_argon",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_NATRIUM = ITEMS.register("fluessig_natrium",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_MAGNESIUM = ITEMS.register("fluessig_magnesium",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_ALUMINIUM = ITEMS.register("fluessig_aluminium",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_SILICIUM = ITEMS.register("fluessig_silicium",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_PHOSPHOR = ITEMS.register("fluessig_phosphor",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_SCHWEFEL = ITEMS.register("fluessig_schwefel",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_CHLOR = ITEMS.register("fluessig_chlor",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_KALIUM = ITEMS.register("fluessig_kalium",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_CALCIUM = ITEMS.register("fluessig_calcium",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_SCANDIUM = ITEMS.register("fluessig_scandium",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_TITAN = ITEMS.register("fluessig_titan",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_VANADIUM = ITEMS.register("fluessig_vanadium",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_CHROM = ITEMS.register("fluessig_chrom",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_MANGAN = ITEMS.register("fluessig_mangan",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_EISEN = ITEMS.register("fluessig_eisen",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_KOBALT = ITEMS.register("fluessig_kobalt",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_NICKEL = ITEMS.register("fluessig_nickel",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_KUPFER = ITEMS.register("fluessig_kupfer",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_ZINK = ITEMS.register("fluessig_zink",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_GALLIUM = ITEMS.register("fluessig_gallium",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_GERMANIUM = ITEMS.register("fluessig_germanium",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_ARSEN = ITEMS.register("fluessig_arsen",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_SELEN = ITEMS.register("fluessig_selen",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_BROM = ITEMS.register("fluessig_brom",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_KRYPTON = ITEMS.register("fluessig_krypton",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_RUBIDIUM = ITEMS.register("fluessig_rubidium",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_STRONTIUM = ITEMS.register("fluessig_strontium",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_YTTRIUM = ITEMS.register("fluessig_yttrium",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_ZIRCONIUM = ITEMS.register("fluessig_zirconium",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_NIOB = ITEMS.register("fluessig_niob",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_MOLYBDAEN = ITEMS.register("fluessig_molybdaen",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_TECHNETIUM = ITEMS.register("fluessig_technetium",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_RUTHENIUM = ITEMS.register("fluessig_ruthenium",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_RHODIUM = ITEMS.register("fluessig_rhodium",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_PALLADIUM = ITEMS.register("fluessig_palladium",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_SILBER = ITEMS.register("fluessig_silber",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_CADMIUM = ITEMS.register("fluessig_cadmium",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_INDIUM = ITEMS.register("fluessig_indium",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_ZINN = ITEMS.register("fluessig_zinn",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_ANTIMON = ITEMS.register("fluessig_antimon",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_TELLUR = ITEMS.register("fluessig_tellur",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_IOD = ITEMS.register("fluessig_iod",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_XENON = ITEMS.register("fluessig_xenon",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_CAESIUM = ITEMS.register("fluessig_caesium",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_BARIUM = ITEMS.register("fluessig_barium",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_LANTHAN = ITEMS.register("fluessig_lanthan",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_CER = ITEMS.register("fluessig_cer",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_PROMETHIUM = ITEMS.register("fluessig_promethium",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_SAMARIUM = ITEMS.register("fluessig_samarium",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_EUROPIUM = ITEMS.register("fluessig_europium",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_GADOLINIUM = ITEMS.register("fluessig_gadolinium",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_TERBIUM = ITEMS.register("fluessig_terbium",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_DYSPROSIUM = ITEMS.register("fluessig_dysprosium",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_HOLMIUM = ITEMS.register("fluessig_holmium",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_THULIUM = ITEMS.register("fluessig_thulium",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_YTTERBIUM = ITEMS.register("fluessig_ytterbium",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_LUTETIUM = ITEMS.register("fluessig_lutetium",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_HAFNIUM = ITEMS.register("fluessig_hafnium",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_TANTAL = ITEMS.register("fluessig_tantal",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_WOLFRAM = ITEMS.register("fluessig_wolfram",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_RHENIUM = ITEMS.register("fluessig_rhenium",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_OSMIUM = ITEMS.register("fluessig_osmium",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_IRIDIUM = ITEMS.register("fluessig_iridium",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_PLATIN = ITEMS.register("fluessig_platin",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_GOLD = ITEMS.register("fluessig_gold",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_QUECKSILBER = ITEMS.register("fluessig_quecksilber",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_THALLIUM = ITEMS.register("fluessig_thallium",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_BLEI = ITEMS.register("fluessig_blei",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_BISMUT = ITEMS.register("fluessig_bismut",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_POLONIUM = ITEMS.register("fluessig_polonium",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_ASTAT = ITEMS.register("fluessig_astat",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_RADON = ITEMS.register("fluessig_radon",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_FRANCIUM = ITEMS.register("fluessig_francium",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_RADIUM = ITEMS.register("fluessig_radium",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_ACTINIUM = ITEMS.register("fluessig_actinium",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_THORIUM = ITEMS.register("fluessig_thorium",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_PROTACTINIUM = ITEMS.register("fluessig_protactinium",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_URAN = ITEMS.register("fluessig_uran",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_NEPTUNIUM = ITEMS.register("fluessig_neptunium",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_PLUTONIUM = ITEMS.register("fluessig_plutonium",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_AMERICIUM = ITEMS.register("fluessig_americium",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_CURIUM = ITEMS.register("fluessig_curium",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_BERKELIUM = ITEMS.register("fluessig_berkelium",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_CALIFORNIUM = ITEMS.register("fluessig_californium",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_EINSTEINIUM = ITEMS.register("fluessig_einsteinium",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_FERMIUM = ITEMS.register("fluessig_fermium",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_MENDELEVIUM = ITEMS.register("fluessig_mendelevium",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_NOBELIUM = ITEMS.register("fluessig_nobelium",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_LAWRENCIUM = ITEMS.register("fluessig_lawrencium",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_RUTHERFORDIUM = ITEMS.register("fluessig_rutherfordium",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_DUBNIUM = ITEMS.register("fluessig_dubnium",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_SEABORGIUM = ITEMS.register("fluessig_seaborgium",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_BOHRIUM = ITEMS.register("fluessig_bohrium",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_HASSIUM = ITEMS.register("fluessig_hassium",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_MEITNERIUM = ITEMS.register("fluessig_meitnerium",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_DARMSTADTIUM = ITEMS.register("fluessig_darmstadtium",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_ROENTGENIUM = ITEMS.register("fluessig_roentgenium",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_COPERNICIUM = ITEMS.register("fluessig_copernicium",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_NIHONIUM = ITEMS.register("fluessig_nihonium",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_FLEROVIUM = ITEMS.register("fluessig_flerovium",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_MOSCOVIUM = ITEMS.register("fluessig_moscovium",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_LIVERMORIUM = ITEMS.register("fluessig_livermorium",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_TENNESS = ITEMS.register("fluessig_tenness",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_OGANESSON = ITEMS.register("fluessig_oganesson",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> CARBON_INGOT = ITEMS.register("carbon_ingot",
            ()->new Item(new Item.Properties().group(IngotGroup.INGOTS)));

    public static final RegistryObject<Item> FLUESSIG_NEODYM = ITEMS.register("fluessig_neodym",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_PRASEODYM = ITEMS.register("fluessig_praseodym",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> FLUESSIG_ERBIUM = ITEMS.register("fluessig_erbium",
            ()->new Item(new Item.Properties().group(FluessigGroup.FLUESSIGKEITEN)));

    public static final RegistryObject<Item> TAC = ITEMS.register("tac",
            ()->new Item(new Item.Properties().group(RandomGroup.STUFF)));

    public static final RegistryObject<Item> HDD_DRIVE = ITEMS.register("hdd_drive",
            ()->new Item(new Item.Properties().group(RandomGroup.STUFF)));

    public static final RegistryObject<Item> SDD_DRIVE = ITEMS.register("sdd_drive",
            ()->new Item(new Item.Properties().group(RandomGroup.STUFF)));

    public static final RegistryObject<Item> HYDROXIDION = ITEMS.register("hydroxidion",
            ()->new Item(new Item.Properties().group(MoleGroup.MOLEKUEHLE)));

    public static final RegistryObject<Item> ETHANOL = ITEMS.register("ethanol",
            ()->new Item(new Item.Properties().group(MoleGroup.MOLEKUEHLE)));

    public static final RegistryObject<Item> CHROM_GAS = ITEMS.register("chrom_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> VANADIUM_GAS = ITEMS.register("vanadium_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> ARGON_GAS = ITEMS.register("argon_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> MANGAN_GAS = ITEMS.register("mangan_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> EISEN_GAS = ITEMS.register("eisen_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> KOBALT_GAS = ITEMS.register("kobalt_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> NICKEL_GAS = ITEMS.register("nickel_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> KUPFER_GAS = ITEMS.register("kupfer_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> ZINK_GAS = ITEMS.register("zink_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> GALLIUM_GAS = ITEMS.register("gallium_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> GERMANIUM_GAS = ITEMS.register("germanium_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> SCHWEFEL_GAS = ITEMS.register("schwefel_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> PHOSPHOR_GAS = ITEMS.register("phosphor_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> SILICIUM_GAS = ITEMS.register("silicium_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> ALUMINIUM_GAS = ITEMS.register("aluminium_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> MAGNESIUM_GAS = ITEMS.register("magnesium_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> NATRIUM_GAS = ITEMS.register("natrium_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> NEON_GAS = ITEMS.register("neon_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> FLUORINE_GAS = ITEMS.register("fluorine_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> SAUERSTOFF_GAS = ITEMS.register("sauerstoff_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> STICKSTOFF_GAS = ITEMS.register("stickstoff_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> LAWRENCIUM_GAS = ITEMS.register("lawrencium_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> NOBELIUM_GAS = ITEMS.register("nobelium_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> MENDELEVIUM_GAS = ITEMS.register("mendelevium_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> FERMIUM_GAS = ITEMS.register("fermium_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> EINSTEINIUM_GAS = ITEMS.register("einsteinium_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> CALIFORNIUM_GAS = ITEMS.register("californium_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> BERKELIUM_GAS = ITEMS.register("berkelium_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> CURIUM_GAS = ITEMS.register("curium_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> AMERICIUM_GAS = ITEMS.register("americium_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> PLUTONIUM_GAS = ITEMS.register("plutonium_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> NEPTUNIUM_GAS = ITEMS.register("neptunium_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> URAN_GAS = ITEMS.register("uran_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> PROTACTINIUM_GAS = ITEMS.register("protactinium_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> THORIUM_GAS = ITEMS.register("thorium_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> ACTINIUM_GAS = ITEMS.register("actinium_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> LUTETIUM_GAS = ITEMS.register("lutetium_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> YTTERBIUM_GAS = ITEMS.register("ytterbium_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> THULIUM_GAS = ITEMS.register("thulium_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> ERBIUM_GAS = ITEMS.register("erbium_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> DYSPROSIUM_GAS = ITEMS.register("dysprosium_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> TERBIUM_GAS = ITEMS.register("terbium_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> EUROPIUM_GAS = ITEMS.register("europium_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> SAMARIUM_GAS = ITEMS.register("samarium_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> PROMETHIUM_GAS = ITEMS.register("promethium_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> NEODYM_GAS = ITEMS.register("neodym_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> PRASEODYM_GAS = ITEMS.register("praseodym_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> CER_GAS = ITEMS.register("cer_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> LANTHAN_GAS = ITEMS.register("lanthan_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> OGANESSON_GAS = ITEMS.register("oganesson_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> TENNESS_GAS = ITEMS.register("tenness_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> LIVERMORIUM_GAS = ITEMS.register("livermorium_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> MOSCOVIUM_GAS = ITEMS.register("moscovium_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> FLEROVIUM_GAS = ITEMS.register("flerovium_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> NIHONIUM_GAS = ITEMS.register("nihonium_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> COPERNICIUM_GAS = ITEMS.register("copernicium_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> ROENTGENIUM_GAS = ITEMS.register("roentgenium_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> DARMSTADTIUM_GAS = ITEMS.register("darmstadtium_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> MEITNERIUM_GAS = ITEMS.register("meitnerium_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> HASSIUM_GAS = ITEMS.register("hassium_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> BOHRIUM_GAS = ITEMS.register("bohrium_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> SEABORGIUM_GAS = ITEMS.register("seaborgium_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> DUBNIUM_GAS = ITEMS.register("dubnium_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> RUTHERFORDIUM_GAS = ITEMS.register("rutherfordium_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> FRANCIUM_GAS = ITEMS.register("francium_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> RADIUM_GAS = ITEMS.register("radium_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> RADON_GAS = ITEMS.register("radon_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> ASTAT_GAS = ITEMS.register("astat_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> POLONIUM_GAS = ITEMS.register("polonium_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> BISMUT_GAS = ITEMS.register("bismut_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> BLEI_GAS = ITEMS.register("blei_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> THALLIUM_GAS = ITEMS.register("thallium_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> QUECKSILBER_GAS = ITEMS.register("quecksilber_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> GOLD_GAS = ITEMS.register("gold_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> PLATIN_GAS = ITEMS.register("platin_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> IRIDIUM_GAS = ITEMS.register("iridium_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> OSMIUM_GAS = ITEMS.register("osmium_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> RHENIUM_GAS = ITEMS.register("rhenium_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> WOLFRAM_GAS = ITEMS.register("wolfram_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> TANTAL_GAS = ITEMS.register("tantal_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> HAFNIUM_GAS = ITEMS.register("hafnium_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> BARIUM_GAS = ITEMS.register("barium_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> CAESIUM_GAS = ITEMS.register("caesium_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> XENON_GAS = ITEMS.register("xenon_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> IOD_GAS = ITEMS.register("iod_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> TELLUR_GAS = ITEMS.register("tellur_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> ANTIMON_GAS = ITEMS.register("antimon_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> ZINN_GAS = ITEMS.register("zinn_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> INDIUM_GAS = ITEMS.register("indium_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> CADMIUM_GAS = ITEMS.register("cadmium_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> SILBER_GAS = ITEMS.register("silber_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> PALLADIUM_GAS = ITEMS.register("palladium_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> RHODIUM_GAS = ITEMS.register("rhodium_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> RUTHENIUM_GAS = ITEMS.register("ruthenium_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> TECHNETIUM_GAS = ITEMS.register("technetium_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> MOLYBDAEN_GAS = ITEMS.register("molybdaen_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> NIOB_GAS = ITEMS.register("niob_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> ZIRCONIUM_GAS = ITEMS.register("zirconium_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> YTTRIUM_GAS = ITEMS.register("yttrium_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> STRONTIUM_GAS = ITEMS.register("strontium_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> RUBIDIUM_GAS = ITEMS.register("rubidium_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> BROM_GAS = ITEMS.register("brom_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> SELEN_GAS = ITEMS.register("selen_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> ARSEN_GAS = ITEMS.register("arsen_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> CHLOR_GAS = ITEMS.register("chlor_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> KRYPTON_GAS = ITEMS.register("krypton_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> KALIUM_GAS = ITEMS.register("kalium_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> CALCIUM_GAS = ITEMS.register("calcium_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> SCANDIUM_GAS = ITEMS.register("scandium_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> TITAN_GAS = ITEMS.register("titan_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> GADOLINIUM_GAS = ITEMS.register("gadolinium_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> HOLMIUM_GAS = ITEMS.register("holmium_gas",
            ()->new Item(new Item.Properties().group(GasGroup.GASE)));

    public static final RegistryObject<Item> KOHLENSTOFF_INGOT = ITEMS.register("kohlenstoff_ingot",
            ()->new Item(new Item.Properties().group(RandomGroup.STUFF)));

    public static final RegistryObject<Item> SIEDE_PULVER = ITEMS.register("siede_pulver",
            ()->new Item(new Item.Properties().group(RandomGroup.STUFF)));

    public static final RegistryObject<Item> SIEDELION_SAMEN = ITEMS.register("siedelion_samen",
            ()->new Item(new Item.Properties().group(RandomGroup.STUFF)));

    public static final RegistryObject<Item> NETHER_CARBON_INGOT = ITEMS.register("nether_carbon_ingot",
            ()->new Item(new Item.Properties().group(RandomGroup.STUFF)));









}
