package com.teachmeskills.cleaning;

import java.util.ArrayList;
import java.util.List;

//Инструмент уборки - класс, который мы по виду поверхности будет возвращать инструменты
public class CleaningTools {

    public static List<String> chooseCleaningTools(CleaningType cleaningType, SurfaceType surfaceType) {
        List<String> cleaningTools = new ArrayList<>();
        switch (cleaningType) {
            case DRY:
                switch (surfaceType) {
                    case TILE_FLOOR:
                    case PARQUET:
                    case LAMINATE:
                        cleaningTools.add("shovel");
                        cleaningTools.add("broom");
                        break;
                    case ENAMEL:
                    case TILE_WALL:
                    case TABLETOP:
                    case PAINTED_WALL:
                    case GLASS_MIRROR:
                        cleaningTools.add("dust broom");
                        break;
                    case CARPET:
                        cleaningTools.add("vacuum cleaner");
                        break;
                }
            case WET:
                switch (surfaceType) {
                    case CARPET:
                        cleaningTools.add("water");
                        cleaningTools.add("carpet brush");
                        cleaningTools.add("carpet shampoo");
                        cleaningTools.add("rag");
                        break;
                    case GLASS_MIRROR:
                        cleaningTools.add("water");
                        cleaningTools.add("rag");
                        cleaningTools.add("glass cleaner");
                        break;
                    case TILE_WALL:
                    case TABLETOP:
                    case PAINTED_WALL:
                        cleaningTools.add("water");
                        cleaningTools.add("rag");
                        break;
                    case TILE_FLOOR:
                    case PARQUET:
                    case LAMINATE:
                        cleaningTools.add("mop and bucket of water");
                        cleaningTools.add("floor cleaner");
                        break;
                    case ENAMEL:
                        cleaningTools.add("water");
                        cleaningTools.add("rag");
                        cleaningTools.add("enamel cleaner");
                        break;
                }
            case CLEAR_OUT:
                switch (surfaceType) {
                    case TILE_FLOOR:
                    case PARQUET:
                    case LAMINATE:
                        cleaningTools.add("mop and bucket of water");
                        cleaningTools.add("floor cleaner");
                        break;
                    case ENAMEL:
                        cleaningTools.add("water");
                        cleaningTools.add("rag");
                        cleaningTools.add("enamel cleaner");
                        break;
                    case TILE_WALL:
                    case TABLETOP:
                    case PAINTED_WALL:
                        cleaningTools.add("water");
                        cleaningTools.add("rag");
                        cleaningTools.add("washing liquid");
                        break;
                    case GLASS_MIRROR:
                        cleaningTools.add("water");
                        cleaningTools.add("rag");
                        cleaningTools.add("glass cleaner");
                        cleaningTools.add("wiper");
                        break;
                    case CARPET:
                        cleaningTools.add("carpet dry cleaning machine");
                        cleaningTools.add("carpet cleaner");
                        cleaningTools.add("water");
                        break;
                }
        }
        return cleaningTools;
    }

}

