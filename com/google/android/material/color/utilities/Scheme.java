package com.google.android.material.color.utilities;

import m54207b69;

public class Scheme
{
  private int background;
  private int error;
  private int errorContainer;
  private int inverseOnSurface;
  private int inversePrimary;
  private int inverseSurface;
  private int onBackground;
  private int onError;
  private int onErrorContainer;
  private int onPrimary;
  private int onPrimaryContainer;
  private int onSecondary;
  private int onSecondaryContainer;
  private int onSurface;
  private int onSurfaceVariant;
  private int onTertiary;
  private int onTertiaryContainer;
  private int outline;
  private int outlineVariant;
  private int primary;
  private int primaryContainer;
  private int scrim;
  private int secondary;
  private int secondaryContainer;
  private int shadow;
  private int surface;
  private int surfaceVariant;
  private int tertiary;
  private int tertiaryContainer;
  
  public Scheme() {}
  
  public Scheme(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10, int paramInt11, int paramInt12, int paramInt13, int paramInt14, int paramInt15, int paramInt16, int paramInt17, int paramInt18, int paramInt19, int paramInt20, int paramInt21, int paramInt22, int paramInt23, int paramInt24, int paramInt25, int paramInt26, int paramInt27, int paramInt28, int paramInt29)
  {
    this.primary = paramInt1;
    this.onPrimary = paramInt2;
    this.primaryContainer = paramInt3;
    this.onPrimaryContainer = paramInt4;
    this.secondary = paramInt5;
    this.onSecondary = paramInt6;
    this.secondaryContainer = paramInt7;
    this.onSecondaryContainer = paramInt8;
    this.tertiary = paramInt9;
    this.onTertiary = paramInt10;
    this.tertiaryContainer = paramInt11;
    this.onTertiaryContainer = paramInt12;
    this.error = paramInt13;
    this.onError = paramInt14;
    this.errorContainer = paramInt15;
    this.onErrorContainer = paramInt16;
    this.background = paramInt17;
    this.onBackground = paramInt18;
    this.surface = paramInt19;
    this.onSurface = paramInt20;
    this.surfaceVariant = paramInt21;
    this.onSurfaceVariant = paramInt22;
    this.outline = paramInt23;
    this.outlineVariant = paramInt24;
    this.shadow = paramInt25;
    this.scrim = paramInt26;
    this.inverseSurface = paramInt27;
    this.inverseOnSurface = paramInt28;
    this.inversePrimary = paramInt29;
  }
  
  public static Scheme dark(int paramInt)
  {
    return darkFromCorePalette(CorePalette.of(paramInt));
  }
  
  public static Scheme darkContent(int paramInt)
  {
    return darkFromCorePalette(CorePalette.contentOf(paramInt));
  }
  
  private static Scheme darkFromCorePalette(CorePalette paramCorePalette)
  {
    Scheme localScheme = new com/google/android/material/color/utilities/Scheme;
    localScheme.<init>();
    TonalPalette localTonalPalette = paramCorePalette.a1;
    int i = 80;
    int j = localTonalPalette.tone(i);
    localScheme = localScheme.withPrimary(j);
    localTonalPalette = paramCorePalette.a1;
    int k = 20;
    j = localTonalPalette.tone(k);
    localScheme = localScheme.withOnPrimary(j);
    localTonalPalette = paramCorePalette.a1;
    int m = 30;
    j = localTonalPalette.tone(m);
    localScheme = localScheme.withPrimaryContainer(j);
    localTonalPalette = paramCorePalette.a1;
    int n = 90;
    j = localTonalPalette.tone(n);
    localScheme = localScheme.withOnPrimaryContainer(j);
    j = paramCorePalette.a2.tone(i);
    localScheme = localScheme.withSecondary(j);
    j = paramCorePalette.a2.tone(k);
    localScheme = localScheme.withOnSecondary(j);
    j = paramCorePalette.a2.tone(m);
    localScheme = localScheme.withSecondaryContainer(j);
    j = paramCorePalette.a2.tone(n);
    localScheme = localScheme.withOnSecondaryContainer(j);
    j = paramCorePalette.a3.tone(i);
    localScheme = localScheme.withTertiary(j);
    j = paramCorePalette.a3.tone(k);
    localScheme = localScheme.withOnTertiary(j);
    j = paramCorePalette.a3.tone(m);
    localScheme = localScheme.withTertiaryContainer(j);
    j = paramCorePalette.a3.tone(n);
    localScheme = localScheme.withOnTertiaryContainer(j);
    j = paramCorePalette.error.tone(i);
    localScheme = localScheme.withError(j);
    j = paramCorePalette.error.tone(k);
    localScheme = localScheme.withOnError(j);
    j = paramCorePalette.error.tone(m);
    localScheme = localScheme.withErrorContainer(j);
    j = paramCorePalette.error.tone(i);
    localScheme = localScheme.withOnErrorContainer(j);
    localTonalPalette = paramCorePalette.n1;
    int i1 = 10;
    j = localTonalPalette.tone(i1);
    localScheme = localScheme.withBackground(j);
    j = paramCorePalette.n1.tone(n);
    localScheme = localScheme.withOnBackground(j);
    j = paramCorePalette.n1.tone(i1);
    localScheme = localScheme.withSurface(j);
    j = paramCorePalette.n1.tone(n);
    localScheme = localScheme.withOnSurface(j);
    j = paramCorePalette.n2.tone(m);
    localScheme = localScheme.withSurfaceVariant(j);
    j = paramCorePalette.n2.tone(i);
    localScheme = localScheme.withOnSurfaceVariant(j);
    j = paramCorePalette.n2.tone(60);
    localScheme = localScheme.withOutline(j);
    j = paramCorePalette.n2.tone(m);
    localScheme = localScheme.withOutlineVariant(j);
    j = paramCorePalette.n1.tone(0);
    localScheme = localScheme.withShadow(j);
    j = paramCorePalette.n1.tone(0);
    localScheme = localScheme.withScrim(j);
    j = paramCorePalette.n1.tone(n);
    localScheme = localScheme.withInverseSurface(j);
    j = paramCorePalette.n1.tone(k);
    localScheme = localScheme.withInverseOnSurface(j);
    int i2 = paramCorePalette.a1.tone(40);
    return localScheme.withInversePrimary(i2);
  }
  
  public static Scheme light(int paramInt)
  {
    return lightFromCorePalette(CorePalette.of(paramInt));
  }
  
  public static Scheme lightContent(int paramInt)
  {
    return lightFromCorePalette(CorePalette.contentOf(paramInt));
  }
  
  private static Scheme lightFromCorePalette(CorePalette paramCorePalette)
  {
    Scheme localScheme = new com/google/android/material/color/utilities/Scheme;
    localScheme.<init>();
    TonalPalette localTonalPalette = paramCorePalette.a1;
    int i = 40;
    int j = localTonalPalette.tone(i);
    localScheme = localScheme.withPrimary(j);
    localTonalPalette = paramCorePalette.a1;
    int k = 100;
    j = localTonalPalette.tone(k);
    localScheme = localScheme.withOnPrimary(j);
    localTonalPalette = paramCorePalette.a1;
    int m = 90;
    j = localTonalPalette.tone(m);
    localScheme = localScheme.withPrimaryContainer(j);
    localTonalPalette = paramCorePalette.a1;
    int n = 10;
    j = localTonalPalette.tone(n);
    localScheme = localScheme.withOnPrimaryContainer(j);
    j = paramCorePalette.a2.tone(i);
    localScheme = localScheme.withSecondary(j);
    j = paramCorePalette.a2.tone(k);
    localScheme = localScheme.withOnSecondary(j);
    j = paramCorePalette.a2.tone(m);
    localScheme = localScheme.withSecondaryContainer(j);
    j = paramCorePalette.a2.tone(n);
    localScheme = localScheme.withOnSecondaryContainer(j);
    j = paramCorePalette.a3.tone(i);
    localScheme = localScheme.withTertiary(j);
    j = paramCorePalette.a3.tone(k);
    localScheme = localScheme.withOnTertiary(j);
    j = paramCorePalette.a3.tone(m);
    localScheme = localScheme.withTertiaryContainer(j);
    j = paramCorePalette.a3.tone(n);
    localScheme = localScheme.withOnTertiaryContainer(j);
    j = paramCorePalette.error.tone(i);
    localScheme = localScheme.withError(j);
    j = paramCorePalette.error.tone(k);
    localScheme = localScheme.withOnError(j);
    j = paramCorePalette.error.tone(m);
    localScheme = localScheme.withErrorContainer(j);
    j = paramCorePalette.error.tone(n);
    localScheme = localScheme.withOnErrorContainer(j);
    localTonalPalette = paramCorePalette.n1;
    i = 99;
    j = localTonalPalette.tone(i);
    localScheme = localScheme.withBackground(j);
    j = paramCorePalette.n1.tone(n);
    localScheme = localScheme.withOnBackground(j);
    j = paramCorePalette.n1.tone(i);
    localScheme = localScheme.withSurface(j);
    j = paramCorePalette.n1.tone(n);
    localScheme = localScheme.withOnSurface(j);
    j = paramCorePalette.n2.tone(m);
    localScheme = localScheme.withSurfaceVariant(j);
    j = paramCorePalette.n2.tone(30);
    localScheme = localScheme.withOnSurfaceVariant(j);
    j = paramCorePalette.n2.tone(50);
    localScheme = localScheme.withOutline(j);
    localTonalPalette = paramCorePalette.n2;
    i = 80;
    j = localTonalPalette.tone(i);
    localScheme = localScheme.withOutlineVariant(j);
    j = paramCorePalette.n1.tone(0);
    localScheme = localScheme.withShadow(j);
    j = paramCorePalette.n1.tone(0);
    localScheme = localScheme.withScrim(j);
    j = paramCorePalette.n1.tone(20);
    localScheme = localScheme.withInverseSurface(j);
    j = paramCorePalette.n1.tone(95);
    localScheme = localScheme.withInverseOnSurface(j);
    int i1 = paramCorePalette.a1.tone(i);
    return localScheme.withInversePrimary(i1);
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool1 = true;
    if (this == paramObject) {
      return bool1;
    }
    boolean bool2 = paramObject instanceof Scheme;
    if (!bool2) {
      return false;
    }
    bool2 = super.equals(paramObject);
    if (!bool2) {
      return false;
    }
    paramObject = (Scheme)paramObject;
    int i = this.primary;
    int j = paramObject.primary;
    if (i != j) {
      return false;
    }
    i = this.onPrimary;
    j = paramObject.onPrimary;
    if (i != j) {
      return false;
    }
    i = this.primaryContainer;
    j = paramObject.primaryContainer;
    if (i != j) {
      return false;
    }
    i = this.onPrimaryContainer;
    j = paramObject.onPrimaryContainer;
    if (i != j) {
      return false;
    }
    i = this.secondary;
    j = paramObject.secondary;
    if (i != j) {
      return false;
    }
    i = this.onSecondary;
    j = paramObject.onSecondary;
    if (i != j) {
      return false;
    }
    i = this.secondaryContainer;
    j = paramObject.secondaryContainer;
    if (i != j) {
      return false;
    }
    i = this.onSecondaryContainer;
    j = paramObject.onSecondaryContainer;
    if (i != j) {
      return false;
    }
    i = this.tertiary;
    j = paramObject.tertiary;
    if (i != j) {
      return false;
    }
    i = this.onTertiary;
    j = paramObject.onTertiary;
    if (i != j) {
      return false;
    }
    i = this.tertiaryContainer;
    j = paramObject.tertiaryContainer;
    if (i != j) {
      return false;
    }
    i = this.onTertiaryContainer;
    j = paramObject.onTertiaryContainer;
    if (i != j) {
      return false;
    }
    i = this.error;
    j = paramObject.error;
    if (i != j) {
      return false;
    }
    i = this.onError;
    j = paramObject.onError;
    if (i != j) {
      return false;
    }
    i = this.errorContainer;
    j = paramObject.errorContainer;
    if (i != j) {
      return false;
    }
    i = this.onErrorContainer;
    j = paramObject.onErrorContainer;
    if (i != j) {
      return false;
    }
    i = this.background;
    j = paramObject.background;
    if (i != j) {
      return false;
    }
    i = this.onBackground;
    j = paramObject.onBackground;
    if (i != j) {
      return false;
    }
    i = this.surface;
    j = paramObject.surface;
    if (i != j) {
      return false;
    }
    i = this.onSurface;
    j = paramObject.onSurface;
    if (i != j) {
      return false;
    }
    i = this.surfaceVariant;
    j = paramObject.surfaceVariant;
    if (i != j) {
      return false;
    }
    i = this.onSurfaceVariant;
    j = paramObject.onSurfaceVariant;
    if (i != j) {
      return false;
    }
    i = this.outline;
    j = paramObject.outline;
    if (i != j) {
      return false;
    }
    i = this.outlineVariant;
    j = paramObject.outlineVariant;
    if (i != j) {
      return false;
    }
    i = this.shadow;
    j = paramObject.shadow;
    if (i != j) {
      return false;
    }
    i = this.scrim;
    j = paramObject.scrim;
    if (i != j) {
      return false;
    }
    i = this.inverseSurface;
    j = paramObject.inverseSurface;
    if (i != j) {
      return false;
    }
    i = this.inverseOnSurface;
    j = paramObject.inverseOnSurface;
    if (i != j) {
      return false;
    }
    i = this.inversePrimary;
    int k = paramObject.inversePrimary;
    if (i != k) {
      return false;
    }
    return bool1;
  }
  
  public int getBackground()
  {
    return this.background;
  }
  
  public int getError()
  {
    return this.error;
  }
  
  public int getErrorContainer()
  {
    return this.errorContainer;
  }
  
  public int getInverseOnSurface()
  {
    return this.inverseOnSurface;
  }
  
  public int getInversePrimary()
  {
    return this.inversePrimary;
  }
  
  public int getInverseSurface()
  {
    return this.inverseSurface;
  }
  
  public int getOnBackground()
  {
    return this.onBackground;
  }
  
  public int getOnError()
  {
    return this.onError;
  }
  
  public int getOnErrorContainer()
  {
    return this.onErrorContainer;
  }
  
  public int getOnPrimary()
  {
    return this.onPrimary;
  }
  
  public int getOnPrimaryContainer()
  {
    return this.onPrimaryContainer;
  }
  
  public int getOnSecondary()
  {
    return this.onSecondary;
  }
  
  public int getOnSecondaryContainer()
  {
    return this.onSecondaryContainer;
  }
  
  public int getOnSurface()
  {
    return this.onSurface;
  }
  
  public int getOnSurfaceVariant()
  {
    return this.onSurfaceVariant;
  }
  
  public int getOnTertiary()
  {
    return this.onTertiary;
  }
  
  public int getOnTertiaryContainer()
  {
    return this.onTertiaryContainer;
  }
  
  public int getOutline()
  {
    return this.outline;
  }
  
  public int getOutlineVariant()
  {
    return this.outlineVariant;
  }
  
  public int getPrimary()
  {
    return this.primary;
  }
  
  public int getPrimaryContainer()
  {
    return this.primaryContainer;
  }
  
  public int getScrim()
  {
    return this.scrim;
  }
  
  public int getSecondary()
  {
    return this.secondary;
  }
  
  public int getSecondaryContainer()
  {
    return this.secondaryContainer;
  }
  
  public int getShadow()
  {
    return this.shadow;
  }
  
  public int getSurface()
  {
    return this.surface;
  }
  
  public int getSurfaceVariant()
  {
    return this.surfaceVariant;
  }
  
  public int getTertiary()
  {
    return this.tertiary;
  }
  
  public int getTertiaryContainer()
  {
    return this.tertiaryContainer;
  }
  
  public int hashCode()
  {
    int i = super.hashCode() * 31;
    int j = this.primary;
    i = (i + j) * 31;
    j = this.onPrimary;
    i = (i + j) * 31;
    j = this.primaryContainer;
    i = (i + j) * 31;
    j = this.onPrimaryContainer;
    i = (i + j) * 31;
    j = this.secondary;
    i = (i + j) * 31;
    j = this.onSecondary;
    i = (i + j) * 31;
    j = this.secondaryContainer;
    i = (i + j) * 31;
    j = this.onSecondaryContainer;
    i = (i + j) * 31;
    j = this.tertiary;
    i = (i + j) * 31;
    j = this.onTertiary;
    i = (i + j) * 31;
    j = this.tertiaryContainer;
    i = (i + j) * 31;
    j = this.onTertiaryContainer;
    i = (i + j) * 31;
    j = this.error;
    i = (i + j) * 31;
    j = this.onError;
    i = (i + j) * 31;
    j = this.errorContainer;
    i = (i + j) * 31;
    j = this.onErrorContainer;
    i = (i + j) * 31;
    j = this.background;
    i = (i + j) * 31;
    j = this.onBackground;
    i = (i + j) * 31;
    j = this.surface;
    i = (i + j) * 31;
    j = this.onSurface;
    i = (i + j) * 31;
    j = this.surfaceVariant;
    i = (i + j) * 31;
    j = this.onSurfaceVariant;
    i = (i + j) * 31;
    j = this.outline;
    i = (i + j) * 31;
    j = this.outlineVariant;
    i = (i + j) * 31;
    j = this.shadow;
    i = (i + j) * 31;
    j = this.scrim;
    i = (i + j) * 31;
    j = this.inverseSurface;
    i = (i + j) * 31;
    j = this.inverseOnSurface;
    i = (i + j) * 31;
    j = this.inversePrimary;
    return i + j;
  }
  
  public void setBackground(int paramInt)
  {
    this.background = paramInt;
  }
  
  public void setError(int paramInt)
  {
    this.error = paramInt;
  }
  
  public void setErrorContainer(int paramInt)
  {
    this.errorContainer = paramInt;
  }
  
  public void setInverseOnSurface(int paramInt)
  {
    this.inverseOnSurface = paramInt;
  }
  
  public void setInversePrimary(int paramInt)
  {
    this.inversePrimary = paramInt;
  }
  
  public void setInverseSurface(int paramInt)
  {
    this.inverseSurface = paramInt;
  }
  
  public void setOnBackground(int paramInt)
  {
    this.onBackground = paramInt;
  }
  
  public void setOnError(int paramInt)
  {
    this.onError = paramInt;
  }
  
  public void setOnErrorContainer(int paramInt)
  {
    this.onErrorContainer = paramInt;
  }
  
  public void setOnPrimary(int paramInt)
  {
    this.onPrimary = paramInt;
  }
  
  public void setOnPrimaryContainer(int paramInt)
  {
    this.onPrimaryContainer = paramInt;
  }
  
  public void setOnSecondary(int paramInt)
  {
    this.onSecondary = paramInt;
  }
  
  public void setOnSecondaryContainer(int paramInt)
  {
    this.onSecondaryContainer = paramInt;
  }
  
  public void setOnSurface(int paramInt)
  {
    this.onSurface = paramInt;
  }
  
  public void setOnSurfaceVariant(int paramInt)
  {
    this.onSurfaceVariant = paramInt;
  }
  
  public void setOnTertiary(int paramInt)
  {
    this.onTertiary = paramInt;
  }
  
  public void setOnTertiaryContainer(int paramInt)
  {
    this.onTertiaryContainer = paramInt;
  }
  
  public void setOutline(int paramInt)
  {
    this.outline = paramInt;
  }
  
  public void setOutlineVariant(int paramInt)
  {
    this.outlineVariant = paramInt;
  }
  
  public void setPrimary(int paramInt)
  {
    this.primary = paramInt;
  }
  
  public void setPrimaryContainer(int paramInt)
  {
    this.primaryContainer = paramInt;
  }
  
  public void setScrim(int paramInt)
  {
    this.scrim = paramInt;
  }
  
  public void setSecondary(int paramInt)
  {
    this.secondary = paramInt;
  }
  
  public void setSecondaryContainer(int paramInt)
  {
    this.secondaryContainer = paramInt;
  }
  
  public void setShadow(int paramInt)
  {
    this.shadow = paramInt;
  }
  
  public void setSurface(int paramInt)
  {
    this.surface = paramInt;
  }
  
  public void setSurfaceVariant(int paramInt)
  {
    this.surfaceVariant = paramInt;
  }
  
  public void setTertiary(int paramInt)
  {
    this.tertiary = paramInt;
  }
  
  public void setTertiaryContainer(int paramInt)
  {
    this.tertiaryContainer = paramInt;
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str = m54207b69.F54207b69_11("o[083935413A432632313B4045352F74");
    localStringBuilder.append(str);
    int i = this.primary;
    localStringBuilder.append(i);
    str = m54207b69.F54207b69_11("da4D42101235180E13081C2267");
    localStringBuilder.append(str);
    i = this.onPrimary;
    localStringBuilder.append(i);
    str = m54207b69.F54207b69_11("[v5A57080723201D0B173E23230E242D2723155D");
    localStringBuilder.append(str);
    i = this.primaryContainer;
    localStringBuilder.append(i);
    str = m54207b69.F54207b69_11("e/0310424483624C49566660774C4E695D56525C7026");
    localStringBuilder.append(str);
    i = this.onPrimaryContainer;
    localStringBuilder.append(i);
    str = m54207b69.F54207b69_11("hM616E402B3227293034483E7B");
    localStringBuilder.append(str);
    i = this.secondary;
    localStringBuilder.append(i);
    str = m54207b69.F54207b69_11("[d48450D0D3B060D1212090F212966");
    localStringBuilder.append(str);
    i = this.onSecondary;
    localStringBuilder.append(i);
    str = m54207b69.F54207b69_11("[i454A1C0F0E0B0D1410241A3512142B1710181E2E68");
    localStringBuilder.append(str);
    i = this.secondaryContainer;
    localStringBuilder.append(i);
    str = m54207b69.F54207b69_11("D<101D5555735E655A5A616759518C6161586E67656D6317");
    localStringBuilder.append(str);
    i = this.onSecondaryContainer;
    localStringBuilder.append(i);
    str = m54207b69.F54207b69_11("Ws5F540919050C2019091358");
    localStringBuilder.append(str);
    i = this.tertiary;
    localStringBuilder.append(i);
    str = m54207b69.F54207b69_11("1R7E733F3F0A3C262D433C2A367B");
    localStringBuilder.append(str);
    i = this.onTertiary;
    localStringBuilder.append(i);
    str = m54207b69.F54207b69_11("'k474C21111D240811211B320F112C1811151F2B69");
    localStringBuilder.append(str);
    i = this.tertiaryContainer;
    localStringBuilder.append(i);
    str = m54207b69.F54207b69_11("6R7E733F3F0A3C262D433C2A361D4A4A35434C4E4A3484");
    localStringBuilder.append(str);
    i = this.onTertiaryContainer;
    localStringBuilder.append(i);
    str = m54207b69.F54207b69_11("P61A175547485E4A12");
    localStringBuilder.append(str);
    i = this.error;
    localStringBuilder.append(i);
    str = m54207b69.F54207b69_11("M&0A074B4B67595A505C24");
    localStringBuilder.append(str);
    i = this.onError;
    localStringBuilder.append(i);
    str = m54207b69.F54207b69_11("aZ767B412B2C3A2E203D3D38463F414D3777");
    localStringBuilder.append(str);
    i = this.errorContainer;
    localStringBuilder.append(i);
    str = m54207b69.F54207b69_11("oC6F642E300A36373339093638432F383C364290");
    localStringBuilder.append(str);
    i = this.onErrorContainer;
    localStringBuilder.append(i);
    str = m54207b69.F54207b69_11("_>121F5E62615A5F5359545A650F");
    localStringBuilder.append(str);
    i = this.background;
    localStringBuilder.append(i);
    str = m54207b69.F54207b69_11(",H646929290E2E312A37433148323983");
    localStringBuilder.append(str);
    i = this.onBackground;
    localStringBuilder.append(i);
    str = m54207b69.F54207b69_11("9h44491D201E130F12155E");
    localStringBuilder.append(str);
    i = this.surface;
    localStringBuilder.append(i);
    str = m54207b69.F54207b69_11("*P7C714141072A283D393C3F78");
    localStringBuilder.append(str);
    i = this.onSurface;
    localStringBuilder.append(i);
    str = m54207b69.F54207b69_11("Z4181549444A575B5E596B5F516962684F19");
    localStringBuilder.append(str);
    i = this.surfaceVariant;
    localStringBuilder.append(i);
    str = m54207b69.F54207b69_11("t'0B084A4C78575B484E4D4C7C52625C5559642C");
    localStringBuilder.append(str);
    i = this.onSurfaceVariant;
    localStringBuilder.append(i);
    str = m54207b69.F54207b69_11("sj464B0722220B090B1760");
    localStringBuilder.append(str);
    i = this.outline;
    localStringBuilder.append(i);
    str = m54207b69.F54207b69_11("I(040949606049474D558753654D56546B25");
    localStringBuilder.append(str);
    i = this.outlineVariant;
    localStringBuilder.append(i);
    str = m54207b69.F54207b69_11("6$0805594F4945515A21");
    localStringBuilder.append(str);
    i = this.shadow;
    localStringBuilder.append(i);
    str = m54207b69.F54207b69_11("6J666B3B2C3C282D7E");
    localStringBuilder.append(str);
    i = this.scrim;
    localStringBuilder.append(i);
    str = m54207b69.F54207b69_11("]%09064E4E57455D5D487F5A624F51544F28");
    localStringBuilder.append(str);
    i = this.inverseSurface;
    localStringBuilder.append(i);
    str = m54207b69.F54207b69_11("7f4A47110B14081A1C0B3212401F210E1615146D");
    localStringBuilder.append(str);
    i = this.inverseOnSurface;
    localStringBuilder.append(i);
    str = m54207b69.F54207b69_11("1<101D57554E5E5456617558605D6A5C5411");
    localStringBuilder.append(str);
    i = this.inversePrimary;
    localStringBuilder.append(i);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public Scheme withBackground(int paramInt)
  {
    this.background = paramInt;
    return this;
  }
  
  public Scheme withError(int paramInt)
  {
    this.error = paramInt;
    return this;
  }
  
  public Scheme withErrorContainer(int paramInt)
  {
    this.errorContainer = paramInt;
    return this;
  }
  
  public Scheme withInverseOnSurface(int paramInt)
  {
    this.inverseOnSurface = paramInt;
    return this;
  }
  
  public Scheme withInversePrimary(int paramInt)
  {
    this.inversePrimary = paramInt;
    return this;
  }
  
  public Scheme withInverseSurface(int paramInt)
  {
    this.inverseSurface = paramInt;
    return this;
  }
  
  public Scheme withOnBackground(int paramInt)
  {
    this.onBackground = paramInt;
    return this;
  }
  
  public Scheme withOnError(int paramInt)
  {
    this.onError = paramInt;
    return this;
  }
  
  public Scheme withOnErrorContainer(int paramInt)
  {
    this.onErrorContainer = paramInt;
    return this;
  }
  
  public Scheme withOnPrimary(int paramInt)
  {
    this.onPrimary = paramInt;
    return this;
  }
  
  public Scheme withOnPrimaryContainer(int paramInt)
  {
    this.onPrimaryContainer = paramInt;
    return this;
  }
  
  public Scheme withOnSecondary(int paramInt)
  {
    this.onSecondary = paramInt;
    return this;
  }
  
  public Scheme withOnSecondaryContainer(int paramInt)
  {
    this.onSecondaryContainer = paramInt;
    return this;
  }
  
  public Scheme withOnSurface(int paramInt)
  {
    this.onSurface = paramInt;
    return this;
  }
  
  public Scheme withOnSurfaceVariant(int paramInt)
  {
    this.onSurfaceVariant = paramInt;
    return this;
  }
  
  public Scheme withOnTertiary(int paramInt)
  {
    this.onTertiary = paramInt;
    return this;
  }
  
  public Scheme withOnTertiaryContainer(int paramInt)
  {
    this.onTertiaryContainer = paramInt;
    return this;
  }
  
  public Scheme withOutline(int paramInt)
  {
    this.outline = paramInt;
    return this;
  }
  
  public Scheme withOutlineVariant(int paramInt)
  {
    this.outlineVariant = paramInt;
    return this;
  }
  
  public Scheme withPrimary(int paramInt)
  {
    this.primary = paramInt;
    return this;
  }
  
  public Scheme withPrimaryContainer(int paramInt)
  {
    this.primaryContainer = paramInt;
    return this;
  }
  
  public Scheme withScrim(int paramInt)
  {
    this.scrim = paramInt;
    return this;
  }
  
  public Scheme withSecondary(int paramInt)
  {
    this.secondary = paramInt;
    return this;
  }
  
  public Scheme withSecondaryContainer(int paramInt)
  {
    this.secondaryContainer = paramInt;
    return this;
  }
  
  public Scheme withShadow(int paramInt)
  {
    this.shadow = paramInt;
    return this;
  }
  
  public Scheme withSurface(int paramInt)
  {
    this.surface = paramInt;
    return this;
  }
  
  public Scheme withSurfaceVariant(int paramInt)
  {
    this.surfaceVariant = paramInt;
    return this;
  }
  
  public Scheme withTertiary(int paramInt)
  {
    this.tertiary = paramInt;
    return this;
  }
  
  public Scheme withTertiaryContainer(int paramInt)
  {
    this.tertiaryContainer = paramInt;
    return this;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.color.utilities.Scheme
 * JD-Core Version:    0.7.0.1
 */