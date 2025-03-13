package com.google.android.material.badge;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.io.Serializable;
import java.util.Locale;

public final class BadgeState$State
  implements Parcelable
{
  private static final int BADGE_NUMBER_NONE = 255;
  public static final Parcelable.Creator CREATOR;
  private static final int NOT_SET = 254;
  private Integer additionalHorizontalOffset;
  private Integer additionalVerticalOffset;
  private int alpha = 255;
  private Integer backgroundColor;
  private Integer badgeGravity;
  private int badgeResId;
  private Integer badgeShapeAppearanceOverlayResId;
  private Integer badgeShapeAppearanceResId;
  private Integer badgeTextAppearanceResId;
  private Integer badgeTextColor;
  private Integer badgeWithTextShapeAppearanceOverlayResId;
  private Integer badgeWithTextShapeAppearanceResId;
  private int contentDescriptionExceedsMaxBadgeNumberRes;
  private CharSequence contentDescriptionNumberless;
  private int contentDescriptionQuantityStrings;
  private Integer horizontalOffsetWithText;
  private Integer horizontalOffsetWithoutText;
  private Boolean isVisible;
  private int maxCharacterCount;
  private int number;
  private Locale numberLocale;
  private Integer verticalOffsetWithText;
  private Integer verticalOffsetWithoutText;
  
  static
  {
    BadgeState.State.1 local1 = new com/google/android/material/badge/BadgeState$State$1;
    local1.<init>();
    CREATOR = local1;
  }
  
  public BadgeState$State()
  {
    int i = -2;
    this.number = i;
    this.maxCharacterCount = i;
    Boolean localBoolean = Boolean.TRUE;
    this.isVisible = localBoolean;
  }
  
  public BadgeState$State(Parcel paramParcel)
  {
    int i = -2;
    this.number = i;
    this.maxCharacterCount = i;
    Object localObject = Boolean.TRUE;
    this.isVisible = ((Boolean)localObject);
    i = paramParcel.readInt();
    this.badgeResId = i;
    localObject = (Integer)paramParcel.readSerializable();
    this.backgroundColor = ((Integer)localObject);
    localObject = (Integer)paramParcel.readSerializable();
    this.badgeTextColor = ((Integer)localObject);
    localObject = (Integer)paramParcel.readSerializable();
    this.badgeTextAppearanceResId = ((Integer)localObject);
    localObject = (Integer)paramParcel.readSerializable();
    this.badgeShapeAppearanceResId = ((Integer)localObject);
    localObject = (Integer)paramParcel.readSerializable();
    this.badgeShapeAppearanceOverlayResId = ((Integer)localObject);
    localObject = (Integer)paramParcel.readSerializable();
    this.badgeWithTextShapeAppearanceResId = ((Integer)localObject);
    localObject = (Integer)paramParcel.readSerializable();
    this.badgeWithTextShapeAppearanceOverlayResId = ((Integer)localObject);
    i = paramParcel.readInt();
    this.alpha = i;
    i = paramParcel.readInt();
    this.number = i;
    i = paramParcel.readInt();
    this.maxCharacterCount = i;
    localObject = paramParcel.readString();
    this.contentDescriptionNumberless = ((CharSequence)localObject);
    i = paramParcel.readInt();
    this.contentDescriptionQuantityStrings = i;
    localObject = (Integer)paramParcel.readSerializable();
    this.badgeGravity = ((Integer)localObject);
    localObject = (Integer)paramParcel.readSerializable();
    this.horizontalOffsetWithoutText = ((Integer)localObject);
    localObject = (Integer)paramParcel.readSerializable();
    this.verticalOffsetWithoutText = ((Integer)localObject);
    localObject = (Integer)paramParcel.readSerializable();
    this.horizontalOffsetWithText = ((Integer)localObject);
    localObject = (Integer)paramParcel.readSerializable();
    this.verticalOffsetWithText = ((Integer)localObject);
    localObject = (Integer)paramParcel.readSerializable();
    this.additionalHorizontalOffset = ((Integer)localObject);
    localObject = (Integer)paramParcel.readSerializable();
    this.additionalVerticalOffset = ((Integer)localObject);
    localObject = (Boolean)paramParcel.readSerializable();
    this.isVisible = ((Boolean)localObject);
    paramParcel = (Locale)paramParcel.readSerializable();
    this.numberLocale = paramParcel;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramInt = this.badgeResId;
    paramParcel.writeInt(paramInt);
    Object localObject = this.backgroundColor;
    paramParcel.writeSerializable((Serializable)localObject);
    localObject = this.badgeTextColor;
    paramParcel.writeSerializable((Serializable)localObject);
    localObject = this.badgeTextAppearanceResId;
    paramParcel.writeSerializable((Serializable)localObject);
    localObject = this.badgeShapeAppearanceResId;
    paramParcel.writeSerializable((Serializable)localObject);
    localObject = this.badgeShapeAppearanceOverlayResId;
    paramParcel.writeSerializable((Serializable)localObject);
    localObject = this.badgeWithTextShapeAppearanceResId;
    paramParcel.writeSerializable((Serializable)localObject);
    localObject = this.badgeWithTextShapeAppearanceOverlayResId;
    paramParcel.writeSerializable((Serializable)localObject);
    paramInt = this.alpha;
    paramParcel.writeInt(paramInt);
    paramInt = this.number;
    paramParcel.writeInt(paramInt);
    paramInt = this.maxCharacterCount;
    paramParcel.writeInt(paramInt);
    localObject = this.contentDescriptionNumberless;
    if (localObject == null)
    {
      paramInt = 0;
      localObject = null;
    }
    else
    {
      localObject = ((CharSequence)localObject).toString();
    }
    paramParcel.writeString((String)localObject);
    paramInt = this.contentDescriptionQuantityStrings;
    paramParcel.writeInt(paramInt);
    localObject = this.badgeGravity;
    paramParcel.writeSerializable((Serializable)localObject);
    localObject = this.horizontalOffsetWithoutText;
    paramParcel.writeSerializable((Serializable)localObject);
    localObject = this.verticalOffsetWithoutText;
    paramParcel.writeSerializable((Serializable)localObject);
    localObject = this.horizontalOffsetWithText;
    paramParcel.writeSerializable((Serializable)localObject);
    localObject = this.verticalOffsetWithText;
    paramParcel.writeSerializable((Serializable)localObject);
    localObject = this.additionalHorizontalOffset;
    paramParcel.writeSerializable((Serializable)localObject);
    localObject = this.additionalVerticalOffset;
    paramParcel.writeSerializable((Serializable)localObject);
    localObject = this.isVisible;
    paramParcel.writeSerializable((Serializable)localObject);
    localObject = this.numberLocale;
    paramParcel.writeSerializable((Serializable)localObject);
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     com.google.android.material.badge.BadgeState.State
 * JD-Core Version:    0.7.0.1
 */