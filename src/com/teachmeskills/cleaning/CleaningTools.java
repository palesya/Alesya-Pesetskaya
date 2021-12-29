package com.teachmeskills.cleaning;

//Инструмент уборки - класс, который мы по виду поверхности будет возвращать инструменты
public class CleaningTools {

    public String[] chooseCleaningTools(CleaningType cleaningType, SurfaceType surfaceType) {
        String[] cleaningTools;
        if (cleaningType==CleaningType.DRY && surfaceType==SurfaceType.TILE_FLOOR || surfaceType==SurfaceType.PARQUET || surfaceType==SurfaceType.LAMINATE) {
            cleaningTools = new String[]{"broom", "shovel"};
        } else if (cleaningType==CleaningType.DRY && surfaceType==SurfaceType.ENAMEL || surfaceType==SurfaceType.TILE_WALL || surfaceType==SurfaceType.TABLETOP || surfaceType==SurfaceType.PAINTED_WALL || surfaceType==SurfaceType.GLASS_MIRROR) {
            cleaningTools = new String[]{"dust broom"};
        } else if (cleaningType==CleaningType.DRY && surfaceType==SurfaceType.CARPET) {
            cleaningTools = new String[]{"vacuum cleaner"};
        } else if (cleaningType==CleaningType.WET || cleaningType==CleaningType.CLEAR_OUT && surfaceType==SurfaceType.TILE_FLOOR || surfaceType==SurfaceType.PARQUET || surfaceType==SurfaceType.LAMINATE) {
            cleaningTools = new String[]{"mop and bucket of water", "floor cleaner"};
        } else if (cleaningType==CleaningType.WET || cleaningType==CleaningType.CLEAR_OUT && surfaceType==SurfaceType.ENAMEL) {
            cleaningTools = new String[]{"water", "rag", "enamel cleaner"};
        } else if (cleaningType==CleaningType.WET && surfaceType==SurfaceType.TILE_WALL || surfaceType==SurfaceType.TABLETOP || surfaceType==SurfaceType.PAINTED_WALL) {
            cleaningTools = new String[]{"water", "rag"};
        } else if (cleaningType==CleaningType.CLEAR_OUT && surfaceType==SurfaceType.TILE_WALL || surfaceType==SurfaceType.TABLETOP || surfaceType==SurfaceType.PAINTED_WALL) {
            cleaningTools = new String[]{"water", "rag", "washing liquid"};
        } else if (cleaningType==CleaningType.WET && surfaceType==SurfaceType.GLASS_MIRROR) {
            cleaningTools = new String[]{"water", "rag", "glass cleaner"};
        } else if (cleaningType==CleaningType.CLEAR_OUT && surfaceType==SurfaceType.GLASS_MIRROR) {
            cleaningTools = new String[]{"water", "rag", "glass cleaner", "wiper"};
        } else if (cleaningType==CleaningType.WET && surfaceType==SurfaceType.CARPET) {
            cleaningTools = new String[]{"water", "carpet brush", "carpet shampoo", "rag"};
        } else if (cleaningType==CleaningType.CLEAR_OUT && surfaceType==SurfaceType.CARPET) {
            cleaningTools = new String[]{"carpet dry cleaning machine", "carpet cleaner", "water"};
        }else {
            cleaningTools = new String[]{"no tools"};
            System.out.println("No tools added for such case. Check CleaningTools");
        }
        return cleaningTools;
    }

}
