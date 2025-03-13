package com.google.android.material.color.utilities;

import java.util.function.Function;

public final class MaterialDynamicColors
{
  private static final double CONTAINER_ACCENT_TONE_DELTA = 15.0D;
  public static final DynamicColor background;
  public static final DynamicColor controlActivated;
  public static final DynamicColor controlHighlight;
  public static final DynamicColor controlNormal;
  public static final DynamicColor error;
  public static final DynamicColor errorContainer;
  public static final DynamicColor onBackground;
  public static final DynamicColor onError;
  public static final DynamicColor onErrorContainer;
  public static final DynamicColor onPrimary;
  public static final DynamicColor onPrimaryContainer;
  public static final DynamicColor onPrimaryFixed;
  public static final DynamicColor onPrimaryFixedVariant;
  public static final DynamicColor onSecondary;
  public static final DynamicColor onSecondaryContainer;
  public static final DynamicColor onSecondaryFixed;
  public static final DynamicColor onSecondaryFixedVariant;
  public static final DynamicColor onSurface;
  public static final DynamicColor onSurfaceInverse;
  public static final DynamicColor onSurfaceVariant;
  public static final DynamicColor onTertiary;
  public static final DynamicColor onTertiaryContainer;
  public static final DynamicColor onTertiaryFixed;
  public static final DynamicColor onTertiaryFixedVariant;
  public static final DynamicColor outline;
  public static final DynamicColor outlineVariant;
  public static final DynamicColor primary;
  public static final DynamicColor primaryContainer;
  public static final DynamicColor primaryFixed;
  public static final DynamicColor primaryFixedDarker;
  public static final DynamicColor primaryInverse;
  public static final DynamicColor secondary;
  public static final DynamicColor secondaryContainer;
  public static final DynamicColor secondaryFixed;
  public static final DynamicColor secondaryFixedDarker;
  public static final DynamicColor surface;
  public static final DynamicColor surfaceAdd1;
  public static final DynamicColor surfaceAdd2;
  public static final DynamicColor surfaceBright;
  public static final DynamicColor surfaceContainer;
  public static final DynamicColor surfaceDim;
  public static final DynamicColor surfaceInverse;
  public static final DynamicColor surfaceSub1;
  public static final DynamicColor surfaceSub2;
  public static final DynamicColor surfaceVariant;
  public static final DynamicColor tertiary;
  public static final DynamicColor tertiaryContainer;
  public static final DynamicColor tertiaryFixed;
  public static final DynamicColor tertiaryFixedDarker;
  public static final DynamicColor textHintInverse;
  public static final DynamicColor textPrimaryInverse;
  public static final DynamicColor textPrimaryInverseDisableOnly;
  public static final DynamicColor textSecondaryAndTertiaryInverse;
  public static final DynamicColor textSecondaryAndTertiaryInverseDisabled;
  
  static
  {
    Object localObject1 = new com/google/android/material/color/utilities/o0oOOo;
    ((o0oOOo)localObject1).<init>();
    Object localObject2 = new com/google/android/material/color/utilities/o0OO00OO;
    ((o0OO00OO)localObject2).<init>();
    background = DynamicColor.fromPalette((Function)localObject1, (Function)localObject2);
    localObject1 = new com/google/android/material/color/utilities/o0OOOO00;
    ((o0OOOO00)localObject1).<init>();
    localObject2 = new com/google/android/material/color/utilities/oO0000o0;
    ((oO0000o0)localObject2).<init>();
    Object localObject3 = new com/google/android/material/color/utilities/oO000Oo;
    ((oO000Oo)localObject3).<init>();
    onBackground = DynamicColor.fromPalette((Function)localObject1, (Function)localObject2, (Function)localObject3);
    localObject1 = new com/google/android/material/color/utilities/o000000;
    ((o000000)localObject1).<init>();
    localObject2 = new com/google/android/material/color/utilities/o000OO;
    ((o000OO)localObject2).<init>();
    surface = DynamicColor.fromPalette((Function)localObject1, (Function)localObject2);
    localObject1 = new com/google/android/material/color/utilities/o000O;
    ((o000O)localObject1).<init>();
    localObject2 = new com/google/android/material/color/utilities/o00O00OO;
    ((o00O00OO)localObject2).<init>();
    surfaceInverse = DynamicColor.fromPalette((Function)localObject1, (Function)localObject2);
    localObject1 = new com/google/android/material/color/utilities/o00O;
    ((o00O)localObject1).<init>();
    localObject2 = new com/google/android/material/color/utilities/o00O00O;
    ((o00O00O)localObject2).<init>();
    surfaceBright = DynamicColor.fromPalette((Function)localObject1, (Function)localObject2);
    localObject1 = new com/google/android/material/color/utilities/o00OOOO0;
    ((o00OOOO0)localObject1).<init>();
    localObject2 = new com/google/android/material/color/utilities/o0O000O;
    ((o0O000O)localObject2).<init>();
    surfaceDim = DynamicColor.fromPalette((Function)localObject1, (Function)localObject2);
    localObject1 = new com/google/android/material/color/utilities/o0O00oO0;
    ((o0O00oO0)localObject1).<init>();
    localObject2 = new com/google/android/material/color/utilities/o0O0o0;
    ((o0O0o0)localObject2).<init>();
    surfaceSub2 = DynamicColor.fromPalette((Function)localObject1, (Function)localObject2);
    localObject1 = new com/google/android/material/color/utilities/o0O0oo00;
    ((o0O0oo00)localObject1).<init>();
    localObject2 = new com/google/android/material/color/utilities/o0OO000;
    ((o0OO000)localObject2).<init>();
    surfaceSub1 = DynamicColor.fromPalette((Function)localObject1, (Function)localObject2);
    localObject1 = new com/google/android/material/color/utilities/o0OO000o;
    ((o0OO000o)localObject1).<init>();
    localObject2 = new com/google/android/material/color/utilities/oo0oO0;
    ((oo0oO0)localObject2).<init>();
    surfaceContainer = DynamicColor.fromPalette((Function)localObject1, (Function)localObject2);
    localObject1 = new com/google/android/material/color/utilities/oo0ooO;
    ((oo0ooO)localObject1).<init>();
    localObject2 = new com/google/android/material/color/utilities/o0OO00o0;
    ((o0OO00o0)localObject2).<init>();
    surfaceAdd1 = DynamicColor.fromPalette((Function)localObject1, (Function)localObject2);
    localObject1 = new com/google/android/material/color/utilities/o0OO0;
    ((o0OO0)localObject1).<init>();
    localObject2 = new com/google/android/material/color/utilities/o0OO0O0;
    ((o0OO0O0)localObject2).<init>();
    surfaceAdd2 = DynamicColor.fromPalette((Function)localObject1, (Function)localObject2);
    localObject1 = new com/google/android/material/color/utilities/o0OOooO0;
    ((o0OOooO0)localObject1).<init>();
    localObject2 = new com/google/android/material/color/utilities/o0OO0o00;
    ((o0OO0o00)localObject2).<init>();
    localObject3 = new com/google/android/material/color/utilities/o0OO0oO0;
    ((o0OO0oO0)localObject3).<init>();
    onSurface = DynamicColor.fromPalette((Function)localObject1, (Function)localObject2, (Function)localObject3);
    localObject1 = new com/google/android/material/color/utilities/o0OO;
    ((o0OO)localObject1).<init>();
    localObject2 = new com/google/android/material/color/utilities/o0OOO00;
    ((o0OOO00)localObject2).<init>();
    localObject3 = new com/google/android/material/color/utilities/o0OOO0;
    ((o0OOO0)localObject3).<init>();
    onSurfaceInverse = DynamicColor.fromPalette((Function)localObject1, (Function)localObject2, (Function)localObject3);
    localObject1 = new com/google/android/material/color/utilities/o0OOO0OO;
    ((o0OOO0OO)localObject1).<init>();
    localObject2 = new com/google/android/material/color/utilities/o0OOOO0o;
    ((o0OOOO0o)localObject2).<init>();
    surfaceVariant = DynamicColor.fromPalette((Function)localObject1, (Function)localObject2);
    localObject1 = new com/google/android/material/color/utilities/o0OOo000;
    ((o0OOo000)localObject1).<init>();
    localObject2 = new com/google/android/material/color/utilities/o0o0000;
    ((o0o0000)localObject2).<init>();
    localObject3 = new com/google/android/material/color/utilities/oO0Oo;
    ((oO0Oo)localObject3).<init>();
    onSurfaceVariant = DynamicColor.fromPalette((Function)localObject1, (Function)localObject2, (Function)localObject3);
    localObject1 = new com/google/android/material/color/utilities/ooo0Oo0;
    ((ooo0Oo0)localObject1).<init>();
    localObject2 = new com/google/android/material/color/utilities/o;
    ((o)localObject2).<init>();
    localObject3 = new com/google/android/material/color/utilities/oO00000;
    ((oO00000)localObject3).<init>();
    outline = DynamicColor.fromPalette((Function)localObject1, (Function)localObject2, (Function)localObject3);
    localObject1 = new com/google/android/material/color/utilities/oO00000o;
    ((oO00000o)localObject1).<init>();
    localObject2 = new com/google/android/material/color/utilities/oO0000O;
    ((oO0000O)localObject2).<init>();
    localObject3 = new com/google/android/material/color/utilities/oO0000Oo;
    ((oO0000Oo)localObject3).<init>();
    outlineVariant = DynamicColor.fromPalette((Function)localObject1, (Function)localObject2, (Function)localObject3);
    localObject1 = new com/google/android/material/color/utilities/oO000;
    ((oO000)localObject1).<init>();
    localObject2 = new com/google/android/material/color/utilities/oO000O0;
    ((oO000O0)localObject2).<init>();
    localObject3 = new com/google/android/material/color/utilities/oO000O0O;
    ((oO000O0O)localObject3).<init>();
    primaryContainer = DynamicColor.fromPalette((Function)localObject1, (Function)localObject2, (Function)localObject3);
    localObject1 = new com/google/android/material/color/utilities/oO0o0o;
    ((oO0o0o)localObject1).<init>();
    localObject2 = new com/google/android/material/color/utilities/oO0OoOO0;
    ((oO0OoOO0)localObject2).<init>();
    localObject3 = new com/google/android/material/color/utilities/oO0Oo0oo;
    ((oO0Oo0oo)localObject3).<init>();
    onPrimaryContainer = DynamicColor.fromPalette((Function)localObject1, (Function)localObject2, (Function)localObject3, null);
    localObject1 = new com/google/android/material/color/utilities/oO000OOo;
    ((oO000OOo)localObject1).<init>();
    localObject2 = new com/google/android/material/color/utilities/ooOOOOoo;
    ((ooOOOOoo)localObject2).<init>();
    localObject3 = new com/google/android/material/color/utilities/oO0OOo0o;
    ((oO0OOo0o)localObject3).<init>();
    Object localObject4 = new com/google/android/material/color/utilities/oO000Oo0;
    ((oO000Oo0)localObject4).<init>();
    primary = DynamicColor.fromPalette((Function)localObject1, (Function)localObject2, (Function)localObject3, (Function)localObject4);
    localObject1 = new com/google/android/material/color/utilities/oO000o00;
    ((oO000o00)localObject1).<init>();
    localObject2 = new com/google/android/material/color/utilities/oO0O0OoO;
    ((oO0O0OoO)localObject2).<init>();
    localObject3 = new com/google/android/material/color/utilities/o00oO0o;
    ((o00oO0o)localObject3).<init>();
    primaryInverse = DynamicColor.fromPalette((Function)localObject1, (Function)localObject2, (Function)localObject3);
    localObject1 = new com/google/android/material/color/utilities/o0ooOOo;
    ((o0ooOOo)localObject1).<init>();
    localObject2 = new com/google/android/material/color/utilities/o0OOO0o;
    ((o0OOO0o)localObject2).<init>();
    localObject3 = new com/google/android/material/color/utilities/o0Oo0oo;
    ((o0Oo0oo)localObject3).<init>();
    onPrimary = DynamicColor.fromPalette((Function)localObject1, (Function)localObject2, (Function)localObject3);
    localObject1 = new com/google/android/material/color/utilities/o0OO00O;
    ((o0OO00O)localObject1).<init>();
    localObject2 = new com/google/android/material/color/utilities/oo0o0Oo;
    ((oo0o0Oo)localObject2).<init>();
    localObject3 = new com/google/android/material/color/utilities/o0O0O00;
    ((o0O0O00)localObject3).<init>();
    secondaryContainer = DynamicColor.fromPalette((Function)localObject1, (Function)localObject2, (Function)localObject3);
    localObject1 = new com/google/android/material/color/utilities/o000OOo;
    ((o000OOo)localObject1).<init>();
    localObject2 = new com/google/android/material/color/utilities/o000000O;
    ((o000000O)localObject2).<init>();
    localObject3 = new com/google/android/material/color/utilities/o00000O0;
    ((o00000O0)localObject3).<init>();
    onSecondaryContainer = DynamicColor.fromPalette((Function)localObject1, (Function)localObject2, (Function)localObject3);
    localObject1 = new com/google/android/material/color/utilities/o00000O;
    ((o00000O)localObject1).<init>();
    localObject2 = new com/google/android/material/color/utilities/o00000OO;
    ((o00000OO)localObject2).<init>();
    localObject3 = new com/google/android/material/color/utilities/o0000Ooo;
    ((o0000Ooo)localObject3).<init>();
    localObject4 = new com/google/android/material/color/utilities/o0000;
    ((o0000)localObject4).<init>();
    secondary = DynamicColor.fromPalette((Function)localObject1, (Function)localObject2, (Function)localObject3, (Function)localObject4);
    localObject1 = new com/google/android/material/color/utilities/o0000O00;
    ((o0000O00)localObject1).<init>();
    localObject2 = new com/google/android/material/color/utilities/o0000oo;
    ((o0000oo)localObject2).<init>();
    localObject3 = new com/google/android/material/color/utilities/o0000O0;
    ((o0000O0)localObject3).<init>();
    onSecondary = DynamicColor.fromPalette((Function)localObject1, (Function)localObject2, (Function)localObject3);
    localObject1 = new com/google/android/material/color/utilities/o0000O0O;
    ((o0000O0O)localObject1).<init>();
    localObject2 = new com/google/android/material/color/utilities/o0000OO0;
    ((o0000OO0)localObject2).<init>();
    localObject3 = new com/google/android/material/color/utilities/o000;
    ((o000)localObject3).<init>();
    tertiaryContainer = DynamicColor.fromPalette((Function)localObject1, (Function)localObject2, (Function)localObject3);
    localObject1 = new com/google/android/material/color/utilities/o000O000;
    ((o000O000)localObject1).<init>();
    localObject2 = new com/google/android/material/color/utilities/o000O0o;
    ((o000O0o)localObject2).<init>();
    localObject3 = new com/google/android/material/color/utilities/o000Oo0;
    ((o000Oo0)localObject3).<init>();
    onTertiaryContainer = DynamicColor.fromPalette((Function)localObject1, (Function)localObject2, (Function)localObject3);
    localObject1 = new com/google/android/material/color/utilities/o000O00;
    ((o000O00)localObject1).<init>();
    localObject2 = new com/google/android/material/color/utilities/o000O00O;
    ((o000O00O)localObject2).<init>();
    localObject3 = new com/google/android/material/color/utilities/o000O0;
    ((o000O0)localObject3).<init>();
    localObject4 = new com/google/android/material/color/utilities/o000O0Oo;
    ((o000O0Oo)localObject4).<init>();
    tertiary = DynamicColor.fromPalette((Function)localObject1, (Function)localObject2, (Function)localObject3, (Function)localObject4);
    localObject1 = new com/google/android/material/color/utilities/o000OO0O;
    ((o000OO0O)localObject1).<init>();
    localObject2 = new com/google/android/material/color/utilities/o000OO00;
    ((o000OO00)localObject2).<init>();
    localObject3 = new com/google/android/material/color/utilities/o000OOo0;
    ((o000OOo0)localObject3).<init>();
    onTertiary = DynamicColor.fromPalette((Function)localObject1, (Function)localObject2, (Function)localObject3);
    localObject1 = new com/google/android/material/color/utilities/o00;
    ((o00)localObject1).<init>();
    localObject2 = new com/google/android/material/color/utilities/o00O0000;
    ((o00O0000)localObject2).<init>();
    localObject3 = new com/google/android/material/color/utilities/o0O0ooO;
    ((o0O0ooO)localObject3).<init>();
    errorContainer = DynamicColor.fromPalette((Function)localObject1, (Function)localObject2, (Function)localObject3);
    localObject1 = new com/google/android/material/color/utilities/o00oOoo;
    ((o00oOoo)localObject1).<init>();
    localObject2 = new com/google/android/material/color/utilities/o00O000;
    ((o00O000)localObject2).<init>();
    localObject3 = new com/google/android/material/color/utilities/o00O000o;
    ((o00O000o)localObject3).<init>();
    onErrorContainer = DynamicColor.fromPalette((Function)localObject1, (Function)localObject2, (Function)localObject3);
    localObject1 = new com/google/android/material/color/utilities/o00O00;
    ((o00O00)localObject1).<init>();
    localObject2 = new com/google/android/material/color/utilities/oOO00O;
    ((oOO00O)localObject2).<init>();
    localObject3 = new com/google/android/material/color/utilities/o00O00o0;
    ((o00O00o0)localObject3).<init>();
    localObject4 = new com/google/android/material/color/utilities/oo00o;
    ((oo00o)localObject4).<init>();
    error = DynamicColor.fromPalette((Function)localObject1, (Function)localObject2, (Function)localObject3, (Function)localObject4);
    localObject1 = new com/google/android/material/color/utilities/o00O0;
    ((o00O0)localObject1).<init>();
    localObject2 = new com/google/android/material/color/utilities/o00O0O00;
    ((o00O0O00)localObject2).<init>();
    localObject3 = new com/google/android/material/color/utilities/o00O0O0;
    ((o00O0O0)localObject3).<init>();
    onError = DynamicColor.fromPalette((Function)localObject1, (Function)localObject2, (Function)localObject3);
    localObject1 = new com/google/android/material/color/utilities/o00O0O0O;
    ((o00O0O0O)localObject1).<init>();
    localObject2 = new com/google/android/material/color/utilities/o00O0OO0;
    ((o00O0OO0)localObject2).<init>();
    localObject3 = new com/google/android/material/color/utilities/oo0o0O0;
    ((oo0o0O0)localObject3).<init>();
    primaryFixed = DynamicColor.fromPalette((Function)localObject1, (Function)localObject2, (Function)localObject3);
    localObject1 = new com/google/android/material/color/utilities/o00O0OOO;
    ((o00O0OOO)localObject1).<init>();
    localObject2 = new com/google/android/material/color/utilities/oo0oOO0;
    ((oo0oOO0)localObject2).<init>();
    localObject3 = new com/google/android/material/color/utilities/o0OoO00O;
    ((o0OoO00O)localObject3).<init>();
    primaryFixedDarker = DynamicColor.fromPalette((Function)localObject1, (Function)localObject2, (Function)localObject3);
    localObject1 = new com/google/android/material/color/utilities/o0O0O0Oo;
    ((o0O0O0Oo)localObject1).<init>();
    localObject2 = new com/google/android/material/color/utilities/o0O;
    ((o0O)localObject2).<init>();
    localObject3 = new com/google/android/material/color/utilities/o0OO0o;
    ((o0OO0o)localObject3).<init>();
    onPrimaryFixed = DynamicColor.fromPalette((Function)localObject1, (Function)localObject2, (Function)localObject3);
    localObject1 = new com/google/android/material/color/utilities/o0oo0000;
    ((o0oo0000)localObject1).<init>();
    localObject2 = new com/google/android/material/color/utilities/oO0Ooooo;
    ((oO0Ooooo)localObject2).<init>();
    localObject3 = new com/google/android/material/color/utilities/oO00O0o0;
    ((oO00O0o0)localObject3).<init>();
    onPrimaryFixedVariant = DynamicColor.fromPalette((Function)localObject1, (Function)localObject2, (Function)localObject3);
    localObject1 = new com/google/android/material/color/utilities/o00000;
    ((o00000)localObject1).<init>();
    localObject2 = new com/google/android/material/color/utilities/o0000O;
    ((o0000O)localObject2).<init>();
    localObject3 = new com/google/android/material/color/utilities/o000O0O0;
    ((o000O0O0)localObject3).<init>();
    secondaryFixed = DynamicColor.fromPalette((Function)localObject1, (Function)localObject2, (Function)localObject3);
    localObject1 = new com/google/android/material/color/utilities/o00O0OO;
    ((o00O0OO)localObject1).<init>();
    localObject2 = new com/google/android/material/color/utilities/o00OO000;
    ((o00OO000)localObject2).<init>();
    localObject3 = new com/google/android/material/color/utilities/o00OO00O;
    ((o00OO00O)localObject3).<init>();
    secondaryFixedDarker = DynamicColor.fromPalette((Function)localObject1, (Function)localObject2, (Function)localObject3);
    localObject1 = new com/google/android/material/color/utilities/o00OO0O0;
    ((o00OO0O0)localObject1).<init>();
    localObject2 = new com/google/android/material/color/utilities/o00OO0OO;
    ((o00OO0OO)localObject2).<init>();
    localObject3 = new com/google/android/material/color/utilities/oo0O;
    ((oo0O)localObject3).<init>();
    onSecondaryFixed = DynamicColor.fromPalette((Function)localObject1, (Function)localObject2, (Function)localObject3);
    localObject1 = new com/google/android/material/color/utilities/o00OOO00;
    ((o00OOO00)localObject1).<init>();
    localObject2 = new com/google/android/material/color/utilities/o00OOO0;
    ((o00OOO0)localObject2).<init>();
    localObject3 = new com/google/android/material/color/utilities/o00OOO0O;
    ((o00OOO0O)localObject3).<init>();
    onSecondaryFixedVariant = DynamicColor.fromPalette((Function)localObject1, (Function)localObject2, (Function)localObject3);
    localObject1 = new com/google/android/material/color/utilities/o0o0Oo;
    ((o0o0Oo)localObject1).<init>();
    localObject2 = new com/google/android/material/color/utilities/o00OOOOo;
    ((o00OOOOo)localObject2).<init>();
    localObject3 = new com/google/android/material/color/utilities/o00Oo00;
    ((o00Oo00)localObject3).<init>();
    tertiaryFixed = DynamicColor.fromPalette((Function)localObject1, (Function)localObject2, (Function)localObject3);
    localObject1 = new com/google/android/material/color/utilities/o0oOO;
    ((o0oOO)localObject1).<init>();
    localObject2 = new com/google/android/material/color/utilities/o0O00o0;
    ((o0O00o0)localObject2).<init>();
    localObject3 = new com/google/android/material/color/utilities/oo00oO;
    ((oo00oO)localObject3).<init>();
    tertiaryFixedDarker = DynamicColor.fromPalette((Function)localObject1, (Function)localObject2, (Function)localObject3);
    localObject1 = new com/google/android/material/color/utilities/o0O0o;
    ((o0O0o)localObject1).<init>();
    localObject2 = new com/google/android/material/color/utilities/o0;
    ((o0)localObject2).<init>();
    localObject3 = new com/google/android/material/color/utilities/o0O00000;
    ((o0O00000)localObject3).<init>();
    onTertiaryFixed = DynamicColor.fromPalette((Function)localObject1, (Function)localObject2, (Function)localObject3);
    localObject1 = new com/google/android/material/color/utilities/o0O0000O;
    ((o0O0000O)localObject1).<init>();
    localObject2 = new com/google/android/material/color/utilities/o0O000;
    ((o0O000)localObject2).<init>();
    localObject3 = new com/google/android/material/color/utilities/o0OoOoOo;
    ((o0OoOoOo)localObject3).<init>();
    onTertiaryFixedVariant = DynamicColor.fromPalette((Function)localObject1, (Function)localObject2, (Function)localObject3);
    localObject1 = new com/google/android/material/color/utilities/o0O000Oo;
    ((o0O000Oo)localObject1).<init>();
    localObject2 = new com/google/android/material/color/utilities/o0O000o0;
    ((o0O000o0)localObject2).<init>();
    controlActivated = DynamicColor.fromPalette((Function)localObject1, (Function)localObject2, null);
    localObject1 = new com/google/android/material/color/utilities/o0O00;
    ((o0O00)localObject1).<init>();
    localObject2 = new com/google/android/material/color/utilities/o0O00O0o;
    ((o0O00O0o)localObject2).<init>();
    controlNormal = DynamicColor.fromPalette((Function)localObject1, (Function)localObject2);
    localObject1 = new com/google/android/material/color/utilities/DynamicColor;
    localObject3 = new com/google/android/material/color/utilities/o0O00O;
    ((o0O00O)localObject3).<init>();
    o0O00OO localo0O00OO = new com/google/android/material/color/utilities/o0O00OO;
    localo0O00OO.<init>();
    localObject4 = new com/google/android/material/color/utilities/o0O00OOO;
    ((o0O00OOO)localObject4).<init>();
    o0oO0Ooo localo0oO0Ooo = new com/google/android/material/color/utilities/o0oO0Ooo;
    localo0oO0Ooo.<init>();
    o0O00o00 localo0O00o00 = new com/google/android/material/color/utilities/o0O00o00;
    localo0O00o00.<init>();
    o0O0O0O localo0O0O0O = new com/google/android/material/color/utilities/o0O0O0O;
    localo0O0O0O.<init>();
    localObject2 = localObject1;
    ((DynamicColor)localObject1).<init>((Function)localObject3, localo0O00OO, (Function)localObject4, localo0oO0Ooo, null, localo0O00o00, localo0O0O0O, null);
    controlHighlight = (DynamicColor)localObject1;
    localObject1 = new com/google/android/material/color/utilities/o0oO0O0o;
    ((o0oO0O0o)localObject1).<init>();
    localObject2 = new com/google/android/material/color/utilities/o0O0oo0o;
    ((o0O0oo0o)localObject2).<init>();
    textPrimaryInverse = DynamicColor.fromPalette((Function)localObject1, (Function)localObject2);
    localObject1 = new com/google/android/material/color/utilities/o0O0O0o0;
    ((o0O0O0o0)localObject1).<init>();
    localObject2 = new com/google/android/material/color/utilities/o0O0OO0;
    ((o0O0OO0)localObject2).<init>();
    textSecondaryAndTertiaryInverse = DynamicColor.fromPalette((Function)localObject1, (Function)localObject2);
    localObject1 = new com/google/android/material/color/utilities/o0O0OOO0;
    ((o0O0OOO0)localObject1).<init>();
    localObject2 = new com/google/android/material/color/utilities/o0O0OOOo;
    ((o0O0OOOo)localObject2).<init>();
    textPrimaryInverseDisableOnly = DynamicColor.fromPalette((Function)localObject1, (Function)localObject2);
    localObject1 = new com/google/android/material/color/utilities/oo0OOoo;
    ((oo0OOoo)localObject1).<init>();
    localObject2 = new com/google/android/material/color/utilities/o0O0o000;
    ((o0O0o000)localObject2).<init>();
    textSecondaryAndTertiaryInverseDisabled = DynamicColor.fromPalette((Function)localObject1, (Function)localObject2);
    localObject1 = new com/google/android/material/color/utilities/o0O0o00O;
    ((o0O0o00O)localObject1).<init>();
    localObject2 = new com/google/android/material/color/utilities/o0oOo0O0;
    ((o0oOo0O0)localObject2).<init>();
    textHintInverse = DynamicColor.fromPalette((Function)localObject1, (Function)localObject2);
  }
  
  public static double findDesiredChromaByTone(double paramDouble1, double paramDouble2, double paramDouble3, boolean paramBoolean)
  {
    Hct localHct1 = Hct.from(paramDouble1, paramDouble2, paramDouble3);
    double d1 = localHct1.getChroma();
    boolean bool1 = d1 < paramDouble2;
    double d5;
    if (bool1)
    {
      d1 = localHct1.getChroma();
      Hct localHct2 = localHct1;
      double d2 = d1;
      for (double d3 = paramDouble3;; d3 = d5)
      {
        double d4 = localHct2.getChroma();
        boolean bool2 = d4 < paramDouble2;
        if (!bool2) {
          break;
        }
        if (paramBoolean) {
          d4 = -1.0D;
        } else {
          d4 = 1.0D;
        }
        d5 = d3 + d4;
        d3 = paramDouble1;
        d4 = paramDouble2;
        localHct1 = Hct.from(paramDouble1, paramDouble2, d5);
        d1 = localHct1.getChroma();
        bool1 = d2 < d1;
        if (bool1) {
          break label232;
        }
        d1 = Math.abs(localHct1.getChroma() - paramDouble2);
        double d6 = 0.4D;
        bool1 = d1 < d6;
        if (bool1) {
          break label232;
        }
        d1 = Math.abs(localHct1.getChroma() - paramDouble2);
        d6 = Math.abs(localHct2.getChroma() - paramDouble2);
        bool1 = d1 < d6;
        if (bool1) {
          localHct2 = localHct1;
        }
        d3 = localHct1.getChroma();
        d2 = Math.max(d2, d3);
      }
      d5 = d3;
    }
    else
    {
      d5 = paramDouble3;
    }
    label232:
    return d5;
  }
  
  public static DynamicColor highestSurface(DynamicScheme paramDynamicScheme)
  {
    boolean bool = paramDynamicScheme.isDark;
    if (bool) {
      paramDynamicScheme = surfaceBright;
    } else {
      paramDynamicScheme = surfaceDim;
    }
    return paramDynamicScheme;
  }
  
  private static boolean isFidelity(DynamicScheme paramDynamicScheme)
  {
    paramDynamicScheme = paramDynamicScheme.variant;
    Variant localVariant = Variant.FIDELITY;
    if (paramDynamicScheme != localVariant)
    {
      localVariant = Variant.CONTENT;
      if (paramDynamicScheme != localVariant)
      {
        bool = false;
        paramDynamicScheme = null;
        return bool;
      }
    }
    boolean bool = true;
    return bool;
  }
  
  public static double performAlbers(Hct paramHct, DynamicScheme paramDynamicScheme)
  {
    paramDynamicScheme = viewingConditionsForAlbers(paramDynamicScheme);
    paramDynamicScheme = paramHct.inViewingConditions(paramDynamicScheme);
    double d1 = paramHct.getTone();
    boolean bool = DynamicColor.tonePrefersLightForeground(d1);
    if (bool)
    {
      d1 = paramDynamicScheme.getTone();
      bool = DynamicColor.toneAllowsLightForeground(d1);
      if (bool) {}
    }
    for (double d2 = paramHct.getTone();; d2 = paramDynamicScheme.getTone()) {
      return DynamicColor.enableLightForeground(d2);
    }
  }
  
  private static ViewingConditions viewingConditionsForAlbers(DynamicScheme paramDynamicScheme)
  {
    boolean bool = paramDynamicScheme.isDark;
    double d;
    if (bool) {
      d = 30.0D;
    } else {
      d = 80.0D;
    }
    return ViewingConditions.defaultWithBackgroundLstar(d);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.color.utilities.MaterialDynamicColors
 * JD-Core Version:    0.7.0.1
 */