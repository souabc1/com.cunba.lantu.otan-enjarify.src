package androidx.constraintlayout.motion.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintAttribute;
import androidx.constraintlayout.widget.ConstraintLayout.LayoutParams;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

public class KeyFrames
{
  public static HashMap OooO0O0;
  public HashMap OooO00o;
  
  static
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    OooO0O0 = localHashMap;
    String str = "KeyAttribute";
    Object localObject = KeyAttributes.class;
    Class[] arrayOfClass1 = null;
    try
    {
      Class[] arrayOfClass2 = new Class[0];
      localObject = ((Class)localObject).getConstructor(arrayOfClass2);
      localHashMap.put(str, localObject);
      localHashMap = OooO0O0;
      str = "KeyPosition";
      localObject = KeyPosition.class;
      arrayOfClass2 = new Class[0];
      localObject = ((Class)localObject).getConstructor(arrayOfClass2);
      localHashMap.put(str, localObject);
      localHashMap = OooO0O0;
      str = "KeyCycle";
      localObject = KeyCycle.class;
      arrayOfClass2 = new Class[0];
      localObject = ((Class)localObject).getConstructor(arrayOfClass2);
      localHashMap.put(str, localObject);
      localHashMap = OooO0O0;
      str = "KeyTimeCycle";
      localObject = KeyTimeCycle.class;
      arrayOfClass2 = new Class[0];
      localObject = ((Class)localObject).getConstructor(arrayOfClass2);
      localHashMap.put(str, localObject);
      localHashMap = OooO0O0;
      str = "KeyTrigger";
      localObject = KeyTrigger.class;
      arrayOfClass1 = new Class[0];
      localObject = ((Class)localObject).getConstructor(arrayOfClass1);
      localHashMap.put(str, localObject);
      label158:
      return;
    }
    catch (NoSuchMethodException localNoSuchMethodException)
    {
      break label158;
    }
  }
  
  public KeyFrames()
  {
    HashMap localHashMap = new java/util/HashMap;
    localHashMap.<init>();
    this.OooO00o = localHashMap;
  }
  
  public KeyFrames(Context paramContext, XmlPullParser paramXmlPullParser)
  {
    Object localObject1 = new java/util/HashMap;
    ((HashMap)localObject1).<init>();
    this.OooO00o = ((HashMap)localObject1);
    for (;;)
    {
      try
      {
        int i = paramXmlPullParser.getEventType();
        Object localObject2 = null;
        int k = 1;
        if (i != k)
        {
          k = 2;
          Object localObject3;
          boolean bool1;
          if (i != k)
          {
            k = 3;
            if (i == k)
            {
              localObject1 = "KeyFrameSet";
              localObject3 = paramXmlPullParser.getName();
              bool1 = ((String)localObject1).equals(localObject3);
              if (!bool1) {}
            }
          }
          else
          {
            localObject1 = paramXmlPullParser.getName();
            localObject3 = OooO0O0;
            boolean bool2 = ((HashMap)localObject3).containsKey(localObject1);
            if (bool2) {}
            StringBuilder localStringBuilder;
            String str;
            try
            {
              localObject3 = OooO0O0;
              localObject3 = ((HashMap)localObject3).get(localObject1);
              localObject3 = (Constructor)localObject3;
              if (localObject3 != null)
              {
                bool1 = false;
                localObject1 = null;
                localObject1 = new Object[0];
                localObject1 = ((Constructor)localObject3).newInstance((Object[])localObject1);
                localObject1 = (Key)localObject1;
              }
            }
            catch (Exception localException1) {}
          }
        }
      }
      catch (IOException paramContext)
      {
        int j;
        paramContext.printStackTrace();
      }
      catch (XmlPullParserException paramContext)
      {
        paramContext.printStackTrace();
      }
      try
      {
        localObject2 = Xml.asAttributeSet(paramXmlPullParser);
        ((Key)localObject1).OooO0o0(paramContext, (AttributeSet)localObject2);
        OooO0OO((Key)localObject1);
      }
      catch (Exception localException2)
      {
        continue;
      }
      localObject2 = localObject1;
      continue;
      localObject3 = new java/lang/NullPointerException;
      localStringBuilder = new java/lang/StringBuilder;
      localStringBuilder.<init>();
      str = "Keymaker for ";
      localStringBuilder.append(str);
      localStringBuilder.append((String)localObject1);
      localObject1 = " not found";
      localStringBuilder.append((String)localObject1);
      localObject1 = localStringBuilder.toString();
      ((NullPointerException)localObject3).<init>((String)localObject1);
      throw ((Throwable)localObject3);
      localObject3 = "CustomAttribute";
      bool2 = ((String)localObject1).equalsIgnoreCase((String)localObject3);
      if (bool2)
      {
        if (localObject2 != null)
        {
          localObject1 = ((Key)localObject2).OooO0o0;
          if (localObject1 != null) {
            ConstraintAttribute.OooO0o(paramContext, paramXmlPullParser, (HashMap)localObject1);
          }
        }
      }
      else
      {
        localObject3 = "CustomMethod";
        bool1 = ((String)localObject1).equalsIgnoreCase((String)localObject3);
        if ((bool1) && (localObject2 != null))
        {
          localObject1 = ((Key)localObject2).OooO0o0;
          if (localObject1 != null) {
            continue;
          }
        }
      }
      j = paramXmlPullParser.next();
    }
  }
  
  public void OooO00o(MotionController paramMotionController)
  {
    Object localObject = this.OooO00o;
    int i = -1;
    Integer localInteger = Integer.valueOf(i);
    localObject = (ArrayList)((HashMap)localObject).get(localInteger);
    if (localObject != null) {
      paramMotionController.OooO0O0((ArrayList)localObject);
    }
  }
  
  public void OooO0O0(MotionController paramMotionController)
  {
    Object localObject1 = this.OooO00o;
    int i = paramMotionController.OooO0OO;
    Object localObject2 = Integer.valueOf(i);
    localObject1 = (ArrayList)((HashMap)localObject1).get(localObject2);
    if (localObject1 != null) {
      paramMotionController.OooO0O0((ArrayList)localObject1);
    }
    localObject1 = this.OooO00o;
    i = -1;
    localObject2 = Integer.valueOf(i);
    localObject1 = (ArrayList)((HashMap)localObject1).get(localObject2);
    if (localObject1 != null)
    {
      localObject1 = ((ArrayList)localObject1).iterator();
      for (;;)
      {
        boolean bool1 = ((Iterator)localObject1).hasNext();
        if (!bool1) {
          break;
        }
        localObject2 = (Key)((Iterator)localObject1).next();
        String str = ((ConstraintLayout.LayoutParams)paramMotionController.OooO0O0.getLayoutParams()).Ooooo0o;
        boolean bool2 = ((Key)localObject2).OooO0o(str);
        if (bool2) {
          paramMotionController.OooO00o((Key)localObject2);
        }
      }
    }
  }
  
  public void OooO0OO(Key paramKey)
  {
    Object localObject = this.OooO00o;
    int i = paramKey.OooO0O0;
    Integer localInteger = Integer.valueOf(i);
    boolean bool = ((HashMap)localObject).containsKey(localInteger);
    if (!bool)
    {
      localObject = this.OooO00o;
      i = paramKey.OooO0O0;
      localInteger = Integer.valueOf(i);
      ArrayList localArrayList = new java/util/ArrayList;
      localArrayList.<init>();
      ((HashMap)localObject).put(localInteger, localArrayList);
    }
    localObject = this.OooO00o;
    i = paramKey.OooO0O0;
    localInteger = Integer.valueOf(i);
    localObject = (ArrayList)((HashMap)localObject).get(localInteger);
    if (localObject != null) {
      ((ArrayList)localObject).add(paramKey);
    }
  }
  
  public ArrayList getKeyFramesForView(int paramInt)
  {
    HashMap localHashMap = this.OooO00o;
    Integer localInteger = Integer.valueOf(paramInt);
    return (ArrayList)localHashMap.get(localInteger);
  }
  
  public Set getKeys()
  {
    return this.OooO00o.keySet();
  }
}


/* Location:           G:\apknx\enjarify-master\com.cunba.lantu.otan-enjarify.jar
 * Qualified Name:     androidx.constraintlayout.motion.widget.KeyFrames
 * JD-Core Version:    0.7.0.1
 */