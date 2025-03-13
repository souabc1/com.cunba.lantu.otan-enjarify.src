package androidx.appcompat.widget;

import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Movie;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import androidx.appcompat.resources.Compatibility.Api15Impl;
import androidx.core.content.res.ResourcesCompat;
import java.io.InputStream;

class ResourcesWrapper
  extends Resources
{
  public final Resources OooO00o;
  
  public ResourcesWrapper(Resources paramResources)
  {
    super(localAssetManager, localDisplayMetrics, localConfiguration);
    this.OooO00o = paramResources;
  }
  
  public XmlResourceParser getAnimation(int paramInt)
  {
    return this.OooO00o.getAnimation(paramInt);
  }
  
  public boolean getBoolean(int paramInt)
  {
    return this.OooO00o.getBoolean(paramInt);
  }
  
  public int getColor(int paramInt)
  {
    return this.OooO00o.getColor(paramInt);
  }
  
  public ColorStateList getColorStateList(int paramInt)
  {
    return this.OooO00o.getColorStateList(paramInt);
  }
  
  public Configuration getConfiguration()
  {
    return this.OooO00o.getConfiguration();
  }
  
  public float getDimension(int paramInt)
  {
    return this.OooO00o.getDimension(paramInt);
  }
  
  public int getDimensionPixelOffset(int paramInt)
  {
    return this.OooO00o.getDimensionPixelOffset(paramInt);
  }
  
  public int getDimensionPixelSize(int paramInt)
  {
    return this.OooO00o.getDimensionPixelSize(paramInt);
  }
  
  public DisplayMetrics getDisplayMetrics()
  {
    return this.OooO00o.getDisplayMetrics();
  }
  
  public Drawable getDrawable(int paramInt)
  {
    return this.OooO00o.getDrawable(paramInt);
  }
  
  public Drawable getDrawable(int paramInt, Resources.Theme paramTheme)
  {
    return ResourcesCompat.OooO0o0(this.OooO00o, paramInt, paramTheme);
  }
  
  public final Drawable getDrawableCanonical(int paramInt)
  {
    return super.getDrawable(paramInt);
  }
  
  public Drawable getDrawableForDensity(int paramInt1, int paramInt2)
  {
    return ResourcesCompat.OooO0o(this.OooO00o, paramInt1, paramInt2, null);
  }
  
  public Drawable getDrawableForDensity(int paramInt1, int paramInt2, Resources.Theme paramTheme)
  {
    return ResourcesCompat.OooO0o(this.OooO00o, paramInt1, paramInt2, paramTheme);
  }
  
  public float getFraction(int paramInt1, int paramInt2, int paramInt3)
  {
    return this.OooO00o.getFraction(paramInt1, paramInt2, paramInt3);
  }
  
  public int getIdentifier(String paramString1, String paramString2, String paramString3)
  {
    return this.OooO00o.getIdentifier(paramString1, paramString2, paramString3);
  }
  
  public int[] getIntArray(int paramInt)
  {
    return this.OooO00o.getIntArray(paramInt);
  }
  
  public int getInteger(int paramInt)
  {
    return this.OooO00o.getInteger(paramInt);
  }
  
  public XmlResourceParser getLayout(int paramInt)
  {
    return this.OooO00o.getLayout(paramInt);
  }
  
  public Movie getMovie(int paramInt)
  {
    return this.OooO00o.getMovie(paramInt);
  }
  
  public String getQuantityString(int paramInt1, int paramInt2)
  {
    return this.OooO00o.getQuantityString(paramInt1, paramInt2);
  }
  
  public String getQuantityString(int paramInt1, int paramInt2, Object... paramVarArgs)
  {
    return this.OooO00o.getQuantityString(paramInt1, paramInt2, paramVarArgs);
  }
  
  public CharSequence getQuantityText(int paramInt1, int paramInt2)
  {
    return this.OooO00o.getQuantityText(paramInt1, paramInt2);
  }
  
  public String getResourceEntryName(int paramInt)
  {
    return this.OooO00o.getResourceEntryName(paramInt);
  }
  
  public String getResourceName(int paramInt)
  {
    return this.OooO00o.getResourceName(paramInt);
  }
  
  public String getResourcePackageName(int paramInt)
  {
    return this.OooO00o.getResourcePackageName(paramInt);
  }
  
  public String getResourceTypeName(int paramInt)
  {
    return this.OooO00o.getResourceTypeName(paramInt);
  }
  
  public String getString(int paramInt)
  {
    return this.OooO00o.getString(paramInt);
  }
  
  public String getString(int paramInt, Object... paramVarArgs)
  {
    return this.OooO00o.getString(paramInt, paramVarArgs);
  }
  
  public String[] getStringArray(int paramInt)
  {
    return this.OooO00o.getStringArray(paramInt);
  }
  
  public CharSequence getText(int paramInt)
  {
    return this.OooO00o.getText(paramInt);
  }
  
  public CharSequence getText(int paramInt, CharSequence paramCharSequence)
  {
    return this.OooO00o.getText(paramInt, paramCharSequence);
  }
  
  public CharSequence[] getTextArray(int paramInt)
  {
    return this.OooO00o.getTextArray(paramInt);
  }
  
  public void getValue(int paramInt, TypedValue paramTypedValue, boolean paramBoolean)
  {
    this.OooO00o.getValue(paramInt, paramTypedValue, paramBoolean);
  }
  
  public void getValue(String paramString, TypedValue paramTypedValue, boolean paramBoolean)
  {
    this.OooO00o.getValue(paramString, paramTypedValue, paramBoolean);
  }
  
  public void getValueForDensity(int paramInt1, int paramInt2, TypedValue paramTypedValue, boolean paramBoolean)
  {
    Compatibility.Api15Impl.OooO00o(this.OooO00o, paramInt1, paramInt2, paramTypedValue, paramBoolean);
  }
  
  public XmlResourceParser getXml(int paramInt)
  {
    return this.OooO00o.getXml(paramInt);
  }
  
  public TypedArray obtainAttributes(AttributeSet paramAttributeSet, int[] paramArrayOfInt)
  {
    return this.OooO00o.obtainAttributes(paramAttributeSet, paramArrayOfInt);
  }
  
  public TypedArray obtainTypedArray(int paramInt)
  {
    return this.OooO00o.obtainTypedArray(paramInt);
  }
  
  public InputStream openRawResource(int paramInt)
  {
    return this.OooO00o.openRawResource(paramInt);
  }
  
  public InputStream openRawResource(int paramInt, TypedValue paramTypedValue)
  {
    return this.OooO00o.openRawResource(paramInt, paramTypedValue);
  }
  
  public AssetFileDescriptor openRawResourceFd(int paramInt)
  {
    return this.OooO00o.openRawResourceFd(paramInt);
  }
  
  public void parseBundleExtra(String paramString, AttributeSet paramAttributeSet, Bundle paramBundle)
  {
    this.OooO00o.parseBundleExtra(paramString, paramAttributeSet, paramBundle);
  }
  
  public void parseBundleExtras(XmlResourceParser paramXmlResourceParser, Bundle paramBundle)
  {
    this.OooO00o.parseBundleExtras(paramXmlResourceParser, paramBundle);
  }
  
  public void updateConfiguration(Configuration paramConfiguration, DisplayMetrics paramDisplayMetrics)
  {
    super.updateConfiguration(paramConfiguration, paramDisplayMetrics);
    Resources localResources = this.OooO00o;
    if (localResources != null) {
      localResources.updateConfiguration(paramConfiguration, paramDisplayMetrics);
    }
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.appcompat.widget.ResourcesWrapper
 * JD-Core Version:    0.7.0.1
 */