package com.teachmeskills.cleaning;

//Инструмент уборки - класс, который мы по виду поверхности будет возвращать инструменты
public class CleaningTools {

    public static String[] chooseCleaningTools(CleaningType cleaningType, SurfaceType surfaceType) {

        switch (cleaningType) {
            case DRY:
                switch (surfaceType) {
                    case TILE_FLOOR:
                    case PARQUET:
                    case LAMINATE:
                        return new String[]{"broom", "shovel"};
                    case ENAMEL:
                    case TILE_WALL:
                    case TABLETOP:
                    case PAINTED_WALL:
                    case GLASS_MIRROR:
                        return new String[]{"dust broom"};
                    case CARPET:
                        return new String[]{"vacuum cleaner"};
                }
            case WET:
                switch (surfaceType) {
                    case CARPET:
                        return new String[]{"water", "carpet brush", "carpet shampoo", "rag"};
                    case GLASS_MIRROR:
                        return new String[]{"water", "rag", "glass cleaner"};
                    case TILE_WALL:
                    case TABLETOP:
                    case PAINTED_WALL:
                        return new String[]{"water", "rag", "enamel cleaner"};
                    case TILE_FLOOR:
                    case PARQUET:
                    case LAMINATE:
                        return new String[]{"mop and bucket of water", "floor cleaner"};
                    case ENAMEL:
                        return new String[]{"water", "rag", "enamel cleaner"};
                }
            case CLEAR_OUT:
                switch (surfaceType) {
                    case TILE_FLOOR:
                    case PARQUET:
                    case LAMINATE:
                        return new String[]{"mop and bucket of water", "floor cleaner"};
                    case ENAMEL:
                        return new String[]{"water", "rag", "enamel cleaner"};
                    case TILE_WALL:
                    case TABLETOP:
                    case PAINTED_WALL:
                        return new String[]{"water", "rag", "washing liquid"};
                    case GLASS_MIRROR:
                        return new String[]{"water", "rag", "glass cleaner", "wiper"};
                    case CARPET:
                        return new String[]{"carpet dry cleaning machine", "carpet cleaner", "water"};
                }
        }

        return new String[0];
    }
}

