package com.google.android.material.badge;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import com.google.android.material.R.dimen;
import com.google.android.material.R.plurals;
import com.google.android.material.R.string;
import com.google.android.material.R.style;
import com.google.android.material.R.styleable;
import com.google.android.material.drawable.DrawableUtils;
import com.google.android.material.internal.ThemeEnforcement;
import com.google.android.material.resources.MaterialResources;
import com.google.android.material.resources.TextAppearance;
import java.util.Locale;
import java.util.Locale.Category;
import m54207b69;

public final class BadgeState
{
  private static final String BADGE_RESOURCE_TAG = "badge";
  private static final int DEFAULT_MAX_BADGE_CHARACTER_COUNT = 4;
  final float badgeHeight;
  final float badgeRadius;
  final float badgeWidePadding;
  final float badgeWidth;
  final float badgeWithTextHeight;
  final float badgeWithTextRadius;
  final float badgeWithTextWidth;
  private final BadgeState.State currentState;
  final int horizontalInset;
  final int horizontalInsetWithText;
  int offsetAlignmentMode;
  private final BadgeState.State overridingState;
  
  public BadgeState(Context paramContext, int paramInt1, int paramInt2, int paramInt3, BadgeState.State paramState)
  {
    BadgeState.State localState = new com/google/android/material/badge/BadgeState$State;
    localState.<init>();
    this.currentState = localState;
    if (paramState == null)
    {
      paramState = new com/google/android/material/badge/BadgeState$State;
      paramState.<init>();
    }
    if (paramInt1 != 0) {
      BadgeState.State.access$002(paramState, paramInt1);
    }
    paramInt1 = BadgeState.State.access$000(paramState);
    TypedArray localTypedArray = generateTypedArray(paramContext, paramInt1, paramInt2, paramInt3);
    Object localObject1 = paramContext.getResources();
    paramInt3 = R.styleable.Badge_badgeRadius;
    int i = -1;
    float f1 = localTypedArray.getDimensionPixelSize(paramInt3, i);
    this.badgeRadius = f1;
    paramInt3 = R.styleable.Badge_badgeWidePadding;
    int j = R.dimen.mtrl_badge_long_text_horizontal_padding;
    j = ((Resources)localObject1).getDimensionPixelSize(j);
    f1 = localTypedArray.getDimensionPixelSize(paramInt3, j);
    this.badgeWidePadding = f1;
    Object localObject2 = paramContext.getResources();
    j = R.dimen.mtrl_badge_horizontal_edge_offset;
    paramInt3 = ((Resources)localObject2).getDimensionPixelSize(j);
    this.horizontalInset = paramInt3;
    localObject2 = paramContext.getResources();
    j = R.dimen.mtrl_badge_text_horizontal_edge_offset;
    paramInt3 = ((Resources)localObject2).getDimensionPixelSize(j);
    this.horizontalInsetWithText = paramInt3;
    paramInt3 = R.styleable.Badge_badgeWithTextRadius;
    f1 = localTypedArray.getDimensionPixelSize(paramInt3, i);
    this.badgeWithTextRadius = f1;
    paramInt3 = R.styleable.Badge_badgeWidth;
    j = R.dimen.m3_badge_size;
    float f2 = ((Resources)localObject1).getDimension(j);
    f1 = localTypedArray.getDimension(paramInt3, f2);
    this.badgeWidth = f1;
    paramInt3 = R.styleable.Badge_badgeWithTextWidth;
    j = R.dimen.m3_badge_with_text_size;
    f2 = ((Resources)localObject1).getDimension(j);
    f1 = localTypedArray.getDimension(paramInt3, f2);
    this.badgeWithTextWidth = f1;
    paramInt3 = R.styleable.Badge_badgeHeight;
    j = R.dimen.m3_badge_size;
    f2 = ((Resources)localObject1).getDimension(j);
    f1 = localTypedArray.getDimension(paramInt3, f2);
    this.badgeHeight = f1;
    paramInt3 = R.styleable.Badge_badgeWithTextHeight;
    j = R.dimen.m3_badge_with_text_size;
    float f3 = ((Resources)localObject1).getDimension(j);
    f3 = localTypedArray.getDimension(paramInt3, f3);
    this.badgeWithTextHeight = f3;
    paramInt2 = R.styleable.Badge_offsetAlignmentMode;
    paramInt3 = 1;
    f1 = 1.4E-45F;
    paramInt2 = localTypedArray.getInt(paramInt2, paramInt3);
    this.offsetAlignmentMode = paramInt2;
    paramInt2 = BadgeState.State.access$100(paramState);
    j = -2;
    f2 = 0.0F / 0.0F;
    if (paramInt2 == j)
    {
      paramInt2 = 255;
      f3 = 3.573311E-043F;
    }
    else
    {
      paramInt2 = BadgeState.State.access$100(paramState);
    }
    BadgeState.State.access$102(localState, paramInt2);
    localObject1 = BadgeState.State.access$200(paramState);
    if (localObject1 == null)
    {
      paramInt2 = R.string.mtrl_badge_numberless_content_description;
      localObject1 = paramContext.getString(paramInt2);
    }
    else
    {
      localObject1 = BadgeState.State.access$200(paramState);
    }
    BadgeState.State.access$202(localState, (CharSequence)localObject1);
    paramInt2 = BadgeState.State.access$300(paramState);
    if (paramInt2 == 0) {
      paramInt2 = R.plurals.mtrl_badge_content_description;
    } else {
      paramInt2 = BadgeState.State.access$300(paramState);
    }
    BadgeState.State.access$302(localState, paramInt2);
    paramInt2 = BadgeState.State.access$400(paramState);
    if (paramInt2 == 0) {
      paramInt2 = R.string.mtrl_exceed_max_badge_number_content_description;
    } else {
      paramInt2 = BadgeState.State.access$400(paramState);
    }
    BadgeState.State.access$402(localState, paramInt2);
    localObject1 = BadgeState.State.access$500(paramState);
    int k = 0;
    if (localObject1 != null)
    {
      localObject1 = BadgeState.State.access$500(paramState);
      paramInt2 = ((Boolean)localObject1).booleanValue();
      if (paramInt2 == 0)
      {
        paramInt3 = 0;
        localObject2 = null;
        f1 = 0.0F;
      }
    }
    localObject1 = Boolean.valueOf(paramInt3);
    BadgeState.State.access$502(localState, (Boolean)localObject1);
    paramInt2 = BadgeState.State.access$600(paramState);
    if (paramInt2 == j)
    {
      paramInt2 = R.styleable.Badge_maxCharacterCount;
      paramInt3 = 4;
      f1 = 5.605194E-045F;
      paramInt2 = localTypedArray.getInt(paramInt2, paramInt3);
    }
    else
    {
      paramInt2 = BadgeState.State.access$600(paramState);
    }
    BadgeState.State.access$602(localState, paramInt2);
    paramInt2 = BadgeState.State.access$700(paramState);
    if (paramInt2 != j) {}
    for (paramInt2 = BadgeState.State.access$700(paramState);; paramInt2 = localTypedArray.getInt(paramInt2, 0))
    {
      BadgeState.State.access$702(localState, paramInt2);
      break label695;
      paramInt2 = R.styleable.Badge_number;
      paramInt2 = localTypedArray.hasValue(paramInt2);
      if (paramInt2 == 0) {
        break;
      }
      paramInt2 = R.styleable.Badge_number;
    }
    BadgeState.State.access$702(localState, i);
    label695:
    localObject1 = BadgeState.State.access$800(paramState);
    if (localObject1 == null)
    {
      paramInt2 = R.styleable.Badge_badgeShapeAppearance;
      paramInt3 = R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full;
      paramInt2 = localTypedArray.getResourceId(paramInt2, paramInt3);
    }
    else
    {
      localObject1 = BadgeState.State.access$800(paramState);
      paramInt2 = ((Integer)localObject1).intValue();
    }
    localObject1 = Integer.valueOf(paramInt2);
    BadgeState.State.access$802(localState, (Integer)localObject1);
    localObject1 = BadgeState.State.access$900(paramState);
    if (localObject1 == null)
    {
      paramInt2 = R.styleable.Badge_badgeShapeAppearanceOverlay;
      paramInt2 = localTypedArray.getResourceId(paramInt2, 0);
    }
    else
    {
      localObject1 = BadgeState.State.access$900(paramState);
      paramInt2 = ((Integer)localObject1).intValue();
    }
    localObject1 = Integer.valueOf(paramInt2);
    BadgeState.State.access$902(localState, (Integer)localObject1);
    localObject1 = BadgeState.State.access$1000(paramState);
    if (localObject1 == null)
    {
      paramInt2 = R.styleable.Badge_badgeWithTextShapeAppearance;
      paramInt3 = R.style.ShapeAppearance_M3_Sys_Shape_Corner_Full;
      paramInt2 = localTypedArray.getResourceId(paramInt2, paramInt3);
    }
    else
    {
      localObject1 = BadgeState.State.access$1000(paramState);
      paramInt2 = ((Integer)localObject1).intValue();
    }
    localObject1 = Integer.valueOf(paramInt2);
    BadgeState.State.access$1002(localState, (Integer)localObject1);
    localObject1 = BadgeState.State.access$1100(paramState);
    if (localObject1 == null)
    {
      paramInt2 = R.styleable.Badge_badgeWithTextShapeAppearanceOverlay;
      paramInt2 = localTypedArray.getResourceId(paramInt2, 0);
    }
    else
    {
      localObject1 = BadgeState.State.access$1100(paramState);
      paramInt2 = ((Integer)localObject1).intValue();
    }
    localObject1 = Integer.valueOf(paramInt2);
    BadgeState.State.access$1102(localState, (Integer)localObject1);
    localObject1 = BadgeState.State.access$1200(paramState);
    if (localObject1 == null)
    {
      paramInt2 = R.styleable.Badge_backgroundColor;
      paramInt2 = readColorFromAttributes(paramContext, localTypedArray, paramInt2);
    }
    else
    {
      localObject1 = BadgeState.State.access$1200(paramState);
      paramInt2 = ((Integer)localObject1).intValue();
    }
    localObject1 = Integer.valueOf(paramInt2);
    BadgeState.State.access$1202(localState, (Integer)localObject1);
    localObject1 = BadgeState.State.access$1300(paramState);
    if (localObject1 == null)
    {
      paramInt2 = R.styleable.Badge_badgeTextAppearance;
      paramInt3 = R.style.TextAppearance_MaterialComponents_Badge;
      paramInt2 = localTypedArray.getResourceId(paramInt2, paramInt3);
    }
    else
    {
      localObject1 = BadgeState.State.access$1300(paramState);
      paramInt2 = ((Integer)localObject1).intValue();
    }
    localObject1 = Integer.valueOf(paramInt2);
    BadgeState.State.access$1302(localState, (Integer)localObject1);
    localObject1 = BadgeState.State.access$1400(paramState);
    if (localObject1 != null) {}
    int m;
    for (paramContext = BadgeState.State.access$1400(paramState);; paramContext = Integer.valueOf(m))
    {
      BadgeState.State.access$1402(localState, paramContext);
      break;
      paramInt2 = R.styleable.Badge_badgeTextColor;
      paramInt2 = localTypedArray.hasValue(paramInt2);
      if (paramInt2 != 0)
      {
        paramInt2 = R.styleable.Badge_badgeTextColor;
        m = readColorFromAttributes(paramContext, localTypedArray, paramInt2);
      }
      else
      {
        localObject1 = new com/google/android/material/resources/TextAppearance;
        localObject2 = BadgeState.State.access$1300(localState);
        paramInt3 = ((Integer)localObject2).intValue();
        ((TextAppearance)localObject1).<init>(paramContext, paramInt3);
        paramContext = ((TextAppearance)localObject1).getTextColor();
        m = paramContext.getDefaultColor();
      }
    }
    paramContext = BadgeState.State.access$1500(paramState);
    if (paramContext == null)
    {
      m = R.styleable.Badge_badgeGravity;
      paramInt2 = 8388661;
      f3 = 1.175502E-038F;
      m = localTypedArray.getInt(m, paramInt2);
    }
    else
    {
      paramContext = BadgeState.State.access$1500(paramState);
      m = paramContext.intValue();
    }
    paramContext = Integer.valueOf(m);
    BadgeState.State.access$1502(localState, paramContext);
    paramContext = BadgeState.State.access$1600(paramState);
    if (paramContext == null)
    {
      m = R.styleable.Badge_horizontalOffset;
      m = localTypedArray.getDimensionPixelOffset(m, 0);
    }
    else
    {
      paramContext = BadgeState.State.access$1600(paramState);
      m = paramContext.intValue();
    }
    paramContext = Integer.valueOf(m);
    BadgeState.State.access$1602(localState, paramContext);
    paramContext = BadgeState.State.access$1700(paramState);
    if (paramContext == null)
    {
      m = R.styleable.Badge_verticalOffset;
      m = localTypedArray.getDimensionPixelOffset(m, 0);
    }
    else
    {
      paramContext = BadgeState.State.access$1700(paramState);
      m = paramContext.intValue();
    }
    paramContext = Integer.valueOf(m);
    BadgeState.State.access$1702(localState, paramContext);
    paramContext = BadgeState.State.access$1800(paramState);
    if (paramContext == null)
    {
      m = R.styleable.Badge_horizontalOffsetWithText;
      localObject1 = BadgeState.State.access$1600(localState);
      paramInt2 = ((Integer)localObject1).intValue();
      m = localTypedArray.getDimensionPixelOffset(m, paramInt2);
    }
    else
    {
      paramContext = BadgeState.State.access$1800(paramState);
      m = paramContext.intValue();
    }
    paramContext = Integer.valueOf(m);
    BadgeState.State.access$1802(localState, paramContext);
    paramContext = BadgeState.State.access$1900(paramState);
    if (paramContext == null)
    {
      m = R.styleable.Badge_verticalOffsetWithText;
      localObject1 = BadgeState.State.access$1700(localState);
      paramInt2 = ((Integer)localObject1).intValue();
      m = localTypedArray.getDimensionPixelOffset(m, paramInt2);
    }
    else
    {
      paramContext = BadgeState.State.access$1900(paramState);
      m = paramContext.intValue();
    }
    paramContext = Integer.valueOf(m);
    BadgeState.State.access$1902(localState, paramContext);
    paramContext = BadgeState.State.access$2000(paramState);
    if (paramContext == null)
    {
      m = 0;
      paramContext = null;
    }
    else
    {
      paramContext = BadgeState.State.access$2000(paramState);
      m = paramContext.intValue();
    }
    paramContext = Integer.valueOf(m);
    BadgeState.State.access$2002(localState, paramContext);
    paramContext = BadgeState.State.access$2100(paramState);
    if (paramContext != null)
    {
      paramContext = BadgeState.State.access$2100(paramState);
      k = paramContext.intValue();
    }
    paramContext = Integer.valueOf(k);
    BadgeState.State.access$2102(localState, paramContext);
    localTypedArray.recycle();
    paramContext = BadgeState.State.access$2200(paramState);
    if (paramContext == null) {
      paramContext = Locale.getDefault(Locale.Category.FORMAT);
    } else {
      paramContext = BadgeState.State.access$2200(paramState);
    }
    BadgeState.State.access$2202(localState, paramContext);
    this.overridingState = paramState;
  }
  
  private TypedArray generateTypedArray(Context paramContext, int paramInt1, int paramInt2, int paramInt3)
  {
    AttributeSet localAttributeSet1;
    int i;
    AttributeSet localAttributeSet2;
    if (paramInt1 != 0)
    {
      localObject = m54207b69.F54207b69_11("3g0507050306");
      localAttributeSet1 = DrawableUtils.parseDrawableXml(paramContext, paramInt1, (CharSequence)localObject);
      i = localAttributeSet1.getStyleAttribute();
      localAttributeSet2 = localAttributeSet1;
    }
    else
    {
      paramInt1 = 0;
      localAttributeSet1 = null;
      localAttributeSet2 = null;
      i = 0;
      localObject = null;
    }
    int j;
    if (i == 0) {
      j = paramInt3;
    } else {
      j = i;
    }
    int[] arrayOfInt1 = R.styleable.Badge;
    int[] arrayOfInt2 = new int[0];
    Object localObject = paramContext;
    return ThemeEnforcement.obtainStyledAttributes(paramContext, localAttributeSet2, arrayOfInt1, paramInt2, j, arrayOfInt2);
  }
  
  private static int readColorFromAttributes(Context paramContext, TypedArray paramTypedArray, int paramInt)
  {
    return MaterialResources.getColorStateList(paramContext, paramTypedArray, paramInt).getDefaultColor();
  }
  
  public void clearNumber()
  {
    setNumber(-1);
  }
  
  public int getAdditionalHorizontalOffset()
  {
    return BadgeState.State.access$2000(this.currentState).intValue();
  }
  
  public int getAdditionalVerticalOffset()
  {
    return BadgeState.State.access$2100(this.currentState).intValue();
  }
  
  public int getAlpha()
  {
    return BadgeState.State.access$100(this.currentState);
  }
  
  public int getBackgroundColor()
  {
    return BadgeState.State.access$1200(this.currentState).intValue();
  }
  
  public int getBadgeGravity()
  {
    return BadgeState.State.access$1500(this.currentState).intValue();
  }
  
  public int getBadgeShapeAppearanceOverlayResId()
  {
    return BadgeState.State.access$900(this.currentState).intValue();
  }
  
  public int getBadgeShapeAppearanceResId()
  {
    return BadgeState.State.access$800(this.currentState).intValue();
  }
  
  public int getBadgeTextColor()
  {
    return BadgeState.State.access$1400(this.currentState).intValue();
  }
  
  public int getBadgeWithTextShapeAppearanceOverlayResId()
  {
    return BadgeState.State.access$1100(this.currentState).intValue();
  }
  
  public int getBadgeWithTextShapeAppearanceResId()
  {
    return BadgeState.State.access$1000(this.currentState).intValue();
  }
  
  public int getContentDescriptionExceedsMaxBadgeNumberStringResource()
  {
    return BadgeState.State.access$400(this.currentState);
  }
  
  public CharSequence getContentDescriptionNumberless()
  {
    return BadgeState.State.access$200(this.currentState);
  }
  
  public int getContentDescriptionQuantityStrings()
  {
    return BadgeState.State.access$300(this.currentState);
  }
  
  public int getHorizontalOffsetWithText()
  {
    return BadgeState.State.access$1800(this.currentState).intValue();
  }
  
  public int getHorizontalOffsetWithoutText()
  {
    return BadgeState.State.access$1600(this.currentState).intValue();
  }
  
  public int getMaxCharacterCount()
  {
    return BadgeState.State.access$600(this.currentState);
  }
  
  public int getNumber()
  {
    return BadgeState.State.access$700(this.currentState);
  }
  
  public Locale getNumberLocale()
  {
    return BadgeState.State.access$2200(this.currentState);
  }
  
  public BadgeState.State getOverridingState()
  {
    return this.overridingState;
  }
  
  public int getTextAppearanceResId()
  {
    return BadgeState.State.access$1300(this.currentState).intValue();
  }
  
  public int getVerticalOffsetWithText()
  {
    return BadgeState.State.access$1900(this.currentState).intValue();
  }
  
  public int getVerticalOffsetWithoutText()
  {
    return BadgeState.State.access$1700(this.currentState).intValue();
  }
  
  public boolean hasNumber()
  {
    BadgeState.State localState = this.currentState;
    int i = BadgeState.State.access$700(localState);
    int j = -1;
    if (i != j)
    {
      i = 1;
    }
    else
    {
      i = 0;
      localState = null;
    }
    return i;
  }
  
  public boolean isVisible()
  {
    return BadgeState.State.access$500(this.currentState).booleanValue();
  }
  
  public void setAdditionalHorizontalOffset(int paramInt)
  {
    BadgeState.State localState = this.overridingState;
    Integer localInteger1 = Integer.valueOf(paramInt);
    BadgeState.State.access$2002(localState, localInteger1);
    localState = this.currentState;
    Integer localInteger2 = Integer.valueOf(paramInt);
    BadgeState.State.access$2002(localState, localInteger2);
  }
  
  public void setAdditionalVerticalOffset(int paramInt)
  {
    BadgeState.State localState = this.overridingState;
    Integer localInteger1 = Integer.valueOf(paramInt);
    BadgeState.State.access$2102(localState, localInteger1);
    localState = this.currentState;
    Integer localInteger2 = Integer.valueOf(paramInt);
    BadgeState.State.access$2102(localState, localInteger2);
  }
  
  public void setAlpha(int paramInt)
  {
    BadgeState.State.access$102(this.overridingState, paramInt);
    BadgeState.State.access$102(this.currentState, paramInt);
  }
  
  public void setBackgroundColor(int paramInt)
  {
    BadgeState.State localState = this.overridingState;
    Integer localInteger1 = Integer.valueOf(paramInt);
    BadgeState.State.access$1202(localState, localInteger1);
    localState = this.currentState;
    Integer localInteger2 = Integer.valueOf(paramInt);
    BadgeState.State.access$1202(localState, localInteger2);
  }
  
  public void setBadgeGravity(int paramInt)
  {
    BadgeState.State localState = this.overridingState;
    Integer localInteger1 = Integer.valueOf(paramInt);
    BadgeState.State.access$1502(localState, localInteger1);
    localState = this.currentState;
    Integer localInteger2 = Integer.valueOf(paramInt);
    BadgeState.State.access$1502(localState, localInteger2);
  }
  
  public void setBadgeShapeAppearanceOverlayResId(int paramInt)
  {
    BadgeState.State localState = this.overridingState;
    Integer localInteger1 = Integer.valueOf(paramInt);
    BadgeState.State.access$902(localState, localInteger1);
    localState = this.currentState;
    Integer localInteger2 = Integer.valueOf(paramInt);
    BadgeState.State.access$902(localState, localInteger2);
  }
  
  public void setBadgeShapeAppearanceResId(int paramInt)
  {
    BadgeState.State localState = this.overridingState;
    Integer localInteger1 = Integer.valueOf(paramInt);
    BadgeState.State.access$802(localState, localInteger1);
    localState = this.currentState;
    Integer localInteger2 = Integer.valueOf(paramInt);
    BadgeState.State.access$802(localState, localInteger2);
  }
  
  public void setBadgeTextColor(int paramInt)
  {
    BadgeState.State localState = this.overridingState;
    Integer localInteger1 = Integer.valueOf(paramInt);
    BadgeState.State.access$1402(localState, localInteger1);
    localState = this.currentState;
    Integer localInteger2 = Integer.valueOf(paramInt);
    BadgeState.State.access$1402(localState, localInteger2);
  }
  
  public void setBadgeWithTextShapeAppearanceOverlayResId(int paramInt)
  {
    BadgeState.State localState = this.overridingState;
    Integer localInteger1 = Integer.valueOf(paramInt);
    BadgeState.State.access$1102(localState, localInteger1);
    localState = this.currentState;
    Integer localInteger2 = Integer.valueOf(paramInt);
    BadgeState.State.access$1102(localState, localInteger2);
  }
  
  public void setBadgeWithTextShapeAppearanceResId(int paramInt)
  {
    BadgeState.State localState = this.overridingState;
    Integer localInteger1 = Integer.valueOf(paramInt);
    BadgeState.State.access$1002(localState, localInteger1);
    localState = this.currentState;
    Integer localInteger2 = Integer.valueOf(paramInt);
    BadgeState.State.access$1002(localState, localInteger2);
  }
  
  public void setContentDescriptionExceedsMaxBadgeNumberStringResource(int paramInt)
  {
    BadgeState.State.access$402(this.overridingState, paramInt);
    BadgeState.State.access$402(this.currentState, paramInt);
  }
  
  public void setContentDescriptionNumberless(CharSequence paramCharSequence)
  {
    BadgeState.State.access$202(this.overridingState, paramCharSequence);
    BadgeState.State.access$202(this.currentState, paramCharSequence);
  }
  
  public void setContentDescriptionQuantityStringsResource(int paramInt)
  {
    BadgeState.State.access$302(this.overridingState, paramInt);
    BadgeState.State.access$302(this.currentState, paramInt);
  }
  
  public void setHorizontalOffsetWithText(int paramInt)
  {
    BadgeState.State localState = this.overridingState;
    Integer localInteger1 = Integer.valueOf(paramInt);
    BadgeState.State.access$1802(localState, localInteger1);
    localState = this.currentState;
    Integer localInteger2 = Integer.valueOf(paramInt);
    BadgeState.State.access$1802(localState, localInteger2);
  }
  
  public void setHorizontalOffsetWithoutText(int paramInt)
  {
    BadgeState.State localState = this.overridingState;
    Integer localInteger1 = Integer.valueOf(paramInt);
    BadgeState.State.access$1602(localState, localInteger1);
    localState = this.currentState;
    Integer localInteger2 = Integer.valueOf(paramInt);
    BadgeState.State.access$1602(localState, localInteger2);
  }
  
  public void setMaxCharacterCount(int paramInt)
  {
    BadgeState.State.access$602(this.overridingState, paramInt);
    BadgeState.State.access$602(this.currentState, paramInt);
  }
  
  public void setNumber(int paramInt)
  {
    BadgeState.State.access$702(this.overridingState, paramInt);
    BadgeState.State.access$702(this.currentState, paramInt);
  }
  
  public void setNumberLocale(Locale paramLocale)
  {
    BadgeState.State.access$2202(this.overridingState, paramLocale);
    BadgeState.State.access$2202(this.currentState, paramLocale);
  }
  
  public void setTextAppearanceResId(int paramInt)
  {
    BadgeState.State localState = this.overridingState;
    Integer localInteger1 = Integer.valueOf(paramInt);
    BadgeState.State.access$1302(localState, localInteger1);
    localState = this.currentState;
    Integer localInteger2 = Integer.valueOf(paramInt);
    BadgeState.State.access$1302(localState, localInteger2);
  }
  
  public void setVerticalOffsetWithText(int paramInt)
  {
    BadgeState.State localState = this.overridingState;
    Integer localInteger1 = Integer.valueOf(paramInt);
    BadgeState.State.access$1902(localState, localInteger1);
    localState = this.currentState;
    Integer localInteger2 = Integer.valueOf(paramInt);
    BadgeState.State.access$1902(localState, localInteger2);
  }
  
  public void setVerticalOffsetWithoutText(int paramInt)
  {
    BadgeState.State localState = this.overridingState;
    Integer localInteger1 = Integer.valueOf(paramInt);
    BadgeState.State.access$1702(localState, localInteger1);
    localState = this.currentState;
    Integer localInteger2 = Integer.valueOf(paramInt);
    BadgeState.State.access$1702(localState, localInteger2);
  }
  
  public void setVisible(boolean paramBoolean)
  {
    BadgeState.State localState = this.overridingState;
    Boolean localBoolean1 = Boolean.valueOf(paramBoolean);
    BadgeState.State.access$502(localState, localBoolean1);
    localState = this.currentState;
    Boolean localBoolean2 = Boolean.valueOf(paramBoolean);
    BadgeState.State.access$502(localState, localBoolean2);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.badge.BadgeState
 * JD-Core Version:    0.7.0.1
 */