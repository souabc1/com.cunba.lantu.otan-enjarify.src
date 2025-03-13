package androidx.preference;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import java.io.IOException;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Constructor;
import java.util.HashMap;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

class PreferenceInflater
{
  public static final HashMap OooO0o;
  public static final Class[] OooO0o0;
  public final Context OooO00o;
  public final Object[] OooO0O0;
  public PreferenceManager OooO0OO;
  public String[] OooO0Oo;
  
  static
  {
    Object localObject = new Class[2];
    localObject[0] = Context.class;
    localObject[1] = AttributeSet.class;
    OooO0o0 = (Class[])localObject;
    localObject = new java/util/HashMap;
    ((HashMap)localObject).<init>();
    OooO0o = (HashMap)localObject;
  }
  
  public PreferenceInflater(Context paramContext, PreferenceManager paramPreferenceManager)
  {
    Object[] arrayOfObject = new Object[2];
    this.OooO0O0 = arrayOfObject;
    this.OooO00o = paramContext;
    OooO0o0(paramPreferenceManager);
  }
  
  public static void OooO(XmlPullParser paramXmlPullParser)
  {
    int i = paramXmlPullParser.getDepth();
    int j;
    do
    {
      int k;
      do
      {
        j = paramXmlPullParser.next();
        k = 1;
        if (j == k) {
          break;
        }
        k = 3;
      } while (j != k);
      j = paramXmlPullParser.getDepth();
    } while (j > i);
  }
  
  public final Preference OooO00o(String paramString, String[] paramArrayOfString, AttributeSet paramAttributeSet)
  {
    Object localObject1 = (Constructor)OooO0o.get(paramString);
    String str1 = ": Error inflating class ";
    boolean bool = true;
    if (localObject1 == null) {}
    try
    {
      localObject1 = this.OooO00o;
      localObject1 = ((Context)localObject1).getClassLoader();
      if (paramArrayOfString != null)
      {
        int i = paramArrayOfString.length;
        if (i != 0)
        {
          i = paramArrayOfString.length;
          localClass = null;
          int j = 0;
          Object localObject2 = null;
          while (j < i)
          {
            String str2 = paramArrayOfString[j];
            try
            {
              StringBuilder localStringBuilder = new java/lang/StringBuilder;
              localStringBuilder.<init>();
              localStringBuilder.append(str2);
              localStringBuilder.append(paramString);
              str2 = localStringBuilder.toString();
              localClass = Class.forName(str2, false, (ClassLoader)localObject1);
            }
            catch (ClassNotFoundException localClassNotFoundException1)
            {
              j += 1;
            }
          }
          if (localClass != null) {
            break label217;
          }
          if (localClassNotFoundException1 == null)
          {
            paramArrayOfString = new android/view/InflateException;
            localObject1 = new java/lang/StringBuilder;
            ((StringBuilder)localObject1).<init>();
            localObject3 = paramAttributeSet.getPositionDescription();
            ((StringBuilder)localObject1).append((String)localObject3);
            ((StringBuilder)localObject1).append(str1);
            ((StringBuilder)localObject1).append(paramString);
            localObject1 = ((StringBuilder)localObject1).toString();
            paramArrayOfString.<init>((String)localObject1);
            throw paramArrayOfString;
          }
          throw localClassNotFoundException1;
        }
      }
      Class localClass = Class.forName(paramString, false, (ClassLoader)localObject1);
      label217:
      paramArrayOfString = OooO0o0;
      localObject1 = localClass.getConstructor(paramArrayOfString);
      ((AccessibleObject)localObject1).setAccessible(bool);
      paramArrayOfString = OooO0o;
      paramArrayOfString.put(paramString, localObject1);
      paramArrayOfString = this.OooO0O0;
      paramArrayOfString[bool] = paramAttributeSet;
      paramArrayOfString = ((Constructor)localObject1).newInstance(paramArrayOfString);
      return (Preference)paramArrayOfString;
    }
    catch (Exception paramArrayOfString)
    {
      localObject1 = new android/view/InflateException;
      Object localObject3 = new java/lang/StringBuilder;
      ((StringBuilder)localObject3).<init>();
      paramAttributeSet = paramAttributeSet.getPositionDescription();
      ((StringBuilder)localObject3).append(paramAttributeSet);
      ((StringBuilder)localObject3).append(str1);
      ((StringBuilder)localObject3).append(paramString);
      paramString = ((StringBuilder)localObject3).toString();
      ((InflateException)localObject1).<init>(paramString);
      ((Throwable)localObject1).initCause(paramArrayOfString);
      throw ((Throwable)localObject1);
    }
    catch (ClassNotFoundException localClassNotFoundException2)
    {
      throw localClassNotFoundException2;
    }
  }
  
  public final Preference OooO0O0(String paramString, AttributeSet paramAttributeSet)
  {
    int i = 46;
    try
    {
      i = paramString.indexOf(i);
      int j = -1;
      if (j == i)
      {
        paramString = OooO0o(paramString, paramAttributeSet);
      }
      else
      {
        i = 0;
        Object localObject = null;
        paramString = OooO00o(paramString, null, paramAttributeSet);
      }
      return paramString;
    }
    catch (Exception localException)
    {
      localInflateException1 = new android/view/InflateException;
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      paramAttributeSet = paramAttributeSet.getPositionDescription();
      localStringBuilder.append(paramAttributeSet);
      localStringBuilder.append(": Error inflating class ");
      localStringBuilder.append(paramString);
      paramString = localStringBuilder.toString();
      localInflateException1.<init>(paramString);
      localInflateException1.initCause(localException);
      throw localInflateException1;
    }
    catch (ClassNotFoundException localClassNotFoundException)
    {
      InflateException localInflateException1 = new android/view/InflateException;
      StringBuilder localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      paramAttributeSet = paramAttributeSet.getPositionDescription();
      localStringBuilder.append(paramAttributeSet);
      localStringBuilder.append(": Error inflating class (not found)");
      localStringBuilder.append(paramString);
      paramString = localStringBuilder.toString();
      localInflateException1.<init>(paramString);
      localInflateException1.initCause(localClassNotFoundException);
      throw localInflateException1;
    }
    catch (InflateException localInflateException2)
    {
      throw localInflateException2;
    }
  }
  
  public Preference OooO0OO(int paramInt, PreferenceGroup paramPreferenceGroup)
  {
    Resources localResources = getContext().getResources();
    XmlResourceParser localXmlResourceParser = localResources.getXml(paramInt);
    try
    {
      paramPreferenceGroup = OooO0Oo(localXmlResourceParser, paramPreferenceGroup);
      return paramPreferenceGroup;
    }
    finally
    {
      localXmlResourceParser.close();
    }
  }
  
  public Preference OooO0Oo(XmlPullParser paramXmlPullParser, PreferenceGroup paramPreferenceGroup)
  {
    synchronized (this.OooO0O0)
    {
      Object localObject1 = Xml.asAttributeSet(paramXmlPullParser);
      Object localObject2 = this.OooO0O0;
      Context localContext = this.OooO00o;
      int i = 0;
      localObject2[0] = localContext;
      try
      {
        int j;
        int k;
        do
        {
          j = paramXmlPullParser.next();
          k = 2;
          if (j == k) {
            break;
          }
          i = 1;
        } while (j != i);
        if (j == k)
        {
          localObject2 = paramXmlPullParser.getName();
          localObject2 = OooO0O0((String)localObject2, (AttributeSet)localObject1);
          localObject2 = (PreferenceGroup)localObject2;
          paramPreferenceGroup = OooO0oO(paramPreferenceGroup, (PreferenceGroup)localObject2);
          OooO0oo(paramXmlPullParser, paramPreferenceGroup, (AttributeSet)localObject1);
          return paramPreferenceGroup;
        }
        paramPreferenceGroup = new android/view/InflateException;
        localObject1 = new java/lang/StringBuilder;
        ((StringBuilder)localObject1).<init>();
        localObject2 = paramXmlPullParser.getPositionDescription();
        ((StringBuilder)localObject1).append((String)localObject2);
        localObject2 = ": No start tag found!";
        ((StringBuilder)localObject1).append((String)localObject2);
        localObject1 = ((StringBuilder)localObject1).toString();
        paramPreferenceGroup.<init>((String)localObject1);
        throw paramPreferenceGroup;
      }
      catch (IOException paramPreferenceGroup)
      {
        localObject1 = new android/view/InflateException;
        localObject2 = new java/lang/StringBuilder;
        ((StringBuilder)localObject2).<init>();
        paramXmlPullParser = paramXmlPullParser.getPositionDescription();
        ((StringBuilder)localObject2).append(paramXmlPullParser);
        paramXmlPullParser = ": ";
        ((StringBuilder)localObject2).append(paramXmlPullParser);
        paramXmlPullParser = paramPreferenceGroup.getMessage();
        ((StringBuilder)localObject2).append(paramXmlPullParser);
        paramXmlPullParser = ((StringBuilder)localObject2).toString();
        ((InflateException)localObject1).<init>(paramXmlPullParser);
        ((Throwable)localObject1).initCause(paramPreferenceGroup);
        throw ((Throwable)localObject1);
      }
      catch (XmlPullParserException paramXmlPullParser)
      {
        paramPreferenceGroup = new android/view/InflateException;
        localObject1 = paramXmlPullParser.getMessage();
        paramPreferenceGroup.<init>((String)localObject1);
        paramPreferenceGroup.initCause(paramXmlPullParser);
        throw paramPreferenceGroup;
      }
      catch (InflateException paramXmlPullParser)
      {
        throw paramXmlPullParser;
      }
    }
  }
  
  public Preference OooO0o(String paramString, AttributeSet paramAttributeSet)
  {
    String[] arrayOfString = this.OooO0Oo;
    return OooO00o(paramString, arrayOfString, paramAttributeSet);
  }
  
  public final void OooO0o0(PreferenceManager paramPreferenceManager)
  {
    this.OooO0OO = paramPreferenceManager;
    paramPreferenceManager = new java/lang/StringBuilder;
    paramPreferenceManager.<init>();
    String str1 = Preference.class.getPackage().getName();
    paramPreferenceManager.append(str1);
    str1 = ".";
    paramPreferenceManager.append(str1);
    paramPreferenceManager = paramPreferenceManager.toString();
    StringBuilder localStringBuilder = new java/lang/StringBuilder;
    localStringBuilder.<init>();
    String str2 = SwitchPreference.class.getPackage().getName();
    localStringBuilder.append(str2);
    localStringBuilder.append(str1);
    str1 = localStringBuilder.toString();
    paramPreferenceManager = new String[] { paramPreferenceManager, str1 };
    setDefaultPackages(paramPreferenceManager);
  }
  
  public final PreferenceGroup OooO0oO(PreferenceGroup paramPreferenceGroup1, PreferenceGroup paramPreferenceGroup2)
  {
    if (paramPreferenceGroup1 == null)
    {
      paramPreferenceGroup1 = this.OooO0OO;
      paramPreferenceGroup2.OooOOo(paramPreferenceGroup1);
      return paramPreferenceGroup2;
    }
    return paramPreferenceGroup1;
  }
  
  public final void OooO0oo(XmlPullParser paramXmlPullParser, Preference paramPreference, AttributeSet paramAttributeSet)
  {
    int i = paramXmlPullParser.getDepth();
    for (;;)
    {
      int j = paramXmlPullParser.next();
      int k = 3;
      if (j == k)
      {
        k = paramXmlPullParser.getDepth();
        if (k <= i) {
          break;
        }
      }
      k = 1;
      if (j == k) {
        break;
      }
      k = 2;
      if (j == k)
      {
        Object localObject1 = paramXmlPullParser.getName();
        Object localObject2 = "intent";
        boolean bool1 = ((String)localObject2).equals(localObject1);
        String str = "Error parsing preference";
        if (bool1)
        {
          try
          {
            localObject1 = getContext();
            localObject1 = ((Context)localObject1).getResources();
            localObject1 = Intent.parseIntent((Resources)localObject1, paramXmlPullParser, paramAttributeSet);
            paramPreference.setIntent((Intent)localObject1);
          }
          catch (IOException paramXmlPullParser)
          {
            paramPreference = new org/xmlpull/v1/XmlPullParserException;
            paramPreference.<init>(str);
            paramPreference.initCause(paramXmlPullParser);
            throw paramPreference;
          }
        }
        else
        {
          localObject2 = "extra";
          boolean bool2 = ((String)localObject2).equals(localObject1);
          if (bool2)
          {
            localObject1 = getContext().getResources();
            Bundle localBundle = paramPreference.getExtras();
            ((Resources)localObject1).parseBundleExtra((String)localObject2, paramAttributeSet, localBundle);
            try
            {
              OooO(paramXmlPullParser);
            }
            catch (IOException paramXmlPullParser)
            {
              paramPreference = new org/xmlpull/v1/XmlPullParserException;
              paramPreference.<init>(str);
              paramPreference.initCause(paramXmlPullParser);
              throw paramPreference;
            }
          }
          else
          {
            localObject1 = OooO0O0((String)localObject1, paramAttributeSet);
            localObject2 = paramPreference;
            localObject2 = (PreferenceGroup)paramPreference;
            ((PreferenceGroup)localObject2).OoooOOo((Preference)localObject1);
            OooO0oo(paramXmlPullParser, (Preference)localObject1, paramAttributeSet);
          }
        }
      }
    }
  }
  
  public Context getContext()
  {
    return this.OooO00o;
  }
  
  public String[] getDefaultPackages()
  {
    return this.OooO0Oo;
  }
  
  public void setDefaultPackages(String[] paramArrayOfString)
  {
    this.OooO0Oo = paramArrayOfString;
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.preference.PreferenceInflater
 * JD-Core Version:    0.7.0.1
 */