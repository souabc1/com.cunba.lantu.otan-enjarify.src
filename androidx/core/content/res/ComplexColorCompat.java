package androidx.core.content.res;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public final class ComplexColorCompat
{
  public final Shader OooO00o;
  public final ColorStateList OooO0O0;
  public int OooO0OO;
  
  public ComplexColorCompat(Shader paramShader, ColorStateList paramColorStateList, int paramInt)
  {
    this.OooO00o = paramShader;
    this.OooO0O0 = paramColorStateList;
    this.OooO0OO = paramInt;
  }
  
  public static ComplexColorCompat OooO00o(Resources paramResources, int paramInt, Resources.Theme paramTheme)
  {
    Object localObject = paramResources.getXml(paramInt);
    AttributeSet localAttributeSet = Xml.asAttributeSet((XmlPullParser)localObject);
    int i;
    int j;
    int k;
    do
    {
      i = ((XmlPullParser)localObject).next();
      j = 2;
      if (i == j) {
        break;
      }
      k = 1;
    } while (i != k);
    if (i == j)
    {
      String str1 = ((XmlPullParser)localObject).getName();
      str1.hashCode();
      String str2 = "gradient";
      boolean bool = str1.equals(str2);
      if (!bool)
      {
        str2 = "selector";
        bool = str1.equals(str2);
        if (bool) {
          return OooO0OO(ColorStateListInflaterCompat.OooO0O0(paramResources, (XmlPullParser)localObject, localAttributeSet, paramTheme));
        }
        paramResources = new org/xmlpull/v1/XmlPullParserException;
        paramTheme = new java/lang/StringBuilder;
        paramTheme.<init>();
        localObject = ((XmlPullParser)localObject).getPositionDescription();
        paramTheme.append((String)localObject);
        paramTheme.append(": unsupported complex color tag ");
        paramTheme.append(str1);
        localObject = paramTheme.toString();
        paramResources.<init>((String)localObject);
        throw paramResources;
      }
      return OooO0Oo(GradientColorInflaterCompat.OooO0O0(paramResources, (XmlPullParser)localObject, localAttributeSet, paramTheme));
    }
    paramResources = new org/xmlpull/v1/XmlPullParserException;
    paramResources.<init>("No start tag found");
    throw paramResources;
  }
  
  public static ComplexColorCompat OooO0O0(int paramInt)
  {
    ComplexColorCompat localComplexColorCompat = new androidx/core/content/res/ComplexColorCompat;
    localComplexColorCompat.<init>(null, null, paramInt);
    return localComplexColorCompat;
  }
  
  public static ComplexColorCompat OooO0OO(ColorStateList paramColorStateList)
  {
    ComplexColorCompat localComplexColorCompat = new androidx/core/content/res/ComplexColorCompat;
    int i = paramColorStateList.getDefaultColor();
    localComplexColorCompat.<init>(null, paramColorStateList, i);
    return localComplexColorCompat;
  }
  
  public static ComplexColorCompat OooO0Oo(Shader paramShader)
  {
    ComplexColorCompat localComplexColorCompat = new androidx/core/content/res/ComplexColorCompat;
    localComplexColorCompat.<init>(paramShader, null, 0);
    return localComplexColorCompat;
  }
  
  public static ComplexColorCompat OooO0o0(Resources paramResources, int paramInt, Resources.Theme paramTheme)
  {
    try
    {
      return OooO00o(paramResources, paramInt, paramTheme);
    }
    catch (Exception localException) {}
    return null;
  }
  
  public boolean OooO0o(int[] paramArrayOfInt)
  {
    boolean bool = isStateful();
    if (bool)
    {
      ColorStateList localColorStateList = this.OooO0O0;
      int j = localColorStateList.getDefaultColor();
      k = localColorStateList.getColorForState(paramArrayOfInt, j);
      int i = this.OooO0OO;
      if (k != i)
      {
        this.OooO0OO = k;
        k = 1;
        break label57;
      }
    }
    int k = 0;
    paramArrayOfInt = null;
    label57:
    return k;
  }
  
  public boolean OooO0oO()
  {
    boolean bool = isGradient();
    if (!bool)
    {
      i = this.OooO0OO;
      if (i == 0) {
        return 0;
      }
    }
    int i = 1;
    return i;
  }
  
  public int getColor()
  {
    return this.OooO0OO;
  }
  
  public Shader getShader()
  {
    return this.OooO00o;
  }
  
  public boolean isGradient()
  {
    Shader localShader = this.OooO00o;
    boolean bool;
    if (localShader != null)
    {
      bool = true;
    }
    else
    {
      bool = false;
      localShader = null;
    }
    return bool;
  }
  
  public boolean isStateful()
  {
    Object localObject = this.OooO00o;
    if (localObject == null)
    {
      localObject = this.OooO0O0;
      if (localObject != null)
      {
        bool = ((ColorStateList)localObject).isStateful();
        if (bool) {
          return true;
        }
      }
    }
    boolean bool = false;
    localObject = null;
    return bool;
  }
  
  public void setColor(int paramInt)
  {
    this.OooO0OO = paramInt;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.core.content.res.ComplexColorCompat
 * JD-Core Version:    0.7.0.1
 */