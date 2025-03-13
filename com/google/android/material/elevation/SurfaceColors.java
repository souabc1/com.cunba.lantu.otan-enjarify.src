package com.google.android.material.elevation;

import android.content.Context;
import android.content.res.Resources;
import com.google.android.material.R.attr;
import com.google.android.material.R.dimen;
import com.google.android.material.color.MaterialColors;
import m54207b69;

public enum SurfaceColors
{
  private final int elevationResId;
  
  static
  {
    SurfaceColors localSurfaceColors1 = new com/google/android/material/elevation/SurfaceColors;
    int i = R.dimen.m3_sys_elevation_level0;
    Object localObject1 = m54207b69.F54207b69_11("Sa3235352A24272A4559");
    localSurfaceColors1.<init>((String)localObject1, 0, i);
    SURFACE_0 = localSurfaceColors1;
    SurfaceColors localSurfaceColors2 = new com/google/android/material/elevation/SurfaceColors;
    int j = R.dimen.m3_sys_elevation_level1;
    Object localObject2 = m54207b69.F54207b69_11("3&757476636B6A69801F");
    localSurfaceColors2.<init>((String)localObject2, 1, j);
    SURFACE_1 = localSurfaceColors2;
    SurfaceColors localSurfaceColors3 = new com/google/android/material/elevation/SurfaceColors;
    int k = R.dimen.m3_sys_elevation_level2;
    Object localObject3 = m54207b69.F54207b69_11("'_0C0B0F1C2221200775");
    localSurfaceColors3.<init>((String)localObject3, 2, k);
    SURFACE_2 = localSurfaceColors3;
    localObject1 = new com/google/android/material/elevation/SurfaceColors;
    int m = R.dimen.m3_sys_elevation_level3;
    String str1 = m54207b69.F54207b69_11(",26168627777767D7409");
    ((SurfaceColors)localObject1).<init>(str1, 3, m);
    SURFACE_3 = (SurfaceColors)localObject1;
    localObject2 = new com/google/android/material/elevation/SurfaceColors;
    int n = R.dimen.m3_sys_elevation_level4;
    String str2 = m54207b69.F54207b69_11("3]0E09111E20231E0971");
    ((SurfaceColors)localObject2).<init>(str2, 4, n);
    SURFACE_4 = (SurfaceColors)localObject2;
    localObject3 = new com/google/android/material/elevation/SurfaceColors;
    int i1 = R.dimen.m3_sys_elevation_level5;
    String str3 = m54207b69.F54207b69_11(".k383F3B302E2D343B66");
    ((SurfaceColors)localObject3).<init>(str3, 5, i1);
    SURFACE_5 = (SurfaceColors)localObject3;
    SurfaceColors[] tmp184_181 = new SurfaceColors[6];
    SurfaceColors[] tmp185_184 = tmp184_181;
    SurfaceColors[] tmp185_184 = tmp184_181;
    tmp185_184[0] = localSurfaceColors1;
    tmp185_184[1] = localSurfaceColors2;
    SurfaceColors[] tmp192_185 = tmp185_184;
    SurfaceColors[] tmp192_185 = tmp185_184;
    tmp192_185[2] = localSurfaceColors3;
    tmp192_185[3] = localObject1;
    tmp192_185[4] = localObject2;
    SurfaceColors[] tmp204_192 = tmp192_185;
    tmp204_192[5] = localObject3;
  }
  
  private SurfaceColors(int paramInt)
  {
    this.elevationResId = paramInt;
  }
  
  public static int getColorForElevation(Context paramContext, float paramFloat)
  {
    ElevationOverlayProvider localElevationOverlayProvider = new com/google/android/material/elevation/ElevationOverlayProvider;
    localElevationOverlayProvider.<init>(paramContext);
    int i = R.attr.colorSurface;
    int j = MaterialColors.getColor(paramContext, i, 0);
    return localElevationOverlayProvider.compositeOverlay(j, paramFloat);
  }
  
  public int getColor(Context paramContext)
  {
    Resources localResources = paramContext.getResources();
    int i = this.elevationResId;
    float f = localResources.getDimension(i);
    return getColorForElevation(paramContext, f);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.elevation.SurfaceColors
 * JD-Core Version:    0.7.0.1
 */